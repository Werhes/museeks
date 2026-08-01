package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3438e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3438e[] f7692e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC3438e f7693e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC3438e f7694e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؕ٘ۗ] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, eؕ٘ۗ] */
    static {
        ?? r0 = new Enum("all", 0);
        f7694e = r0;
        Enum r1 = new Enum("aural", 1);
        Enum r3 = new Enum("braille", 2);
        Enum r5 = new Enum("embossed", 3);
        Enum r7 = new Enum("handheld", 4);
        Enum r9 = new Enum("print", 5);
        Enum r11 = new Enum("projection", 6);
        ?? r13 = new Enum("screen", 7);
        f7693e = r13;
        f7692e = new EnumC3438e[]{r0, r1, r3, r5, r7, r9, r11, r13, new Enum("speech", 8), new Enum("tty", 9), new Enum("tv", 10)};
    }

    public static EnumC3438e valueOf(String str) {
        return (EnumC3438e) Enum.valueOf(EnumC3438e.class, str);
    }

    public static EnumC3438e[] values() {
        return (EnumC3438e[]) f7692e.clone();
    }
}
