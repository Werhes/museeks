package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10949e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC10949e f21677e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10949e f21678e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10949e[] f21679e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10949e f21680e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eُِۗ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eُِۗ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eُِۗ] */
    static {
        ?? r0 = new Enum("IGNORE", 0);
        f21680e = r0;
        ?? r1 = new Enum("WARN", 1);
        f21678e = r1;
        ?? r3 = new Enum("STRICT", 2);
        f21677e = r3;
        f21679e = new EnumC10949e[]{r0, r1, r3};
    }

    public static EnumC10949e valueOf(String str) {
        return (EnumC10949e) Enum.valueOf(EnumC10949e.class, str);
    }

    public static EnumC10949e[] values() {
        return (EnumC10949e[]) f21679e.clone();
    }
}
