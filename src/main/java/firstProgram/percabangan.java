package firstProgram;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password :");
        String validPassword = "password";

        // jika benar maka selamat datang
        // jika salah maka error
        if (password.equals(validPassword)) {
            System.out.println("Selamat datang");
        } else {
            System.out.println("Maaf error");
        }
        System.out.println("Terima kasih sudah belajar yaa");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
