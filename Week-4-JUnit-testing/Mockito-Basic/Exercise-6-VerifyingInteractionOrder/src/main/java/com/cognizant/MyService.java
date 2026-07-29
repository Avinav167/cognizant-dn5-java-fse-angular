package com.cognizant;

public class MyService {

    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void executeProcess() {
        externalApi.connect();
        externalApi.disconnect();
    }
}