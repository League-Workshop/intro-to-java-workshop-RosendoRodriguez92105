package section4;

public final class TerminatorCat {

}
PImage catPic;
int x=117;
int y=119;
void setup(){
  size(300,300);
    catPic = loadImage("bigeyecat.jpg");
catPic.resize(width, height);
background(catPic);
}
void draw(){
   if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
fill(#03A0FF);
 ellipse(x, y, 35, 45);
  ellipse(x+70, y-2, 33, 40);
  
}
  void keyPressed() {
 x++;
y++;

}



  }

