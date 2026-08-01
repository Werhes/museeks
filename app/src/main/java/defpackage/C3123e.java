package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3123e extends AbstractC16167e {
    public int purchase;

    public /* synthetic */ C3123e() {
        this(6);
    }

    public C3123e(int i) {
        this.ad = AbstractC12981e.ad;
        this.vip = AbstractC3864e.ad;
        this.metrica = AbstractC10115e.metrica;
        if (i >= 0) {
            purchase(AbstractC12981e.license(i));
        } else {
            AbstractC14783e.billing("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int appmetrica(int i) {
        int i2 = this.license;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.ad;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.license
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        Lf:
            long[] r4 = r13.ad
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3b:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L56
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.vip
            r11 = r11[r10]
            if (r11 != r14) goto L50
            goto L60
        L50:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3b
        L56:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L69
            r10 = -1
        L60:
            if (r10 < 0) goto L67
            java.lang.Object r14 = r13.yandex(r10)
            return r14
        L67:
            r14 = 0
            return r14
        L69:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3123e.billing(int):java.lang.Object");
    }

    public final int license(int i) {
        long j;
        int i2;
        int i3;
        long j2;
        long[] jArr;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        int i7 = -862048943;
        int i8 = i * (-862048943);
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.license;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.ad;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            int i18 = i14;
            int i19 = 0;
            long j3 = (((-i16) >> 63) & (jArr3[i15 + 1] << (64 - i16))) | (jArr3[i15] >>> i16);
            long j4 = i11;
            int i20 = i7;
            int i21 = i11;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                long j8 = j6;
                if (this.vip[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                j6 = j8;
            }
            long j9 = j6;
            if ((((~j3) << 6) & j3 & j9) != 0) {
                int appmetrica = appmetrica(i10);
                long j10 = 255;
                if (this.purchase != 0 || ((this.ad[appmetrica >> 3] >> ((appmetrica & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    j2 = 128;
                } else {
                    int i22 = this.license;
                    if (i22 > 8) {
                        j2 = 128;
                        if (Long.compare((this.appmetrica * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.ad;
                            int i23 = this.license;
                            int[] iArr = this.vip;
                            Object[] objArr = this.metrica;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            while (i25 < i24) {
                                long j11 = j10;
                                long j12 = jArr4[i25] & j9;
                                jArr4[i25] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i25++;
                                i24 = i24;
                                j10 = j11;
                            }
                            j = j10;
                            int length = jArr4.length;
                            int i26 = length - 1;
                            int i27 = length - 2;
                            jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i26] = jArr4[0];
                            int i28 = 0;
                            while (i28 != i23) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j13 = (jArr4[i29] >> i30) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int i31 = iArr[i28] * i20;
                                    int i32 = (i31 ^ (i31 << 16)) >>> 7;
                                    int appmetrica2 = appmetrica(i32);
                                    int i33 = i32 & i23;
                                    int i34 = i20;
                                    if (((appmetrica2 - i33) & i23) / 8 == ((i28 - i33) & i23) / 8) {
                                        int i35 = i17;
                                        int i36 = i19;
                                        jArr4[i29] = ((r11 & 127) << i30) | (jArr4[i29] & (~(j << i30)));
                                        jArr4[jArr4.length - i35] = (jArr4[i36] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                        i17 = i35;
                                        i20 = i34;
                                        i19 = i36;
                                    } else {
                                        int i37 = i17;
                                        int i38 = i19;
                                        int i39 = appmetrica2 >> 3;
                                        long j14 = jArr4[i39];
                                        int i40 = (appmetrica2 & 7) << 3;
                                        if (((j14 >> i40) & j) == 128) {
                                            i4 = i37;
                                            i5 = i23;
                                            int i41 = i28;
                                            jArr4[i39] = (j14 & (~(j << i40))) | ((r11 & 127) << i40);
                                            jArr4[i29] = (jArr4[i29] & (~(j << i30))) | (128 << i30);
                                            iArr[appmetrica2] = iArr[i41];
                                            iArr[i41] = i38;
                                            objArr[appmetrica2] = objArr[i41];
                                            objArr[i41] = null;
                                            i6 = i41;
                                        } else {
                                            int i42 = i28;
                                            i4 = i37;
                                            i5 = i23;
                                            jArr4[i39] = ((r11 & 127) << i40) | (j14 & (~(j << i40)));
                                            int i43 = iArr[appmetrica2];
                                            iArr[appmetrica2] = iArr[i42];
                                            iArr[i42] = i43;
                                            Object obj = objArr[appmetrica2];
                                            objArr[appmetrica2] = objArr[i42];
                                            objArr[i42] = obj;
                                            i6 = i42 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i38] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i6 + 1;
                                        i23 = i5;
                                        i20 = i34;
                                        i19 = i38;
                                        i17 = i4;
                                    }
                                } else {
                                    i28++;
                                }
                            }
                            i2 = i17;
                            i3 = i19;
                            this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
                            appmetrica = appmetrica(i10);
                        }
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i2 = 1;
                    i3 = 0;
                    int vip = AbstractC12981e.vip(this.license);
                    long[] jArr5 = this.ad;
                    int[] iArr2 = this.vip;
                    Object[] objArr2 = this.metrica;
                    int i44 = this.license;
                    purchase(vip);
                    long[] jArr6 = this.ad;
                    int[] iArr3 = this.vip;
                    Object[] objArr3 = this.metrica;
                    int i45 = this.license;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j2) {
                            int i47 = iArr2[i46];
                            int i48 = i47 * i20;
                            int i49 = i48 ^ (i48 << 16);
                            int appmetrica3 = appmetrica(i49 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i49 & 127;
                            int i50 = appmetrica3 >> 3;
                            int i51 = (appmetrica3 & 7) << 3;
                            long j16 = (jArr[i50] & (~(255 << i51))) | (j15 << i51);
                            jArr[i50] = j16;
                            jArr[(((appmetrica3 - 7) & i45) + (i45 & 7)) >> 3] = j16;
                            iArr3[appmetrica3] = i47;
                            objArr3[appmetrica3] = objArr2[i46];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    appmetrica = appmetrica(i10);
                }
                this.appmetrica++;
                int i52 = this.purchase;
                long[] jArr7 = this.ad;
                int i53 = appmetrica >> 3;
                long j17 = jArr7[i53];
                int i54 = (appmetrica & 7) << 3;
                if (((j17 >> i54) & j) == j2) {
                    i3 = i2;
                }
                this.purchase = i52 - i3;
                int i55 = this.license;
                long j18 = (j17 & (~(j << i54))) | (j4 << i54);
                jArr7[i53] = j18;
                jArr7[(((appmetrica - 7) & i55) + (i55 & 7)) >> 3] = j18;
                return appmetrica;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
            i11 = i21;
            i7 = i20;
        }
    }

    public final void metrica() {
        this.appmetrica = 0;
        long[] jArr = this.ad;
        if (jArr != AbstractC12981e.ad) {
            AbstractC1660e.isVip(-9187201950435737472L, jArr);
            long[] jArr2 = this.ad;
            int i = this.license;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.metrica, 0, this.license, (Object) null);
        this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
    }

    public final void purchase(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, AbstractC12981e.metrica(i)) : 0;
        this.license = max;
        if (max == 0) {
            jArr = AbstractC12981e.ad;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.ad = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
        this.vip = new int[max];
        this.metrica = new Object[max];
    }

    public final void startapp(int i, Object obj) {
        int license = license(i);
        this.vip[license] = i;
        this.metrica[license] = obj;
    }

    public final Object yandex(int i) {
        this.appmetrica--;
        long[] jArr = this.ad;
        int i2 = this.license;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.metrica;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }
}
