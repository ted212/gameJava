public class Item {

    private int potion;
    private int potionPlus;
    private int potionMultipliedByTen;

    public Item(int potion, int potionPlus, int potionMultipliedByTen) {
        this.potion = potion;
        this.potionPlus = potionPlus;
        this.potionMultipliedByTen = potionMultipliedByTen;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getPotionPlus() {
        return potionPlus;
    }

    public void setPotionPlus(int potionPlus) {
        this.potionPlus = potionPlus;
    }

    public int getPotionMultipliedByTen() {
        return potionMultipliedByTen;
    }

    public void setPotionMultipliedByTen(int potionMultipliedByTen) {
        this.potionMultipliedByTen = potionMultipliedByTen;
    }
}
