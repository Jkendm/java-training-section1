package io.github.jkendm.statickeyword;

public class MathUtillity {
    static class Adder{
        public static double add ( double...number){
            double result=0.0;
            for (var num: number){
                result+=num;
            }
            return result;
        }

    }

     static class AreaCalculator{
        public static double circleArea(double radius){
            return Math.pow(radius, radius);
        }

    }

     static class VolumeCalculator{
        public static double calculateCubeVolume(double l, double w, double h){
            return l*w*h;
        }

     }

}
