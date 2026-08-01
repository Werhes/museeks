package defpackage;

import java.math.BigInteger;

/* renamed from: eَْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13183e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f26184e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f26185e;

    public C13183e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f26184e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] advert = AbstractC10077e.advert(bigInteger);
        if (advert[7] == -1) {
            int[] iArr = AbstractC11866e.ad;
            if (AbstractC10077e.pro(advert, iArr)) {
                AbstractC10077e.m2755class(iArr, advert);
            }
        }
        this.f26185e = advert;
    }

    public C13183e(int[] iArr) {
        super(3);
        this.f26185e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC11866e.ad, this.f26185e, iArr);
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        if (AbstractC10077e.ad(this.f26185e, ((C13183e) abstractC7861e).f26185e, iArr) != 0 || (iArr[7] == -1 && AbstractC10077e.pro(iArr, AbstractC11866e.ad))) {
            AbstractC12797e.vip(8, 977, iArr);
        }
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.signatures(this.f26185e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC10077e.premium(this.f26185e, iArr2);
        AbstractC11866e.yandex(iArr2, iArr);
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC10077e.smaato(this.f26185e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13183e) {
            return AbstractC10077e.adcel(this.f26185e, ((C13183e) obj).f26185e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2757interface(this.f26185e);
    }

    public final int hashCode() {
        return f26184e.hashCode() ^ AbstractC12442e.inmobi(this.f26185e, 8);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f26185e;
        if (AbstractC10077e.isVip(iArr) || AbstractC10077e.signatures(iArr)) {
            return this;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[8];
        AbstractC10077e.premium(iArr, iArr2);
        AbstractC11866e.yandex(iArr2, iArr3);
        AbstractC10077e.isPro(iArr3, iArr, iArr2);
        AbstractC11866e.yandex(iArr2, iArr3);
        int[] iArr4 = new int[8];
        AbstractC10077e.premium(iArr3, iArr2);
        AbstractC11866e.yandex(iArr2, iArr4);
        AbstractC10077e.isPro(iArr4, iArr, iArr2);
        AbstractC11866e.yandex(iArr2, iArr4);
        int[] iArr5 = new int[8];
        AbstractC11866e.mopub(3, iArr4, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr4, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        AbstractC11866e.mopub(3, iArr5, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr4, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        AbstractC11866e.mopub(2, iArr5, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr3, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        int[] iArr6 = new int[8];
        AbstractC11866e.mopub(11, iArr5, iArr6, iArr2);
        AbstractC10077e.isPro(iArr6, iArr5, iArr2);
        AbstractC11866e.yandex(iArr2, iArr6);
        AbstractC11866e.mopub(22, iArr6, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr6, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        int[] iArr7 = new int[8];
        AbstractC11866e.mopub(44, iArr5, iArr7, iArr2);
        AbstractC10077e.isPro(iArr7, iArr5, iArr2);
        AbstractC11866e.yandex(iArr2, iArr7);
        int[] iArr8 = new int[8];
        AbstractC11866e.mopub(88, iArr7, iArr8, iArr2);
        AbstractC10077e.isPro(iArr8, iArr7, iArr2);
        AbstractC11866e.yandex(iArr2, iArr8);
        AbstractC11866e.mopub(44, iArr8, iArr7, iArr2);
        AbstractC10077e.isPro(iArr7, iArr5, iArr2);
        AbstractC11866e.yandex(iArr2, iArr7);
        AbstractC11866e.mopub(3, iArr7, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr4, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        AbstractC11866e.mopub(23, iArr5, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr6, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        AbstractC11866e.mopub(6, iArr5, iArr5, iArr2);
        AbstractC10077e.isPro(iArr5, iArr3, iArr2);
        AbstractC11866e.yandex(iArr2, iArr5);
        AbstractC11866e.mopub(2, iArr5, iArr5, iArr2);
        AbstractC10077e.premium(iArr5, iArr2);
        AbstractC11866e.yandex(iArr2, iArr3);
        if (AbstractC10077e.adcel(iArr, iArr3)) {
            return new C13183e(iArr5);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f26184e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[16];
        AbstractC10077e.isPro(this.f26185e, ((C13183e) abstractC7861e).f26185e, iArr2);
        AbstractC11866e.yandex(iArr2, iArr);
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC11866e.advert(this.f26185e, ((C13183e) abstractC7861e).f26185e, iArr);
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.isVip(this.f26185e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f26185e;
            if (i >= 8) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC11866e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr3, iArr3, iArr2);
        } else {
            AbstractC10077e.crashlytics(iArr3, iArr, iArr2);
        }
        return new C13183e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[8];
        if (AbstractC12797e.pro(8, this.f26185e, iArr) != 0 || (iArr[7] == -1 && AbstractC10077e.pro(iArr, AbstractC11866e.ad))) {
            AbstractC12797e.vip(8, 977, iArr);
        }
        return new C13183e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC11866e.ad, ((C13183e) abstractC7861e).f26185e, iArr);
        int[] iArr2 = new int[16];
        AbstractC10077e.isPro(iArr, this.f26185e, iArr2);
        AbstractC11866e.yandex(iArr2, iArr);
        return new C13183e(iArr);
    }
}
