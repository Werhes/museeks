package defpackage;

import java.math.BigInteger;

/* renamed from: eؘؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5356e extends AbstractC15853e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f11476e = new BigInteger(1, AbstractC7240e.metrica("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f11477e;

    public C5356e(BigInteger bigInteger) {
        super(3);
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f11476e) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            if (AbstractC0173e.purchase(iArr, AbstractC10003e.ad)) {
                long j = (iArr[0] & 4294967295L) - (r0[0] & 4294967295L);
                iArr[0] = (int) j;
                long j2 = ((iArr[1] & 4294967295L) - (r0[1] & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((iArr[2] & 4294967295L) - (r0[2] & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((iArr[3] & 4294967295L) - (4294967295L & r0[3])) + (j3 >> 32));
            }
        }
        this.f11477e = iArr;
    }

    public C5356e(int[] iArr) {
        super(3);
        this.f11477e = iArr;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        int[] iArr = new int[4];
        AbstractC6143e.metrica(AbstractC10003e.ad, this.f11477e, iArr);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[4];
        AbstractC10003e.vip(this.f11477e, ((C5356e) abstractC7861e).f11477e, iArr);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean admob() {
        return AbstractC0173e.billing(this.f11477e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        int[] iArr = new int[4];
        AbstractC10003e.adcel(this.f11477e, iArr);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean crashlytics() {
        return (this.f11477e[0] & 1) == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5356e)) {
            return false;
        }
        int[] iArr = ((C5356e) obj).f11477e;
        for (int i = 3; i >= 0; i--) {
            if (this.f11477e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = this.f11477e[i];
            if (i2 != 0) {
                AbstractC3628e.billing(i2, (3 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return f11476e.hashCode() ^ AbstractC12442e.inmobi(this.f11477e, 4);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        int[] iArr = this.f11477e;
        if (AbstractC0173e.yandex(iArr) || AbstractC0173e.billing(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        AbstractC10003e.adcel(iArr, iArr2);
        AbstractC10003e.billing(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        AbstractC10003e.mopub(2, iArr2, iArr3);
        AbstractC10003e.billing(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        AbstractC10003e.mopub(4, iArr3, iArr4);
        AbstractC10003e.billing(iArr4, iArr3, iArr4);
        AbstractC10003e.mopub(2, iArr4, iArr3);
        AbstractC10003e.billing(iArr3, iArr2, iArr3);
        AbstractC10003e.mopub(10, iArr3, iArr2);
        AbstractC10003e.billing(iArr2, iArr3, iArr2);
        AbstractC10003e.mopub(10, iArr2, iArr4);
        AbstractC10003e.billing(iArr4, iArr3, iArr4);
        AbstractC10003e.adcel(iArr4, iArr3);
        AbstractC10003e.billing(iArr3, iArr, iArr3);
        AbstractC10003e.mopub(95, iArr3, iArr3);
        AbstractC10003e.adcel(iArr3, iArr4);
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr4[i]) {
                return null;
            }
        }
        return new C5356e(iArr3);
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return f11476e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[4];
        AbstractC10003e.billing(this.f11477e, ((C5356e) abstractC7861e).f11477e, iArr);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[4];
        AbstractC10003e.advert(this.f11477e, ((C5356e) abstractC7861e).f11477e, iArr);
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final boolean subscription() {
        return AbstractC0173e.yandex(this.f11477e);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        int[] iArr;
        int[] iArr2 = new int[4];
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f11477e;
            if (i >= 4) {
                break;
            }
            i2 |= iArr[i];
            i++;
        }
        int i3 = (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
        int[] iArr3 = AbstractC10003e.ad;
        if (i3 != 0) {
            AbstractC0173e.mopub(iArr3, iArr3, iArr2);
        } else {
            AbstractC0173e.mopub(iArr3, iArr, iArr2);
        }
        return new C5356e(iArr2);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        int[] iArr = new int[4];
        if (AbstractC12797e.pro(4, this.f11477e, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && AbstractC0173e.purchase(iArr, AbstractC10003e.ad))) {
            AbstractC10003e.metrica(iArr);
        }
        return new C5356e(iArr);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        int[] iArr = new int[4];
        AbstractC6143e.metrica(AbstractC10003e.ad, ((C5356e) abstractC7861e).f11477e, iArr);
        AbstractC10003e.billing(iArr, this.f11477e, iArr);
        return new C5356e(iArr);
    }
}
