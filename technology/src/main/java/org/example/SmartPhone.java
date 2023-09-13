package org.example;

public class SmartPhone extends Computer{
    private String serviceProvider;
    public SmartPhone(String anIOS, String anOwner, String ram, String provider){
        super(anIOS, anOwner, ram);
        serviceProvider = provider;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void displayProvider(){
        System.out.println("Current provider: " + serviceProvider);
    }
}
