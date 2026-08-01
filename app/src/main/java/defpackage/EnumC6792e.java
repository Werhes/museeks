package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6792e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6792e[] f13998e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6792e f13999e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6792e f14000e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؙۦٜ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؙۦٜ] */
    static {
        ?? r0 = new Enum("RAW", 0);
        f14000e = r0;
        Enum r1 = new Enum("DQUOTES", 1);
        ?? r3 = new Enum("URI_ENCODING", 2);
        f13999e = r3;
        f13998e = new EnumC6792e[]{r0, r1, r3, new Enum("BASE64_ENCODING", 3)};
    }

    public static EnumC6792e valueOf(String str) {
        return (EnumC6792e) Enum.valueOf(EnumC6792e.class, str);
    }

    public static EnumC6792e[] values() {
        return (EnumC6792e[]) f13998e.clone();
    }
}
