
package capolavoro;

import java.util.Scanner;
public class CAPOLAVORO {

    
    public static void main(String[] args) {
        
        Scanner lettore = new Scanner(System.in);
        String continuare = null ;
        int goal = 0;
        int parate = 0;
        System.out.println("---------------------------------------------BENVENUTO SU RIGORE----------------------------------------------------------");
        while(!"no".equals(continuare)){
        goal = 0;
        parate = 0;
        do{
        System.out.println(" ");
        System.out.println("                       _____________________________________________________________                     __________________");
        System.out.println("                       |  ________________________________________________________  |                   |                  |");
        System.out.println("                       | |                                                        | |                   | ITALIA - FRANCIA |");
        System.out.println("                       | |                                                        | |                   |      FINAL       |");
        System.out.println("                       | |                                                        | |                   |      GOL =" + goal+"      |");
        System.out.println("                       | |                                                        | |                   |     PARATE="+parate+"     |                 ");
        System.out.println("                       | |                          ___                           | |");
        System.out.println("                       | |                         |___|                          | |");
        System.out.println("                       | |                    _______|_______                     | |");
        System.out.println("                       | |                           |                            | |");
        System.out.println("                       | |                           |                            | |");
        System.out.println("                       | |                        ___!___                         | |");
        System.out.println("                       | |                       |       |                        | |");
        System.out.println("_______________________| |_______________________|_______|________________________| |________________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                                   _____ ");
        System.out.println("                                                  |_|_|_| ");
        System.out.println("                                                  |_|_|_| ");
        System.out.println("                                                  |_|_|_| ");
        System.out.println(" ");
        System.out.println("_________________________________________________________________________________________________________________________________________ ");
        System.out.println(" ");
        System.out.println("                                             __________________");
        System.out.println("                                            | DOVE VUOI TIRARE |");
        System.out.println("                                            |    IL RIGORE?    |");
        System.out.println(" ");
        System.out.println("                        1 --> SINISTRA         2 --> CENTRALE          3 --> DESTRA                      ");
        System.out.println(" ");
        System.out.println("INSERISCI:  ");
        int risposta = lettore.nextInt();
        int portiere = (int)(Math.random()*3)+1;
  
        switch(risposta)
        {
            case 1:  if(risposta == portiere)
            {
              System.out.println("IL PORTIERE HA PARATO IL RIGORE!"); 
              parate++;
              break;
            }else
                System.out.println("BRAVO, HAI FATTO GOL!");
              goal++;
            break;
            case 2:  if(risposta == portiere)
            {
                System.out.println("IL PORTIERE HA PARATO IL RIGORE!"); 
                parate++;
                break;
            }else
                System.out.println("BRAVO, HAI FATTO GOL!");
              goal++;
             break;
            case 3: if(risposta == portiere)
            {
                System.out.println("IL PORTIERE HA PARATO IL RIGORE!"); 
                parate++;
                break;
            }else
                System.out.println("BRAVO, HAI FATTO GOL!");
              goal++;
                break;
            default:{ 
                System.out.println("TIRO NON POSSIBILE");
                break;
            }}
            
            }while(goal != 5 && parate != 5);
        
        
        if(goal>parate)
        {
          System.out.println(" ");
          System.out.println("-------------------------------------------HAI VINTO--------------------------------------------------");
          System.out.println(" ");
          System.out.println("-------------------HAI FATTO: " + goal + " GOAL");
          System.out.println(" ");
          System.out.println("-------------------IL PORTIERE HA FATTO: " + parate + " PARATE");
        }else
        {
          System.out.println("-------------------HAI PERSO--------------------"); 
          System.out.println(" ");
          System.out.println("---------------------HAI FATTO: " + goal + " GOAL");
          System.out.println(" ");
          System.out.println("-------------------IL PORTIERE HA FATTO: " + parate + " PARATE");
        }
        System.out.println(" ");
        System.out.println("------------------------------------VUOI CONTINUARE A GIOCARE?------------------------------------");
        System.out.println("---------------------------------------------SÌ | NO----------------------------------------------");
        System.out.println("INSERISCI: ");
        lettore.nextLine();
        continuare = lettore.nextLine().toLowerCase();
        }
       }
    }

 
         
   
    
    
    
   