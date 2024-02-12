package DotaTowers;

class TowerLevel4 extends Tower {
    public TowerLevel4() {
        super(40, 4);
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