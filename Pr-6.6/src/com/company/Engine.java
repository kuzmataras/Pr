package com.company;

class Engine {
    private int temperature;
    private int power;
    private int oil;
    private  int sp = 0;


    Engine(int temperature,int power,int oil){
        this.temperature = temperature;
        this.oil = oil;
        this.power = power;
    }

    void startOil(){
        int o = oil - 30;
        System.out.println(" Пальне потрапило в двигун,залишок пального = "+ o);
    }


    int startEngine(){
        int s;
        s = temperature + 300;
        sp = s;
        return s;
    }
    double startEngine(int temperature){
        double s = temperature + 300;
        return s;
    }
    void stan(){
        System.out.println("Стан мотору невідомий");
    }
    void stan(double g){
        if (g<50)
            System.out.println("Мотор потрібно ремонтувати");
        else
            System.out.println("Мотор в нормі");
    }
    void move(Control a,Pilot b){
        for (int i = 0;i<= 5;i++){
            int m = 50;
            a.setSpeed(m);
            System.out.println("Швидкість кожної хвилини збільшується на " + a.getSpeed());
            m+= 50;
            sp += m;
            int n = b.getCourage();
            int k = 1;
            b.setCourage(n+k);
            k++;

        }
        System.out.println("Відвага пілота становить" + b.getCourage());
        System.out.println("Швидкість становить " + sp);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
