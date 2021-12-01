package com.company.web;

import java.util.Objects;

public class Task16 {
    int t16;

    public Task16(int t16) {
        this.t16 = t16;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task16)) return false;
        Task16 task16 = (Task16) o;
        return t16 == task16.t16;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t16);
    }
}
