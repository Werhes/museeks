package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11184e {
    public final InterfaceC16970e ad;
    public C18524e appmetrica;
    public long billing;
    public C18524e license;
    public final C1292e metrica;
    public C18524e purchase;
    public final int vip;

    public C11184e(InterfaceC16970e interfaceC16970e) {
        this.ad = interfaceC16970e;
        int pro = interfaceC16970e.pro();
        this.vip = pro;
        this.metrica = new C1292e(32);
        C18524e c18524e = new C18524e(0L, pro);
        this.license = c18524e;
        this.appmetrica = c18524e;
        this.purchase = c18524e;
    }

    public static C18524e appmetrica(C18524e c18524e, C7507e c7507e, C15475e c15475e, C1292e c1292e) {
        if (c7507e.metrica(1073741824)) {
            long j = c15475e.vip;
            int i = 1;
            c1292e.m564extends(1);
            C18524e license = license(c18524e, j, c1292e.ad, 1);
            long j2 = j + 1;
            byte b = c1292e.ad[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            C0579e c0579e = c7507e.f15299e;
            byte[] bArr = c0579e.ad;
            if (bArr == null) {
                c0579e.ad = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c18524e = license(license, j2, c0579e.ad, i2);
            long j3 = j2 + i2;
            if (z) {
                c1292e.m564extends(2);
                c18524e = license(c18524e, j3, c1292e.ad, 2);
                j3 += 2;
                i = c1292e.m565goto();
            }
            int[] iArr = c0579e.license;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c0579e.appmetrica;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                c1292e.m564extends(i3);
                c18524e = license(c18524e, j3, c1292e.ad, i3);
                j3 += i3;
                c1292e.m571try(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = c1292e.m565goto();
                    iArr2[i4] = c1292e.firebase();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c15475e.ad - ((int) (j3 - c15475e.vip));
            }
            C17737e c17737e = (C17737e) c15475e.metrica;
            String str = AbstractC9413e.ad;
            byte[] bArr2 = c17737e.vip;
            byte[] bArr3 = c0579e.ad;
            int i5 = c17737e.ad;
            int i6 = c17737e.metrica;
            int i7 = c17737e.license;
            c0579e.purchase = i;
            c0579e.license = iArr;
            c0579e.appmetrica = iArr2;
            c0579e.vip = bArr2;
            c0579e.ad = bArr3;
            c0579e.metrica = i5;
            c0579e.billing = i6;
            c0579e.yandex = i7;
            MediaCodec.CryptoInfo cryptoInfo = c0579e.startapp;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (Build.VERSION.SDK_INT >= 24) {
                C1125e c1125e = c0579e.adcel;
                c1125e.getClass();
                C1125e.ad(c1125e, i6, i7);
            }
            long j4 = c15475e.vip;
            int i8 = (int) (j3 - j4);
            c15475e.vip = j4 + i8;
            c15475e.ad -= i8;
        }
        if (!c7507e.metrica(268435456)) {
            c7507e.admob(c15475e.ad);
            return metrica(c18524e, c15475e.vip, c7507e.f15296e, c15475e.ad);
        }
        c1292e.m564extends(4);
        C18524e license2 = license(c18524e, c15475e.vip, c1292e.ad, 4);
        int firebase = c1292e.firebase();
        c15475e.vip += 4;
        c15475e.ad -= 4;
        c7507e.admob(firebase);
        C18524e metrica = metrica(license2, c15475e.vip, c7507e.f15296e, firebase);
        c15475e.vip += firebase;
        int i9 = c15475e.ad - firebase;
        c15475e.ad = i9;
        ByteBuffer byteBuffer = c7507e.f15298e;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c7507e.f15298e = ByteBuffer.allocate(i9);
        } else {
            c7507e.f15298e.clear();
        }
        return metrica(metrica, c15475e.vip, c7507e.f15298e, c15475e.ad);
    }

    public static C18524e license(C18524e c18524e, long j, byte[] bArr, int i) {
        while (j >= c18524e.f36319e) {
            c18524e = (C18524e) c18524e.f36316e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c18524e.f36319e - j));
            C10919e c10919e = (C10919e) c18524e.f36317e;
            System.arraycopy(c10919e.ad, ((int) (j - c18524e.f36318e)) + c10919e.vip, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c18524e.f36319e) {
                c18524e = (C18524e) c18524e.f36316e;
            }
        }
        return c18524e;
    }

    public static C18524e metrica(C18524e c18524e, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c18524e.f36319e) {
            c18524e = (C18524e) c18524e.f36316e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c18524e.f36319e - j));
            C10919e c10919e = (C10919e) c18524e.f36317e;
            byteBuffer.put(c10919e.ad, ((int) (j - c18524e.f36318e)) + c10919e.vip, min);
            i -= min;
            j += min;
            if (j == c18524e.f36319e) {
                c18524e = (C18524e) c18524e.f36316e;
            }
        }
        return c18524e;
    }

    public final void ad(long j) {
        C18524e c18524e;
        if (j == -1) {
            return;
        }
        while (true) {
            c18524e = this.license;
            if (j < c18524e.f36319e) {
                break;
            }
            this.ad.loadAd((C10919e) c18524e.f36317e);
            C18524e c18524e2 = this.license;
            c18524e2.f36317e = null;
            C18524e c18524e3 = (C18524e) c18524e2.f36316e;
            c18524e2.f36316e = null;
            this.license = c18524e3;
        }
        if (this.appmetrica.f36318e < c18524e.f36318e) {
            this.appmetrica = c18524e;
        }
    }

    public final int vip(int i) {
        C18524e c18524e = this.purchase;
        if (((C10919e) c18524e.f36317e) == null) {
            C10919e Signature = this.ad.Signature();
            C18524e c18524e2 = new C18524e(this.purchase.f36319e, this.vip);
            c18524e.f36317e = Signature;
            c18524e.f36316e = c18524e2;
        }
        return Math.min(i, (int) (this.purchase.f36319e - this.billing));
    }
}
