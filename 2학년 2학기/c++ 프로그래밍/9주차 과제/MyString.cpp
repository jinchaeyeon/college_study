#include "MyString.h"

MyString::MyString() :len(10), pos(0){
    str = new char[len];
    str[0] = NULL;
}

MyString::MyString(const char* s) {
    int count = 0;
    while (s[count] != '\0') count++;

    len = count;
    pos = 0;
    str = new char[len*2];

    for (int i = 0; i < len; i++) {
        str[pos++] = s[i];
    }
    str[pos] = '\0';
}

MyString::MyString(const MyString& s) {
    len = s.length();
    pos = 0;
    str = new char[len*2];
    for (int i = 0; i< len; i++) {
        str[pos++] = s.at(i);
    }
    str[pos] = '\0';
}

MyString::~MyString() {
     delete[] str;
     str = NULL;
}

void MyString::resize(int n) {
    char* temp = str;
    str = new char[n];
    len = n;

    for (int i = 0; i < pos; i++)
    {
        str[i] = temp[i];
    }

    delete[] temp;
    temp = NULL;
}

int MyString::length() const {
    return pos;
}

char MyString::at(int i) const{
    return str[i];
}

MyString MyString:: substr(int start, int count) const {
    MyString temp;
    int range;

    if (start + count+1 >= pos) {
        range = pos;
    }
    else {
        range = start + count+1;
    }

    for (int i = start+1; i < range; i++) {
        temp += str[i];
    }

    return temp;
}

void MyString::insert(int now, const MyString& s) {
    if (now < 0) {
        now = 0;
    }
    else if (now > pos) {
        now = pos;
    }

    char* temp2 = str;
    str = new char[len + s.length()];

    int i;
    for (i = 0; i < now; i++) {
        str[i] = temp2[i];
    }
    for (int j = 0; j < s.length(); j++) {
        str[j+now] = s.at(j);
    }
    for (; i < pos; i++) {
       str[s.length() + i] = temp2[i];
    }

    pos = pos + s.length() -1;
    delete[] temp2;
    temp2 = NULL;
    if (len == pos) {
        resize(len * 2);
    }
    str[pos] = '\0';
}


void MyString::insert(int now, const char* s) {
    if (now < 0) {
        now = 0;
    }
    else if (now > pos) {
        now = pos;
    }

    int count = 0;
    while (s[count] != '\0') count++;

    char* temp2 = str;
    str = new char[len + count];

    int i;
    for (i = 0; i < now; i++) {
        str[i] = temp2[i];
    }
    for (int j = 0; j < count; j++) {
        str[j + now] = s[j];
    }
    for (; i < pos; i++) {
        str[count + i] = temp2[i];
    }

    pos = pos + count;
    delete[] temp2;
    temp2 = NULL;
    if (len == pos) {
        resize(len * 2);
    }
    str[pos] = '\0';
}

void MyString:: erase(int start, int many) {
    if (!(many < 0 || start < 0 || start > pos)) {
        for (int i = start + many; i < pos+1; i++) {
            str[i - many] = str[i];
        }
       pos-1 -= many;
    }
}

int MyString:: find(const MyString& s) const {
    int i, j;
    if (s.length() == 0) return -1;
    for (i = 0; i <= pos - s.length(); i++) {
        for (j = 0; j < s.length(); j++) {
            if (str[i + j] != s.str[j]) {
                break;
            }
        }
        if (j == s.length()) {
            return i;
        }
    }
    return -1;
}
int MyString:: find(const char* s) const {
    int count = 0;
    while (s[count] != '\0') count++;

    int i, j;
    if (count == 0) return -1;
    for (i = 0; i <= pos - count; i++) {
        for (j = 0; j < count; j++) {
            if (str[i + j] != s[j]) break;
        }
        if (j == count) return i;
    }

    return -1;
}

int MyString:: find(const MyString& s, int start) const {
    int i, j;
    if (s.length() == 0) return -1;
    for (i = start; i <= pos - s.length(); i++) {
        for (j = 0; j < s.length(); j++) {
            if (str[i + j] != s.str[j]) {
                break;
            }
        }
        if (j == s.length()) {
            return i;
        }
    }
    return -1;
}

