package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1812e f4886e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C1812e f4887e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C1812e f4888e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C1812e f4889e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C1812e f4890e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C1812e f4891e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C1812e f4892e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C1812e f4893e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f4894e;

    static {
        C1812e c1812e = new C1812e(100);
        C1812e c1812e2 = new C1812e(200);
        C1812e c1812e3 = new C1812e(300);
        C1812e c1812e4 = new C1812e(400);
        f4888e = c1812e4;
        C1812e c1812e5 = new C1812e(500);
        f4887e = c1812e5;
        C1812e c1812e6 = new C1812e(600);
        f4890e = c1812e6;
        C1812e c1812e7 = new C1812e(700);
        C1812e c1812e8 = new C1812e(800);
        C1812e c1812e9 = new C1812e(900);
        f4886e = c1812e3;
        f4893e = c1812e4;
        f4892e = c1812e5;
        f4889e = c1812e6;
        f4891e = c1812e7;
        AbstractC6874e.startapp(c1812e, c1812e2, c1812e3, c1812e4, c1812e5, c1812e6, c1812e7, c1812e8, c1812e9);
    }

    public C1812e(int i) {
        this.f4894e = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC5525e.ad("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1812e c1812e) {
        return AbstractC7890e.yandex(this.f4894e, c1812e.f4894e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1812e) {
            return this.f4894e == ((C1812e) obj).f4894e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4894e;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("FontWeight(weight="), this.f4894e, ')');
    }
}
