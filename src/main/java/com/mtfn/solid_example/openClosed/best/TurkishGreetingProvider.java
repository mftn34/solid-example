package com.mtfn.solid_example.openClosed.best;

public class TurkishGreetingProvider extends GreetingProvider {

    @Override
    public void greeting(String message) {
        System.out.println("\033[0;31m" + message);
    }
}
