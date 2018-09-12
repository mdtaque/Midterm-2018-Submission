package datastructure;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    public static <br> void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        FileReader fr = null;
        BufferedReader br = null;
        String textFile = "/Users/mdtaque/JAVA/MidtermJuly2018/src/data/self-driving-car";

        try {
            fr = new FileReader(textFile);
        } catch (Exception e) {
            System.out.println("File not found");
        }

        Stack<String> stack = new Stack<>();  // Create Stack
        LinkedList<String> linkedList = new LinkedList<>();
        int count = 0;


        try {
            br = new BufferedReader(fr);
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);

                String[] words = data.split(" ");
                for (int i = 0; i < words.length; i++) {       //loop to read
                    stack.push(words[i]);

                    //System.out.println("Stack "+stack.peek());
                    linkedList.add(words[i]);
                    //System.out.println("LinkedList "+linkedList.get(i));
                }
            }
            System.out.println("Total word count: " + count);

        } catch (Exception ex) {
            System.out.println("File is not readable");
        }


        //Retrieving data from LinkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //Retrieving data from stack
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

        //Use of Peek, Search
        System.out.println(stack.peek());
        System.out.println(stack.search("road"));

        //use of for each loop
        for(String x : stack){
            System.out.println(x);
        }

        //use of Iterator
        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

