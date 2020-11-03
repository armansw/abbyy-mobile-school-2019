package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

    /**
     * Написать программу, которая играет с вами в угадай число.
     * Сначала программа печатает: "Введи нижную и верхнюю границы"
     * Пользователь вводит.
     * Программа проверяет, что нижняя граница меньше верхней.
     * Иначе выводит в консоль сообщение об ошибке и завершается.
     *
     * Далее программа пытается угадать какое число загадал пользователь
     * в введенном отрезке.
     * Тактика может быть любая: random, перебор, бин поиск.
     * Программа выводит своё предположение.
     * Пользователь должен ввести "yes", если программа угадал.
     * Программа завершается.
     * Иначе любое другое сообщение. Тогда программа продолжает угадывать.
     *
     * Пример:
     * Введи границы
     * 0 10
     * Это 1?
     * no
     * Это 3?
     * no
     * Это 5?
     * yes
     * Отличная игра(завершение)
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter limits");
        int left = in.nextInt();
        int right = in.nextInt();
        String answer;
        Random random = new Random();
        while(true){
            int randomNumber = random.nextInt(right + 1 - left) + left;
            String guess = "The number is " + randomNumber + "?";
            System.out.println(guess);
            answer = in.nextLine();
            if(answer.equals("yes") || !answer.equals("")){
                System.out.println("Nice game!(finished)");
                break;
            }
            else if(!answer.equals("no") || !answer.equals("")){
                System.out.println("Not valid answer. Try again!");   
            }
        }
        in.close();
    }

}
