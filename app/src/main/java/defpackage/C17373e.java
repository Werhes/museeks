package defpackage;

import java.math.BigInteger;

/* renamed from: eۣٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17373e extends AbstractC9932e {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17373e(AbstractC0362e abstractC0362e, AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, int i) {
        super(abstractC0362e, abstractC7861e, abstractC7861e2);
        this.billing = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17373e(AbstractC0362e abstractC0362e, AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr, int i) {
        super(abstractC0362e, abstractC7861e, abstractC7861e2, abstractC7861eArr);
        this.billing = i;
    }

    private final AbstractC9932e ads(AbstractC9932e abstractC9932e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        if (this == abstractC9932e) {
            return isPro();
        }
        C11372e c11372e = (C11372e) this.vip;
        C11372e c11372e2 = (C11372e) this.metrica;
        C11372e c11372e3 = (C11372e) abstractC9932e.vip;
        C11372e c11372e4 = (C11372e) abstractC9932e.startapp();
        C11372e c11372e5 = (C11372e) this.license[0];
        C11372e c11372e6 = (C11372e) abstractC9932e.adcel();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = c11372e5.f22884e;
        boolean loadAd = AbstractC12947e.loadAd(iArr9);
        if (loadAd) {
            iArr = c11372e3.f22884e;
            iArr2 = c11372e4.f22884e;
        } else {
            AbstractC15367e.startapp(iArr9, iArr7);
            AbstractC15367e.appmetrica(iArr7, c11372e3.f22884e, iArr6);
            AbstractC15367e.appmetrica(iArr7, iArr9, iArr7);
            AbstractC15367e.appmetrica(iArr7, c11372e4.f22884e, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = c11372e6.f22884e;
        boolean loadAd2 = AbstractC12947e.loadAd(iArr10);
        if (loadAd2) {
            iArr3 = c11372e.f22884e;
            iArr4 = c11372e2.f22884e;
        } else {
            AbstractC15367e.startapp(iArr10, iArr8);
            AbstractC15367e.appmetrica(iArr8, c11372e.f22884e, iArr5);
            AbstractC15367e.appmetrica(iArr8, iArr10, iArr8);
            AbstractC15367e.appmetrica(iArr8, c11372e2.f22884e, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        AbstractC15367e.mopub(iArr3, iArr, iArr11);
        AbstractC15367e.mopub(iArr4, iArr2, iArr6);
        boolean Signature = AbstractC12947e.Signature(iArr11);
        AbstractC0362e abstractC0362e = this.ad;
        if (Signature) {
            return AbstractC12947e.Signature(iArr6) ? isPro() : abstractC0362e.smaato();
        }
        AbstractC15367e.startapp(iArr11, iArr7);
        int[] iArr12 = new int[7];
        AbstractC15367e.appmetrica(iArr7, iArr11, iArr12);
        AbstractC15367e.appmetrica(iArr7, iArr3, iArr7);
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr12[i2];
        }
        int i3 = (((i >>> 1) | (i & 1)) - 1) >> 31;
        int[] iArr13 = AbstractC15367e.ad;
        if (i3 != 0) {
            AbstractC12947e.inmobi(iArr13, iArr13, iArr12);
        } else {
            AbstractC12947e.inmobi(iArr13, iArr12, iArr12);
        }
        AbstractC12947e.subscription(iArr4, iArr12, iArr5);
        AbstractC15367e.billing(iArr12, AbstractC12947e.metrica(iArr7, iArr7, iArr12));
        C11372e c11372e7 = new C11372e(iArr8);
        AbstractC15367e.startapp(iArr6, iArr8);
        AbstractC15367e.mopub(iArr8, iArr12, iArr8);
        C11372e c11372e8 = new C11372e(iArr12);
        AbstractC15367e.mopub(iArr7, iArr8, iArr12);
        if ((AbstractC12947e.remoteconfig(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && AbstractC12797e.subscription(14, iArr5, AbstractC15367e.vip))) && AbstractC12797e.appmetrica(9, AbstractC15367e.metrica, iArr5) != 0) {
            AbstractC12797e.tapsense(14, 9, iArr5);
        }
        AbstractC15367e.purchase(iArr5, iArr12);
        C11372e c11372e9 = new C11372e(iArr11);
        if (!loadAd) {
            AbstractC15367e.appmetrica(iArr11, iArr9, iArr11);
        }
        if (!loadAd2) {
            AbstractC15367e.appmetrica(iArr11, iArr10, iArr11);
        }
        return new C17373e(abstractC0362e, c11372e7, c11372e8, new AbstractC7861e[]{c11372e9}, 9);
    }

    private final AbstractC9932e crashlytics(AbstractC9932e abstractC9932e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        if (this == abstractC9932e) {
            return isPro();
        }
        C2926e c2926e = (C2926e) this.vip;
        C2926e c2926e2 = (C2926e) this.metrica;
        C2926e c2926e3 = (C2926e) abstractC9932e.vip;
        C2926e c2926e4 = (C2926e) abstractC9932e.startapp();
        C2926e c2926e5 = (C2926e) this.license[0];
        C2926e c2926e6 = (C2926e) abstractC9932e.adcel();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = c2926e5.f6916e;
        boolean signatures = AbstractC10077e.signatures(iArr10);
        if (signatures) {
            iArr = c2926e3.f6916e;
            iArr2 = c2926e4.f6916e;
        } else {
            AbstractC10077e.premium(iArr10, iArr5);
            AbstractC1206e.billing(iArr5, iArr8);
            AbstractC1206e.purchase(iArr8, c2926e3.f6916e, iArr7, iArr5);
            AbstractC10077e.isPro(iArr8, iArr10, iArr5);
            AbstractC1206e.billing(iArr5, iArr8);
            AbstractC1206e.purchase(iArr8, c2926e4.f6916e, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = c2926e6.f6916e;
        boolean signatures2 = AbstractC10077e.signatures(iArr11);
        if (signatures2) {
            iArr3 = c2926e.f6916e;
            iArr4 = c2926e2.f6916e;
        } else {
            AbstractC10077e.premium(iArr11, iArr5);
            AbstractC1206e.billing(iArr5, iArr9);
            AbstractC1206e.purchase(iArr9, c2926e.f6916e, iArr6, iArr5);
            AbstractC10077e.isPro(iArr9, iArr11, iArr5);
            AbstractC1206e.billing(iArr5, iArr9);
            AbstractC1206e.purchase(iArr9, c2926e2.f6916e, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        AbstractC1206e.adcel(iArr3, iArr, iArr12);
        AbstractC1206e.adcel(iArr4, iArr2, iArr7);
        boolean isVip = AbstractC10077e.isVip(iArr12);
        AbstractC0362e abstractC0362e = this.ad;
        if (isVip) {
            return AbstractC10077e.isVip(iArr7) ? isPro() : abstractC0362e.smaato();
        }
        AbstractC10077e.premium(iArr12, iArr5);
        AbstractC1206e.billing(iArr5, iArr8);
        int[] iArr13 = new int[8];
        AbstractC10077e.isPro(iArr8, iArr12, iArr5);
        AbstractC1206e.billing(iArr5, iArr13);
        AbstractC10077e.isPro(iArr8, iArr3, iArr5);
        AbstractC1206e.billing(iArr5, iArr8);
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr13[i2];
        }
        int i3 = (((i >>> 1) | (i & 1)) - 1) >> 31;
        int[] iArr14 = AbstractC1206e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr14, iArr14, iArr13);
        } else {
            AbstractC10077e.crashlytics(iArr14, iArr13, iArr13);
        }
        AbstractC10077e.isPro(iArr4, iArr13, iArr6);
        AbstractC1206e.yandex(iArr13, AbstractC10077e.vip(iArr8, iArr8, iArr13));
        C2926e c2926e7 = new C2926e(iArr9);
        AbstractC10077e.premium(iArr7, iArr5);
        AbstractC1206e.billing(iArr5, iArr9);
        AbstractC1206e.adcel(iArr9, iArr13, iArr9);
        C2926e c2926e8 = new C2926e(iArr13);
        AbstractC1206e.adcel(iArr8, iArr9, iArr13);
        int applovin = AbstractC10077e.applovin(iArr13, iArr7, iArr6);
        int[] iArr15 = AbstractC1206e.vip;
        if (applovin != 0 || ((iArr6[15] >>> 1) >= Integer.MAX_VALUE && AbstractC12797e.subscription(16, iArr6, iArr15))) {
            AbstractC12797e.m3402this(16, iArr15, iArr6);
        }
        AbstractC1206e.billing(iArr6, iArr13);
        C2926e c2926e9 = new C2926e(iArr12);
        if (!signatures) {
            AbstractC1206e.purchase(iArr12, iArr10, iArr12, iArr5);
        }
        if (!signatures2) {
            AbstractC1206e.purchase(iArr12, iArr11, iArr12, iArr5);
        }
        return new C17373e(abstractC0362e, c2926e7, c2926e8, new AbstractC7861e[]{c2926e9}, 12);
    }

    private final AbstractC9932e firebase(AbstractC9932e abstractC9932e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        if (this == abstractC9932e) {
            return isPro();
        }
        C2021e c2021e = (C2021e) this.vip;
        C2021e c2021e2 = (C2021e) this.metrica;
        C2021e c2021e3 = (C2021e) abstractC9932e.vip;
        C2021e c2021e4 = (C2021e) abstractC9932e.startapp();
        C2021e c2021e5 = (C2021e) this.license[0];
        C2021e c2021e6 = (C2021e) abstractC9932e.adcel();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[24];
        int[] iArr8 = new int[12];
        int[] iArr9 = new int[12];
        boolean admob = c2021e5.admob();
        int[] iArr10 = c2021e5.f5299e;
        if (admob) {
            iArr = c2021e3.f5299e;
            iArr2 = c2021e4.f5299e;
        } else {
            C4094e.mopub(iArr10, iArr5);
            AbstractC1396e.purchase(iArr5, iArr8);
            AbstractC1396e.license(iArr8, c2021e3.f5299e, iArr7, iArr5);
            C4094e.startapp(iArr8, iArr10, iArr5);
            AbstractC1396e.purchase(iArr5, iArr8);
            AbstractC1396e.license(iArr8, c2021e4.f5299e, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        boolean admob2 = c2021e6.admob();
        int[] iArr11 = c2021e6.f5299e;
        if (admob2) {
            iArr3 = c2021e.f5299e;
            iArr4 = c2021e2.f5299e;
        } else {
            C4094e.mopub(iArr11, iArr5);
            AbstractC1396e.purchase(iArr5, iArr9);
            AbstractC1396e.license(iArr9, c2021e.f5299e, iArr6, iArr5);
            C4094e.startapp(iArr9, iArr11, iArr5);
            AbstractC1396e.purchase(iArr5, iArr9);
            AbstractC1396e.license(iArr9, c2021e2.f5299e, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[12];
        AbstractC1396e.startapp(iArr3, iArr, iArr12);
        int[] iArr13 = new int[12];
        AbstractC1396e.startapp(iArr4, iArr2, iArr13);
        boolean applovin = AbstractC12797e.applovin(iArr12, 12);
        AbstractC0362e abstractC0362e = this.ad;
        if (applovin) {
            return AbstractC12797e.applovin(iArr13, 12) ? isPro() : abstractC0362e.smaato();
        }
        C4094e.mopub(iArr12, iArr5);
        AbstractC1396e.purchase(iArr5, iArr8);
        int[] iArr14 = new int[12];
        C4094e.startapp(iArr8, iArr12, iArr5);
        AbstractC1396e.purchase(iArr5, iArr14);
        AbstractC1396e.license(iArr8, iArr3, iArr8, iArr5);
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3++) {
            i2 |= iArr14[i3];
        }
        int i4 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr15 = AbstractC1396e.ad;
        if (i4 != 0) {
            i = 12;
            AbstractC12797e.m3397class(12, iArr15, iArr15, iArr14);
        } else {
            i = 12;
            AbstractC12797e.m3397class(12, iArr15, iArr14, iArr14);
        }
        C4094e.startapp(iArr4, iArr14, iArr6);
        AbstractC1396e.billing(iArr14, AbstractC12797e.metrica(i, iArr8, iArr8, iArr14));
        C2021e c2021e7 = new C2021e(iArr9);
        C4094e.mopub(iArr13, iArr5);
        AbstractC1396e.purchase(iArr5, iArr9);
        AbstractC1396e.startapp(iArr9, iArr14, iArr9);
        C2021e c2021e8 = new C2021e(iArr14);
        AbstractC1396e.startapp(iArr8, iArr9, iArr14);
        C4094e.startapp(iArr14, iArr13, iArr7);
        if ((AbstractC12797e.ad(24, iArr6, iArr7, iArr6) != 0 || (iArr6[23] == -1 && AbstractC12797e.subscription(24, iArr6, AbstractC1396e.vip))) && AbstractC12797e.appmetrica(17, AbstractC1396e.metrica, iArr6) != 0) {
            AbstractC12797e.tapsense(24, 17, iArr6);
        }
        AbstractC1396e.purchase(iArr6, iArr14);
        C2021e c2021e9 = new C2021e(iArr12);
        if (!admob) {
            AbstractC1396e.license(iArr12, iArr10, iArr12, iArr5);
        }
        if (!admob2) {
            AbstractC1396e.license(iArr12, iArr11, iArr12, iArr5);
        }
        return new C17373e(abstractC0362e, c2021e7, c2021e8, new AbstractC7861e[]{c2021e9}, 13);
    }

    private final AbstractC9932e premium(AbstractC9932e abstractC9932e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        if (this == abstractC9932e) {
            return isPro();
        }
        C10207e c10207e = (C10207e) this.vip;
        C10207e c10207e2 = (C10207e) this.metrica;
        C10207e c10207e3 = (C10207e) abstractC9932e.vip;
        C10207e c10207e4 = (C10207e) abstractC9932e.startapp();
        C10207e c10207e5 = (C10207e) this.license[0];
        C10207e c10207e6 = (C10207e) abstractC9932e.adcel();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = c10207e5.f20180e;
        boolean loadAd = AbstractC12947e.loadAd(iArr9);
        if (loadAd) {
            iArr = c10207e3.f20180e;
            iArr2 = c10207e4.f20180e;
        } else {
            AbstractC17808e.smaato(iArr9, iArr7);
            AbstractC17808e.appmetrica(iArr7, c10207e3.f20180e, iArr6);
            AbstractC17808e.appmetrica(iArr7, iArr9, iArr7);
            AbstractC17808e.appmetrica(iArr7, c10207e4.f20180e, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = c10207e6.f20180e;
        boolean loadAd2 = AbstractC12947e.loadAd(iArr10);
        if (loadAd2) {
            iArr3 = c10207e.f20180e;
            iArr4 = c10207e2.f20180e;
        } else {
            AbstractC17808e.smaato(iArr10, iArr8);
            AbstractC17808e.appmetrica(iArr8, c10207e.f20180e, iArr5);
            AbstractC17808e.appmetrica(iArr8, iArr10, iArr8);
            AbstractC17808e.appmetrica(iArr8, c10207e2.f20180e, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        AbstractC17808e.amazon(iArr3, iArr, iArr11);
        AbstractC17808e.amazon(iArr4, iArr2, iArr6);
        boolean Signature = AbstractC12947e.Signature(iArr11);
        AbstractC0362e abstractC0362e = this.ad;
        if (Signature) {
            return AbstractC12947e.Signature(iArr6) ? isPro() : abstractC0362e.smaato();
        }
        AbstractC17808e.smaato(iArr11, iArr7);
        int[] iArr12 = new int[7];
        AbstractC17808e.appmetrica(iArr7, iArr11, iArr12);
        AbstractC17808e.appmetrica(iArr7, iArr3, iArr7);
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr12[i2];
        }
        int i3 = (((i >>> 1) | (i & 1)) - 1) >> 31;
        int[] iArr13 = AbstractC17808e.ad;
        if (i3 != 0) {
            AbstractC12947e.inmobi(iArr13, iArr13, iArr12);
        } else {
            AbstractC12947e.inmobi(iArr13, iArr12, iArr12);
        }
        AbstractC12947e.subscription(iArr4, iArr12, iArr5);
        AbstractC17808e.startapp(iArr12, AbstractC12947e.metrica(iArr7, iArr7, iArr12));
        C10207e c10207e7 = new C10207e(iArr8);
        AbstractC17808e.smaato(iArr6, iArr8);
        AbstractC17808e.amazon(iArr8, iArr12, iArr8);
        C10207e c10207e8 = new C10207e(iArr12);
        AbstractC17808e.amazon(iArr7, iArr8, iArr12);
        if ((AbstractC12947e.remoteconfig(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && AbstractC12797e.subscription(14, iArr5, AbstractC17808e.vip))) && AbstractC12797e.appmetrica(11, AbstractC17808e.metrica, iArr5) != 0) {
            AbstractC12797e.tapsense(14, 11, iArr5);
        }
        AbstractC17808e.yandex(iArr5, iArr12);
        C10207e c10207e9 = new C10207e(iArr11);
        if (!loadAd) {
            AbstractC17808e.appmetrica(iArr11, iArr9, iArr11);
        }
        if (!loadAd2) {
            AbstractC17808e.appmetrica(iArr11, iArr10, iArr11);
        }
        return new C17373e(abstractC0362e, c10207e7, c10207e8, new AbstractC7861e[]{c10207e9}, 10);
    }

    private final AbstractC9932e subs(AbstractC9932e abstractC9932e) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        if (this == abstractC9932e) {
            return isPro();
        }
        C13183e c13183e = (C13183e) this.vip;
        C13183e c13183e2 = (C13183e) this.metrica;
        C13183e c13183e3 = (C13183e) abstractC9932e.vip;
        C13183e c13183e4 = (C13183e) abstractC9932e.startapp();
        C13183e c13183e5 = (C13183e) this.license[0];
        C13183e c13183e6 = (C13183e) abstractC9932e.adcel();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = new int[8];
        int[] iArr10 = c13183e5.f26185e;
        boolean signatures = AbstractC10077e.signatures(iArr10);
        if (signatures) {
            iArr = c13183e3.f26185e;
            iArr2 = c13183e4.f26185e;
        } else {
            AbstractC10077e.premium(iArr10, iArr5);
            AbstractC11866e.yandex(iArr5, iArr8);
            AbstractC11866e.appmetrica(iArr8, c13183e3.f26185e, iArr7, iArr5);
            AbstractC10077e.isPro(iArr8, iArr10, iArr5);
            AbstractC11866e.yandex(iArr5, iArr8);
            AbstractC11866e.appmetrica(iArr8, c13183e4.f26185e, iArr8, iArr5);
            iArr = iArr7;
            iArr2 = iArr8;
        }
        int[] iArr11 = c13183e6.f26185e;
        boolean signatures2 = AbstractC10077e.signatures(iArr11);
        if (signatures2) {
            iArr3 = c13183e.f26185e;
            iArr4 = c13183e2.f26185e;
        } else {
            AbstractC10077e.premium(iArr11, iArr5);
            AbstractC11866e.yandex(iArr5, iArr9);
            AbstractC11866e.appmetrica(iArr9, c13183e.f26185e, iArr6, iArr5);
            AbstractC10077e.isPro(iArr9, iArr11, iArr5);
            AbstractC11866e.yandex(iArr5, iArr9);
            AbstractC11866e.appmetrica(iArr9, c13183e2.f26185e, iArr9, iArr5);
            iArr3 = iArr6;
            iArr4 = iArr9;
        }
        int[] iArr12 = new int[8];
        AbstractC11866e.advert(iArr3, iArr, iArr12);
        AbstractC11866e.advert(iArr4, iArr2, iArr7);
        boolean isVip = AbstractC10077e.isVip(iArr12);
        AbstractC0362e abstractC0362e = this.ad;
        if (isVip) {
            return AbstractC10077e.isVip(iArr7) ? isPro() : abstractC0362e.smaato();
        }
        AbstractC10077e.premium(iArr12, iArr5);
        AbstractC11866e.yandex(iArr5, iArr8);
        int[] iArr13 = new int[8];
        AbstractC10077e.isPro(iArr8, iArr12, iArr5);
        AbstractC11866e.yandex(iArr5, iArr13);
        AbstractC10077e.isPro(iArr8, iArr3, iArr5);
        AbstractC11866e.yandex(iArr5, iArr8);
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr13[i2];
        }
        int i3 = (((i >>> 1) | (i & 1)) - 1) >> 31;
        int[] iArr14 = AbstractC11866e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr14, iArr14, iArr13);
        } else {
            AbstractC10077e.crashlytics(iArr14, iArr13, iArr13);
        }
        AbstractC10077e.isPro(iArr4, iArr13, iArr6);
        AbstractC11866e.startapp(iArr13, AbstractC10077e.vip(iArr8, iArr8, iArr13));
        C13183e c13183e7 = new C13183e(iArr9);
        AbstractC10077e.premium(iArr7, iArr5);
        AbstractC11866e.yandex(iArr5, iArr9);
        AbstractC11866e.advert(iArr9, iArr13, iArr9);
        C13183e c13183e8 = new C13183e(iArr13);
        AbstractC11866e.advert(iArr8, iArr9, iArr13);
        if ((AbstractC10077e.applovin(iArr13, iArr7, iArr6) != 0 || (iArr6[15] == -1 && AbstractC12797e.subscription(16, iArr6, AbstractC11866e.vip))) && AbstractC12797e.appmetrica(10, AbstractC11866e.metrica, iArr6) != 0) {
            AbstractC12797e.tapsense(16, 10, iArr6);
        }
        AbstractC11866e.yandex(iArr6, iArr13);
        C13183e c13183e9 = new C13183e(iArr12);
        if (!signatures) {
            AbstractC11866e.appmetrica(iArr12, iArr10, iArr12, iArr5);
        }
        if (!signatures2) {
            AbstractC11866e.appmetrica(iArr12, iArr11, iArr12, iArr5);
        }
        return new C17373e(abstractC0362e, c13183e7, c13183e8, new AbstractC7861e[]{c13183e9}, 11);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.AbstractC9932e
    public final defpackage.AbstractC9932e ad(defpackage.AbstractC9932e r41) {
        /*
            Method dump skipped, instructions count: 3496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17373e.ad(eٍۨؔ):eٍۨؔ");
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e applovin(AbstractC9932e abstractC9932e) {
        switch (this.billing) {
            case 0:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : m4311this(false).ad(abstractC9932e);
            case 1:
                if (this == abstractC9932e) {
                    return isVip();
                }
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                AbstractC7861e abstractC7861e = this.metrica;
                if (abstractC7861e.subscription()) {
                    return abstractC9932e;
                }
                AbstractC0362e abstractC0362e = this.ad;
                int i = abstractC0362e.purchase;
                if (i != 0) {
                    return i != 4 ? isPro().ad(abstractC9932e) : m4310native(false).ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e2 = abstractC9932e.vip;
                AbstractC7861e abstractC7861e3 = abstractC9932e.metrica;
                AbstractC7861e abstractC7861e4 = this.vip;
                AbstractC7861e subs = abstractC7861e2.subs(abstractC7861e4);
                AbstractC7861e subs2 = abstractC7861e3.subs(abstractC7861e);
                if (subs.subscription()) {
                    return subs2.subscription() ? isVip() : this;
                }
                AbstractC7861e applovin = subs.applovin();
                AbstractC7861e subs3 = applovin.remoteconfig(abstractC7861e4.ad(abstractC7861e4).ad(abstractC7861e2)).subs(subs2.applovin());
                if (subs3.subscription()) {
                    return abstractC0362e.smaato();
                }
                AbstractC7861e Signature = subs3.remoteconfig(subs).Signature();
                AbstractC7861e remoteconfig = subs3.remoteconfig(Signature).remoteconfig(subs2);
                AbstractC7861e subs4 = abstractC7861e.ad(abstractC7861e).remoteconfig(applovin).remoteconfig(subs).remoteconfig(Signature).subs(remoteconfig);
                AbstractC7861e ad = subs4.subs(remoteconfig).remoteconfig(remoteconfig.ad(subs4)).ad(abstractC7861e2);
                return new C17373e(abstractC0362e, ad, abstractC7861e4.subs(ad).remoteconfig(subs4).subs(abstractC7861e), 1);
            case 2:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 3:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 4:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 5:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 6:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 7:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 8:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 9:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 10:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 11:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 12:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            case 13:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
            default:
                return this == abstractC9932e ? isVip() : advert() ? abstractC9932e : abstractC9932e.advert() ? isPro() : this.metrica.subscription() ? abstractC9932e : isPro().ad(abstractC9932e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e٘ۧ, eًُ٘] */
    /* renamed from: class, reason: not valid java name */
    public C18150e m4307class(C18150e c18150e, int[] iArr) {
        C18150e c18150e2 = (C18150e) this.ad.vip;
        if (AbstractC10077e.signatures(c18150e.f35562e)) {
            return c18150e2;
        }
        ?? abstractC7861e = new AbstractC7861e(3);
        int[] iArr2 = new int[8];
        abstractC7861e.f35562e = iArr2;
        if (iArr == null) {
            AbstractC15710e.advert(c18150e.f35562e, iArr2);
            iArr = iArr2;
        }
        AbstractC15710e.advert(iArr, iArr2);
        AbstractC15710e.yandex(iArr2, c18150e2.f35562e, iArr2);
        return abstractC7861e;
    }

    /* renamed from: goto, reason: not valid java name */
    public AbstractC7861e m4308goto() {
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e = abstractC7861eArr[1];
        if (abstractC7861e != null) {
            return abstractC7861e;
        }
        AbstractC7861e m4309interface = m4309interface(abstractC7861eArr[0], null);
        abstractC7861eArr[1] = m4309interface;
        return m4309interface;
    }

    @Override // defpackage.AbstractC9932e
    public AbstractC9932e inmobi(int i) {
        C17373e c17373e;
        AbstractC7861e applovin;
        switch (this.billing) {
            case 1:
                if (i < 0) {
                    throw new IllegalArgumentException("'e' cannot be negative");
                }
                if (i == 0 || advert()) {
                    return this;
                }
                int i2 = 1;
                if (i == 1) {
                    return isPro();
                }
                AbstractC7861e abstractC7861e = this.metrica;
                boolean subscription = abstractC7861e.subscription();
                AbstractC0362e abstractC0362e = this.ad;
                if (!subscription) {
                    int i3 = abstractC0362e.purchase;
                    AbstractC7861e abstractC7861e2 = abstractC0362e.vip;
                    AbstractC7861e[] abstractC7861eArr = this.license;
                    boolean z = false;
                    AbstractC7861e adcel = abstractC7861eArr.length < 1 ? abstractC0362e.adcel(InterfaceC4563e.Signature) : abstractC7861eArr[0];
                    boolean admob = adcel.admob();
                    AbstractC7861e abstractC7861e3 = this.vip;
                    if (!admob && i3 != 0) {
                        if (i3 == 1) {
                            applovin = adcel.applovin();
                            abstractC7861e3 = abstractC7861e3.remoteconfig(adcel);
                            abstractC7861e = abstractC7861e.remoteconfig(applovin);
                        } else if (i3 == 2) {
                            applovin = null;
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("unsupported coordinate system");
                            }
                            abstractC7861e2 = m4308goto();
                        }
                        abstractC7861e2 = m4309interface(adcel, applovin);
                    }
                    AbstractC7861e abstractC7861e4 = abstractC7861e;
                    int i4 = 0;
                    while (i4 < i) {
                        if (!abstractC7861e4.subscription()) {
                            AbstractC7861e applovin2 = abstractC7861e3.applovin();
                            AbstractC7861e ad = applovin2.ad(applovin2).ad(applovin2);
                            AbstractC7861e ad2 = abstractC7861e4.ad(abstractC7861e4);
                            AbstractC7861e remoteconfig = ad2.remoteconfig(abstractC7861e4);
                            AbstractC7861e remoteconfig2 = abstractC7861e3.remoteconfig(remoteconfig);
                            AbstractC7861e ad3 = remoteconfig2.ad(remoteconfig2);
                            AbstractC7861e applovin3 = remoteconfig.applovin();
                            AbstractC7861e ad4 = applovin3.ad(applovin3);
                            if (!abstractC7861e2.subscription()) {
                                ad = ad.ad(abstractC7861e2);
                                AbstractC7861e remoteconfig3 = ad4.remoteconfig(abstractC7861e2);
                                abstractC7861e2 = remoteconfig3.ad(remoteconfig3);
                            }
                            boolean z2 = z;
                            AbstractC7861e subs = ad.applovin().subs(ad3.ad(ad3));
                            abstractC7861e4 = ad.remoteconfig(ad3.subs(subs)).subs(ad4);
                            adcel = adcel.admob() ? ad2 : ad2.remoteconfig(adcel);
                            i4++;
                            abstractC7861e3 = subs;
                            z = z2;
                        }
                    }
                    boolean z3 = z;
                    if (i3 == 0) {
                        AbstractC7861e Signature = adcel.Signature();
                        AbstractC7861e applovin4 = Signature.applovin();
                        return new C17373e(abstractC0362e, abstractC7861e3.remoteconfig(applovin4), abstractC7861e4.remoteconfig(applovin4.remoteconfig(Signature)), i2);
                    }
                    if (i3 == 1) {
                        AbstractC7861e abstractC7861e5 = adcel;
                        AbstractC7861e remoteconfig4 = abstractC7861e3.remoteconfig(abstractC7861e5);
                        AbstractC7861e[] abstractC7861eArr2 = new AbstractC7861e[1];
                        abstractC7861eArr2[z3 ? 1 : 0] = abstractC7861e5.remoteconfig(abstractC7861e5.applovin());
                        c17373e = new C17373e(abstractC0362e, remoteconfig4, abstractC7861e4, abstractC7861eArr2, 1);
                    } else if (i3 == 2) {
                        AbstractC7861e[] abstractC7861eArr3 = new AbstractC7861e[1];
                        abstractC7861eArr3[z3 ? 1 : 0] = adcel;
                        c17373e = new C17373e(abstractC0362e, abstractC7861e3, abstractC7861e4, abstractC7861eArr3, 1);
                    } else {
                        if (i3 != 4) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        AbstractC7861e[] abstractC7861eArr4 = new AbstractC7861e[2];
                        abstractC7861eArr4[z3 ? 1 : 0] = adcel;
                        abstractC7861eArr4[1] = abstractC7861e2;
                        c17373e = new C17373e(abstractC0362e, abstractC7861e3, abstractC7861e4, abstractC7861eArr4, 1);
                    }
                    return c17373e;
                }
                return abstractC0362e.smaato();
            default:
                return super.inmobi(i);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public AbstractC7861e m4309interface(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        AbstractC7861e abstractC7861e3 = this.ad.vip;
        if (abstractC7861e3.subscription() || abstractC7861e.admob()) {
            return abstractC7861e3;
        }
        if (abstractC7861e2 == null) {
            abstractC7861e2 = abstractC7861e.applovin();
        }
        AbstractC7861e applovin = abstractC7861e2.applovin();
        AbstractC7861e tapsense = abstractC7861e3.tapsense();
        return tapsense.metrica() < abstractC7861e3.metrica() ? applovin.remoteconfig(tapsense).tapsense() : applovin.remoteconfig(abstractC7861e3);
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e isPro() {
        C17373e c17373e;
        AbstractC7861e abstractC7861e;
        AbstractC7861e remoteconfig;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int i = this.billing;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e2 = this.vip;
        AbstractC7861e abstractC7861e3 = this.metrica;
        switch (i) {
            case 0:
                return advert() ? this : abstractC7861e3.subscription() ? this.ad.smaato() : m4311this(true);
            case 1:
                if (advert()) {
                    return this;
                }
                boolean subscription = abstractC7861e3.subscription();
                AbstractC0362e abstractC0362e = this.ad;
                if (subscription) {
                    return abstractC0362e.smaato();
                }
                int i2 = abstractC0362e.purchase;
                if (i2 == 0) {
                    AbstractC7861e applovin = abstractC7861e2.applovin();
                    AbstractC7861e yandex = applovin.ad(applovin).ad(applovin).ad(abstractC0362e.vip).yandex(abstractC7861e3.ad(abstractC7861e3));
                    AbstractC7861e subs = yandex.applovin().subs(abstractC7861e2.ad(abstractC7861e2));
                    return new C17373e(abstractC0362e, subs, yandex.remoteconfig(abstractC7861e2.subs(subs)).subs(abstractC7861e3), 1);
                }
                if (i2 == 1) {
                    AbstractC7861e abstractC7861e4 = abstractC7861eArr[0];
                    boolean admob = abstractC7861e4.admob();
                    AbstractC7861e abstractC7861e5 = abstractC0362e.vip;
                    if (!abstractC7861e5.subscription() && !admob) {
                        abstractC7861e5 = abstractC7861e5.remoteconfig(abstractC7861e4.applovin());
                    }
                    AbstractC7861e applovin2 = abstractC7861e2.applovin();
                    AbstractC7861e ad = abstractC7861e5.ad(applovin2.ad(applovin2).ad(applovin2));
                    AbstractC7861e remoteconfig2 = admob ? abstractC7861e3 : abstractC7861e3.remoteconfig(abstractC7861e4);
                    AbstractC7861e applovin3 = admob ? abstractC7861e3.applovin() : remoteconfig2.remoteconfig(abstractC7861e3);
                    AbstractC7861e remoteconfig3 = abstractC7861e2.remoteconfig(applovin3);
                    AbstractC7861e ad2 = remoteconfig3.ad(remoteconfig3);
                    AbstractC7861e ad3 = ad2.ad(ad2);
                    AbstractC7861e subs2 = ad.applovin().subs(ad3.ad(ad3));
                    AbstractC7861e ad4 = remoteconfig2.ad(remoteconfig2);
                    AbstractC7861e remoteconfig4 = subs2.remoteconfig(ad4);
                    AbstractC7861e ad5 = applovin3.ad(applovin3);
                    AbstractC7861e remoteconfig5 = ad3.subs(subs2).remoteconfig(ad);
                    AbstractC7861e applovin4 = ad5.applovin();
                    AbstractC7861e subs3 = remoteconfig5.subs(applovin4.ad(applovin4));
                    AbstractC7861e ad6 = admob ? ad5.ad(ad5) : ad4.applovin();
                    c17373e = new C17373e(abstractC0362e, remoteconfig4, subs3, new AbstractC7861e[]{ad6.ad(ad6).remoteconfig(remoteconfig2)}, 1);
                } else {
                    if (i2 != 2) {
                        if (i2 == 4) {
                            return m4310native(true);
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    AbstractC7861e abstractC7861e6 = abstractC7861eArr[0];
                    boolean admob2 = abstractC7861e6.admob();
                    AbstractC7861e applovin5 = abstractC7861e3.applovin();
                    AbstractC7861e applovin6 = applovin5.applovin();
                    AbstractC7861e abstractC7861e7 = abstractC0362e.vip;
                    AbstractC7861e tapsense = abstractC7861e7.tapsense();
                    if (tapsense.firebase().equals(BigInteger.valueOf(3L))) {
                        AbstractC7861e applovin7 = admob2 ? abstractC7861e6 : abstractC7861e6.applovin();
                        AbstractC7861e remoteconfig6 = abstractC7861e2.ad(applovin7).remoteconfig(abstractC7861e2.subs(applovin7));
                        abstractC7861e = remoteconfig6.ad(remoteconfig6).ad(remoteconfig6);
                        remoteconfig = applovin5.remoteconfig(abstractC7861e2);
                    } else {
                        AbstractC7861e applovin8 = abstractC7861e2.applovin();
                        AbstractC7861e ad7 = applovin8.ad(applovin8).ad(applovin8);
                        if (!admob2) {
                            if (abstractC7861e7.subscription()) {
                                abstractC7861e = ad7;
                            } else {
                                AbstractC7861e applovin9 = abstractC7861e6.applovin().applovin();
                                if (tapsense.metrica() < abstractC7861e7.metrica()) {
                                    abstractC7861e = ad7.subs(applovin9.remoteconfig(tapsense));
                                } else {
                                    abstractC7861e7 = applovin9.remoteconfig(abstractC7861e7);
                                }
                            }
                            remoteconfig = abstractC7861e2.remoteconfig(applovin5);
                        }
                        abstractC7861e = ad7.ad(abstractC7861e7);
                        remoteconfig = abstractC7861e2.remoteconfig(applovin5);
                    }
                    AbstractC7861e ad8 = remoteconfig.ad(remoteconfig);
                    AbstractC7861e ad9 = ad8.ad(ad8);
                    AbstractC7861e subs4 = abstractC7861e.applovin().subs(ad9.ad(ad9));
                    AbstractC7861e remoteconfig7 = ad9.subs(subs4).remoteconfig(abstractC7861e);
                    AbstractC7861e ad10 = applovin6.ad(applovin6);
                    AbstractC7861e ad11 = ad10.ad(ad10);
                    AbstractC7861e subs5 = remoteconfig7.subs(ad11.ad(ad11));
                    AbstractC7861e ad12 = abstractC7861e3.ad(abstractC7861e3);
                    if (!admob2) {
                        ad12 = ad12.remoteconfig(abstractC7861e6);
                    }
                    c17373e = new C17373e(abstractC0362e, subs4, subs5, new AbstractC7861e[]{ad12}, 1);
                }
                return c17373e;
            case 2:
                if (advert()) {
                    return this;
                }
                int[] iArr10 = ((C5472e) abstractC7861e3).f11749e;
                boolean isVip = AbstractC10077e.isVip(iArr10);
                AbstractC0362e abstractC0362e2 = this.ad;
                if (isVip) {
                    return abstractC0362e2.smaato();
                }
                C5472e c5472e = (C5472e) abstractC7861e2;
                C5472e c5472e2 = (C5472e) abstractC7861eArr[0];
                int[] iArr11 = new int[8];
                int[] iArr12 = new int[8];
                int[] iArr13 = new int[8];
                AbstractC8677e.yandex(iArr10, iArr13);
                int[] iArr14 = new int[8];
                AbstractC8677e.yandex(iArr13, iArr14);
                int[] iArr15 = c5472e2.f11749e;
                boolean signatures = AbstractC10077e.signatures(iArr15);
                if (signatures) {
                    iArr = iArr15;
                } else {
                    AbstractC8677e.yandex(iArr15, iArr12);
                    iArr = iArr12;
                }
                int[] iArr16 = c5472e.f11749e;
                AbstractC8677e.adcel(iArr16, iArr, iArr11);
                AbstractC8677e.ad(iArr16, iArr, iArr12);
                AbstractC8677e.appmetrica(iArr12, iArr11, iArr12);
                AbstractC8677e.billing(iArr12, AbstractC10077e.vip(iArr12, iArr12, iArr12));
                AbstractC8677e.appmetrica(iArr13, iArr16, iArr13);
                AbstractC8677e.billing(iArr13, AbstractC12797e.firebase(iArr13, 8));
                AbstractC8677e.billing(iArr11, AbstractC12797e.crashlytics(8, iArr14, iArr11));
                C5472e c5472e3 = new C5472e(iArr14);
                AbstractC8677e.yandex(iArr12, iArr14);
                AbstractC8677e.adcel(iArr14, iArr13, iArr14);
                AbstractC8677e.adcel(iArr14, iArr13, iArr14);
                C5472e c5472e4 = new C5472e(iArr13);
                AbstractC8677e.adcel(iArr13, iArr14, iArr13);
                AbstractC8677e.appmetrica(iArr13, iArr12, iArr13);
                AbstractC8677e.adcel(iArr13, iArr11, iArr13);
                C5472e c5472e5 = new C5472e(iArr12);
                if (AbstractC12797e.subs(8, 0, iArr10, iArr12) != 0 || ((iArr12[7] >>> 1) >= Integer.MAX_VALUE && AbstractC10077e.pro(iArr12, AbstractC8677e.ad))) {
                    AbstractC8677e.vip(iArr12);
                }
                if (!signatures) {
                    AbstractC8677e.appmetrica(iArr12, iArr15, iArr12);
                }
                return new C17373e(abstractC0362e2, c5472e3, c5472e4, new AbstractC7861e[]{c5472e5}, 2);
            case 3:
                if (advert()) {
                    return this;
                }
                int[] iArr17 = ((C5356e) abstractC7861e3).f11477e;
                boolean yandex2 = AbstractC0173e.yandex(iArr17);
                AbstractC0362e abstractC0362e3 = this.ad;
                if (yandex2) {
                    return abstractC0362e3.smaato();
                }
                C5356e c5356e = (C5356e) abstractC7861e2;
                C5356e c5356e2 = (C5356e) abstractC7861eArr[0];
                int[] iArr18 = new int[4];
                int[] iArr19 = new int[4];
                int[] iArr20 = new int[4];
                AbstractC10003e.adcel(iArr17, iArr20);
                int[] iArr21 = new int[4];
                AbstractC10003e.adcel(iArr20, iArr21);
                int[] iArr22 = c5356e2.f11477e;
                boolean billing = AbstractC0173e.billing(iArr22);
                if (billing) {
                    iArr2 = iArr22;
                } else {
                    AbstractC10003e.adcel(iArr22, iArr19);
                    iArr2 = iArr19;
                }
                int[] iArr23 = c5356e.f11477e;
                AbstractC10003e.advert(iArr23, iArr2, iArr18);
                AbstractC10003e.vip(iArr23, iArr2, iArr19);
                AbstractC10003e.billing(iArr19, iArr18, iArr19);
                AbstractC10003e.startapp(iArr19, AbstractC0173e.vip(iArr19, iArr19, iArr19));
                AbstractC10003e.billing(iArr20, iArr23, iArr20);
                AbstractC10003e.startapp(iArr20, AbstractC12797e.firebase(iArr20, 4));
                AbstractC10003e.startapp(iArr18, AbstractC12797e.crashlytics(4, iArr21, iArr18));
                C5356e c5356e3 = new C5356e(iArr21);
                AbstractC10003e.adcel(iArr19, iArr21);
                AbstractC10003e.advert(iArr21, iArr20, iArr21);
                AbstractC10003e.advert(iArr21, iArr20, iArr21);
                C5356e c5356e4 = new C5356e(iArr20);
                AbstractC10003e.advert(iArr20, iArr21, iArr20);
                AbstractC10003e.billing(iArr20, iArr19, iArr20);
                AbstractC10003e.advert(iArr20, iArr18, iArr20);
                C5356e c5356e5 = new C5356e(iArr19);
                if (AbstractC12797e.subs(4, 0, iArr17, iArr19) != 0 || ((iArr19[3] >>> 1) >= 2147483646 && AbstractC0173e.purchase(iArr19, AbstractC10003e.ad))) {
                    AbstractC10003e.metrica(iArr19);
                }
                if (!billing) {
                    AbstractC10003e.billing(iArr19, iArr22, iArr19);
                }
                return new C17373e(abstractC0362e3, c5356e3, c5356e4, new AbstractC7861e[]{c5356e5}, 3);
            case 4:
                if (advert()) {
                    return this;
                }
                int[] iArr24 = ((C4312e) abstractC7861e3).f9426e;
                boolean subscription2 = AbstractC15077e.subscription(iArr24);
                AbstractC0362e abstractC0362e4 = this.ad;
                if (subscription2) {
                    return abstractC0362e4.smaato();
                }
                C4312e c4312e = (C4312e) abstractC7861e2;
                C4312e c4312e2 = (C4312e) abstractC7861eArr[0];
                int[] iArr25 = new int[5];
                AbstractC8457e.billing(iArr24, iArr25);
                int[] iArr26 = new int[5];
                AbstractC8457e.billing(iArr25, iArr26);
                int[] iArr27 = new int[5];
                AbstractC8457e.billing(c4312e.f9426e, iArr27);
                AbstractC8457e.purchase(iArr27, AbstractC15077e.adcel(iArr27, iArr27, iArr27));
                AbstractC8457e.metrica(iArr25, c4312e.f9426e, iArr25);
                AbstractC8457e.purchase(iArr25, AbstractC12797e.firebase(iArr25, 5));
                int[] iArr28 = new int[5];
                AbstractC8457e.purchase(iArr28, AbstractC12797e.crashlytics(5, iArr26, iArr28));
                C4312e c4312e3 = new C4312e(iArr26);
                AbstractC8457e.billing(iArr27, iArr26);
                AbstractC8457e.startapp(iArr26, iArr25, iArr26);
                AbstractC8457e.startapp(iArr26, iArr25, iArr26);
                C4312e c4312e4 = new C4312e(iArr25);
                AbstractC8457e.startapp(iArr25, iArr26, iArr25);
                AbstractC8457e.metrica(iArr25, iArr27, iArr25);
                AbstractC8457e.startapp(iArr25, iArr28, iArr25);
                C4312e c4312e5 = new C4312e(iArr27);
                AbstractC8457e.adcel(iArr24, iArr27);
                if (!AbstractC15077e.admob(c4312e2.f9426e)) {
                    AbstractC8457e.metrica(iArr27, c4312e2.f9426e, iArr27);
                }
                return new C17373e(abstractC0362e4, c4312e3, c4312e4, new AbstractC7861e[]{c4312e5}, 4);
            case 5:
                if (advert()) {
                    return this;
                }
                int[] iArr29 = ((C15557e) abstractC7861e3).f30713e;
                boolean subscription3 = AbstractC15077e.subscription(iArr29);
                AbstractC0362e abstractC0362e5 = this.ad;
                if (subscription3) {
                    return abstractC0362e5.smaato();
                }
                C15557e c15557e = (C15557e) abstractC7861e2;
                C15557e c15557e2 = (C15557e) abstractC7861eArr[0];
                int[] iArr30 = new int[5];
                int[] iArr31 = new int[5];
                int[] iArr32 = new int[5];
                AbstractC8787e.startapp(iArr29, iArr32);
                int[] iArr33 = new int[5];
                AbstractC8787e.startapp(iArr32, iArr33);
                int[] iArr34 = c15557e2.f30713e;
                boolean admob3 = AbstractC15077e.admob(iArr34);
                if (admob3) {
                    iArr3 = iArr34;
                } else {
                    AbstractC8787e.startapp(iArr34, iArr31);
                    iArr3 = iArr31;
                }
                int[] iArr35 = c15557e.f30713e;
                AbstractC8787e.mopub(iArr35, iArr3, iArr30);
                int startapp = AbstractC15077e.startapp(iArr35, iArr3, iArr31);
                int[] iArr36 = AbstractC8787e.ad;
                if (startapp != 0 || (iArr31[4] == -1 && AbstractC15077e.Signature(iArr31, iArr36))) {
                    AbstractC12797e.billing(5, -2147483647, iArr31);
                }
                AbstractC8787e.purchase(iArr31, iArr30, iArr31);
                AbstractC8787e.yandex(iArr31, AbstractC15077e.adcel(iArr31, iArr31, iArr31));
                AbstractC8787e.purchase(iArr32, iArr35, iArr32);
                AbstractC8787e.yandex(iArr32, AbstractC12797e.firebase(iArr32, 5));
                AbstractC8787e.yandex(iArr30, AbstractC12797e.crashlytics(5, iArr33, iArr30));
                C15557e c15557e3 = new C15557e(iArr33);
                AbstractC8787e.startapp(iArr31, iArr33);
                AbstractC8787e.mopub(iArr33, iArr32, iArr33);
                AbstractC8787e.mopub(iArr33, iArr32, iArr33);
                C15557e c15557e4 = new C15557e(iArr32);
                AbstractC8787e.mopub(iArr32, iArr33, iArr32);
                AbstractC8787e.purchase(iArr32, iArr31, iArr32);
                AbstractC8787e.mopub(iArr32, iArr30, iArr32);
                C15557e c15557e5 = new C15557e(iArr31);
                if (AbstractC12797e.subs(5, 0, iArr29, iArr31) != 0 || (iArr31[4] == -1 && AbstractC15077e.Signature(iArr31, iArr36))) {
                    AbstractC12797e.billing(5, -2147483647, iArr31);
                }
                if (!admob3) {
                    AbstractC8787e.purchase(iArr31, iArr34, iArr31);
                }
                return new C17373e(abstractC0362e5, c15557e3, c15557e4, new AbstractC7861e[]{c15557e5}, 5);
            case 6:
                if (advert()) {
                    return this;
                }
                int[] iArr37 = ((C4312e) abstractC7861e3).f9426e;
                boolean subscription4 = AbstractC15077e.subscription(iArr37);
                AbstractC0362e abstractC0362e6 = this.ad;
                if (subscription4) {
                    return abstractC0362e6.smaato();
                }
                C4312e c4312e6 = (C4312e) abstractC7861e2;
                C4312e c4312e7 = (C4312e) abstractC7861eArr[0];
                int[] iArr38 = new int[5];
                int[] iArr39 = new int[5];
                int[] iArr40 = new int[5];
                AbstractC8457e.billing(iArr37, iArr40);
                int[] iArr41 = new int[5];
                AbstractC8457e.billing(iArr40, iArr41);
                int[] iArr42 = c4312e7.f9426e;
                boolean admob4 = AbstractC15077e.admob(iArr42);
                if (admob4) {
                    iArr4 = iArr42;
                } else {
                    AbstractC8457e.billing(iArr42, iArr39);
                    iArr4 = iArr39;
                }
                int[] iArr43 = c4312e6.f9426e;
                AbstractC8457e.startapp(iArr43, iArr4, iArr38);
                if (AbstractC15077e.startapp(iArr43, iArr4, iArr39) != 0 || (iArr39[4] == -1 && AbstractC15077e.Signature(iArr39, AbstractC8457e.vip))) {
                    AbstractC12797e.vip(5, 21389, iArr39);
                }
                AbstractC8457e.metrica(iArr39, iArr38, iArr39);
                AbstractC8457e.purchase(iArr39, AbstractC15077e.adcel(iArr39, iArr39, iArr39));
                AbstractC8457e.metrica(iArr40, iArr43, iArr40);
                AbstractC8457e.purchase(iArr40, AbstractC12797e.firebase(iArr40, 5));
                AbstractC8457e.purchase(iArr38, AbstractC12797e.crashlytics(5, iArr41, iArr38));
                C4312e c4312e8 = new C4312e(iArr41);
                AbstractC8457e.billing(iArr39, iArr41);
                AbstractC8457e.startapp(iArr41, iArr40, iArr41);
                AbstractC8457e.startapp(iArr41, iArr40, iArr41);
                C4312e c4312e9 = new C4312e(iArr40);
                AbstractC8457e.startapp(iArr40, iArr41, iArr40);
                AbstractC8457e.metrica(iArr40, iArr39, iArr40);
                AbstractC8457e.startapp(iArr40, iArr38, iArr40);
                C4312e c4312e10 = new C4312e(iArr39);
                AbstractC8457e.adcel(iArr37, iArr39);
                if (!admob4) {
                    AbstractC8457e.metrica(iArr39, iArr42, iArr39);
                }
                return new C17373e(abstractC0362e6, c4312e8, c4312e9, new AbstractC7861e[]{c4312e10}, 6);
            case 7:
                if (advert()) {
                    return this;
                }
                int[] iArr44 = ((C17520e) abstractC7861e3).f34356e;
                boolean remoteconfig8 = AbstractC16091e.remoteconfig(iArr44);
                AbstractC0362e abstractC0362e7 = this.ad;
                if (remoteconfig8) {
                    return abstractC0362e7.smaato();
                }
                C17520e c17520e = (C17520e) abstractC7861e2;
                C17520e c17520e2 = (C17520e) abstractC7861eArr[0];
                int[] iArr45 = new int[6];
                AbstractC6190e.startapp(iArr44, iArr45);
                int[] iArr46 = new int[6];
                AbstractC6190e.startapp(iArr45, iArr46);
                int[] iArr47 = new int[6];
                AbstractC6190e.startapp(c17520e.f34356e, iArr47);
                AbstractC6190e.yandex(iArr47, AbstractC16091e.vip(iArr47, iArr47, iArr47));
                AbstractC6190e.purchase(iArr45, c17520e.f34356e, iArr45);
                AbstractC6190e.yandex(iArr45, AbstractC12797e.firebase(iArr45, 6));
                int[] iArr48 = new int[6];
                AbstractC6190e.yandex(iArr48, AbstractC12797e.crashlytics(6, iArr46, iArr48));
                C17520e c17520e3 = new C17520e(iArr46);
                AbstractC6190e.startapp(iArr47, iArr46);
                AbstractC6190e.mopub(iArr46, iArr45, iArr46);
                AbstractC6190e.mopub(iArr46, iArr45, iArr46);
                C17520e c17520e4 = new C17520e(iArr45);
                AbstractC6190e.mopub(iArr45, iArr46, iArr45);
                AbstractC6190e.purchase(iArr45, iArr47, iArr45);
                AbstractC6190e.mopub(iArr45, iArr48, iArr45);
                C17520e c17520e5 = new C17520e(iArr47);
                if (AbstractC12797e.subs(6, 0, iArr44, iArr47) != 0 || (iArr47[5] == -1 && AbstractC16091e.Signature(iArr47, AbstractC6190e.ad))) {
                    AbstractC12797e.vip(6, 4553, iArr47);
                }
                if (!AbstractC16091e.admob(c17520e2.f34356e)) {
                    AbstractC6190e.purchase(iArr47, c17520e2.f34356e, iArr47);
                }
                return new C17373e(abstractC0362e7, c17520e3, c17520e4, new AbstractC7861e[]{c17520e5}, 7);
            case 8:
                if (advert()) {
                    return this;
                }
                int[] iArr49 = ((C8674e) abstractC7861e3).f17519e;
                boolean remoteconfig9 = AbstractC16091e.remoteconfig(iArr49);
                AbstractC0362e abstractC0362e8 = this.ad;
                if (remoteconfig9) {
                    return abstractC0362e8.smaato();
                }
                C8674e c8674e = (C8674e) abstractC7861e2;
                C8674e c8674e2 = (C8674e) abstractC7861eArr[0];
                int[] iArr50 = new int[6];
                int[] iArr51 = new int[6];
                int[] iArr52 = new int[6];
                AbstractC1216e.smaato(iArr49, iArr52);
                int[] iArr53 = new int[6];
                AbstractC1216e.smaato(iArr52, iArr53);
                int[] iArr54 = c8674e2.f17519e;
                boolean admob5 = AbstractC16091e.admob(iArr54);
                if (admob5) {
                    iArr5 = iArr54;
                } else {
                    AbstractC1216e.smaato(iArr54, iArr51);
                    iArr5 = iArr51;
                }
                int[] iArr55 = c8674e.f17519e;
                AbstractC1216e.loadAd(iArr55, iArr5, iArr50);
                int ad13 = AbstractC16091e.ad(iArr55, iArr5, iArr51);
                int[] iArr56 = AbstractC1216e.ad;
                if (ad13 != 0 || (iArr51[5] == -1 && AbstractC16091e.Signature(iArr51, iArr56))) {
                    AbstractC1216e.vip(iArr51);
                }
                AbstractC1216e.startapp(iArr51, iArr50, iArr51);
                AbstractC1216e.advert(iArr51, AbstractC16091e.vip(iArr51, iArr51, iArr51));
                AbstractC1216e.startapp(iArr52, iArr55, iArr52);
                AbstractC1216e.advert(iArr52, AbstractC12797e.firebase(iArr52, 6));
                AbstractC1216e.advert(iArr50, AbstractC12797e.crashlytics(6, iArr53, iArr50));
                C8674e c8674e3 = new C8674e(iArr53);
                AbstractC1216e.smaato(iArr51, iArr53);
                AbstractC1216e.loadAd(iArr53, iArr52, iArr53);
                AbstractC1216e.loadAd(iArr53, iArr52, iArr53);
                C8674e c8674e4 = new C8674e(iArr52);
                AbstractC1216e.loadAd(iArr52, iArr53, iArr52);
                AbstractC1216e.startapp(iArr52, iArr51, iArr52);
                AbstractC1216e.loadAd(iArr52, iArr50, iArr52);
                C8674e c8674e5 = new C8674e(iArr51);
                if (AbstractC12797e.subs(6, 0, iArr49, iArr51) != 0 || (iArr51[5] == -1 && AbstractC16091e.Signature(iArr51, iArr56))) {
                    AbstractC1216e.vip(iArr51);
                }
                if (!admob5) {
                    AbstractC1216e.startapp(iArr51, iArr54, iArr51);
                }
                return new C17373e(abstractC0362e8, c8674e3, c8674e4, new AbstractC7861e[]{c8674e5}, 8);
            case 9:
                if (advert()) {
                    return this;
                }
                int[] iArr57 = ((C11372e) abstractC7861e3).f22884e;
                boolean Signature = AbstractC12947e.Signature(iArr57);
                AbstractC0362e abstractC0362e9 = this.ad;
                if (Signature) {
                    return abstractC0362e9.smaato();
                }
                C11372e c11372e = (C11372e) abstractC7861e2;
                C11372e c11372e2 = (C11372e) abstractC7861eArr[0];
                int[] iArr58 = new int[7];
                AbstractC15367e.startapp(iArr57, iArr58);
                int[] iArr59 = new int[7];
                AbstractC15367e.startapp(iArr58, iArr59);
                int[] iArr60 = new int[7];
                AbstractC15367e.startapp(c11372e.f22884e, iArr60);
                AbstractC15367e.billing(iArr60, AbstractC12947e.metrica(iArr60, iArr60, iArr60));
                AbstractC15367e.appmetrica(iArr58, c11372e.f22884e, iArr58);
                AbstractC15367e.billing(iArr58, AbstractC12797e.firebase(iArr58, 7));
                int[] iArr61 = new int[7];
                AbstractC15367e.billing(iArr61, AbstractC12797e.crashlytics(7, iArr59, iArr61));
                C11372e c11372e3 = new C11372e(iArr59);
                AbstractC15367e.startapp(iArr60, iArr59);
                AbstractC15367e.mopub(iArr59, iArr58, iArr59);
                AbstractC15367e.mopub(iArr59, iArr58, iArr59);
                C11372e c11372e4 = new C11372e(iArr58);
                AbstractC15367e.mopub(iArr58, iArr59, iArr58);
                AbstractC15367e.appmetrica(iArr58, iArr60, iArr58);
                AbstractC15367e.mopub(iArr58, iArr61, iArr58);
                C11372e c11372e5 = new C11372e(iArr60);
                if (AbstractC12797e.subs(7, 0, iArr57, iArr60) != 0 || (iArr60[6] == -1 && AbstractC12947e.amazon(iArr60, AbstractC15367e.ad))) {
                    AbstractC12797e.vip(7, 6803, iArr60);
                }
                if (!AbstractC12947e.loadAd(c11372e2.f22884e)) {
                    AbstractC15367e.appmetrica(iArr60, c11372e2.f22884e, iArr60);
                }
                return new C17373e(abstractC0362e9, c11372e3, c11372e4, new AbstractC7861e[]{c11372e5}, 9);
            case 10:
                if (advert()) {
                    return this;
                }
                int[] iArr62 = ((C10207e) abstractC7861e3).f20180e;
                boolean Signature2 = AbstractC12947e.Signature(iArr62);
                AbstractC0362e abstractC0362e10 = this.ad;
                if (Signature2) {
                    return abstractC0362e10.smaato();
                }
                C10207e c10207e = (C10207e) abstractC7861e2;
                C10207e c10207e2 = (C10207e) abstractC7861eArr[0];
                int[] iArr63 = new int[7];
                int[] iArr64 = new int[7];
                int[] iArr65 = new int[7];
                AbstractC17808e.smaato(iArr62, iArr65);
                int[] iArr66 = new int[7];
                AbstractC17808e.smaato(iArr65, iArr66);
                int[] iArr67 = c10207e2.f20180e;
                boolean loadAd = AbstractC12947e.loadAd(iArr67);
                if (loadAd) {
                    iArr6 = iArr67;
                } else {
                    AbstractC17808e.smaato(iArr67, iArr64);
                    iArr6 = iArr64;
                }
                int[] iArr68 = c10207e.f20180e;
                AbstractC17808e.amazon(iArr68, iArr6, iArr63);
                AbstractC17808e.ad(iArr68, iArr6, iArr64);
                AbstractC17808e.appmetrica(iArr64, iArr63, iArr64);
                AbstractC17808e.startapp(iArr64, AbstractC12947e.metrica(iArr64, iArr64, iArr64));
                AbstractC17808e.appmetrica(iArr65, iArr68, iArr65);
                AbstractC17808e.startapp(iArr65, AbstractC12797e.firebase(iArr65, 7));
                AbstractC17808e.startapp(iArr63, AbstractC12797e.crashlytics(7, iArr66, iArr63));
                C10207e c10207e3 = new C10207e(iArr66);
                AbstractC17808e.smaato(iArr64, iArr66);
                AbstractC17808e.amazon(iArr66, iArr65, iArr66);
                AbstractC17808e.amazon(iArr66, iArr65, iArr66);
                C10207e c10207e4 = new C10207e(iArr65);
                AbstractC17808e.amazon(iArr65, iArr66, iArr65);
                AbstractC17808e.appmetrica(iArr65, iArr64, iArr65);
                AbstractC17808e.amazon(iArr65, iArr63, iArr65);
                C10207e c10207e5 = new C10207e(iArr64);
                AbstractC17808e.loadAd(iArr62, iArr64);
                if (!loadAd) {
                    AbstractC17808e.appmetrica(iArr64, iArr67, iArr64);
                }
                return new C17373e(abstractC0362e10, c10207e3, c10207e4, new AbstractC7861e[]{c10207e5}, 10);
            case 11:
                if (advert()) {
                    return this;
                }
                int[] iArr69 = ((C13183e) abstractC7861e3).f26185e;
                boolean isVip2 = AbstractC10077e.isVip(iArr69);
                AbstractC0362e abstractC0362e11 = this.ad;
                if (isVip2) {
                    return abstractC0362e11.smaato();
                }
                C13183e c13183e = (C13183e) abstractC7861e2;
                C13183e c13183e2 = (C13183e) abstractC7861eArr[0];
                int[] iArr70 = new int[16];
                int[] iArr71 = new int[8];
                AbstractC10077e.premium(iArr69, iArr70);
                AbstractC11866e.yandex(iArr70, iArr71);
                int[] iArr72 = new int[8];
                AbstractC10077e.premium(iArr71, iArr70);
                AbstractC11866e.yandex(iArr70, iArr72);
                int[] iArr73 = new int[8];
                AbstractC10077e.premium(c13183e.f26185e, iArr70);
                AbstractC11866e.yandex(iArr70, iArr73);
                AbstractC11866e.startapp(iArr73, AbstractC10077e.vip(iArr73, iArr73, iArr73));
                AbstractC11866e.appmetrica(iArr71, c13183e.f26185e, iArr71, iArr70);
                AbstractC11866e.startapp(iArr71, AbstractC12797e.firebase(iArr71, 8));
                int[] iArr74 = new int[8];
                AbstractC11866e.startapp(iArr74, AbstractC12797e.crashlytics(8, iArr72, iArr74));
                C13183e c13183e3 = new C13183e(iArr72);
                AbstractC10077e.premium(iArr73, iArr70);
                AbstractC11866e.yandex(iArr70, iArr72);
                AbstractC11866e.advert(iArr72, iArr71, iArr72);
                AbstractC11866e.advert(iArr72, iArr71, iArr72);
                C13183e c13183e4 = new C13183e(iArr71);
                AbstractC11866e.advert(iArr71, iArr72, iArr71);
                AbstractC10077e.isPro(iArr71, iArr73, iArr70);
                AbstractC11866e.yandex(iArr70, iArr71);
                AbstractC11866e.advert(iArr71, iArr74, iArr71);
                C13183e c13183e5 = new C13183e(iArr73);
                if (AbstractC12797e.subs(8, 0, iArr69, iArr73) != 0 || (iArr73[7] == -1 && AbstractC10077e.pro(iArr73, AbstractC11866e.ad))) {
                    AbstractC12797e.vip(8, 977, iArr73);
                }
                if (!AbstractC10077e.signatures(c13183e2.f26185e)) {
                    AbstractC11866e.appmetrica(iArr73, c13183e2.f26185e, iArr73, iArr70);
                }
                return new C17373e(abstractC0362e11, c13183e3, c13183e4, new AbstractC7861e[]{c13183e5}, 11);
            case 12:
                if (advert()) {
                    return this;
                }
                int[] iArr75 = ((C2926e) abstractC7861e3).f6916e;
                boolean isVip3 = AbstractC10077e.isVip(iArr75);
                AbstractC0362e abstractC0362e12 = this.ad;
                if (isVip3) {
                    return abstractC0362e12.smaato();
                }
                C2926e c2926e = (C2926e) abstractC7861e2;
                C2926e c2926e2 = (C2926e) abstractC7861eArr[0];
                int[] iArr76 = new int[16];
                int[] iArr77 = new int[8];
                int[] iArr78 = new int[8];
                int[] iArr79 = new int[8];
                AbstractC10077e.premium(iArr75, iArr76);
                AbstractC1206e.billing(iArr76, iArr79);
                int[] iArr80 = new int[8];
                AbstractC10077e.premium(iArr79, iArr76);
                AbstractC1206e.billing(iArr76, iArr80);
                int[] iArr81 = c2926e2.f6916e;
                boolean signatures2 = AbstractC10077e.signatures(iArr81);
                if (signatures2) {
                    iArr7 = iArr81;
                } else {
                    AbstractC10077e.premium(iArr81, iArr76);
                    AbstractC1206e.billing(iArr76, iArr78);
                    iArr7 = iArr78;
                }
                int[] iArr82 = c2926e.f6916e;
                AbstractC1206e.adcel(iArr82, iArr7, iArr77);
                int ad14 = AbstractC10077e.ad(iArr82, iArr7, iArr78);
                int[] iArr83 = AbstractC1206e.ad;
                if (ad14 != 0 || (iArr78[7] == -1 && AbstractC10077e.pro(iArr78, iArr83))) {
                    AbstractC1206e.ad(iArr78);
                }
                AbstractC10077e.isPro(iArr78, iArr77, iArr76);
                AbstractC1206e.billing(iArr76, iArr78);
                AbstractC1206e.yandex(iArr78, AbstractC10077e.vip(iArr78, iArr78, iArr78));
                AbstractC10077e.isPro(iArr79, iArr82, iArr76);
                AbstractC1206e.billing(iArr76, iArr79);
                AbstractC1206e.yandex(iArr79, AbstractC12797e.firebase(iArr79, 8));
                AbstractC1206e.yandex(iArr77, AbstractC12797e.crashlytics(8, iArr80, iArr77));
                C2926e c2926e3 = new C2926e(iArr80);
                AbstractC10077e.premium(iArr78, iArr76);
                AbstractC1206e.billing(iArr76, iArr80);
                AbstractC1206e.adcel(iArr80, iArr79, iArr80);
                AbstractC1206e.adcel(iArr80, iArr79, iArr80);
                C2926e c2926e4 = new C2926e(iArr79);
                AbstractC1206e.adcel(iArr79, iArr80, iArr79);
                AbstractC10077e.isPro(iArr79, iArr78, iArr76);
                AbstractC1206e.billing(iArr76, iArr79);
                AbstractC1206e.adcel(iArr79, iArr77, iArr79);
                C2926e c2926e5 = new C2926e(iArr78);
                if (AbstractC12797e.subs(8, 0, iArr75, iArr78) != 0 || (iArr78[7] == -1 && AbstractC10077e.pro(iArr78, iArr83))) {
                    AbstractC1206e.ad(iArr78);
                }
                if (!signatures2) {
                    AbstractC1206e.purchase(iArr78, iArr81, iArr78, iArr76);
                }
                return new C17373e(abstractC0362e12, c2926e3, c2926e4, new AbstractC7861e[]{c2926e5}, 12);
            case 13:
                if (advert()) {
                    return this;
                }
                C2021e c2021e = (C2021e) abstractC7861e3;
                boolean subscription5 = c2021e.subscription();
                int[] iArr84 = c2021e.f5299e;
                AbstractC0362e abstractC0362e13 = this.ad;
                if (subscription5) {
                    return abstractC0362e13.smaato();
                }
                C2021e c2021e2 = (C2021e) abstractC7861e2;
                C2021e c2021e3 = (C2021e) abstractC7861eArr[0];
                int[] iArr85 = new int[24];
                int[] iArr86 = new int[12];
                int[] iArr87 = new int[12];
                int[] iArr88 = new int[12];
                C4094e.mopub(iArr84, iArr85);
                AbstractC1396e.purchase(iArr85, iArr88);
                int[] iArr89 = new int[12];
                C4094e.mopub(iArr88, iArr85);
                AbstractC1396e.purchase(iArr85, iArr89);
                boolean admob6 = c2021e3.admob();
                int[] iArr90 = c2021e3.f5299e;
                if (admob6) {
                    iArr8 = iArr90;
                } else {
                    C4094e.mopub(iArr90, iArr85);
                    AbstractC1396e.purchase(iArr85, iArr87);
                    iArr8 = iArr87;
                }
                int[] iArr91 = c2021e2.f5299e;
                AbstractC1396e.startapp(iArr91, iArr8, iArr86);
                int ad15 = AbstractC12797e.ad(12, iArr91, iArr8, iArr87);
                int[] iArr92 = AbstractC1396e.ad;
                if (ad15 != 0 || (iArr87[11] == -1 && AbstractC12797e.subscription(12, iArr87, iArr92))) {
                    AbstractC1396e.ad(iArr87);
                }
                C4094e.startapp(iArr87, iArr86, iArr85);
                AbstractC1396e.purchase(iArr85, iArr87);
                AbstractC1396e.billing(iArr87, AbstractC12797e.metrica(12, iArr87, iArr87, iArr87));
                AbstractC1396e.license(iArr88, iArr91, iArr88, iArr85);
                AbstractC1396e.billing(iArr88, AbstractC12797e.firebase(iArr88, 12));
                AbstractC1396e.billing(iArr86, AbstractC12797e.crashlytics(12, iArr89, iArr86));
                C2021e c2021e4 = new C2021e(iArr89);
                C4094e.mopub(iArr87, iArr85);
                AbstractC1396e.purchase(iArr85, iArr89);
                AbstractC1396e.startapp(iArr89, iArr88, iArr89);
                AbstractC1396e.startapp(iArr89, iArr88, iArr89);
                C2021e c2021e5 = new C2021e(iArr88);
                AbstractC1396e.startapp(iArr88, iArr89, iArr88);
                C4094e.startapp(iArr88, iArr87, iArr85);
                AbstractC1396e.purchase(iArr85, iArr88);
                AbstractC1396e.startapp(iArr88, iArr86, iArr88);
                C2021e c2021e6 = new C2021e(iArr87);
                if (AbstractC12797e.subs(12, 0, iArr84, iArr87) != 0 || (iArr87[11] == -1 && AbstractC12797e.subscription(12, iArr87, iArr92))) {
                    AbstractC1396e.ad(iArr87);
                }
                if (!admob6) {
                    AbstractC1396e.license(iArr87, iArr90, iArr87, iArr85);
                }
                return new C17373e(abstractC0362e13, c2021e4, c2021e5, new AbstractC7861e[]{c2021e6}, 13);
            default:
                if (advert()) {
                    return this;
                }
                C15881e c15881e = (C15881e) abstractC7861e3;
                boolean subscription6 = c15881e.subscription();
                int[] iArr93 = c15881e.f31319e;
                AbstractC0362e abstractC0362e14 = this.ad;
                if (subscription6) {
                    return abstractC0362e14.smaato();
                }
                C15881e c15881e2 = (C15881e) abstractC7861e2;
                C15881e c15881e3 = (C15881e) abstractC7861eArr[0];
                int[] iArr94 = new int[33];
                int[] iArr95 = new int[17];
                int[] iArr96 = new int[17];
                int[] iArr97 = new int[17];
                AbstractC0223e.appmetrica(iArr93, iArr94);
                AbstractC0223e.adcel(iArr94, iArr97);
                int[] iArr98 = new int[17];
                AbstractC0223e.appmetrica(iArr97, iArr94);
                AbstractC0223e.adcel(iArr94, iArr98);
                boolean admob7 = c15881e3.admob();
                int[] iArr99 = c15881e3.f31319e;
                if (admob7) {
                    iArr9 = iArr99;
                } else {
                    AbstractC0223e.appmetrica(iArr99, iArr94);
                    AbstractC0223e.adcel(iArr94, iArr96);
                    iArr9 = iArr96;
                }
                int[] iArr100 = c15881e2.f31319e;
                AbstractC0223e.advert(iArr100, iArr9, iArr95);
                AbstractC0223e.ad(iArr100, iArr9, iArr96);
                AbstractC0223e.license(iArr96, iArr95, iArr94);
                AbstractC0223e.adcel(iArr94, iArr96);
                AbstractC12797e.metrica(17, iArr96, iArr96, iArr96);
                AbstractC0223e.mopub(iArr96);
                AbstractC0223e.license(iArr97, iArr100, iArr94);
                AbstractC0223e.adcel(iArr94, iArr97);
                AbstractC12797e.firebase(iArr97, 17);
                AbstractC0223e.mopub(iArr97);
                AbstractC12797e.crashlytics(17, iArr98, iArr95);
                AbstractC0223e.mopub(iArr95);
                C15881e c15881e4 = new C15881e(iArr98);
                AbstractC0223e.appmetrica(iArr96, iArr94);
                AbstractC0223e.adcel(iArr94, iArr98);
                AbstractC0223e.advert(iArr98, iArr97, iArr98);
                AbstractC0223e.advert(iArr98, iArr97, iArr98);
                C15881e c15881e5 = new C15881e(iArr97);
                AbstractC0223e.advert(iArr97, iArr98, iArr97);
                AbstractC0223e.license(iArr97, iArr96, iArr94);
                AbstractC0223e.adcel(iArr94, iArr97);
                AbstractC0223e.advert(iArr97, iArr95, iArr97);
                C15881e c15881e6 = new C15881e(iArr96);
                int i3 = iArr93[16];
                iArr96[16] = (AbstractC12797e.subs(16, i3 << 23, iArr93, iArr96) | (i3 << 1)) & 511;
                if (!admob7) {
                    AbstractC0223e.yandex(iArr96, iArr99, iArr96, iArr94);
                }
                return new C17373e(abstractC0362e14, c15881e4, c15881e5, new AbstractC7861e[]{c15881e6}, 14);
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e isVip() {
        switch (this.billing) {
            case 0:
                return (advert() || this.metrica.subscription()) ? this : m4311this(false).ad(this);
            case 1:
                if (!advert()) {
                    AbstractC7861e abstractC7861e = this.metrica;
                    if (!abstractC7861e.subscription()) {
                        AbstractC0362e abstractC0362e = this.ad;
                        int i = abstractC0362e.purchase;
                        if (i != 0) {
                            return i != 4 ? isPro().ad(this) : m4310native(false).ad(this);
                        }
                        AbstractC7861e ad = abstractC7861e.ad(abstractC7861e);
                        AbstractC7861e applovin = ad.applovin();
                        AbstractC7861e abstractC7861e2 = this.vip;
                        AbstractC7861e applovin2 = abstractC7861e2.applovin();
                        AbstractC7861e ad2 = applovin2.ad(applovin2).ad(applovin2).ad(abstractC0362e.vip);
                        AbstractC7861e subs = abstractC7861e2.ad(abstractC7861e2).ad(abstractC7861e2).remoteconfig(applovin).subs(ad2.applovin());
                        if (subs.subscription()) {
                            return abstractC0362e.smaato();
                        }
                        AbstractC7861e Signature = subs.remoteconfig(ad).Signature();
                        AbstractC7861e remoteconfig = subs.remoteconfig(Signature).remoteconfig(ad2);
                        AbstractC7861e subs2 = applovin.applovin().remoteconfig(Signature).subs(remoteconfig);
                        AbstractC7861e ad3 = subs2.subs(remoteconfig).remoteconfig(remoteconfig.ad(subs2)).ad(abstractC7861e2);
                        return new C17373e(abstractC0362e, ad3, abstractC7861e2.subs(ad3).remoteconfig(subs2).subs(abstractC7861e), 1);
                    }
                }
                return this;
            case 2:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 3:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 4:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 5:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 6:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 7:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 8:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 9:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 10:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 11:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 12:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            case 13:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
            default:
                return (advert() || this.metrica.subscription()) ? this : isPro().ad(this);
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e loadAd() {
        switch (this.billing) {
            case 0:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 0);
            case 1:
                if (advert()) {
                    return this;
                }
                AbstractC0362e abstractC0362e = this.ad;
                int i = abstractC0362e.purchase;
                AbstractC7861e abstractC7861e = this.metrica;
                AbstractC7861e abstractC7861e2 = this.vip;
                return i != 0 ? new C17373e(abstractC0362e, abstractC7861e2, abstractC7861e.tapsense(), this.license, 1) : new C17373e(abstractC0362e, abstractC7861e2, abstractC7861e.tapsense(), 1);
            case 2:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 2);
            case 3:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 3);
            case 4:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 4);
            case 5:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 5);
            case 6:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 6);
            case 7:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 7);
            case 8:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 8);
            case 9:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 9);
            case 10:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 10);
            case 11:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 11);
            case 12:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 12);
            case 13:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 13);
            default:
                if (advert()) {
                    return this;
                }
                return new C17373e(this.ad, this.vip, this.metrica.tapsense(), this.license, 14);
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e metrica() {
        switch (this.billing) {
            case 0:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 0);
            case 1:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 1);
            case 2:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 2);
            case 3:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 3);
            case 4:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 4);
            case 5:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 5);
            case 6:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 6);
            case 7:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 7);
            case 8:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 8);
            case 9:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 9);
            case 10:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 10);
            case 11:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 11);
            case 12:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 12);
            case 13:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 13);
            default:
                vip();
                return new C17373e(null, this.vip, appmetrica(), 14);
        }
    }

    /* renamed from: native, reason: not valid java name */
    public C17373e m4310native(boolean z) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e abstractC7861e2 = this.license[0];
        AbstractC7861e m4308goto = m4308goto();
        AbstractC7861e abstractC7861e3 = this.vip;
        AbstractC7861e applovin = abstractC7861e3.applovin();
        AbstractC7861e ad = applovin.ad(applovin).ad(applovin).ad(m4308goto);
        AbstractC7861e abstractC7861e4 = this.metrica;
        AbstractC7861e ad2 = abstractC7861e4.ad(abstractC7861e4);
        AbstractC7861e remoteconfig = ad2.remoteconfig(abstractC7861e4);
        AbstractC7861e remoteconfig2 = abstractC7861e3.remoteconfig(remoteconfig);
        AbstractC7861e ad3 = remoteconfig2.ad(remoteconfig2);
        AbstractC7861e subs = ad.applovin().subs(ad3.ad(ad3));
        AbstractC7861e applovin2 = remoteconfig.applovin();
        AbstractC7861e ad4 = applovin2.ad(applovin2);
        AbstractC7861e subs2 = ad.remoteconfig(ad3.subs(subs)).subs(ad4);
        if (z) {
            AbstractC7861e remoteconfig3 = ad4.remoteconfig(m4308goto);
            abstractC7861e = remoteconfig3.ad(remoteconfig3);
        } else {
            abstractC7861e = null;
        }
        if (!abstractC7861e2.admob()) {
            ad2 = ad2.remoteconfig(abstractC7861e2);
        }
        return new C17373e(this.ad, subs, subs2, new AbstractC7861e[]{ad2, abstractC7861e}, 1);
    }

    @Override // defpackage.AbstractC9932e
    public final boolean purchase() {
        return appmetrica().crashlytics();
    }

    @Override // defpackage.AbstractC9932e
    public final boolean subscription() {
        AbstractC0362e abstractC0362e = this.ad;
        AbstractC7861e abstractC7861e = abstractC0362e.vip;
        AbstractC7861e abstractC7861e2 = abstractC0362e.metrica;
        AbstractC7861e applovin = this.metrica.applovin();
        int billing = billing();
        if (billing != 0) {
            AbstractC7861e[] abstractC7861eArr = this.license;
            if (billing == 1) {
                AbstractC7861e abstractC7861e3 = abstractC7861eArr[0];
                if (!abstractC7861e3.admob()) {
                    AbstractC7861e applovin2 = abstractC7861e3.applovin();
                    AbstractC7861e remoteconfig = abstractC7861e3.remoteconfig(applovin2);
                    applovin = applovin.remoteconfig(abstractC7861e3);
                    abstractC7861e = abstractC7861e.remoteconfig(applovin2);
                    abstractC7861e2 = abstractC7861e2.remoteconfig(remoteconfig);
                }
            } else {
                if (billing != 2 && billing != 3 && billing != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                AbstractC7861e abstractC7861e4 = abstractC7861eArr[0];
                if (!abstractC7861e4.admob()) {
                    AbstractC7861e applovin3 = abstractC7861e4.applovin();
                    AbstractC7861e applovin4 = applovin3.applovin();
                    AbstractC7861e remoteconfig2 = applovin3.remoteconfig(applovin4);
                    abstractC7861e = abstractC7861e.remoteconfig(applovin4);
                    abstractC7861e2 = abstractC7861e2.remoteconfig(remoteconfig2);
                }
            }
        }
        AbstractC7861e abstractC7861e5 = this.vip;
        return applovin.equals(abstractC7861e5.applovin().ad(abstractC7861e).remoteconfig(abstractC7861e5).ad(abstractC7861e2));
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e tapsense(AbstractC9932e abstractC9932e) {
        return abstractC9932e.advert() ? this : ad(abstractC9932e.loadAd());
    }

    /* renamed from: this, reason: not valid java name */
    public C17373e m4311this(boolean z) {
        C18150e c18150e;
        C18150e c18150e2 = (C18150e) this.vip;
        C18150e c18150e3 = (C18150e) this.metrica;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e = abstractC7861eArr[0];
        C18150e c18150e4 = (C18150e) abstractC7861e;
        C18150e c18150e5 = (C18150e) abstractC7861eArr[1];
        if (c18150e5 == null) {
            c18150e5 = m4307class((C18150e) abstractC7861e, null);
            abstractC7861eArr[1] = c18150e5;
        }
        AbstractC15710e.advert(c18150e2.f35562e, r5);
        int vip = AbstractC10077e.vip(r5, r5, r5);
        int[] iArr = c18150e5.f35562e;
        long j = (iArr[0] & 4294967295L) + (r5[0] & 4294967295L);
        long j2 = (iArr[1] & 4294967295L) + (r5[1] & 4294967295L) + (j >>> 32);
        long j3 = (iArr[2] & 4294967295L) + (r5[2] & 4294967295L) + (j2 >>> 32);
        long j4 = (iArr[3] & 4294967295L) + (r5[3] & 4294967295L) + (j3 >>> 32);
        long j5 = (iArr[4] & 4294967295L) + (r5[4] & 4294967295L) + (j4 >>> 32);
        long j6 = (iArr[5] & 4294967295L) + (r5[5] & 4294967295L) + (j5 >>> 32);
        long j7 = (iArr[6] & 4294967295L) + (r5[6] & 4294967295L) + (j6 >>> 32);
        long j8 = (iArr[7] & 4294967295L) + (r5[7] & 4294967295L) + (j7 >>> 32);
        int[] iArr2 = {(int) j, (int) j2, (int) j3, (int) j4, (int) j5, (int) j6, (int) j7, (int) j8};
        AbstractC15710e.mopub(iArr2, vip + ((int) (j8 >>> 32)));
        int[] iArr3 = new int[8];
        AbstractC15710e.Signature(c18150e3.f35562e, iArr3);
        int[] iArr4 = new int[8];
        AbstractC15710e.yandex(iArr3, c18150e3.f35562e, iArr4);
        int[] iArr5 = new int[8];
        AbstractC15710e.yandex(iArr4, c18150e2.f35562e, iArr5);
        AbstractC15710e.Signature(iArr5, iArr5);
        int[] iArr6 = new int[8];
        AbstractC15710e.advert(iArr4, iArr6);
        AbstractC15710e.Signature(iArr6, iArr6);
        C18150e c18150e6 = new C18150e(iArr4);
        AbstractC15710e.advert(iArr2, iArr4);
        AbstractC15710e.loadAd(iArr4, iArr5, iArr4);
        AbstractC15710e.loadAd(iArr4, iArr5, iArr4);
        C18150e c18150e7 = new C18150e(iArr5);
        AbstractC15710e.loadAd(iArr5, iArr4, iArr5);
        AbstractC15710e.yandex(iArr5, iArr2, iArr5);
        AbstractC15710e.loadAd(iArr5, iArr6, iArr5);
        C18150e c18150e8 = new C18150e(iArr3);
        if (!AbstractC10077e.signatures(c18150e4.f35562e)) {
            AbstractC15710e.yandex(iArr3, c18150e4.f35562e, iArr3);
        }
        if (z) {
            c18150e = new C18150e(iArr6);
            AbstractC15710e.yandex(iArr6, c18150e5.f35562e, iArr6);
            AbstractC15710e.Signature(iArr6, iArr6);
        } else {
            c18150e = null;
        }
        return new C17373e(this.ad, c18150e6, c18150e7, new AbstractC7861e[]{c18150e8, c18150e}, 0);
    }
}
