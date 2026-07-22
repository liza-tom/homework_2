
public class Main {
    public static void main(String args[]) {

        //task 1
        byte a = 1;
        short b = 128;
        int c = 1000000;
        long d = 3000000000L;
        float e = 4.34f;
        double f = 3.0000003;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);


        //task 2
        float a2 = 27.12f;
        long b2 = 987678965549L;
        double c2 = 2.786;
        short d2 = 569;
        short e2 = -159;
        int f2 = 27897;
        byte g2 = 67;

        //task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short list = 480;
        short perOne = (short) (480 / (lp + as + ea));
        System.out.println("На каждого ученика рассчитано " + perOne + " листов бумаги");

        //task 4
        byte bottles = 16;
        short twentyMin = (short) (bottles * 10);
        short day = (short)(bottles * 30 * 24);
        int threeDay = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        //task 5
        byte all = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte amountOfClasses = (byte)(all / (2 + 4));
        byte white = (byte)(amountOfClasses * whitePerClass);
        byte brown = (byte)(amountOfClasses * brownPerClass);
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //task 6
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        short gramm = (short)(banana + 2 * milk + 2 * iceCream + 4 * eggs);
        float killo = ((float)gramm / 1000);
        System.out.println(gramm);
        System.out.println(killo);

        //task 7
        byte weight = 7;
        short weightGramm = (short)(weight * 1000);
        short min = 250;
        short max = 500;
        short minDays = (short)(weightGramm / min);
        short maxDays = (short)(weightGramm / max);
        float average = (float)(minDays + maxDays) / 2;
        System.out.println(minDays);
        System.out.println(maxDays);
        System.out.println(average);

        //task 8
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;
        float mashaAfter = mashaBefore + (float)mashaBefore / 100 * 10;
        float denisAfter = denisBefore + (float)denisBefore / 100 * 10;
        float kristinaAfter = kristinaBefore + (float)kristinaBefore / 100 * 10;
        float yearMashaBefore = mashaBefore * 12;
        float yearDenisBefore = denisBefore * 12;
        float yearKristinaBefore = kristinaBefore * 12;
        float yearMashaAfter = mashaAfter * 12;
        float yearDenisAfter = denisAfter * 12;
        float yearKristinaAfter = kristinaAfter * 12;
        float diffMasha = yearMashaAfter - yearMashaBefore;
        float diffDenis = yearDenisAfter - yearDenisBefore;
        float diffKristina = yearKristinaAfter - yearKristinaBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + diffKristina + " рублей");

    }

}


