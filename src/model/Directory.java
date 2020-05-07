package model;

import java.util.ArrayList;
import java.util.Stack;

public class Directory extends Element {
    ArrayList<Element> child;

    public Directory(String s) {
        super(s);
        child = new ArrayList<>();
    }

    public void add(Element e) {
        child.add(e);
    }

    //    public double getSize() {
//        double size = 0;
//        for (Element e : child)
//            size += e.getSize();
//        return size;
//    }

    //STACK IMPLEMENTATION
    public double getSize() {
        Stack<Directory> files = new Stack<>();
        double size = 0;
        files.push(this);
        while (!files.empty()) {
            Directory tmp = files.pop();
            ArrayList<Element> tmpChild = tmp.getChildren();
            for (Element e : tmpChild) {
                if (e instanceof File)
                    size += e.getSize();
                else files.push((Directory) e);
            }
        }
        return size;
    }

    private ArrayList<Element> getChildren() {
        return child;
    }
}
