package com.example;

public class DataService {
    private DataProvider provider;

    public DataService(DataProvider provider) {
        this.provider = provider;
    }

    public String retrieve() {
        return provider.getValue();
    }
}
