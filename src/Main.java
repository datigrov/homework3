public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача №1 //
        byte students = 14;
        System.out.println("Значение переменной students с типом byte равно " + students);
        short oranges = 130;
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
        int juice = 135000;
        System.out.println("Значение переменной juice с типом int равно " +juice);
        long sand = 136844L;
        System.out.println("Значение переменной sand с типом long равно " + sand);
        float sugarSand = 1.35f;
        System.out.println("Значение переменной sugarSand с типом float равно " + sugarSand);
        double water = 1.56597;
        System.out.println("Значение переменной water с типом double  равно " + water);


        // Задача №2//

        double solt = 27.12;
        long peoples = 987678965549L;
        double seconds = 2.786;
        short days = 569;
        short celsius = -159;
        short dollars = 27897;
        byte minutes = 67;
        System.out.println(solt);
        System.out.println(peoples);
        System.out.println(seconds);
        System.out.println(days);
        System.out.println(celsius);
        System.out.println(dollars);
        System.out.println(minutes);


        // Задача №3 //

        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        int allStudents = firstTeacher + secondTeacher + thirdTeacher;
        short allPaper = 480;
        int paper_for_one_student = allPaper / allStudents;
        System.out.println("На каждого ученика расчитанно " + paper_for_one_student + " листов бумаги");


        // Задача №4 //

        byte bottles = 16;
        byte time = 2;
        int perfomance = bottles / time;
        byte firstTime = 20;
        short secondTime = 1440;
        short thirdTime = 4320;
        int monce = 43200;
        int oneDay = perfomance * secondTime;
        int threeDays = perfomance * thirdTime;
        int twentyMinutes = perfomance * firstTime;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За трое суток машина произвела " + threeDays + " штук бутылок");
        System.out.println("За один месяц машина произвела " + monce + " штук бутылок");


        // Задача №5 //

        byte paintBoatle = 120;
        byte whiteCollorOnClassroom = 2;
        byte brownColloOnClassroom = 4;
        int oneClass = whiteCollorOnClassroom + brownColloOnClassroom;
        int classes = paintBoatle / oneClass;
        int whiteCollor = classes * whiteCollorOnClassroom;
        int brownCollor = classes * brownColloOnClassroom;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCollor + " банок белой краски и " + brownCollor + " банок коричневой краски");


        // Задача № 6 //

        byte oneBananaGramm = 80;
        byte quantityBananas = 5;
        byte milkGramm = 105;
        byte quantityMilk = 2;
        byte icecreamGramm = 100;
        byte quantityIcecream = 2;
        byte eggsGramm = 70;
        byte quantityEggs = 4;
        short kilogramm = 1000;
        int weightBananas = quantityBananas * oneBananaGramm;
        int weightMilk = milkGramm * quantityMilk;
        int iceCream = icecreamGramm * quantityIcecream;
        int weightEggs = quantityEggs * eggsGramm;
        float breakfast = weightBananas + weightEggs + weightMilk + iceCream;
        float weightBreakfast = breakfast / kilogramm;
        System.out.println("Вес спортзавтрака равен " + breakfast + " грамм");
        System.out.println("Вес спортзавтрака равен " + weightBreakfast + " киллограмм");

         // Задача № 7//

        int adwantage = 7000;
        byte firstAdwantage = 7;
        System.out.println("Перевес спортсмена в своей категории " + firstAdwantage + " килограмм");
        short minimumReset = 250;
        short maximumReset = 500;
        byte allAverageDays = 2;
        int maximumDays = adwantage / minimumReset;
        int minimumDays = adwantage / maximumReset;
        int averageDays = (minimumDays + maximumDays) / allAverageDays;
        System.out.println("Если спортсмен будет терять ежедневно по " + minimumReset + " грамм, то потребуется " + maximumDays + " дней");
        System.out.println("Если спортсмен будет терять ежедневно по " + maximumReset + " грамм, то потребуется " + minimumDays + " дней");
        System.out.println("В среднем, спортсмену понадобится " + averageDays + " день, чтобы сбросить вес для своей категории");


        // Задача № 8//

        int baseIncameMasha = 67760;
        int baseIncameDenis = 83960;
        int baseIncameChristine = 76230;
        double promotionYear = 0.1;
        double differenceIncameMasha = baseIncameMasha * promotionYear;
        double differenceIncameDenis = baseIncameDenis * promotionYear;
        double differenceIncameChristine = baseIncameChristine * promotionYear;
        double realIncameMasha = baseIncameMasha + differenceIncameMasha;
        double realIncameDenis = baseIncameDenis + differenceIncameDenis;
        double realIncameChristine = baseIncameChristine + differenceIncameChristine;
        System.out.println("Маша теперь получает " + realIncameMasha + " рублей. Годовой доход вырос на " + differenceIncameMasha + " рублей");
        System.out.println("Денис теперь получает " + realIncameDenis + " рублей. Годовой доход вырос на " + differenceIncameDenis + " рублей");
        System.out.println("Кристина теперь получает " + realIncameChristine + " рублей. Годовой доход вырос на " + differenceIncameChristine + " рублей");


    }
}
