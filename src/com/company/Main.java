package com.company;

public class Main {
    String name;

    public static void main(String[] args) {
        String name = "Lina";
        int age = 25;
        int temperature = 20;
        if ((age > 20 && age < 45) || (temperature < 30 && temperature > -20)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Нельзя идти гулять");
        if (( age < 20 ) || (temperature > 0 && temperature < 28)){
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Нельзя идти гулять");
        if ((age > 45) || (temperature > -10 && temperature < 25)){
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Нельзя идти гулять");
        }

        }

        }
    }
}