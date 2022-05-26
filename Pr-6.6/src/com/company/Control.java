package com.company;

public class Control {
    private int speed;
    private int height;
    private int incline;


    Control(int speed,int height,int incline){
        this.speed = speed;
        this.height = height;
        this.incline = incline;
    }

    void speedUp(){
        int s = speed + 50;
        System.out.println(" Політ почався,швидкість на даний момент " + s);
    }

    int heightUp(){
        int h;
        h = height + 700;
        return h;

    }
    double heightUp(double height){
        double h =height + 700;
        return h;
    }
    void stan(){
        System.out.println("Дані про систему відсутні ");
    }
    void stan(double g ){
        if (g<100)
            System.out.println("Система в нормі");
        else
            System.out.println("Система перегрілась,потрібне охолодження");
    }






    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIncline() {
        return incline;
    }

    public void setIncline(int incline) {
        this.incline = incline;
    }
}
