package tasks;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Реализовать итератор над массивом.
 * Массив принимается в конструктор.
 * Итерация должна начинаться с первого элемента.
 * hasNext возвращает true, если итератор может вернуть следующее значение.
 * next должен возвращать следующее значение.(с переходом на следующий элемент)
 */
class ArrayIterator<T> implements Iterator<T> {

    private T[] array;
    private int curPosition;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.curPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return this.curPosition < this.array.length;
    }

    @Override
    public T next() {
        // Если следующего значения нет, то надо бросить NoSuchElementException
        if (this.hasNext()){
            return this.array[this.curPosition++];
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
