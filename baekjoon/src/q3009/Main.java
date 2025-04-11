package q3009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (xList.contains(x)) {
                xList.remove((Integer) x);
            } else {
                xList.add(x);
            }

            if (yList.contains(y)) {
                yList.remove((Integer) y);
            } else {
                yList.add(y);
            }
        }

        sc.close();

        System.out.println(xList.get(0) + " " + yList.get(0));
    }
}
