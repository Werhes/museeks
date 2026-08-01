package defpackage;

/* renamed from: eٖٛٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16331e implements InterfaceC3894e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16351e f32090e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f32091e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f32092e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16331e f32086e = new C16331e("mceliece348864", 12, 3488, 64, false);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16331e f32080e = new C16331e("mceliece348864f", 12, 3488, 64, true);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16331e f32089e = new C16331e("mceliece460896", 13, 4608, 96, false);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C16331e f32088e = new C16331e("mceliece460896f", 13, 4608, 96, true);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16331e f32084e = new C16331e("mceliece6688128", 13, 6688, 128, false);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C16331e f32087e = new C16331e("mceliece6688128f", 13, 6688, 128, true);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C16331e f32083e = new C16331e("mceliece6960119", 13, 6960, 119, false);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C16331e f32085e = new C16331e("mceliece6960119f", 13, 6960, 119, true);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C16331e f32082e = new C16331e("mceliece8192128", 13, 8192, 128, false);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C16331e f32081e = new C16331e("mceliece8192128f", 13, 8192, 128, true);

    /* JADX WARN: Type inference failed for: r1v1, types: [eٖٜٛ, java.lang.Object] */
    public C16331e(String str, int i, int i2, int i3, boolean z) {
        this.f32092e = str;
        this.f32091e = i3;
        ?? obj = new Object();
        obj.adcel = z;
        obj.ad = i2;
        obj.vip = i3;
        obj.metrica = i;
        obj.license = i3 * 2;
        int i4 = i3 * i;
        obj.appmetrica = i4;
        obj.purchase = i2 - i4;
        obj.billing = (1 << i) - 1;
        obj.yandex = i == 12 ? new C7290e(0) : new C7290e(1);
        obj.startapp = i3 % 8 != 0;
        this.f32090e = obj;
    }
}
