package com.company;

public class Stage {
    int priseStage = 0, one = 200, two = 350, three = 500;
    String namestage = "";

    void stageMotorcycle(String Stage) {
        if (Stage == "one") {
            System.out.println("Price stage: " + one + "$");

        } else if (Stage == "two") {
            System.out.println("Price stage: " + two + "$");

        } else if (Stage == "three") {
            System.out.println("Price stage: " + three + "$");
        }
    }


    void buyStage(String Stage) {
        if (Stage == "one") {
            priseStage = priseStage + 200;

        } else if (Stage == "two") {
            priseStage = priseStage + 350;

        } else if (Stage == "three") {
            priseStage = priseStage + 500;
        }
    }

    void totalstage() {
        System.out.println("Доплата за стейдж " + namestage + ":" + priseStage + "$");
    }
}
