public class Enemy {
    int coordinateY;
    int coordianteX;
    Direction direction;

    //new enemy
    public Enemy(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordianteX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }
    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
