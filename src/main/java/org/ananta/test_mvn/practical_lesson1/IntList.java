package org.ananta.test_mvn.practical_lesson1;


public class IntList {

    private final static int DEFAULT_SIZE = 10;
    private int [] values;
    private int length = 0;

    /**
     * Создает пустой список с размером буффера по умолчанию
     *
     */
    public IntList() {
       this(DEFAULT_SIZE);
    }

    /**
     * Создает пустой список с размером буффера равным size
     * @param size размер буффера
     */
    public IntList(int size) {
        values = new int[size];
    }



    public IntList(int [] elements) {
        if(elements.length != 0)  {
            values = new int[elements.length+elements.length/2];
        }
        else values = new int[DEFAULT_SIZE];

        for (int i=0; i< elements.length; i++){
            add(elements[i]);
        }

    }

    public IntList(IntList list) {
        this(list.size() == 0 ? DEFAULT_SIZE : list.size());
        if (list.size() > 0 ){
            for (int i=0; i< list.size(); i++){
                add(list.get(i));
            }
            length = list.size();
        }
    }

    /**
     * Возвращает длину списка
     * @return длина списка
     */
    public int size(){
        return length;
    }

    private void resizeArray(int countAddedElements){
        int [] temp = new int[values.length+countAddedElements];
        for (int i=0; i<length; i++){
            temp[i] = values[i];
        }
        values = temp;
    }

    public void add(int element){
        if(length == values.length) {
            resizeArray(DEFAULT_SIZE);
        }
        values[length++] = element;

    }

    public void addAll(int [] elements){
        if( values.length - length >= elements.length) {
            resizeArray(elements.length < DEFAULT_SIZE ? DEFAULT_SIZE : (elements.length + DEFAULT_SIZE));
        }

        for (int i=0; i< elements.length; i++){
            values[length++] = elements[i];
        }

    }

    public  void remove(int index){
            throw new RuntimeException();
    }

    public int get(int index){
        if( index >= length || index < 0) throw new IndexOutOfBoundsException();

        return values[index];
    }

    public void push(int element){
        add(element);
    }

    public int peek(){
        return get(length-1);
    }

    public  int pop(){
        int result = peek();
        length--;
        return result;
    }



}
