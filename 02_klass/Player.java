public class Player {
    int coordinateY;
    int coordinateX;
    Direction direction;

    // Constructor
    public Player(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight-2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }

//            if (direction == Direction.LEFT && true) {
//                playerCoordinateX--;
//            } else if (direction == Direction.DOWN || input.equals("mihkel")) {
//                playerCoordinateY++;
//            } else if (direction == Direction.RIGHT) {
//                playerCoordinateX++;
//            } else if (direction == Direction.UP) {
//                playerCoordinateY--;
//            }

    }

}

// Tellimuse - id, tooted, kasutaja, aja
// Kasutaja - frontendis registreerumise järgselt
// Ühe toote
// Kategooria