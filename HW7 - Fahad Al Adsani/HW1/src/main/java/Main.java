import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        
        /*Q1) Following the example of the Circle class in Section 9.2,
        design a class named Rectangle to represent a rectangle*/
        
        Rectangle rectangle1= new Rectangle(4,40);
        Rectangle rectangle2= new Rectangle(3.5,35.9);
        
        System.out.println("Rectangle1: Width "+rectangle1.width+", Height: "+rectangle1.height+", Area: "+rectangle1.getArea()+", Perimeter: "+rectangle1.getPerimeter());
        System.out.println("Rectangle2: Width "+rectangle2.width+", Height: "+rectangle2.height+", Area: "+rectangle2.getArea()+", Perimeter: "+rectangle2.getPerimeter());
        
        /*Q2) Design a class named Fan to represent a fan*/
        
        Fan fan1= new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();

        Fan fan2= new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.turnOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        
        /*Q3) Design a class named Location for locating a maximal
        value and its location in a two-dimensional array. The class contains public data
        fields row, column, and maxValue that store the maximal value and its indices in
        a two-dimensional array with row and column as int types and maxValue as a
        double type*/
        
        Scanner input = new Scanner(System.in);
        int r;
        int c;

        System.out.println("Rows: ");
        r= input.nextInt();
        System.out.println("Columns: ");
        c= input.nextInt();
        
        double[][] array= new double[r][c];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println("Enter Value: ");
                array[i][j]=input.nextDouble();
            }
        }
        
        Location location= Location.locateLargest(array);
        
        System.out.println("The location of the largest element is: "+ Location.maxValue+" at "+ "["+Location.row+","+Location.column+"]" );
        
    }       
}

class Rectangle{
    double width=1;
    double height=1;

    Rectangle(){}

    Rectangle(double w,double h){ width=w;height=h; }

    double getArea(){
        return width*height;
    }
    double getPerimeter(){return 2*width*height;}
}
class Fan{
    static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
        Fan() {
            speed = SLOW;
            on = false;
            radius = 5;
            color = "BLUE";
        }
    
        public void setSpeed(int newSpeed) {
            speed = newSpeed;
        }
        
        int getSpeed(){
        return speed;}
        
        public void turnOn() {
            on = true;
        }
        public void turnOff() {
            on = false;
        }
        public void setColor(String newColor) {
            color = newColor;
        }
        
        String getColor(){

        return color;
        }

        public void setRadius(double newRadius) {
            radius = newRadius;
        }

        double getRadius(){

        return radius;
        }

        public String toString() {

        if (on == true) {
            return "Fan Speed: " + getSpeed() + ", Fan Color: " + getColor() + ", Radius: " + getRadius() + ", Status: On";
        }

        else {
            return "Fan Speed: " + getSpeed() + ", Fan Color: " + getColor() + ", Radius: " + getRadius() + ", Status: Off";
        }
    }
}
class Location {
    public static int row;
    public static int column;
    public static double maxValue;
        Location(int newRow,int newColumn, int newMaxValue){
            row=newRow;
            column=newColumn;
            maxValue=newMaxValue;
    }

    public static Location locateLargest(double[][] a) {
        int row=0;
        int column=0;
        double largest=a[row][column];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(largest<a[i][j]){
                    {largest= a[i][j];
                row=i;
            column=j;}
            }
        }
    }
    return new Location(row,column,(int)largest);
    }
}
