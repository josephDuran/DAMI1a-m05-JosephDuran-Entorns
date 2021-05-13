package ConillVsLlop1;

public class Bloc {
    private int terreny = 0; // 0(terra, verd) 1(roca, gris) 2(aigua, blau)
    private Animal animal = null;
    public String toString(){
        String grafic;
        switch (terreny){
            case 0: grafic = "\u001B[42m"; break;
            case 1: grafic = "\033[0;100m"; break;
            case 2: grafic = "\u001B[44m"; break;
            default: grafic = "\u001B[42m"; // terra per defecte
        }
        if(animal == null) return grafic + "  " + "\033[0m"; // 2 espais per a mantindre l'alineació

        return grafic + animal + "\033[0m"; // reset, torna al color per defecte
    }
    public Bloc (int terreny){
        this.terreny = terreny;
    }
    public Bloc (int terreny, Animal animal){
        this.animal = animal;
        this.terreny = terreny; // this(terreny); no era així per a reutilitzar un constructor sobrecarregat? :S
    }

    public boolean esAigua() {
        if(terreny == 2) return true;
        return false;
    }
    public boolean esRoca() {
        if(terreny == 1) return true;
        return false;
    }
    public boolean esAnimal(){
        if(animal != null) return true;
        return false;
    }
    public boolean esConill(){
        if(animal instanceof Conill) return true;
        return false;
    }
    public boolean esLlop(){
        if(animal instanceof Llop) return true;
        return false;
    }
    public Animal getAnimal() { return this.animal; }
    public void delAnimal(){
        this.animal = null;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
}
