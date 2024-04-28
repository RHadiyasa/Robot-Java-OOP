package com.enigma.rafi;

import java.util.Scanner;

public class Helper {

    // method atau variable static hanya bisa dipanggil didalam method static
    public static String inputString(String info) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%s : ", info);
            String input = scanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                continue;
            }
            return input;
        }
    }

}

