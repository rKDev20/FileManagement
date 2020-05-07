package model;

public abstract class Element {
    protected String name;

    public Element(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSize();
}