int MyString:: find(const char* s, int start) const {
    int count = 0;
    while (s[count] != '\0') count++;

    int i, j;
    if (count == 0) return -1;
    for (i = start; i <= pos - count; i++) {
        for (j = 0; j < count; j++) {
            if (str[i + j] != s[j]) break;
        }
        if (j == count) return i;
    }

    return -1;
}

const MyString& MyString:: operator + (const MyString& s) {
    for (int i = 0; i < s.length(); i++) {
        str[pos++] = s.at(i);
        if (len == pos) {
            resize(len * 2);
        }
    }
    str[pos] = '\0';
    return *this;
}

const MyString& MyString:: operator += (char c) {
    str[pos++] = c;
    if (len == pos) {
        resize(len * 2);
    }
    str[pos] = '\0';
    return *this;
}

const MyString& MyString:: operator += (const char* s) {
    int count = 0;
    while (s[count] != '\0') count++;

    for (int i = 0; i<count; i++) {
        str[pos++] = s[i];
        if (len == pos) {
            resize(len * 2);
        }
    }
    str[pos] = '\0';
    return *this;
}

const MyString& MyString:: operator += (const MyString& s) {
    for (int i = 0; i < s.length(); i++) {
        str[pos++] = s.at(i);
        if (len == pos) {
            resize(len * 2);
        }
    }
    str[pos] = '\0';
    return *this;
}

const MyString& MyString:: operator = (const char* s) {
    int count = 0;
    while (s[count] != '\0') count++;

    len = 10;
    str = new char[count];
    pos = 0;
    for (int i = 0; i<count; i++) {
        str[pos++] = s[i];
        if (len == pos) {
            resize(len * 2);
        }
    }      
    str[pos] = '\0';
    return *this;
}

const MyString& MyString:: operator = (const MyString& s) {
    len = s.len;
    str = new char[len];
    pos = 0;
    for (int i = 0; i< s.length(); i++) {
        str[pos++] = s.at(i);
        if (len == pos) {
            resize(len * 2);
        }
    }
    str[pos] = '\0';
    return *this;
}

bool MyString:: operator == (const MyString& s) {
    if (pos != s.length()) {
        return false;
    }
    else {
        for (int i = 0; i < pos; i++) {
            if (str[i] != s.at(i)) {
                return false;
            }
        }
        return true;
    }
}

bool MyString:: operator != (const MyString& s) {
    if (pos != s.length()) {
        return false;
    }
    else {
        for (int i = 0; i < pos; i++) {
            if (str[i] != s.at(i)) {
                return false;
            }
        }
        return true;
    }
}

bool MyString:: operator < (const MyString& s) {
    int length;
    if (pos < s.length()) {
        length = s.length();
    }
    else {
        length = pos;
    }

    for (int i = 0; i < length; i++) {
        if (static_cast<int>(str[i]) < static_cast<int>(s.at(i))) {
            return true;
        }
    }
    return false;
}


bool MyString:: operator <= (const MyString& s) {
    int length;

    if (pos < s.length()) {
        length = s.length();
    }
    else {
        length = pos;
    }

    for (int i = 0; i < length; i++) {
        if (static_cast<int>(str[i]) > static_cast<int>(s.at(i))) {
            return false;
        }
        else if (static_cast<int>(str[i]) < static_cast<int>(s.at(i))) {
            return true;
        }
    }

    return true;
}

bool MyString:: operator >= (const MyString& s) {
    int length;

    if (pos < s.length()) {
        length = s.length();
    }
    else {
        length = pos;
    }

    for (int i = 0; i < length; i++) {
        if (static_cast<int>(str[i]) < static_cast<int>(s.at(i))) {
            return false;
        }
        else if (static_cast<int>(str[i]) > static_cast<int>(s.at(i))) {
            return true;
        }
    }

    return true;
}

bool MyString:: operator > (const MyString& s) {
    int length;
    if (pos < s.length()) {
        length = s.length();
    }
    else {
        length = pos;
    }

    for (int i = 0; i < length; i++) {
        if (static_cast<int>(str[i]) > static_cast<int>(s.at(i))) {
            return true;
        }
    }
    return false;
}


ostream& operator<< (ostream& output, const MyString& s) {
    return output << s.str;
}

istream& operator>> (istream& input , MyString& s) {
    char temp;
    while ((temp = input.get()) != '\n') {
        s += temp;
    }
    return input;
}