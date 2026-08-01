package defpackage;

import java.math.BigInteger;

/* renamed from: eٌٓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8674e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f17518e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f17519e;

    public C8674e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17518e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] advert = AbstractC16091e.advert(bigInteger);
        if (advert[5] == -1) {
            int[] iArr = AbstractC1216e.ad;
            if (AbstractC16091e.Signature(advert, iArr)) {
                AbstractC16091e.subs(iArr, advert);
            }
        }
        this.f17519e = advert;
    }

    public C8674e(int[] iArr) {
        super(3);
        this.f17519e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[6];
        AbstractC6143e.metrica(AbstractC1216e.ad, this.f17519e, iArr);
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        if (AbstractC16091e.ad(this.f17519e, ((C8674e) abstractC7861e).f17519e, iArr) != 0 || (iArr[5] == -1 && AbstractC16091e.Signature(iArr, AbstractC1216e.ad))) {
            AbstractC1216e.vip(iArr);
        }
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC16091e.admob(this.f17519e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[6];
        AbstractC1216e.smaato(this.f17519e, iArr);
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC16091e.amazon(this.f17519e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8674e) {
            return AbstractC16091e.adcel(this.f17519e, ((C8674e) obj).f17519e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC16091e.crashlytics(this.f17519e);
    }

    public final int hashCode() {
        return f17518e.hashCode() ^ AbstractC12442e.inmobi(this.f17519e, 6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f17519e;
        if (AbstractC16091e.remoteconfig(iArr) || AbstractC16091e.admob(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        AbstractC1216e.smaato(iArr, iArr2);
        AbstractC1216e.startapp(iArr2, iArr, iArr2);
        AbstractC1216e.amazon(2, iArr2, iArr3);
        AbstractC1216e.startapp(iArr3, iArr2, iArr3);
        AbstractC1216e.amazon(4, iArr3, iArr2);
        AbstractC1216e.startapp(iArr2, iArr3, iArr2);
        AbstractC1216e.amazon(8, iArr2, iArr3);
        AbstractC1216e.startapp(iArr3, iArr2, iArr3);
        AbstractC1216e.amazon(16, iArr3, iArr2);
        AbstractC1216e.startapp(iArr2, iArr3, iArr2);
        AbstractC1216e.amazon(32, iArr2, iArr3);
        AbstractC1216e.startapp(iArr3, iArr2, iArr3);
        AbstractC1216e.amazon(64, iArr3, iArr2);
        AbstractC1216e.startapp(iArr2, iArr3, iArr2);
        AbstractC1216e.amazon(62, iArr2, iArr2);
        AbstractC1216e.smaato(iArr2, iArr3);
        if (AbstractC16091e.adcel(iArr, iArr3)) {
            return new C8674e(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f17518e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC1216e.startapp(this.f17519e, ((C8674e) abstractC7861e).f17519e, iArr);
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC1216e.loadAd(this.f17519e, ((C8674e) abstractC7861e).f17519e, iArr);
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC16091e.remoteconfig(this.f17519e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[6];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f17519e;
            if (i >= 6) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC1216e.ad;
        if (i3 != 0) {
            AbstractC16091e.ads(iArr3, iArr3, iArr2);
        } else {
            AbstractC16091e.ads(iArr3, iArr, iArr2);
        }
        return new C8674e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[6];
        if (AbstractC12797e.pro(6, this.f17519e, iArr) != 0 || (iArr[5] == -1 && AbstractC16091e.Signature(iArr, AbstractC1216e.ad))) {
            AbstractC1216e.vip(iArr);
        }
        return new C8674e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC6143e.metrica(AbstractC1216e.ad, ((C8674e) abstractC7861e).f17519e, iArr);
        AbstractC1216e.startapp(iArr, this.f17519e, iArr);
        return new C8674e(iArr);
    }
}
