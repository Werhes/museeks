package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14621e {
    private static final /* synthetic */ InterfaceC5072e $ENTRIES;
    private static final /* synthetic */ EnumC14621e[] $VALUES;
    public static final C13978e Companion;
    public static final EnumC14621e ON_ANY;
    public static final EnumC14621e ON_CREATE;
    public static final EnumC14621e ON_DESTROY;
    public static final EnumC14621e ON_PAUSE;
    public static final EnumC14621e ON_RESUME;
    public static final EnumC14621e ON_START;
    public static final EnumC14621e ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eٓٔؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eٍٕٔ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eٍٕٔ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r3 = new Enum("ON_RESUME", 2);
        ON_RESUME = r3;
        ?? r5 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r5;
        ?? r7 = new Enum("ON_STOP", 4);
        ON_STOP = r7;
        ?? r9 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r9;
        ?? r11 = new Enum("ON_ANY", 6);
        ON_ANY = r11;
        EnumC14621e[] enumC14621eArr = {r0, r1, r3, r5, r7, r9, r11};
        $VALUES = enumC14621eArr;
        $ENTRIES = new C15937e(enumC14621eArr);
        Companion = new Object();
    }

    public static EnumC14621e valueOf(String str) {
        return (EnumC14621e) Enum.valueOf(EnumC14621e.class, str);
    }

    public static EnumC14621e[] values() {
        return (EnumC14621e[]) $VALUES.clone();
    }

    public final EnumC7785e ad() {
        switch (AbstractC17639e.ad[ordinal()]) {
            case 1:
            case 2:
                return EnumC7785e.f15777e;
            case 3:
            case 4:
                return EnumC7785e.f15779e;
            case 5:
                return EnumC7785e.f15776e;
            case 6:
                return EnumC7785e.f15780e;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new C14803e(10);
        }
    }
}
