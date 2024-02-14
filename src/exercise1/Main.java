package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //ucitavanje broja unos elemenata
        for (int i = 0; i < n; i++) {
            Box<String> input = new Box<>(br.readLine()); //ubacujemo u Box String koji smo procitali sa tastature
            System.out.println(input);//stampamo to sto smo dobili
        }
    }
}
