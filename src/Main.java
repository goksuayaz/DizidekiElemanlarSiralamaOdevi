import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Kaç Eleman İçersin? ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        int[] elemanlar = new int[diziUzunluk];

        for(int i = 0; i < elemanlar.length; i++){
            System.out.println("Dizinin " + (i+1)+". elaman değerini giriniz : ");
            elemanlar[i] = scanner.nextInt();
        }
//        System.out.println("Dizinin Elemanları : ");
//        for(int i = 0; i < elemanlar.length; i++){
//            System.out.println(elemanlar[i]);
//        }

        System.out.println();
        System.out.println("Dizideki değerlerin küçükten büyüğe sıralanmış hali : ");

        int gecici;

        for(int i = 0; i < elemanlar.length - 1; i++)
        {
            for(int j = i+1; j < elemanlar.length; j++)
            {
                if(elemanlar[j] < elemanlar[i]) {
                    gecici = elemanlar[i];
                    elemanlar[i] = elemanlar[j];
                    elemanlar[j] = gecici;
                }
            }
        }
        System.out.print("Sıralama : ");
        for(int i = 0; i < elemanlar.length; i++)
        {
            System.out.print(elemanlar[i] + " ");
        }
        }




        }




