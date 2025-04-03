package q2259;

import java.util.*;

public class Main {
    static class Mole implements Comparable<Mole> {
        int t, x, y;

        Mole(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Mole o) {
            return Integer.compare(this.t, o.t);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        Mole[] moles = new Mole[N];

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            moles[i] = new Mole(t, x, y);
        }

        Arrays.sort(moles);

        int[] dp = new int[N];
        int maxCatch = 0;

        for (int i = 0; i < N; i++) {
            Mole cur = moles[i];

            if (distance(0, 0, cur.x, cur.y) <= 1.0 * S * cur.t) {
                dp[i] = 1;
            }

            for (int j = 0; j < i; j++) {
                Mole prev = moles[j];
                double dist = distance(prev.x, prev.y, cur.x, cur.y);
                int timeDiff = cur.t - prev.t;

                if (dist <= 1.0 * S * timeDiff) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxCatch = Math.max(maxCatch, dp[i]);
        }

        System.out.println(maxCatch);
    }

    static double distance(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
} 
