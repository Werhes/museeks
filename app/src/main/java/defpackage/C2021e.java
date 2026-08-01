package defpackage;

import java.math.BigInteger;

/* renamed from: eؓۖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2021e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f5298e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f5299e;

    public C2021e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f5298e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] adcel = AbstractC12797e.adcel(384, bigInteger);
        if (adcel[11] == -1) {
            int[] iArr = AbstractC1396e.ad;
            if (AbstractC12797e.subscription(12, adcel, iArr)) {
                AbstractC12797e.m3402this(12, iArr, adcel);
            }
        }
        this.f5299e = adcel;
    }

    public C2021e(int[] iArr) {
        super(3);
        this.f5299e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[12];
        AbstractC6143e.metrica(AbstractC1396e.ad, this.f5299e, iArr);
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[12];
        if (AbstractC12797e.ad(12, this.f5299e, ((C2021e) abstractC7861e).f5299e, iArr) != 0 || (iArr[11] == -1 && AbstractC12797e.subscription(12, iArr, AbstractC1396e.ad))) {
            AbstractC1396e.ad(iArr);
        }
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC12797e.isPro(this.f5299e, 12);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        C4094e.mopub(this.f5299e, iArr2);
        AbstractC1396e.purchase(iArr2, iArr);
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return AbstractC12797e.smaato(this.f5299e) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2021e) {
            return AbstractC12797e.startapp(12, this.f5299e, ((C2021e) obj).f5299e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC12797e.m3401native(this.f5299e, 12);
    }

    public final int hashCode() {
        return f5298e.hashCode() ^ AbstractC12442e.inmobi(this.f5299e, 12);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f5299e;
        if (AbstractC12797e.applovin(iArr, 12) || AbstractC12797e.isPro(iArr, 12)) {
            return this;
        }
        int[] iArr2 = new int[24];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[12];
        C4094e.mopub(iArr, iArr2);
        AbstractC1396e.purchase(iArr2, iArr3);
        C4094e.startapp(iArr3, iArr, iArr2);
        AbstractC1396e.purchase(iArr2, iArr3);
        AbstractC1396e.yandex(2, iArr3, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr3, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        C4094e.mopub(iArr4, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        C4094e.startapp(iArr4, iArr, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(5, iArr4, iArr5, iArr2);
        C4094e.startapp(iArr5, iArr4, iArr2);
        AbstractC1396e.purchase(iArr2, iArr5);
        AbstractC1396e.yandex(5, iArr5, iArr6, iArr2);
        C4094e.startapp(iArr6, iArr4, iArr2);
        AbstractC1396e.purchase(iArr2, iArr6);
        AbstractC1396e.yandex(15, iArr6, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr6, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(2, iArr4, iArr5, iArr2);
        C4094e.startapp(iArr3, iArr5, iArr2);
        AbstractC1396e.purchase(iArr2, iArr3);
        AbstractC1396e.yandex(28, iArr5, iArr5, iArr2);
        C4094e.startapp(iArr4, iArr5, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(60, iArr4, iArr5, iArr2);
        C4094e.startapp(iArr5, iArr4, iArr2);
        AbstractC1396e.purchase(iArr2, iArr5);
        AbstractC1396e.yandex(120, iArr5, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr5, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(15, iArr4, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr6, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(33, iArr4, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr3, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(64, iArr4, iArr4, iArr2);
        C4094e.startapp(iArr4, iArr, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        AbstractC1396e.yandex(30, iArr4, iArr3, iArr2);
        C4094e.mopub(iArr3, iArr2);
        AbstractC1396e.purchase(iArr2, iArr4);
        if (AbstractC12797e.startapp(12, iArr, iArr4)) {
            return new C2021e(iArr3);
        }
        return null;
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f5298e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[12];
        int[] iArr2 = new int[24];
        C4094e.startapp(this.f5299e, ((C2021e) abstractC7861e).f5299e, iArr2);
        AbstractC1396e.purchase(iArr2, iArr);
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[12];
        AbstractC1396e.startapp(this.f5299e, ((C2021e) abstractC7861e).f5299e, iArr);
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC12797e.applovin(this.f5299e, 12);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[12];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f5299e;
            if (i >= 12) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC1396e.ad;
        if (i3 != 0) {
            AbstractC12797e.m3397class(12, iArr3, iArr3, iArr2);
        } else {
            AbstractC12797e.m3397class(12, iArr3, iArr, iArr2);
        }
        return new C2021e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[12];
        if (AbstractC12797e.pro(12, this.f5299e, iArr) != 0 || (iArr[11] == -1 && AbstractC12797e.subscription(12, iArr, AbstractC1396e.ad))) {
            AbstractC1396e.ad(iArr);
        }
        return new C2021e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[12];
        AbstractC6143e.metrica(AbstractC1396e.ad, ((C2021e) abstractC7861e).f5299e, iArr);
        int[] iArr2 = new int[24];
        C4094e.startapp(iArr, this.f5299e, iArr2);
        AbstractC1396e.purchase(iArr2, iArr);
        return new C2021e(iArr);
    }
}
