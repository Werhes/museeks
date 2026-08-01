package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؕؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3051e extends AbstractC4325e {
    public static final BigInteger adcel = C8674e.f17518e;
    public static final AbstractC7861e[] mopub = {new C8674e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C3051e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 8);
        this.vip = new C8674e(new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.metrica = new C8674e(new BigInteger(1, AbstractC7240e.metrica("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C3051e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C8674e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 8);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 8);
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
            } while (AbstractC12797e.ads(6, iArr, AbstractC1216e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 6; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 12];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC16091e.billing(i2, ((C8674e) abstractC9932e.vip).f17519e, iArr);
            AbstractC16091e.billing(i2 + 6, ((C8674e) abstractC9932e.metrica).f17519e, iArr);
            i2 += 12;
        }
        return new C2679e(this, i, iArr, 7);
    }
}
