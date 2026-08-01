package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7419e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public float f15179e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f15180e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f15181e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f15182e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f15183e;

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long m2291e = m2291e(abstractC9292e);
        if (C5602e.purchase(m2291e)) {
            return C5602e.yandex(m2291e);
        }
        if (!this.f15183e) {
            i = AbstractC2278e.purchase(i, m2291e);
        }
        return AbstractC2278e.billing(interfaceC16719e.loadAd(i), m2291e);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long m2291e = m2291e(abstractC9292e);
        if (C5602e.appmetrica(m2291e)) {
            return C5602e.billing(m2291e);
        }
        if (!this.f15183e) {
            i = AbstractC2278e.billing(i, m2291e);
        }
        return AbstractC2278e.purchase(interfaceC16719e.mo2529while(i), m2291e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m2291e(defpackage.InterfaceC13158e r7) {
        /*
            r6 = this;
            float r0 = r6.f15180e
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f15180e
            int r0 = r7.mo493e(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f15179e
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f15179e
            int r3 = r7.mo493e(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f15181e
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f15181e
            int r4 = r7.mo493e(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f15182e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f15182e
            int r7 = r7.mo493e(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = defpackage.AbstractC2278e.ad(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7419e.m2291e(eٍْٕ):long");
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        int adcel;
        int yandex;
        int startapp;
        int billing;
        long ad;
        long m2291e = m2291e(interfaceC13158e);
        if (this.f15183e) {
            ad = AbstractC2278e.appmetrica(j, m2291e);
        } else {
            if (Float.isNaN(this.f15181e)) {
                adcel = C5602e.adcel(j);
                int yandex2 = C5602e.yandex(m2291e);
                if (adcel > yandex2) {
                    adcel = yandex2;
                }
            } else {
                adcel = C5602e.adcel(m2291e);
            }
            if (Float.isNaN(this.f15180e)) {
                yandex = C5602e.yandex(j);
                int adcel2 = C5602e.adcel(m2291e);
                if (yandex < adcel2) {
                    yandex = adcel2;
                }
            } else {
                yandex = C5602e.yandex(m2291e);
            }
            if (Float.isNaN(this.f15182e)) {
                startapp = C5602e.startapp(j);
                int billing2 = C5602e.billing(m2291e);
                if (startapp > billing2) {
                    startapp = billing2;
                }
            } else {
                startapp = C5602e.startapp(m2291e);
            }
            if (Float.isNaN(this.f15179e)) {
                billing = C5602e.billing(j);
                int startapp2 = C5602e.startapp(m2291e);
                if (billing < startapp2) {
                    billing = startapp2;
                }
            } else {
                billing = C5602e.billing(m2291e);
            }
            ad = AbstractC2278e.ad(adcel, yandex, startapp, billing);
        }
        AbstractC2832e admob = interfaceC16719e.admob(ad);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 12));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long m2291e = m2291e(abstractC9292e);
        if (C5602e.appmetrica(m2291e)) {
            return C5602e.billing(m2291e);
        }
        if (!this.f15183e) {
            i = AbstractC2278e.billing(i, m2291e);
        }
        return AbstractC2278e.purchase(interfaceC16719e.metrica(i), m2291e);
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        long m2291e = m2291e(abstractC9292e);
        if (C5602e.purchase(m2291e)) {
            return C5602e.yandex(m2291e);
        }
        if (!this.f15183e) {
            i = AbstractC2278e.purchase(i, m2291e);
        }
        return AbstractC2278e.billing(interfaceC16719e.smaato(i), m2291e);
    }
}
