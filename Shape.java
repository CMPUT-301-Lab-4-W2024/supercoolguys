abstract class Shape {
    //made the ints private to allow for proper encapuslation
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
}
