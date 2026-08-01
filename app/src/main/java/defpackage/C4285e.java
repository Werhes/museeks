package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4285e {
    public int ad;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public int purchase;
    public final Object startapp;
    public int vip;
    public final Object yandex;

    public C4285e(C14154e c14154e) {
        this.yandex = c14154e;
        this.ad = c14154e.metrica;
        this.vip = c14154e.mopub;
        this.metrica = c14154e.license;
        this.license = c14154e.adcel;
        this.appmetrica = c14154e.purchase;
        this.purchase = c14154e.appmetrica;
        C11467e c11467e = c14154e.Signature;
        this.startapp = c11467e;
        c11467e.getClass();
        this.billing = 3;
    }

    public C4285e(InputStream inputStream) {
        this.purchase = Alert.DURATION_SHOW_INDEFINITELY;
        this.yandex = new byte[4096];
        this.ad = 0;
        this.metrica = 0;
        this.appmetrica = 0;
        this.startapp = inputStream;
    }

    public static int pro(C9831e c9831e, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i5 + 2] & 255)) << 4) | (s2 >> 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) c9831e.license)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) c9831e.license)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public long Signature() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.metrica == this.ad) {
                remoteconfig(1);
            }
            byte[] bArr = (byte[]) this.yandex;
            int i2 = this.metrica;
            this.metrica = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((bArr[i2] & 128) == 0) {
                return j;
            }
        }
        throw new C14226e("CodedInputStream encountered a malformed varint.");
    }

    public void ad(int i) {
        if (this.license != i) {
            throw new C14226e("Protocol message end-group tag did not match expected tag.");
        }
    }

    public AbstractC6649e adcel(InterfaceC6066e interfaceC6066e, C18521e c18521e) {
        int amazon = amazon();
        vip();
        int billing = billing(amazon);
        this.billing++;
        AbstractC6649e abstractC6649e = (AbstractC6649e) interfaceC6066e.ad(this, c18521e);
        ad(0);
        this.billing--;
        purchase(billing);
        return abstractC6649e;
    }

    public int admob() {
        if (this.metrica == this.ad && !isVip(1)) {
            this.license = 0;
            return 0;
        }
        int amazon = amazon();
        this.license = amazon;
        if ((amazon >>> 3) != 0) {
            return amazon;
        }
        throw new C14226e("Protocol message contained an invalid tag (zero).");
    }

    public int advert() {
        int i = this.metrica;
        if (this.ad - i < 4) {
            remoteconfig(4);
            i = this.metrica;
        }
        byte[] bArr = (byte[]) this.yandex;
        this.metrica = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public int amazon() {
        int i;
        int i2 = this.metrica;
        int i3 = this.ad;
        if (i3 != i2) {
            byte[] bArr = (byte[]) this.yandex;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.metrica = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.metrica = i5;
                return i;
            }
        }
        return (int) Signature();
    }

    public int appmetrica() {
        int i = this.purchase;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.appmetrica + this.metrica);
    }

    public int billing(int i) {
        if (i < 0) {
            throw new C14226e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.appmetrica + this.metrica + i;
        int i3 = this.purchase;
        if (i2 > i3) {
            throw C14226e.vip();
        }
        this.purchase = i2;
        subscription();
        return i3;
    }

    public boolean isVip(int i) {
        InputStream inputStream = (InputStream) this.startapp;
        byte[] bArr = (byte[]) this.yandex;
        int i2 = this.metrica;
        int i3 = i2 + i;
        int i4 = this.ad;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC1634e.smaato("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        if (this.appmetrica + i2 + i <= this.purchase && inputStream != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.appmetrica += i2;
                this.ad -= i2;
                this.metrica = 0;
            }
            int i5 = this.ad;
            int read = inputStream.read(bArr, i5, bArr.length - i5);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(AbstractC1634e.smaato("InputStream#read(byte[]) returned invalid result: ", read, "\nThe InputStream implementation is buggy."));
            }
            if (read > 0) {
                this.ad += read;
                if ((this.appmetrica + i) - 67108864 > 0) {
                    throw new C14226e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                subscription();
                if (this.ad >= i) {
                    return true;
                }
                return isVip(i);
            }
        }
        return false;
    }

    public void license(C9831e[] c9831eArr, byte[] bArr, boolean z) {
        byte b;
        byte b2;
        int i = this.ad;
        int i2 = this.billing;
        C11467e c11467e = (C11467e) this.startapp;
        c11467e.getClass();
        C16253e c16253e = (C16253e) c11467e.f23072e;
        int i3 = i2 * 168;
        byte[] bArr2 = new byte[i3 + 2];
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                if (z) {
                    b = (byte) i4;
                    b2 = (byte) i5;
                } else {
                    b = (byte) i5;
                    b2 = (byte) i4;
                }
                c11467e.m3216native(bArr, b, b2);
                c16253e.smaato(0, i3, bArr2);
                int pro = pro(((C9831e[]) c9831eArr[i4].license)[i5], 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, i3);
                int i6 = i3;
                while (pro < 256) {
                    int i7 = i6 % 3;
                    for (int i8 = 0; i8 < i7; i8++) {
                        bArr2[i8] = bArr2[(i6 - i7) + i8];
                    }
                    c16253e.smaato(i7, 336, bArr2);
                    i6 = i7 + 168;
                    pro += pro(((C9831e[]) c9831eArr[i4].license)[i5], pro, 256 - pro, bArr2, i6);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long loadAd() {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4285e.loadAd():long");
    }

    public byte[] metrica(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z;
        char c;
        char c2;
        char c3;
        C9831e c9831e;
        char c4;
        int i;
        int i2 = this.ad;
        C14154e c14154e = (C14154e) this.yandex;
        C9831e c9831e2 = new C9831e(c14154e, 5);
        C9831e c9831e3 = new C9831e(c14154e, 5);
        C9831e c9831e4 = new C9831e(c14154e, 5);
        C9831e c9831e5 = new C9831e(c14154e, 5);
        C9831e[] c9831eArr = new C9831e[c14154e.metrica];
        C9831e c9831e6 = new C9831e(c14154e, 4);
        C9831e c9831e7 = new C9831e(c14154e, 4);
        short[] sArr = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i3 = 32;
        byte[] bArr4 = new byte[32];
        c9831e3.firebase(bArr);
        System.arraycopy(bArr, this.metrica, bArr4, 0, 32);
        if (bArr2.length != 32) {
            throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!");
        }
        int i4 = 0;
        while (true) {
            z = true;
            if (i4 >= i3) {
                break;
            }
            int i5 = i3;
            int i6 = 0;
            for (int i7 = 8; i6 < i7; i7 = i7) {
                sArr[(i4 * 8) + i6] = (short) (((short) (((short) (((bArr2[i4] & 255) >> i6) & 1)) * (-1))) & 1665);
                i6++;
            }
            i4++;
            i3 = i5;
        }
        int i8 = i3;
        for (int i9 = 0; i9 < i2; i9++) {
            c9831eArr[i9] = new C9831e(c14154e, 5);
        }
        license(c9831eArr, bArr4, true);
        byte b = 0;
        for (int i10 = 0; i10 < i2; i10++) {
            ((C9831e[]) c9831e2.license)[i10].m2678class(b, bArr3);
            b = (byte) (b + 1);
        }
        int i11 = 0;
        while (i11 < i2) {
            C9831e c9831e8 = ((C9831e[]) c9831e4.license)[i11];
            boolean z2 = z;
            byte[] bArr5 = new byte[128];
            C11467e c11467e = (C11467e) c9831e8.appmetrica;
            c11467e.getClass();
            int length = bArr3.length + 1;
            int i12 = i11;
            byte[] bArr6 = new byte[length];
            byte b2 = b;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
            bArr6[bArr3.length] = b2;
            C16253e c16253e = (C16253e) c11467e.f23071e;
            c16253e.purchase(0, length, bArr6);
            c16253e.metrica(0, 128, bArr5);
            AbstractC7779e.license(c9831e8, bArr5, 2);
            b = (byte) (b2 + 1);
            i11 = i12 + 1;
            z = z2;
            c9831eArr = c9831eArr;
        }
        byte b3 = b;
        boolean z3 = z;
        C9831e[] c9831eArr2 = c9831eArr;
        byte[] bArr7 = new byte[128];
        C11467e c11467e2 = (C11467e) c9831e6.appmetrica;
        c11467e2.getClass();
        int length2 = bArr3.length + 1;
        byte[] bArr8 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr8, 0, bArr3.length);
        bArr8[bArr3.length] = b3;
        C16253e c16253e2 = (C16253e) c11467e2.f23071e;
        c16253e2.purchase(0, length2, bArr8);
        c16253e2.metrica(0, 128, bArr7);
        AbstractC7779e.license(c9831e6, bArr7, 2);
        c9831e2.m2714transient();
        for (int i13 = 0; i13 < i2; i13++) {
            C9831e.m2671new(((C9831e[]) c9831e5.license)[i13], c9831eArr2[i13], c9831e2, c14154e);
        }
        C9831e.m2671new(c9831e7, c9831e3, c9831e2, c14154e);
        for (int i14 = 0; i14 < c9831e5.vip; i14++) {
            ((C9831e[]) c9831e5.license)[i14].m2702package();
        }
        c9831e7.m2702package();
        for (int i15 = 0; i15 < c9831e5.vip; i15++) {
            ((C9831e[]) c9831e5.license)[i15].billing(((C9831e[]) c9831e4.license)[i15]);
        }
        c9831e7.billing(c9831e6);
        for (int i16 = 0; i16 < 256; i16++) {
            short[] sArr2 = (short[]) c9831e7.license;
            sArr2[i16] = (short) (sArr2[i16] + sArr[i16]);
        }
        for (int i17 = 0; i17 < c9831e5.vip; i17++) {
            ((C9831e[]) c9831e5.license)[i17].m2710synchronized();
        }
        c9831e7.m2710synchronized();
        int i18 = this.appmetrica;
        byte[] bArr9 = new byte[this.license];
        C9831e[] c9831eArr3 = (C9831e[]) c9831e5.license;
        int i19 = c9831e5.vip;
        for (int i20 = 0; i20 < i19; i20++) {
            c9831eArr3[i20].isVip();
        }
        int i21 = ((C14154e) c9831e5.appmetrica).purchase;
        byte[] bArr10 = new byte[i21];
        if (i21 == i19 * 320) {
            short[] sArr3 = new short[4];
            int i22 = 0;
            for (int i23 = 0; i23 < i19; i23++) {
                for (int i24 = 0; i24 < 64; i24++) {
                    for (int i25 = 0; i25 < 4; i25++) {
                        sArr3[i25] = (short) (((((((short[]) c9831eArr3[i23].license)[(i24 * 4) + i25] << 10) + 1665) * 1290167) >> i8) & 1023);
                    }
                    short s = sArr3[0];
                    bArr10[i22] = (byte) s;
                    short s2 = sArr3[z3 ? 1 : 0];
                    bArr10[i22 + 1] = (byte) ((s >> 8) | (s2 << 2));
                    short s3 = sArr3[2];
                    bArr10[i22 + 2] = (byte) ((s2 >> 6) | (s3 << 4));
                    short s4 = sArr3[3];
                    bArr10[i22 + 3] = (byte) ((s3 >> 4) | (s4 << 6));
                    bArr10[i22 + 4] = (byte) (s4 >> 2);
                    i22 += 5;
                }
            }
            c = 7;
            c2 = 3;
            c3 = 6;
            c9831e = c9831e7;
            i = 0;
            c4 = 5;
        } else {
            c = 7;
            c2 = 3;
            c3 = 6;
            if (i21 != i19 * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            int i26 = 8;
            short[] sArr4 = new short[8];
            int i27 = 0;
            int i28 = 0;
            while (i27 < i19) {
                int i29 = 0;
                for (int i30 = i8; i29 < i30; i30 = 32) {
                    int i31 = 0;
                    while (i31 < i26) {
                        sArr4[i31] = (short) (((((((short[]) c9831eArr3[i27].license)[(i29 * 8) + i31] << 11) + 1664) * 645084) >> 31) & 2047);
                        i31++;
                        c9831e7 = c9831e7;
                        i26 = 8;
                    }
                    C9831e c9831e9 = c9831e7;
                    short s5 = sArr4[0];
                    bArr10[i28] = (byte) s5;
                    short s6 = sArr4[z3 ? 1 : 0];
                    bArr10[i28 + 1] = (byte) ((s5 >> 8) | (s6 << 3));
                    int i32 = s6 >> 5;
                    short s7 = sArr4[2];
                    bArr10[i28 + 2] = (byte) (i32 | (s7 << 6));
                    bArr10[i28 + 3] = (byte) (s7 >> 2);
                    int i33 = s7 >> 10;
                    short s8 = sArr4[3];
                    bArr10[i28 + 4] = (byte) (i33 | (s8 << 1));
                    int i34 = s8 >> 7;
                    short s9 = sArr4[4];
                    bArr10[i28 + 5] = (byte) (i34 | (s9 << 4));
                    int i35 = s9 >> 4;
                    short s10 = sArr4[5];
                    bArr10[i28 + 6] = (byte) (i35 | (s10 << 7));
                    bArr10[i28 + 7] = (byte) (s10 >> 1);
                    int i36 = s10 >> 9;
                    short s11 = sArr4[6];
                    bArr10[i28 + 8] = (byte) (i36 | (s11 << 2));
                    int i37 = s11 >> 6;
                    short s12 = sArr4[7];
                    bArr10[i28 + 9] = (byte) (i37 | (s12 << 5));
                    bArr10[i28 + 10] = (byte) (s12 >> 3);
                    i28 += 11;
                    i29++;
                    c9831e7 = c9831e9;
                    i26 = 8;
                }
                i27++;
                i26 = 8;
                i8 = 32;
            }
            c9831e = c9831e7;
            c4 = 5;
            i = 0;
        }
        System.arraycopy(bArr10, i, bArr9, i, i18);
        int i38 = 8;
        byte[] bArr11 = new byte[8];
        int i39 = c9831e.vip;
        byte[] bArr12 = new byte[i39];
        c9831e.isVip();
        if (i39 == 128) {
            int i40 = 0;
            int i41 = 0;
            while (i40 < 32) {
                int i42 = 0;
                while (i42 < i38) {
                    bArr11[i42] = (byte) (((((((short[]) c9831e.license)[(i40 * 8) + i42] << 4) + 1665) * 80635) >> 28) & 15);
                    i42++;
                    i38 = 8;
                }
                bArr12[i41] = (byte) (bArr11[0] | (bArr11[z3 ? 1 : 0] << 4));
                bArr12[i41 + 1] = (byte) (bArr11[2] | (bArr11[c2] << 4));
                bArr12[i41 + 2] = (byte) (bArr11[4] | (bArr11[c4] << 4));
                bArr12[i41 + 3] = (byte) (bArr11[c3] | (bArr11[c] << 4));
                i41 += 4;
                i40++;
                i38 = 8;
            }
        } else {
            if (i39 != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i43 = 0;
            for (int i44 = 0; i44 < 32; i44++) {
                for (int i45 = 0; i45 < 8; i45++) {
                    bArr11[i45] = (byte) (((((((short[]) c9831e.license)[(i44 * 8) + i45] << 5) + 1664) * 40318) >> 27) & 31);
                }
                bArr12[i43] = (byte) (bArr11[0] | (bArr11[z3 ? 1 : 0] << 5));
                bArr12[i43 + 1] = (byte) ((bArr11[z3 ? 1 : 0] >> 3) | (bArr11[2] << 2) | (bArr11[c2] << 7));
                bArr12[i43 + 2] = (byte) ((bArr11[c2] >> 1) | (bArr11[4] << 4));
                bArr12[i43 + 3] = (byte) ((bArr11[4] >> 4) | (bArr11[c4] << 1) | (bArr11[c3] << 6));
                bArr12[i43 + 4] = (byte) ((bArr11[c3] >> 2) | (bArr11[c] << 3));
                i43 += 5;
            }
        }
        System.arraycopy(bArr12, 0, bArr9, i18, this.purchase);
        return bArr9;
    }

    public byte[] mopub(int i) {
        byte[] bArr = (byte[]) this.yandex;
        if (i <= 0) {
            if (i == 0) {
                return AbstractC6172e.ad;
            }
            throw new C14226e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.appmetrica;
        int i3 = this.metrica;
        int i4 = i2 + i3 + i;
        int i5 = this.purchase;
        if (i4 > i5) {
            tapsense((i5 - i2) - i3);
            throw C14226e.vip();
        }
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.ad - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.metrica = this.ad;
            int i7 = i - i6;
            if (i7 > 0) {
                remoteconfig(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.metrica = i7;
            return bArr2;
        }
        int i8 = this.ad;
        this.appmetrica = i2 + i8;
        this.metrica = 0;
        this.ad = 0;
        int i9 = i8 - i3;
        int i10 = i - i9;
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr3 = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = ((InputStream) this.startapp).read(bArr3, i11, min - i11);
                if (read == -1) {
                    throw C14226e.vip();
                }
                this.appmetrica += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, i9);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i9, bArr5.length);
            i9 += bArr5.length;
        }
        return bArr4;
    }

    public void purchase(int i) {
        this.purchase = i;
        subscription();
    }

    public void remoteconfig(int i) {
        if (!isVip(i)) {
            throw C14226e.vip();
        }
    }

    public boolean signatures(int i, C9831e c9831e) {
        boolean signatures;
        int i2 = i & 7;
        if (i2 == 0) {
            long loadAd = loadAd();
            c9831e.m2689e(i);
            c9831e.m2687e(loadAd);
            return true;
        }
        if (i2 == 1) {
            long smaato = smaato();
            c9831e.m2689e(i);
            c9831e.m2686e(smaato);
            return true;
        }
        if (i2 == 2) {
            C1884e yandex = yandex();
            c9831e.m2689e(i);
            c9831e.m2689e(yandex.size());
            c9831e.m2690e(yandex);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new C14226e("Protocol message tag had invalid wire type.");
            }
            int advert = advert();
            c9831e.m2689e(i);
            c9831e.m2684e(advert);
            return true;
        }
        c9831e.m2689e(i);
        do {
            int admob = admob();
            if (admob == 0) {
                break;
            }
            vip();
            this.billing++;
            signatures = signatures(admob, c9831e);
            this.billing--;
        } while (signatures);
        int i3 = ((i >>> 3) << 3) | 4;
        ad(i3);
        c9831e.m2689e(i3);
        return true;
    }

    public long smaato() {
        int i = this.metrica;
        if (this.ad - i < 8) {
            remoteconfig(8);
            i = this.metrica;
        }
        byte[] bArr = (byte[]) this.yandex;
        this.metrica = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public int startapp() {
        return amazon();
    }

    public void subscription() {
        int i = this.ad + this.vip;
        this.ad = i;
        int i2 = this.appmetrica + i;
        int i3 = this.purchase;
        if (i2 <= i3) {
            this.vip = 0;
            return;
        }
        int i4 = i2 - i3;
        this.vip = i4;
        this.ad = i - i4;
    }

    public void tapsense(int i) {
        int i2 = this.ad;
        int i3 = this.metrica;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.metrica = i3 + i;
            return;
        }
        if (i < 0) {
            throw new C14226e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.appmetrica;
        int i6 = i5 + i3 + i;
        int i7 = this.purchase;
        if (i6 > i7) {
            tapsense((i7 - i5) - i3);
            throw C14226e.vip();
        }
        this.metrica = i2;
        remoteconfig(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.ad;
            if (i8 <= i9) {
                this.metrica = i8;
                return;
            } else {
                i4 += i9;
                this.metrica = i9;
                remoteconfig(1);
            }
        }
    }

    public void vip() {
        if (this.billing >= 64) {
            throw new C14226e("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public C1884e yandex() {
        int amazon = amazon();
        int i = this.ad;
        int i2 = this.metrica;
        if (amazon > i - i2 || amazon <= 0) {
            return amazon == 0 ? AbstractC6732e.f13911e : new C1884e(mopub(amazon));
        }
        byte[] bArr = new byte[amazon];
        System.arraycopy((byte[]) this.yandex, i2, bArr, 0, amazon);
        C1884e c1884e = new C1884e(bArr);
        this.metrica += amazon;
        return c1884e;
    }
}
