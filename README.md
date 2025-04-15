# Game of Life

## Purpose
practice:  
1. Creating Multidimensional Arrays 
2. Manipulating Multidimensional Arrays
3. Creating their own classes

## Problem
Conway's Game of Life is a famous example of a zero-player game in which the initial state of the board determines how
the rest of the game plays out. If you have never tried it before, play it [here](https://playgameoflife.com/). Your
task today is to create a text based version of this.

## Requirements
 The game is played on a grid of cells.
The size of the grid is chosen by the user and the user selects which cells begin "alive." From that point on, the game
moves in rounds. The rules for a cell on any subsequent round are:
1. Any cell touching exactly 3 live cells is alive on the next round.
2. Any live cell touching exactly 2 other live cells is alive on the next round. 
3. In all other cases, the cell either dies or remains dead either through loneliness or overcrowding.

The edges of the board are all considered to have dead cells beyond them.

## Design

* Constructor - takes a number of rows and columns to create the game board
* `birthCell(int xposition, int yposition)` - creates a live cell in the specified position, if possible
* `advanceTime()` - changes the board position to the next round of play
* `toString()` - prints out the board

use a 2 dimensional array to store the current state of the game board.

### Extra 
Instead of the edges of the board having dead cells, assume that the board wraps around on itself. That is, the top row
is next to the bottom row and the left-most column is next to the right-most column.

## Example of Game
[Conway's Game of Life wikipedia](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#Examples_of_patterns).


