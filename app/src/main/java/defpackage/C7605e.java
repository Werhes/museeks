package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۦٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7605e extends AbstractC10727e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C2815e f15455e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0909e f15456e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public float f15457e = 1.0f;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C4383e f15458e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC16154e f15459e;

    public C7605e(InterfaceC16154e interfaceC16154e, C4383e c4383e, C0909e c0909e) {
        this.f15459e = interfaceC16154e;
        this.f15458e = c4383e;
        this.f15456e = c0909e;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        C3888e c3888e;
        C0909e c0909e = this.f15456e;
        InterfaceC16154e interfaceC16154e = this.f15459e;
        long yandex = interfaceC2235e.yandex();
        EnumC7792e layoutDirection = interfaceC2235e.getLayoutDirection();
        C4383e c4383e = this.f15458e;
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
            c15919e.appmetrica = new C4383e(c4383e.ad, c4383e.vip, 0L, c4383e.appmetrica, c4383e.purchase, c4383e.billing, c4383e.license);
            C0583e c0583e = (C0583e) c0909e.f3323e;
            if (c0583e == null) {
                c0583e = new C0583e();
                c0909e.f3323e = c0583e;
            }
            c3888e = (C3888e) c0583e.billing(c15919e);
            if (c3888e == null) {
                c3888e = new C3888e(c4383e, interfaceC16154e.ad(yandex, layoutDirection, interfaceC2235e));
                C0583e c0583e2 = (C0583e) c0909e.f3323e;
                if (c0583e2 == null) {
                    c0583e2 = new C0583e();
                    c0909e.f3323e = c0583e2;
                }
                c0583e2.amazon(C15919e.ad(c15919e), c3888e);
            }
        }
        float mo497instanceof = interfaceC2235e.mo497instanceof(C8163e.ad(this.f15458e.metrica));
        float mo497instanceof2 = interfaceC2235e.mo497instanceof(C8163e.vip(this.f15458e.metrica));
        ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(mo497instanceof, mo497instanceof2);
        try {
            C2815e c2815e = this.f15455e;
            long yandex2 = interfaceC2235e.yandex();
            C4383e c4383e2 = c3888e.startapp;
            c3888e.vip(interfaceC2235e, c2815e, yandex2, c4383e2.appmetrica, c4383e2.purchase, AbstractC3062e.vip(this.f15457e * c4383e2.billing, 0.0f, 1.0f), c3888e.startapp.license);
        } finally {
            ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-mo497instanceof, -mo497instanceof2);
        }
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f15455e = c2815e;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f15457e = f;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return 9205357640488583168L;
    }
}
