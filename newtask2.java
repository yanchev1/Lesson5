package Lesson5;

import java.awt.desktop.AboutEvent;

public class newtask2 {
        public static void main(String[] args) {

            double mass = 115;
            double height = 1.86;
            double BMI = mass / (Math.pow(height,2));
            boolean normalRange = (BMI<=18.5) && (BMI<=24.9);
            boolean obese = (BMI>=30) && (BMI<=34.90);
            System.out.println(BMI);
            System.out.println(normalRange);
            System.out.println(obese);


        }
}
