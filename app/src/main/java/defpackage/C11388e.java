package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11388e {
    public final C12380e ad;
    public final C0576e appmetrica;
    public final C6656e license;
    public final InterfaceC13858e metrica;
    public InterfaceC12006e vip;

    public C11388e(C12380e c12380e, InterfaceC12006e interfaceC12006e, InterfaceC13858e interfaceC13858e) {
        this.ad = c12380e;
        this.vip = interfaceC12006e;
        this.metrica = interfaceC13858e;
        this.license = interfaceC13858e != null ? AbstractC14533e.purchase(new C16200e(this, interfaceC13858e, 0)) : null;
        this.appmetrica = AbstractC14533e.startapp(new C4217e(1, 1));
    }

    public static void startapp(C11388e c11388e, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        C12380e c12380e = c11388e.ad;
        InterfaceC12006e interfaceC12006e = c11388e.vip;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        long appmetrica = c11388e.appmetrica(j);
        c2573e.metrica(C12347e.billing(appmetrica), C12347e.purchase(appmetrica), str);
        int length = str.length() + C12347e.billing(appmetrica);
        AbstractC16377e.startapp(c2573e, length, length);
        c11388e.advert(c2573e);
        C12380e.ad(c12380e, interfaceC12006e, z, 1);
        c12380e.license(true);
    }

    public static void yandex(C11388e c11388e, CharSequence charSequence, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 1 : 3;
        if ((i & 8) != 0) {
            z = true;
        }
        C12380e c12380e = c11388e.ad;
        InterfaceC12006e interfaceC12006e = c11388e.vip;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        if (z2) {
            c2573e.purchase(null);
        }
        long j = c2573e.f6428e;
        c2573e.metrica(C12347e.billing(j), C12347e.purchase(j), charSequence);
        int length = charSequence.length() + C12347e.billing(j);
        AbstractC16377e.startapp(c2573e, length, length);
        c11388e.advert(c2573e);
        C12380e.ad(c12380e, interfaceC12006e, z, i2);
        c12380e.license(true);
    }

    public final void ad() {
        InterfaceC12006e interfaceC12006e = this.vip;
        C12380e c12380e = this.ad;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        int purchase = C12347e.purchase(c2573e.f6428e);
        AbstractC16377e.startapp(c2573e, purchase, purchase);
        C12380e.ad(c12380e, interfaceC12006e, true, 1);
        c12380e.license(true);
    }

    public final void adcel(long j) {
        mopub(appmetrica(j));
    }

    public final void advert(C2573e c2573e) {
        if (((C12431e) c2573e.ad().f33137e).f24868e <= 0 || !C12347e.license(c2573e.f6428e)) {
            return;
        }
        this.appmetrica.setValue(new C4217e(1, 1));
    }

    public final long appmetrica(long j) {
        C16585e c16585e;
        C6656e c6656e = this.license;
        C2025e c2025e = (c6656e == null || (c16585e = (C16585e) c6656e.getValue()) == null) ? null : c16585e.vip;
        if (c2025e == null) {
            return j;
        }
        int i = C12347e.metrica;
        long ad = c2025e.ad((int) (j >> 32), false);
        long ad2 = C12347e.license(j) ? ad : c2025e.ad((int) (4294967295L & j), false);
        int min = Math.min(C12347e.billing(ad), C12347e.billing(ad2));
        int max = Math.max(C12347e.purchase(ad), C12347e.purchase(ad2));
        return C12347e.yandex(j) ? AbstractC9262e.metrica(max, min) : AbstractC9262e.metrica(min, max);
    }

    public final void billing(CharSequence charSequence) {
        InterfaceC12006e interfaceC12006e = this.vip;
        C12380e c12380e = this.ad;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        c2573e.license(0, c2573e.f6429e.length(), BuildConfig.FLAVOR, 0, 0);
        c2573e.append(charSequence.toString());
        advert(c2573e);
        C12380e.ad(c12380e, interfaceC12006e, true, 1);
        c12380e.license(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11388e)) {
            return false;
        }
        C11388e c11388e = (C11388e) obj;
        return AbstractC7890e.billing(this.ad, c11388e.ad) && AbstractC7890e.billing(this.metrica, c11388e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        InterfaceC13858e interfaceC13858e = this.metrica;
        return (hashCode + (interfaceC13858e != null ? interfaceC13858e.hashCode() : 0)) * 31;
    }

    public final C17013e license() {
        C16585e c16585e;
        C6656e c6656e = this.license;
        return (c6656e == null || (c16585e = (C16585e) c6656e.getValue()) == null) ? this.ad.vip() : c16585e.ad;
    }

    public final void metrica() {
        InterfaceC12006e interfaceC12006e = this.vip;
        C12380e c12380e = this.ad;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        c2573e.license(C12347e.billing(c2573e.f6428e), C12347e.purchase(c2573e.f6428e), BuildConfig.FLAVOR, 0, 0);
        int billing = C12347e.billing(c2573e.f6428e);
        AbstractC16377e.startapp(c2573e, billing, billing);
        advert(c2573e);
        C12380e.ad(c12380e, interfaceC12006e, true, 3);
        c12380e.license(true);
    }

    public final void mopub(long j) {
        InterfaceC12006e interfaceC12006e = this.vip;
        C12380e c12380e = this.ad;
        c12380e.vip.ad().admob();
        C2573e c2573e = c12380e.vip;
        int i = C12347e.metrica;
        AbstractC16377e.startapp(c2573e, (int) (j >> 32), (int) (j & 4294967295L));
        C12380e.ad(c12380e, interfaceC12006e, true, 1);
        c12380e.license(true);
    }

    public final long purchase(long j) {
        C16585e c16585e;
        C6656e c6656e = this.license;
        C2025e c2025e = (c6656e == null || (c16585e = (C16585e) c6656e.getValue()) == null) ? null : c16585e.vip;
        return c2025e != null ? C10659e.advert(j, c2025e, (C4217e) this.appmetrica.getValue()) : j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        C12380e c12380e = this.ad;
        sb.append(c12380e);
        sb.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb.append(this.metrica);
        sb.append(", codepointTransformedText=");
        sb.append(this.license);
        sb.append(", outputText=\"");
        sb.append((Object) c12380e.vip());
        sb.append("\", visualText=\"");
        sb.append((Object) license());
        sb.append("\")");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.C14129e r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C5313e
            if (r0 == 0) goto L13
            r0 = r6
            eٌؗۨ r0 = (defpackage.C5313e) r0
            int r1 = r0.f11408e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11408e = r1
            goto L18
        L13:
            eٌؗۨ r0 = new eٌؗۨ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11407e
            int r1 = r0.f11408e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.AbstractC2003e.purchase(r6)
            goto L58
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f11408e = r2
            eْۢ٘ r6 = new eْۢ٘
            eًؗۖ r0 = defpackage.AbstractC10558e.startapp(r0)
            r6.<init>(r2, r0)
            r6.tapsense()
            eٍّٕ r0 = r4.ad
            eّّؔ r0 = r0.purchase
            r0.license(r5)
            eًٜ٘ r0 = new eًٜ٘
            r1 = 26
            r0.<init>(r4, r5, r1)
            r6.inmobi(r0)
            java.lang.Object r5 = r6.signatures()
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L58
            return
        L58:
            eٔٚؖ r5 = new eٔٚؖ
            r6 = 9
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11388e.vip(eٓٞؕ, eُؑ۠):void");
    }
}
