


class Food {

  int x;
  int y;
  int type = 2;
  Player player;


  Food(int x, int y, Player player) {
    this.x = x;
    this.y = y;
    this.player = player;
  }


  void runAway() {

    int xDist = Math.abs(player.x - x);
    int yDist = Math.abs(player.y - y);
    int dist = ((xDist + yDist)/2);

    if (dist > 2) {
      if (keyPressed) {

        if ((xDist > yDist)) {
          if (x > player.x) {
            food1.x++;
          } else if (x < player.x) {
            food1.x--;
          }
        } else {
          if (y > player.y) {
            food1.y++;
          } else if (y < player.y) {
            food1.y--;
          }
        }
      }
    }
  }
}
