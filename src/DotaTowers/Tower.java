package DotaTowers;

abstract class Tower implements Glyphable {
    protected int damage;
    protected int armorBonus;
    protected boolean glyphActive = false;

    public Tower(int damage, int armorBonus) {
        this.damage = damage;
        this.armorBonus = armorBonus;
    }

    protected int multiShotCount() {
        return 1;
    }

    public void attack(Creature creature) {
        boolean canAttack = true;
        if (creature instanceof GlyphAffected && ((GlyphAffected) creature).isGlyphActive()) {
            canAttack = false;
        }
        if (canAttack) {
            for (int i = 0; i < multiShotCount(); i++) {
                creature.receiveDamage(damage);
            }
        }
    }

    @Override
    public void activateGlyph() {
        glyphActive = true;
    }

    @Override
    public void deactivateGlyph() {
        glyphActive = false;
    }

    public int getArmorBonus() {
        return armorBonus;
    }
}