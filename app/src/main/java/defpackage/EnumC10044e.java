package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10044e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC10044e f19840e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10044e f19841e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10044e[] f19842e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10044e f19843e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَؕٞ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَؕٞ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eَؕٞ] */
    static {
        ?? r0 = new Enum("Locked", 0);
        f19843e = r0;
        ?? r1 = new Enum("Enabled", 1);
        f19841e = r1;
        ?? r3 = new Enum("Loading", 2);
        f19840e = r3;
        f19842e = new EnumC10044e[]{r0, r1, r3};
    }

    public static EnumC10044e valueOf(String str) {
        return (EnumC10044e) Enum.valueOf(EnumC10044e.class, str);
    }

    public static EnumC10044e[] values() {
        return (EnumC10044e[]) f19842e.clone();
    }
}
