
import java.util.Scanner;


public class main {
    /*
Kullanıcıdan Vize1,Vize2 ve Final notunu alarak bir harf hesaplama sistemi. Ayrıca kullanıcıdan 
okuldaki genel ortalamasını alarak, DD alma ve 2,50'nin altında olma koşuluna göre ekrana bir
tavsiye mesajı yazdırır.

Vize1 toplam notunun %30 'una etki edecek.

Vize2 toplam notunun %30 'una etki edecek.

Final toplam notunun %40 'ına etki edicek.
   

Toplam Not >= 90 ------> AA

Toplam Not >= 85 ------> BA

Toplam Not >= 80 ------> BB

Toplam Not >= 75 ------> CB

Toplam Not >= 70 ------> CC

Toplam Not >= 65 ------> DC

Toplam Not >= 60 ------> DD

Toplam Not >= 55 ------> FD

Toplam Not < 50 ------> FF

*/
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        System.out.println("Vize1 Giriniz :");
        int Vize1 = scanner.nextInt();
        System.out.println("Vize2 Giriniz :");
        int Vize2 = scanner.nextInt();
        System.out.println("Final Giriniz :");
        int Final = scanner.nextInt();
  
        System.out.println("Okul ortalamanızı Giriniz :");
        double ortalama = scanner.nextDouble();

        double toplam = (double)((Vize1*40/100) + (Vize2*10/100) + (Final*50/100));

         if( toplam >= 90){

             System.out.println("AA");
}
        else if(toplam >= 85){

             System.out.println("BA");
}
        else if(toplam >= 80){

             System.out.println("BB");
}
        else if(toplam >= 75){

             System.out.println("CB");
}
        else if(toplam >= 70){

             System.out.println("CC");
}
        else if(toplam >= 65){

             System.out.println("DC");
}
        if(ortalama < 2.50){

            System.out.println("DD aldınız ve Not ortalamınız düşük. Bu dersi tekradan almayı düşünebilirsiniz");
            
}
        else if(toplam >= 60){

             System.out.println("DD");
}
        else if(toplam >= 55){

             System.out.println("DF");
}
        else {

             System.out.println("FF Kaldınız...");
}
             System.out.println("toplam :"+toplam);

    }
            
}
