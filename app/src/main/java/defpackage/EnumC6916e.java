package defpackage;

import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6916e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f14170e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final EnumC6916e f14171e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6916e[] f14172e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC6916e f14173e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC6916e f14174e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f14175e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f14176e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f14177e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f14178e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f14179e;

    static {
        EnumC6916e enumC6916e = new EnumC6916e("Default", 0, BuildConfig.FLAVOR, R.string.icon_default, R.mipmap.ic_launcher, true, true);
        f14174e = enumC6916e;
        EnumC6916e enumC6916e2 = new EnumC6916e("Filled", 1, "Filled", R.string.icon_default_filled, R.mipmap.vkx_icon_filled, true, true);
        EnumC6916e enumC6916e3 = new EnumC6916e("Monet", 2, "Monet", R.string.a12_monet, R.drawable.vkx_icon_monet, true, true);
        f14173e = enumC6916e3;
        EnumC6916e enumC6916e4 = new EnumC6916e("McModern", 3, "McModern", R.string.icon_mc_modern, R.mipmap.vkx_icon_mc, true, true);
        EnumC6916e enumC6916e5 = new EnumC6916e("Blue", 4, "Blue", R.string.icon_blue, R.mipmap.vkx_icon_blue, false, true);
        EnumC6916e enumC6916e6 = new EnumC6916e("BlueFilled", 5, "BlueFilled", R.string.icon_blue_filled, R.mipmap.vkx_icon_filled_blue, false, true);
        EnumC6916e enumC6916e7 = new EnumC6916e("Emerald", 6, "Emerald", R.string.icon_emerald, R.mipmap.vkx_icon_emerald, false, true);
        EnumC6916e enumC6916e8 = new EnumC6916e("EmeraldFilled", 7, "EmeraldFilled", R.string.icon_emerald_filled, R.mipmap.vkx_icon_filled_emerald, false, true);
        EnumC6916e enumC6916e9 = new EnumC6916e("Morning", 8, "Morning", R.string.icon_morning, R.mipmap.vkx_icon_morning, false, true);
        EnumC6916e enumC6916e10 = new EnumC6916e("MorningFilled", 9, "MorningFilled", R.string.icon_morning_filled, R.mipmap.vkx_icon_filled_morning, false, true);
        EnumC6916e enumC6916e11 = new EnumC6916e("Rc", 10, "Rc", R.string.icon_default, R.mipmap.vkx_icon_rc, false, false);
        f14171e = enumC6916e11;
        EnumC6916e[] enumC6916eArr = {enumC6916e, enumC6916e2, enumC6916e3, enumC6916e4, enumC6916e5, enumC6916e6, enumC6916e7, enumC6916e8, enumC6916e9, enumC6916e10, enumC6916e11};
        f14172e = enumC6916eArr;
        f14170e = new C15937e(enumC6916eArr);
    }

    public EnumC6916e(String str, int i, String str2, int i2, int i3, boolean z, boolean z2) {
        this.f14179e = str2;
        this.f14177e = i2;
        this.f14176e = i3;
        this.f14178e = z;
        this.f14175e = z2;
    }

    public static EnumC6916e valueOf(String str) {
        return (EnumC6916e) Enum.valueOf(EnumC6916e.class, str);
    }

    public static EnumC6916e[] values() {
        return (EnumC6916e[]) f14172e.clone();
    }
}
