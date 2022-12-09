import java.util.Scanner;

public class batallaNaval{

  static Scanner naval = new Scanner(System.in);
  static String jg1, jg2;
  static int filas, columnas, posX, posY;
  static int tab1 [][];
  static int tab2 [][];
  static String direc1, direc2;
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
        for( int i = 0; i < filas; i++){ //llenar el tablero 1
            for(int j = 0; j < columnas; j++){
                tab1  [i][j] = 0;
            }
        }
        for( int i = 0; i < filas; i++){ //llenar el tablero 2
            for(int j = 0; j < columnas; j++){
                tab2[i][j] = 0;
            }
        }
        for( int i = 0; i < filas; i++){
          for(int j = 0; j < columnas; j++){  //Mostrar el tablero 1
              System.out.print(tab1[i][j]+ " ");
          }
          System.out.println("");
      }
          System.out.println("\n" ); //espacio entre el tablero 1 y 2 

          for( int i = 0; i < filas; i++){
          for(int j = 0; j < columnas; j++){ //Mostrar el tablero 2
            System.out.print(tab2[i][j]+ " ");
          }
            System.out.println("");
         }
          colocarbarcostab1();  
  }
    public static void colocarbarcostab1(){   //BARCOS PARA EL JUGADOR 1
      System.out.println("***BARCOS DEL PRIMER JUGADOR***");
      System.out.println("");
      System.out.println("Digite en que posicion desea su barco de 4 unidades:");
      System.out.println("Horizontal/H  o  Vertical/V");
      direc1 = naval.next();
      if(direc1.equalsIgnoreCase("H")){//Equals solo digitamos h para horizontal, con el ignoreCase
        System.out.println("Ingresa las coordenadas en filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-4){ //tamaño del barco -4 de forma vertical
          //se restan esas cuatro posiciones 
          for(int i=0; i<4;i++){
             tab1[posX][posY+i] = 3; //El 3 son las casillas que ocupa el barco, ya que las casillas originales son 0
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
              System.out.print(tab1[i][j]+ " ");   //Tabla 1 con el barco
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-4 && posY >= 0 && posY < columnas){ //tamaño del barco -4 de forma horizontal
          for(int i=0; i<4;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 1 con el barco
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-3){//barco de 3 casillas en columna
          for(int i=0; i<3;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 1
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-3 && posY >= 0 && posY < columnas){ //barco de 3 casilllas en fila
          for(int i=0; i<3;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 1 con barco
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-2){ // barco de 2 casillas
          for(int i=0; i<2;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ // tabla 1
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-2 && posY >= 0 && posY < columnas){ //barco de 2 casillas
          for(int i=0; i<2;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){//tabla 1
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-1){ //barco una casilla
          for(int i=0; i<1;i++){
             tab1[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 1
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc1.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        posY = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posX =  naval.nextInt();
        if(posX >= 0 && posX < filas-1 && posY >= 0 && posY < columnas){ // barco una casilla
          for(int i=0; i<1;i++){
             tab1[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 1
              System.out.print(tab1[i][j]+ " ");
            }
              System.out.println("\n");//espacio
          }
        }
      }
      colocarbarcostab2();
    }
    public static void colocarbarcostab2(){ //BARCOS PARA EL JUGADOR 2
      System.out.println("***BARCOS DEL SEGUNDO JUGADOR***");
      System.out.println("");
      System.out.println("Digite en que posicion desea su barco de 4 unidades:");
      System.out.println("Horizontal/H  o  Vertical/V");
      direc2 = naval.next();
      if(direc2.equalsIgnoreCase("H")){
        System.out.println("Ingresa las coordenadas en filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-4){//barco de 4 casillas
          for(int i=0; i<4;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){//tabla 2
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-4 && posY >= 0 && posY < columnas){ //tabla 4 casillas
          for(int i=0; i<4;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 2
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-3){//barco de 3 casillas
          for(int i=0; i<3;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tablero 2 con las 3 casillas
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas-3 && posY >= 0 && posY < columnas){ //barco 3 casillas
          for(int i=0; i<3;i++){
             tab2[posX+i][posY] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){ //tabla 2
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
        if(posX >= 0 && posX < filas && posY >= 0 && posY < columnas-2){ //barco 2 casillas
          for(int i=0; i<2;i++){
             tab2[posX][posY+i] = 3;
          }
          for( int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){   //tabla 2
              System.out.print(tab2[i][j]+ " ");
            }
              System.out.println("");
          }
        }
      }else if(direc2.equalsIgnoreCase("V")){
        System.out.println("Ingresa las coordenadas en las filas");
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
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
        posX = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posY =  naval.nextInt();
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
        posY = naval.nextInt();
        System.out.println("Ingrese las coordenadaas en las columnas");
        posX =  naval.nextInt();
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
      for(int i=0; i<tab1.length;i++)
      for(int j=0; j<tab1.length-1;j++)
          
          for(int k=0;k<tab2.length;k++)
              for(int m=0;m<tab2.length-1;m++)
  while (tab1[i][j]==3 && tab2 [k][m]==3){//busca los 3 en la tabla 2 que son los barcos
      System.out.println("turno primer jugador"+ jg1);
      System.out.println("ingrese su tiro en filas");
      int dispfi=naval.nextInt();
       System.out.println("ingrese su tiro en columnas");
      int dispco=naval.nextInt();
      if(dispfi >=0 && dispfi<=filas && dispco >=0 && dispco<=columnas ){
      if(tab2 [dispfi][dispco]==3){//si es un 3 significa que le dio a un barco
          System.out.println("le has acertado a un barco");
          for (int x=0;x<filas; x++){//recorre las filas
              for(int y=0;y<columnas;y++){//recorre las columnas
                 tab2[dispfi][dispco]=8;//despues de todo lo anterios va a cambiarlos a 8
                 
              }
          }
      }else if(tab2 [dispfi][dispco]==0){//va a ver que es cero
             System.out.println("no le has acertado a un barco");
          for (int x=0;x<filas; x++){//recorre las filas ingresadas
              for(int y=0;y<columnas;y++){//recorrelas columnas ingresada
                 tab2[dispfi][dispco]=8;//va a cambiar a un 8
                 
              }
          }
          
      }else if(tab2 [dispfi][dispco]==8){
          System.out.println("esa pocision ya ha sido atacada");//para que seopan que ya hga tirado ahi
          
      }
      }
                  System.out.println("turno primer jugador"+ jg2);//turno del jugador 2
      System.out.println("ingrese su tiro en filas");
       dispfi=naval.nextInt();//ingresa coordenadas en filas
       System.out.println("ingrese su tiro en columnas");
       dispco=naval.nextInt();//ingresa coordenadas en colimnas
      if(dispfi >=0 && dispfi<=filas && dispco >=0 && dispco<=columnas ){
      if(tab1 [dispfi][dispco]==3){//checa si las coordenadas que ingreso hay un 3(barco)
          System.out.println("le has acertado a un barco");
          for (int x=0;x<filas; x++){
              for(int y=0;y<columnas;y++){
                 tab1[dispfi][dispco]=8;//lo cambia a un 8
                 
              }
          }
      }else if(tab1 [dispfi][dispco]==0){//checa las coordenadas y lo compara si es igaual a 0
             System.out.println("no le has acertado a un barco");//no le ha atinado a ningun barco
          for (int x=0;x<filas; x++){
              for(int y=0;y<columnas;y++){
                 tab1[dispfi][dispco]=8;//lo cambia a 8 para saber que ya ha dispoarado ahi
                         
                 
              }
          }
          
      }else if(tab1 [dispfi][dispco]==8){//checa si hay un ocho si si ya ha sido atacada esa pocision
          System.out.println("esa pocision ya ha sido atacada");
          
          
      }
      }
      }
          for(int i=0; i<tab1.length;i++)
      for(int j=0; j<tab1.length-1;j++)
          
          for(int k=0;k<tab2.length;k++)
              for(int m=0;m<tab2.length-1;m++)
                  if(tab1[i][j]==3 || tab2[k][m]== 3){
                      if(tab1[i][j]==3){
                          System.out.println("has perdido"+ jg2);
            for( int a = 0; a < filas; a++){
           for(int b = 0; b < columnas; b++){
          System.out.print(tab1[a][b]+ " ");//este ciclo checa si en tablero 1 hay todavia hay un 3(barcos)
      }
           System.out.println("");
    }
                      }else{
                      System.out.println("has ganado"+ jg2);//si no hay 3(barcos) en la tabla ha ganado el jugador 2
                       for( int a = 0; a < filas; a++){
           for(int b = 0; b < columnas; b++){
          System.out.print(tab1[a][b]+ " ");
      }
           System.out.println("");
    }
                  }
                      if(tab2[k][m]==3){//checa si hay 3 en la tb2 
                          System.out.println("has perdido"+ jg1);//si no hay pierde el juego el jg2
            for( int a = 0; a < filas; a++){
           for(int b = 0; b < columnas; b++){
          System.out.print(tab2[a][b]+ " ");
      }
           System.out.println("");
    }
                      }else{
                      System.out.println("has ganado"+ jg1);//si pierde el jg2 gana el jg1
                       for( int a = 0; a < filas; a++){
           for(int b = 0; b < columnas; b++){
          System.out.print(tab2[a][b]+ " ");
      }
           System.out.println("");
    }
                  }
                      return;//si todavia hay bartcos vueleve  arepetirse hasta que ya no alla 3(barcos)
                      
                  }
    }
}
