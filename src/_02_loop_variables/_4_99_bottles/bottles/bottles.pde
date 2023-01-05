void setup(){
  size(4000,4000);
    textSize(10);
for(int i=99; i>1; i=i){

  text(i+"bottles of beer on the wall, "+i+" bottles of beer.Take one down and pass it around, "+--i+" bottles of beer on the wall.",50,50+(i*20));

}

text("1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall. No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.",50,50);
}
