package com.company;
import java.io.IOException;
import java.lang.Math;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        double a = 0, b = 0;
        char[] ascii = {'.',',','-','~',':',';','=','!','*','#','$','@'};

        int height = 24;
        int width = 80;

        // Clears screen
        //System.out.println("\033[H\033[2J");

        while (true) {
            int area = height * width;

            double[] z = new double[area];

            char[] screen = new char[80*24];

            for (int i = 0; i < screen.length; i++) {
                screen[i] = ' ';
            }

            double j = 0;
            while (j < 6.28) {
                //System.out.println("Exaltation");
                j += 0.7;
                double i = 0;
                while (i < 6.28) {
                    //System.out.println("HI!!!");
                    i += 0.02;

                    double sinA = Math.sin(a);
                    double cosA = Math.cos(a);
                    double sinB = Math.sin(b);
                    double cosB = Math.cos(b);

                    double sini = Math.sin(i);
                    double cosi = Math.cos(i);
                    double sinj = Math.sin(j);
                    double cosj = Math.cos(j);

                    double cosj2 = cosj+2;
                    double mess = 1/(sini*cosj2*sinA+sinj*cosA+5);
                    double t = sini * cosj2 * cosA - sinj * sinA;

                    int x = (int)Math.floor(40+30*mess*(cosi*cosj2*cosB-t*sinB));
                    int y = (int)Math.floor(12+15*mess*(cosi*cosj2*sinB +t*cosB));

                    int o = x + 80 * y;

                    int N = (int)Math.floor(8*((sinj*sinA-sini*cosj*cosA)*cosB-sini*cosj*sinA-sinj*cosA-cosi *cosj*sinB));

                    if (0 < y && y < height && 0 < x && x < width && z[o] < mess) {
                        z[o] = mess;
                        if (N > 0) {
                            screen[o] = ascii[N];
                        }
                        else {
                            screen[o] = ascii[0];
                        }
                    }
                }
            }

            String createDonut = "";

            for (int k = 0; k < screen.length; k++) {
                if (k % width == 0) {
                    createDonut += '\n';
                }
                else {
                    createDonut += screen[k];
                }
            }

            System.out.println(createDonut);

            a += 0.04;
            b += 0.02;
        }

    }
}
