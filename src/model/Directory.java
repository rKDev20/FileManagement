package model;

import java.util.ArrayList;

public class Directory extends Element {
    ArrayList<Element> child;

    public Directory(String s) {
        super(s);
        child = new ArrayList<>();
    }

    public void add(Element e) {
        child.add(e);
    }

    public double getSize() {
        double size = 0;
        for (Element e : child)
            size += e.getSize();
        return size;
    }
}
