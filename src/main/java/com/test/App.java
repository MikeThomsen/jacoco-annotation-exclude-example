package com.test;

public class App {
    public void sayHi(String name) {
        System.out.println("Hi, " + name);
    }

    @ExcludeFromGeneratedReport
    public void sayBye(String name) {
        System.out.println("Bye, " + name);
    }
}
