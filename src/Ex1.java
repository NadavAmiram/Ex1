
public class Ex1
{
    // מעשרוני לבסיס מסוים
    public static String int2Number(int num, int base)
    {
        String ans ="";
        if (num< 0 )
            return "";
        if (base <2 || base>16)
            return "";
        String strBase = String.valueOf(base);
        int quotient , remainder;
        char chRemainder =' ' ;
        StringBuilder ansBuilder = new StringBuilder();
        while (num/base != 0)
        {
            quotient = num/base;
            remainder = num%base;
            chRemainder = intToChar (remainder); // הןפך את הreminder לתו
            ansBuilder.append(chRemainder);  // מכניס את התו של הremainder למחרוזת
            num = quotient; // מקצר את המספר לפי השארית
        }
        remainder = num%base;
        chRemainder = intToChar (remainder); // הןפך את הreminder לתו
        ansBuilder.append(chRemainder);  // מכניס את התו של הremainder למחרוזת
        ansBuilder = ansBuilder.reverse();
        ansBuilder.append("b"+intToString(base));
        ans = ansBuilder.toString();
        return ans;
    }

    public static String intToString (int base)
    {
        if (base == 11)
            return "B";
        if (base == 12)
            return "C";
        if (base == 13)
            return "D";
        if (base == 14)
            return "E";
        if (base == 15)
            return "F";
        if (base == 16)
            return "G";
        String str = String.valueOf(base);
        return str;
    }

    public static char intToChar (int remainder) // פעולה שמקבלת מספר ומחזירה את הערך שלו באותיות מיוחדות אם הוא מעל 10
    {
        if (remainder == 10)
            return 'A';
        if (remainder == 11)
            return 'B';
        if (remainder == 12)
            return 'C';
        if (remainder == 13)
            return 'D';
        if (remainder == 14)
            return 'E';
        if (remainder == 15)
            return 'F';
        String str = String.valueOf(remainder);
        return str.charAt(0);
    }

    //הופך את המספר למספר בעשרוני
    public static int number2Int(String num)
    {
        int ans = -1;
        String strNum , strBase;
        if (isNumber(num))
        {
            int base;
            int index = num.indexOf("b"); // מוצא את האינדקס של הבסיס
            if (index == -1)
            {
                strNum = num;
                strBase = "10"; // אם המשתמש כותב מספר בלי לשים b ובסיס כלומר הכוונה למספר עצמו בהצגה בבסיס עשר לדוגמה המשתמש הכניס "66" ייפלט לו 66
            }
            else
            {
                strNum = num.substring(0, index); // הסטרינג של המספר
                strBase = num.substring(index + 1); // הסטרינג של הבסיס
            }
            if (strBase.equals("") || strBase.equals("10"))
                base = 10;
            else {
                char chBase = strBase.charAt(0); // התו של הבסיס
                base = returnCharInInt(chBase); // האינט של התו של הבסיס
            }
            char ch = ' '; // תו הספרה
            int digit; // אינט הספרה
            int pow = strNum.length() - 1;
            double sum = 0;
            if (base == 10)
            {
                ans = Integer.parseInt(strNum);
                return ans;
            }
            for (int i = 0; i <= strNum.length() - 1; i++)
            {
                ch = strNum.charAt(i); // הספרה הראשונה במספר
                digit = returnCharInInt(ch); // הופך אותה למספר באינט
                sum = sum + digit * Math.pow((double) base, (double) pow);
                pow--;
            }
            ans = (int) sum;
        }
        return ans;
    }

    //בודקת אם המספר תקין
    public static boolean isNumber(String a) {
        boolean ans = false;
        int index = a.indexOf("b");
        int indexNegative = a.indexOf("-"); //למצוא אם יש מינוס
        if (indexNegative != -1) // בודק אם b לא נמצא במחרוזת
        {
            System.out.println("structure is illegal");
            return ans;
        }
        /*
        if (index == -1) // בודק אם b לא נמצא במחרוזת
        {
            System.out.println("structure is illegal");
            return ans;
        }

         */
        String strNum , strBase;
        if (index == -1)
        {
            strNum = a;
            strBase = "10"; // אם המשתמש כותב מספר בלי לשים b ובסיס כלומר הכוונה למספר עצמו בהצגה בבסיס עשר לדוגמה המשתמש הכניס "66" ייפלט לו 66
        }
        else
        {
            strNum = a.substring(0, index);
            strBase = a.substring(index + 1);
        }
        if (strBase.length()>2)
        {
            System.out.println("structure is illegal"); // בודק אם הבסיס לא מורכב מתו אחד
            return ans;
        }
        if (strBase.equals("") || strNum.equals(""))  // בודק אם אין בסיס / מספר
        {
            if (index != -1)
            {
                System.out.println("structure is illegal"); //סתם מספר אם המשתמש כותב מספר בלי לשים b ובסיס כלומר הכוונה למספר עצמו בהצגה בבסיס עשר לדוגמה המשתמש הכניס "66" ייפלט לו 66
                return ans;
            }
        }
        String tempBase = returnStringInString(strBase);
        char chBase = tempBase.charAt(0);
        int base = returnCharInInt(chBase);

        if (returnCharInInt(chBase) > 16 || returnCharInInt(chBase) <2)
        {
            System.out.println("structure is illegal"); // בודק אם הבסיס תקין
            return ans;
        }

        if (checkValid(strNum , base) == false) // בודק אם כל הספרות במספר קטנות מהמספר של הבסיס
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
    public static boolean equals(String n1, String n2)
    {
        boolean ans = true;
        if (number2Int(n1)!= number2Int(n2))
            ans = false;
        return ans;
    }

    public static int maxIndex(String[] arr) {
        int ans = -1;
        int maxVal = -1;
        System.out.println("");
        System.out.print("Max numbers over [");
        for (int i = 0; i< arr.length; i++)
        {
            if (isNumber(arr[i]))
            {
                if (i==3)
                    System.out.print(arr[i]);
                else
                {
                    System.out.print(arr[i] + " , ");
                }
                if ((number2Int(arr[i])) > maxVal)
                {
                    ans = i;
                    maxVal = (number2Int(arr[i]));
                }
            }
        }
        System.out.print(" ] is : "+arr[ans]);
        return ans;
    }

    //בודקת אם כל המספרים פחותים מהבסיס

    public static boolean checkValid(String num , int base)
    {
        char ch = ' ';
        for (int i = 0 ; i<num.length(); i++)
        {
            ch = num.charAt(i);
            if (returnCharInInt(ch)>=base)
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
        else return base - '0';
    }

    public static String returnStringInString (String base)
    {
        if (base.equals("10"))
            return "A";
        if (base.equals("11"))
            return "B";
        if (base.equals("12"))
            return "C";
        if (base.equals("13"))
            return "D";
        if (base.equals("14"))
            return "E";
        if (base.equals("15"))
            return "F";
        if (base.equals("16"))
            return "G";
        else
            return base;
    }
}
