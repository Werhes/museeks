package defpackage;

import java.math.BigInteger;

/* renamed from: eؘؘۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5472e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f11748e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f11749e;

    public C5472e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f11748e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] advert = AbstractC10077e.advert(bigInteger);
        if ((advert[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = AbstractC8677e.ad;
            if (AbstractC10077e.pro(advert, iArr)) {
                AbstractC10077e.m2755class(iArr, advert);
            }
        }
        this.f11749e = advert;
    }

    public C5472e(int[] iArr) {
        super(3);
        this.f11749e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC8677e.ad, this.f11749e, iArr);
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC8677e.ad(this.f11749e, ((C5472e) abstractC7861e).f11749e, iArr);
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.signatures(this.f11749e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[8];
        AbstractC8677e.yandex(this.f11749e, iArr);
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC10077e.smaato(this.f11749e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5472e) {
            return AbstractC10077e.adcel(this.f11749e, ((C5472e) obj).f11749e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2757interface(this.f11749e);
    }

    public final int hashCode() {
        return f11748e.hashCode() ^ AbstractC12442e.inmobi(this.f11749e, 8);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f11749e;
        if (AbstractC10077e.isVip(iArr) || AbstractC10077e.signatures(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        AbstractC8677e.yandex(iArr, iArr2);
        AbstractC8677e.appmetrica(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        AbstractC8677e.startapp(2, iArr2, iArr3);
        AbstractC8677e.appmetrica(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        AbstractC8677e.startapp(2, iArr3, iArr4);
        AbstractC8677e.appmetrica(iArr4, iArr2, iArr4);
        AbstractC8677e.startapp(6, iArr4, iArr2);
        AbstractC8677e.appmetrica(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        AbstractC8677e.startapp(12, iArr2, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr2, iArr5);
        AbstractC8677e.startapp(6, iArr5, iArr2);
        AbstractC8677e.appmetrica(iArr2, iArr4, iArr2);
        AbstractC8677e.yandex(iArr2, iArr4);
        AbstractC8677e.appmetrica(iArr4, iArr, iArr4);
        AbstractC8677e.startapp(31, iArr4, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr4, iArr2);
        AbstractC8677e.startapp(32, iArr5, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr2, iArr5);
        AbstractC8677e.startapp(62, iArr5, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr2, iArr5);
        AbstractC8677e.startapp(4, iArr5, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr3, iArr5);
        AbstractC8677e.startapp(32, iArr5, iArr5);
        AbstractC8677e.appmetrica(iArr5, iArr, iArr5);
        AbstractC8677e.startapp(62, iArr5, iArr5);
        AbstractC8677e.yandex(iArr5, iArr3);
        if (AbstractC10077e.adcel(iArr, iArr3)) {
            return new C5472e(iArr5);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f11748e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC8677e.appmetrica(this.f11749e, ((C5472e) abstractC7861e).f11749e, iArr);
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC8677e.adcel(this.f11749e, ((C5472e) abstractC7861e).f11749e, iArr);
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.isVip(this.f11749e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f11749e;
            if (i >= 8) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC8677e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr3, iArr3, iArr2);
        } else {
            AbstractC10077e.crashlytics(iArr3, iArr, iArr2);
        }
        return new C5472e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[8];
        if (AbstractC12797e.pro(8, this.f11749e, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && AbstractC10077e.pro(iArr, AbstractC8677e.ad))) {
            AbstractC8677e.vip(iArr);
        }
        return new C5472e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC8677e.ad, ((C5472e) abstractC7861e).f11749e, iArr);
        AbstractC8677e.appmetrica(iArr, this.f11749e, iArr);
        return new C5472e(iArr);
    }
}
