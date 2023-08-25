import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Sayi Giriniz :");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]list1={1,8,12,24,56,48,72,94,2,5};
        int enYakinKucukSayi=0;
        int enYakinBuyukSayi=0;
        for (int i:list1){
            Arrays.sort(list1);
            if (n>i){
                enYakinKucukSayi=i;
            }
            if (n<i){
                enYakinBuyukSayi=i;
                break;
            }

        }
        System.out.println("En Yakin Kucuk Sayi :"+enYakinKucukSayi);
        System.out.println("En Yakin Buyuk Sayi :"+enYakinBuyukSayi);
    }
}