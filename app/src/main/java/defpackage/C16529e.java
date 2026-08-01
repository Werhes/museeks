package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16529e {
    public long[] ad;
    public int appmetrica;
    public int license;
    public Object[] metrica;
    public int purchase;
    public long[] vip;

    public /* synthetic */ C16529e() {
        this(6);
    }

    public C16529e(int i) {
        this.ad = AbstractC12981e.ad;
        this.vip = AbstractC9449e.ad;
        this.metrica = AbstractC10115e.metrica;
        if (i >= 0) {
            purchase(AbstractC12981e.license(i));
        } else {
            AbstractC14783e.billing("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void ad() {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r0 = (int) r0
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.license
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L15:
            long[] r4 = r14.ad
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
        L41:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.vip
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L58
            goto L68
        L58:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L41
        L5e:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L68:
            if (r10 < 0) goto L6f
            java.lang.Object[] r0 = r14.metrica
            r0 = r0[r10]
            return r0
        L6f:
            r0 = 0
            return r0
        L71:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16529e.appmetrica(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r0 = (int) r0
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.license
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L15:
            long[] r4 = r14.ad
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
        L41:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.vip
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L58
            goto L68
        L58:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L41
        L5e:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L9a
            r10 = -1
        L68:
            r0 = 0
            if (r10 < 0) goto L99
            int r1 = r14.appmetrica
            int r1 = r1 + (-1)
            r14.appmetrica = r1
            long[] r1 = r14.ad
            int r2 = r14.license
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r5 = r5 | r7
            r1[r3] = r5
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r5
            java.lang.Object[] r1 = r14.metrica
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L99:
            return r0
        L9a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16529e.billing(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.C16529e
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            eؘٖ۟ r1 = (defpackage.C16529e) r1
            int r3 = r1.appmetrica
            int r5 = r0.appmetrica
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.vip
            java.lang.Object[] r5 = r0.metrica
            long[] r6 = r0.ad
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.appmetrica(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.vip(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.appmetrica(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16529e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.vip;
        Object[] objArr = this.metrica;
        long[] jArr2 = this.ad;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        long j2 = jArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ ((int) (j2 ^ (j2 >>> 32)));
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final int license(int i) {
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

    public final int metrica(long j) {
        long j2;
        int i;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long[] jArr3;
        char c = ' ';
        int i3 = -862048943;
        int i4 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.license;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr4 = this.ad;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            int i14 = i10;
            long j4 = (((-i12) >> 63) & (jArr4[i11 + 1] << (64 - i12))) | (jArr4[i11] >>> i12);
            long j5 = i7;
            char c2 = c;
            int i15 = i7;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                int i16 = i3;
                if (this.vip[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i3 = i16;
            }
            int i17 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int license = license(i6);
                if (this.purchase != 0 || ((this.ad[license >> 3] >> ((license & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i18 = this.license;
                    if (i18 > 8) {
                        j3 = 128;
                        if (Long.compare((this.appmetrica * 32) ^ Long.MIN_VALUE, (i18 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = this.ad;
                            int i19 = this.license;
                            long[] jArr6 = this.vip;
                            Object[] objArr = this.metrica;
                            int i20 = (i19 + 7) >> 3;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j9 = j7;
                                long j10 = jArr5[i21] & j9;
                                jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                i13 = i13;
                                c2 = c2;
                                j7 = j9;
                            }
                            char c3 = c2;
                            int i22 = i13;
                            int length = jArr5.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr5[i24] = (jArr5[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[i23] = jArr5[0];
                            int i25 = 0;
                            while (i25 != i19) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr5[i26] >> i27) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    long j13 = jArr6[i25];
                                    int i28 = ((int) (j13 ^ (j13 >>> c3))) * i17;
                                    int i29 = (i28 ^ (i28 << 16)) >>> 7;
                                    int license2 = license(i29);
                                    int i30 = i29 & i19;
                                    int i31 = i22;
                                    if (((license2 - i30) & i19) / 8 == ((i25 - i30) & i19) / 8) {
                                        long j14 = j11;
                                        jArr5[i26] = ((r11 & 127) << i27) | (jArr5[i26] & (~(255 << i27)));
                                        jArr5[jArr5.length - 1] = (jArr5[0] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        i22 = i31;
                                        j11 = j14;
                                    } else {
                                        long j15 = j11;
                                        int i32 = license2 >> 3;
                                        long j16 = jArr5[i32];
                                        int i33 = (license2 & 7) << 3;
                                        if (((j16 >> i33) & 255) == 128) {
                                            i2 = i19;
                                            jArr3 = jArr6;
                                            jArr5[i32] = ((~(255 << i33)) & j16) | ((r11 & 127) << i33);
                                            jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
                                            jArr3[license2] = jArr3[i25];
                                            jArr3[i25] = 0;
                                            objArr[license2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            i2 = i19;
                                            jArr3 = jArr6;
                                            jArr5[i32] = ((~(255 << i33)) & j16) | ((r11 & 127) << i33);
                                            long j17 = jArr3[license2];
                                            jArr3[license2] = jArr3[i25];
                                            jArr3[i25] = j17;
                                            Object obj = objArr[license2];
                                            objArr[license2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & j15) | Long.MIN_VALUE;
                                        i25++;
                                        i19 = i2;
                                        i22 = i31;
                                        j11 = j15;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i = i22;
                            this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
                            license = license(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 1;
                    int vip = AbstractC12981e.vip(this.license);
                    long[] jArr7 = this.ad;
                    long[] jArr8 = this.vip;
                    Object[] objArr2 = this.metrica;
                    int i34 = this.license;
                    purchase(vip);
                    long[] jArr9 = this.ad;
                    long[] jArr10 = this.vip;
                    Object[] objArr3 = this.metrica;
                    int i35 = this.license;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr7[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            long j18 = jArr8[i36];
                            jArr = jArr9;
                            jArr2 = jArr7;
                            int i37 = ((int) (j18 ^ (j18 >>> c2))) * i17;
                            int license3 = license((i37 ^ (i37 << 16)) >>> 7);
                            int i38 = license3 >> 3;
                            int i39 = (license3 & 7) << 3;
                            long j19 = (jArr[i38] & (~(255 << i39))) | ((r1 & 127) << i39);
                            jArr[i38] = j19;
                            jArr[(((license3 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            jArr10[license3] = j18;
                            objArr3[license3] = objArr2[i36];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i36++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    license = license(i6);
                }
                this.appmetrica++;
                int i40 = this.purchase;
                long[] jArr11 = this.ad;
                int i41 = license >> 3;
                long j20 = jArr11[i41];
                int i42 = (license & 7) << 3;
                if (((j20 >> i42) & j2) != j3) {
                    i = 0;
                }
                this.purchase = i40 - i;
                int i43 = this.license;
                long j21 = (j20 & (~(j2 << i42))) | (j5 << i42);
                jArr11[i41] = j21;
                jArr11[(((license - 7) & i43) + (i43 & 7)) >> 3] = j21;
                return license;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i7 = i15;
            i3 = i17;
            c = c2;
        }
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
        this.vip = new long[max];
        this.metrica = new Object[max];
    }

    public final String toString() {
        int i;
        int i2;
        if (this.appmetrica == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.vip;
        Object[] objArr = this.metrica;
        long[] jArr2 = this.ad;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.appmetrica) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 32
            long r1 = r18 >>> r1
            long r1 = r18 ^ r1
            int r1 = (int) r1
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.license
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L19:
            long[] r6 = r0.ad
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L45:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.vip
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5c
            goto L6c
        L5c:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L45
        L62:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L70
            r10 = -1
        L6c:
            if (r10 < 0) goto L6f
            return r11
        L6f:
            return r4
        L70:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16529e.vip(long):boolean");
    }

    public final void yandex(long j, Object obj) {
        int metrica = metrica(j);
        this.vip[metrica] = j;
        this.metrica[metrica] = obj;
    }
}
