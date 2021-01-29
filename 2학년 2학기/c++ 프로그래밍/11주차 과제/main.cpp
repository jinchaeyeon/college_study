#include <iostream>
#include <fstream>
#include "student.h"
#include <string>
using namespace std;

void split(string s, LinkedList<student> * List);

int main(int argc, char *argv[]) {
	LinkedList<student>* List = new LinkedList<student>();
	ifstream f;
	string temp;
	int newid;
	f.open(argv[1]);
	if (f.is_open()) {	
		cout << argv[1] << "에서 파일 열기 성공" << endl;
		while (!f.eof()) {
			getline(f, temp);
			split(temp,List);
		}
		f.close();
	}

	int num = 0;
	string str;
	ofstream writeFile;

	while (true) {
		cout << "(1) 새 학생 입력" << endl << "(2) 학생 삭제" << endl << "(3) 학번 순으로 전체 출력" << endl << "(4) 파일에 저장하고 종료" << endl << "원하는 기능을 선택하시오: ";
		cin >> num;
		cin.ignore();
		Node <student>* n;
		switch (num) {
		case 1:
			cout << "학번과 이름, 동아리들을 입력하세요 : ";
			getline(cin, str);
			split(str,List);
			break;
		case 2:
			cout << "학번을 입력하세요: ";
			cin >> newid;
			n = List->Find(newid);
			List->Delete(newid, n);
			break;
		case 3:
			List->print();
			break;
		case 4:
			writeFile.open(argv[1]);
			if (writeFile.is_open()) {
				Node<student>* temp = List->getNode();
				while (temp != NULL) {
					string line = "";
					line += to_string(temp->getdata().getid()) + " " + temp->getdata().getname() + " ";
					if (temp->getdata().getclub()->getNode() != NULL) {
						Node<string>* clubnode = temp->getdata().getclub()->getNode();
						while (clubnode != NULL) {
							line += clubnode->getdata();
							if (clubnode->getnext() != NULL) {
								line += "/";
							}
							clubnode = clubnode->getnext();
						}
					}
					writeFile << line;
					temp = temp->getnext();
					if (temp != NULL) {
						writeFile << "\n";
					}
				}
				delete temp;
			}
			writeFile.close();
			exit(0);
			break;
		}
	}
}

void split(string str, LinkedList<student>* List) {
	string s;
	int id = 0;
	string name;
	student st;
	int i = 0;
	for (i; str[i] != ' '; i++) {
			s += str[i];
	}
	id = atoi(s.c_str());
	s = "";
	i++;
	for (i; str[i] != ' ' && i != str.size(); i++) {
		s += str[i];
	}
	name = s.c_str();
	st = student(id, name);
	List->Add(st);
	s = "";
	if (i != str.size()) {
		i++;
		while (str[i] != '\0') {
			for (i; str[i] != '/' && str[i] != '\0'; i++) {
				s += str[i];
			}
			if (str[i] == '/') {
				i++;
			}
			st.addclub(s);
			s = "";
		}
	}
}