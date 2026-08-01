package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eٌٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15334e extends AbstractC4325e {
    public static final BigInteger adcel = C15557e.f30712e;
    public static final AbstractC7861e[] mopub = {new C15557e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C15334e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 5);
        this.vip = new C15557e(new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.metrica = new C15557e(new BigInteger(1, AbstractC7240e.metrica("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("0100000000000000000001F4C8F927AED3CA752257"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C15334e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C15557e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 5);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 5);
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
        int[] iArr = new int[5];
        do {
            byte[] bArr = new byte[20];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 5);
            } while (AbstractC12797e.ads(5, iArr, AbstractC8787e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 5; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 10];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC15077e.advert(i2, ((C15557e) abstractC9932e.vip).f30713e, iArr);
            AbstractC15077e.advert(i2 + 5, ((C15557e) abstractC9932e.metrica).f30713e, iArr);
            i2 += 10;
        }
        return new C2679e(this, i, iArr, 4);
    }
}
