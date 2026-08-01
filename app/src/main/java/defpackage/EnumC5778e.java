package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5778e implements InterfaceC14001e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC5778e f12224e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC5778e f12225e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6454e f12226e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5778e[] f12227e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC5778e f12228e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f12229e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC5778e f12230e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC5778e f12231e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f12232e;

    /* JADX WARN: Type inference failed for: r2v2, types: [eُ٘ۤ, eؙُ٘] */
    static {
        EnumC5778e enumC5778e = new EnumC5778e("BLUR", 0, 0);
        f12225e = enumC5778e;
        EnumC5778e enumC5778e2 = new EnumC5778e("THEME", 1, 1);
        f12228e = enumC5778e2;
        EnumC5778e enumC5778e3 = new EnumC5778e("GRADIENT", 2, 2);
        f12224e = enumC5778e3;
        EnumC5778e enumC5778e4 = new EnumC5778e("BEYOND_BACKGROUND", 3, 3);
        f12231e = enumC5778e4;
        EnumC5778e enumC5778e5 = new EnumC5778e("IOS_LAYER_VIEW", 4, 4);
        f12230e = enumC5778e5;
        EnumC5778e[] enumC5778eArr = {enumC5778e, enumC5778e2, enumC5778e3, enumC5778e4, enumC5778e5};
        f12227e = enumC5778eArr;
        f12229e = new C15937e(enumC5778eArr);
        f12226e = new AbstractC11069e(1, AbstractC3820e.ad.vip(EnumC5778e.class), 2, enumC5778e);
    }

    public EnumC5778e(String str, int i, int i2) {
        this.f12232e = i2;
    }

    public static EnumC5778e valueOf(String str) {
        return (EnumC5778e) Enum.valueOf(EnumC5778e.class, str);
    }

    public static EnumC5778e[] values() {
        return (EnumC5778e[]) f12227e.clone();
    }

    @Override // defpackage.InterfaceC14001e
    public final int getValue() {
        return this.f12232e;
    }
}
