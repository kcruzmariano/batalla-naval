package PROYECTOS;

import java.util.Arrays;
import java.util.Scanner;

public class batallaNaval{

  static Scanner naval = new Scanner(System.in);
  static String jg1, jg2;
  static int filas, columnas, barco1;
  static int tab1 [][];
  static int tab2 [][];
  public static void main(String[] args){   
    System.out.println("Bienvenido al  Juego de batalla naval");
    
    //Pendiente, se pondran las reglas

    System.out.print("Ingrese el nombre del primer jugador: ");
      jg1 = naval.next(); //jugador 1
    System.out.println(jg1);

    System.out.print("Ingrese el nombre del segundo jugador: ");
      jg2 = naval.next();//jugador 2
    System.out.println(jg2);

    System.out.println("");

    //     T  A   B   L   E   R   O 
    System.out.println("Digite el tamanio del tablero para los jugadores: ");
    filas = naval.nextInt(); //--->//Digita el numero de filas y el
    columnas = naval.nextInt(); //--->    //numero de columnas
    tab1 = new int [filas][columnas];
        tab2 = new int [filas][columnas];


        for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tab1  [i][j] = 0;
            }
        }

        for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                tab2[i][j] = 0;
            }
        }
        for( int i = 0; i < filas; i++){
          for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
          }
          System.out.println("");
      }
      
          System.out.println("\n" );
          for( int i = 0; i < filas; i++){
          for(int j = 0; j < columnas; j++){
            System.out.print(tab2[i][j]+ " ");
          }
            System.out.println("\n");
         }

    
    colocarbarcostab1();  
  }
    public static void colocarbarcostab1(){   //BARCOS PARA EL JUGADOR 1
      System.out.println("****BARCOS DEL PRIMER JUGADOR****");
      System.out.println("");
      System.out.println("Digite en que posicion desea su barco de 4 unidades:");
      String direc1;
      System.out.println("Horizontal/H  o  Vertical/V");
      direc1 = naval.next();
      if(direc1.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-4){
          for(int i=0; i<4;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-4 && posY >= 0 && posY < columnas){
          for(int i=0; i<4;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 3 unidades:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc1 = naval.next();
      if(direc1.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las Filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-3){
          for(int i=0; i<3;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-3 && posY >= 0 && posY < columnas){
          for(int i=0; i<3;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 2 unidades:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc1 = naval.next();
      if(direc1.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las Filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-2){
          for(int i=0; i<2;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-2 && posY >= 0 && posY < columnas){
          for(int i=0; i<2;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 1 unidad:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc1 = naval.next();
      if(direc1.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-1){
          for(int i=0; i<1;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posY = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posX =  naval.nextInt();
        if(posX >= 0 && posX < filas-1 && posY >= 0 && posY < columnas){
          for(int i=0; i<1;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
          
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("\n");
          }
        }
      }
      colocarbarcostab2();
    }
    public static void colocarbarcostab2(){ //BARCOS PARA EL JUGADOR 2
      System.out.println("****BARCOS DEL SEGUNDO JUGADOR****");
      System.out.println("");
      System.out.println("Digite en que posicion desea su barco de 4 unidades:");
      String direc2;
      System.out.println("Horizontal/H  o  Vertical/V");
      direc2 = naval.next();
      if(direc2.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-4){
          for(int i=0; i<4;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-4 && posY >= 0 && posY < columnas){
          for(int i=0; i<4;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 3 unidades:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc2 = naval.next();
      if(direc2.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las Filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-3){
          for(int i=0; i<3;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-3 && posY >= 0 && posY < columnas){
          for(int i=0; i<3;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 2 unidades:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc2 = naval.next();
      if(direc2.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las Filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-2){
          for(int i=0; i<2;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-2 && posY >= 0 && posY < columnas){
          for(int i=0; i<2;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }
      System.out.println("Digite en que posicion desea su barco de 1 unidad:");
      
      System.out.println("Horizontal/H  o  Vertical/V");
      direc2 = naval.next();
      if(direc2.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-1){
          for(int i=0; i<1;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        int posY = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        int posX =  naval.nextInt();
        if(posX >= 0 && posX < filas-1 && posY >= 0 && posY < columnas){
          for(int i=0; i<1;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
          
            for(int j = 0; j < columnas; j++){
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("\n");
          }
        }
      }
      disparos();
    }
    public static void disparos(){

    }
}
