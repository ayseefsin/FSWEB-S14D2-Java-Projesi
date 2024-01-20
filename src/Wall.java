public class Wall {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public Wall(String direction) {
        this.direction = direction;
    }

    public void create(){
        System.out.println("Wall created with " + direction);
    }

    @java.lang.Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
