// 3.a Draw a traffic light using colors stored in variables - one for each of the 4 colors (background is the 4th)

// Color variables
color r = color(255, 0, 0);
color y = color(255, 255, 0);
color g = color(0, 255, 0);
color b = color(0);
color gray = color(100);


void setup() {
  size(600, 600);
  background(255);
  smooth();
  rectMode(CENTER);
  ellipseMode(CENTER);

  // Draw traffic light
  fill(b);
  rect(300, 300, 200, 500);
  
  fill(gray);
  stroke(255);
  ellipse(300, 140, 150, 150);
  ellipse(300, 300, 150, 150);
  ellipse(300, 460, 150, 150);
}

int go = 0;


void draw() {

  switch(go) {
  case 1 : 
    // setup to turn off all lights
    reset();
    // Red
    fill(r); 
    stroke(255); 
    ellipse(300, 140, 150, 150);
    delay(1000);
    break; 

  case 2 : 
    // Yellow
    fill(y); 
    stroke(255); 
    ellipse(300, 300, 150, 150); 
    delay(1000);
    break; 

  case 3 : 
    reset();
    // Green
    fill(g); 
    stroke(255); 
    ellipse(300, 460, 150, 150); 
    delay(1000);
    break;

  case 4:
    reset();
    // Yellow
    fill(y); 
    stroke(255); 
    ellipse(300, 300, 150, 150); 
    delay(1000);
    go = 0;
    //
  }
  go++;
}

void reset() {

  fill(gray);
  stroke(255);
  ellipse(300, 140, 150, 150);
  ellipse(300, 300, 150, 150);
  ellipse(300, 460, 150, 150);
}
