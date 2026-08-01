package defpackage;

import java.math.BigInteger;

/* renamed from: eٕۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15844e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f31265e;

    public C15844e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f31265e = AbstractC12797e.mopub(283, bigInteger);
    }

    public C15844e(long[] jArr) {
        super(3);
        this.f31265e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[5];
        for (int i = 0; i < 5; i++) {
            long[] jArr2 = this.f31265e;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                AbstractC4511e.subscription(jArr2, jArr3);
                AbstractC4511e.amazon(jArr3, jArr2, jArr3);
                AbstractC4511e.remoteconfig(2, jArr3, jArr4);
                AbstractC4511e.amazon(jArr4, jArr3, jArr4);
                AbstractC4511e.remoteconfig(4, jArr4, jArr3);
                AbstractC4511e.amazon(jArr3, jArr4, jArr3);
                AbstractC4511e.remoteconfig(8, jArr3, jArr4);
                AbstractC4511e.amazon(jArr4, jArr3, jArr4);
                AbstractC4511e.subscription(jArr4, jArr4);
                AbstractC4511e.amazon(jArr4, jArr2, jArr4);
                AbstractC4511e.remoteconfig(17, jArr4, jArr3);
                AbstractC4511e.amazon(jArr3, jArr4, jArr3);
                AbstractC4511e.subscription(jArr3, jArr3);
                AbstractC4511e.amazon(jArr3, jArr2, jArr3);
                AbstractC4511e.remoteconfig(35, jArr3, jArr4);
                AbstractC4511e.amazon(jArr4, jArr3, jArr4);
                AbstractC4511e.remoteconfig(70, jArr4, jArr3);
                AbstractC4511e.amazon(jArr3, jArr4, jArr3);
                AbstractC4511e.subscription(jArr3, jArr3);
                AbstractC4511e.amazon(jArr3, jArr2, jArr3);
                AbstractC4511e.remoteconfig(141, jArr3, jArr4);
                AbstractC4511e.amazon(jArr4, jArr3, jArr4);
                AbstractC4511e.subscription(jArr4, jArr);
                return new C15844e(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C15844e) abstractC7861e).f31265e;
        long[] jArr2 = this.f31265e;
        return new C15844e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f31265e;
        if (jArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C15844e) abstractC7861e).f31265e;
        long[] jArr2 = ((C15844e) abstractC7861e2).f31265e;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        AbstractC4511e.billing(this.f31265e, jArr4);
        AbstractC4511e.ad(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        AbstractC4511e.appmetrica(jArr, jArr2, jArr5);
        AbstractC4511e.ad(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        AbstractC4511e.admob(jArr3, jArr6);
        return new C15844e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[5];
        AbstractC4511e.subscription(this.f31265e, jArr);
        return new C15844e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f31265e;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4]};
        for (int i = 1; i < 283; i += 2) {
            AbstractC4511e.billing(jArr3, jArr);
            AbstractC4511e.admob(jArr, jArr3);
            AbstractC4511e.billing(jArr3, jArr);
            AbstractC4511e.admob(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
        }
        return new C15844e(jArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f31265e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15844e)) {
            return false;
        }
        long[] jArr = ((C15844e) obj).f31265e;
        for (int i = 4; i >= 0; i--) {
            if (this.f31265e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = this.f31265e[i];
            if (j != 0) {
                AbstractC3628e.admob((4 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        long[] jArr = this.f31265e;
        return ((int) ((jArr[4] >>> 15) ^ jArr[0])) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f31265e, 5) ^ 2831275;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f31265e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long pro3 = AbstractC15792e.pro(jArr[2]);
        long pro4 = AbstractC15792e.pro(jArr[3]);
        long j2 = (pro3 & 4294967295L) | (pro4 << 32);
        long pro5 = AbstractC15792e.pro(jArr[4]);
        AbstractC4511e.amazon(new long[]{(pro >>> 32) | (pro2 & (-4294967296L)), (pro3 >>> 32) | (pro4 & (-4294967296L)), pro5 >>> 32}, AbstractC4511e.ad, r1);
        long[] jArr2 = {jArr2[0] ^ j, jArr2[1] ^ j2, jArr2[2] ^ (4294967295L & pro5)};
        return new C15844e(jArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 283;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        AbstractC4511e.remoteconfig(i, this.f31265e, jArr);
        return new C15844e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[5];
        AbstractC4511e.amazon(this.f31265e, ((C15844e) abstractC7861e).f31265e, jArr);
        return new C15844e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C15844e) abstractC7861e).f31265e;
        long[] jArr2 = ((C15844e) abstractC7861e2).f31265e;
        long[] jArr3 = ((C15844e) abstractC7861e3).f31265e;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        AbstractC4511e.appmetrica(this.f31265e, jArr, jArr5);
        AbstractC4511e.ad(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        AbstractC4511e.appmetrica(jArr2, jArr3, jArr6);
        AbstractC4511e.ad(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        AbstractC4511e.admob(jArr4, jArr7);
        return new C15844e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        for (int i = 0; i < 5; i++) {
            if (this.f31265e[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f31265e;
        return new C15844e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
