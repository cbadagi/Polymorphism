public class Area {

    public void area(double l,double b){
        System.out.println("The area of the rectangle is " +(l*b));
    }
    public void area(double s){
        System.out.println("The area of the square is " +(s*s));
    }

    public static void main(String[]args){
        Area a=new Area();
        a.area(4);
        a.area(4,6);
    }
}
