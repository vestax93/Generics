package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //ucitavanje broja unos elemenata
        for (int i = 0; i < n; i++) {
            Box<Integer> number = new Box<>(Integer.parseInt(br.readLine())); //dodavanje Integera (koji smo procitali sa tastature i parsirali) u Box
            System.out.println(number);
        }
    }
}
