public class Weapon {

    private int Sword;
    private int Arrow;
    private int Knife;

    public Weapon(int sword, int arrow, int knife) {
        Sword = sword;
        Arrow = arrow;
        Knife = knife;
    }

    public int getSword() {
        return Sword;
    }

    public void setSword(int sword) {
        Sword = sword;
    }

    public int getArrow() {
        return Arrow;
    }

    public void setArrow(int arrow) {
        Arrow = arrow;
    }

    public int getKnife() {
        return Knife;
    }

    public void setKnife(int knife) {
        Knife = knife;
    }
}
