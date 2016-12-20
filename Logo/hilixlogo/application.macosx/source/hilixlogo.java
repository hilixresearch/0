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

public class hilixlogo extends PApplet {

public void setup () {
  size(300, 300);
  noStroke();
  fill(255, 255, 255);

  //Line 1 
  ellipse(98, 45, 10, 10);
  ellipse(129, 45.5f, 7, 7);
  stroke(255, 255, 255);
  line(100, 45, 125, 45);

  //Line 2
  ellipse(113, 59, 10.5f, 10.5f);

  //Line 3
  ellipse(98, 70.5f, 7, 7);
  ellipse(129, 70, 10, 10);
  stroke(255, 255, 255);
  line(100, 70, 125, 70);

  //Line 4
  ellipse(90, 85, 8.5f, 8.5f);
  ellipse(137, 85, 9.5f, 9.5f);
  stroke(255, 255, 255);
  line(90, 85, 137, 85);

  //Line 5
  ellipse(92, 100, 9.5f, 9.5f);
  ellipse(135, 100, 8.5f, 8.5f);
  stroke(255, 255, 255);
  line(92, 100, 135, 100);

  //Line 6
  ellipse(101, 115.5f, 10, 10);
  ellipse(126, 114.5f, 7, 7);
  stroke(255, 255, 255);
  line(101, 115.5f, 126, 115);

  //Line 7
  ellipse(104, 127, 7, 7);
  ellipse(124, 128, 10, 10);
  stroke(255, 255, 255);
  line(104, 127, 124, 127);

  //Line 8
  ellipse(92, 140, 8.5f, 8.5f);
  ellipse(135, 140, 9.5f, 9.5f);
  stroke(255, 255, 255);
  line(92, 140, 135, 140);

  //Line 9
  ellipse(87, 155, 8.5f, 8.5f);
  ellipse(140, 155, 8.5f, 8.5f);
  stroke(255, 255, 255);
  line(87, 155, 140, 155);

  //Line 9
  ellipse(92, 171, 8.5f, 8.5f);
  ellipse(135, 169, 7, 7);
  stroke(255, 255, 255);
  line(92, 170, 135, 170);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "hilixlogo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
