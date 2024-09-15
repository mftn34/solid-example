package com.mtfn.solid_example.openClosed.worst;

public class GreetingProvider {

    // wrong use
    // if country FR remove then delete block...
    public void greeting(String greetingMessage, CountryCode countryCode) {
        if (countryCode == CountryCode.TR) {
            System.out.println("\033[0;31m" + greetingMessage);
        } else if (countryCode == CountryCode.EN) {
            System.out.println("\033[0;35m" + greetingMessage);
        } else if (countryCode == CountryCode.FR) {
            System.out.println("\033[0;34m" + greetingMessage);
        }
    }
}
