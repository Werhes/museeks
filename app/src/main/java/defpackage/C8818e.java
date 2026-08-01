package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eٌٜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8818e extends AbstractC4325e {
    public static final BigInteger adcel = C5356e.f11476e;
    public static final AbstractC7861e[] mopub = {new C5356e(InterfaceC4563e.Signature)};
    public final C17373e startapp;

    public C8818e() {
        super(adcel);
        AbstractC7861e abstractC7861e = null;
        this.startapp = new C17373e(this, abstractC7861e, abstractC7861e, 3);
        this.vip = new C5356e(new BigInteger(1, AbstractC7240e.metrica("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.metrica = new C5356e(new BigInteger(1, AbstractC7240e.metrica("E87579C11079F43DD824993C2CEE5ED3")));
        this.license = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFE0000000075A30D1B9038A115"));
        this.appmetrica = BigInteger.valueOf(1L);
        this.purchase = 2;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        return new C8818e();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        return new C5356e(bigInteger);
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return adcel.bitLength();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, 3);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C17373e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 3);
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
        int[] iArr = new int[4];
        do {
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC3628e.amazon(bArr, 0, iArr, 0, 4);
            } while (AbstractC12797e.ads(4, iArr, AbstractC10003e.ad) == 0);
            i2 = 0;
            for (i = 0; i < 4; i++) {
                i2 |= iArr[i];
            }
        } while (((((i2 & 1) | (i2 >>> 1)) - 1) >> 31) != 0);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int[] iArr = new int[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC0173e.metrica(i2, ((C5356e) abstractC9932e.vip).f11477e, iArr);
            AbstractC0173e.metrica(i2 + 4, ((C5356e) abstractC9932e.metrica).f11477e, iArr);
            i2 += 8;
        }
        return new C2679e(this, i, iArr, 2);
    }
}
