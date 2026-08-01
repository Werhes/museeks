package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14768e {
    public long[] ad;
    public int appmetrica;
    public int license;
    public int[] metrica;
    public int purchase;
    public int[] vip;

    public /* synthetic */ C14768e() {
        this(6);
    }

    public C14768e(int i) {
        this.ad = AbstractC12981e.ad;
        int[] iArr = AbstractC3864e.ad;
        this.vip = iArr;
        this.metrica = iArr;
        if (i >= 0) {
            appmetrica(AbstractC12981e.license(i));
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
        this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
    }

    public final void appmetrica(int i) {
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
        this.metrica = new int[max];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14768e)) {
            return false;
        }
        C14768e c14768e = (C14768e) obj;
        if (c14768e.appmetrica != this.appmetrica) {
            return false;
        }
        int[] iArr = this.vip;
        int[] iArr2 = this.metrica;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int metrica = c14768e.metrica(i5);
                        if (metrica < 0) {
                            break loop0;
                        }
                        z2 = z3;
                        if (i6 != c14768e.metrica[metrica]) {
                            break loop0;
                        }
                    } else {
                        z2 = z3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                }
                z = z3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.vip;
        int[] iArr2 = this.metrica;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        i2 += iArr2[i5] ^ iArr[i5];
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

    public final int license(int i, int i2) {
        int metrica = metrica(i);
        return metrica >= 0 ? this.metrica[metrica] : i2;
    }

    public final int metrica(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.license;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.ad;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.vip[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r20 = r11;
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r2 = vip(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r36.purchase != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (((r36.ad[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r2 = r36.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        r16 = 128;
        r22 = r9;
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if (java.lang.Long.compare((r36.appmetrica * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r2 = r36.ad;
        r6 = r36.license;
        r7 = r36.vip;
        r8 = r36.metrica;
        r9 = (r6 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r10 >= r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        r28 = r11;
        r11 = r2[r10] & r20;
        r2[r10] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r10 = r10 + 1;
        r14 = r14;
        r13 = r13;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        r28 = r11;
        r27 = r13;
        r26 = r14;
        r9 = r2.length;
        r10 = r9 - 1;
        r9 = r9 - 2;
        r13 = 72057594037927935L;
        r2[r9] = (r2[r9] & 72057594037927935L) | (-72057594037927936L);
        r2[r10] = r2[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        if (r9 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        r10 = r9 >> 3;
        r20 = (r9 & 7) << 3;
        r11 = (r2[r10] >> r20) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        if (r11 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0128, code lost:
    
        if (r11 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        r11 = r7[r9] * r27;
        r12 = (r11 ^ (r11 << 16)) >>> 7;
        r21 = vip(r12);
        r12 = r12 & r6;
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
    
        if ((((r21 - r12) & r6) / 8) != (((r9 - r12) & r6) / 8)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016c, code lost:
    
        r3 = r5;
        r30 = r6;
        r5 = r21 >> 3;
        r32 = r2[r5];
        r6 = (r21 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017d, code lost:
    
        if (((r32 >> r6) & r28) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
    
        r34 = r13;
        r2[r5] = ((r11 & 127) << r6) | (r32 & (~(r28 << r6)));
        r2[r10] = (r2[r10] & (~(r28 << r20))) | (128 << r20);
        r7[r21] = r7[r9];
        r7[r9] = 0;
        r8[r21] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c5, code lost:
    
        r2[r2.length - 1] = (r2[0] & r34) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r5 = r3;
        r6 = r30;
        r3 = r31;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a5, code lost:
    
        r34 = r13;
        r2[r5] = ((r11 & 127) << r6) | (r32 & (~(r28 << r6)));
        r5 = r7[r21];
        r7[r21] = r7[r9];
        r7[r9] = r5;
        r5 = r8[r21];
        r8[r21] = r8[r9];
        r8[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r2[r10] = (r2[r10] & (~(r28 << r20))) | ((r11 & 127) << r20);
        r2[r2.length - 1] = (r2[0] & r13) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r5 = r5;
        r6 = r6;
        r3 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01db, code lost:
    
        r3 = r5;
        r36.purchase = defpackage.AbstractC12981e.ad(r36.license) - r36.appmetrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026e, code lost:
    
        r2 = vip(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0272, code lost:
    
        r36.appmetrica++;
        r1 = r36.purchase;
        r3 = r36.ad;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028a, code lost:
    
        if (((r5 >> r7) & r28) != r16) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028c, code lost:
    
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028e, code lost:
    
        r36.purchase = r1 - r15;
        r1 = r36.license;
        r5 = (r5 & (~(r28 << r7))) | (r22 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01eb, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ec, code lost:
    
        r28 = 255;
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f9, code lost:
    
        r2 = defpackage.AbstractC12981e.vip(r36.license);
        r5 = r36.ad;
        r6 = r36.vip;
        r7 = r36.metrica;
        r8 = r36.license;
        appmetrica(r2);
        r2 = r36.ad;
        r9 = r36.vip;
        r10 = r36.metrica;
        r11 = r36.license;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        if (r12 >= r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0223, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r16) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0225, code lost:
    
        r13 = r6[r12];
        r14 = r13 * r13;
        r14 = r14 ^ (r14 << 16);
        r18 = r3;
        r3 = vip(r14 >>> 7);
        r19 = r2;
        r1 = r14 & 127;
        r14 = r3 >> 3;
        r20 = (r3 & 7) << 3;
        r1 = (r19[r14] & (~(255 << r20))) | (r1 << r20);
        r19[r14] = r1;
        r19[(((r3 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r3] = r13;
        r10[r3] = r7[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0265, code lost:
    
        r12 = r12 + 1;
        r3 = r18;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0261, code lost:
    
        r19 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f3, code lost:
    
        r22 = r9;
        r3 = 7;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0099, code lost:
    
        r22 = r9;
        r28 = 255;
        r26 = 1;
        r16 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(int r37, int r38) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14768e.purchase(int, int):void");
    }

    public final String toString() {
        if (this.appmetrica == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.vip;
        int[] iArr2 = this.metrica;
        long[] jArr = this.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.appmetrica) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        return sb.toString();
    }

    public final int vip(int i) {
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
}
