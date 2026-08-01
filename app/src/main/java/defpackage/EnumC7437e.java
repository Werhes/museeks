package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7437e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC7437e f15206e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7437e f15207e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7437e[] f15208e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC7437e f15209e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f15210e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC7437e f15211e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC7437e f15212e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f15213e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f15214e;

    static {
        EnumC7437e enumC7437e = new EnumC7437e(0, "DEVELOPER", "(meta) Display debugging features", false);
        f15207e = enumC7437e;
        EnumC7437e enumC7437e2 = new EnumC7437e(1, "TOKEN_AUTOREFRESH", "Token autorefresh", true);
        f15209e = enumC7437e2;
        EnumC7437e enumC7437e3 = new EnumC7437e(2, "LEGACY_DOCK", "Legacy NextDock", false);
        f15206e = enumC7437e3;
        EnumC7437e enumC7437e4 = new EnumC7437e(3, "LIBCATALOG_IGNORE_UNKNOWN", "Ignore unknown data", true);
        f15212e = enumC7437e4;
        EnumC7437e enumC7437e5 = new EnumC7437e(4, "RESUME_PLAYBACK", "System Resume Playback", false);
        f15211e = enumC7437e5;
        EnumC7437e[] enumC7437eArr = {enumC7437e, enumC7437e2, enumC7437e3, enumC7437e4, enumC7437e5};
        f15208e = enumC7437eArr;
        f15210e = new C15937e(enumC7437eArr);
    }

    public EnumC7437e(int i, String str, String str2, boolean z) {
        this.f15214e = str2;
        this.f15213e = z;
    }

    public static EnumC7437e valueOf(String str) {
        return (EnumC7437e) Enum.valueOf(EnumC7437e.class, str);
    }

    public static EnumC7437e[] values() {
        return (EnumC7437e[]) f15208e.clone();
    }
}
