package ru.skypro;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        // Task 1
        byte first=5;
        short second=500;
        int three=50_000;
        long four=500_000L;
        float five=5.5f;
        double six=5.55;
        char seven=100;
        boolean eight=8>first;
        boolean nine=8>second;
        System.out.println("Правда или Ложь :"+" 8>5 -"+eight+"  8>500 - "+nine);


        // Task 2
        float boxerFirst=78.2f;
        float boxerSecond=82.7f;
        float GeneralWeight=boxerFirst+boxerSecond;
        System.out.println("Общий вес двух бойцов - "+GeneralWeight+" кг.");
        var Difference=(boxerFirst+boxerSecond)%boxerFirst;
        System.out.println("Разница между весами бойцов - "+Difference+" кг.");


        //Task 3
        short Bananas=5; // 1 банан = 80 гр.
        Bananas *=80;
        long Milk=200;   // 100мл = 105 гр.
        Milk=Milk*105/100;
        short IceCream=2;  // 1 брикет = 100гр.
        IceCream *=100;
        short RawEgg=4; // 1 яйцо = 70 гр.
        RawEgg *=70;
        var SportBreakfast=Bananas+Milk+IceCream+RawEgg;
        float Breakfast=SportBreakfast/1000f;
        System.out.println("Вес спорт-завтрака : "+SportBreakfast+" грамм = "+Breakfast+" кг!");


        // Task 4
        short generalWeight=7; // в кг.
        generalWeight *=1000;  //переводим в граммы
        short weight1=250;
        short weight2=500;
        var result1=generalWeight/weight1;
        System.out.println("При ежедневной потери в "+weight1+" гр, спортсмен похудеет за : "+result1+" дней.");
        var result2=generalWeight/weight2;
        System.out.println("При ежедневной потери в "+weight2+" гр, спортсмен похудеет за : "+result2+" дней.");
        var averageValue=(result1+result2)/2;
        System.out.println("В среднем спортcмену потребуется :"+averageValue+" день!");


        //Task 5
        int Masha=67_760;
        int Denis=83_690;
        int Kristina=76_230;
        int MashaNew=Masha*10/100+Masha;
        int MashaDifference=(Masha+MashaNew)%Masha*12;
        System.out.println("Маша теперь получает = "+MashaNew+ " руб.!"+"Годовой доход вырос на "+MashaDifference+" рублей!");
        int DenisNew=Denis*10/100+Denis;
        int DenisDifference=(Denis+DenisNew)%Denis*12;
        System.out.println("Денис теперь получает = "+DenisNew+" руб.!"+"Годовой доход вырос на "+DenisDifference+" рублей!");
        int KristinaNew=Kristina*10/100+Kristina;
        int KristinaDifference=(Kristina+KristinaNew)%Kristina*12;
        System.out.println("Кристина теперь получает = "+KristinaNew+" руб.!"+"Годовой доход вырос на "+KristinaDifference+" рублей!");


        //Task 6
        byte a=12;
        byte b=27;
        byte c=44;
        byte d=15;
        byte e=9;
        int result=a*(b+(c-d*e));
        System.out.println(-result);


        //Task 7
        int A=5;
        int B=7;

        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("A = "+A+" B = "+B);

        //Task 8
        int C=256;
        int D=C/10 % 10;
        System.out.println(D);

        int E=789;
        int J=E/100+1;
        System.out.println(J);
    }
}
