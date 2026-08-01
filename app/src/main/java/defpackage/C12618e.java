package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12618e {
    public long[] ad;
    public int appmetrica;
    public int license;
    public int metrica;
    public Object[] vip;

    public /* synthetic */ C12618e() {
        this(6);
    }

    public C12618e(int i) {
        this.ad = AbstractC12981e.ad;
        this.vip = AbstractC10115e.metrica;
        if (i >= 0) {
            billing(AbstractC12981e.license(i));
        } else {
            AbstractC14783e.billing("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean ad(Object obj) {
        int i = this.license;
        this.vip[license(obj)] = obj;
        return this.license != i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adcel(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.metrica
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.ad
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.vip
            r11 = r11[r10]
            boolean r11 = defpackage.AbstractC7890e.billing(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.amazon(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12618e.adcel(java.lang.Object):void");
    }

    public final void advert(Object obj) {
        this.vip[license(obj)] = obj;
    }

    public final void amazon(int i) {
        this.license--;
        long[] jArr = this.ad;
        int i2 = this.metrica;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.vip[i] = null;
    }

    public final int appmetrica(int i) {
        int i2 = this.metrica;
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

    public final void billing(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, AbstractC12981e.metrica(i)) : 0;
        this.metrica = max;
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
        this.appmetrica = AbstractC12981e.ad(this.metrica) - this.license;
        this.vip = max == 0 ? AbstractC10115e.metrica : new Object[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12618e)) {
            return false;
        }
        C12618e c12618e = (C12618e) obj;
        if (c12618e.license != this.license) {
            return false;
        }
        Object[] objArr = this.vip;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !c12618e.metrica(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.metrica * 31) + this.license;
        Object[] objArr = this.vip;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!AbstractC7890e.billing(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final int license(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.metrica;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.ad;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (AbstractC7890e.billing(this.vip[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int appmetrica = appmetrica(i5);
                long j8 = 255;
                if (this.appmetrica != 0 || ((this.ad[appmetrica >> 3] >> ((appmetrica & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.metrica;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((this.license * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.ad;
                            int i17 = this.metrica;
                            Object[] objArr2 = this.vip;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int length = jArr4.length;
                            int i21 = length - 1;
                            int i22 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i21] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i17) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j12 = (jArr4[i24] >> i25) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i23];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i26 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int appmetrica2 = appmetrica(i26);
                                    int i27 = i26 & i17;
                                    if (((appmetrica2 - i27) & i17) / i20 == ((i23 - i27) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i24] = ((r7 & 127) << i25) | ((~(j << i25)) & jArr4[i24]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i28 = appmetrica2 >> 3;
                                        long j15 = jArr4[i28];
                                        int i29 = (appmetrica2 & 7) << 3;
                                        if (((j15 >> i29) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j15) | ((r7 & 127) << i29);
                                            jArr4[i24] = (jArr4[i24] & (~(j << i25))) | (128 << i25);
                                            objArr[appmetrica2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i28] = ((r7 & 127) << i29) | ((~(j << i29)) & j15);
                                            Object obj3 = objArr[appmetrica2];
                                            objArr[appmetrica2] = objArr[i23];
                                            objArr[i23] = obj3;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            this.appmetrica = AbstractC12981e.ad(this.metrica) - this.license;
                            appmetrica = appmetrica(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int vip = AbstractC12981e.vip(this.metrica);
                    long[] jArr5 = this.ad;
                    Object[] objArr3 = this.vip;
                    int i30 = this.metrica;
                    billing(vip);
                    long[] jArr6 = this.ad;
                    Object[] objArr4 = this.vip;
                    int i31 = this.metrica;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int appmetrica3 = appmetrica(i33 >>> 7);
                            long j16 = i33 & 127;
                            int i34 = appmetrica3 >> 3;
                            int i35 = (appmetrica3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((appmetrica3 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[appmetrica3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    appmetrica = appmetrica(i5);
                }
                this.license++;
                int i36 = this.appmetrica;
                long[] jArr7 = this.ad;
                int i37 = appmetrica >> 3;
                long j18 = jArr7[i37];
                int i38 = (appmetrica & 7) << 3;
                this.appmetrica = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.metrica;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((appmetrica - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return appmetrica;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.metrica
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.ad
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.vip
            r15 = r15[r11]
            boolean r15 = defpackage.AbstractC7890e.billing(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12618e.metrica(java.lang.Object):boolean");
    }

    public final void mopub(C12618e c12618e) {
        Object[] objArr = c12618e.vip;
        long[] jArr = c12618e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        advert(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final Object purchase() {
        Object[] objArr = this.vip;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return objArr[(i << 3) + i3];
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean smaato(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.metrica
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.ad
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.vip
            r15 = r15[r11]
            boolean r15 = defpackage.AbstractC7890e.billing(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.amazon(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12618e.smaato(java.lang.Object):boolean");
    }

    public final boolean startapp() {
        return this.license != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.vip;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void vip() {
        this.license = 0;
        long[] jArr = this.ad;
        if (jArr != AbstractC12981e.ad) {
            AbstractC1660e.isVip(-9187201950435737472L, jArr);
            long[] jArr2 = this.ad;
            int i = this.metrica;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.vip, 0, this.metrica, (Object) null);
        this.appmetrica = AbstractC12981e.ad(this.metrica) - this.license;
    }

    public final boolean yandex() {
        return this.license == 0;
    }
}
