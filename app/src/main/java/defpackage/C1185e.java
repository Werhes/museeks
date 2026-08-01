package defpackage;

import java.math.BigInteger;

/* renamed from: eٜؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1185e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f3784e;

    public C1185e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f3784e = AbstractC12797e.mopub(239, bigInteger);
    }

    public C1185e(long[] jArr) {
        super(3);
        this.f3784e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f3784e;
        if (AbstractC10077e.inmobi(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC3415e.yandex(jArr2, jArr3);
        AbstractC3415e.purchase(jArr3, jArr2, jArr3);
        AbstractC3415e.yandex(jArr3, jArr3);
        AbstractC3415e.purchase(jArr3, jArr2, jArr3);
        AbstractC3415e.adcel(3, jArr3, jArr4);
        AbstractC3415e.purchase(jArr4, jArr3, jArr4);
        AbstractC3415e.yandex(jArr4, jArr4);
        AbstractC3415e.purchase(jArr4, jArr2, jArr4);
        AbstractC3415e.adcel(7, jArr4, jArr3);
        AbstractC3415e.purchase(jArr3, jArr4, jArr3);
        AbstractC3415e.adcel(14, jArr3, jArr4);
        AbstractC3415e.purchase(jArr4, jArr3, jArr4);
        AbstractC3415e.yandex(jArr4, jArr4);
        AbstractC3415e.purchase(jArr4, jArr2, jArr4);
        AbstractC3415e.adcel(29, jArr4, jArr3);
        AbstractC3415e.purchase(jArr3, jArr4, jArr3);
        AbstractC3415e.yandex(jArr3, jArr3);
        AbstractC3415e.purchase(jArr3, jArr2, jArr3);
        AbstractC3415e.adcel(59, jArr3, jArr4);
        AbstractC3415e.purchase(jArr4, jArr3, jArr4);
        AbstractC3415e.yandex(jArr4, jArr4);
        AbstractC3415e.purchase(jArr4, jArr2, jArr4);
        AbstractC3415e.adcel(119, jArr4, jArr3);
        AbstractC3415e.purchase(jArr3, jArr4, jArr3);
        AbstractC3415e.yandex(jArr3, jArr);
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C1185e) abstractC7861e).f3784e;
        long[] jArr2 = this.f3784e;
        return new C1185e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.tapsense(this.f3784e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C1185e) abstractC7861e).f3784e;
        long[] jArr2 = ((C1185e) abstractC7861e2).f3784e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC15792e.license(4, this.f3784e, jArr4);
        AbstractC3415e.ad(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC3415e.license(jArr, jArr2, jArr5);
        AbstractC3415e.ad(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC3415e.billing(jArr3, jArr6);
        return new C1185e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[4];
        AbstractC3415e.yandex(this.f3784e, jArr);
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f3784e;
        AbstractC10077e.yandex(jArr3, jArr);
        for (int i = 1; i < 239; i += 2) {
            AbstractC15792e.license(4, jArr, jArr2);
            AbstractC3415e.billing(jArr2, jArr);
            AbstractC15792e.license(4, jArr, jArr2);
            AbstractC3415e.billing(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f3784e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1185e) {
            return AbstractC10077e.mopub(this.f3784e, ((C1185e) obj).f3784e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2756goto(this.f3784e);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        long[] jArr = this.f3784e;
        return 1 & ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34)));
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f3784e, 4) ^ 23900158;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        char c = 4;
        long[] jArr = new long[4];
        long[] jArr2 = this.f3784e;
        boolean z = false;
        long pro = AbstractC15792e.pro(jArr2[0]);
        long pro2 = AbstractC15792e.pro(jArr2[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long j2 = (pro >>> 32) | (pro2 & (-4294967296L));
        long pro3 = AbstractC15792e.pro(jArr2[2]);
        long pro4 = AbstractC15792e.pro(jArr2[3]);
        long j3 = (pro3 & 4294967295L) | (pro4 << 32);
        long j4 = (pro3 >>> 32) | (pro4 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            char c2 = c;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            boolean z2 = z;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
            c = c2;
            z = z2;
        }
        boolean z3 = z;
        AbstractC3415e.billing(jArr3, jArr);
        jArr[z3 ? 1 : 0] = jArr[z3 ? 1 : 0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 239;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC3415e.adcel(i, this.f3784e, jArr);
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[4];
        AbstractC3415e.purchase(this.f3784e, ((C1185e) abstractC7861e).f3784e, jArr);
        return new C1185e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C1185e) abstractC7861e).f3784e;
        long[] jArr2 = ((C1185e) abstractC7861e2).f3784e;
        long[] jArr3 = ((C1185e) abstractC7861e3).f3784e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC3415e.license(this.f3784e, jArr, jArr5);
        AbstractC3415e.ad(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC3415e.license(jArr2, jArr3, jArr6);
        AbstractC3415e.ad(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC3415e.billing(jArr4, jArr7);
        return new C1185e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.inmobi(this.f3784e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f3784e;
        return new C1185e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
