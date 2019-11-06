int whatWeekOfJanuary1st(int year) {
    int January1st1900 = 1; // 1900年1月1日星期一
    int surplus = (year - 1900) / 100 - (year - 1601) / 400; // 设置每百年不闰并排除其中的闰年
    int week = (year - 1900) + January1st1900 + (year - 1900) / 4 - surplus; // 每过一年当年元旦星期数+1，闰年+2，并排除百年不闰
    while(week >= 7) {
        week = week - 7;
    }
    return week;
}

int leapYear(int year) {
    int day;
    if(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) { // 闰年判断条件
        day = 29;
    } else {
        day = 28;
    }
    return day; // 返回当年2月的天数
}

int days(int month, int years) { // 判断本月有几天
    int day;
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        day = 31;
    } else if(month == 2) {
        day = leapYear(years);
    } else {
        day = 30;
    }
    return day;
}

int GetNextMonthFirstDayIsWhatDay(int nWhatDay, int nDaysOfMonth) {
    int plus = nDaysOfMonth % 7; // 多余的天数
    int day = nWhatDay + plus;
    if(day >= 7) { // 控制day在0-6之间
        day = day - 7;
    }
    return day;
}

void printCalender(int nWhatDay, int month, int year) {
    print("         " + month + "月");
    print("日    一   二   三   四   五   六");
    int day = days(month, year); // 本月有几天
    for(int i = 1 - nWhatDay; i <= day; i++) {
        if(i <= 0) { // 输出1号前的空行
            printn("     ");
        } else {
            printn(i + "    "); // 输出日期
        }
        if((i % 7) == (7 - nWhatDay)) { // 星期六之后换行
            print();
        } else if((nWhatDay == 0) && (i % 7 == 0)) { // 迷之BUG修复补丁1.0
            print();
        }
    }
    print();
}

void calendar() {
    int whatYear = 2019;
    int week = whatWeekOfJanuary1st(whatYear); // 从星期几开始输出日历
    print("        " + whatYear + "年");
    for(int i = 1; i <= 12; i++) {
        if(i == 1) {
            printCalender(week, i, whatYear);
        } else {
            int nWhatDate = GetNextMonthFirstDayIsWhatDay(week, days((i - 1), whatYear)); // 本月第一天星期几
            week = nWhatDate;
            printCalender(week, i, whatYear); // 输出日历
        }
    }
}

int main() {
	calendar();
    return 0;
}