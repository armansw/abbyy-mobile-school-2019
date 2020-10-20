package tasks;

import java.util.Random;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {
    RandomFromArray(int[] array, int[] arrayWeight){
        this.array = array;
        this.arrayWeight = arrayWeight;
    }

    /*
    В задаче будем считать что массив весов отсортирован Иначе просто можем сортировать массив весов сначала одновременно меняя соответствующие элементы.
    Берём и генерируем число в диапазоне от 0 до максимума в матрице весов
    Смотрим в какой диапазон попало число и в соответствии с этим возвращаем соответствующее значение
    */
    public int generateFromArray(){
        int num = new Random().nextInt(this.arrayWeight[this.arrayWeight.length - 1]);
        int result = 0;
        for(int i = 0; i < this.arrayWeight.length - 1; ++i){
            if(i == 0 && num >= 0 && num <= this.arrayWeight[0]){
                    result = this.array[0];
            }
            else{
                if(num >= this.arrayWeight[i] && num <= this.arrayWeight[i+1]){
                    result = this.array[i+1];
                }
            }
        }
        return result;
    }

    private int[] array;
    private int[] arrayWeight;
}

public class Task05 {

}
