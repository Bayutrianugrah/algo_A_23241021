package com.tutorial;

import java.util.Scanner;

public class belanja {

    public static void main(string[] args) {
        //Data member atau Variabel
        int tot_belanja;

        //Membuat objek scanner
        Scanner input = new Scanner(System.in);
        System.out.print(s:"Masukan Total Belanja :");
        tot_belanja = input.nextInt();
         
         //Membuat percabangan
         if (tot_belanja >= 50000){
            System.out.println("Selamat Dapat Mouse");
            } else {
                    System.out.println("Tidak Dapat Mouse");
         }

    }
}


