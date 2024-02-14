package exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        GenericList<String> list = new GenericList<>();
        String[] commandTokens = br.readLine().split("\\s+");
        String command = commandTokens[0]; //prvi clan je uvek naredba sta se radi

        while (!command.equals("END")) {
            switch (command) {
                case "Add":
                    list.add(commandTokens[1]); //drug clan niza je onaj kojeg treba dodati
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(commandTokens[1])); //drugi clan niza je index sa koga se sklanja element
                    break;
                case "Contains":
                    System.out.println(list.contains(commandTokens[1])); //drugi clan niza je onaj koji ce se traziti u listi
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandTokens[1]); //drugi clan niza je index za zamenu prvog elementa
                    int secondIndex = Integer.parseInt(commandTokens[2]); //treci clan niza je index za zamenu drugog elementa
                    list.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    System.out.println(list.sumOfGreater(commandTokens[1])); //drugi clan niza je onaj element od koga se trazi da ostali u listi budu veci
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    list.printToString();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            commandTokens = br.readLine().split("\\s+");
            command = commandTokens[0];
        }
    }
}
