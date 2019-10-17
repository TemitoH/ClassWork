package edu.gcccd.java;

import java.util.Random;

public class Pi {

    public static void main(String[] args) {
        System.out.println(approx(100000000));
    }
    static double approx(final double runs) {
        final Random random = new Random(System.currentTimeMillis());
        int point = 0;
        for(double k = 0; k<runs; k++){
            double x = random.nextDouble();
            double y = random.nextDouble();

            if(Math.pow(x-0,2) + Math.pow(y-0,2) <= 1){
                point++;
            }

        }
        return (point / runs) * 4;
    }


}
