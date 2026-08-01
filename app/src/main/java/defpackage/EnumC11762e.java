package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11762e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC11762e f23636e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC11762e f23637e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11762e[] f23638e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC11762e f23639e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eِٕٖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eِٕٖ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eِٕٖ] */
    static {
        ?? r0 = new Enum("StartToEnd", 0);
        f23639e = r0;
        ?? r1 = new Enum("EndToStart", 1);
        f23637e = r1;
        ?? r3 = new Enum("Settled", 2);
        f23636e = r3;
        f23638e = new EnumC11762e[]{r0, r1, r3};
    }

    public static EnumC11762e valueOf(String str) {
        return (EnumC11762e) Enum.valueOf(EnumC11762e.class, str);
    }

    public static EnumC11762e[] values() {
        return (EnumC11762e[]) f23638e.clone();
    }
}
