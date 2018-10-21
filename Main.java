package Clases;
import java.io.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
        
public class Main {
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\Black\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }   
}

/*

// 
Creates a 64 chars length random string of number.
        String result = RandomStringUtils.random(64, false, true);
        System.out.println("random = " + result);

        // Creates a 64 chars length of random alphabetic string.
        result = RandomStringUtils.randomAlphabetic(64);
        System.out.println("random = " + result);

        // Creates a 32 chars length of random ascii string.
        result = RandomStringUtils.randomAscii(32);
        System.out.println("random = " + result);

        // Creates a 32 chars length of string from the defined array of
        // characters including numeric and alphabetic characters.
        result = RandomStringUtils.random(32, 0, 20, true, true, "qw32rfHIJk9iQ8Ud7h0X".toCharArray());
        System.out.println("random = " + result);


*/