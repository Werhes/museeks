package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC15009e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f29734e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15009e[] f29735e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f29736e;

    static {
        EnumC15009e[] enumC15009eArr = {new EnumC15009e("JANUARY", 0, "Jan"), new EnumC15009e("FEBRUARY", 1, "Feb"), new EnumC15009e("MARCH", 2, "Mar"), new EnumC15009e("APRIL", 3, "Apr"), new EnumC15009e("MAY", 4, "May"), new EnumC15009e("JUNE", 5, "Jun"), new EnumC15009e("JULY", 6, "Jul"), new EnumC15009e("AUGUST", 7, "Aug"), new EnumC15009e("SEPTEMBER", 8, "Sep"), new EnumC15009e("OCTOBER", 9, "Oct"), new EnumC15009e("NOVEMBER", 10, "Nov"), new EnumC15009e("DECEMBER", 11, "Dec")};
        f29735e = enumC15009eArr;
        f29734e = new C15937e(enumC15009eArr);
    }

    public EnumC15009e(String str, int i, String str2) {
        this.f29736e = str2;
    }

    public static EnumC15009e valueOf(String str) {
        return (EnumC15009e) Enum.valueOf(EnumC15009e.class, str);
    }

    public static EnumC15009e[] values() {
        return (EnumC15009e[]) f29735e.clone();
    }
}
