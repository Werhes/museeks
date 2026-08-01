package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7785e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC7785e f15776e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7785e f15777e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7785e f15778e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC7785e f15779e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7785e f15780e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7785e[] f15781e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eًؙۡ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًؙۡ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eًؙۡ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eًؙۡ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, eًؙۡ] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        f15780e = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        f15778e = r1;
        ?? r3 = new Enum("CREATED", 2);
        f15777e = r3;
        ?? r5 = new Enum("STARTED", 3);
        f15779e = r5;
        ?? r7 = new Enum("RESUMED", 4);
        f15776e = r7;
        f15781e = new EnumC7785e[]{r0, r1, r3, r5, r7};
    }

    public static EnumC7785e valueOf(String str) {
        return (EnumC7785e) Enum.valueOf(EnumC7785e.class, str);
    }

    public static EnumC7785e[] values() {
        return (EnumC7785e[]) f15781e.clone();
    }

    public final boolean ad(EnumC7785e enumC7785e) {
        return compareTo(enumC7785e) >= 0;
    }
}
