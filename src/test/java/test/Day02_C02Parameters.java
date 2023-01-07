package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C02Parameters {

    @Test
    @Parameters({"isim"})
    public void test01(String name){

        System.out.println("Hello " + name);
}}
