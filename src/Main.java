import model.Directory;
import model.File;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("/");
        Directory src = new Directory("src");
        Directory main = new Directory("main");
        File file1 = new File("Main.java", 10);
        File file2 = new File("File.java", 20);
        File file3 = new File("Directory.java", 30);
        File file4 = new File(".git",2);
        root.add(src);
        src.add(main);
        src.add(file4);
        main.add(file1);
        main.add(file2);
        main.add(file3);
        System.out.println(root.getSize());
    }
}
