package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13278e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC13278e f26333e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC13278e f26334e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC13278e f26335e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13278e[] f26336e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC13278e f26337e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC13278e f26338e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC13278e f26339e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC13278e f26340e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eُْٖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eُْٖ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RELEASED", 0);
        f26338e = r0;
        ?? r1 = new Enum("RELEASING", 1);
        f26335e = r1;
        ?? r3 = new Enum("CLOSED", 2);
        f26334e = r3;
        ?? r5 = new Enum("PENDING_OPEN", 3);
        f26337e = r5;
        ?? r7 = new Enum("CLOSING", 4);
        f26333e = r7;
        ?? r9 = new Enum("OPENING", 5);
        f26340e = r9;
        ?? r11 = new Enum("OPEN", 6);
        f26339e = r11;
        f26336e = new EnumC13278e[]{r0, r1, r3, r5, r7, r9, r11, new Enum("CONFIGURED", 7)};
    }

    public static EnumC13278e valueOf(String str) {
        return (EnumC13278e) Enum.valueOf(EnumC13278e.class, str);
    }

    public static EnumC13278e[] values() {
        return (EnumC13278e[]) f26336e.clone();
    }
}
