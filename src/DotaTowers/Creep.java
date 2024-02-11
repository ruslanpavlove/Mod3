package DotaTowers;

abstract class Creep implements Creature, Glyphable {
    protected int hp;
    protected boolean glyphActive = false; // Статус глифа

    public Creep(int hp) {
        this.hp = hp;
    }

    @Override
    public void receiveDamage(int damage) {
        if (!glyphActive) {
            this.hp -= damage;
        }
    }

    @Override
    public void activateGlyph() {
        glyphActive = true;
        System.out.println("Глиф активирован для крипа!");
    }

    @Override
    public void deactivateGlyph() {
        glyphActive = false;
        System.out.println("Глиф активирован для крипа!");
    }

    @Override
    public boolean isGlyphActive() {
        return glyphActive;
    }

    public int getHp() {
        return hp;
    }
}