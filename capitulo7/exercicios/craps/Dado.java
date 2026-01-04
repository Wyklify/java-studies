package exercicios.craps;

public class Dado {

    private int face;

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    @Override
    public String toString() {
        
        return String.format("%d", face);
    }
    
}
