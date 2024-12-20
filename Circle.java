// CSE-111 LAB - 6 TASK - 4     []
// T-4 Circle class

public class Circle {
    private double radius;
    public static int count = 0;

    public Circle(){
        count ++;
    }

    public Circle(double rk_0){
        radius = rk_0;
        count ++;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return (Math.PI * Math.pow(radius, 2));
    }
    
}


