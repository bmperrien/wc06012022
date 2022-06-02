public class ReorderDigits {
    /*a) Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.

Examples:
reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]

reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]

reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]

reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]

reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]

reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

Notes:
Single-digit numbers should be ordered the same regardless of direction.
Numbers in the array should be kept the same order.
*/
    public static int[] reorderDigits(int[] N, String str){
        int[] result = new int[N.length];

        if(str.equals("asc")){
            for(int i = 0; i < N.length; i++){
                String currentInt = Integer.toString(N[i]);
                char[] digits = currentInt.toCharArray();
                char temp = 'x';
                StringBuilder reorderInt = new StringBuilder();


                //Sorting the array in ascending order
                for(int j = 0; j < digits.length; j++){
                    for(int k = j+1; k < digits.length; k++){
                        if(digits[k] < digits[j]){
                            temp = digits[j];
                            digits[j] = digits[k];
                            digits[k] = temp;
                        }
                    }
                }
                for(int h = 0; h < digits.length; h++){
                    reorderInt.append(digits[h]);
                }
                result[i] = Integer.parseInt(reorderInt.toString());
            }

        }else if(str.equals("desc")){
            for(int i = 0; i < N.length; i++){
                String currentInt = Integer.toString(N[i]);
                char[] digits = currentInt.toCharArray();
                char temp = 'x';
                StringBuilder reorderInt = new StringBuilder();


                //Sorting the array in ascending order
                for(int j = 0; j < digits.length; j++){
                    for(int k = j+1; k < digits.length; k++){
                        if(digits[k] > digits[j]){
                            temp = digits[j];
                            digits[j] = digits[k];
                            digits[k] = temp;
                        }
                    }
                }
                for(int h = 0; h < digits.length; h++){
                    reorderInt.append(digits[h]);
                }
                result[i] = Integer.parseInt(reorderInt.toString());
            }


        }else{
            System.out.println("You must specify asc or desc...");
            return null;
        }
        return result;
    }
}
