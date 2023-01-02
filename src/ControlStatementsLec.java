import java.util.Objects;

public class ControlStatementsLec {
    public static void main(String[] args){
        double discountPercent = 2.3;
        boolean discountTrue = Objects.equals(discountPercent, 4.2);
        System.out.printf(" boolean value: %s ", discountTrue);


        boolean isLoggedIn = true;
        boolean isAdmin = false;
        if(isLoggedIn && isAdmin){
            System.out.println("both evaluate to true");
            System.out.printf("isAdmin value: %s %n", isAdmin);
        }

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
        int i = 0;
        while (i <= 5) {
            System.out.println("i is " + i);
            i++;
        }

      // equal to a numeric literal
//        letter == 'y'                // equal to a char literal
//        isValid == false             // equal to the false value
//
//        subtotal != 0                // not equal to a numeric literal
//        loggedInUser != accountOwner // not equal to a variable
//
//        years > 0                    // greater than a numeric literal
//        i < months                   // less than a variable
//
//        subtotal >= 500              // greater than or equal to a numeric literal
//        quantity <= reorderPoint     // less than or equal to a variable


    }
}
