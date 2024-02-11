package DotaTowers;

class Hero implements Creature {
    private int hp = 750;

    @Override
    public void receiveDamage(int damage) {
        this.hp -= damage;
    }

    @Override
    public boolean isGlyphActive() {
        return false;
    }

    public int getHp() {
        return hp;
    }
}