package defpackage;

import java.math.BigInteger;

/* renamed from: eؖۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4489e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f9708e;

    public C4489e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f9708e = AbstractC12797e.mopub(113, bigInteger);
    }

    public C4489e(long[] jArr) {
        super(3);
        this.f9708e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            long[] jArr2 = this.f9708e;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                AbstractC15792e.license(2, jArr2, jArr5);
                AbstractC1599e.startapp(jArr5, jArr3);
                AbstractC1599e.billing(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                AbstractC15792e.license(2, jArr3, jArr6);
                AbstractC1599e.startapp(jArr6, jArr3);
                AbstractC1599e.billing(jArr3, jArr2, jArr3);
                AbstractC1599e.adcel(3, jArr3, jArr4);
                AbstractC1599e.billing(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                AbstractC15792e.license(2, jArr4, jArr7);
                AbstractC1599e.startapp(jArr7, jArr4);
                AbstractC1599e.billing(jArr4, jArr2, jArr4);
                AbstractC1599e.adcel(7, jArr4, jArr3);
                AbstractC1599e.billing(jArr3, jArr4, jArr3);
                AbstractC1599e.adcel(14, jArr3, jArr4);
                AbstractC1599e.billing(jArr4, jArr3, jArr4);
                AbstractC1599e.adcel(28, jArr4, jArr3);
                AbstractC1599e.billing(jArr3, jArr4, jArr3);
                AbstractC1599e.adcel(56, jArr3, jArr4);
                AbstractC1599e.billing(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                AbstractC15792e.license(2, jArr4, jArr8);
                AbstractC1599e.startapp(jArr8, jArr);
                return new C4489e(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C4489e) abstractC7861e).f9708e;
        long[] jArr2 = this.f9708e;
        return new C4489e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f9708e;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C4489e) abstractC7861e).f9708e;
        long[] jArr2 = ((C4489e) abstractC7861e2).f9708e;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        AbstractC15792e.license(2, this.f9708e, jArr4);
        AbstractC1599e.vip(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        AbstractC1599e.metrica(jArr, jArr2, jArr5);
        AbstractC1599e.vip(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        AbstractC1599e.startapp(jArr3, jArr6);
        return new C4489e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        AbstractC15792e.license(2, this.f9708e, jArr2);
        AbstractC1599e.startapp(jArr2, jArr);
        return new C4489e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f9708e;
        long[] jArr3 = {jArr2[0], jArr2[1]};
        for (int i = 1; i < 113; i += 2) {
            AbstractC15792e.license(2, jArr3, jArr);
            AbstractC1599e.startapp(jArr, jArr3);
            AbstractC15792e.license(2, jArr3, jArr);
            AbstractC1599e.startapp(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
        }
        return new C4489e(jArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f9708e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4489e)) {
            return false;
        }
        long[] jArr = ((C4489e) obj).f9708e;
        for (int i = 1; i >= 0; i--) {
            if (this.f9708e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = this.f9708e[i];
            if (j != 0) {
                AbstractC3628e.admob((1 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        return ((int) this.f9708e[0]) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f9708e, 2) ^ 113009;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f9708e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (4294967295L & pro) | (pro2 << 32);
        long j2 = (pro >>> 32) | (pro2 & (-4294967296L));
        return new C4489e(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 113;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        AbstractC1599e.adcel(i, this.f9708e, jArr);
        return new C4489e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[2];
        AbstractC1599e.billing(this.f9708e, ((C4489e) abstractC7861e).f9708e, jArr);
        return new C4489e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C4489e) abstractC7861e).f9708e;
        long[] jArr2 = ((C4489e) abstractC7861e2).f9708e;
        long[] jArr3 = ((C4489e) abstractC7861e3).f9708e;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        AbstractC1599e.metrica(this.f9708e, jArr, jArr5);
        AbstractC1599e.vip(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        AbstractC1599e.metrica(jArr2, jArr3, jArr6);
        AbstractC1599e.vip(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        AbstractC1599e.startapp(jArr4, jArr7);
        return new C4489e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        for (int i = 0; i < 2; i++) {
            if (this.f9708e[i] != 0) {
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
        long[] jArr = this.f9708e;
        return new C4489e(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
