import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"Eén", "Twee", "Drie", "Vier", "vijf", "Zes", "Zeven", "Acht", "Negen", "Nul"};

        Translator translator = new Translator(alphabetic,numeric);

        System.out.println(translator.translate(6));
        Scanner scanner = new Scanner(System.in);

        boolean play = true;

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                Integer number = scanner.nextInt();
                System.out.println("De vertaling van " + number + " is " + translator.translate(number));
                scanner.nextLine();
            } else {
                System.out.println("Ongeldig");
            }
        }
    }
}
