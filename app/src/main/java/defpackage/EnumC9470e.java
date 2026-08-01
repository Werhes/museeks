package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9470e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC9470e f18808e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9470e f18809e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9470e[] f18810e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9470e f18811e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌٍٔ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌٍٔ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٌٍٔ] */
    static {
        ?? r0 = new Enum("On", 0);
        f18811e = r0;
        ?? r1 = new Enum("Off", 1);
        f18809e = r1;
        ?? r3 = new Enum("Indeterminate", 2);
        f18808e = r3;
        f18810e = new EnumC9470e[]{r0, r1, r3};
    }

    public static EnumC9470e valueOf(String str) {
        return (EnumC9470e) Enum.valueOf(EnumC9470e.class, str);
    }

    public static EnumC9470e[] values() {
        return (EnumC9470e[]) f18810e.clone();
    }
}
