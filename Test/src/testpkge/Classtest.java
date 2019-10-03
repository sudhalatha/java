package testpkge;

import java.util.Scanner;

class Classtest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
        int i, l = 0, sm = 0;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 Numbers :");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        l = arr[0];
        sm = arr[0];

        for (i = 0; i < 5; i++) {
            if (l < arr[i]) {
                l = arr[i];
            }

            if (sm > arr[i]) {
                sm = arr[i];
            }
        }

        System.out.print("\nThe Largest Element is :" + l);
        System.out.print("\nThe Smallest Element is :" + sm);
	}


}
