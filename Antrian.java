package sesi9;

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

public class Antrian {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int kendaraan = 0;
        ArrayDeque <String> spbu = new ArrayDeque<>();

        while(true){
            int r = rand.nextInt(3);

            for(int i = 0; i < r; i++){
                spbu.add("kendaraan ke - " + (++kendaraan));
            }

            if(r == 0) continue;

            System.out.println(spbu);
            System.out.print("Isi bensin kendaraan ini? y/n:  ");
            char masukan = sc.nextLine().charAt(0);
            
            if(spbu.size() == 15){
                System.out.println("Antrian penuh program keluar");
                break;
            }

            if(masukan == 'y'){
                spbu.pop();
            }



        }
    }
}