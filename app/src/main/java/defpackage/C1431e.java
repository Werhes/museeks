package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431e extends AbstractC10727e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C2815e f4265e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0909e f4266e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public float f4267e = 1.0f;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C4383e f4268e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC16154e f4269e;

    public C1431e(InterfaceC16154e interfaceC16154e, C4383e c4383e, C0909e c0909e) {
        this.f4269e = interfaceC16154e;
        this.f4268e = c4383e;
        this.f4266e = c0909e;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        C4394e c4394e;
        C0909e c0909e = this.f4266e;
        InterfaceC16154e interfaceC16154e = this.f4269e;
        long yandex = interfaceC2235e.yandex();
        EnumC7792e layoutDirection = interfaceC2235e.getLayoutDirection();
        C4383e c4383e = this.f4268e;
        synchronized (c0909e) {
            C15919e c15919e = (C15919e) c0909e.f3321e;
            if (c15919e == null) {
                C15919e c15919e2 = new C15919e(AbstractC10432e.ad, 0L, EnumC7792e.f15794e, 1.0f, null);
                c0909e.f3321e = c15919e2;
                c15919e = c15919e2;
            }
            c15919e.ad = interfaceC16154e;
            c15919e.vip = yandex;
            c15919e.metrica = layoutDirection;
            c15919e.license = interfaceC2235e.vip();
            c15919e.appmetrica = c4383e;
            C0583e c0583e = (C0583e) c0909e.f3322e;
            if (c0583e == null) {
                c0583e = new C0583e();
                c0909e.f3322e = c0583e;
            }
            C4394e c4394e2 = (C4394e) c0583e.billing(c15919e);
            if (c4394e2 == null) {
                c4394e2 = new C4394e(c4383e, interfaceC16154e.ad(yandex, layoutDirection, interfaceC2235e));
                C0583e c0583e2 = (C0583e) c0909e.f3322e;
                if (c0583e2 == null) {
                    c0583e2 = new C0583e();
                    c0909e.f3322e = c0583e2;
                }
                c0583e2.amazon(C15919e.ad(c15919e), c4394e2);
            }
            c4394e = c4394e2;
        }
        C2815e c2815e = this.f4265e;
        long yandex2 = interfaceC2235e.yandex();
        C4383e c4383e2 = this.f4268e;
        c4394e.vip(interfaceC2235e, c2815e, yandex2, c4383e2.appmetrica, c4383e2.purchase, AbstractC3062e.vip(this.f4267e * c4383e2.billing, 0.0f, 1.0f), this.f4268e.license);
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f4265e = c2815e;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f4267e = f;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final void purchase(EnumC7792e enumC7792e) {
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return 9205357640488583168L;
    }
}
