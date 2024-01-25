public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия");
        }
        if (age < 18) {
            System.out.println("Вы еще не достигли возраста совершеннолетия");
        }

        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку!");
        }

        System.out.println("Задача 3");
        int speedCar = 40;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + " км/ч, вы превышаете скорость! Придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int agePerson = 0;

        if (agePerson == 0 || agePerson == 1) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его должны воспитывать родители до достижения 2 лет");
        }
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете");
        }
        if (agePerson > 24 && agePerson < 60) {
            System.out.println("Если возраст человека равен " + agePerson + ", то он должен ходить на работу");
        }
        else if (agePerson > 60) {
            System.out.println("Если возраст человека " + agePerson + ", то ему пора на пенсию");
        }

        System.out.println("Задача 5");
        int ageOfTheVisitor = 1;
            if (ageOfTheVisitor < 5) {
                System.out.println("Если возраст ребеннка равен " + ageOfTheVisitor + ", то ему нельзя кататься на аттракционе");
            }
            if (ageOfTheVisitor >= 5 && ageOfTheVisitor < 14) {
                System.out.println("Если возраст ребенка равен " + ageOfTheVisitor + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            }
            else if (ageOfTheVisitor >= 14) {
                System.out.println("Если возраст ребенка равен " + ageOfTheVisitor + ", то он может кататься без сопровождения взрослого");
            }

        System.out.println("Задача 6");
            int carriageCapacity = 102;
            int seatPlace = 60;
            int standingPlace = carriageCapacity-seatPlace;
            int quantityPeopleInCarriage = 89;
            int goingOutPeopleFromCarriage = 56;
            int quantityPeopleInCarriageAfterDisembarkation = quantityPeopleInCarriage - goingOutPeopleFromCarriage;
            int quantityStandingPeopleIfTotalQantityPeopleMoreThenSittingPlace = carriageCapacity - quantityPeopleInCarriageAfterDisembarkation;
            if (quantityPeopleInCarriageAfterDisembarkation < seatPlace) {
                System.out.println("В вагоне осталось " + (seatPlace - quantityPeopleInCarriageAfterDisembarkation) + " сидячих(сидячее) мест(место), и " + standingPlace + " стоячих(стоячее) мест(место)");
            }
            else if (quantityPeopleInCarriageAfterDisembarkation > seatPlace) {
                System.out.println("В вагоне осталось только " + quantityStandingPeopleIfTotalQantityPeopleMoreThenSittingPlace + " стоячих(стоячих) мест(место)");
            }

        System.out.println("Задача 7");
            int one = 27;
            int two = 2;
            int three = 3;
            if (one > two && one > 3) {
                System.out.println("Первое число больше остальных");
            }
            if (two > one && two > three) {
                System.out.println("Второе число больше остальных");
            }
            else if (three > one && three > two){
                System.out.println("Третье число больше остальных");
            }
    }
}






