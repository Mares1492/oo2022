package kodutöö;

import static java.lang.Math.abs;


public class Ball {

    int speed;
    int weight;
    int coordinateY;
    int coordinateX;
    int strength;
    int technique;
    int width;
    int height;

    public Ball(int speed,int weight,int strength,int technique,int width, int height){
        this.speed = speed;
        this.weight = weight;
        this.strength = strength;
        this.technique = technique;
        this.width = width;
        this.height = height;
        this.coordinateY = getCoordinateY();
        this.coordinateX = getCoordinateX();

    }

    public int getCoordinateX(){
        return (int)  ((width-3) - ((Math.random()*10)+5) + (weight + (speed/3)) - (strength*2));
    }
    public int getCoordinateY(){
        return  (height/2) + Technique();
    }
    public int Technique(){
        int randomSide = (int) (Math.random()*2) +1;
        int randomUnlucky = (int) (Math.random()* 3);
        if(randomSide == 1 ){
            if (technique*2 >= width/2 ) {
                return randomUnlucky;
            } else {
                return (randomUnlucky + (height/2 - technique));
            }
        }else {
            if (technique*2 >= width/2) {
                return randomUnlucky * -1;
            } else {
                return  (randomUnlucky + (height/2 - technique)) * -1;
            }
        }

    }

}
