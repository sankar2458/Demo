import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;

class Main {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "";
        int count = 0;


        System.out.println("Enter Number of Counters :");
        count = in .nextInt();
        in .nextLine();

        Counter a[] = new Counter[count];

        for (int i = 0; i < count; i++) {

            System.out.println("Enter text for counter " + (i + 1) + " :");
            str = in .nextLine();
            a[i] = new Counter(str);

        }
        try {
            for (int i = 0; i < count; i++) {
                a[i].t.join();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        Set < Character > set = Counter.hs.keySet();
        char arr[] = new char[set.size()];


        int i = 0;
        char ch;
        for (Iterator it = set.iterator(); it.hasNext(); i++) {
            ch = (Character) it.next();
            arr[i] = ch;
        }
        Arrays.sort(arr);
        System.out.println("Vowels count in given text are :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ":" + Counter.hs.get(arr[i]) + " ");
        }
    }
}

