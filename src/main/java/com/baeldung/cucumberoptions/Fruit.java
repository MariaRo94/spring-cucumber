package com.baeldung.cucumberoptions;


public class Fruit {
    private int id;
    private String name;
    private boolean isExotic;
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isExotic() {
        return isExotic;
    }

    public void setExotic(boolean exotic) {
        isExotic = exotic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
