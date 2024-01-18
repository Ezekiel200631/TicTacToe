Prompt the user for their name
Method name: getUserName()
String: GET_PLAYER_NAME
Parameter: whoseMove
Return a String equal to the name the user entered
Placeholder 1:  a String that is either "X" or "O" to fill in the %s placeholder in the printf() method.

Prompt the user for the row of their next move
Method name: getMoveRow()
String: GET_MOVE_ROW
Parameter 1: whoseMove
Parameter 2: player name
Return one integer which must be 1, 2, or 3
Placeholder 1: a String with an "X" or "O" 
Placeholder 2: a String containing the players name

Prompt the user for the column of their next move
Method name: getMoveCol()
String: GET_MOVE_COL
Return one integer which must be 1, 2, or 3
Placeholder 1: a String with an "X" or "O" 
Placeholder 2: a String containing the players name

Prompt for starting a new game
Method name: startNewGame()
String: START_NEW_GAME

Printing text
Print the "Thanks" string
Method name: printWelcome()
String: TITLE

Print the current board from the board state variable
Method name: printBoard()
Strings: DIVIDER_STRING and BOARD_STRING
Parameter 1: state.board
Placeholder 1: first board position X or O (for BOARD_STRING only)
Placeholder 2: second board position X or O (for BOARD_STRING only)
Placeholder 3: third board position X or O (for BOARD_STRING only)

Print an error message if the users input is invalid
Method name: printInvalidRowOrColumn()
String: INVALID_ROW_OR_COLUMN
Placeholder 1: row or column that is being moved to

Print an error message if the space to move to is invalid
Method name: printInvalidMove()
String INVALID_MOVE_ERROR
Placeholder 1: row being moved to
Placeholder 2: column being moved to

Print the players move
Method name: printMove()
String PLAYER_MOVE
Parameter 1: state
Parameter 2: row
Parameter 3: col
Placeholder 1: "X" or "O"
Placeholder 2: Player name
Placeholder 3: row
Placeholder 4: col

Print a winning message
Method name: printWinner()
String: WINNER
Placeholder 1: "X" or "O"
Placeholder 2: The players name

Print a tie game message
Method name: printTieGame()
String: TIE_GAME

Utility methods
Returns an X or an O depending on whose turn it is
Method name: getXOrO()
Parameter: whoseMove

Returns the name of the player whose turn it is
Method name: getPlayerName()
Parameter: whoseMove

Check if [row,col] represents a legal move
Method name: isLegalMove()
Parameter 1: state.board
Parameter 2: row to move to
Parameter 3: column to move to
Returns true if the move is legal, false otherwise
