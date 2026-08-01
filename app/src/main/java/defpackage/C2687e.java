package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2687e extends TextPaint {
    public C11447e ad;
    public C3618e appmetrica;
    public C6656e billing;
    public C13973e license;
    public int metrica;
    public AbstractC4457e purchase;
    public AbstractC4970e startapp;
    public C11964e vip;
    public C2108e yandex;

    public final C11447e ad() {
        C11447e c11447e = this.ad;
        if (c11447e != null) {
            return c11447e;
        }
        C11447e c11447e2 = new C11447e(this);
        this.ad = c11447e2;
        return c11447e2;
    }

    public final void appmetrica(AbstractC4970e abstractC4970e) {
        if (abstractC4970e == null || AbstractC7890e.billing(this.startapp, abstractC4970e)) {
            return;
        }
        this.startapp = abstractC4970e;
        if (abstractC4970e.equals(C6590e.ad)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC4970e instanceof C13121e)) {
            throw new C14803e(10);
        }
        ad().smaato(1);
        C13121e c13121e = (C13121e) abstractC4970e;
        ad().advert(c13121e.ad);
        C11447e ad = ad();
        ad.ad.setStrokeMiter(c13121e.vip);
        ad().mopub(c13121e.license);
        ad().adcel(c13121e.metrica);
        ad().yandex(c13121e.appmetrica);
    }

    public final void billing(C11964e c11964e) {
        if (c11964e == null || AbstractC7890e.billing(this.vip, c11964e)) {
            return;
        }
        this.vip = c11964e;
        int i = c11964e.ad;
        setUnderlineText((i | 1) == i);
        int i2 = this.vip.ad;
        setStrikeThruText((i2 | 2) == i2);
    }

    public final void license(long j) {
        C3618e c3618e = this.appmetrica;
        if (c3618e == null ? false : C3618e.metrica(c3618e.ad, j)) {
            return;
        }
        if (j != 16) {
            this.appmetrica = new C3618e(j);
            setColor(AbstractC6532e.m2193extends(j));
            this.billing = null;
            this.purchase = null;
            this.yandex = null;
            setShader(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : defpackage.C2108e.vip(r1.ad, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica(defpackage.AbstractC4457e r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.billing = r0
            r5.purchase = r0
            r5.yandex = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.C18466e
            if (r1 == 0) goto L1d
            eۣۧ r6 = (defpackage.C18466e) r6
            long r6 = r6.ad
            long r6 = defpackage.AbstractC0426e.license(r9, r6)
            r5.license(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.AbstractC9876e
            if (r1 == 0) goto L72
            eۣؖؒ r1 = r5.purchase
            boolean r1 = defpackage.AbstractC7890e.billing(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            eْؓۜ r1 = r5.yandex
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.ad
            boolean r1 = defpackage.C2108e.vip(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.purchase = r6
            eْؓۜ r1 = new eْؓۜ
            r1.<init>(r7)
            r5.yandex = r1
            eْٔۨ r1 = new eْٔۨ
            r2 = 0
            r1.<init>(r6, r7, r2)
            eؙۛۘ r6 = defpackage.AbstractC14533e.purchase(r1)
            r5.billing = r6
        L59:
            eِؑۖ r6 = r5.ad()
            eؙۛۘ r7 = r5.billing
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L69
        L68:
            r7 = r0
        L69:
            r6.startapp(r7)
            r5.appmetrica = r0
            defpackage.AbstractC5729e.license(r5, r9)
            return
        L72:
            eٔٚؖ r6 = new eٔٚؖ
            r7 = 10
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2687e.metrica(eۣؖؒ, long, float):void");
    }

    public final void purchase(C13973e c13973e) {
        if (c13973e == null || AbstractC7890e.billing(this.license, c13973e)) {
            return;
        }
        this.license = c13973e;
        if (c13973e.equals(C13973e.license)) {
            clearShadowLayer();
            return;
        }
        C13973e c13973e2 = this.license;
        float f = c13973e2.metrica;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (c13973e2.vip >> 32)), Float.intBitsToFloat((int) (this.license.vip & 4294967295L)), AbstractC6532e.m2193extends(this.license.ad));
    }

    public final void vip(int i) {
        if (i == this.metrica) {
            return;
        }
        ad().license(i);
        this.metrica = i;
    }
}
