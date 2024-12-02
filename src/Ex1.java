/**


 **/

public class Ex1
{
    public static int number2Int(String num) {
        int ans = -1;
        String strNum =  num.substring(0,num.indexOf("b"));
        String strBase = num.substring(num.indexOf("b"));

        if (strBase.equals("") || strNum.equals(""))
        {
            System.out.println("structure is iligel");
            return ans;
        }

        if (!isNumber(strBase) || !isNumber(strNum))
        {
            System.out.println("structure is iligel");
            return ans;
        }

        int binare = Integer.parseInt(strNum);
        int base = Integer.parseInt(strBase);

        if (base > 9 || base < 3 )
        {
            System.out.println("structure is iligel");
            return ans;
        }
        if ( )
        return ans;
    }
    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;
        try
        {
            int number = Integer.parseInt(a);
            System.out.println("Valid number: " + number);
            return ans;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Not a valid number!");
            ans = false;
        }   return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     * @param num the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        if (base> 16 || base<2 || num < 0 )
            return "";


        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        if (Integer.parseInt(n1) != Integer.parseInt(n2))
            ans = false;
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        int maxVal = 0;
        for (int i = 0; i< arr.length; i++)
        {
            if (isNumber(arr[i]))
            {
                if (Integer.parseInt(arr[i])>maxVal)
                {
                    ans = i;
                    maxVal = Integer.parseInt(arr[i]);
                }
            }
        }
        return ans;
    }

    //בודקת אם הבסיס הוא a c c

    //בודקת אם כל המספרים פחותים מהבסיס
}
