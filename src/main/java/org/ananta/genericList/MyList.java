package org.ananta.genericList;

public class MyList<T> implements IList<T> {

    private final static int DEFAULT_SIZE = 10;
    private Object [] values;
    private int length = 0;


    /**
     * Создает пустой список с размером буффера по умолчанию
     *
     */
    public MyList() {
        this(DEFAULT_SIZE);
    }

    /**
     * Создает пустой список с размером буффера равным size
     * @param size размер буффера
     */
    public MyList(int size) {
        values = new Object[size];
    }



    public MyList(T [] elements) {
        if(elements.length != 0)  {
            values = new Object[elements.length+elements.length/2];
        }
        else values = new Object[DEFAULT_SIZE];

        for (int i=0; i< elements.length; i++){
            add(elements[i]);
        }

    }

    public MyList(IList<T> list) {
        this(list.size() == 0 ? DEFAULT_SIZE : list.size());
        if (list.size() > 0 ){
            for (int i=0; i< list.size(); i++){
                add(list.get(i));
            }
            length = list.size();
        }
    }

    @Override
    public int size() {
        return length;
    }

    private void resizeArray(int countAddedElements){
        Object [] temp = new Object[values.length+countAddedElements];
        for (int i=0; i<length; i++){
            temp[i] = values[i];
        }
        values = temp;
    }

    @Override
    public void add(T element) {
        if(length == values.length) {
            resizeArray(DEFAULT_SIZE);
        }
        values[length++] = element;
    }

    @Override
    public void addAll(T[] elements) {
        if( values.length - length < elements.length) {
            resizeArray(elements.length < DEFAULT_SIZE ? DEFAULT_SIZE : (elements.length + DEFAULT_SIZE));
        }

        for (int i=0; i< elements.length; i++){
            values[length++] = elements[i];
        }
    }

    @Override
    public T get(int index) {
        if( index >= length || index < 0) throw new IndexOutOfBoundsException();

        return (T)values[index];
    }

    @Override
    public void push(T element) {
        add(element);
    }

    @Override
    public T peek() {
        return get(length-1);
    }

    @Override
    public T pop() {
        T result = peek();
        length--;
        return result;
    }

    @Override
    public  T[] toArray() {
        return (T[])values;
    }


    @Override
    public void addAll(IList<T> list) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int[] findAll(T value) {
        return new int[0];
    }

    @Override
    public int findFirst(T value) {
        return 0;
    }

    @Override
    public int findLast(T value) {
        return 0;
    }




    /**
     * Преобразует список в строку, где элементы будут через запятую
     * @return
     */
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder("[");
        for (int i=0; i<length;i++){
            str.append(get(i));
            if(i!=length-1) str.append(", ");
        }
        str.append("]");
        return str.toString();

    }
}
