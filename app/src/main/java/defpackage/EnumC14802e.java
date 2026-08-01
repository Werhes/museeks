package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14802e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC14802e f29323e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14802e f29324e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14802e f29325e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14802e[] f29326e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC14802e f29327e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC14802e f29328e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC14802e f29329e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC14802e f29330e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eٔٙۡ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eٔٙۡ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        f29328e = r0;
        ?? r1 = new Enum("INACTIVE", 1);
        f29325e = r1;
        ?? r3 = new Enum("SCANNING", 2);
        f29324e = r3;
        ?? r5 = new Enum("PASSIVE_FOCUSED", 3);
        f29327e = r5;
        ?? r7 = new Enum("PASSIVE_NOT_FOCUSED", 4);
        f29323e = r7;
        ?? r9 = new Enum("LOCKED_FOCUSED", 5);
        f29330e = r9;
        ?? r11 = new Enum("LOCKED_NOT_FOCUSED", 6);
        f29329e = r11;
        f29326e = new EnumC14802e[]{r0, r1, r3, r5, r7, r9, r11};
    }

    public static EnumC14802e valueOf(String str) {
        return (EnumC14802e) Enum.valueOf(EnumC14802e.class, str);
    }

    public static EnumC14802e[] values() {
        return (EnumC14802e[]) f29326e.clone();
    }
}
