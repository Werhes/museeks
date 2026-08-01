package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'eٗۚۖ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18011e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC18011e f35317e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18011e[] f35318e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final EnumC18011e f35319e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC18011e f35320e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final EnumC18011e f35321e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC18011e f35322e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC18011e f35323e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f35324e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f35325e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f35326e;

    static {
        EnumC18011e enumC18011e = new EnumC18011e(0, R.drawable.ic_add_outline_28, R.string.mab_add, "ADD");
        f35320e = enumC18011e;
        EnumC18011e enumC18011e2 = new EnumC18011e("REMOVE", 1, R.drawable.ic_delete_outline_android_28, R.string.mab_added, R.attr.global_accent);
        f35317e = enumC18011e2;
        int i = R.string.buttonbar_pl_cache;
        int i2 = R.drawable.ic_download_outline_28;
        EnumC18011e enumC18011e3 = new EnumC18011e(2, i2, i, "CACHE");
        f35323e = enumC18011e3;
        EnumC18011e enumC18011e4 = new EnumC18011e("DELETE_CACHE", 3, R.drawable.ic_download_check_outline_28, R.string.buttonbar_pl_cached, R.attr.global_accent);
        f35322e = enumC18011e4;
        EnumC18011e enumC18011e5 = new EnumC18011e(4, i2, R.string.action_audio_dl2, "DOWNLOAD");
        EnumC18011e enumC18011e6 = new EnumC18011e(5, R.drawable.ic_share_outline_28, R.string.share, "SHARE");
        EnumC18011e enumC18011e7 = new EnumC18011e(6, R.drawable.ic_list_play_outline_28, R.string.buttonbar_pl_next, "PLAY_NEXT");
        f35319e = enumC18011e7;
        EnumC18011e enumC18011e8 = new EnumC18011e(7, R.drawable.ic_edit_outline_28, R.string.buttonbar_pl_edit, "EDIT");
        f35321e = enumC18011e8;
        f35318e = new EnumC18011e[]{enumC18011e, enumC18011e2, enumC18011e3, enumC18011e4, enumC18011e5, enumC18011e6, enumC18011e7, enumC18011e8};
    }

    public /* synthetic */ EnumC18011e(int i, int i2, int i3, String str) {
        this(str, i, i2, i3, R.attr.text_primary);
    }

    public EnumC18011e(String str, int i, int i2, int i3, int i4) {
        this.f35326e = i2;
        this.f35325e = i3;
        this.f35324e = i4;
    }

    public static EnumC18011e valueOf(String str) {
        return (EnumC18011e) Enum.valueOf(EnumC18011e.class, str);
    }

    public static EnumC18011e[] values() {
        return (EnumC18011e[]) f35318e.clone();
    }
}
