package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؚٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13833e extends AbstractC4325e {
    public static final BigInteger adcel = C17520e.f34355e;
    public static final AbstractC7861e[] mopub = {new C17520e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C13833e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 7);
        this.vip = new C17520e(InterfaceC4563e.loadAd);
        this.metrica = new C17520e(BigInteger.valueOf(3L));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C13833e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C17520e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 7);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 7);
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
        int[] iArr = new int[6];
        do {
            byte[] bArr = new byte[24];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 6);
            } while (AbstractC12797e.ads(6, iArr, AbstractC6190e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 6; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 12];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC16091e.billing(i2, ((C17520e) abstractC9932e.vip).f34356e, iArr);
            AbstractC16091e.billing(i2 + 6, ((C17520e) abstractC9932e.metrica).f34356e, iArr);
            i2 += 12;
        }
        return new C2679e(this, i, iArr, 6);
    }
}
