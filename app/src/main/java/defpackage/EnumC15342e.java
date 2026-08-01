package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC15342e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15342e[] f30262e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC15342e f30263e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC15342e f30264e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC15342e f30265e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC15342e f30266e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌٕٔ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌٕٔ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٌٕٔ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eٌٕٔ] */
    static {
        ?? r0 = new Enum("MANUAL_PREVIOUS", 0);
        f30266e = r0;
        ?? r1 = new Enum("MANUAL_NEXT", 1);
        f30264e = r1;
        ?? r3 = new Enum("COMPLETED", 2);
        f30263e = r3;
        ?? r5 = new Enum("SOURCE_CHANGED", 3);
        f30265e = r5;
        f30262e = new EnumC15342e[]{r0, r1, r3, r5};
    }

    public static EnumC15342e valueOf(String str) {
        return (EnumC15342e) Enum.valueOf(EnumC15342e.class, str);
    }

    public static EnumC15342e[] values() {
        return (EnumC15342e[]) f30262e.clone();
    }
}
