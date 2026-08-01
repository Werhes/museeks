package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15359e extends AbstractC9288e {
    public int Signature;
    public long admob;
    public int amazon;
    public boolean loadAd;
    public byte[] remoteconfig;
    public byte[] tapsense;
    public int subscription = 0;
    public int pro = 0;
    public int signatures = 0;
    public final long advert = 100000;
    public final float startapp = 0.2f;
    public final long smaato = 2000000;
    public final int mopub = 10;
    public final short adcel = 1024;

    public C15359e() {
        byte[] bArr = AbstractC9413e.vip;
        this.remoteconfig = bArr;
        this.tapsense = bArr;
    }

    public final void Signature(int i, int i2) {
        if (i == 0) {
            return;
        }
        AbstractC2301e.billing(this.signatures >= i);
        if (i2 == 2) {
            int i3 = this.pro;
            int i4 = this.signatures;
            int i5 = i3 + i4;
            byte[] bArr = this.remoteconfig;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.tapsense, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.tapsense, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.tapsense, 0, i6);
                    System.arraycopy(this.remoteconfig, 0, this.tapsense, i6, length);
                }
            }
        } else {
            int i7 = this.pro;
            int i8 = i7 + i;
            byte[] bArr2 = this.remoteconfig;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.tapsense, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.tapsense, 0, length2);
                System.arraycopy(this.remoteconfig, 0, this.tapsense, length2, i - length2);
            }
        }
        AbstractC2301e.purchase("sizeToOutput is not aligned to frame size: %s", i % this.amazon == 0, i);
        AbstractC2301e.subscription(this.pro < this.remoteconfig.length);
        byte[] bArr3 = this.tapsense;
        AbstractC2301e.purchase("byteOutput size is not aligned to frame size %s", i % this.amazon == 0, i);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.mopub;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = Byte.MAX_VALUE;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = Byte.MIN_VALUE;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        appmetrica(i).put(bArr3, 0, i).flip();
    }

    @Override // defpackage.AbstractC9288e
    public final C10348e ad(C10348e c10348e) {
        if (c10348e.metrica == 2) {
            return c10348e.ad == -1 ? C10348e.appmetrica : c10348e;
        }
        throw new C6721e(c10348e);
    }

    @Override // defpackage.InterfaceC9018e
    public final void adcel(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.billing.hasRemaining()) {
            int i = this.Signature;
            short s = this.adcel;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.remoteconfig.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.amazon;
                        position = AbstractC5087e.m1751protected(limit3, i2, i2, i2);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.Signature = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    appmetrica(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                AbstractC2301e.subscription(this.pro < this.remoteconfig.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.amazon;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.pro;
                int i5 = this.signatures;
                int i6 = i4 + i5;
                byte[] bArr = this.remoteconfig;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.remoteconfig, i6, min);
                int i8 = this.signatures + min;
                this.signatures = i8;
                AbstractC2301e.subscription(i8 <= this.remoteconfig.length);
                boolean z2 = z && position3 < i7;
                loadAd(z2);
                if (z2) {
                    this.Signature = 0;
                    this.subscription = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    public final int amazon(int i) {
        int length = ((((int) ((this.smaato * this.vip.ad) / 1000000)) - this.subscription) * this.amazon) - (this.remoteconfig.length / 2);
        AbstractC2301e.subscription(length >= 0);
        int min = (int) Math.min((i * this.startapp) + 0.5f, length);
        int i2 = this.amazon;
        return (min / i2) * i2;
    }

    @Override // defpackage.AbstractC9288e
    public final void license() {
        this.loadAd = false;
        byte[] bArr = AbstractC9413e.vip;
        this.remoteconfig = bArr;
        this.tapsense = bArr;
    }

    public final void loadAd(boolean z) {
        int length;
        int amazon;
        int i = this.signatures;
        byte[] bArr = this.remoteconfig;
        if (i == bArr.length || z) {
            if (this.subscription == 0) {
                if (z) {
                    Signature(i, 3);
                    length = i;
                } else {
                    AbstractC2301e.subscription(i >= bArr.length / 2);
                    length = this.remoteconfig.length / 2;
                    Signature(length, 0);
                }
                amazon = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int amazon2 = amazon(length2) + (this.remoteconfig.length / 2);
                Signature(amazon2, 2);
                amazon = amazon2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                amazon = amazon(length);
                Signature(amazon, 1);
            }
            if (!(length % this.amazon == 0)) {
                throw new IllegalStateException(AbstractC12992e.adcel("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            AbstractC2301e.subscription(i >= amazon);
            this.signatures -= length;
            int i2 = this.pro + length;
            this.pro = i2;
            this.pro = i2 % this.remoteconfig.length;
            this.subscription = (amazon / this.amazon) + this.subscription;
            this.admob += (length - amazon) / r2;
        }
    }

    @Override // defpackage.AbstractC9288e
    public final void metrica() {
        if (this.signatures > 0) {
            loadAd(true);
            this.subscription = 0;
        }
    }

    @Override // defpackage.AbstractC9288e, defpackage.InterfaceC9018e
    public final boolean purchase() {
        return super.purchase() && this.loadAd;
    }

    @Override // defpackage.AbstractC9288e
    public final void vip() {
        if (purchase()) {
            int i = this.vip.vip * 2;
            this.amazon = i;
            int i2 = ((((int) ((this.advert * r0.ad) / 1000000)) / 2) / i) * i * 2;
            if (this.remoteconfig.length != i2) {
                this.remoteconfig = new byte[i2];
                this.tapsense = new byte[i2];
            }
        }
        this.Signature = 0;
        this.admob = 0L;
        this.subscription = 0;
        this.pro = 0;
        this.signatures = 0;
    }
}
