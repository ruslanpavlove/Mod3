package DotaTowers;

abstract class Tower implements Glyphable {
    protected int damage;
    protected int armorBonus;
    private boolean glyphActive = false;

    public Tower(int damage, int armorBonus) {
        this.damage = damage;
        this.armorBonus = armorBonus;
        this.glyphActive = false;
    }

    public void attack(Creature creature) {
        if (creature instanceof Hero || !creature.isGlyphActive()) {
            creature.receiveDamage(this.damage);
        }
        if (this.glyphActive && (this instanceof TowerLevel3 || this instanceof TowerLevel4)) {
            creature.receiveDamage(this.damage);
            creature.receiveDamage(this.damage);
        }
    }

    public int getArmorBonus() {
        return armorBonus;
    }

    @Override
    public void activateGlyph() {
        this.glyphActive = true;
        System.out.println("Глиф активирован для вышки!");
    }

    @Override
    public void deactivateGlyph() {
        this.glyphActive = false;
        System.out.println("Глиф деактивирован для вышки!");
    }

    public boolean isGlyphActive() {
        return glyphActive;
    }
}