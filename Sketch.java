import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
  	// size call (ratio is 1.5:1)
    size(900, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(196, 212, 201);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawRainbow(450, 600);
    drawSun(800, 100, 100, 255, 245, 130);
  	
    fill(60, 171, 86);
    rect(0, height * 7/8, width, height * 1/8);

    fill(155, 118, 83);
    quad(width * 29/60, height * 7/8, width * 31/60, height * 7/8, width * 3/5, height, width * 2/5, height);    
  }
  
  /**
   * Draws a rainbow to the screen where the location is given
   * @param RainbowX The x-value of the location of the rainbow
   * @param RainbowY The y-value of the location of the rainbow
   * 
   */
  public void drawRainbow(float RainbowX, float RainbowY){
    fill(239, 115, 113);
    ellipse(RainbowX, RainbowY * 14/16, width * 2/3, height);
    fill(248, 181, 129);
    ellipse(RainbowX, RainbowY * 15/16, width * 3/5, height);
    fill(253, 230, 151);
    ellipse(RainbowX, RainbowY * 16/16, width * 8/15, height);
    fill(151, 186, 129);
    ellipse(RainbowX, RainbowY * 17/16, width * 7/15, height);
    fill(132, 146, 184);
    ellipse(RainbowX, RainbowY * 18/16, width * 2/5, height);
    fill(168, 148, 186, 255);
    ellipse(RainbowX, RainbowY * 19/16, width * 1/3, height);
    fill(196, 212, 201);
    ellipse(RainbowX, RainbowY * 20/16, width * 4/15, height);

    noStroke();
    fill(196, 212, 201);
    rect(RainbowX - width * 1/3, RainbowY * 14/16, 601, height);
    stroke(0, 0, 0);
  }
  /**
   * Draws a sun to the screen where the location, size, and colour is given
   * @param SunX The x-value of the location of the sun
   * @param SunY The y-value of the location of the sun
   * @param SunSize The size of the sun (diameter of the circle)
   * @param r The red value of the colour of the sun
   * @param g The green value of the colour of the sun
   * @param b The blue value of the colour of the sun
   * 
   */
  public void drawSun(float SunX, float SunY, float SunSize, int r, int g, int b){
    fill(r, g, b);
    ellipse(SunX, SunY, SunSize, SunSize);

    line(SunX, SunY - SunSize * 5/9, SunX, SunY - SunSize * 5/6);
    line(SunX, SunY + SunSize * 5/9, SunX, SunY + SunSize *  5/6);
    line(SunX + SunSize * 5/9, SunY, SunX + SunSize * 5/6, SunY);
    line(SunX - SunSize * 5/9, SunY, SunX - SunSize * 5/6, SunY);
    line(SunX + SunSize * 5/12, SunY - SunSize * 5/12, SunX + SunSize * 25/36, SunY - SunSize * 25/36);
    line(SunX + SunSize * 5/12, SunY + SunSize * 5/12, SunX + SunSize * 25/36, SunY + SunSize * 25/36);
    line(SunX - SunSize * 5/12, SunY - SunSize * 5/12, SunX - SunSize * 25/36, SunY - SunSize * 25/36);
    line(SunX - SunSize * 5/12, SunY + SunSize * 5/12, SunX - SunSize * 25/36, SunY + SunSize * 25/36);
  }

  /**
   * Returns the x-value of the sun so it appears in the top right corner given the size
   * @param size size of the sun
   * @return x-value of the sun
   * 
   */
  public int sunDimensionX(int size){
    int intSunX = width - size;
    return intSunX;
  }

  /**
   * Returns the y-value of the sun so it appears in the top right corner given the size
   * @param size size of the sun 
   * @return y-value of the sun
   * 
   */
  public int sunDimensionY(int size){
    int intSunY = height;

    return intSunY;
  }
}