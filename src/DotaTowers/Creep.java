package DotaTowers;

abstract class Creep implements Creature, GlyphAffected {
    protected int hp;
    protected boolean glyphActive = false;

    public Creep(int hp) {
        this.hp = hp;
    }

    @Override
    public void receiveDamage(int damage) {
        if (!isGlyphActive()) {
            this.hp -= damage;
        }
    }

    @Override
    public boolean isGlyphActive() {
        return glyphActive;
    }

    public void activateGlyph() {
        glyphActive = true;
    }

    public void deactivateGlyph() {
        glyphActive = false;
    }

    public int getHp() {
        return hp;
    }
}