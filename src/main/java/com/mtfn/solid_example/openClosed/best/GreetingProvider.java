package com.mtfn.solid_example.openClosed.best;

public abstract class GreetingProvider {
    public void greeting(String message) {
        System.out.println(message);
    }
}