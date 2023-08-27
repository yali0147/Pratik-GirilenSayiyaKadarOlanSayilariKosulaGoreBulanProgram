import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k ,toplam=0,sayac=0;
        double ort=1;
        Scanner imp= new Scanner(System.in);
        System.out.print("Girdiğiniz sayıya kadar olan üçe ve dörde bölünen sayıların ortalması alınacaktır.\nLütfen Sayı Giriniz :" );
        k=imp.nextInt();
        for(int i=1;i<=k;i++){
            if (i%3==0 && i%4==0){
                toplam+=i ;
                sayac++;
            }
        }
        if (sayac!=0){
            ort= (double) toplam /sayac;
            System.out.println("Ortalama: "+ort);
        }else {
            System.out.println("Girdiniz koşulları sağlamıyor.");
        }
    }
}