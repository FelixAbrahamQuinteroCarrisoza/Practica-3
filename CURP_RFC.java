import java.util.Scanner;
import java.util.Random;

public class CURP_RFC {
    public static void main(String[] args) {

    //objetos     
    Persona CURP = new Persona();
    Persona RFC = new Persona();
    Persona RFC_CURP = new Persona();
    
    CapturasEntra captura = new CapturasEntra();
    Scanner Teclado= new Scanner(System.in);
    int opcion=0;
    
    //inicializacion para las variables de la funcion
    String nombres="";
    String paterno="";
    String materno="";
    int ano=0;
    int mes=0;
    int dia=0;
    String sexo="";
    String estado="";
    String PateVoc="";
            
    do{
        System.out.println("\n-------ELIJA LO QUE SE QUIERA GENERAR------\n"); 
        System.out.println("\n1--Generar CURP: "); 
        System.out.println("2--Generar RFC: ");
        System.out.println("3--Generar CURP y RFC: ");
        System.out.println("4--Salir: ");

        
        System.out.println("\n Introduce el numero del menu:");
        opcion=Teclado.nextInt();
        System.out.println("\n ");
        
        //generar numeros y letras random
        int numero= (int)(Math.random()*10); 
        int numero1= (int)(Math.random()*10); 
        char c= (char) ('A' + Math.random() * ('Z'-'A' + 1)); 
        char cc=(char) ('A' + Math.random() * ('Z'-'A' + 1));
        char ccc=(char) ('A' + Math.random() * ('Z'-'A' + 1));
        char cccc=(char) ('A' + Math.random() * ('Z'-'A' + 1));
        
        if(opcion==1){
        
        //funcion para capturar datos de la CURP    
        captura.captura_CURP( CURP,nombres, paterno, materno, ano, mes, dia, sexo, estado );
        
        //remplazar las vocales con un null , para que se eliminen de la cadena
        String Pconst = (CURP.getPaterno()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
        String Mconst = (CURP.getMaterno()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
        String Nconst = (CURP.getNombres()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
    
        System.out.println("\nCURP: ");    
        System.out.println((CURP.getPaterno()).charAt(0)+""
        +CURP.getPaternoVoca()+""
        +(CURP.getMaterno()).charAt(0)+""
        +(CURP.getNombres()).charAt(0)+""
        +String.valueOf(CURP.getAno()).substring(2)+""
        +((CURP.getMes()<10)? "0"+(CURP.getMes()):(CURP.getMes()))+""
        +((CURP.getDia()<10)? "0"+(CURP.getDia()):(CURP.getDia()))+""
        +CURP.getSexo()+""
        +CURP.getEstado()+""
        +(((Pconst.charAt(0))==(CURP.getPaterno()).charAt(0))?Pconst.charAt(1) :Pconst.charAt(0))+""
        +(((Mconst.charAt(0))==(CURP.getMaterno()).charAt(0))?Mconst.charAt(1) :Mconst.charAt(0))+""
        +(((Nconst.charAt(0))==(CURP.getNombres()).charAt(0))?Nconst.charAt(1) :Nconst.charAt(0))+""
        +c+""
        +numero);
         }
         else if(opcion==2){

        captura.captura_RFC( RFC,nombres, paterno, materno, ano, mes, dia );
        
        System.out.println("\nRFC: ");    
        System.out.println((RFC.getPaterno()).charAt(0)+""
        +(RFC.getPaterno()).charAt(1)+""
        +(RFC.getMaterno()).charAt(0)+""
        +(RFC.getNombres()).charAt(0)+""
        +String.valueOf(RFC.getAno()).substring(2)+""
        +((RFC.getMes()<10)? "0"+(RFC.getMes()):(RFC.getMes()))+""
        +((RFC.getDia()<10)? "0"+(RFC.getDia()):(RFC.getDia()))+""
        +c+""+cc+""+numero );
         }
         else if (opcion==3){
        
        captura.captura_RFC_CURP( RFC_CURP,nombres, paterno, materno, ano, mes, dia, sexo, estado ); 

        String Pconst = (RFC_CURP.getPaterno()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
        String Mconst = (RFC_CURP.getMaterno()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
        String Nconst = (RFC_CURP.getNombres()).replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");    
           
        System.out.println("\nRFC y CURP: ");    
        System.out.println((RFC_CURP.getPaterno()).charAt(0)+""
        +(RFC_CURP.getPaterno()).charAt(1)+""
        +(RFC_CURP.getMaterno()).charAt(0)+""
        +(RFC_CURP.getNombres()).charAt(0)+""
        +String.valueOf(RFC_CURP.getAno()).substring(2)+""
        +((RFC_CURP.getMes()<10)? "0"+(RFC_CURP.getMes()):(RFC_CURP.getMes()))+""
        +((RFC_CURP.getDia()<10)? "0"+(RFC_CURP.getDia()):(RFC_CURP.getDia()))+""
        +c+""+cc+""+numero+ "\n" 
        +(RFC_CURP.getPaterno()).charAt(0)+""
        +RFC_CURP.getPaternoVoca()+""
        +(RFC_CURP.getMaterno()).charAt(0)+""
        +(RFC_CURP.getNombres()).charAt(0)+""
        +String.valueOf(RFC_CURP.getAno()).substring(2)+""
        +((RFC_CURP.getMes()<10)? "0"+(RFC_CURP.getMes()):(RFC_CURP.getMes()))+""
        +((RFC_CURP.getDia()<10)? "0"+(RFC_CURP.getDia()):(RFC_CURP.getDia()))+""
        +RFC_CURP.getSexo()+""
        +RFC_CURP.getEstado()+""
        +(((Pconst.charAt(0))==(RFC_CURP.getPaterno()).charAt(0))?Pconst.charAt(1) :Pconst.charAt(0))+""
        +(((Mconst.charAt(0))==(RFC_CURP.getMaterno()).charAt(0))?Mconst.charAt(1) :Mconst.charAt(0))+""
        +(((Nconst.charAt(0))==(RFC_CURP.getNombres()).charAt(0))?Nconst.charAt(1) :Nconst.charAt(0))+""
        +ccc+""+cccc+""+numero1);

         }
         
    }while(opcion<4);

      
      if(opcion>4){
        System.out.println("------ERROR= colocar un numero del rango que se indica en el menu-----");
      }
      else if (opcion==4){
        System.out.println("-----Usted ha salido del programa------ ");
      }
     


    }
}

class CapturasEntra{

    public static void  captura_CURP( Persona CURP,String nombres, String paterno, String materno, int ano, int mes,int dia, String sexo, String estado )
    {
        System.out.println("\n---------------INGRESA TUS DATOS------------");

            System.out.println("\nIngresa tus nombres: ");  
            Scanner inNombres = new Scanner(System.in);
            CURP.setNombres(inNombres.next());
    
            System.out.println("\nIngresa tu apellido paterno: ");  
            Scanner inPaterno = new Scanner(System.in);
            CURP.setPaterno(inPaterno.next());
    
            System.out.println("\nIngresa tu apellido materno: ");  
            Scanner inMaterno = new Scanner(System.in);
            CURP.setMaterno(inMaterno.next());
    
            System.out.println("\nIngresa tu ano de nacimiento: ");  
            Scanner inAno = new Scanner(System.in);
            CURP.setAno(inAno.nextInt());
    
            System.out.println("\nIngresa tu mes de nacimiento: ");  
            Scanner inMes = new Scanner(System.in);
            CURP.setMes(inMes.nextInt());
    
            System.out.println("\nIngresa tu dia de nacimiento: ");  
            Scanner inDia = new Scanner(System.in);
            CURP.setDia(inDia.nextInt());
    
            System.out.println("\nIngresa tu genero (M/H): ");  
            Scanner inSexo = new Scanner(System.in);
            CURP.setSexo(inSexo.next());
    
            System.out.println("\nIngresa tu estado de nacimiento(EN MAYUSCULAS) ejem:BAJA_CALIFORNIA: ");  
            Scanner inEstado = new Scanner(System.in);
            CURP.setEstado(inEstado.next());
        
        
    }

    public static void  captura_RFC( Persona RFC,String nombres, String paterno, String materno, int ano, int mes,int dia )
    {       
            System.out.println("\n---------------INGRESA TUS DATOS------------");

            System.out.println("\nIngresa tus nombres: ");  
            Scanner inNombres = new Scanner(System.in);
            RFC.setNombres(inNombres.next());
    
            System.out.println("\nIngresa tu apellido paterno: ");  
            Scanner inPaterno = new Scanner(System.in);
            RFC.setPaterno(inPaterno.next());
    
            System.out.println("\nIngresa tu apellido materno: ");  
            Scanner inMaterno = new Scanner(System.in);
            RFC.setMaterno(inMaterno.next());
    
            System.out.println("\nIngresa tu ano de nacimiento: ");  
            Scanner inAno = new Scanner(System.in);
            RFC.setAno(inAno.nextInt());
    
            System.out.println("\nIngresa tu mes de nacimiento: ");  
            Scanner inMes = new Scanner(System.in);
            RFC.setMes(inMes.nextInt());
    
            System.out.println("\nIngresa tu dia de nacimiento: ");  
            Scanner inDia = new Scanner(System.in);
            RFC.setDia(inDia.nextInt());
    
    }
    public static void  captura_RFC_CURP( Persona RFC_CURP,String nombres, String paterno, String materno, int ano, int mes,int dia, String sexo, String estado )
    {   
        System.out.println("\n---------------INGRESA TUS DATOS------------");

        System.out.println("\nIngresa tus nombres: ");  
        Scanner inNombres = new Scanner(System.in);
        RFC_CURP.setNombres(inNombres.next());

        System.out.println("\nIngresa tu apellido paterno: ");  
        Scanner inPaterno = new Scanner(System.in);
        RFC_CURP.setPaterno(inPaterno.next());

        System.out.println("\nIngresa tu apellido materno: ");  
        Scanner inMaterno = new Scanner(System.in);
        RFC_CURP.setMaterno(inMaterno.next());

        System.out.println("\nIngresa tu ano de nacimiento: ");  
        Scanner inAno = new Scanner(System.in);
        RFC_CURP.setAno(inAno.nextInt());

        System.out.println("\nIngresa tu mes de nacimiento: ");  
        Scanner inMes = new Scanner(System.in);
        RFC_CURP.setMes(inMes.nextInt());

        System.out.println("\nIngresa tu dia de nacimiento: ");  
        Scanner inDia = new Scanner(System.in);
        RFC_CURP.setDia(inDia.nextInt());

        System.out.println("\nIngresa tu genero (M/H): ");  
        Scanner inSexo = new Scanner(System.in);
        RFC_CURP.setSexo(inSexo.next());

        System.out.println("\nIngresa tu estado de nacimiento(EN MAYUSCULAS) ejem:BAJA_CALIFORNIA: ");  
        Scanner inEstado = new Scanner(System.in);
        RFC_CURP.setEstado(inEstado.next());   

    }


         
}

