

class Player {

  int x;
  int y;
  int type = 3;
  int health;

  Player(int x, int y) {
    this.x = x;
    this.y = y;
    health = 100;
  }


  void placeholder() {
  }

  void takeDamage() {

    boolean sameSpot1 = player.getClass().equals(enemy.getClass()); 
    boolean sameSpot2 = player.getClass().isAssignableFrom(enemy.getClass());
    if (sameSpot2 == true) {
      player.health--;
    }
    println(player.health);
  }

  void increaseScore() {
  }
}
