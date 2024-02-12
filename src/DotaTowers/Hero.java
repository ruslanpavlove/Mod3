package DotaTowers;

class Hero implements Creature {
    private int hp = 750;

    @Override
    public void receiveDamage(int damage) {
        this.hp -= damage;
    }

    public int getHp() {
        return hp;
    }
}