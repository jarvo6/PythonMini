# Function to enter numbers on conditions
def func1(P1, P2, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l, row1, row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3):
    # z,b,c,d,e,f,g,h,i,j,k,l
   # print("Function 1 working")
    # for x in P1:
    # print(x)

    if (bool == True):

        if (True):
            print("Player1 and Player2 Enter alternatly Numbers")
            print("Enter Number")
            num = input()  # Taking input from Players As number

# Calling function2 and passing player1 and player2 grid,Entered number,checking values to check win
        func2(P1, P2, num, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l,
              row1, row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3)

    else:
        if (check1 <= 6):  # IF checking value Equals 5
            print("BINGO! Player 1 WON")

        else:
            print("Bingo Player 2 WON")


# Function to check condition for win
def func2(P1, P2, num, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l, row1, row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3):
    # print("Function 2 working")
   # for x in P1:
    #   print(x)

    # Matching the each number with player1 grid with entered number
    for x in range(0, 9, 1):
        if (P1[x] == num):
            # If number match with grid number , reassining the grid number with number zero
            P1[x] = 0
            # check1=check1+1  #Incrementing the checking value

    # FOR PLAYER_1
   # print(P1[0],P1[1],P1[2],type(P1[0]),type(P1[1]),type(P1[2]))

    row1 = int(P1[0])+int(P1[1])+int(P1[2])
    if row1 == 0:
        z = 1

    row2 = int(P1[3])+int(P1[4])+int(P1[5])
    if row2 == 0:
        b = 1

    row3 = int(P1[6])+int(P1[7])+int(P1[8])
    if row3 == 0:
        c = 1

    col1 = int(P1[0])+int(P1[3])+int(P1[6])
    if col1 == 0:
        d = 1

    col2 = int(P1[1])+int(P1[4])+int(P1[7])
    if col2 == 0:
        e = 1

    col3 = int(P1[2])+int(P1[5])+int(P1[8])
    if col3 == 0:
        f = 1

     # Matching the each number with player2 grid with entered number
    for x in range(0, 9, 1):
        if (P2[x] == num):
            P2[x] = 0
           # check2=check2+1

     # FOR PLAYER_2
    rang1 = int(P2[0])+int(P2[1])+int(P2[2])
    if rang1 == 0:
        g = 1

    rang2 = int(P2[3])+int(P2[4])+int(P2[5])
    if rang2 == 0:
        h = 1

    rang3 = int(P2[6])+int(P2[7])+int(P2[8])
    if rang3 == 0:
        i = 1

    vert1 = int(P2[0])+int(P2[3])+int(P2[6])
    if vert1 == 0:
        j = 1

    vert2 = int(P2[1])+int(P2[4])+int(P2[7])
    if vert2 == 0:
        k = 1

    vert3 = int(P2[2])+int(P2[5])+int(P2[8])
    if vert3 == 0:
        l = 1

     # CONDITIONS FOR WIN
    check1 = z+b+c+d+e+f
   # print("check1=",check1)
   # check2=g+h+i+j+k+l
    print("check2=", check2)

    # Making a new logic from checking conditions of two players for further logic
    if (check1 < 6 and check2 < 6):
        bool = True
    else:
        bool = False
    # Passing the Player1&2 upgraded grid and checking conditions to function3
    func3(P1, P2, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l, row1,
          row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3)


# reciving upaded grid and checking conditions
def func3(P1, P2, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l, row1, row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3):
    # print("Function 3 working")
    # for x in P1:
    # print(x)

    # P1[0]=0
    # P1[1]=0

    # Passing the updated grids ,checking conditions and boolean conditions to function1
    func1(P1, P2, bool, check1, check2, z, b, c, d, e, f, g, h, i, j, k, l, row1,
          row2, row3, col1, col2, col3, rang1, rang2, rang3, vert1, vert2, vert3)


# Player1 Intialized 3x3  grid of game
Play1 = [0, 0, 0, 0, 0, 0, 0, 0, 0]
# Player2 Initialized 3x3 grid of game
Play2 = [0, 0, 0, 0, 0, 0, 0, 0, 0]


# TAKING INPUT FROM PLAYER_1
print("Player_1 enter your numbers")

print("Enter numbers of first row")
for num in range(0, 3, 1):
    Play1[num] = input()


print("Enter numbers of second row")
for num in range(3, 6, 1):
    Play1[num] = input()

print("Enter numbers of third row")
for num in range(6, 9, 1):
    Play1[num] = input()

# DISPLAYING PLAYER_1 3x3 GRID
print("Player1 Grid Box is")
print("---------------")
print('|', Play1[0], '', '|', Play1[1], '|', '', Play1[2], '|')
print("---------------")
print('|', Play1[3], '', '|', Play1[4], '|', '', Play1[5], '|')
print("---------------")
print('|', Play1[6], '', '|', Play1[7], '|', '', Play1[8], '|')
print("---------------")


# TAKING INPUT FROM PLAYER_2
print("Player_2 enter your numbers")

print("Enter numbers of first row")
for num in range(0, 3, 1):
    Play2[num] = input()


print("Enter numbers of second row")
for num in range(3, 6, 1):
    Play2[num] = input()

print("Enter numbers of third row")
for num in range(6, 9, 1):
    Play2[num] = input()


# DISPLAYING PLAYER_2 3x3 GRID
print("Player2 Grid Box is")
print("---------------")
print('|', Play2[0], '', '|', Play2[1], '|', '', Play2[2], '|')
print("---------------")
print('|', Play2[3], '', '|', Play2[4], '|', '', Play2[5], '|')
print("---------------")
print('|', Play2[6], '', '|', Play2[7], '|', '', Play2[8], '|')
print("---------------")

# calling function1 and passing player1&2 grid with boolean condition and passing default checking conditions
func1(Play1, Play2, True, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
