package com.company.web;

import java.util.Objects;

public class Task25 implements Comparable<Task25>{
    int t25;

    @Override
    public boolean equals(Object o)  {
        if (this == o) return true;
        if (!(o instanceof Task25)) return false;
        Task25 task25 = (Task25) o;
        return t25 == task25.t25;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t25);
    }

    public Task25(int t25) {
        this.t25 = t25;
    }

    @Override
    public int compareTo(Task25 o) {

        return (int)this.t25-o.t25;
    }
}
