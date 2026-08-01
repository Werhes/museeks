package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3144e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3144e[] f7212e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC3144e f7213e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f7214e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7215e;

    static {
        EnumC3144e enumC3144e = new EnumC3144e("TITLE", 0, R.string.local_sort_title);
        f7213e = enumC3144e;
        EnumC3144e[] enumC3144eArr = {enumC3144e, new EnumC3144e("ARTIST", 1, R.string.local_sort_artist), new EnumC3144e("ALBUM", 2, R.string.local_sort_album), new EnumC3144e("DATE_ADDED", 3, R.string.local_sort_date_add), new EnumC3144e("YEAR", 4, R.string.local_sort_year)};
        f7212e = enumC3144eArr;
        f7214e = new C15937e(enumC3144eArr);
    }

    public EnumC3144e(String str, int i, int i2) {
        this.f7215e = i2;
    }

    public static EnumC3144e valueOf(String str) {
        return (EnumC3144e) Enum.valueOf(EnumC3144e.class, str);
    }

    public static EnumC3144e[] values() {
        return (EnumC3144e[]) f7212e.clone();
    }
}
