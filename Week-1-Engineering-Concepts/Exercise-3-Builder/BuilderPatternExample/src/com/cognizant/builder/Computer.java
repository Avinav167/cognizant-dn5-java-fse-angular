package com.cognizant.builder;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.operatingSystem = builder.operatingSystem;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
        System.out.println("GPU : " + gpu);
        System.out.println("Operating System : " + operatingSystem);
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String operatingSystem;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}