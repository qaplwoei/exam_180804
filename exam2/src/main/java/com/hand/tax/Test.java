package com.hand.tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CalculateMrg calculateMrg=new CalculateMrg();
        calculateMrg.add(0,1500,0.03f);//45
        calculateMrg.add(1500,4500,0.1f);//300
        calculateMrg.add(4500,9000,0.2f);//900
        calculateMrg.add(9000,35000,0.25f);//6500
        calculateMrg.add(35000,55000,0.3f);//6000
        calculateMrg.add(55000,80000,0.35f);//8750
        calculateMrg.add(80000,0.45f);//
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入工资:");
            String s=scanner.next();
            if(s.equals("exit"))
                break;
            float f=Float.parseFloat(s);
            f=calculateMrg.doCalculate(f);
            System.out.println("所需要缴纳的税费为:"+f);
        }
    }
}
