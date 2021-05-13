package ConillVsLlop1;

public class Conill extends Animal{
    @Override
    public String toString() { return "\uD83D\uDC30"; } // icona de conill
    public Conill(int x, int y){ super(x, y); } // reutilitzem el constructor de la classe mare
}
