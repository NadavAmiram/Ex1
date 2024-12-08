import java.util.Scanner;

public class Ex1Main
{

    public static boolean checkBase (String strBase)
    {
        if (strBase.length()>1)
        {
            System.out.println("structure is illegal"); // בודק אם הבסיס לא מורכב מתו אחד
            return false;
        }
        if (strBase.equals(""))
        {
            System.out.println("structure is illegal"); // בודק אם אין בסיס / מספר
            return false;
        }
        char chBase= strBase.charAt(0);
        int base = Ex1.returnCharInInt(chBase);
        if (base>16 || base<2)
        {
            System.out.println("structure is illegal"); // בודק אם אין בסיס / מספר
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String Strnum1 = "", Strnum2="", quit = "quit";
        while (!Strnum1.equals(quit) && !Strnum2.equals(quit))
        {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            Strnum1 = input.next();
            if (Strnum1.equals("quit"))
                break;
            System.out.println("num1 = "+Strnum1+" is number : true , value =" +Ex1.number2Int(Strnum1));
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            Strnum2 = input.next();
            if (Strnum2.equals("quit"))
                break;
            System.out.println("num2 = "+Strnum2+" is number : true , value =" +Ex1.number2Int(Strnum2));
            System.out.println("Enter a base for output ( number [2,16]");
            String tempBase = input.next();
            if (tempBase.equals("quit"))
                break;
            String strBase = Ex1.returnStringInString(tempBase);
            int num1 = Ex1.number2Int(Strnum1);
            int num2 = Ex1.number2Int(Strnum2);
            char chBase= strBase.charAt(0);
            int base = Ex1.returnCharInInt(chBase);

            if (checkBase(strBase)==true)
            {
                System.out.println(Strnum1 + " + "+Strnum2 +" = "+Ex1.int2Number((num1+num2) , base));
                System.out.println(Strnum1 + " * "+Strnum2 +" = "+Ex1.int2Number((num1*num2) , base));

            }

            String [] arr = {Strnum1, Strnum2 , Ex1.int2Number((num1+num2) , base) , Ex1.int2Number((num1*num2) , base)  };
            int maxIndex = Ex1.maxIndex(arr);

            if (Strnum1.equals("quit"))
                break;


        }
        System.out.println("quiting now...");
    
    }
}