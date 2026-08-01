package defpackage;

import java.math.BigInteger;

/* renamed from: eُ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11291e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f22683e;

    public C11291e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f22683e = AbstractC12797e.mopub(163, bigInteger);
    }

    public C11291e(long[] jArr) {
        super(3);
        this.f22683e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f22683e;
        if (AbstractC16091e.pro(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[6];
        AbstractC15792e.license(3, jArr2, jArr5);
        AbstractC6100e.smaato(jArr5, jArr3);
        AbstractC6100e.loadAd(1, jArr3, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(1, jArr4, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(3, jArr3, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(3, jArr4, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(9, jArr3, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(9, jArr4, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(27, jArr3, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(27, jArr4, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr3);
        AbstractC6100e.loadAd(81, jArr3, jArr4);
        AbstractC6100e.adcel(jArr3, jArr4, jArr);
        return new C11291e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C11291e) abstractC7861e).f22683e;
        long[] jArr2 = this.f22683e;
        return new C11291e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f22683e;
        if (jArr[0] == 1) {
            for (int i = 1; i < 3; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C11291e) abstractC7861e).f22683e;
        long[] jArr2 = ((C11291e) abstractC7861e2).f22683e;
        long[] jArr3 = new long[6];
        long[] jArr4 = new long[6];
        AbstractC15792e.license(3, this.f22683e, jArr4);
        AbstractC6100e.ad(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC6100e.billing(jArr, jArr2, jArr5);
        AbstractC6100e.ad(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        AbstractC6100e.smaato(jArr3, jArr6);
        return new C11291e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        AbstractC15792e.license(3, this.f22683e, jArr2);
        AbstractC6100e.smaato(jArr2, jArr);
        return new C11291e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[6];
        long[] jArr2 = this.f22683e;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2]};
        for (int i = 1; i < 163; i += 2) {
            AbstractC15792e.license(3, jArr3, jArr);
            AbstractC6100e.smaato(jArr, jArr3);
            AbstractC15792e.license(3, jArr3, jArr);
            AbstractC6100e.smaato(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
        }
        return new C11291e(jArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f22683e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11291e)) {
            return false;
        }
        long[] jArr = ((C11291e) obj).f22683e;
        for (int i = 2; i >= 0; i--) {
            if (this.f22683e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC16091e.firebase(this.f22683e);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        long[] jArr = this.f22683e;
        return ((int) ((jArr[2] >>> 29) ^ jArr[0])) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f22683e, 3) ^ 163763;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f22683e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long pro3 = AbstractC15792e.pro(jArr[2]);
        AbstractC6100e.adcel(new long[]{(pro >>> 32) | (pro2 & (-4294967296L)), pro3 >>> 32}, AbstractC6100e.ad, r1);
        long[] jArr2 = {jArr2[0] ^ j, jArr2[1] ^ (pro3 & 4294967295L)};
        return new C11291e(jArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 163;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        AbstractC6100e.loadAd(i, this.f22683e, jArr);
        return new C11291e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[3];
        AbstractC6100e.adcel(this.f22683e, ((C11291e) abstractC7861e).f22683e, jArr);
        return new C11291e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C11291e) abstractC7861e).f22683e;
        long[] jArr2 = ((C11291e) abstractC7861e2).f22683e;
        long[] jArr3 = ((C11291e) abstractC7861e3).f22683e;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[8];
        AbstractC6100e.billing(this.f22683e, jArr, jArr5);
        AbstractC6100e.ad(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC6100e.billing(jArr2, jArr3, jArr6);
        AbstractC6100e.ad(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        AbstractC6100e.smaato(jArr4, jArr7);
        return new C11291e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC16091e.pro(this.f22683e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f22683e;
        return new C11291e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
