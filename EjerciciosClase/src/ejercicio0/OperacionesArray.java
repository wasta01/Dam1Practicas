package ejercicio0;
/**
 * @author IESFranciscoQuevedo.Dam1.aitorGrandaMartin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OperacionesArray {
//cargas de arrays
    //Una dimension
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        *  Rellenara un array con booleanos cogidos a traves del teclado
        */
        static boolean[] CargarArray(boolean[] x) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
                System.out.println("Introduza true o false:");
             try{
                 //Esta linea es un operador ternario glosario 1
                x[i]=(entrada.readLine().trim().toUpperCase()).compareTo("TRUE")==0;
                }catch(IOException e){
                    System.out.println("estado Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                       }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array con bytes cogidos a traves del teclado
        */
        static byte[] CargarArray(byte[] x){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Byte.parseByte(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                    
                }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array con shorts cogidos a traves del teclado
        */
        static short[] CargarArray(short[] x){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Short.parseShort(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;
                }
        }
    return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        *  Rellenara un array con ints cogidos a traves del teclado
        */
        static int[] CargarArray(int[] x) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Integer.parseInt(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                       }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array con long cogidos a traves del teclado
        */
        static long[] CargarArray(long[] x) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Long.parseLong(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                       }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array con float cogidos a traves del teclado
        */
        static float[] CargarArray(float[] x){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Float.parseFloat(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                    
                }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array con double cogidos a traves del teclado
        */
        static double[] CargarArray(double[] x){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            if(i!=0){
                System.out.println("Introduza el siguiente numero:");
            }else{
                System.out.println("Introduza un numero:");

            }
             try{
                x[i]= Double.parseDouble(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    i--;                    
                }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * @throws IOException puede generar errores en la lectura del string.
        * 
        *  Rellenara un array con char cogidos a traves del teclado
        */
        static char[] CargarArray(char[] x)throws IOException{//throws -->> Glosario2
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la frase a almacenar \'si contiene mas caracteres que "+x.length+" la frase se cortara\'");
        String aux=entrada.readLine();
        for(byte i=0;i<x.length;i++){
            x[i]=aux.charAt(i);
        }
        return x;
    }
    //Dos dimensiones
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con booleanos cogidos a traves del teclado
        */
        static boolean[][] CargarArray(boolean[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                    System.out.println("Introduza el estado para fila "+(i+1)+" Columna "+(j+1)+" :");
                
                try{
                    //esta linea es un operador ternario glosario 1
                x[i][j]= (entrada.readLine().trim().toUpperCase()).compareTo("TRUE")==0;
                }catch(IOException e){
                    System.out.println("estado Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con bytes cogidos a traves del teclado
        */
        static byte[][] CargarArray(byte[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Byte.parseByte(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con shorts cogidos a traves del teclado
        */
        static short[][] CargarArray(short[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Short.parseShort(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con ints cogidos a traves del teclado
        */
        static int[][] CargarArray(int[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Integer.parseInt(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        *  Rellenara un array de dos dimensiones con long cogidos a traves del teclado
        */
        static long[][] CargarArray(long[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Long.parseLong(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        *  Rellenara un array de dos dimensiones con floats cogidos a traves del teclado
        */
        static float[][] CargarArray(float[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Float.parseFloat(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con doubles cogidos a traves del teclado
        */
        static double[][] CargarArray(double[][] x){
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(i!=0){
                    System.out.println("Introduza el siguiente numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }else{
                    System.out.println("Introduza un numero para fila "+(i+1)+" Columna "+(j+1)+" :");
                }
                try{
                x[i][j]= Double.parseDouble(entrada.readLine());
                }catch(IOException e){
                    System.out.println("Numero Introducido erroneo causa :"+e.getCause());
                    System.out.println("Intentelo de nuevo");
                    j--;                       }
            }
        }
        return x;
    }
        /**
        * 
        * @param x array a rellenar
        * @return el array rellenado
        * Rellenara un array de dos dimensiones con chars cogidos a traves del teclado
        */
        static char[][] CargarArray(char[][] x)throws IOException{
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<x.length;i++){
            System.out.println("Introduzca su linea maximo numero de caracteres en esta linea "+x[i].length+":");
            String aux=entrada.readLine();
            for(int j=0;j<x[i].length;j++){
                x[i][j]= aux.charAt(j);                
            }
        }
        return x;
    }
//mostrado de Arrays
    //Una Dimension
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de booleanos de una dimension por pantalla
        */
        static void MostrarArray(boolean[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de bytes de una dimension por pantalla
        */
        static void MostrarArray(byte[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de short de una dimension por pantalla
        */
        static void MostrarArray(short[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de enteros de una dimension por pantalla
        */
        static void MostrarArray(int[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de largos de una dimension por pantalla
        */
        static void MostrarArray(long[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de flotantes de una dimension por pantalla
        */
        static void MostrarArray(float[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de dobles de una dimension por pantalla
        */
        static void MostrarArray(double[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de chars de una dimension por pantalla
        */
        static void MostrarArray(char[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" / ");
            }
            System.out.println();
        }
         /**
        * 
        * @param x el array que se mostrara 
        * Mostrara el array de chars de una dimension por pantalla
        * como frase
        */
        static void MostrarArrayText(char[] x){
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]);
            }
            System.out.println();
        }
    //Dos Dimensiones
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(boolean[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(byte[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(short[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(int[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(float[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        */
        static void MostrarArray(double[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        * separados con /
        */
        static void MostrarArray(char[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]+" / ");
            }
            System.out.println();
        }
        /**
        * 
        * @param x el array que se mostrara
        * Mostrara el array de dos dimensiones por pantalla
        * juntos como texto
        */
        static void MostrarArrayText(char[][] x){
            for(int i=0;i<x.length;i++){
                System.out.print("Fila "+(i+1)+"\t");
                for(int j=0;j<x[i].length;j++)
                    System.out.print(x[i][j]);
            }
            System.out.println();
        }
//ordenado de Arrays
    //una Dimension
        /**
        * 
        * @param x array entero a ordenar
        * @return array ordenado
        * Ordenara el array de una dimension de enteros que se le pasa
        */
        static int[] OrdenarArray(int[] x){
        int aux;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;i<x.length;j++){
                if(x[i]>x[j]){
                    aux=x[j];
                    x[j]=x[i];
                    x[i]=aux;
                }
            }
        }
        return x;
    }
    //Dos Dimensione
//medias de Arrays
        
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de bytes de una dimension
        */
        static byte MediaArray(byte[] x){
            byte aux=0;
            for(int i=0;i<x.length;i++){
            aux+=x[i];
            }
            aux/=x.length;
            return aux;
        }
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de shorts de una dimension
        */
        static short MediaArray(short[] x){
            short aux=0;
            for(int i=0;i<x.length;i++){
            aux+=x[i];
            }
            aux/=x.length;
            return aux;
        }
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de enteros de una dimension
        */
        static int MediaArray(int[] x){
    int aux=0;
    for(int i=0;i<x.length;i++){
        aux+=x[i];
    }
    aux/=x.length;
    return aux;
    }
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de longs de una dimension
        */
        static long MediaArray(long[] x){
            long aux=0;
            for(int i=0;i<x.length;i++){
            aux+=x[i];
            }
            aux/=x.length;
            return aux;
        }
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de float de una dimension
        */
        static float MediaArray(float[] x){
            float aux=0;
            for(int i=0;i<x.length;i++){
            aux+=x[i];
            }
            aux/=x.length;
            return aux;
        }
        /**
        * 
        * @param x array de enteros a realizar la media
        * @return numero entero de la media realizada
        * realizara la media sin decimales de un array de doubles de una dimension
        */
        static double MediaArray(double[] x){
            double aux=0;
            for(int i=0;i<x.length;i++){
            aux+=x[i];
            }
            aux/=x.length;
            return aux;
        }
//Inversion de Arrays
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de bytes unidimensional y lo devolvera en ese
        * estado
        */
        static byte[] InvertArray(byte[] x){
            byte aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de short unidimensional y lo devolvera en ese
        * estado
        */
        static short[] InvertArray(short[] x){
            short aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de enteros unidimensional y lo devolvera en ese
        * estado
        */
        static int[] InvertArray(int[] x){
            int aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de longs unidimensional y lo devolvera en ese
        * estado
        */
        static long[] InvertArray(long[] x){
            long aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de float unidimensional y lo devolvera en ese
        * estado
        */
        static float[] InvertArray(float[] x){
            float aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
        /**
        * 
        * @param x array a invertir
        * @return array invertido
        * Dara la vuelta a un array de double unidimensional y lo devolvera en ese
        * estado
        */
        static double[] InvertArray(double[] x){
            double aux;
            for(int i = 0;i<x.length;i++){
                aux=x[(x.length-i)];
                x[(x.length-i)]=x[i];
                x[i]=aux;
            }
            return x;
        }
}