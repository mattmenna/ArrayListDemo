import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Matt on 7/6/2017.
 */

public class ArrayListDemo {
    private JPanel panel1;
    private JLabel projectName;

    public static void main(String[] args) {
        System.out.println("Hello World");
        //declare an array of strings
        ArrayList<String> list1 = new ArrayList<String>(5);
        list1.add("Matt");
        list1.add("Eric");
        list1.add("Mark");
        list1.add("Vernon");

        System.out.println(list1);
    }
}
