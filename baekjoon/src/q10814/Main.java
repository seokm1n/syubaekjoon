package q10814;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name));
        }
        sc.close();
        
        members.sort(new Comparator<Member>() {
            public int compare(Member m1, Member m2) {
                return m1.age - m2.age;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(members.get(i).age + " " + members.get(i).name);
        }
    }
}
