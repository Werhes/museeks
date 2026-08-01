package defpackage;

import java.math.BigInteger;

/* renamed from: eٍؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0961e {
    public final C16911e ad;
    public final C6594e vip;

    public C0961e(AbstractC4325e abstractC4325e, C16911e c16911e) {
        this.ad = c16911e;
        this.vip = new C6594e(26, abstractC4325e.adcel((BigInteger) c16911e.f33137e));
    }

    public final BigInteger[] ad(BigInteger bigInteger) {
        C4813e c4813e = (C4813e) this.ad.f33136e;
        int i = c4813e.vip;
        BigInteger ad = AbstractC7255e.ad(i, bigInteger, (BigInteger) c4813e.billing);
        BigInteger ad2 = AbstractC7255e.ad(i, bigInteger, (BigInteger) c4813e.yandex);
        return new BigInteger[]{bigInteger.subtract(ad.multiply((BigInteger) c4813e.metrica).add(ad2.multiply((BigInteger) c4813e.appmetrica))), ad.multiply((BigInteger) c4813e.license).add(ad2.multiply((BigInteger) c4813e.purchase)).negate()};
    }
}
