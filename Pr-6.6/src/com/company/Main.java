package com.company;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(0, 0, 1000);
        Control control = new Control(0, 0, 0);
        Pilot pilot1 = new Pilot("Тарас",70, 50, 35);
        Pilot pilot2 = new Pilot("Максим", 85,100, 45,"Медаль:Від SpaceX");
        System.out.println(" Двигун запущено,температура збільшилась на = " + engine.startEngine());
        engine.startOil();
        engine.stan();



        System.out.println(" Висота на даний момент = " + control.heightUp());
        control.speedUp();
        control.stan(110);




        System.out.println(" Вага зменшилась на = " + pilot1.weightDown());
        pilot1.readySt();
        engine.move(control,pilot1);

        System.out.println(" Вага зменшилась на = " + pilot2.weightDown());
        pilot2.readySt();
        pilot2.headPilot();

    }
}

