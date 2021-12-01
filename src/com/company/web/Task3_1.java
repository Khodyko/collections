package com.company.web;

import java.util.Arrays;
import java.util.Iterator;

public class Task3_1 implements Iterable<String>{
    public String[] t3_1=null;

    public Task3_1(String[] t3_1) {
        this.t3_1 = t3_1;
    }

    @Override
    public Iterator<String> iterator() {
        return Arrays.stream(t3_1).iterator();
    }
}
