package defpackage;

import java.math.BigInteger;

/* renamed from: eٜؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4312e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f9425e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f9426e;

    public C4312e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9425e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] amazon = AbstractC15077e.amazon(bigInteger);
        if (amazon[4] == -1) {
            int[] iArr = AbstractC8457e.vip;
            if (AbstractC15077e.Signature(amazon, iArr)) {
                AbstractC15077e.isVip(iArr, amazon);
            }
        }
        this.f9426e = amazon;
    }

    public C4312e(int[] iArr) {
        super(3);
        this.f9426e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[5];
        AbstractC6143e.metrica(AbstractC8457e.vip, this.f9426e, iArr);
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        if (AbstractC15077e.startapp(this.f9426e, ((C4312e) abstractC7861e).f9426e, iArr) != 0 || (iArr[4] == -1 && AbstractC15077e.Signature(iArr, AbstractC8457e.vip))) {
            AbstractC12797e.vip(5, 21389, iArr);
        }
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC15077e.admob(this.f9426e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[5];
        AbstractC8457e.billing(this.f9426e, iArr);
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC15077e.loadAd(this.f9426e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4312e) {
            return AbstractC15077e.smaato(this.f9426e, ((C4312e) obj).f9426e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC15077e.inmobi(this.f9426e);
    }

    public final int hashCode() {
        return f9425e.hashCode() ^ AbstractC12442e.inmobi(this.f9426e, 5);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f9426e;
        if (AbstractC15077e.subscription(iArr) || AbstractC15077e.admob(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        AbstractC8457e.billing(iArr, iArr2);
        AbstractC8457e.metrica(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        AbstractC8457e.billing(iArr2, iArr3);
        AbstractC8457e.metrica(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        AbstractC8457e.billing(iArr3, iArr4);
        AbstractC8457e.metrica(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        AbstractC8457e.yandex(3, iArr4, iArr5);
        AbstractC8457e.metrica(iArr5, iArr3, iArr5);
        AbstractC8457e.yandex(7, iArr5, iArr4);
        AbstractC8457e.metrica(iArr4, iArr5, iArr4);
        AbstractC8457e.yandex(3, iArr4, iArr5);
        AbstractC8457e.metrica(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        AbstractC8457e.yandex(14, iArr5, iArr6);
        AbstractC8457e.metrica(iArr6, iArr4, iArr6);
        AbstractC8457e.yandex(31, iArr6, iArr4);
        AbstractC8457e.metrica(iArr4, iArr6, iArr4);
        AbstractC8457e.yandex(62, iArr4, iArr6);
        AbstractC8457e.metrica(iArr6, iArr4, iArr6);
        AbstractC8457e.yandex(3, iArr6, iArr4);
        AbstractC8457e.metrica(iArr4, iArr3, iArr4);
        AbstractC8457e.yandex(18, iArr4, iArr4);
        AbstractC8457e.metrica(iArr4, iArr5, iArr4);
        AbstractC8457e.yandex(2, iArr4, iArr4);
        AbstractC8457e.metrica(iArr4, iArr, iArr4);
        AbstractC8457e.yandex(3, iArr4, iArr4);
        AbstractC8457e.metrica(iArr4, iArr2, iArr4);
        AbstractC8457e.yandex(6, iArr4, iArr4);
        AbstractC8457e.metrica(iArr4, iArr3, iArr4);
        AbstractC8457e.yandex(2, iArr4, iArr4);
        AbstractC8457e.metrica(iArr4, iArr, iArr4);
        AbstractC8457e.billing(iArr4, iArr2);
        if (AbstractC15077e.smaato(iArr, iArr2)) {
            return new C4312e(iArr4);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f9425e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC8457e.metrica(this.f9426e, ((C4312e) abstractC7861e).f9426e, iArr);
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC8457e.startapp(this.f9426e, ((C4312e) abstractC7861e).f9426e, iArr);
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC15077e.subscription(this.f9426e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[5];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f9426e;
            if (i >= 5) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC8457e.vip;
        if (i3 != 0) {
            AbstractC15077e.tapsense(iArr3, iArr3, iArr2);
        } else {
            AbstractC15077e.tapsense(iArr3, iArr, iArr2);
        }
        return new C4312e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[5];
        if (AbstractC12797e.pro(5, this.f9426e, iArr) != 0 || (iArr[4] == -1 && AbstractC15077e.Signature(iArr, AbstractC8457e.vip))) {
            AbstractC12797e.vip(5, 21389, iArr);
        }
        return new C4312e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[5];
        AbstractC6143e.metrica(AbstractC8457e.vip, ((C4312e) abstractC7861e).f9426e, iArr);
        AbstractC8457e.metrica(iArr, this.f9426e, iArr);
        return new C4312e(iArr);
    }
}
