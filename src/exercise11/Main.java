package exercise11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String[] tokens = br.readLine().split("\\s+");
            String key = tokens[0];
            String value = tokens[1];
            String value2 = tokens[2];
            switch(i){
                case 0: //1. prolazak
                    key = tokens[0] + " " + tokens[1]; //prva dva string su ime i prezime,
                    value = tokens[2]; //adresa
                    value2 = tokens[3]; //grad
                    Threeuple<String, String, String> firstThreeuple = new Threeuple<>(key,value, value2); //Threeuple sa tri Stringa
                    System.out.println(firstThreeuple);
                    break;
                case 1:
                    int secondValueInt = Integer.parseInt(value); //druga vrednost je Integer pa parsiramo
                    boolean boolValue2 = value2.equals("drunk"); //treca vrednost je boolean pa pretvaramo
                    Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(key,secondValueInt,boolValue2); //threeuple sa Stringom, int i bool
                    System.out.println(secondThreeuple);
                    break;
                case 2:
                    double secondValueDouble = Double.parseDouble(value); //druga vredost je double
                    Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(key,secondValueDouble,value2); //threeuple sa string, double, string
                    System.out.println(thirdThreeuple);
                    break;

            }
        }
    }
}
