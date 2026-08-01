package defpackage;

import java.math.BigInteger;

/* renamed from: eؔۡۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2926e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f6915e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f6916e;

    public C2926e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f6915e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] advert = AbstractC10077e.advert(bigInteger);
        if (advert[7] == -1) {
            int[] iArr = AbstractC1206e.ad;
            if (AbstractC10077e.pro(advert, iArr)) {
                AbstractC10077e.m2755class(iArr, advert);
            }
        }
        this.f6916e = advert;
    }

    public C2926e(int[] iArr) {
        super(3);
        this.f6916e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC1206e.ad, this.f6916e, iArr);
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        if (AbstractC10077e.ad(this.f6916e, ((C2926e) abstractC7861e).f6916e, iArr) != 0 || (iArr[7] == -1 && AbstractC10077e.pro(iArr, AbstractC1206e.ad))) {
            AbstractC1206e.ad(iArr);
        }
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.signatures(this.f6916e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC10077e.premium(this.f6916e, iArr2);
        AbstractC1206e.billing(iArr2, iArr);
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC10077e.smaato(this.f6916e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2926e) {
            return AbstractC10077e.adcel(this.f6916e, ((C2926e) obj).f6916e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2757interface(this.f6916e);
    }

    public final int hashCode() {
        return f6915e.hashCode() ^ AbstractC12442e.inmobi(this.f6916e, 8);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f6916e;
        if (AbstractC10077e.isVip(iArr) || AbstractC10077e.signatures(iArr)) {
            return this;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        AbstractC10077e.premium(iArr, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC10077e.isPro(iArr3, iArr, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC1206e.startapp(2, iArr3, iArr4, iArr2);
        AbstractC10077e.isPro(iArr4, iArr3, iArr2);
        AbstractC1206e.billing(iArr2, iArr4);
        AbstractC1206e.startapp(4, iArr4, iArr3, iArr2);
        AbstractC10077e.isPro(iArr3, iArr4, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC1206e.startapp(8, iArr3, iArr4, iArr2);
        AbstractC10077e.isPro(iArr4, iArr3, iArr2);
        AbstractC1206e.billing(iArr2, iArr4);
        AbstractC1206e.startapp(16, iArr4, iArr3, iArr2);
        AbstractC10077e.isPro(iArr3, iArr4, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC1206e.startapp(32, iArr3, iArr3, iArr2);
        AbstractC10077e.isPro(iArr3, iArr, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC1206e.startapp(96, iArr3, iArr3, iArr2);
        AbstractC10077e.isPro(iArr3, iArr, iArr2);
        AbstractC1206e.billing(iArr2, iArr3);
        AbstractC1206e.startapp(94, iArr3, iArr3, iArr2);
        AbstractC10077e.premium(iArr3, iArr2);
        AbstractC1206e.billing(iArr2, iArr4);
        if (AbstractC10077e.adcel(iArr, iArr4)) {
            return new C2926e(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f6915e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC10077e.isPro(this.f6916e, ((C2926e) abstractC7861e).f6916e, iArr2);
        AbstractC1206e.billing(iArr2, iArr);
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC1206e.adcel(this.f6916e, ((C2926e) abstractC7861e).f6916e, iArr);
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.isVip(this.f6916e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f6916e;
            if (i >= 8) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC1206e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr3, iArr3, iArr2);
        } else {
            AbstractC10077e.crashlytics(iArr3, iArr, iArr2);
        }
        return new C2926e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[8];
        if (AbstractC12797e.pro(8, this.f6916e, iArr) != 0 || (iArr[7] == -1 && AbstractC10077e.pro(iArr, AbstractC1206e.ad))) {
            AbstractC1206e.ad(iArr);
        }
        return new C2926e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC1206e.ad, ((C2926e) abstractC7861e).f6916e, iArr);
        int[] iArr2 = new int[16];
        AbstractC10077e.isPro(iArr, this.f6916e, iArr2);
        AbstractC1206e.billing(iArr2, iArr);
        return new C2926e(iArr);
    }
}
