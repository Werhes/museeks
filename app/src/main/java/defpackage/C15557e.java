package defpackage;

import java.math.BigInteger;

/* renamed from: eٕٙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15557e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f30712e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f30713e;

    public C15557e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30712e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] amazon = AbstractC15077e.amazon(bigInteger);
        if (amazon[4] == -1) {
            int[] iArr = AbstractC8787e.ad;
            if (AbstractC15077e.Signature(amazon, iArr)) {
                AbstractC15077e.isVip(iArr, amazon);
            }
        }
        this.f30713e = amazon;
    }

    public C15557e(int[] iArr) {
        super(3);
        this.f30713e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[5];
        AbstractC6143e.metrica(AbstractC8787e.ad, this.f30713e, iArr);
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        if (AbstractC15077e.startapp(this.f30713e, ((C15557e) abstractC7861e).f30713e, iArr) != 0 || (iArr[4] == -1 && AbstractC15077e.Signature(iArr, AbstractC8787e.ad))) {
            AbstractC12797e.billing(5, -2147483647, iArr);
        }
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC15077e.admob(this.f30713e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[5];
        AbstractC8787e.startapp(this.f30713e, iArr);
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC15077e.loadAd(this.f30713e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15557e) {
            return AbstractC15077e.smaato(this.f30713e, ((C15557e) obj).f30713e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC15077e.inmobi(this.f30713e);
    }

    public final int hashCode() {
        return f30712e.hashCode() ^ AbstractC12442e.inmobi(this.f30713e, 5);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f30713e;
        if (AbstractC15077e.subscription(iArr) || AbstractC15077e.admob(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        AbstractC8787e.startapp(iArr, iArr2);
        AbstractC8787e.purchase(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        AbstractC8787e.adcel(2, iArr2, iArr3);
        AbstractC8787e.purchase(iArr3, iArr2, iArr3);
        AbstractC8787e.adcel(4, iArr3, iArr2);
        AbstractC8787e.purchase(iArr2, iArr3, iArr2);
        AbstractC8787e.adcel(8, iArr2, iArr3);
        AbstractC8787e.purchase(iArr3, iArr2, iArr3);
        AbstractC8787e.adcel(16, iArr3, iArr2);
        AbstractC8787e.purchase(iArr2, iArr3, iArr2);
        AbstractC8787e.adcel(32, iArr2, iArr3);
        AbstractC8787e.purchase(iArr3, iArr2, iArr3);
        AbstractC8787e.adcel(64, iArr3, iArr2);
        AbstractC8787e.purchase(iArr2, iArr3, iArr2);
        AbstractC8787e.startapp(iArr2, iArr3);
        AbstractC8787e.purchase(iArr3, iArr, iArr3);
        AbstractC8787e.adcel(29, iArr3, iArr3);
        AbstractC8787e.startapp(iArr3, iArr2);
        if (AbstractC15077e.smaato(iArr, iArr2)) {
            return new C15557e(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f30712e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC8787e.purchase(this.f30713e, ((C15557e) abstractC7861e).f30713e, iArr);
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC8787e.mopub(this.f30713e, ((C15557e) abstractC7861e).f30713e, iArr);
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC15077e.subscription(this.f30713e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[5];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f30713e;
            if (i >= 5) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC8787e.ad;
        if (i3 != 0) {
            AbstractC15077e.tapsense(iArr3, iArr3, iArr2);
        } else {
            AbstractC15077e.tapsense(iArr3, iArr, iArr2);
        }
        return new C15557e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[5];
        if (AbstractC12797e.pro(5, this.f30713e, iArr) != 0 || (iArr[4] == -1 && AbstractC15077e.Signature(iArr, AbstractC8787e.ad))) {
            AbstractC12797e.billing(5, -2147483647, iArr);
        }
        return new C15557e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC6143e.metrica(AbstractC8787e.ad, ((C15557e) abstractC7861e).f30713e, iArr);
        AbstractC8787e.purchase(iArr, this.f30713e, iArr);
        return new C15557e(iArr);
    }
}
