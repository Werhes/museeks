package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؘٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13801e extends AbstractC4325e {
    public static final BigInteger adcel = C2926e.f6915e;
    public static final AbstractC7861e[] mopub = {new C2926e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C13801e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 12);
        this.vip = new C2926e(new BigInteger(1, AbstractC7240e.metrica("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.metrica = new C2926e(new BigInteger(1, AbstractC7240e.metrica("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C13801e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C2926e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 12);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 12);
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
            } while (AbstractC12797e.ads(8, iArr, AbstractC1206e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 8; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 16];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC10077e.purchase(i2, ((C2926e) abstractC9932e.vip).f6916e, iArr);
            AbstractC10077e.purchase(i2 + 8, ((C2926e) abstractC9932e.metrica).f6916e, iArr);
            i2 += 16;
        }
        return new C2679e(this, i, iArr, 11);
    }
}
