package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eُؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4288e extends AbstractC4325e {
    public static final BigInteger adcel = C13183e.f26184e;
    public static final AbstractC7861e[] mopub = {new C13183e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C4288e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 11);
        this.vip = new C13183e(InterfaceC4563e.loadAd);
        this.metrica = new C13183e(BigInteger.valueOf(7L));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C4288e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C13183e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 11);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 11);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 2;
    }

    @Override // defpackage.AbstractC4325e
    public final BigInteger signatures() {
        return adcel;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC4325e, defpackage.AbstractC0362e
    public final AbstractC7861e subscription(SecureRandom secureRandom) {
        int i;
        int i2;
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 8);
            } while (AbstractC12797e.ads(8, iArr, AbstractC11866e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 8; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 16];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC10077e.purchase(i2, ((C13183e) abstractC9932e.vip).f26185e, iArr);
            AbstractC10077e.purchase(i2 + 8, ((C13183e) abstractC9932e.metrica).f26185e, iArr);
            i2 += 16;
        }
        return new C2679e(this, i, iArr, 10);
    }
}
