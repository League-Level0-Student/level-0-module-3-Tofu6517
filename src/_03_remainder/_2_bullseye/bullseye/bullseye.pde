
void setup() {
 
  // set the size of your sketch
  size(1000,1000);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=5;i>1;i--){
  ellipse(500,500,i,i);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
