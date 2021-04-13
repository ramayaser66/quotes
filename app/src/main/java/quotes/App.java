/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Random;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();
//        E:\lab-8\quotes/app/src/main/resources/recentquotes.json
//        Reader reader = new FileReader();

        Reader reader = new FileReader("./app/src/main/resources/recentquotes.json");

//        System.out.println(reader);
        RecentQuotes[] quoteObj = gson.fromJson(reader, RecentQuotes[].class);

        Random r = new Random();
        int rand = r.nextInt(quoteObj.length)+1;

        System.out.println(quoteObj[rand].equals(quoteObj[rand]));

        System.out.println(quoteObj[rand].toString());

    }

}

