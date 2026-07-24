package com.cognizant.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32 GB")
                .setStorage("1 TB SSD")
                .setGpu("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        gamingPC.displayConfiguration();

        System.out.println();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam("16 GB")
                .setStorage("512 GB SSD")
                .setOperatingSystem("Ubuntu Linux")
                .build();

        officePC.displayConfiguration();
    }
}