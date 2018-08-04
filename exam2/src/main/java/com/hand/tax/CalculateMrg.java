package com.hand.tax;

import java.util.ArrayList;

public class CalculateMrg {
    private ArrayList<Calculate> calculates=new ArrayList<Calculate>();
    public float min=3500;
    public float socialSecurity=0;
    public float doCalculate(float wages)
    {
        wages=wages-min-socialSecurity;
        float tax=0;
        for (Calculate item:calculates) {
            tax+=item.doCalculate(wages);
        }
        return  tax;
    }
    public void add(float start,float tax){
        Calculate calculate=new Calculate(start,tax);
        addCalculate(calculate);
    }
    public void add(float start,float end,float tax){
        Calculate calculate=new Calculate(start,end,tax);
        addCalculate(calculate);
    }
    public void addCalculate(Calculate calculate)
    {
        calculates.add(calculate);
    }
}
