package com.company.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task3 implements Iterator {
   List<String> t3;
    {t3=new ArrayList<>();
    t3.add("abc");
    t3.add("abc");
    t3.add("abc");}



    public Task3() {

    }

    ListIterator<String> iterator= t3.listIterator();
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {

        return iterator.next();
    }
}
