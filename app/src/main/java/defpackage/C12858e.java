package defpackage;

import java.math.BigInteger;

/* renamed from: eّٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12858e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f25686e;

    public C12858e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f25686e = AbstractC12797e.mopub(233, bigInteger);
    }

    public C12858e(long[] jArr) {
        super(3);
        this.f25686e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f25686e;
        if (AbstractC10077e.inmobi(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC4107e.adcel(jArr2, jArr3);
        AbstractC4107e.yandex(jArr3, jArr2, jArr3);
        AbstractC4107e.adcel(jArr3, jArr3);
        AbstractC4107e.yandex(jArr3, jArr2, jArr3);
        AbstractC4107e.mopub(3, jArr3, jArr4);
        AbstractC4107e.yandex(jArr4, jArr3, jArr4);
        AbstractC4107e.adcel(jArr4, jArr4);
        AbstractC4107e.yandex(jArr4, jArr2, jArr4);
        AbstractC4107e.mopub(7, jArr4, jArr3);
        AbstractC4107e.yandex(jArr3, jArr4, jArr3);
        AbstractC4107e.mopub(14, jArr3, jArr4);
        AbstractC4107e.yandex(jArr4, jArr3, jArr4);
        AbstractC4107e.adcel(jArr4, jArr4);
        AbstractC4107e.yandex(jArr4, jArr2, jArr4);
        AbstractC4107e.mopub(29, jArr4, jArr3);
        AbstractC4107e.yandex(jArr3, jArr4, jArr3);
        AbstractC4107e.mopub(58, jArr3, jArr4);
        AbstractC4107e.yandex(jArr4, jArr3, jArr4);
        AbstractC4107e.mopub(116, jArr4, jArr3);
        AbstractC4107e.yandex(jArr3, jArr4, jArr3);
        AbstractC4107e.adcel(jArr3, jArr);
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C12858e) abstractC7861e).f25686e;
        long[] jArr2 = this.f25686e;
        return new C12858e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC10077e.tapsense(this.f25686e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C12858e) abstractC7861e).f25686e;
        long[] jArr2 = ((C12858e) abstractC7861e2).f25686e;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        AbstractC15792e.license(4, this.f25686e, jArr4);
        AbstractC4107e.ad(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC4107e.purchase(jArr, jArr2, jArr5);
        AbstractC4107e.ad(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        AbstractC4107e.startapp(jArr3, jArr6);
        return new C12858e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[4];
        AbstractC4107e.adcel(this.f25686e, jArr);
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        long[] jArr3 = this.f25686e;
        AbstractC10077e.yandex(jArr3, jArr);
        for (int i = 1; i < 233; i += 2) {
            AbstractC15792e.license(4, jArr, jArr2);
            AbstractC4107e.startapp(jArr2, jArr);
            AbstractC15792e.license(4, jArr, jArr2);
            AbstractC4107e.startapp(jArr2, jArr);
            jArr[0] = jArr[0] ^ jArr3[0];
            jArr[1] = jArr[1] ^ jArr3[1];
            jArr[2] = jArr[2] ^ jArr3[2];
            jArr[3] = jArr[3] ^ jArr3[3];
        }
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f25686e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12858e) {
            return AbstractC10077e.mopub(this.f25686e, ((C12858e) obj).f25686e);
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC10077e.m2756goto(this.f25686e);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        long[] jArr = this.f25686e;
        return ((int) ((jArr[2] >>> 31) ^ jArr[0])) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f25686e, 4) ^ 2330074;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f25686e;
        long pro = AbstractC15792e.pro(jArr2[0]);
        long pro2 = AbstractC15792e.pro(jArr2[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long j2 = (pro >>> 32) | (pro2 & (-4294967296L));
        long pro3 = AbstractC15792e.pro(jArr2[2]);
        long pro4 = AbstractC15792e.pro(jArr2[3]);
        long j3 = (4294967295L & pro3) | (pro4 << 32);
        long j4 = (pro3 >>> 32) | (pro4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i = 0;
        for (int i2 = 3; i < i2; i2 = 3) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i7));
            int i8 = i4 + 2;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i5) | (j6 >>> i7));
            int i9 = i4 + 3;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i7);
            i++;
        }
        AbstractC4107e.startapp(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 233;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        AbstractC4107e.mopub(i, this.f25686e, jArr);
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[4];
        AbstractC4107e.yandex(this.f25686e, ((C12858e) abstractC7861e).f25686e, jArr);
        return new C12858e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C12858e) abstractC7861e).f25686e;
        long[] jArr2 = ((C12858e) abstractC7861e2).f25686e;
        long[] jArr3 = ((C12858e) abstractC7861e3).f25686e;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        AbstractC4107e.purchase(this.f25686e, jArr, jArr5);
        AbstractC4107e.ad(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC4107e.purchase(jArr2, jArr3, jArr6);
        AbstractC4107e.ad(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        AbstractC4107e.startapp(jArr4, jArr7);
        return new C12858e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC10077e.inmobi(this.f25686e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f25686e;
        return new C12858e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
