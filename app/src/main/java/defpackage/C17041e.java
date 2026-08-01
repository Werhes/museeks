package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17041e {
    public byte[] ad;
    public int vip;

    public C17041e() {
        this.ad = new byte[32];
    }

    public C17041e(int i, byte[] bArr) {
        this.vip = i;
        this.ad = bArr;
    }

    public C17041e(byte[] bArr) {
        this.vip = 0;
        this.ad = bArr;
    }

    public static void startapp(C17041e c17041e, byte[] bArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = bArr.length;
        }
        c17041e.getClass();
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            return;
        }
        c17041e.ad(i);
        AbstractC1660e.smaato(bArr, c17041e.vip, 0, c17041e.ad, i);
        c17041e.vip += i;
    }

    public void ad(int i) {
        int i2 = this.vip + i;
        if (i2 <= this.ad.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC1660e.admob(this.ad, 0, 0, bArr, 0, 14);
        this.ad = bArr;
    }

    public String appmetrica() {
        return AbstractC1433e.ad(license());
    }

    public void billing() {
        int purchase = purchase();
        int i = this.vip;
        if (i > this.ad.length - purchase) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.vip = i + purchase;
    }

    public byte[] license() {
        int purchase = purchase();
        if (purchase == 0) {
            return new byte[0];
        }
        int i = this.vip;
        byte[] bArr = this.ad;
        if (i > bArr.length - purchase) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i2 = purchase + i;
        this.vip = i2;
        return AbstractC12442e.admob(i, i2, bArr);
    }

    public BigInteger metrica() {
        int purchase = purchase();
        int i = this.vip;
        int i2 = i + purchase;
        byte[] bArr = this.ad;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i3 = purchase + i;
        this.vip = i3;
        return new BigInteger(1, AbstractC12442e.admob(i, i3, bArr));
    }

    public int purchase() {
        int i = this.vip;
        byte[] bArr = this.ad;
        if (i > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i2 = i + 1;
        this.vip = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.vip = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.vip = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.vip = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int vip() {
        int i = this.vip;
        byte[] bArr = this.ad;
        if (i >= bArr.length) {
            return -1;
        }
        this.vip = i + 1;
        return bArr[i] & 255;
    }

    public void yandex(int i) {
        ad(1);
        byte[] bArr = this.ad;
        int i2 = this.vip;
        this.vip = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
