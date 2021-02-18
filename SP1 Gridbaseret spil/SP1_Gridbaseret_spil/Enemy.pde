


class Enemy  {
  
  int x;
  int y;
  int type = 1;
  Player player;
  
  Enemy(int x, int y, Player player)  {
    
    this.x = x;
    this.y = y;
    this.player = player;
  }
  
  void MoveTowarddsPlayer()  {
    
    int xDist = Math.abs(player.x - x);
    int yDist = Math.abs(player.y - y);
    
    if (xDist > yDist)  {
      
      
    }
    else  {
      
      
    }
  }
}
