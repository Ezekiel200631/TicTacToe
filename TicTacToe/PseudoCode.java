initialize program state data

if gameState == STANDBY
  set gameState = GET_X_NAME

else if gameState == GET_X_NAME
  get player X name
  set gameState = GET_O_NAME

else if gameState == GET_O_NAME
  get player O name
  set gameState = GET_X_MOVE

else if gameState == GET_X_MOVE
  do
    get player X's row and column to move
  while player's inputs and player's move are NOT valid
  set gameState = MAKE_MOVE

else if gameState == GET_O_MOVE
  do
    get player O's row and column to move
  while player's inputs and player's move are NOT valid
  set gameState = MAKE_MOVE

else if gameState == MAKE_MOVE
  print player's move
  add player's move to the board
  set gameState = CHECK_IF_WINNER

else if gameState == CHECK_IF_WINNER
  if x is a winner
    set gameState = X_WINS
  else if o is a winner
    set gameState = O_WINS
  else 
    set gameState = CHECK_IF_TIE

else if gameState == CHECK_IF_TIE
  if game is tied
    print game tied message
    set gameState = GAME_OVER
  else
    if it is X's turn
      set gameState = GET_O_MOVE
    else
      set gameState = GET_X_MOVE

else if gameState == X_WINS
  print x wins message
  set gameState = GAME_OVER

else if gameState == O_WINS
  print o wins message
  set gameState = GAME_OVER

else if gameState == GAME_OVER
  get if players want to play again
  if YES
    set gameState = STANDBY
  else 
    QUIT PROGRAM

