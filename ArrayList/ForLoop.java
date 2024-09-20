package ArrayList;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        for(int i=0;i<list.size();i++)
        {
           System.out.println(list.get(i));
        }
    }
}
