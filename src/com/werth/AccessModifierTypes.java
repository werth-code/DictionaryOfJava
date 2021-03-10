package com.werth;

public class AccessModifierTypes {
    private EnumSounds sound;
    private String type;
    protected String protectString;
    protected String anotherProtectString;

    String noModifierText = " Default No Modifier";
    private String privateText = "Private Text";
    protected String protectedText = "Protected Text";
    public String publicText = "Public Text";


    public AccessModifierTypes(EnumSounds sound, String type, String protectString, String anotherProtectString) {
        this.sound = sound;
        this.type = type;
        this.protectString = protectString;
        this.anotherProtectString = anotherProtectString;
    }

    protected String getProtectString() {
        return this.protectString;
    }

    protected String getAnotherProtectString() {
        return this.anotherProtectString;
    }

    @Override
    public String toString() {
        return "AccessModifierTypes{" +
                "sound=" + sound +
                ", type='" + type + '\'' +
                ", protectString='" + protectString + '\'' +
                ", anotherProtectString='" + anotherProtectString + '\'' +
                '}';
    }
}
