package com.JavaPractice.Session3.Interface;

public class SimpleAccount implements AccountTemplate {
    private  boolean withDrawable;
    public final static int first=1;
    private boolean active;
    String name;
    @Override
    public boolean isWithDrawable() {
       return true; //Withdrawable in Simple Account Always True

    }

    @Override
    public boolean isActive() {
       return active;
    }

    @Override
    public String getName() {
        return "This is Simple Account"+name;
    }

    public void setWithDrawable(boolean withDrawable) {
        this.withDrawable = withDrawable;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }


}
