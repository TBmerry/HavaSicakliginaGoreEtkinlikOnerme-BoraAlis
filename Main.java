import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerinizi giriniz : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("Geç evine otur bu havada ne işin var?");
        }else if(heat<=25){
            if(heat<15){
                System.out.println("Kapalı mekanlarda takıl");
            }
            if(heat>10){
                System.out.println("veya Yarı açık yarı kapalı mekanlarda takıl");
            }
        }else{
            System.out.println("Hava çok güzel çık dışarı sahile falan git");
        }
    }
}