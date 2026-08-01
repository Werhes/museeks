package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6205e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC6205e f12966e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6205e f12967e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6205e[] f12968e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6205e f12969e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؖۧ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؙؖۧ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؙؖۧ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NIST_P256", 0);
        f12969e = r0;
        ?? r1 = new Enum("NIST_P384", 1);
        f12967e = r1;
        ?? r3 = new Enum("NIST_P521", 2);
        f12966e = r3;
        f12968e = new EnumC6205e[]{r0, r1, r3};
    }

    public static EnumC6205e valueOf(String str) {
        return (EnumC6205e) Enum.valueOf(EnumC6205e.class, str);
    }

    public static EnumC6205e[] values() {
        return (EnumC6205e[]) f12968e.clone();
    }
}
