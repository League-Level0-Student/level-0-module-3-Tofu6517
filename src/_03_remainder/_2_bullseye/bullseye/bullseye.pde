
void setup() {
 
  // set the size of your sketch
  size(1000,1000);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
    int b=500;
  for(int i=1;i<10;i++){
    if (i % 2 == 0){
    fill(200,0,0);
    }   
    else{
     fill(0,0,0);
  
    }
          b=b-50;
    ellipse(500,500,b,b);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
