public class Main {
    public static void main(String[] args) {
        task1();
       task2();
       task3();
       task4();
       task5();
       task6();
        task7();

    }

    public static void task1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице 5 градусов и меньше, нужно надеть шапку");}
        else {
            System.out.println("На улице больше чем 5 градусов сегодня тепло можно идти без шапки");
        }

    }

    public static void task3() {
        int spid = 60;
        if (spid > 60) {
            System.out.println("Если скорость больше " + spid + " придетса заплатить штраф");
        }
        if (spid == 60) {
            System.out.println("Если скорость  " + spid + " то можно ездить спокойно");
        }
    }

    public static void task4() {
        int yearsSlip = 1;
        int yearsKindergarten = 2;
        int yearsSchool = 7;
        int yearUniversity = 19;
        int yearJob = 24;
        int yearPension = 60;
        if (yearsSlip < 2) {
            System.out.println("Если возраст человека равен 2 то ему нужно спать");
        }
        if (yearsKindergarten >= 2 && yearsKindergarten <= 6) {
            System.out.println("Если возраст человека от 2 до 6 то ему нужно в детский сад");
        }
        if (yearsSchool >= 7 && yearsSchool <= 18) {
            System.out.println("Если возраст человека от 7 до 18 то ему нужно в школу");
        }
        if (yearUniversity >= 18 && yearUniversity < 24) {
            System.out.println("Если возраст человека от 18 до 24 то ему нужно в университет");
        }
        if (yearJob >= 24 && yearJob <= 60) {
            System.out.println("Если возраст человека больше 24 ему нужно ходить на работу");
        }
        if (yearPension >= 60) {
            System.out.println("Если возраст человека болле 60 то он может отдохнуть");
        }
    }

    public static void task5() {
        int year1 = 5;
        int year2 = 14;
        if (year1 < 5) {
            System.out.println("Если возраст ребенка меньше" + year1 + " ему нельзя кататься");
        }
        if (year1 >= 5 && year2 < 14) {
            System.out.println("Если возраст ребенка равен от 5-14 то он может кататса в сопровождение взрослых");
        } else {
            System.out.println("Кататса нельзя");
        }
        if (year2 > 14) {
            System.out.println("Если возраст ребенка больше 14 может кататься без сопроваждения взрослого");
        }
    }

    public static void task6() {
        int trainPlaces = 60;
        int trainCapacity = 102;
        boolean train1 = trainPlaces < 60;
        boolean train2 = trainPlaces < 102;
        boolean train3 = trainCapacity == 102;
        if (train1) {
            System.out.println("В вагоне есть седячия места");}
        else if (train2) {
            System.out.println("В вагоне есть стоячие места");}
        else if (train3){
            System.out.println("В вагоне мест нет");}
    }

    public static void task7() {
        int a = 1;
        int b = 2;
        int c = 3;


        if (a<b && b<c) {
            System.out.println( c );}

    }
}
