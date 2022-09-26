package btthem9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số giây đồng hồ\n");
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        int hours = seconds/3600;
        System.out.println("số phút có được là:"+ minutes);
        System.out.println("số giờ có được là :"+hours);
    }
}

