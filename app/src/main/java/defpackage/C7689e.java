package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eًؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7689e extends AbstractC4325e {
    public static final BigInteger adcel = C10207e.f20179e;
    public static final AbstractC7861e[] mopub = {new C10207e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C7689e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 10);
        this.vip = new C10207e(new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.metrica = new C10207e(new BigInteger(1, AbstractC7240e.metrica("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C7689e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C10207e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 10);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 10);
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
        int[] iArr = new int[7];
        do {
            byte[] bArr = new byte[28];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 7);
            } while (AbstractC12797e.ads(7, iArr, AbstractC17808e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 7; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 14];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC12947e.billing(i2, ((C10207e) abstractC9932e.vip).f20180e, iArr);
            AbstractC12947e.billing(i2 + 7, ((C10207e) abstractC9932e.metrica).f20180e, iArr);
            i2 += 14;
        }
        return new C2679e(this, i, iArr, 9);
    }
}
