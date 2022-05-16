import java.util.*;
public class TestArrayLinked {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");
        
        List<String> al2 = new LinkedList<>();
            al2.add("Santiago");
            al2.add("Serena");
            al2.add("Swati");
            al2.add("Junaid");
        
            System.out.println("arraylist:"+al);
            System.out.println("linkedlist"+al2);
    }
}