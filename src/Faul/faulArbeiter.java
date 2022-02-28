package Faul;

import Arbeiter.arbeiter;

public class faulArbeiter implements arbeiter {
    private int kostenProStunden = 23;
    private int stundenProWoche= 20;

    @Override
    public int preisBerechnen() {
        return this.kostenProStunden * this.stundenProWoche;
    }
}
