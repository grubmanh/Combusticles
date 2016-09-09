int cupric = 0;
float cupricXpos = (3*width/5);
float cupricYpos = 0;
float cupricWidth = width/5;
float cupricHeight = height/3;

void setup()
{
  fullScreen();
}

void draw()
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
