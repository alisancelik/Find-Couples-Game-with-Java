
import java.util.Scanner;


public class Main {
        private static Card[][] cards = new Card[4][4];
    // cok boyutlu bir array olusturuldu
        
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');
           while(gameover()==false){
           
               gamesurface();
               guessit();
           
           }
    }
    public static void guessit(){
    Scanner scanner =new Scanner(System.in);
   // Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci tahmen birer bosluk kullanarak giriniz");
        
        int i1=scanner.nextInt();
        int j1=scanner.nextInt();
   
        
        cards[i1][j1].setTahmin(true);
        gamesurface();
        
         System.out.print("Ikinci tahmen birer bosluk kullanarak giriniz");
        
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
        
        if(cards[i1][j1].getDeger()==cards[i2][j2].getDeger()){
        cards[i2][j2].setTahmin(true);
            System.out.println("tahmininiz dogrudur");
        }
        
        else{
        cards[i2][j2].setTahmin(false);
            System.out.println("tahmininiz dogru degildir");
        
        }
        
    
    }
    
    public static boolean gameover(){
    
        for(int i=0;i<4;i++){
            for(int j=0;i<4;j++){
            if(cards[i][j].isTahmin()==false){
                return false;

            }
            else{
            
            
            
         }           
       }
     }
        
        return true;
    }

    
    
    public static void gamesurface(){
    
    for(int i=0;i<4;i++){
        for (int j=0;j<4;j++){
               if(cards[i][j].isTahmin()){
                
                   System.out.print(" |" + cards[i][j].getDeger() + "| ");

               }
        
               else{
               
                   System.out.print(" | | ");
               
               }
               
        }
                    System.out.println("");
    }
  }

}
    
    
    
    
    

