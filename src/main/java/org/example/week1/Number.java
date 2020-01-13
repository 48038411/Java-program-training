package org.example.week1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Number {
    public static void main(String[] args) throws IOException {
        int[] arrays = new int[100];
        for (int i = 0; i<100; i++){
            Random random = new Random();
            arrays[i] = random.nextInt(100);
        }
        for (Integer integer:arrays
             ) {
            System.out.println(integer);
        }
        File file = new File("E:\\dev\\work\\number.txt");
        FileWriter out = new FileWriter(file,true);
        for(int i=0;i<100;i++){
                out.write(arrays[i]+"\t");
            out.write("\r\n");
        }
        out.close();
    }
}
