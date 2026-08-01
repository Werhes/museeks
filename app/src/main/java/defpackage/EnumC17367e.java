package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC17367e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC17367e f34068e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC17367e f34069e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17367e[] f34070e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC17367e f34071e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eْۣٗ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eْۣٗ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eْۣٗ] */
    static {
        ?? r0 = new Enum("DarkPixel", 0);
        f34071e = r0;
        ?? r1 = new Enum("LightPixel", 1);
        f34069e = r1;
        ?? r3 = new Enum("Background", 2);
        f34068e = r3;
        f34070e = new EnumC17367e[]{r0, r1, r3, new Enum("Logo", 3)};
    }

    public static EnumC17367e valueOf(String str) {
        return (EnumC17367e) Enum.valueOf(EnumC17367e.class, str);
    }

    public static EnumC17367e[] values() {
        return (EnumC17367e[]) f34070e.clone();
    }
}
