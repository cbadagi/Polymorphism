public class PrintNumber {

    public void println(int n){
        System.out.println("This is the integer number" +n);

    }
    public void println(double N){
        System.out.println("This is a double number" +N);

    }
    public void println(float n){
        System.out.println("This is a float data type" +n);
    }
    public static void main(String[]args){

        PrintNumber p=new PrintNumber();
        p.println(3);
        p.println(10f);
        p.println(20.0);
    }
}
