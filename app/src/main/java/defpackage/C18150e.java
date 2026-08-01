package defpackage;

import java.math.BigInteger;

/* renamed from: e٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18150e extends AbstractC15853e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int[] f35562e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f35561e = AbstractC10077e.m2757interface(AbstractC15710e.ad);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f35560e = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public C18150e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f35561e) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] advert = AbstractC10077e.advert(bigInteger);
        while (true) {
            int[] iArr = AbstractC15710e.ad;
            if (!AbstractC10077e.pro(advert, iArr)) {
                this.f35562e = advert;
                return;
            }
            AbstractC10077e.m2755class(iArr, advert);
        }
    }

    public C18150e(int[] iArr) {
        super(3);
        this.f35562e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC15710e.ad, this.f35562e, iArr);
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC10077e.ad(this.f35562e, ((C18150e) abstractC7861e).f35562e, iArr);
        if (AbstractC10077e.pro(iArr, AbstractC15710e.ad)) {
            AbstractC15710e.amazon(iArr);
        }
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.signatures(this.f35562e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[8];
        AbstractC15710e.advert(this.f35562e, iArr);
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC10077e.smaato(this.f35562e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18150e) {
            return AbstractC10077e.adcel(this.f35562e, ((C18150e) obj).f35562e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2757interface(this.f35562e);
    }

    public final int hashCode() {
        return f35561e.hashCode() ^ AbstractC12442e.inmobi(this.f35562e, 8);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f35562e;
        if (AbstractC10077e.isVip(iArr) || AbstractC10077e.signatures(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        AbstractC15710e.advert(iArr, iArr2);
        AbstractC15710e.yandex(iArr2, iArr, iArr2);
        AbstractC15710e.advert(iArr2, iArr2);
        AbstractC15710e.yandex(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        AbstractC15710e.advert(iArr2, iArr3);
        AbstractC15710e.yandex(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        AbstractC15710e.smaato(3, iArr3, iArr4);
        AbstractC15710e.yandex(iArr4, iArr2, iArr4);
        AbstractC15710e.smaato(4, iArr4, iArr2);
        AbstractC15710e.yandex(iArr2, iArr3, iArr2);
        AbstractC15710e.smaato(4, iArr2, iArr4);
        AbstractC15710e.yandex(iArr4, iArr3, iArr4);
        AbstractC15710e.smaato(15, iArr4, iArr3);
        AbstractC15710e.yandex(iArr3, iArr4, iArr3);
        AbstractC15710e.smaato(30, iArr3, iArr4);
        AbstractC15710e.yandex(iArr4, iArr3, iArr4);
        AbstractC15710e.smaato(60, iArr4, iArr3);
        AbstractC15710e.yandex(iArr3, iArr4, iArr3);
        AbstractC15710e.smaato(11, iArr3, iArr4);
        AbstractC15710e.yandex(iArr4, iArr2, iArr4);
        AbstractC15710e.smaato(120, iArr4, iArr2);
        AbstractC15710e.yandex(iArr2, iArr3, iArr2);
        AbstractC15710e.advert(iArr2, iArr2);
        AbstractC15710e.advert(iArr2, iArr3);
        if (AbstractC10077e.adcel(iArr, iArr3)) {
            return new C18150e(iArr2);
        }
        AbstractC15710e.yandex(iArr2, f35560e, iArr2);
        AbstractC15710e.advert(iArr2, iArr3);
        if (AbstractC10077e.adcel(iArr, iArr3)) {
            return new C18150e(iArr2);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f35561e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC15710e.yandex(this.f35562e, ((C18150e) abstractC7861e).f35562e, iArr);
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC15710e.loadAd(this.f35562e, ((C18150e) abstractC7861e).f35562e, iArr);
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.isVip(this.f35562e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f35562e;
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr2[i2];
        }
        int i3 = (((i >>> 1) | (i & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC15710e.ad;
        if (i3 != 0) {
            AbstractC10077e.crashlytics(iArr3, iArr3, iArr);
        } else {
            AbstractC10077e.crashlytics(iArr3, iArr2, iArr);
        }
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[8];
        AbstractC12797e.pro(8, this.f35562e, iArr);
        if (AbstractC10077e.pro(iArr, AbstractC15710e.ad)) {
            AbstractC15710e.amazon(iArr);
        }
        return new C18150e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[8];
        AbstractC6143e.metrica(AbstractC15710e.ad, ((C18150e) abstractC7861e).f35562e, iArr);
        AbstractC15710e.yandex(iArr, this.f35562e, iArr);
        return new C18150e(iArr);
    }
}
