package defpackage;

import java.math.BigInteger;

/* renamed from: eؑؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0037e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f1173e;

    public C0037e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f1173e = AbstractC12797e.mopub(131, bigInteger);
    }

    public C0037e(long[] jArr) {
        super(3);
        this.f1173e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f1173e;
        if (AbstractC16091e.pro(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[5];
        AbstractC7902e.purchase(jArr2, jArr5);
        AbstractC7902e.startapp(jArr5, jArr3);
        AbstractC7902e.billing(jArr3, jArr2, jArr3);
        AbstractC7902e.adcel(2, jArr3, jArr4);
        AbstractC7902e.billing(jArr4, jArr3, jArr4);
        AbstractC7902e.adcel(4, jArr4, jArr3);
        AbstractC7902e.billing(jArr3, jArr4, jArr3);
        AbstractC7902e.adcel(8, jArr3, jArr4);
        AbstractC7902e.billing(jArr4, jArr3, jArr4);
        AbstractC7902e.adcel(16, jArr4, jArr3);
        AbstractC7902e.billing(jArr3, jArr4, jArr3);
        AbstractC7902e.adcel(32, jArr3, jArr4);
        AbstractC7902e.billing(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        AbstractC7902e.purchase(jArr4, jArr6);
        AbstractC7902e.startapp(jArr6, jArr4);
        AbstractC7902e.billing(jArr4, jArr2, jArr4);
        AbstractC7902e.adcel(65, jArr4, jArr3);
        AbstractC7902e.billing(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        AbstractC7902e.purchase(jArr3, jArr7);
        AbstractC7902e.startapp(jArr7, jArr);
        return new C0037e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C0037e) abstractC7861e).f1173e;
        long[] jArr2 = this.f1173e;
        return new C0037e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f1173e;
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
        long[] jArr = ((C0037e) abstractC7861e).f1173e;
        long[] jArr2 = ((C0037e) abstractC7861e2).f1173e;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        AbstractC7902e.purchase(this.f1173e, jArr4);
        AbstractC7902e.vip(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC7902e.license(jArr, jArr2, jArr5);
        AbstractC7902e.vip(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        AbstractC7902e.startapp(jArr3, jArr6);
        return new C0037e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        AbstractC7902e.purchase(this.f1173e, jArr2);
        AbstractC7902e.startapp(jArr2, jArr);
        return new C0037e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class, reason: not valid java name */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f1173e;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2]};
        for (int i = 1; i < 131; i += 2) {
            AbstractC7902e.purchase(jArr3, jArr);
            AbstractC7902e.startapp(jArr, jArr3);
            AbstractC7902e.purchase(jArr3, jArr);
            AbstractC7902e.startapp(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
        }
        return new C0037e(jArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f1173e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0037e)) {
            return false;
        }
        long[] jArr = ((C0037e) obj).f1173e;
        for (int i = 2; i >= 0; i--) {
            if (this.f1173e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return AbstractC16091e.firebase(this.f1173e);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto, reason: not valid java name */
    public final int mo205goto() {
        long[] jArr = this.f1173e;
        return 1 & ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1)));
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f1173e, 3) ^ 131832;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface, reason: not valid java name */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f1173e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long pro3 = AbstractC15792e.pro(jArr[2]);
        AbstractC7902e.billing(new long[]{(pro >>> 32) | (pro2 & (-4294967296L)), pro3 >>> 32}, AbstractC7902e.ad, r1);
        long[] jArr2 = {jArr2[0] ^ j, jArr2[1] ^ (pro3 & 4294967295L)};
        return new C0037e(jArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 131;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        AbstractC7902e.adcel(i, this.f1173e, jArr);
        return new C0037e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[3];
        AbstractC7902e.billing(this.f1173e, ((C0037e) abstractC7861e).f1173e, jArr);
        return new C0037e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C0037e) abstractC7861e).f1173e;
        long[] jArr2 = ((C0037e) abstractC7861e2).f1173e;
        long[] jArr3 = ((C0037e) abstractC7861e3).f1173e;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[8];
        AbstractC7902e.license(this.f1173e, jArr, jArr5);
        AbstractC7902e.vip(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC7902e.license(jArr2, jArr3, jArr6);
        AbstractC7902e.vip(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        AbstractC7902e.startapp(jArr4, jArr7);
        return new C0037e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC16091e.pro(this.f1173e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = this.f1173e;
        return new C0037e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
