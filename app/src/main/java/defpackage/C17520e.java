package defpackage;

import java.math.BigInteger;

/* renamed from: e٘ؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17520e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f34355e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f34356e;

    public C17520e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f34355e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] advert = AbstractC16091e.advert(bigInteger);
        if (advert[5] == -1) {
            int[] iArr = AbstractC6190e.ad;
            if (AbstractC16091e.Signature(advert, iArr)) {
                AbstractC16091e.subs(iArr, advert);
            }
        }
        this.f34356e = advert;
    }

    public C17520e(int[] iArr) {
        super(3);
        this.f34356e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[6];
        AbstractC6143e.metrica(AbstractC6190e.ad, this.f34356e, iArr);
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        if (AbstractC16091e.ad(this.f34356e, ((C17520e) abstractC7861e).f34356e, iArr) != 0 || (iArr[5] == -1 && AbstractC16091e.Signature(iArr, AbstractC6190e.ad))) {
            AbstractC12797e.vip(6, 4553, iArr);
        }
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC16091e.admob(this.f34356e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[6];
        AbstractC6190e.startapp(this.f34356e, iArr);
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC16091e.amazon(this.f34356e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17520e) {
            return AbstractC16091e.adcel(this.f34356e, ((C17520e) obj).f34356e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC16091e.crashlytics(this.f34356e);
    }

    public final int hashCode() {
        return f34355e.hashCode() ^ AbstractC12442e.inmobi(this.f34356e, 6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f34356e;
        if (AbstractC16091e.remoteconfig(iArr) || AbstractC16091e.admob(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        AbstractC6190e.startapp(iArr, iArr2);
        AbstractC6190e.purchase(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        AbstractC6190e.startapp(iArr2, iArr3);
        AbstractC6190e.purchase(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        AbstractC6190e.adcel(3, iArr3, iArr4);
        AbstractC6190e.purchase(iArr4, iArr3, iArr4);
        AbstractC6190e.adcel(2, iArr4, iArr4);
        AbstractC6190e.purchase(iArr4, iArr2, iArr4);
        AbstractC6190e.adcel(8, iArr4, iArr2);
        AbstractC6190e.purchase(iArr2, iArr4, iArr2);
        AbstractC6190e.adcel(3, iArr2, iArr4);
        AbstractC6190e.purchase(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        AbstractC6190e.adcel(16, iArr4, iArr5);
        AbstractC6190e.purchase(iArr5, iArr2, iArr5);
        AbstractC6190e.adcel(35, iArr5, iArr2);
        AbstractC6190e.purchase(iArr2, iArr5, iArr2);
        AbstractC6190e.adcel(70, iArr2, iArr5);
        AbstractC6190e.purchase(iArr5, iArr2, iArr5);
        AbstractC6190e.adcel(19, iArr5, iArr2);
        AbstractC6190e.purchase(iArr2, iArr4, iArr2);
        AbstractC6190e.adcel(20, iArr2, iArr2);
        AbstractC6190e.purchase(iArr2, iArr4, iArr2);
        AbstractC6190e.adcel(4, iArr2, iArr2);
        AbstractC6190e.purchase(iArr2, iArr3, iArr2);
        AbstractC6190e.adcel(6, iArr2, iArr2);
        AbstractC6190e.purchase(iArr2, iArr3, iArr2);
        AbstractC6190e.startapp(iArr2, iArr2);
        AbstractC6190e.startapp(iArr2, iArr3);
        if (AbstractC16091e.adcel(iArr, iArr3)) {
            return new C17520e(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f34355e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC6190e.purchase(this.f34356e, ((C17520e) abstractC7861e).f34356e, iArr);
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC6190e.mopub(this.f34356e, ((C17520e) abstractC7861e).f34356e, iArr);
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC16091e.remoteconfig(this.f34356e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[6];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f34356e;
            if (i >= 6) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC6190e.ad;
        if (i3 != 0) {
            AbstractC16091e.ads(iArr3, iArr3, iArr2);
        } else {
            AbstractC16091e.ads(iArr3, iArr, iArr2);
        }
        return new C17520e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[6];
        if (AbstractC12797e.pro(6, this.f34356e, iArr) != 0 || (iArr[5] == -1 && AbstractC16091e.Signature(iArr, AbstractC6190e.ad))) {
            AbstractC12797e.vip(6, 4553, iArr);
        }
        return new C17520e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[6];
        AbstractC6143e.metrica(AbstractC6190e.ad, ((C17520e) abstractC7861e).f34356e, iArr);
        AbstractC6190e.purchase(iArr, this.f34356e, iArr);
        return new C17520e(iArr);
    }
}
