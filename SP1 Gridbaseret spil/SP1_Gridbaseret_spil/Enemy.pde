


class Enemy {

  int x;
  int y;
  int type = 1;
  Player player;

  Enemy(int x, int y, Player player) {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveTowardsPlayer() {

    int xDist = Math.abs(player.x - x);
    int yDist = Math.abs(player.y - y);


    if (keyPressed) {

      if (xDist > yDist) {
        if (x > player.x) {
          enemy.x--;
        } else if (x < player.x) {
          enemy.x++;
        }
      } else {
        if (y > player.y) {
          enemy.y--;
        } else if (y < player.y) {
          enemy.y++;
        }
      }
    }
  }
}
