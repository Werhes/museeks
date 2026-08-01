package defpackage;

import org.conscrypt.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC12651e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC12651e f25367e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC12651e f25368e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC12651e f25369e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12651e[] f25370e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC12651e f25371e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f25372e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC12651e f25373e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC12651e f25374e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f25375e;

    static {
        EnumC12651e enumC12651e = new EnumC12651e("EVERYBODY", 0, "all");
        f25369e = enumC12651e;
        EnumC12651e enumC12651e2 = new EnumC12651e("FRIENDS_AND_FOF", 1, "friends_of_friends");
        f25368e = enumC12651e2;
        EnumC12651e enumC12651e3 = new EnumC12651e("FRIENDS", 2, "friends");
        f25371e = enumC12651e3;
        EnumC12651e enumC12651e4 = new EnumC12651e("ONLY_ME", 3, "only_me");
        f25367e = enumC12651e4;
        EnumC12651e enumC12651e5 = new EnumC12651e("SOME", 4, "some");
        f25374e = enumC12651e5;
        EnumC12651e enumC12651e6 = new EnumC12651e("UNKNOWN", 5, BuildConfig.FLAVOR);
        f25373e = enumC12651e6;
        EnumC12651e[] enumC12651eArr = {enumC12651e, enumC12651e2, enumC12651e3, enumC12651e4, enumC12651e5, enumC12651e6};
        f25370e = enumC12651eArr;
        f25372e = new C15937e(enumC12651eArr);
    }

    public EnumC12651e(String str, int i, String str2) {
        this.f25375e = str2;
    }

    public static EnumC12651e valueOf(String str) {
        return (EnumC12651e) Enum.valueOf(EnumC12651e.class, str);
    }

    public static EnumC12651e[] values() {
        return (EnumC12651e[]) f25370e.clone();
    }
}
