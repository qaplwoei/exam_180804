package com.hand.date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入日期:");
            String s=scanner.next();
            if(s.equals("exit"))
                break;
            try {
                MyDate myDate=new MyDate(s);
                System.out.println("下一天为:"+myDate.getNext());
            } catch (Exception e) {
                System.out.println("您输入的日期不存在");
            }
        }
    }
}
