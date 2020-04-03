package com.JavaPractice.Session2;

public class Practice04Car {
                private String modelName;
                private Practice01Date createDate;
                private int speed;
                private int vehiclePower; //توان
                private String color ;

    public Practice04Car(String modelName, Practice01Date createDate, int speed, int vehiclePower, String color) {
        this.modelName = modelName;
        this.createDate = createDate;
        this.speed = speed;
        this.vehiclePower = vehiclePower;
        this.color = color;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCreateDate(Practice01Date createDate) {
        this.createDate = createDate;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVehiclePower(int vehiclePower) {
        this.vehiclePower = vehiclePower;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public Practice01Date getCreateDate() {
        return createDate;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVehiclePower() {
        return vehiclePower;
    }

    public String getColor() {
        return color;
    }

    public boolean equals (Object obj)
    {
        Practice04Car car  = (Practice04Car) obj;
        if (car.speed == this.speed && car.vehiclePower==this.vehiclePower)
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", createDate=" + createDate +
                ", speed=" + speed +
                ", vehiclePower=" + vehiclePower +
                ", color='" + color + '\'' +
                '}';
    }
}
