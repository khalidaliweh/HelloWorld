package com.harvardfall2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    public static void main(String[] args) {
	// write your code here
      if(args.length==0){
          System.out.print("Please provide the program arguments !");
        return;
      }
        System.out.print("Hello, "+ args[0]+"!");
    }
}
