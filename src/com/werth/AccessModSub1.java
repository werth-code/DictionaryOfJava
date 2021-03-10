package com.werth;

public class AccessModSub1 extends AccessModifierTypes {
    public AccessModSub1(EnumSounds sound, String type, String protectString, String anotherProtectString) {
        super(sound, type, protectString, anotherProtectString);
    }

    @Override
    protected String getAnotherProtectString() {
        return super.getAnotherProtectString();
    }

    @Override
    protected String getProtectString() {
        return super.getProtectString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
