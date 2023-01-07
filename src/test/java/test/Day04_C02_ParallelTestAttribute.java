package test;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {
    @Test(
        threadPoolSize = 4,   //testimizin kaç çekirdekte paralel olarak çalışacağını belirler
        invocationCount = 7   // testimizin kaç defa çalışacağını belirler
    )
    public void test(){
        System.out.println( "Current thread Id=" + Thread.currentThread().getId());

    }
}
