package defpackage;

import java.math.BigInteger;

/* renamed from: eٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18203e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long[] f35630e;

    public C18203e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f35630e = AbstractC12797e.mopub(409, bigInteger);
    }

    public C18203e(long[] jArr) {
        super(3);
        this.f35630e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[7];
        for (int i = 0; i < 7; i++) {
            long[] jArr2 = this.f35630e;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                AbstractC7023e.startapp(jArr2, jArr6);
                AbstractC7023e.mopub(jArr6, jArr3);
                AbstractC7023e.advert(1, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(1, jArr4, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(3, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(6, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(12, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr5);
                AbstractC7023e.advert(24, jArr5, jArr3);
                AbstractC7023e.advert(24, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(48, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(96, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.advert(192, jArr3, jArr4);
                AbstractC7023e.adcel(jArr3, jArr4, jArr3);
                AbstractC7023e.adcel(jArr3, jArr5, jArr);
                return new C18203e(jArr);
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = ((C18203e) abstractC7861e).f35630e;
        long[] jArr2 = this.f35630e;
        return new C18203e(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f35630e;
        if (jArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = ((C18203e) abstractC7861e).f35630e;
        long[] jArr2 = ((C18203e) abstractC7861e2).f35630e;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        AbstractC7023e.startapp(this.f35630e, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        long[] jArr5 = new long[14];
        AbstractC7023e.billing(jArr, jArr2, jArr5);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr5[i2];
        }
        long[] jArr6 = new long[7];
        AbstractC7023e.mopub(jArr3, jArr6);
        return new C18203e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        AbstractC7023e.startapp(this.f35630e, jArr2);
        AbstractC7023e.mopub(jArr2, jArr);
        return new C18203e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[13];
        long[] jArr2 = this.f35630e;
        long[] jArr3 = {jArr2[0], jArr2[1], jArr2[2], jArr2[3], jArr2[4], jArr2[5], jArr2[6]};
        for (int i = 1; i < 409; i += 2) {
            AbstractC7023e.startapp(jArr3, jArr);
            AbstractC7023e.mopub(jArr, jArr3);
            AbstractC7023e.startapp(jArr3, jArr);
            AbstractC7023e.mopub(jArr, jArr3);
            jArr3[0] = jArr3[0] ^ jArr2[0];
            jArr3[1] = jArr3[1] ^ jArr2[1];
            jArr3[2] = jArr3[2] ^ jArr2[2];
            jArr3[3] = jArr3[3] ^ jArr2[3];
            jArr3[4] = jArr3[4] ^ jArr2[4];
            jArr3[5] = jArr3[5] ^ jArr2[5];
            jArr3[6] = jArr3[6] ^ jArr2[6];
        }
        return new C18203e(jArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f35630e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18203e)) {
            return false;
        }
        long[] jArr = ((C18203e) obj).f35630e;
        for (int i = 6; i >= 0; i--) {
            if (this.f35630e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = this.f35630e[i];
            if (j != 0) {
                AbstractC3628e.admob((6 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        return ((int) this.f35630e[0]) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f35630e, 7) ^ 4090087;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = this.f35630e;
        long pro = AbstractC15792e.pro(jArr[0]);
        long pro2 = AbstractC15792e.pro(jArr[1]);
        long j = (pro & 4294967295L) | (pro2 << 32);
        long j2 = (pro >>> 32) | (pro2 & (-4294967296L));
        long pro3 = AbstractC15792e.pro(jArr[2]);
        long pro4 = AbstractC15792e.pro(jArr[3]);
        long j3 = (pro3 & 4294967295L) | (pro4 << 32);
        long j4 = (pro3 >>> 32) | (pro4 & (-4294967296L));
        long pro5 = AbstractC15792e.pro(jArr[4]);
        long pro6 = AbstractC15792e.pro(jArr[5]);
        long j5 = (pro5 >>> 32) | (pro6 & (-4294967296L));
        long pro7 = AbstractC15792e.pro(jArr[6]);
        long j6 = pro7 >>> 32;
        return new C18203e(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((pro5 & 4294967295L) | (pro6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((pro7 & 4294967295L) ^ (j6 << 44)) ^ (j5 >>> 20)) ^ (j2 << 13), ((pro7 >>> 52) ^ (j4 << 13)) ^ (j2 >>> 51), (j5 << 13) ^ (j4 >>> 51), (j6 << 13) ^ (j5 >>> 51)});
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 409;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        AbstractC7023e.advert(i, this.f35630e, jArr);
        return new C18203e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[7];
        AbstractC7023e.adcel(this.f35630e, ((C18203e) abstractC7861e).f35630e, jArr);
        return new C18203e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = ((C18203e) abstractC7861e).f35630e;
        long[] jArr2 = ((C18203e) abstractC7861e2).f35630e;
        long[] jArr3 = ((C18203e) abstractC7861e3).f35630e;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        AbstractC7023e.billing(this.f35630e, jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        AbstractC7023e.billing(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        AbstractC7023e.mopub(jArr4, jArr7);
        return new C18203e(jArr7);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        for (int i = 0; i < 7; i++) {
            if (this.f35630e[i] != 0) {
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
        long[] jArr = this.f35630e;
        return new C18203e(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
