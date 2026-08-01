package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eٍۨؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9932e {
    public static final AbstractC7861e[] purchase = new AbstractC7861e[0];
    public final AbstractC0362e ad;
    public Hashtable appmetrica;
    public final AbstractC7861e[] license;
    public final AbstractC7861e metrica;
    public final AbstractC7861e vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC9932e(defpackage.AbstractC0362e r7, defpackage.AbstractC7861e r8, defpackage.AbstractC7861e r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = r0
            goto L7
        L5:
            int r1 = r7.purchase
        L7:
            if (r1 == 0) goto L42
            r2 = 5
            if (r1 == r2) goto L42
            java.math.BigInteger r2 = defpackage.InterfaceC4563e.Signature
            eًُ٘ r2 = r7.adcel(r2)
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L3d
            r5 = 3
            if (r1 == r5) goto L33
            r5 = 4
            if (r1 == r5) goto L2a
            r4 = 6
            if (r1 != r4) goto L22
            goto L3d
        L22:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L2a:
            eًُ٘ r1 = r7.vip
            eًُ٘[] r4 = new defpackage.AbstractC7861e[r4]
            r4[r0] = r2
            r4[r3] = r1
            goto L44
        L33:
            eًُ٘[] r1 = new defpackage.AbstractC7861e[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            r4 = r1
            goto L44
        L3d:
            eًُ٘[] r4 = new defpackage.AbstractC7861e[r3]
            r4[r0] = r2
            goto L44
        L42:
            eًُ٘[] r4 = defpackage.AbstractC9932e.purchase
        L44:
            r6.<init>(r7, r8, r9, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9932e.<init>(eؑ٘ؑ, eًُ٘, eًُ٘):void");
    }

    public AbstractC9932e(AbstractC0362e abstractC0362e, AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        this.appmetrica = null;
        this.ad = abstractC0362e;
        this.vip = abstractC7861e;
        this.metrica = abstractC7861e2;
        this.license = abstractC7861eArr;
    }

    public final AbstractC9932e Signature() {
        int billing;
        if (!advert() && (billing = billing()) != 0 && billing != 5) {
            AbstractC7861e adcel = adcel();
            if (!adcel.admob()) {
                AbstractC0362e abstractC0362e = this.ad;
                if (abstractC0362e == null) {
                    throw new IllegalStateException("Detached points must be in affine coordinates");
                }
                AbstractC7861e subscription = abstractC0362e.subscription(AbstractC9915e.vip());
                return admob(adcel.remoteconfig(subscription).Signature().remoteconfig(subscription));
            }
        }
        return this;
    }

    public abstract AbstractC9932e ad(AbstractC9932e abstractC9932e);

    public AbstractC7861e adcel() {
        AbstractC7861e[] abstractC7861eArr = this.license;
        if (abstractC7861eArr.length <= 0) {
            return null;
        }
        return abstractC7861eArr[0];
    }

    public final AbstractC9932e admob(AbstractC7861e abstractC7861e) {
        AbstractC7861e remoteconfig;
        int billing = billing();
        AbstractC7861e abstractC7861e2 = this.metrica;
        AbstractC7861e abstractC7861e3 = this.vip;
        AbstractC0362e abstractC0362e = this.ad;
        if (billing != 1) {
            if (billing == 2 || billing == 3 || billing == 4) {
                AbstractC7861e applovin = abstractC7861e.applovin();
                abstractC7861e = applovin.remoteconfig(abstractC7861e);
                remoteconfig = abstractC7861e3.remoteconfig(applovin);
                return abstractC0362e.appmetrica(remoteconfig, abstractC7861e2.remoteconfig(abstractC7861e));
            }
            if (billing != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        remoteconfig = abstractC7861e3.remoteconfig(abstractC7861e);
        return abstractC0362e.appmetrica(remoteconfig, abstractC7861e2.remoteconfig(abstractC7861e));
    }

    public final boolean advert() {
        if (this.vip == null || this.metrica == null) {
            return true;
        }
        AbstractC7861e[] abstractC7861eArr = this.license;
        return abstractC7861eArr.length > 0 && abstractC7861eArr[0].subscription();
    }

    public final AbstractC9932e amazon(BigInteger bigInteger) {
        AbstractC0362e abstractC0362e = this.ad;
        if (abstractC0362e.yandex == null) {
            abstractC0362e.yandex = abstractC0362e.metrica();
        }
        return abstractC0362e.yandex.license(this, bigInteger);
    }

    public abstract AbstractC9932e applovin(AbstractC9932e abstractC9932e);

    public final AbstractC7861e appmetrica() {
        vip();
        return startapp();
    }

    public final int billing() {
        AbstractC0362e abstractC0362e = this.ad;
        if (abstractC0362e == null) {
            return 0;
        }
        return abstractC0362e.purchase;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9932e) {
            return license((AbstractC9932e) obj);
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0362e abstractC0362e = this.ad;
        int i = abstractC0362e == null ? 0 : ~abstractC0362e.hashCode();
        if (advert()) {
            return i;
        }
        AbstractC9932e Signature = Signature();
        return (i ^ (Signature.vip.hashCode() * 17)) ^ (Signature.startapp().hashCode() * 257);
    }

    public AbstractC9932e inmobi(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        AbstractC9932e abstractC9932e = this;
        while (true) {
            i--;
            if (i < 0) {
                return abstractC9932e;
            }
            abstractC9932e = abstractC9932e.isPro();
        }
    }

    public abstract AbstractC9932e isPro();

    public AbstractC9932e isVip() {
        return applovin(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean license(defpackage.AbstractC9932e r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L77
        L5:
            eؑ٘ؑ r1 = r9.ad
            r2 = 1
            eؑ٘ؑ r3 = r8.ad
            if (r3 != 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r0
        Lf:
            if (r1 != 0) goto L13
            r5 = r2
            goto L14
        L13:
            r5 = r0
        L14:
            boolean r6 = r8.advert()
            boolean r7 = r9.advert()
            if (r6 != 0) goto L68
            if (r7 == 0) goto L21
            goto L68
        L21:
            if (r4 == 0) goto L27
            if (r5 == 0) goto L27
        L25:
            r1 = r8
            goto L4f
        L27:
            if (r4 == 0) goto L2e
            eٍۨؔ r9 = r9.Signature()
            goto L25
        L2e:
            if (r5 == 0) goto L35
            eٍۨؔ r1 = r8.Signature()
            goto L4f
        L35:
            boolean r1 = r3.startapp(r1)
            if (r1 != 0) goto L3c
            goto L77
        L3c:
            eٍۨؔ r9 = r3.amazon(r9)
            r1 = 2
            eٍۨؔ[] r4 = new defpackage.AbstractC9932e[r1]
            r4[r0] = r8
            r4[r2] = r9
            r9 = 0
            r3.Signature(r4, r0, r1, r9)
            r1 = r4[r0]
            r9 = r4[r2]
        L4f:
            eًُ٘ r3 = r1.vip
            eًُ٘ r4 = r9.vip
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L77
            eًُ٘ r1 = r1.startapp()
            eًُ٘ r9 = r9.startapp()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L77
            goto L76
        L68:
            if (r6 == 0) goto L77
            if (r7 == 0) goto L77
            if (r4 != 0) goto L76
            if (r5 != 0) goto L76
            boolean r9 = r3.startapp(r1)
            if (r9 == 0) goto L77
        L76:
            return r2
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9932e.license(eٍۨؔ):boolean");
    }

    public abstract AbstractC9932e loadAd();

    public abstract AbstractC9932e metrica();

    public final boolean mopub(boolean z, boolean z2) {
        if (advert()) {
            return true;
        }
        return !((C5713e) this.ad.admob(this, "bc_validity", new C1846e(this, z, z2))).ad;
    }

    public AbstractC9932e pro(AbstractC7861e abstractC7861e) {
        if (advert()) {
            return this;
        }
        return this.ad.purchase(this.vip.remoteconfig(abstractC7861e), this.metrica, this.license);
    }

    public abstract boolean purchase();

    public boolean remoteconfig() {
        BigInteger bigInteger;
        BigInteger bigInteger2 = InterfaceC4563e.Signature;
        AbstractC0362e abstractC0362e = this.ad;
        return bigInteger2.equals(abstractC0362e.appmetrica) || (bigInteger = abstractC0362e.license) == null || AbstractC0853e.billing(this, bigInteger).advert();
    }

    public AbstractC9932e signatures(AbstractC7861e abstractC7861e) {
        if (advert()) {
            return this;
        }
        return this.ad.purchase(this.vip, this.metrica.remoteconfig(abstractC7861e), this.license);
    }

    public final boolean smaato() {
        int billing = billing();
        return billing == 0 || billing == 5 || advert() || this.license[0].admob();
    }

    public AbstractC7861e startapp() {
        return this.metrica;
    }

    public abstract boolean subscription();

    public abstract AbstractC9932e tapsense(AbstractC9932e abstractC9932e);

    public final String toString() {
        if (advert()) {
            return "INF";
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.vip);
        sb.append(',');
        sb.append(this.metrica);
        int i = 0;
        while (true) {
            AbstractC7861e[] abstractC7861eArr = this.license;
            if (i >= abstractC7861eArr.length) {
                sb.append(')');
                return sb.toString();
            }
            sb.append(',');
            sb.append(abstractC7861eArr[i]);
            i++;
        }
    }

    public final void vip() {
        if (!smaato()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public final byte[] yandex(boolean z) {
        if (advert()) {
            return new byte[1];
        }
        AbstractC9932e Signature = Signature();
        byte[] smaato = Signature.vip.smaato();
        if (z) {
            byte[] bArr = new byte[smaato.length + 1];
            bArr[0] = (byte) (Signature.purchase() ? 3 : 2);
            System.arraycopy(smaato, 0, bArr, 1, smaato.length);
            return bArr;
        }
        byte[] smaato2 = Signature.startapp().smaato();
        byte[] bArr2 = new byte[smaato.length + smaato2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(smaato, 0, bArr2, 1, smaato.length);
        System.arraycopy(smaato2, 0, bArr2, smaato.length + 1, smaato2.length);
        return bArr2;
    }
}
