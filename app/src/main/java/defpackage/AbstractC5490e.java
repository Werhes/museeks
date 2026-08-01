package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: eؘؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5490e extends AbstractC0362e {
    public BigInteger[] startapp;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC5490e(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "org.bouncycastle.ec.max_f2m_field_size"
            r1 = 1142(0x476, float:1.6E-42)
            int r0 = defpackage.AbstractC0361e.ad(r1, r0)
            if (r6 > r0) goto L81
            r0 = r8 | r9
            r1 = 2
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L1b
            int[] r8 = new int[r2]
            r8[r4] = r4
            r8[r3] = r7
            r8[r1] = r6
            goto L2a
        L1b:
            r0 = 5
            int[] r0 = new int[r0]
            r0[r4] = r4
            r0[r3] = r7
            r0[r1] = r8
            r0[r2] = r9
            r7 = 4
            r0[r7] = r6
            r8 = r0
        L2a:
            eؓٔ r6 = defpackage.AbstractC17290e.ad
            r6 = r8[r4]
            if (r6 != 0) goto L79
        L30:
            int r6 = r8.length
            if (r3 >= r6) goto L46
            r6 = r8[r3]
            int r7 = r3 + (-1)
            r7 = r8[r7]
            if (r6 <= r7) goto L3e
            int r3 = r3 + 1
            goto L30
        L3e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Polynomial exponents must be monotonically increasing"
            r6.<init>(r7)
            throw r6
        L46:
            eؘّْ r6 = new eؘّْ
            eؓٔ r7 = defpackage.AbstractC17290e.ad
            eٜؔؖ r9 = new eٜؔؖ
            r9.<init>(r8)
            r6.<init>(r7, r9)
            r5.<init>(r6)
            r6 = 0
            r5.startapp = r6
            java.lang.String r6 = "org.bouncycastle.ec.disable"
            boolean r6 = defpackage.AbstractC0361e.metrica(r6)
            if (r6 != 0) goto L71
            java.lang.String r6 = "org.bouncycastle.ec.disable_f2m"
            boolean r6 = defpackage.AbstractC0361e.metrica(r6)
            if (r6 != 0) goto L69
            return
        L69:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "F2M disabled by \"org.bouncycastle.ec.disable_f2m\""
            r6.<init>(r7)
            throw r6
        L71:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "F2M disabled by \"org.bouncycastle.ec.disable\""
            r6.<init>(r7)
            throw r6
        L79:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Irreducible polynomials in GF(2) must have constant term"
            r6.<init>(r7)
            throw r6
        L81:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "field size out of range: "
            java.lang.String r6 = defpackage.AbstractC1786e.admob(r6, r8)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5490e.<init>(int, int, int, int):void");
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e license(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC7861e adcel = adcel(bigInteger);
        AbstractC7861e adcel2 = adcel(bigInteger2);
        int i = this.purchase;
        if (i == 5 || i == 6) {
            if (!adcel.subscription()) {
                adcel2 = adcel2.yandex(adcel).ad(adcel);
            } else if (!adcel2.applovin().equals(this.metrica)) {
                throw new IllegalArgumentException();
            }
        }
        return appmetrica(adcel, adcel2);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean loadAd(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= advert();
    }

    public boolean signatures() {
        if (this.license == null || this.appmetrica == null || !this.metrica.admob()) {
            return false;
        }
        return this.vip.subscription() || this.vip.admob();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e subscription(SecureRandom secureRandom) {
        BigInteger metrica;
        BigInteger metrica2;
        int advert = advert();
        do {
            metrica = AbstractC5907e.metrica(advert, secureRandom);
        } while (metrica.signum() <= 0);
        AbstractC7861e adcel = adcel(metrica);
        do {
            metrica2 = AbstractC5907e.metrica(advert, secureRandom);
        } while (metrica2.signum() <= 0);
        return adcel.remoteconfig(adcel(metrica2));
    }

    public final AbstractC7861e tapsense(AbstractC7861e abstractC7861e) {
        AbstractC7861e abstractC7861e2;
        AbstractC11471e abstractC11471e = (AbstractC11471e) abstractC7861e;
        boolean mo206interface = abstractC11471e.mo206interface();
        if (mo206interface && abstractC11471e.mo205goto() != 0) {
            return null;
        }
        int advert = advert();
        if ((advert & 1) != 0) {
            AbstractC7861e mo204class = abstractC11471e.mo204class();
            if (mo206interface || mo204class.applovin().ad(mo204class).ad(abstractC7861e).subscription()) {
                return mo204class;
            }
            return null;
        }
        if (abstractC7861e.subscription()) {
            return abstractC7861e;
        }
        AbstractC7861e adcel = adcel(InterfaceC4563e.loadAd);
        Random random = new Random();
        do {
            AbstractC7861e adcel2 = adcel(new BigInteger(advert, random));
            AbstractC7861e abstractC7861e3 = abstractC7861e;
            abstractC7861e2 = adcel;
            for (int i = 1; i < advert; i++) {
                AbstractC7861e applovin = abstractC7861e3.applovin();
                abstractC7861e2 = abstractC7861e2.applovin().ad(applovin.remoteconfig(adcel2));
                abstractC7861e3 = applovin.ad(abstractC7861e);
            }
            if (!abstractC7861e3.subscription()) {
                return null;
            }
        } while (abstractC7861e2.applovin().ad(abstractC7861e2).subscription());
        return abstractC7861e2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e yandex(int i, BigInteger bigInteger) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e adcel = adcel(bigInteger);
        if (adcel.subscription()) {
            abstractC7861e = this.metrica.isPro();
        } else {
            AbstractC7861e tapsense = tapsense(adcel.applovin().Signature().remoteconfig(this.metrica).ad(this.vip).ad(adcel));
            if (tapsense != null) {
                if (tapsense.crashlytics() != (i == 1)) {
                    tapsense = tapsense.vip();
                }
                int i2 = this.purchase;
                abstractC7861e = (i2 == 5 || i2 == 6) ? tapsense.ad(adcel) : tapsense.remoteconfig(adcel);
            } else {
                abstractC7861e = null;
            }
        }
        if (abstractC7861e != null) {
            return appmetrica(adcel, abstractC7861e);
        }
        throw new IllegalArgumentException("Invalid point compression");
    }
}
