package DotaTowers;

class TowerLevel3 extends Tower {
    public TowerLevel3() {
        super(30, 3);
    }

    @Override
    protected int multiShotCount() {
        if (glyphActive) {
            return 3;
        } else {
            return 1;
        }
    }
}