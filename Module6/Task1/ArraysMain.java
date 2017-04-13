package Module6.Task1;


import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {

        System.out.println("Сумма значений:" + ArraysUtils.sum(ArraysUtils.array));
        System.out.println("Минимальное значение:" + ArraysUtils.min(ArraysUtils.array));
        System.out.println("Максимальное значение:" + ArraysUtils.max(ArraysUtils.array));
        System.out.println("Максимальное позитивное значение:" + ArraysUtils.maxPositive(ArraysUtils.array));
        System.out.println("Произведение всех элементов массива:" + ArraysUtils.multiplication(ArraysUtils.array));
        System.out.println("Остаток от деления первого элемента на последний:" + ArraysUtils.modulus(ArraysUtils.array));
        System.out.println("Второй наибольший элемент массива:" + ArraysUtils.secondLargest(ArraysUtils.array)+ "\n");
        System.out.println("------------------------------------");
        System.out.println("Элементы массива задом-наперед:" + Arrays.toString(ArraysUtils.reverse(ArraysUtils.array)));
        System.out.println("Четные числа массива:" + Arrays.toString(ArraysUtils.findEvenElements(ArraysUtils.array)));


    }
}
