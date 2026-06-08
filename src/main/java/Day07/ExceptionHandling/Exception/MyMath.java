package Day07.ExceptionHandling.Exception;

public class MyMath {
    public static void main(String[] args) {

    }

    public static int div (int i , int j){
        if(j>0){
            return i / j ;
        }else{
            throw new ArithmeticException("Divide by zero Exception");
        }
    }

}
