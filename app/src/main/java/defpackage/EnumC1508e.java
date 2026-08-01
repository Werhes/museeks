package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1508e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC1508e f4375e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1508e f4376e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1508e[] f4377e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC1508e f4378e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؓؐۖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؓؐۖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؓؐۖ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NotEnough", 0);
        f4378e = r0;
        ?? r1 = new Enum("Enough", 1);
        f4376e = r1;
        ?? r3 = new Enum("Finishing", 2);
        f4375e = r3;
        f4377e = new EnumC1508e[]{r0, r1, r3};
    }

    public static EnumC1508e valueOf(String str) {
        return (EnumC1508e) Enum.valueOf(EnumC1508e.class, str);
    }

    public static EnumC1508e[] values() {
        return (EnumC1508e[]) f4377e.clone();
    }
}
