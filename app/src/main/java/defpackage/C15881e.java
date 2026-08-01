package defpackage;

import java.math.BigInteger;

/* renamed from: eٕٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15881e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f31318e = new BigInteger(1, AbstractC7240e.metrica("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f31319e;

    public C15881e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f31318e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] adcel = AbstractC12797e.adcel(521, bigInteger);
        if (AbstractC12797e.startapp(17, adcel, AbstractC0223e.ad)) {
            for (int i = 0; i < 17; i++) {
                adcel[i] = 0;
            }
        }
        this.f31319e = adcel;
    }

    public C15881e(int[] iArr) {
        super(3);
        this.f31319e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[17];
        AbstractC6143e.metrica(AbstractC0223e.ad, this.f31319e, iArr);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[17];
        AbstractC0223e.ad(this.f31319e, ((C15881e) abstractC7861e).f31319e, iArr);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC12797e.isPro(this.f31319e, 17);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        AbstractC0223e.appmetrica(this.f31319e, iArr2);
        AbstractC0223e.adcel(iArr2, iArr);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC12797e.smaato(this.f31319e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15881e) {
            return AbstractC12797e.startapp(17, this.f31319e, ((C15881e) obj).f31319e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC12797e.m3401native(this.f31319e, 17);
    }

    public final int hashCode() {
        return f31318e.hashCode() ^ AbstractC12442e.inmobi(this.f31319e, 17);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f31319e;
        if (AbstractC12797e.applovin(iArr, 17) || AbstractC12797e.isPro(iArr, 17)) {
            return this;
        }
        int[] iArr2 = new int[33];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[17];
        AbstractC0223e.appmetrica(iArr, iArr2);
        AbstractC0223e.adcel(iArr2, iArr3);
        int i = 519;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            AbstractC0223e.appmetrica(iArr3, iArr2);
            AbstractC0223e.adcel(iArr2, iArr3);
        }
        AbstractC0223e.appmetrica(iArr3, iArr2);
        AbstractC0223e.adcel(iArr2, iArr4);
        if (AbstractC12797e.startapp(17, iArr, iArr4)) {
            return new C15881e(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f31318e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[17];
        int[] iArr2 = new int[33];
        AbstractC0223e.license(this.f31319e, ((C15881e) abstractC7861e).f31319e, iArr2);
        AbstractC0223e.adcel(iArr2, iArr);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[17];
        AbstractC0223e.advert(this.f31319e, ((C15881e) abstractC7861e).f31319e, iArr);
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC12797e.applovin(this.f31319e, 17);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[17];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f31319e;
            if (i >= 17) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC0223e.ad;
        if (i3 != 0) {
            AbstractC12797e.m3397class(17, iArr3, iArr3, iArr2);
        } else {
            AbstractC12797e.m3397class(17, iArr3, iArr, iArr2);
        }
        return new C15881e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f31319e;
        int pro = AbstractC12797e.pro(16, iArr2, iArr) + iArr2[16];
        if (pro > 511 || (pro == 511 && AbstractC12797e.startapp(16, iArr, AbstractC0223e.ad))) {
            pro = (AbstractC12797e.signatures(iArr) + pro) & 511;
        }
        iArr[16] = pro;
        return new C15881e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[17];
        AbstractC6143e.metrica(AbstractC0223e.ad, ((C15881e) abstractC7861e).f31319e, iArr);
        int[] iArr2 = new int[33];
        AbstractC0223e.license(iArr, this.f31319e, iArr2);
        AbstractC0223e.adcel(iArr2, iArr);
        return new C15881e(iArr);
    }
}
