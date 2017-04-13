package Module6.Task1;


public final class ArraysUtils {


    public static int[] array = {12, 11, -3, -4, -5, -6, -7, 18, 16, 5};

    static int sum(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    static int min(int array[]){int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
   }

   static int max(int array[]){int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
   }

    static int maxPositive(int array[]){
        int maxPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive && array[i] >= 0)
                maxPositive = array[i];
        }
        if(maxPositive == -1) System.out.println("There is no positive elements in array");
                return maxPositive;
    }

    static int multiplication  (int array[]){
        int multiplication = 1;
        for (int i = 0; i < array.length; i++)
            multiplication *= array[i];
        return multiplication;
    }

    static int modulus(int array[]){
        int modulus = array[0] % array[array.length-1];
        return modulus;
    }
    static int secondLargest(int array[]){
        int firstLargest,secondLargest;

        firstLargest = ArraysUtils.max(array);
        if (firstLargest != array[0]) secondLargest = array[0];
        else secondLargest = array[1];

        for (int i = 0; i <array.length; i++) {
            if (array[i] > secondLargest && array[i]!= firstLargest)
                secondLargest = array[i];
        }
        return secondLargest;
    }

    static int[] reverse(int[] array){
        for(int i = 0; i <array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
    static int[] findEvenElements(int[] array){
        int l = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                l++;
            }
        }
        int arrayEven[] = new int[l];
        for(int i=0; i<array.length; i++) {
            if(array[i]%2==0) {
                arrayEven[j] = array[i];
                j++;
            }
        }
        return arrayEven;
    }



}





