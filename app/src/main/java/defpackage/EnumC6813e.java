package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6813e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC6813e f14025e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC6813e f14026e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f14027e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC6813e f14028e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6813e[] f14029e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC6813e f14030e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final char f14031e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char f14032e;

    static {
        EnumC6813e enumC6813e = new EnumC6813e("OBJ", 0, '{', '}');
        f14026e = enumC6813e;
        EnumC6813e enumC6813e2 = new EnumC6813e("LIST", 1, '[', ']');
        f14028e = enumC6813e2;
        EnumC6813e enumC6813e3 = new EnumC6813e("MAP", 2, '{', '}');
        f14025e = enumC6813e3;
        EnumC6813e enumC6813e4 = new EnumC6813e("POLY_OBJ", 3, '[', ']');
        f14030e = enumC6813e4;
        EnumC6813e[] enumC6813eArr = {enumC6813e, enumC6813e2, enumC6813e3, enumC6813e4};
        f14029e = enumC6813eArr;
        f14027e = new C15937e(enumC6813eArr);
    }

    public EnumC6813e(String str, int i, char c, char c2) {
        this.f14032e = c;
        this.f14031e = c2;
    }

    public static EnumC6813e valueOf(String str) {
        return (EnumC6813e) Enum.valueOf(EnumC6813e.class, str);
    }

    public static EnumC6813e[] values() {
        return (EnumC6813e[]) f14029e.clone();
    }
}
