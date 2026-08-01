package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: eَِٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10207e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f20179e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f20180e;

    public C10207e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f20179e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] advert = AbstractC12947e.advert(bigInteger);
        if (advert[6] == -1) {
            if (AbstractC12947e.amazon(advert, AbstractC17808e.ad)) {
                long j = (advert[0] & 4294967295L) - (r1[0] & 4294967295L);
                advert[0] = (int) j;
                long j2 = ((advert[1] & 4294967295L) - (r1[1] & 4294967295L)) + (j >> 32);
                advert[1] = (int) j2;
                long j3 = ((advert[2] & 4294967295L) - (r1[2] & 4294967295L)) + (j2 >> 32);
                advert[2] = (int) j3;
                long j4 = ((advert[3] & 4294967295L) - (r1[3] & 4294967295L)) + (j3 >> 32);
                advert[3] = (int) j4;
                long j5 = ((advert[4] & 4294967295L) - (r1[4] & 4294967295L)) + (j4 >> 32);
                advert[4] = (int) j5;
                long j6 = ((advert[5] & 4294967295L) - (r1[5] & 4294967295L)) + (j5 >> 32);
                advert[5] = (int) j6;
                advert[6] = (int) (((advert[6] & 4294967295L) - (4294967295L & r1[6])) + (j6 >> 32));
            }
        }
        this.f20180e = advert;
    }

    public C10207e(int[] iArr) {
        super(3);
        this.f20180e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[7];
        AbstractC6143e.metrica(AbstractC17808e.ad, this.f20180e, iArr);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC17808e.ad(this.f20180e, ((C10207e) abstractC7861e).f20180e, iArr);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC12947e.loadAd(this.f20180e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[7];
        AbstractC17808e.smaato(this.f20180e, iArr);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC12947e.smaato(this.f20180e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10207e) {
            return AbstractC12947e.mopub(this.f20180e, ((C10207e) obj).f20180e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC12947e.applovin(this.f20180e);
    }

    public final int hashCode() {
        return f20179e.hashCode() ^ AbstractC12442e.inmobi(this.f20180e, 7);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = this.f20180e;
        if (AbstractC12947e.Signature(iArr3) || AbstractC12947e.loadAd(iArr3)) {
            return this;
        }
        int[] iArr4 = new int[7];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            i2 |= iArr3[i3];
        }
        int i4 = 1;
        int i5 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr5 = AbstractC17808e.ad;
        if (i5 != 0) {
            AbstractC12947e.inmobi(iArr5, iArr5, iArr4);
        } else {
            AbstractC12947e.inmobi(iArr5, iArr3, iArr4);
        }
        Random random = new Random();
        int[] iArr6 = new int[7];
        int i6 = iArr5[6];
        int i7 = i6 | (i6 >>> 1);
        int i8 = i7 | (i7 >>> 2);
        int i9 = i8 | (i8 >>> 4);
        int i10 = i9 | (i9 >>> 8);
        int i11 = i10 | (i10 >>> 16);
        do {
            for (int i12 = 0; i12 != 7; i12++) {
                iArr6[i12] = random.nextInt();
            }
            iArr6[6] = iArr6[6] & i11;
        } while (AbstractC12797e.subscription(7, iArr6, iArr5));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        AbstractC12947e.yandex(iArr3, iArr8);
        for (int i13 = 0; i13 < 7; i13++) {
            AbstractC12947e.yandex(iArr8, iArr9);
            int i14 = 1 << i13;
            int[] iArr10 = new int[14];
            do {
                AbstractC12947e.isVip(iArr8, iArr10);
                AbstractC17808e.yandex(iArr10, iArr8);
                i14--;
            } while (i14 > 0);
            AbstractC17808e.appmetrica(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        AbstractC12947e.isVip(iArr8, iArr11);
        AbstractC17808e.yandex(iArr11, iArr8);
        int i15 = 95;
        while (true) {
            i15--;
            if (i15 <= 0) {
                break;
            }
            AbstractC12947e.isVip(iArr8, iArr11);
            AbstractC17808e.yandex(iArr11, iArr8);
        }
        if (!AbstractC12947e.loadAd(iArr8)) {
            return null;
        }
        loop6: while (true) {
            int[] iArr12 = new int[7];
            AbstractC12947e.yandex(iArr6, iArr12);
            int[] iArr13 = new int[7];
            iArr13[i] = i4;
            int[] iArr14 = new int[7];
            AbstractC12947e.yandex(iArr4, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            while (i < 7) {
                AbstractC12947e.yandex(iArr12, iArr15);
                AbstractC12947e.yandex(iArr13, iArr16);
                int i16 = i4 << i;
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        AbstractC17808e.appmetrica(iArr13, iArr12, iArr13);
                        AbstractC17808e.loadAd(iArr13, iArr13);
                        AbstractC17808e.smaato(iArr12, iArr7);
                        AbstractC17808e.ad(iArr14, iArr7, iArr12);
                        AbstractC17808e.appmetrica(iArr14, iArr7, iArr14);
                        AbstractC17808e.startapp(iArr14, AbstractC12797e.firebase(iArr14, 7));
                    }
                }
                AbstractC17808e.appmetrica(iArr13, iArr16, iArr7);
                AbstractC17808e.appmetrica(iArr7, iArr4, iArr7);
                AbstractC17808e.appmetrica(iArr12, iArr15, iArr14);
                AbstractC17808e.ad(iArr14, iArr7, iArr14);
                AbstractC17808e.appmetrica(iArr12, iArr16, iArr7);
                AbstractC12947e.yandex(iArr14, iArr12);
                AbstractC17808e.appmetrica(iArr13, iArr15, iArr13);
                AbstractC17808e.ad(iArr13, iArr7, iArr13);
                AbstractC17808e.smaato(iArr13, iArr14);
                AbstractC17808e.appmetrica(iArr14, iArr4, iArr14);
                i++;
                i4 = 1;
            }
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i17 = 1; i17 < 96; i17++) {
                AbstractC12947e.yandex(iArr12, iArr);
                AbstractC12947e.yandex(iArr13, iArr2);
                AbstractC17808e.appmetrica(iArr13, iArr12, iArr13);
                AbstractC17808e.loadAd(iArr13, iArr13);
                AbstractC17808e.smaato(iArr12, iArr7);
                AbstractC17808e.ad(iArr14, iArr7, iArr12);
                AbstractC17808e.appmetrica(iArr14, iArr7, iArr14);
                AbstractC17808e.startapp(iArr14, AbstractC12797e.firebase(iArr14, 7));
                if (AbstractC12947e.Signature(iArr12)) {
                    break loop6;
                }
            }
            if (AbstractC12797e.pro(7, iArr6, iArr6) != 0 || (iArr6[6] == -1 && AbstractC12947e.amazon(iArr6, iArr5))) {
                AbstractC17808e.vip(iArr6);
            }
            i = 0;
            i4 = 1;
        }
        AbstractC6143e.metrica(iArr5, iArr2, iArr7);
        AbstractC17808e.appmetrica(iArr7, iArr, iArr7);
        AbstractC17808e.smaato(iArr7, iArr6);
        if (AbstractC12947e.mopub(iArr3, iArr6)) {
            return new C10207e(iArr7);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f20179e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC17808e.appmetrica(this.f20180e, ((C10207e) abstractC7861e).f20180e, iArr);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC17808e.amazon(this.f20180e, ((C10207e) abstractC7861e).f20180e, iArr);
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC12947e.Signature(this.f20180e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[7];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f20180e;
            if (i >= 7) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC17808e.ad;
        if (i3 != 0) {
            AbstractC12947e.inmobi(iArr3, iArr3, iArr2);
        } else {
            AbstractC12947e.inmobi(iArr3, iArr, iArr2);
        }
        return new C10207e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[7];
        if (AbstractC12797e.pro(7, this.f20180e, iArr) != 0 || (iArr[6] == -1 && AbstractC12947e.amazon(iArr, AbstractC17808e.ad))) {
            AbstractC17808e.vip(iArr);
        }
        return new C10207e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC6143e.metrica(AbstractC17808e.ad, ((C10207e) abstractC7861e).f20180e, iArr);
        AbstractC17808e.appmetrica(iArr, this.f20180e, iArr);
        return new C10207e(iArr);
    }
}
