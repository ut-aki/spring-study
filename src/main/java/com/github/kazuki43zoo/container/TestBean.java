package com.github.kazuki43zoo.container;

public class TestBean {
    public TestBean() {
        System.out.println(getClass());
    }

    public String getMessage() {
        return "Hello World by " + getClass().getSimpleName();
    }
}
