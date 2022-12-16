#Function to enter numbers on conditions 
def func1(P1,P2,bool,check1,check2):
   # print("Function 1 working")
    #for x in P1:
        #print(x)

    if(bool==True):

       if(True):
         print("Player1 and Player2 Enter alternatly Numbers")
         print("Enter Number")
         num=input() #Taking input from Players As number

#Calling function2 and passing player1 and player2 grid,Entered number,checking values to check win
       func2(P1,P2,num,bool,check1,check2) 

    else:
        if(check1==9): # IF checking value Equals 9 
            print("BINGO! Player 1 WON")
            
        else:
            print("Bingo Player 2 WON")  


#Function to check condition for win
def func2(P1,P2,num,bool,check1,check2):
    #print("Function 2 working")
   # for x in P1:
     #   print(x)

    #Matching the each number with player1 grid with entered number
    for x in range(0,9,1):
        if(P1[x]==num):
            P1[x]=0   #If number match with grid number , reassining the grid number with number zero
            check1=check1+1  #Incrementing the checking value 

     #Matching the each number with player2 grid with entered number
    for x in range(0,9,1):
        if(P2[x]==num):
            P2[x]=0
            check2=check2+1

    #Making a new logic from checking conditions of two players for further logic        
    if(check1!=9 and check2!=9):
        bool=True
    else:
        bool=False   
    #Passing the Player1&2 upgraded grid and checking conditions to function3    
    func3(P1,P2,bool,check1,check2) 
       

def func3(P1,P2,bool,check1,check2): #reciving upaded grid and checking conditions
    #print("Function 3 working")
    #for x in P1:
       # print(x)

    #P1[0]=0
    #P1[1]=0
     
    # Passing the updated grids ,checking conditions and boolean conditions to function1 
    func1(P1,P2,bool,check1,check2) 


#Player1 Intialized 3x3  grid of game
Play1 = [0,0,0,0,0,0,0,0,0]
#Player2 Initialized 3x3 grid of game
Play2 = [0,0,0,0,0,0,0,0,0]


# TAKING INPUT FROM PLAYER_1
print("Player_1 enter your numbers")

print("Enter numbers of first row")
for num in range(0,3,1):
    Play1[num] = input()


print("Enter numbers of second row")
for num in range(3,6,1):
    Play1[num] = input()

print("Enter numbers of third row")
for num in range(6,9,1):
    Play1[num] = input()    

#DISPLAYING PLAYER_1 3x3 GRID
print("Player1 Grid Box is")
print("---------------")
print('|',Play1[0],'','|',Play1[1],'|','',Play1[2],'|')
print("---------------")
print('|',Play1[3],'','|',Play1[4],'|','',Play1[5],'|')
print("---------------")
print('|',Play1[6],'','|',Play1[7],'|','',Play1[8],'|')
print("---------------")


# TAKING INPUT FROM PLAYER_2
print("Player_2 enter your numbers")

print("Enter numbers of first row")
for num in range(0,3,1):
    Play2[num] = input()


print("Enter numbers of second row")
for num in range(3,6,1):
    Play2[num] = input()

print("Enter numbers of third row")
for num in range(6,9,1):
    Play2[num] = input()


#DISPLAYING PLAYER_2 3x3 GRID
print("Player2 Grid Box is")
print("---------------")
print('|',Play2[0],'','|',Play2[1],'|','',Play2[2],'|')
print("---------------")
print('|',Play2[3],'','|',Play2[4],'|','',Play2[5],'|')
print("---------------")
print('|',Play2[6],'','|',Play2[7],'|','',Play2[8],'|')
print("---------------")

#calling function1 and passing player1&2 grid with boolean condition and passing default checking conditions
func1(Play1,Play2,True,0,0)