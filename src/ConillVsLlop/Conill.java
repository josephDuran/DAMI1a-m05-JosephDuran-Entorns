package ConillVsLlop;

public class Conill extends Animal {
        @Override
        public String toString() { return "\uD83D\uDC30"; } // icona de conill

    @Override
    public void mou() {
            int vida = 10;
            Bloc[][] tauler = ConillsVsLlopsSim.tauler;
            if(vida == 10){
            mor();                      // eliminem les referències a aquest objecte i confiem en el
            tauler[x][y].delAnimal();   // garbage collector per a destruir-lo (ja que no té referències)
            }
            else {
            int i = (int) (Math.random() * 3) - 1 + x;
            int j = (int) (Math.random() * 3) - 1 + y;
            boolean dinsTauler = i >= 0 && i < tauler.length && j >= 0 && j < tauler[0].length;
            if (dinsTauler && !tauler[i][j].esAigua() && !tauler[i][j].esLlop() && !(tauler[i][j].esConill() && tauler[i][j].esRoca())) {
                if (tauler[i][j].esLlop()) {
                    tauler[i][j].getAnimal().mor();
                    vida += 10;
                }
                tauler[x][y].delAnimal();
                tauler[i][j].setAnimal(this);
                x = i;
                y = j;
                vida ++;
            }
        }
    }

    public Conill(int x, int y){ super(x, y); } // reutilitzem el constructor de la classe mare
    }
