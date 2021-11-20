
package m3rd.pkg3arabyat;

import java.util.Scanner;

class M3rd3arabyat {

    
    public static void main(String[] args) {
      cars c =new cars ();
      c.setNome("mercedes");
      c.setModelo(2003);
      c.setColore("rosso");
      c.setPrezzo(250000);
      
      cars c2 =new cars ();
      c2.setNome("fiat(fabbrica italiana a torino)");
      c2.setModelo(2017);
      c2.setColore("nero");
      c2.setPrezzo(69999);
      
         cars c3 =new cars ();
      c3.setNome("ferrari");
      c3.setModelo(2021);
      c3.setColore("verde");
      c3.setPrezzo(1000000);
      
         bank b= new bank();
      b.setSoldi(500000);
      b.setPassword(1234);
      
      
      Scanner sc =new Scanner (System.in);
        System.out.println( " 1. ") ;
      c.stampa() ;
      
      System.out.println( "------------------------------------------------------------------------------------------------------------")  ; 
      System.out.println( " 2. ") ;
      c2.stampa();
            System.out.println( "------------------------------------------------------------------------------------------------------------")  ; 
      System.out.println( " 3. ") ;
      c3.stampa();
      System.out.println( "------------------------------------------------------------------------------------------------------------")  ; 
      System.out.println( " 4. se non vuoi comprare qualcosa")  ; 
           System.out.println( " inserisce il numero ")  ; 
      int x=sc.nextInt();
         
  int w=0;      
      if(x==1||x==2||x==3){
      
      System.out.println( "ha prenotato  "+ x) ;
      
      System.out.println( "inserisce il pass della visa card ") ;
      int pas=sc.nextInt();
 
      if (pas!=b.getPassword()){
      while (pas!=b.getPassword()){
      System.out.println( "il password è sbagliato ") ;
      System.out.println( "rinserisce il pass") ;
       pas=sc.nextInt();
       
       w++;
       if(w==4){
       
       System.out.println( "login failed") ;
       
       break;
       }       
       }
      }
       else {
      System.out.println( "enterd successfully") ;
      
      if(x==1){
          
        int resto = b.getSoldi()-c.getPrezzo();
       
        if(resto>=0){
        System.out.println("il processo è compiuto") ;
        
        
        }
        else {
        
          System.out.println("il processo non è compiuto perche il credito non e' sufficente") ;
        
        
      
        }
        
          
      }
      else if(x==2){
            int resto = b.getSoldi()-c2.getPrezzo();
        
        if(resto>=0){
        System.out.println("il processo è compiuto") ;
        
        
        }
        else {
        
          System.out.println("il processo non è compiuto perche il credito non e' sufficente") ;
        

        }
        

      }
      else if (x==3) {
      
      
                  int resto = b.getSoldi()-c3.getPrezzo();
        
        if(resto>=0){
        System.out.println("il processo è compiuto") ;
        
        
        }
        else {
        
          System.out.println("il processo non è compiuto perche il credito non e' sufficente") ;

      
        }
        
 
      }
     
      }
      
      
      }
      
      
      
     
      else {
      
System.out.println( "grazie per il tuo tempo") ;
      
      
      
      }

 
      
    }
    
}
