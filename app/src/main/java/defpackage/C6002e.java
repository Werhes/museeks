package defpackage;

import java.math.BigInteger;

/* renamed from: eؘِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6002e extends AbstractC11471e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long[] f12654e;

    public C6002e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f12654e = AbstractC12797e.mopub(571, bigInteger);
    }

    public C6002e(long[] jArr) {
        super(3);
        this.f12654e = jArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f12654e;
        if (AbstractC11538e.license(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        AbstractC17181e.isVip(jArr2, jArr5);
        AbstractC17181e.isVip(jArr5, jArr3);
        AbstractC17181e.isVip(jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(2, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.subscription(jArr3, jArr5, jArr3);
        AbstractC17181e.inmobi(5, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(5, jArr4, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(15, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr5);
        AbstractC17181e.inmobi(30, jArr5, jArr3);
        AbstractC17181e.inmobi(30, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(60, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(60, jArr4, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(180, jArr3, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.inmobi(180, jArr4, jArr4);
        AbstractC17181e.subscription(jArr3, jArr4, jArr3);
        AbstractC17181e.subscription(jArr3, jArr5, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[9];
        AbstractC17181e.startapp(this.f12654e, ((C6002e) abstractC7861e).f12654e, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        long[] jArr = this.f12654e;
        if (jArr[0] == 1) {
            for (int i = 1; i < 9; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        long[] jArr = this.f12654e;
        long[] jArr2 = ((C6002e) abstractC7861e).f12654e;
        long[] jArr3 = ((C6002e) abstractC7861e2).f12654e;
        long[] jArr4 = new long[18];
        long[] jArr5 = new long[18];
        AbstractC17181e.Signature(jArr, jArr5);
        AbstractC17181e.advert(jArr4, jArr5, jArr4);
        AbstractC17181e.remoteconfig(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[9];
        AbstractC17181e.tapsense(jArr4, jArr6);
        return new C6002e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        long[] jArr = new long[9];
        AbstractC17181e.isVip(this.f12654e, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: class */
    public final AbstractC7861e mo204class() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f12654e;
        long[] jArr3 = new long[18];
        jArr[0] = jArr2[0];
        jArr[1] = jArr2[1];
        jArr[2] = jArr2[2];
        jArr[3] = jArr2[3];
        jArr[4] = jArr2[4];
        jArr[5] = jArr2[5];
        jArr[6] = jArr2[6];
        jArr[7] = jArr2[7];
        jArr[8] = jArr2[8];
        for (int i = 1; i < 571; i += 2) {
            AbstractC17181e.Signature(jArr, jArr3);
            AbstractC17181e.tapsense(jArr3, jArr);
            AbstractC17181e.Signature(jArr, jArr3);
            AbstractC17181e.tapsense(jArr3, jArr);
            for (int i2 = 0; i2 < 9; i2++) {
                jArr[i2] = jArr[i2] ^ jArr2[i2];
            }
        }
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f12654e[0] & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6002e)) {
            return false;
        }
        long[] jArr = this.f12654e;
        long[] jArr2 = ((C6002e) obj).f12654e;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        long[] jArr = this.f12654e;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC3628e.admob((8 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: goto */
    public final int mo205goto() {
        long[] jArr = this.f12654e;
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }

    public final int hashCode() {
        return AbstractC12442e.isPro(this.f12654e, 9) ^ 5711052;
    }

    @Override // defpackage.AbstractC11471e
    /* renamed from: interface */
    public final boolean mo206interface() {
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f12654e;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long pro = AbstractC15792e.pro(jArr2[i]);
            i += 2;
            long pro2 = AbstractC15792e.pro(jArr2[i3]);
            jArr3[i2] = (4294967295L & pro) | (pro2 << 32);
            jArr4[i2] = (pro >>> 32) | ((-4294967296L) & pro2);
        }
        long pro3 = AbstractC15792e.pro(jArr2[i]);
        jArr3[4] = 4294967295L & pro3;
        jArr4[4] = pro3 >>> 32;
        AbstractC17181e.subscription(jArr4, AbstractC17181e.f33686e, jArr);
        AbstractC17181e.startapp(jArr, jArr3, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return 571;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e premium(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        AbstractC17181e.inmobi(i, this.f12654e, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return signatures(abstractC7861e, abstractC7861e2, abstractC7861e3);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        long[] jArr = new long[9];
        AbstractC17181e.subscription(this.f12654e, ((C6002e) abstractC7861e).f12654e, jArr);
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        long[] jArr = this.f12654e;
        long[] jArr2 = ((C6002e) abstractC7861e).f12654e;
        long[] jArr3 = ((C6002e) abstractC7861e2).f12654e;
        long[] jArr4 = ((C6002e) abstractC7861e3).f12654e;
        long[] jArr5 = new long[18];
        AbstractC17181e.remoteconfig(jArr, jArr2, jArr5);
        AbstractC17181e.remoteconfig(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        AbstractC17181e.tapsense(jArr5, jArr6);
        return new C6002e(jArr6);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC11538e.license(this.f12654e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        return this;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f12654e;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new C6002e(jArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        return remoteconfig(abstractC7861e.Signature());
    }
}
