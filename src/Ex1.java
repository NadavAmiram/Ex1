/**


 **/

public class Ex1
{
    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     * @param num the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    // מעשרוני לבסיס מסוים
    public static String int2Number(int num, int base) {
        String ans = "";
        if (base> 16 || base<2 || num < 0 )
            return "";


        return ans;
    }

    //הופך את המספר למספר בעשרוני
    public static int number2Int(String num)
    {
        int ans = -1;
        isNumber(num);
        int index = num.indexOf("b");
        String strNum =  num.substring(0,index);
        char ch =' ';
        int digit ;
        int pow = strNum.length()-1;
        double sum  = 0;
        for (int i =  0; i<strNum.length(); i++)
        {
            ch = strNum.charAt(i);
            digit = returnCharInInt(ch);
            sum = sum +Math.pow((double) digit , (double) pow);
            pow--;
        }

        return ans;
    }
    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    //בודקת אם המספר תקין
    public static boolean isNumber(String a) {
        boolean ans = false;
        int index = a.indexOf("b");
        if (index == -1) // בודק אם b לא נמצא במחרוזת
        {
            System.out.println("structure is illegal");
            return ans;
        }
        String strNum =  a.substring(0,index);
        String strBase = a.substring(index);
        if (strBase.length()>1)
        {
            System.out.println("structure is illegal"); // בודק אם הבסיס לא מורכב מתו אחד
            return ans;
        }
        if (strBase.equals("") || strNum.equals(""))
        {
            System.out.println("structure is illegal"); // בודק אם אין בסיס / מספר
            return ans;
        }

        char chBase = strBase.charAt(0);
        int base = returnCharInInt(chBase);

        if (returnCharInInt(chBase) > 16 || returnCharInInt(chBase) <2)
        {
            System.out.println("structure is illegal"); // בודק אם הבסיס תקין
            return ans;
        }

        if (!checkValid(strBase , base)) // בודק אם כל הספרות במספר קטנות מהמספר של הבסיס
        {
            System.out.println("structure is illegal");
            return ans;
        }
        ans = true;
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




    //בודקת אם כל המספרים פחותים מהבסיס

    public static boolean checkValid(String num , int base)
    {
        char ch = ' ';
        for (int i = 0 ; i<num.length(); i++)
        {
            ch = num.charAt(i);
            if (returnCharInInt(ch)>base)
                return false;
        }
        return true;
    }

    //מחזירה את המספר של התו  לאינט
    public static int returnCharInInt (char base)
    {
        if (base == 'A')
            return 10;
        if (base == 'B')
            return 11;
        if (base == 'C')
            return 12;
        if (base == 'D')
            return 13;
        if (base == 'E')
            return 14;
        if (base == 'F')
            return 15;
        if (base == 'G')
            return 16;
        return (int)base;
    }



}
