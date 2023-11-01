package hw;

import java.util.Scanner;

public class RegAppDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        userService.checkingUserInfo(new UserInfo("Nosirjonov Behruzbek",
                "behruznosirjonov23@gmail.com","+998977571337","7571337Bb"));

    }
}
