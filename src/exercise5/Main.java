package exercise5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //ucitavanje broja unos elemenata
        GenericList<String> list = new GenericList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        String element = br.readLine();
        System.out.println(list.sumOfGreater(element));
    }
}
