package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC12987e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12987e[] f25889e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC12987e f25890e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f25891e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f25892e;

    static {
        EnumC12987e enumC12987e = new EnumC12987e("TITLE", 0, R.string.local_sort_title);
        f25890e = enumC12987e;
        EnumC12987e[] enumC12987eArr = {enumC12987e, new EnumC12987e("ARTIST", 1, R.string.local_sort_artist), new EnumC12987e("SONG_NUMBER", 2, R.string.local_sort_songnum), new EnumC12987e("YEAR", 3, R.string.local_sort_year)};
        f25889e = enumC12987eArr;
        f25891e = new C15937e(enumC12987eArr);
    }

    public EnumC12987e(String str, int i, int i2) {
        this.f25892e = i2;
    }

    public static EnumC12987e valueOf(String str) {
        return (EnumC12987e) Enum.valueOf(EnumC12987e.class, str);
    }

    public static EnumC12987e[] values() {
        return (EnumC12987e[]) f25889e.clone();
    }
}
