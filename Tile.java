public abstract class Tile {
    private int pos;

    public int getPos(){
        return this.pos;
    }

    public void setPos(int pos){
        this.pos = pos;
    }

    public abstract void landedMethod(Player p);

    public Tile(int pos){
        setPos(pos);
    }
}