// import java.util.ArrayList; 
// import java.util.List; 
import java.util.*; 

public class First {
    public static void main(String[] args) throws Exception {

        List<Integer> myList = new ArrayList<Integer>(); 
        myList.add(1);
        myList.add(2);
        myList.add(3);

        for(int i = 0; i < myList.size(); ++i) {
            System.out.println(myList.get(i));
        }
    }
}