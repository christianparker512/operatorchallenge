package parker.learningJava;

public class Main {

    public static void main(String[] args) {
	    double cost = 20.00d;
	    double cost2 = 80.00d;
	    double myValuesTotal = (cost + cost2) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println(("theRemainder = " + theRemainder));
        boolean isNoRemainder = (theRemainder == 0) ? true: false;
        System.out.println(("isNoRemainder = " + isNoRemainder));
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }
     }
}
