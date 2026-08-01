package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7102e {
    public final C2371e ad;
    public final C0576e appmetrica;
    public final C15212e billing;
    public final C0576e license;
    public final C0576e metrica;
    public final C0576e purchase;
    public final C2371e vip;

    public C7102e() {
        C2371e c2371e = new C2371e();
        this.ad = c2371e;
        this.vip = c2371e;
        C10990e c10990e = C10990e.f21771e;
        this.metrica = new C0576e(null, c10990e);
        this.license = new C0576e(null, c10990e);
        this.appmetrica = new C0576e(null, c10990e);
        this.purchase = AbstractC14533e.startapp(new C15765e(0));
        this.billing = new C15212e();
    }

    public final long ad(long j) {
        C0763e c0763e;
        InterfaceC0043e appmetrica = appmetrica();
        C0763e c0763e2 = C0763e.appmetrica;
        if (appmetrica != null) {
            if (appmetrica.billing()) {
                InterfaceC0043e vip = vip();
                c0763e = vip != null ? vip.mo208goto(appmetrica, true) : null;
            } else {
                c0763e = c0763e2;
            }
            if (c0763e != null) {
                c0763e2 = c0763e;
            }
        }
        return AbstractC17416e.ad(j, c0763e2);
    }

    public final InterfaceC0043e appmetrica() {
        return (InterfaceC0043e) this.metrica.getValue();
    }

    public final int license(long j, boolean z) {
        C12476e metrica = metrica();
        if (metrica == null) {
            return -1;
        }
        if (z) {
            j = ad(j);
        }
        return metrica.vip.billing(AbstractC17416e.vip(this, j));
    }

    public final C12476e metrica() {
        return (C12476e) this.vip.getValue();
    }

    public final boolean purchase(long j) {
        C12476e metrica = metrica();
        if (metrica == null) {
            return false;
        }
        long vip = AbstractC17416e.vip(this, ad(j));
        int appmetrica = metrica.vip.appmetrica(Float.intBitsToFloat((int) (4294967295L & vip)));
        int i = (int) (vip >> 32);
        return Float.intBitsToFloat(i) >= metrica.billing(appmetrica) && Float.intBitsToFloat(i) <= metrica.yandex(appmetrica);
    }

    public final InterfaceC0043e vip() {
        return (InterfaceC0043e) this.appmetrica.getValue();
    }
}
