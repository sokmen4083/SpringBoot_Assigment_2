package Gut;

import Arbeiter.arbeiter;

public class gutArbeiter implements arbeiter {
    private int kostenProStunden = 40;
    private int stundenProWoche= 40;

    @Override
    public int preisBerechnen() {
        return this.kostenProStunden * this.stundenProWoche;
    }
}
