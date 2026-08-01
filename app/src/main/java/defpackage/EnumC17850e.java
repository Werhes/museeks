package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC17850e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17850e[] f35034e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC17850e f35035e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC17850e f35036e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٟ٘ٚ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٟ٘ٚ] */
    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        f35036e = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        f35035e = r1;
        f35034e = new EnumC17850e[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static EnumC17850e valueOf(String str) {
        return (EnumC17850e) Enum.valueOf(EnumC17850e.class, str);
    }

    public static EnumC17850e[] values() {
        return (EnumC17850e[]) f35034e.clone();
    }
}
