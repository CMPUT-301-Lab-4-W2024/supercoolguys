abstract class Shape {
    //made the ints private to allow for proper encapuslation
    private int x;
    private int y;

    String colour = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
