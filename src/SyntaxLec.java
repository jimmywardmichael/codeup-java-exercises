public class SyntaxLec {

    public static void main(String[] args){
        final String password = "password";
        short age = 21;
        long userId = 12, cowId = 11, movieId = 13;
        System.out.println(movieId);
        movieId= 12;
        double decimal = 5.123455897936764567424342341;
        float newNum = (float) decimal;
        short wholeNum = (short) newNum;
        System.out.println("most precise: " + decimal);
        System.out.println("second most precise: " + newNum);
        System.out.println("least precise: " + wholeNum);
        String $private = "this is my private message now scram!";
        System.out.println($private);
        System.out.println(movieId);

        //Binary
        System.out.println("2 + 2 is " + (2 + 2));
        System.out.println("the remainder of 5 / 3 is " + (5 % 3));
        int one = 1;
        //Unary
        System.out.println("1 incremented is " + (++one));

        int num = 2;
        num += 2;
        System.out.println(num);
        num -= 1;
        System.out.println(num);



    }
}