package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8150e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC8150e f16544e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8150e f16545e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8150e[] f16546e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC8150e f16547e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eًۗٙ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًۗٙ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eًۗٙ] */
    static {
        ?? r0 = new Enum("NOT_COMPUTED", 0);
        f16547e = r0;
        ?? r1 = new Enum("COMPUTING", 1);
        f16545e = r1;
        ?? r3 = new Enum("RECURSION_WAS_DETECTED", 2);
        f16544e = r3;
        f16546e = new EnumC8150e[]{r0, r1, r3};
    }

    public static EnumC8150e valueOf(String str) {
        return (EnumC8150e) Enum.valueOf(EnumC8150e.class, str);
    }

    public static EnumC8150e[] values() {
        return (EnumC8150e[]) f16546e.clone();
    }
}
