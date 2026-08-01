package defpackage;

import java.math.BigInteger;

/* renamed from: eؙؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6139e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f12909e;

    public C6139e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f12909e = AbstractC12797e.mopub(193, bigInteger);
    }

    public C6139e(long[] jArr) {
        super(3);
        this.f12909e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f12909e;
        if (AbstractC10077e.inmobi(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        AbstractC2467e.yandex(jArr2, jArr5);
        AbstractC2467e.admob(jArr5, jArr3);
        AbstractC2467e.subscription(1, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(1, jArr4, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(3, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(6, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(12, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(24, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(48, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr3);
        AbstractC2467e.subscription(96, jArr3, jArr4);
        AbstractC2467e.adcel(jArr3, jArr4, jArr);
        return new C6139e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C6139e) abstractC7861e).f12909e;
        long[] jArr2 = this.f12909e;
        return new C6139e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.tapsense(this.f12909e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C6139e) abstractC7861e).f12909e;
        long[] jArr2 = ((C6139e) abstractC7861e2).f12909e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC2467e.yandex(this.f12909e, jArr4);
        AbstractC2467e.vip(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC2467e.purchase(jArr, jArr2, jArr5);
        AbstractC2467e.vip(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC2467e.admob(jArr3, jArr6);
        return new C6139e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        AbstractC2467e.yandex(this.f12909e, jArr2);
        AbstractC2467e.admob(jArr2, jArr);
        return new C6139e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f12909e;
        AbstractC10077e.yandex(jArr3, jArr);
        for (int i = 1; i < 193; i += 2) {
            AbstractC2467e.yandex(jArr, jArr2);
            AbstractC2467e.admob(jArr2, jArr);
            AbstractC2467e.yandex(jArr, jArr2);
            AbstractC2467e.admob(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C6139e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f12909e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6139e) {
            return AbstractC10077e.mopub(this.f12909e, ((C6139e) obj).f12909e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2756goto(this.f12909e);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        return ((int) this.f12909e[0]) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f12909e, 4) ^ 1930015;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f12909e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long j2 = (pro >>> 32) | (pro2 & (-4294967296L));
        long pro3 = AbstractC15792e.pro(jArr[2]);
        long j3 = pro3 >>> 32;
        return new C6139e(new long[]{j ^ (j2 << 8), ((((4294967295L & pro3) ^ (jArr[3] << 32)) ^ (j3 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ (j3 << 33), pro3 >>> 63});
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 193;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC2467e.subscription(i, this.f12909e, jArr);
        return new C6139e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[4];
        AbstractC2467e.adcel(this.f12909e, ((C6139e) abstractC7861e).f12909e, jArr);
        return new C6139e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C6139e) abstractC7861e).f12909e;
        long[] jArr2 = ((C6139e) abstractC7861e2).f12909e;
        long[] jArr3 = ((C6139e) abstractC7861e3).f12909e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC2467e.purchase(this.f12909e, jArr, jArr5);
        AbstractC2467e.vip(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC2467e.purchase(jArr2, jArr3, jArr6);
        AbstractC2467e.vip(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC2467e.admob(jArr4, jArr7);
        return new C6139e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.inmobi(this.f12909e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f12909e;
        return new C6139e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
