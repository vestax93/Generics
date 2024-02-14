package exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String[] tokens = br.readLine().split("\\s+");
            String first = tokens[0];
            String second = tokens[1];
            switch (i){
                case 0: //prvi prolazak kroz petlju sto znaci da je u pitanju (String) Ime prezime -> (String) Grad
                    first = tokens[0] + " " + tokens[1]; //spjanje imena i prezimena
                    second = tokens[2]; //grad
                    Tuple<String,String> firstTuple = new Tuple<>(first,second); //kreiranje Tuple sa dva Stringa
                    System.out.println(firstTuple.getKey() + " -> " + firstTuple.getValue());
                    break;
                case 1: //drugi prolazak kroz petlju prvi element String, drugi element je int
                    int secondInt = Integer.parseInt(second); //drugi element se parsira
                    Tuple<String,Integer> secondTuple = new Tuple<>(first,secondInt);
                    System.out.println(secondTuple.getKey() + " -> " + secondTuple.getValue());
                    break;
                case 2: //treci prolazak kroz petlju, prvi element int, drugi element double
                    int firstInt = Integer.parseInt(first); //parsiranje int
                    double secondDouble = Double.parseDouble(second); //parsiranje double
                    Tuple<Integer, Double> thirdTuple = new Tuple<>(firstInt,secondDouble);
                    System.out.println(thirdTuple.getKey() + " -> " + thirdTuple.getValue());
                    break;

            }
        }
    }

}
