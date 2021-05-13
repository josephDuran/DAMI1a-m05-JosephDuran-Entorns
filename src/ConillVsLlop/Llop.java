package ConillVsLlop;

public class Llop extends Animal {
    @Override
    public String toString() { return "\uD83D\uDC3A"; } // icona de llop
    public Llop(int x, int y){ super(x, y); } // reutilitzem el constructor de la classe mare
}
