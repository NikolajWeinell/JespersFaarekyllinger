class Braet {

  Kryds k = new Kryds();
  Bolle b = new Bolle();
  
  Braet() {

  } 

  void drawFelter() {

    line(width*0.33, height, width*0.33, 0);
    line(width*0.66, height, width*0.66, 0);
    line(0, height*0.33, width, height*0.33);
    line(0, height*0.66, width, height*0.66);
  }
  
  void switchPlayer()  {
   
    boolean s = false;
    
    
  }

  void keyPressed()  {
   
    if (key == 'q')  {
    k.draw();
    }
    
    if (key == 'e')  {
    b.draw();
    }
  }
}
