package com.company.web;

public class Task14 implements Comparable{
    @Override
    public int compareTo(Object o) {
        if(o==null || !(o instanceof Task14)){
            return -1;
        }
        else if(this.equals(o)){
            return 0;
        }
        else{
            return -1;
        }

    }
}
