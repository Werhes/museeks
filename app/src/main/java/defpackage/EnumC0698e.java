package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0698e implements InterfaceC14001e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC0698e f2984e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC0698e f2985e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C14149e f2986e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f2987e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC0698e f2988e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0698e[] f2989e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC0698e f2990e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f2991e;

    /* JADX WARN: Type inference failed for: r2v2, types: [eُ٘ۤ, eؚٟٓ] */
    static {
        EnumC0698e enumC0698e = new EnumC0698e("VK", 0, 0);
        f2985e = enumC0698e;
        EnumC0698e enumC0698e2 = new EnumC0698e("GENIUS", 1, 1);
        f2988e = enumC0698e2;
        EnumC0698e enumC0698e3 = new EnumC0698e("MUSIXMATCH", 2, 2);
        f2984e = enumC0698e3;
        EnumC0698e enumC0698e4 = new EnumC0698e("LRCLIB", 3, 3);
        f2990e = enumC0698e4;
        EnumC0698e[] enumC0698eArr = {enumC0698e, enumC0698e2, enumC0698e3, enumC0698e4};
        f2989e = enumC0698eArr;
        f2987e = new C15937e(enumC0698eArr);
        f2986e = new AbstractC11069e(1, AbstractC3820e.ad.vip(EnumC0698e.class), 2, enumC0698e);
    }

    public EnumC0698e(String str, int i, int i2) {
        this.f2991e = i2;
    }

    public static EnumC0698e valueOf(String str) {
        return (EnumC0698e) Enum.valueOf(EnumC0698e.class, str);
    }

    public static EnumC0698e[] values() {
        return (EnumC0698e[]) f2989e.clone();
    }

    @Override // defpackage.InterfaceC14001e
    public final int getValue() {
        return this.f2991e;
    }
}
