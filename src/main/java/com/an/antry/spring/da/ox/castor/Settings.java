package com.an.antry.spring.da.ox.castor;

public class Settings {
    private boolean fooEnabled;

    public boolean isFooEnabled() {
        return fooEnabled;
    }

    public void setFooEnabled(boolean fooEnabled) {
        this.fooEnabled = fooEnabled;
    }

    @Override
    public String toString() {
        return "Settings [fooEnabled=" + fooEnabled + "]";
    }
}
