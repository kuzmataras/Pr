package com.company;

public class Pilot {
    private int weight;
    private int courage;
    private int age;
    private String zaslugu;
    private String name;



    Pilot(String name,int weight,int courage,int age){
        this.weight = weight;
        this.courage = courage;
        this.age = age;
        this.name = name;
    }
    Pilot(String name,int weight,int courage,int age,String zaslugu) {
        this.weight = weight;
        this.courage = courage;
        this.age = age;
        this.zaslugu = zaslugu;
        this.name = name;


    }

    void readySt(){
        int r = courage + 20;
        System.out.println(" Пілот готовий до подорожі,його сміливість збільшилась на = " + r);

    }

    int weightDown(){
        int w;
        w = weight - 3;
        return w;
    }
    void readySt(double r){
        double f = courage + 20;
        System.out.print(f);
    }
    void headPilot(){

        if (zaslugu.equals("Медаль:Від SpaceX"))
            System.out.println("Головний пілот - "+name);
        else
            System.out.println("Другий пілот");

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getZaslugu() {
        return zaslugu;
    }

    public void setZaslugu(String zaslugu) {
        this.zaslugu = zaslugu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

