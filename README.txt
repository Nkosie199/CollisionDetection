Good Day!

In order to test for efficient pixel-perfect collisions, my implementation features 2 controllable players. Player 1 (20x20 green block) is controllable with the directional keys and Player 2 (30x30 blue circle) is controllable with the keys W,A,S,D. It also features a Boss (50x50 red circle).


1) Pixel-perfect Collision Detection (for accuracy):

In my implementaion of pixel-perfect collision detection, I introduced the element of transparency. This means that I introduced new player shapes (such as circles) to the experiment and only considered collision when the respective shape's non-transparent pixels were overlapping.

This was done according to the following algorithm:

FOR i = 0 TO numberOfElements-1 
      FOR j = 0 TO numberOfElements-1 
            collision[i][j] = FALSE 
#BOUNDING-BOX TEST !!!
                  IF overlap (element[i], element[j]) THEN 
                        FOR overlap region in x and y 
                              bit shift to align mask[i] 
                              bit shift to align mask[j]   
#PIXEL-LEVEL TEST !!!                     
                              IF((shiftmask[i][x][y] & shiftmask[j][x][y]) != 0) 
                                    collision[i][j] = TRUE



2) Improving the Bounding-Box Test (for efficiency)

The efficiency of the bounding-box test can be improved by reducing the number of checks for collision the algorithm has to make. Eg. The number/ length of the for loops. When experimenting which shapes such as circles, it is easier to check for collision using the sum of the distance between their centres.

