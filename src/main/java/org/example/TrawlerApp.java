package org.example;

import java.io.InputStream;
import java.util.Scanner;


public class TrawlerApp {


 public static void main (String[] args) {

    System.out.println("\n\nTRAWLER APP \n");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    String name = Scanner.nextLine();

    System.out.println("Enter transponder ID: ");
    String transId = Scanner.nextLine();

    System.out.println("Enter trawler type: ");
    String trawtype = Scanner.nextLine();

     Trawler trawler1 = new Trawler(name, transId, trawtype);

    System.out.println("\nRESULTS\n");
    trawler1.displayInfo();

        }
    }


