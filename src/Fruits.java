public enum Fruits {
    BANANA(false), ORANGE(true), MANGO(false),
    APPLE(false), GRAPES(false), PINEAPPLE(false), POMEGRANATE(false),
    AVOCADO(false), COCONUT(false), APRICOT(false), KIWI(false), JACKFRUIT(false),
    lIME(true), PEACH(false), PEAR(false), TAMARIND(false);

    boolean isLime;

    Fruits(boolean isLime){
        this.isLime = isLime;
    }

    public boolean isLime() {
        return isLime;
    }

    public void setLime(boolean lime) {
        isLime = lime;
    }
}
