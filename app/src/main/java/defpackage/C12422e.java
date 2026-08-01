package defpackage;

import java.lang.reflect.Array;

/* renamed from: eًِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12422e extends AbstractC0821e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final short[][] f24839e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final short[][][] f24840e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final short[][][] f24841e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f24842e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final short[][][] f24843e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final short[][][] f24844e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final byte[] f24845e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final byte[] f24846e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final short[][][] f24847e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final short[][][] f24848e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final short[][] f24849e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final short[][][] f24850e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final short[][] f24851e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final short[][] f24852e;

    public C12422e(C12048e c12048e, byte[] bArr) {
        super(true, c12048e);
        AbstractC9567e abstractC9567e = c12048e.f24097e;
        int i = c12048e.f24092e;
        int i2 = c12048e.f24093e;
        int i3 = c12048e.f24095e;
        int i4 = c12048e.f24096e;
        Class cls = Short.TYPE;
        int i5 = 0;
        if (i4 != 3) {
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f24849e = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, i3, i2);
            this.f24839e = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, i3, i);
            this.f24851e = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f24852e = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
            this.f24847e = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i2);
            this.f24850e = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i3);
            this.f24843e = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i2);
            this.f24848e = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i);
            this.f24841e = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i2);
            this.f24840e = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i);
            this.f24844e = sArr11;
            this.f24845e = null;
            byte[] admob = AbstractC12442e.admob(0, 32, bArr);
            this.f24842e = admob;
            int length = admob.length;
            int advert = AbstractC1085e.advert(sArr, bArr, length) + length;
            int advert2 = AbstractC1085e.advert(sArr2, bArr, advert) + advert;
            int advert3 = AbstractC1085e.advert(sArr3, bArr, advert2) + advert2;
            int advert4 = AbstractC1085e.advert(sArr4, bArr, advert3) + advert3;
            int smaato = AbstractC1085e.smaato(sArr5, bArr, advert4, true) + advert4;
            int smaato2 = AbstractC1085e.smaato(sArr6, bArr, smaato, false) + smaato;
            int smaato3 = AbstractC1085e.smaato(sArr7, bArr, smaato2, true) + smaato2;
            int smaato4 = AbstractC1085e.smaato(sArr8, bArr, smaato3, false) + smaato3;
            int smaato5 = AbstractC1085e.smaato(sArr9, bArr, smaato4, false) + smaato4;
            int smaato6 = AbstractC1085e.smaato(sArr10, bArr, smaato5, true) + smaato5;
            this.f24846e = AbstractC12442e.admob(AbstractC1085e.smaato(sArr11, bArr, smaato6, false) + smaato6, bArr.length, bArr);
            return;
        }
        byte[] admob2 = AbstractC12442e.admob(0, 32, bArr);
        this.f24845e = admob2;
        byte[] admob3 = AbstractC12442e.admob(32, 64, bArr);
        this.f24842e = admob3;
        byte[] license = AbstractC12442e.license(admob3);
        byte[] license2 = AbstractC12442e.license(admob2);
        C14877e c14877e = new C14877e(license, abstractC9567e);
        C14877e c14877e2 = new C14877e(license2, abstractC9567e);
        short[][] yandex = AbstractC1085e.yandex(c14877e, i2, i);
        short[][] yandex2 = AbstractC1085e.yandex(c14877e, i3, i2);
        short[][] yandex3 = AbstractC1085e.yandex(c14877e, i3, i);
        short[][] yandex4 = AbstractC1085e.yandex(c14877e, i2, i);
        short[][] metrica = AbstractC8495e.metrica(AbstractC8495e.yandex(yandex2, yandex4), yandex3);
        short[][][] billing = AbstractC1085e.billing(c14877e2, i2, i3, i3, true);
        short[][][] billing2 = AbstractC1085e.billing(c14877e2, i2, i3, i2, false);
        short[][][] billing3 = AbstractC1085e.billing(c14877e2, i, i3, i3, true);
        short[][][] billing4 = AbstractC1085e.billing(c14877e2, i, i3, i2, false);
        short[][][] billing5 = AbstractC1085e.billing(c14877e2, i, i3, i, false);
        short[][][] billing6 = AbstractC1085e.billing(c14877e2, i, i2, i2, true);
        short[][][] billing7 = AbstractC1085e.billing(c14877e2, i, i2, i, false);
        short[][][] startapp = AbstractC8495e.startapp(yandex, billing3, billing);
        short[][][] startapp2 = AbstractC8495e.startapp(yandex, billing4, billing2);
        short[][][] purchase = AbstractC1085e.purchase(startapp);
        short[][][] sArr12 = new short[i2][];
        while (i5 < i2) {
            short[][][] sArr13 = billing3;
            short[][] license3 = AbstractC8495e.license(startapp[i5]);
            sArr12[i5] = license3;
            short[][] yandex5 = AbstractC8495e.yandex(license3, yandex2);
            sArr12[i5] = yandex5;
            sArr12[i5] = AbstractC8495e.metrica(yandex5, startapp2[i5]);
            i5++;
            billing4 = billing4;
            billing3 = sArr13;
        }
        short[][][] sArr14 = billing3;
        short[][][] sArr15 = billing4;
        short[][][] sArr16 = new short[i][];
        short[][][] sArr17 = new short[i][];
        short[][][] sArr18 = new short[i][];
        short[][][] sArr19 = new short[i][];
        short[][][] purchase2 = AbstractC1085e.purchase(sArr14);
        int i6 = 0;
        while (i6 < i) {
            short[][][] sArr20 = sArr16;
            short[][] license4 = AbstractC8495e.license(sArr14[i6]);
            short[][][] sArr21 = sArr19;
            short[][] yandex6 = AbstractC8495e.yandex(license4, yandex2);
            sArr20[i6] = yandex6;
            short[][][] sArr22 = sArr12;
            sArr20[i6] = AbstractC8495e.metrica(yandex6, sArr15[i6]);
            sArr17[i6] = AbstractC8495e.yandex(license4, metrica);
            short[][] metrica2 = AbstractC8495e.metrica(sArr17[i6], AbstractC8495e.yandex(sArr15[i6], yandex4));
            sArr17[i6] = metrica2;
            sArr17[i6] = AbstractC8495e.metrica(metrica2, billing5[i6]);
            short[][] metrica3 = AbstractC8495e.metrica(AbstractC8495e.yandex(sArr14[i6], yandex2), sArr15[i6]);
            short[][] mopub = AbstractC8495e.mopub(yandex2);
            short[][] yandex7 = AbstractC8495e.yandex(mopub, metrica3);
            sArr18[i6] = yandex7;
            short[][] metrica4 = AbstractC8495e.metrica(yandex7, billing6[i6]);
            sArr18[i6] = metrica4;
            short[][] sArr23 = yandex;
            if (metrica4.length != metrica4[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr24 = (short[][]) Array.newInstance((Class<?>) cls, metrica4.length, metrica4.length);
            int i7 = 0;
            while (i7 < metrica4.length) {
                sArr24[i7][i7] = metrica4[i7][i7];
                short[][] sArr25 = metrica4;
                int i8 = i7 + 1;
                while (i8 < sArr25[0].length) {
                    short[] sArr26 = sArr24[i7];
                    short s = sArr25[i7][i8];
                    short s2 = sArr25[i8][i7];
                    byte[][] bArr2 = AbstractC4764e.ad;
                    int i9 = i8;
                    sArr26[i9] = (short) (s ^ s2);
                    i8 = i9 + 1;
                }
                metrica4 = sArr25;
                i7 = i8;
            }
            sArr18[i6] = sArr24;
            sArr21[i6] = AbstractC8495e.yandex(mopub, sArr17[i6]);
            sArr21[i6] = AbstractC8495e.metrica(sArr21[i6], AbstractC8495e.yandex(AbstractC8495e.mopub(sArr15[i6]), metrica));
            short[][] metrica5 = AbstractC8495e.metrica(sArr21[i6], AbstractC8495e.yandex(AbstractC8495e.license(billing6[i6]), yandex4));
            sArr21[i6] = metrica5;
            sArr21[i6] = AbstractC8495e.metrica(metrica5, billing7[i6]);
            i6++;
            sArr19 = sArr21;
            sArr16 = sArr20;
            sArr12 = sArr22;
            yandex = sArr23;
        }
        C12422e c12422e = new C12422e(c12048e, license, yandex, yandex2, yandex4, metrica, purchase, sArr12, purchase2, sArr16, sArr17, sArr18, sArr19);
        this.f24846e = null;
        this.f24849e = c12422e.f24849e;
        this.f24839e = c12422e.f24839e;
        this.f24852e = c12422e.f24852e;
        this.f24851e = c12422e.f24851e;
        this.f24847e = c12422e.f24847e;
        this.f24850e = c12422e.f24850e;
        this.f24843e = c12422e.f24843e;
        this.f24848e = c12422e.f24848e;
        this.f24841e = c12422e.f24841e;
        this.f24840e = c12422e.f24840e;
        this.f24844e = c12422e.f24844e;
    }

    public C12422e(C12048e c12048e, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, c12048e);
        this.f24845e = null;
        this.f24846e = null;
        this.f24842e = (byte[]) bArr.clone();
        this.f24849e = AbstractC1085e.appmetrica(sArr);
        this.f24839e = AbstractC1085e.appmetrica(sArr2);
        this.f24852e = AbstractC1085e.appmetrica(sArr3);
        this.f24851e = AbstractC1085e.appmetrica(sArr4);
        this.f24847e = AbstractC1085e.purchase(sArr5);
        this.f24850e = AbstractC1085e.purchase(sArr6);
        this.f24843e = AbstractC1085e.purchase(sArr7);
        this.f24848e = AbstractC1085e.purchase(sArr8);
        this.f24841e = AbstractC1085e.purchase(sArr9);
        this.f24840e = AbstractC1085e.purchase(sArr10);
        this.f24844e = AbstractC1085e.purchase(sArr11);
    }

    public final byte[] getEncoded() {
        int i = ((C12048e) this.f3209e).f24096e;
        byte[] bArr = this.f24842e;
        byte[] bArr2 = this.f24845e;
        if (i == 3) {
            return AbstractC12442e.adcel(bArr2, bArr);
        }
        return AbstractC12442e.adcel(i == 3 ? AbstractC12442e.adcel(bArr2, bArr) : AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(AbstractC12442e.adcel(bArr, AbstractC1085e.startapp(this.f24849e)), AbstractC1085e.startapp(this.f24839e)), AbstractC1085e.startapp(this.f24851e)), AbstractC1085e.startapp(this.f24852e)), AbstractC1085e.adcel(this.f24847e, true)), AbstractC1085e.adcel(this.f24850e, false)), AbstractC1085e.adcel(this.f24843e, true)), AbstractC1085e.adcel(this.f24848e, false)), AbstractC1085e.adcel(this.f24841e, false)), AbstractC1085e.adcel(this.f24840e, true)), AbstractC1085e.adcel(this.f24844e, false)), this.f24846e);
    }
}
