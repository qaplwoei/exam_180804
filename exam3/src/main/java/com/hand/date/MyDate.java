package com.hand.date;

import java.text.SimpleDateFormat;

public class MyDate{
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate(MyDate d) {
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }

    private int year;
    private int month;
    private int day;
    private int[] monthDay={31,28,31,30,31,30,31,31,30,31,30,31};

    public  MyDate(String date) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        format.parse(date);

        String[] n=date.split("-");
        year=Integer.parseInt(n[0]);
        month=Integer.parseInt(n[1]);
        day=Integer.parseInt(n[2]);
    }
    public String getNext()
    {
        MyDate myDate=new MyDate(this);
        boolean isLastMonth=month==12?true:false;
        boolean isLastDay=checkLastDay();
        if(isLastMonth&&isLastDay) {
            myDate.year += 1;
            myDate.month=1;
            myDate.day=1;
        }
        else if(isLastDay)
        {
            myDate.month+=1;
            myDate.day=1;
        }
        else
            myDate.day+=1;
        return myDate.toString();
    }
    public boolean checkLastDay()
    {
        int max=monthDay[month-1];
        if(isLeap()&&month==2)
            max=29;
        if(day>=max)
            return true;
        else
            return false;
    }
    public boolean isLeap()
    {
        if(year%4==0&&year%100!=0||year%400==0)
            return true;
        else
            return false;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


}