PImage face;
void setup() {
  face = loadImage("face.jpg");
  size(800,600);
  face.resize(width,height);
  background(face);
  fill(#FFFFFF);
  
  ellipse(410,130,250,150);
  ellipse(600,130,250,150);
  
  fill(#000000);
  ellipse(410,130,50,50);
  ellipse(600,130,50,50);
}

void draw() {
  //print(mouseX + " and " + mouseY + ".......");
  
 
 
  if(mouseX>300 && mouseX<540 && mouseY>50 && mouseY<200){
  background(face);
  fill(#FFFFFF);
  
  ellipse(410,130,250,150);
  ellipse(600,130,250,150);
  
  fill(#000000);
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX+190,mouseY,50,50);
  }
  
}
