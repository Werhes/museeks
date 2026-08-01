package defpackage;

import java.math.BigInteger;

/* renamed from: eُۤٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11372e extends AbstractC15853e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f22884e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f22883e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f22882e = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public C11372e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f22883e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] advert = AbstractC12947e.advert(bigInteger);
        if (advert[6] == -1 && AbstractC12947e.amazon(advert, AbstractC15367e.ad)) {
            AbstractC12797e.vip(7, 6803, advert);
        }
        this.f22884e = advert;
    }

    public C11372e(int[] iArr) {
        super(3);
        this.f22884e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[7];
        AbstractC6143e.metrica(AbstractC15367e.ad, this.f22884e, iArr);
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        if (AbstractC12947e.vip(this.f22884e, ((C11372e) abstractC7861e).f22884e, iArr) != 0 || (iArr[6] == -1 && AbstractC12947e.amazon(iArr, AbstractC15367e.ad))) {
            AbstractC12797e.vip(7, 6803, iArr);
        }
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC12947e.loadAd(this.f22884e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[7];
        AbstractC15367e.startapp(this.f22884e, iArr);
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC12947e.smaato(this.f22884e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11372e) {
            return AbstractC12947e.mopub(this.f22884e, ((C11372e) obj).f22884e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC12947e.applovin(this.f22884e);
    }

    public final int hashCode() {
        return f22883e.hashCode() ^ AbstractC12442e.inmobi(this.f22884e, 7);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f22884e;
        if (AbstractC12947e.Signature(iArr) || AbstractC12947e.loadAd(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        AbstractC15367e.startapp(iArr, iArr2);
        AbstractC15367e.appmetrica(iArr2, iArr, iArr2);
        AbstractC15367e.startapp(iArr2, iArr2);
        AbstractC15367e.appmetrica(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        AbstractC15367e.startapp(iArr2, iArr3);
        AbstractC15367e.appmetrica(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        AbstractC15367e.adcel(4, iArr3, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        AbstractC15367e.adcel(3, iArr4, iArr5);
        AbstractC15367e.appmetrica(iArr5, iArr2, iArr5);
        AbstractC15367e.adcel(8, iArr5, iArr5);
        AbstractC15367e.appmetrica(iArr5, iArr4, iArr5);
        AbstractC15367e.adcel(4, iArr5, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr3, iArr4);
        AbstractC15367e.adcel(19, iArr4, iArr3);
        AbstractC15367e.appmetrica(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        AbstractC15367e.adcel(42, iArr3, iArr6);
        AbstractC15367e.appmetrica(iArr6, iArr3, iArr6);
        AbstractC15367e.adcel(23, iArr6, iArr3);
        AbstractC15367e.appmetrica(iArr3, iArr4, iArr3);
        AbstractC15367e.adcel(84, iArr3, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr6, iArr4);
        AbstractC15367e.adcel(20, iArr4, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr5, iArr4);
        AbstractC15367e.adcel(3, iArr4, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr, iArr4);
        AbstractC15367e.adcel(2, iArr4, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr, iArr4);
        AbstractC15367e.adcel(4, iArr4, iArr4);
        AbstractC15367e.appmetrica(iArr4, iArr2, iArr4);
        AbstractC15367e.startapp(iArr4, iArr4);
        AbstractC15367e.startapp(iArr4, iArr6);
        if (AbstractC12947e.mopub(iArr, iArr6)) {
            return new C11372e(iArr4);
        }
        AbstractC15367e.appmetrica(iArr4, f22882e, iArr4);
        AbstractC15367e.startapp(iArr4, iArr6);
        if (AbstractC12947e.mopub(iArr, iArr6)) {
            return new C11372e(iArr4);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f22883e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC15367e.appmetrica(this.f22884e, ((C11372e) abstractC7861e).f22884e, iArr);
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC15367e.mopub(this.f22884e, ((C11372e) abstractC7861e).f22884e, iArr);
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC12947e.Signature(this.f22884e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[7];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f22884e;
            if (i >= 7) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC15367e.ad;
        if (i3 != 0) {
            AbstractC12947e.inmobi(iArr3, iArr3, iArr2);
        } else {
            AbstractC12947e.inmobi(iArr3, iArr, iArr2);
        }
        return new C11372e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[7];
        if (AbstractC12797e.pro(7, this.f22884e, iArr) != 0 || (iArr[6] == -1 && AbstractC12947e.amazon(iArr, AbstractC15367e.ad))) {
            AbstractC12797e.vip(7, 6803, iArr);
        }
        return new C11372e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[7];
        AbstractC6143e.metrica(AbstractC15367e.ad, ((C11372e) abstractC7861e).f22884e, iArr);
        AbstractC15367e.appmetrica(iArr, this.f22884e, iArr);
        return new C11372e(iArr);
    }
}
