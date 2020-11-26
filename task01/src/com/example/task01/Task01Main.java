package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null){
            throw new IllegalArgumentException("stream is null");
        }

        int sum = 0, tmp;
        while ((tmp = inputStream.read()) != -1){
            sum = Integer.rotateLeft(sum,1) ^ tmp;
        }

        return sum;
    }
}
