package linearSearch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TUSHAR
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, n = 0;
        System.out.println("Enter the size of data list:");
        n = sc.nextInt();
        int list[] = new int[n];

        // taking input in the list
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value " + (i + 1));
            list[i] = sc.nextInt();
        }
// taking input of the item to search.
        System.out.println("Enter the value to search");
        key = sc.nextInt();

//Searching the item in the list
        int flag = 0;
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            if (key == list[i]) {
                temp.add(String.valueOf(i));
                flag++;
            }
        }
// Displaying Search Result.

        if (flag != 0) {
            System.out.println("The Value " + key + " is found in the list " + flag + " time in location: " + temp);
        } else {
            System.out.println("The Value " + key + " is not found in the list !!!");
        }
    }
}
