package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5822e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC5822e f12268e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC5822e f12269e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5822e[] f12270e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC5822e f12271e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؘۖٞ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؘۖٞ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؘۖٞ] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        f12271e = r0;
        ?? r1 = new Enum("DEFAULT", 1);
        f12269e = r1;
        ?? r3 = new Enum("YUV", 2);
        f12268e = r3;
        f12270e = new EnumC5822e[]{r0, r1, r3};
    }

    public static EnumC5822e valueOf(String str) {
        return (EnumC5822e) Enum.valueOf(EnumC5822e.class, str);
    }

    public static EnumC5822e[] values() {
        return (EnumC5822e[]) f12270e.clone();
    }
}
