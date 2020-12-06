package com.bk.stringtokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] tokens = s.trim().split("[@.,?!'_\\s]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
            scan.close();
        }
    }
}
