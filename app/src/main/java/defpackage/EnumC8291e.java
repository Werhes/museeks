package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8291e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8291e[] f16966e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8291e f16967e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC8291e f16968e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eًۢٝ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًۢٝ] */
    static {
        ?? r0 = new Enum("ACTIVE", 0);
        f16968e = r0;
        ?? r1 = new Enum("INACTIVE", 1);
        f16967e = r1;
        f16966e = new EnumC8291e[]{r0, r1};
    }

    public static EnumC8291e valueOf(String str) {
        return (EnumC8291e) Enum.valueOf(EnumC8291e.class, str);
    }

    public static EnumC8291e[] values() {
        return (EnumC8291e[]) f16966e.clone();
    }
}
