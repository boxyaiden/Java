
public class Easy {
    public static void main(String[] args) {
        int[] myNumber = { 44, 11, 78, 33, 10, 11 };
        int temp;

        // Sorting.
        for (int i = 0; i < myNumber.length; ++i) {
            System.out.println(myNumber[i]);
            //if List, then myNumber.get(i).

            for (int j = i + 1; j < myNumber.length; ++j) {
                if (myNumber[i] > myNumber[j]) {
                    // if(myNumber[i] < myNumber[j]) - Sort the other way.

                    temp = myNumber[i];
                    myNumber[i] = myNumber[j];
                    myNumber[j] = temp;
                }
            }
        }
        
        // Half element swap.
        for (int i = 0; i < myNumber.length / 2; ++i) {
            temp = myNumber[i];
            // myNumber[i] = myNumber[myNumber.length - 1 - i];
            myNumber[i] = myNumber[5 - i];
            myNumber[5 - i] = temp; 
        }
        
        for(int item: myNumber) System.out.println(item);

    }
}
