package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1891e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1891e[] f5032e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1891e f5033e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC1891e f5034e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1891e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌؓٙ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٌؓٙ] */
    static {
        Enum r0 = new Enum("PRETTY", 0);
        ?? r1 = new Enum("DEBUG", 1);
        f5034e = r1;
        ?? r3 = new Enum("NONE", 2);
        f5033e = r3;
        f5032e = new EnumC1891e[]{r0, r1, r3};
    }

    public static EnumC1891e valueOf(String str) {
        return (EnumC1891e) Enum.valueOf(EnumC1891e.class, str);
    }

    public static EnumC1891e[] values() {
        return (EnumC1891e[]) f5032e.clone();
    }
}
