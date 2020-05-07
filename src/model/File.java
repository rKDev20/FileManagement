package model;

public class File extends Element{
    double size;//in KB

    public double getSize() {
        return size;
    }

    public File(String s, double size) {
        super(s);
        this.size = size;
    }
}
