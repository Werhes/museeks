package defpackage;

import java.math.BigInteger;

/* renamed from: eْؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13022e extends AbstractC5490e {
    public int adcel;
    public int advert;
    public C9345e amazon;
    public int mopub;
    public int smaato;

    public C13022e(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.adcel = i;
        this.mopub = i2;
        this.advert = i3;
        this.smaato = i4;
        this.license = bigInteger3;
        this.appmetrica = bigInteger4;
        AbstractC7861e abstractC7861e = null;
        this.amazon = new C9345e(this, abstractC7861e, abstractC7861e, 0);
        this.vip = adcel(bigInteger);
        this.metrica = adcel(bigInteger2);
        this.purchase = 6;
    }

    public C13022e(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؑ٘ؑ, eؘؙۧ, eْؔ۠] */
    @Override // defpackage.AbstractC0362e
    public final AbstractC0362e ad() {
        int i = this.adcel;
        int i2 = this.mopub;
        int i3 = this.advert;
        int i4 = this.smaato;
        AbstractC7861e abstractC7861e = this.vip;
        AbstractC7861e abstractC7861e2 = this.metrica;
        BigInteger bigInteger = this.license;
        BigInteger bigInteger2 = this.appmetrica;
        ?? abstractC5490e = new AbstractC5490e(i, i2, i3, i4);
        abstractC5490e.adcel = i;
        abstractC5490e.mopub = i2;
        abstractC5490e.advert = i3;
        abstractC5490e.smaato = i4;
        abstractC5490e.license = bigInteger;
        abstractC5490e.appmetrica = bigInteger2;
        AbstractC7861e abstractC7861e3 = null;
        abstractC5490e.amazon = new C9345e(abstractC5490e, abstractC7861e3, abstractC7861e3, 0);
        abstractC5490e.vip = abstractC7861e;
        abstractC5490e.metrica = abstractC7861e2;
        abstractC5490e.purchase = 6;
        return abstractC5490e;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eٌۚؕ, java.lang.Object] */
    @Override // defpackage.AbstractC0362e
    public final AbstractC7861e adcel(BigInteger bigInteger) {
        int i = this.mopub;
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int bitLength = bigInteger.bitLength();
            int i2 = this.adcel;
            if (bitLength <= i2) {
                int i3 = this.advert;
                int i4 = this.smaato;
                char c = 2;
                int i5 = 1;
                int[] iArr = (i3 | i4) == 0 ? new int[]{i} : new int[]{i, i3, i4};
                ?? obj = new Object();
                if (bigInteger.signum() < 0) {
                    throw new IllegalArgumentException("invalid F2m field value");
                }
                long j = 0;
                if (bigInteger.signum() == 0) {
                    obj.f17972e = new long[]{0};
                } else {
                    byte[] byteArray = bigInteger.toByteArray();
                    int length = byteArray.length;
                    if (byteArray[0] == 0) {
                        length--;
                    } else {
                        i5 = 0;
                    }
                    int i6 = (length + 7) / 8;
                    obj.f17972e = new long[i6];
                    int i7 = i6 - 1;
                    int i8 = (length % 8) + i5;
                    if (i5 < i8) {
                        long j2 = 0;
                        while (i5 < i8) {
                            j2 = (j2 << 8) | (byteArray[i5] & 255);
                            i5++;
                            c = c;
                        }
                        obj.f17972e[i7] = j2;
                        i7 = i6 - 2;
                    }
                    while (i7 >= 0) {
                        long j3 = j;
                        int i9 = 0;
                        while (i9 < 8) {
                            j3 = (j3 << 8) | (byteArray[i5] & 255);
                            i9++;
                            i5++;
                        }
                        obj.f17972e[i7] = j3;
                        i7--;
                        j = 0;
                    }
                }
                return new C16247e(i2, iArr, obj);
            }
        }
        throw new IllegalArgumentException("x value invalid in F2m field element");
    }

    @Override // defpackage.AbstractC0362e
    public final int advert() {
        return this.adcel;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, 0);
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC16982e metrica() {
        return signatures() ? new C4630e(2) : super.metrica();
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr) {
        return new C9345e(this, abstractC7861e, abstractC7861e2, abstractC7861eArr, 0);
    }

    @Override // defpackage.AbstractC0362e
    public final boolean remoteconfig(int i) {
        return i == 0 || i == 1 || i == 6;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC9932e smaato() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC0362e
    public final AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int i2 = this.mopub;
        int i3 = this.smaato;
        int i4 = (this.adcel + 63) >>> 6;
        int i5 = this.advert;
        int[] iArr = (i5 == 0 && i3 == 0) ? new int[]{i2} : new int[]{i2, i5, i3};
        long[] jArr = new long[i * i4 * 2];
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i7];
            long[] jArr2 = ((C16247e) abstractC9932e.vip).f31922e.f17972e;
            System.arraycopy(jArr2, 0, jArr, i6, jArr2.length);
            int i8 = i6 + i4;
            long[] jArr3 = ((C16247e) abstractC9932e.metrica).f31922e.f17972e;
            System.arraycopy(jArr3, 0, jArr, i8, jArr3.length);
            i6 = i8 + i4;
        }
        return new C6778e(this, i, i4, jArr, iArr);
    }
}
