package org.example;
import java.util.Scanner;
public class Trawler {
        private String name;
        private String transID;
        private String trawType;


        public Trawler() {
            this.name = " ";
            this.transID = " ";
            this.trawType = " ";
        }

    public Trawler(String n, String id, String type) {

    }

    public String getName(){
            return this.name;
        }
        public void setName (String n){
            this.name = n;
        }

        public String getTransID() {
            return this.transID;
        }

        public void setTransID(String id){
            this.transID = id;
        }

        public String getTrawType(){
            return this.transID;
        }

        public void setTrawType(String type){
            this.transID = type;
        }

        public void displayInfo(){
            System.out.println("NAME: "+ name +".\nTRANSPONDER ID: "+ transID +".\nTRAWLER TYPE: " + trawType);
        }

}


