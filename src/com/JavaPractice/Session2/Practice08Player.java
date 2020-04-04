package com.JavaPractice.Session2;

public class Practice08Player {
    private String fullName;
    private int age;
    private int height;
    private int weight;
    private boolean isLeftFoot;
    private double price;
    private String nationality;

    public Practice08Player(String fullName, int age, int height, int weight, boolean isLeftFoot, double price, String nationality) {
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isLeftFoot = isLeftFoot;
        this.price = price;
        this.nationality = nationality;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLeftFoot(boolean leftFoot) {
        isLeftFoot = leftFoot;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isLeftFoot() {
        return isLeftFoot;
    }

    public double getPrice() {
        return price;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean equals (Object obj)
    {
        Practice08Player player = (Practice08Player) obj;
        if (this.price==player.price)
            return true;
        else return false;
    }

    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", isLeftFoot=" + isLeftFoot +
                ", price=" + price +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
