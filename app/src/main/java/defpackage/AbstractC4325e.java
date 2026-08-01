package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eَؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4325e extends AbstractC0362e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC4325e(java.math.BigInteger r4) {
        /*
            r3 = this;
            eؓٔ r0 = defpackage.AbstractC17290e.ad
            int r0 = r4.bitLength()
            int r1 = r4.signum()
            if (r1 <= 0) goto L2b
            r1 = 2
            if (r0 < r1) goto L2b
            r2 = 3
            if (r0 >= r2) goto L21
            int r0 = defpackage.AbstractC5907e.yandex(r4)
            if (r0 == r1) goto L1e
            if (r0 == r2) goto L1b
            goto L21
        L1b:
            eؓٔ r4 = defpackage.AbstractC17290e.vip
            goto L27
        L1e:
            eؓٔ r4 = defpackage.AbstractC17290e.ad
            goto L27
        L21:
            eؓٔ r0 = new eؓٔ
            r0.<init>(r4)
            r4 = r0
        L27:
            r3.<init>(r4)
            return
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'characteristic' must be >= 2"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4325e.<init>(java.math.BigInteger):void");
    }

    @Override // defpackage.AbstractC0362e
    public final boolean loadAd(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(signatures()) < 0;
    }

    public abstract BigInteger signatures();

    @Override // defpackage.AbstractC0362e
    public AbstractC7861e subscription(SecureRandom secureRandom) {
        BigInteger metrica;
        BigInteger signatures = signatures();
        while (true) {
            metrica = AbstractC5907e.metrica(signatures.bitLength(), secureRandom);
            if (metrica.signum() > 0 && metrica.compareTo(signatures) < 0) {
                break;
            }
        }
        AbstractC7861e adcel = adcel(metrica);
        while (true) {
            BigInteger metrica2 = AbstractC5907e.metrica(signatures.bitLength(), secureRandom);
            if (metrica2.signum() > 0 && metrica2.compareTo(signatures) < 0) {
                return adcel.remoteconfig(adcel(metrica2));
            }
        }
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e yandex(int i, BigInteger bigInteger) {
        AbstractC7861e adcel = adcel(bigInteger);
        AbstractC7861e isPro = adcel.applovin().ad(this.vip).remoteconfig(adcel).ad(this.metrica).isPro();
        if (isPro == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        if (isPro.crashlytics() != (i == 1)) {
            isPro = isPro.tapsense();
        }
        return appmetrica(adcel, isPro);
    }
}
