package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TUSHAR
 */
public class AscendingOrderBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        System.out.println("Enter the size of data list");
        n1 = sc.nextInt();
        int list1[] = new int[n1];
// taking input in the list
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter the value " + (i + 1));
            list1[i] = sc.nextInt();
        }
// Sorting Array.
        Arrays.sort(list1);
        int num = 0;
        System.out.println("Enter how many item to search: ");
        num = sc.nextInt();
        int key1[] = new int[num];

// taking input of the item to search.
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the value-" + (i + 1) + " to search:");
            key1[i] = sc.nextInt();
        }
        int m = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Checking search item-" + i);
            System.out.println();
            int first = 0, last = (n1 - 1), mid;
            mid = (first + last) / 2;
//Searching the item in the list and Displaying result.
            while (first <= last) {
                if (key1[m] == list1[mid]) {
                    System.out.println("The Value " + key1[m] + " is found in the list in location: " + mid);
                    break;
                } else if (key1[m] < list1[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
                mid = (first + last) / 2;
            }
            if (first > last) {
                System.out.println("The Value " + key1[m] + " is not found in the list !!!");
            }
            m++;
        }
    }
}