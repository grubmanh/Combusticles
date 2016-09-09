import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Harry extends PApplet {

int cupric = 0;
float cupricXpos = (3*width/5);
float cupricYpos = 0;
float cupricWidth = width/5;
float cupricHeight = height/3;

public void setup()
{
  
}

public void draw()
{
  background(0);
  if (cupric == 1)
  {
    fill(100, 100, 255);
  }
  else
  {
    fill(255, 255, 255);
  }
  rect(cupricXpos, cupricYpos, cupricWidth, cupricHeight, 100);
  if (mousePressed)
  {
    if (mouseX > cupricXpos && mouseY > cupricYpos && mouseX < (cupricXpos + cupricWidth) && mouseY < (cupricYpos + cupricHeight))
    {
      cupric = 1;
    }
    else
    {
      cupric = 0;
    }
  }
}
/* Romy - setup 

*/
/* In this, we create objects for the buttons.
*/
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Harry" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
