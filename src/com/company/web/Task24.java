package com.company.web;

import java.util.ArrayList;
import java.util.Objects;

public class Task24 {
    int t24;

    public Task24(int t24) {
        this.t24 = t24;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task24)) return false;
        Task24 task24 = (Task24) o;
        return t24 == task24.t24;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t24);
    }
}
