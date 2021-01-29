#include "Day.h"

Day::Day() {
	time_t curr_time = time(NULL);
	struct tm curr_tm;
	localtime_s(&curr_tm, &curr_time);

	year = curr_tm.tm_year + 1900;
	mon = curr_tm.tm_mon + 1;
	mday = curr_tm.tm_mday;
	Dday = 0;
}

Day::Day(int years, int mons, int mdays, int Ddays) {
	year = years;
	mon = mons;
	mday = mdays;
	Dday = Ddays;
}

void Day::setDay(string d1) {
	year = atoi((d1.substr(0, 4).c_str()));
	mon = atoi((d1.substr(4, 2).c_str()));
	mday = atoi((d1.substr(6, 2).c_str()));
}

const Day operator + (Day& D, int day) {
	day = day + D.mday;
	while (day > D.days(D.year, D.mon)) {
		day -= D.days(D.year, D.mon++);
	}
	D.mday = day;
	return D;
}

const Day operator ++ (Day& D) {
	D + 1;
	return D;
}

const Day operator - (Day&D,int day) {
	day = D.mday + day;
	while (day < 1) {
		day += D.days(D.year, --D.mon);
	}
	D.mday = day;
	return D;
}

const Day operator -- (Day& D) {
	D - -1;
	return D;
}

ostream& operator << (ostream& output, const Day& d1) {
	Day day(d1.year, d1.mon, d1.mday, d1.Dday);

	if (d1.mon > 12 || d1.mon <1 || d1.mday > day.days(d1.year, d1.mon) || d1.mday < 1) 
		output << "입력 오류. 날짜를 다시설정해주세요" << endl;
	else {
		output << "[현재 날짜] " << d1.year << "년 " << d1.mon << "월 " << d1.mday << "일" << " [D";

		if (!d1.Dday)
			output << "-day 없음]" << endl;
		else {
			if (d1.Dday > 0) {
				output << "+";
				day = day + d1.Dday;
			}
			else {
				day = day - d1.Dday;
			}
			output << d1.Dday << "] " << day.year << "년 " << day.mon << "월 " << day.mday << "일" << endl;
		}
	}
	output << "날짜 이동(년월일, (다음날)+ , (전날)-), D-DAY 계산(+/- 날짜), 종료(Q) :";
	return output;
}

int Day::days(int years, int month) {
	switch (month) {
	case 0:
		year--, mon = 12; return 31; break;
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		return 31; break;
	case 4: case 6: case 9: case 11:
		return 30; break;
	case 2:
		return (years % 400) == 0 || ((years % 100) != 0 && (years % 4) == 0) ? 29 : 28; 	break;
	case 13:
		year++, mon = 1; return 31; break;

	}
}

void Day::menu(Day & d1, string d) {
	if (d == "Q")
		exit(0);
	else if (d == "+")
		++d1;
	else if (d == "-")
		--d1;
	else if (isdigit(d[0]))
		d1.setDay(d);
	else
		d1.Dday = stoi(d);
}