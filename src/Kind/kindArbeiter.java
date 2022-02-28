package Kind;

import Arbeiter.arbeiter;

public class kindArbeiter implements arbeiter {
    private int kostenProStunden = 10;
    private int stundenProWoche= 30;

    @Override
    public int preisBerechnen() {
        return this.kostenProStunden * this.stundenProWoche;
    }
}
