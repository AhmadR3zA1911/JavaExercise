package com.JavaPractice.Session3.Interface;

public class CurrenyAccount implements AccountTemplate {
    private  boolean withDrawable;
    private boolean active;
    String name;

    @Override
    public boolean isWithDrawable() {
        return withDrawable;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public String getName() {
        return "This is CurrencyAccount "+name;
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
