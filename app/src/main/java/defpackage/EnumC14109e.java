package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14109e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14109e f27901e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14109e f27902e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14109e[] f27903e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC14109e f27904e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٜٓ۟] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٜٓ۟] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٜٓ۟] */
    static {
        ?? r0 = new Enum("PENDING", 0);
        f27904e = r0;
        ?? r1 = new Enum("CREATING", 1);
        f27902e = r1;
        ?? r3 = new Enum("CREATED", 2);
        f27901e = r3;
        f27903e = new EnumC14109e[]{r0, r1, r3};
    }

    public static EnumC14109e valueOf(String str) {
        return (EnumC14109e) Enum.valueOf(EnumC14109e.class, str);
    }

    public static EnumC14109e[] values() {
        return (EnumC14109e[]) f27903e.clone();
    }
}
