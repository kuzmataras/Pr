package com.company;

public class Main {
    public static void main(String[] args) {

        Motorcycle motorcycles = new Motorcycle();
        Colors colors = new Colors();
        Stage stage = new Stage();

        motorcycles.buyModels("XROAD202CBF");
        motorcycles.Totalmotorcycle();
        colors.colorMotorcycle();
        stage.buyStage("two");
        stage.totalstage();
    }
}
