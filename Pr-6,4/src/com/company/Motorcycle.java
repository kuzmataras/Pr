package com.company;

public class Motorcycle {
    int DAKARGNS300 = 2600, TERRAX250CB = 1900, XROAD250PRO = 1850, XROAD202CBF = 1500, XROADLIGHT200 = 1400, totalmotorcycle = 0;
    String namemotorcycle = "";

    void priceModel(String model) {
        if (model == "DAKARGNS300") {
            System.out.println("Price: " + DAKARGNS300 + "$");

        } else if (model == "TERRAX250CB") {
            System.out.println("Price: " + TERRAX250CB + "$");

        } else if (model == "XROAD250PRO") {
            System.out.println("Price: " + XROAD250PRO + "$");

        } else if (model == "XROAD202CBF") {
            System.out.println("Price: " + XROAD202CBF + "$");

        } else if (model == "XROADLIGHT200") {
            System.out.println("Price: " + XROADLIGHT200 + "$");

        } else {
            System.out.println("Моделі немає на складі");
        }
    }

    void buyModels(String model) {

        if (model == "DAKARGNS300") {
            totalmotorcycle = totalmotorcycle + DAKARGNS300;
            namemotorcycle = namemotorcycle + "Geon DAKARGNS300";

        } else if (model == "TERRAX250CB") {
            totalmotorcycle = totalmotorcycle + TERRAX250CB;
            namemotorcycle = namemotorcycle + "Geon TERRAX250CB";

        } else if (model == "XROAD250PRO") {
            totalmotorcycle = totalmotorcycle + XROAD250PRO;
            namemotorcycle = namemotorcycle + "Geon XROAD250PRO";

        } else if (model == "XROAD202CBF") {
            totalmotorcycle = totalmotorcycle + XROAD202CBF;
            namemotorcycle = namemotorcycle + "Geon XROAD202CBF";

        } else if (model == "XROADLIGHT200") {
            totalmotorcycle = totalmotorcycle + XROADLIGHT200;
            namemotorcycle = namemotorcycle + "Geon XROADLIGHT200";

        }else {
            System.out.println("Моделі немає на складі");
        }

    }

    void Totalmotorcycle(){
        System.out.println("Ціна за мотоцикл " + namemotorcycle + ":" + totalmotorcycle + "$");
    }

}
