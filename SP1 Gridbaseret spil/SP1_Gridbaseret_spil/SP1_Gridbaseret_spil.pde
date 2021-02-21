import java.util.Arrays;

int size = 40;
int[][] grid = new int[25][25];

int gridx = grid[0][0];
int gridy = grid[0][0];

int gridConstrainX = constrain(gridx, 0, width-0);
int gridConstrainY = constrain(gridy, 0, height-0);

Player player;
Enemy enemy;
Food food1;
Food food2;
Food food3;
Food food4;

//Food[] food = new Food[4];  
//{
//  for (int i = 0; i < food.length; i++)
//  {
//    food[i].render();
//  }
//}


void setup() {

  size(1001, 1001);
  frameRate(20);

  player = new Player(10, 10);

  food1 = new Food(20, 10, player);
  food2 = new Food(15, 10, player);
  food3 = new Food(10, 10, player);
  food4 = new Food(5, 10, player);

  enemy = new Enemy(4, 4, player);
}

void draw() {

  clearBoard();
  updateEntities();
  drawBoard();
}

void clearBoard() {
  for (int x = 0; x < grid.length; x++) {
    for (int y = 0; y < grid[0].length; y++) {
      grid[x][y] = 0;
    }
  }
}


void drawBoard() {

  for (int x = 0; x < grid.length; x++) {
    for (int y = 0; y < grid[0].length; y++) {
      fill(getColorFromType(grid[x][y]));

      rect(x * size, y * size, size, size);
    }
  }
}


void updateEntities() {

  grid[player.x][player.y] = player.type;

  grid[food1.x][food1.y] = food1.type;
  grid[food2.x][food2.y] = food2.type;
  grid[food3.x][food3.y] = food3.type;
  grid[food4.x][food4.y] = food4.type;

  grid[enemy.x][enemy.y] = enemy.type;


  enemy.moveTowardsPlayer();

  player.takeDamage();
}

color getColorFromType(int type) {

  color c = color(255);

  switch(type) {

  case 0:
    c = color(127);
    break;
  case 1:
    c = color(150, 0, 0);
    break;
  case 2:
    c = color(0, 255, 0);
    break;
  case 3:
    c = color(0, 255, 255);
    break;
  case 4:
    c = color(0, 0, 255);
    break;
  }
  return c;
}



void printIntArray(int[][] arr) {

  System.out.println("");
  System.out.println("");
  System.out.println("");

  for (int x = 0; x < arr.length; x++) {
    for (int y = 0; y < arr[0].length; y++) {

      System.out.print(arr[x][y] + ", ");
    }
    println();
  }
}

void keyReleased() {

  keyPressed();  
  {
    if (key == 'w') {
      player.y--;
    }
    if (key == 's') {
      player.y++;
    }
    if (key == 'a') {
      player.x--;
    }
    if (key == 'd') {
      player.x++;
    }
  }
}


void isGameOver() {

  if (player.health <= 0) {
    clearBoard();
    noLoop();
  }
}
