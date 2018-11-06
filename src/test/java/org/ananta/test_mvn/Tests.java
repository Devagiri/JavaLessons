package org.ananta.test_mvn;

import org.testng.annotations.Test;

public class Tests {

    @Test
    public void myTest(){
       System.out.printf("Результат равен %.2f %d %c %s", 1000.11111111, 22, 'p', "asdasdas" );
       String f = String.format("Результат равен %.2f %d %c %s", 1000.11111111, 22, 'p', "asdasdas" );


    }
}
