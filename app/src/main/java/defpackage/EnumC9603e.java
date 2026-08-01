package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٝؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9603e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9603e[] f19048e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9603e f19049e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f19050e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f19051e;

    static {
        EnumC9603e enumC9603e = new EnumC9603e("Default", 0, R.string.library_sort_order_default);
        f19049e = enumC9603e;
        EnumC9603e[] enumC9603eArr = {enumC9603e, new EnumC9603e("Invert", 1, R.string.library_sort_order_inverse), new EnumC9603e("Title", 2, R.string.library_sort_order_title), new EnumC9603e("TitleInvert", 3, R.string.library_sort_order_title_inverse), new EnumC9603e("Subtitle", 4, R.string.library_sort_order_author), new EnumC9603e("SubtitleInvert", 5, R.string.library_sort_order_author_inverse)};
        f19048e = enumC9603eArr;
        f19050e = new C15937e(enumC9603eArr);
    }

    public EnumC9603e(String str, int i, int i2) {
        this.f19051e = i2;
    }

    public static EnumC9603e valueOf(String str) {
        return (EnumC9603e) Enum.valueOf(EnumC9603e.class, str);
    }

    public static EnumC9603e[] values() {
        return (EnumC9603e[]) f19048e.clone();
    }
}
