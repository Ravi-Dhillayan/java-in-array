package arr;

import java.util.Scanner;

class fre {
    int i, j, n, k, s;
    int[] a;

    public void frequency() {
        System.out.println("Enter the size of the array:");
        Scanner o = new Scanner(System.in);
        n = o.nextInt();
        a = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            a[i] = o.nextInt();
        }

        System.out.println("Element frequencies:");
        for (i = 0; i < n; i++) {
            if (visited[i]) { //false
                continue;
            }
//            System.out.println(visited[i]); false
            s = 1;
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    s++;
                }
//                System.out.println(visited[j]); true 
            }
            System.out.println(a[i] + " " + s);
        }
    }
}

public class Count_frequency {
    public static void main(String[] args) {
        fre fobj = new fre();
        fobj.frequency();
    }
}
