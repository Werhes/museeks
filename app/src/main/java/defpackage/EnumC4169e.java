package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4169e implements InterfaceC14001e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC4169e f9185e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC4169e f9186e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f9187e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C8363e f9188e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final EnumC4169e f9189e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC4169e f9190e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4169e[] f9191e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC4169e f9192e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC4169e f9193e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9194e;

    /* JADX WARN: Type inference failed for: r2v2, types: [eُ٘ۤ, eًِۧ] */
    static {
        EnumC4169e enumC4169e = new EnumC4169e("CHROMA_TAB", 0, 0);
        f9186e = enumC4169e;
        EnumC4169e enumC4169e2 = new EnumC4169e("THICK", 1, 1);
        f9190e = enumC4169e2;
        EnumC4169e enumC4169e3 = new EnumC4169e("REGULAR", 2, 2);
        f9185e = enumC4169e3;
        EnumC4169e enumC4169e4 = new EnumC4169e("THIN", 3, 3);
        f9193e = enumC4169e4;
        EnumC4169e enumC4169e5 = new EnumC4169e("ULTRA_THIN", 4, 4);
        f9192e = enumC4169e5;
        EnumC4169e enumC4169e6 = new EnumC4169e("CHROMA_NAV", 5, 5);
        f9189e = enumC4169e6;
        EnumC4169e[] enumC4169eArr = {enumC4169e, enumC4169e2, enumC4169e3, enumC4169e4, enumC4169e5, enumC4169e6};
        f9191e = enumC4169eArr;
        f9187e = new C15937e(enumC4169eArr);
        f9188e = new AbstractC11069e(1, AbstractC3820e.ad.vip(EnumC4169e.class), 2, enumC4169e);
    }

    public EnumC4169e(String str, int i, int i2) {
        this.f9194e = i2;
    }

    public static EnumC4169e valueOf(String str) {
        return (EnumC4169e) Enum.valueOf(EnumC4169e.class, str);
    }

    public static EnumC4169e[] values() {
        return (EnumC4169e[]) f9191e.clone();
    }

    @Override // defpackage.InterfaceC14001e
    public final int getValue() {
        return this.f9194e;
    }
}
