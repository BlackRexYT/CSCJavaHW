import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Time{
    private int hour;
    private int minute;
    private int second;
    private long Time1970 = System.currentTimeMillis();
    
    Time(){
        GregorianCalendar cal = new GregorianCalendar();
        
        hour= cal.get(cal.HOUR);
        minute= cal.get(cal.MINUTE);
        second= cal.get(cal.SECOND);
    }
    
    Time(int x){
        long y = Time1970;
        hour= (int) ((y/(1000*60*60))% 24);
        minute= (int) ((y / (1000*60)) % 60);
        second= (int) (y/ 1000) % 60 ;
    }
    
    Time(long elapsedTime){
        hour= (int) ((elapsedTime/(1000*60*60))% 24);
        minute= (int) ((elapsedTime / (1000*60)) % 60);
        second= (int) (elapsedTime / 1000) % 60 ;
    }
    
    Time(int h,int m , int s){
        hour=h;
        minute=m;
        second=s;
    }
    
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }
}

class MyPoint{

    private double x;
    private double y;

    MyPoint() {
        x = 0;
        y = 0;
    }
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double GetY() {
        return y;
    }

    public double GetX() {
        return x;
    }

    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.GetX() - x, 2) + Math.pow(point.GetY() - y, 2)); 
    }

    public double distance(MyPoint x, MyPoint y) {
        return Math.sqrt(Math.pow(x.GetX() - y.GetX(), 2) + Math.pow(x.GetY() - y.GetY(), 2));
    }
}

class MyDate{

    private int year;
    private int month;
    private int day;

    public MyDate() {

        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);

    }

    public MyDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }
}

class Person{
    public String name;
    public String address;
    public int phoneNumber;
    public String emailAddress;

    public String toString(){
        return "Person" + " "+name + " "+ address + " "+ phoneNumber + " "+ emailAddress ;
    }
}
    class Student extends Person{
        Student(String n, String a, int p, String e){
            name=n;
            address=a;
            phoneNumber=p;
            emailAddress=e;
        }
    final static String classStatus= "Freshman";
    
    public String toString(){
        return "Student" + " "+this.name;
    }
}
    class Employee extends Person{
        Employee(){}
        Employee(String n, String a, int p, String e){             
            name=n;
            address=a;
            phoneNumber=p;
            emailAddress=e;
        }
    private String office;
    private double salary;
    
    MyDate DateHired= new MyDate();
    
    public String toString(){
        return "Employee" +" "+this.name;
    }
}
    class Faculty extends Employee{
        Faculty(String n, String a, int p, String e){
            name=n;
            address=a;
            phoneNumber=p;
            emailAddress=e;
        }
    private int officeHours;
    
    private String rank;
    
    public String toString(){
        return "Faculty" +" "+this.name;
    }
}
    class staff extends Employee{
        private String title;

        staff(String n, String a, int p, String e){ 
            name=n;
            address=a;
            phoneNumber=p;
            emailAddress=e;
    }
    public String toString(){
        return "Staff" + this.name;
    }
}

public class Main { 
    public static void main(String[] args) {
        
        /*Q1) Design a class named Time. The class contains:*/
        
        Time T1= new Time();
        Time T2= new Time(555550000);
        Time T3= new Time(5, 23, 55);

        System.out.println("T1[Hour: "+T1.getHour()+", Minute: "+ T1.getMinute()+", Seconds: "+T1.getSecond()+"]");
        System.out.println("T2[Hour: "+T2.getHour()+", Minute: "+ T2.getMinute()+", Seconds: "+T2.getSecond()+"]");
        System.out.println("T3[Hour: "+T3.getHour()+", Minute: "+ T3.getMinute()+", Seconds: "+T3.getSecond()+"]");

        /*Q2) Design a class named MyPoint to represent a point with*/

        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2= new MyPoint(10,30.5);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));


        /*Q3) Design a class named Person and its two subclasses named Student and Employee*/

        Person p=new Person();
        Student s=new Student("Ahmad"," 73F2+GV4, Masjid Al Aqsa Street, Mubarak Al-Abdullah",42,"@gmail.com");
        System.out.println(s.toString());
        Employee e=new Employee("Fahad"," 73F2+GV4, Masjid Al Aqsa Street, Mubarak Al-Abdullah",55,"@gmail.com");
        System.out.println(e.toString());
        Faculty f=new Faculty("Khaled"," 73F2+GV4, Masjid Al Aqsa Street, Mubarak Al-Abdullah",45,"@gmail.com");
        System.out.println(f.toString());
        staff st= new staff("Abdallah"," 73F2+GV4, Masjid Al Aqsa Street, Mubarak Al-Abdullah",53,"@gmail.com");
        System.out.println(st.toString());
        
    }       
}

