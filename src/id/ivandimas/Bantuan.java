package id.ivandimas;

import java.util.Scanner;

public class Bantuan {

    public static String inputTulisan() {
        return new Scanner(System.in).nextLine();
    }

    public static int inputAngka() {
        return new Scanner(System.in).nextInt();
    }

    public static boolean checkUsername(String username) {
        return !username.matches("^(.*\\s+.*)+$") && (username.length() > 0);
    }

    public static boolean checkPassword(String password) {
        return password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
    }

    public static boolean checkKtp(String ktp) {
        return ktp.matches("^[0-9]{15}$");
    }

}
