package pl.warsztaty2;

import pl.entity.User;

import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj email");
        String givenEmail = scan.nextLine();
        System.out.println("Podaj username");
        String givenUsername = scan.nextLine();
        System.out.println("Podaj password");
        String givenPassword = scan.nextLine();

    }
}
