package defpackage;

/* renamed from: eِۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12048e implements InterfaceC3894e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f24091e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24092e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f24093e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f24094e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24095e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f24096e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC9567e f24097e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C12048e f24088e = new C12048e(3, 1);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C12048e f24090e = new C12048e(3, 2);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C12048e f24087e = new C12048e(3, 3);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C12048e f24089e = new C12048e(5, 1);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C12048e f24086e = new C12048e(5, 2);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C12048e f24085e = new C12048e(5, 3);

    public C12048e(int i, int i2) {
        AbstractC9567e c9071e;
        if (i == 3) {
            this.f24095e = 68;
            this.f24093e = 32;
            this.f24092e = 48;
            c9071e = new C9071e();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f24095e = 96;
            this.f24093e = 36;
            this.f24092e = 64;
            c9071e = new C15708e();
        }
        this.f24097e = c9071e;
        int i3 = this.f24095e;
        int i4 = this.f24093e;
        int i5 = this.f24092e;
        this.f24094e = i3 + i4 + i5;
        this.f24091e = i4 + i5;
        this.f24096e = i2;
    }
}
