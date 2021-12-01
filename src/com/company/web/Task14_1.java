package com.company.web;

import java.util.Comparator;

public class Task14_1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
            if(o1==null || o2==null
                    || !(o1 instanceof Task14_1)
                    || !(o2 instanceof Task14_1)){
                return -1;
            }
            else if(o1.equals(o2)){
                return 0;
            }
            else{
                return -1;
            }
    }
}
