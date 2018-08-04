package com.hand.tax;

public class Calculate {
    public float start;
    public float end;
    public Calculate(float start,float rate) {
        this(start,Float.MAX_VALUE,rate);
    }
    public Calculate(float start, float end, float rate) {
        this.start = start;
        this.end = end;
        this.rate = rate;
    }

    public float rate;
    public float doCalculate(float basics)
    {
        if(basics<start)
            return 0;
        if(basics>=start&&basics<end)
            return (basics-start)*rate;
        if(basics>=end)
            return (end-start)*rate;
        return 0;
    }
}
