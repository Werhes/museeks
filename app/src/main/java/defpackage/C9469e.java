package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eٍؚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9469e extends AbstractC4325e {
    public static final BigInteger adcel = C15881e.f31318e;
    public static final AbstractC7861e[] mopub = {new C15881e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C9469e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 14);
        this.vip = new C15881e(new BigInteger(1, AbstractC7240e.metrica("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.metrica = new C15881e(new BigInteger(1, AbstractC7240e.metrica("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C9469e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C15881e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 14);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 14);
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
        int[] iArr = new int[17];
        do {
            byte[] bArr = new byte[68];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 17);
                iArr[16] = iArr[16] & 511;
            } while (AbstractC12797e.ads(17, iArr, AbstractC0223e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 17; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 34];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            System.arraycopy(((C15881e) abstractC9932e.vip).f31319e, 0, iArr, i2, 17);
            System.arraycopy(((C15881e) abstractC9932e.metrica).f31319e, 0, iArr, i2 + 17, 17);
            i2 += 34;
        }
        return new C2679e(this, i, iArr, 13);
    }
}
