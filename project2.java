import java.util.Scanner;
//import java.io*;
public class project2 {

 // Declaring ANSI_RESET so that we can reset the color
 public static final String ANSI_RESET = "\u001B[37m";
  
 // Declaring the color
 // Custom declaration
 public static final String ANSI_YELLOW = "\u001B[33m";
 public static final String ANSI_RED = "\u001B[31m";
 public static final String ANSI_BLUE = "\u001B[34m";
 public static final String ANSI_PURPLE = "\u001B[35m";
 public static final String ANSI_GREEN = "\u001B[32m";
 public static final String ANSI_WHITE= "\u001B[37m";




    public static void main(String args[]){
        int num[]=new int[100];

        for(int i=0;i<=99;i++)
        {
            num[i]=i+1;
        }

        for(int i=0;i<=9;i++)
        {
            System.out.print(num[i]+ "       ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=10;i<=19;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=20;i<=29;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=30;i<=39;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=40;i<=49;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=50;i<=59;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=60;i<=69;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=70;i<=79;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=80;i<=89;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        for(int i=90;i<=99;i++)
        {
            System.out.print(num[i]+ "      ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Enter r to roll dice");
        Start(0,0,true);

    }

    public static void Player1(int rand,boolean value,int p1current,int p2current)
    {     
        //int num[]= new int[100]; 
        Scanner sc= new Scanner(System.in);
        char resp = sc.next().charAt(0);
        if(resp=='r'){
            System.out.println(ANSI_RED+"Dice Rolls: "+rand+ANSI_RESET);
        if(value==true)
        {   
            //num[p1current+rand]=121;
            
            
            if((p1current==95-1 && rand==6)||(p1current==96-1 && rand>=5)||(p1current==97-1 && rand>=4)||(p1current==98-1 && rand>=3)||(p1current==99-1) && rand>=2){
                    
                    System.out.println(ANSI_PURPLE+"You need a better roll to move"+ANSI_RESET);
                    value=false;
                    display(p1current,p2current,value);
    
                }
            
            p1current=p1current+rand;
            //Conditions For Snake Bites
            if(p1current==31-1){
                p1current=14-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(31)+" TO "+(14)+ANSI_RESET);
            }
            if(p1current==41-1){
                p1current=20-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(41)+" TO "+(20)+ANSI_RESET);
            }
            if(p1current==58-1){
                p1current=37-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(58)+" TO "+(37)+ANSI_RESET);
            }
            if(p1current==67-1){
                p1current=49-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(67)+" TO "+(49)+ANSI_RESET);
            }
            if(p1current==84-1){
                p1current=62-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(84)+" TO "+(62)+ANSI_RESET);
            }
            if(p1current==92-1){
                p1current=76-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(92)+" TO "+(76)+ANSI_RESET);
            }
            if(p1current==99-1){
                p1current=4-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(99)+" TO "+(4)+ANSI_RESET);
            }
            if(p1current==95-1){
                p1current=87-1;
                System.out.println(ANSI_RED+"Player1 got snake bite at : "+(95)+" TO "+(87)+ANSI_RESET);
            }
            //Conditions For Ladders
            if(p1current==2-1){
                p1current=23-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(2)+" TO "+(23)+ANSI_RESET);
            }
            if(p1current==8-1){
                p1current=12-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(8)+" TO "+(12)+ANSI_RESET);
            }
            if(p1current==17-1){
                p1current=93-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(17)+" TO "+(93)+ANSI_RESET);
            }
            if(p1current==29-1){
                p1current=54-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(29)+" TO "+(54)+ANSI_RESET);
            }
            if(p1current==39-1){
                p1current=80-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(39)+" TO "+(80)+ANSI_RESET);
            }
            if(p1current==32-1){
                p1current=51-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(32)+" TO "+(51)+ANSI_RESET);
            }
            if(p1current==70-1){
                p1current=89-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(70)+" TO "+(89)+ANSI_RESET);
            }
            if(p1current==75-1){
                p1current=96-1;
                System.out.println(ANSI_GREEN+"Player1 got LADDER at : "+(75)+" TO "+(96)+ANSI_RESET);
            }




            //Condition For Win
            if(p1current==100-1)
            {
                System.out.println(ANSI_GREEN+"Player1 won!!!"+ANSI_RESET);
                System.exit(0);

            }
            value=false;
            display(p1current,p2current,value);

        }
        else{
            value=false;
            Player2(rand,value,p1current,p2current);
        }
    }
    }

    public static void Player2(int rand,boolean value,int p1current,int p2current)
    {    
         Scanner p2in=new Scanner(System.in);
         char resp = p2in.next().charAt(0);
         if(resp=='r'){
            System.out.println(ANSI_RED+"Dice Rolls: "+rand+ANSI_RESET);


         if(value==false)
         {    
            
             //num[p1current+rand]=121;
            
            
            if((p2current==95-1 && rand==6)||(p2current==96-1 && rand>=5)||(p2current==97-1 && rand>=4)||(p2current==98-1 && rand>=3)||(p2current==99-1 && rand>=2)){
                   
                    System.out.println(ANSI_RED+"You need a better roll to move"+ANSI_RESET);
                    value=true;
                    display(p1current,p2current,value);    
                
            }
            p2current=p2current+rand;
             //Conditions For Snake Bites
             if(p2current==31-1){
                p2current=14-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(31)+" TO "+(14)+ANSI_RESET);
            }
            if(p2current==41-1){
                p2current=20-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(41)+" TO "+(20)+ANSI_RESET);
            }
            if(p2current==58-1){
                p2current=37-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(58)+" TO "+(37)+ANSI_RESET);
            }
            if(p2current==67-1){
                p2current=49-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(67)+" TO "+(49)+ANSI_RESET);
            }
            if(p2current==84-1){
                p2current=62-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(84)+" TO "+(62)+ANSI_RESET);
            }
            if(p2current==92-1){
                p2current=76-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(92)+" TO "+(76)+ANSI_RESET);
            }
            if(p2current==99-1){
                p2current=4-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(99)+" TO "+(4)+ANSI_RESET);
            }
            if(p2current==95-1){
                p2current=87-1;
                System.out.println(ANSI_RED+"Player2 got snake bite at : "+(95)+" TO "+(87)+ANSI_RESET);
            }
            //Conditions For Ladders
            if(p2current==2-1){
                p2current=23-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(2)+" TO "+(23)+ANSI_RESET);
            }
            if(p2current==8-1){
                p2current=12-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(8)+" TO "+(12)+ANSI_RESET);
            }
            if(p2current==17-1){
                p2current=93-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(17)+" TO "+(93)+ANSI_RESET);
            }
            if(p2current==29-1){
                p2current=54-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(29)+" TO "+(54)+ANSI_RESET);
            }
            if(p2current==39-1){
                p2current=80-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(39)+" TO "+(80)+ANSI_RESET);
            }
            if(p2current==32-1){
                p2current=51-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(32)+" TO "+(51)+ANSI_RESET);
            }
            if(p2current==70-1){
                p2current=89-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(70)+" TO "+(89)+ANSI_RESET);
            }
            if(p2current==75-1){
                p2current=96-1;
                System.out.println(ANSI_GREEN+"Player2 got LADDER at : "+(75)+" TO "+(96)+ANSI_RESET);
            }
            //Condition for Win
            if(p2current==100-1)
            {
                System.out.println(ANSI_GREEN+"Player2 Won!!!"+ANSI_RESET);
                    System.exit(0);

            }
            value=true;
            display(p1current,p2current,value);
         }
         else{
            value=true;
            Player1(rand,value,p1current,p2current);
         }
        }


    }
    public static void Start(int p1current,int p2current,boolean value)
    {   
        int min = 1;  
        int max = 6;  
        int rand = (int)(Math.random()*(max-min+1)+min);
        
        if(value==true){
        System.out.println(ANSI_BLUE+"Player1 Roll the Dice :"+ANSI_RESET);
        Player1(rand,value,p1current,p2current);
        }
        else{
            System.out.println(ANSI_PURPLE+"Player2 Roll the Dice :"+ANSI_RESET);
            Player2(rand,value,p1current,p2current);
        }


    }

    public static void display(int p1current,int p2current ,boolean value)
    {  
        //System.out.println(p1current);
       
       int num[]=new int[100];
       for(int i=0;i<=99;i++)
        {
            num[i]=i+1;
        }
       
       

       num[p1current]=121;
       System.out.println(ANSI_BLUE+"Player1 is at Position : "+(p1current+1)+ANSI_RESET);
        
       num[p2current]=111;
       System.out.println(ANSI_PURPLE+"Player2 is at Position : "+(p2current+1)+ANSI_RESET);




       for(int i=0;i<=9;i++)
       {    
           if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "       "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "       "+ANSI_RESET);
            continue;
           }

           if(i==p1current){
             System.out.print(ANSI_BLUE+num[i]+"       "+ANSI_RESET);
           }
           else if(i==p2current){
             System.out.print(ANSI_PURPLE+num[i]+ "       "+ANSI_RESET);
           }
        else{
           System.out.print(ANSI_WHITE+num[i]+ "       "+ANSI_RESET);
        }
       }
       System.out.println("");
       System.out.println("");
       for(int i=10;i<=19;i++)
       { 

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=20;i<=29;i++)
       {

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=30;i<=39;i++)
       {
        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=40;i<=49;i++)
       {
        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=50;i<=59;i++)
       {

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=60;i<=69;i++)
       {
        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }

        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=70;i<=79;i++)
       {

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }
        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=80;i<=89;i++)
       {

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }
        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       for(int i=90;i<=99;i++)
       {

        if(i==31-1||i==41-1||i==58-1||i==67-1||i==84-1||i==92-1||i==99-1||i==95-1){
            System.out.print(ANSI_RED+num[i]+ "      "+ANSI_RESET);
            continue;
           }
           if(i==2-1||i==8-1||i==17-1||i==29-1||i==39-1||i==32-1||i==70-1||i==75-1){
            System.out.print(ANSI_YELLOW+num[i]+ "      "+ANSI_RESET);
            continue;
           }
        if(i==p1current){
            System.out.print(ANSI_BLUE+num[i]+"      "+ANSI_RESET);
          }
          else if(i==p2current){
           System.out.print(ANSI_PURPLE+num[i]+ "      "+ANSI_RESET);
          }
       else{
          System.out.print(ANSI_WHITE+num[i]+ "      "+ANSI_RESET);
       }
       }
       System.out.println("");
       System.out.println("");
       
       Start(p1current, p2current,value);

    }



}


