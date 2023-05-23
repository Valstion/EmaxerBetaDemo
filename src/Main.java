public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Первая проба пера так сказать");
            System.out.println("labas rytas");
        }

        int currentYear = 2023;
        currentYear = 2024;
        long future = 9877986451254165l;
        float partical = 652456.78264587f;
        float v = partical * 2;
        System.out.println(v);
        double partica2 = 652456.78264587f;
        double z = partica2 / 2;
        System.out.println(z);
        boolean isSunny = false;
        System.out.println(isSunny);
        char letter = 'a';
        char number = '1';
        System.out.println(number + letter);
        String name = "Jonas";
        System.out.println(12 + 10 + " yra grazus skaicius");
        System.out.println("grazus skaicius yra " + (10 + 2));
        System.out.println("grazus skaicius yra " + 10 + 2);
        System.out.println(5 - 5);
        System.out.println(5 + 5);
        System.out.println(5 * 5);
        System.out.println(5 == 5);
        System.out.println(12 % 5);
        System.out.println(13 % 2 == 0);
        System.out.println("-----------------------------------------------------");
        int someNumber = 0;
        someNumber = someNumber + 2;
        System.out.println(someNumber);
        someNumber++;
        System.out.println(someNumber);
        name = "Emaxer";
        String surname = "Tohanol";
        System.out.println(name + " yra " + surname);
        System.out.println("-----------------------------------------------------");


        System.out.println(Math.random() * 10);
        System.out.println(Math.round((Math.random() * 10)));
        System.out.println("-----------------------------------------------------");
        int max = 10;
        int rndNum = (int) Math.round(Math.random() * Math.random() * 100);
        System.out.println(rndNum);
        int min = 10;
        max = 20;
        int rndNumInterval = min + (int) Math.round(Math.random() * (max - min));
        System.out.println(rndNumInterval);

    }
}