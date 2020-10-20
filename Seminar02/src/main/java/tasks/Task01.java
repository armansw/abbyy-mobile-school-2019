package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for(int elem: ints){
            if(elem < min){
                min = elem;
            }
        }
        return min;
    }

    public static float average(int[] ints) {
        float sum = 0;
        for(int elem: ints){
            sum += elem;
        }
        return sum / ints.length;
    }

}
