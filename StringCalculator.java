
class Add {
    public class negativeNumberException extends Exception {
        negativeNumberException(String msg) {
            super(msg);
        }
    }

    private static String getBetweenString(String str, String startingString, String endingString) {

        int endIndex = str.indexOf(endingString);
        if (endingString.length() == 0)
            endIndex = str.length();
        int startIndex = str.indexOf(startingString) + startingString.length();
        String newDelim = str.substring(startIndex, endIndex);
        return newDelim;

    }

    int total = 0;

    Add(String str) {
        String delim = ",\\n";

        if (!str.isEmpty()) {

            if (str.startsWith("//")) {
                if (str.startsWith("//[")) {
                    int no = str.lastIndexOf("]") + 1;
                    String delimeters = str.substring(2, no);
                    while (delimeters.indexOf("]") > 0) {
                        delim = delim + getBetweenString(delimeters, "[", "]");
                        delimeters = delimeters.substring(delimeters.indexOf("]") + 1);
                    }
                    str = getBetweenString(str, "]\\n", "");
                } else {
                    // String newDelim=str.substring(str.indexOf("//")+2,str.indexOf("\n"));
                    // str=str.substring(str.indexOf("\n")+1,str.length());
                    // delim=newDelim;
                    delim = getBetweenString(str, "//", "\\n");
                    str = getBetweenString(str, "\\n", "");
                }
            }
            String[] arr = str.split("["+delim+"]");
            // for (int i=0;i<arr.length;i++){
            //     System.out.println(arr[i] + "arr []");
            // }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) {
                    continue;
                }
                int a = Integer.parseInt(arr[i]);
                if (a < 0) {
                    try {
                        throw new negativeNumberException("Negatives not Allowed");
                    }

                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (a >= 1000) {
                    continue;
                }
                total += a;
                // System.out.println(a);
            }

            System.out.println("Total is : " + total);

        } else {
            System.out.println("0");
        }
    }
}

public class StringCalculator {
    public static void main(String[] args) {
        String str = "//[;;][*]\\n1;;2*4";
        String str2="//,,\\n10,,2";
        // System.out.println(str);
        Add a = new Add(str);
        Add b = new Add(str2);
    }
}