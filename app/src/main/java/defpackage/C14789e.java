package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14789e {
    public int appmetrica;
    public int license;
    public int purchase;
    public long[] ad = AbstractC12981e.ad;
    public long[] vip = AbstractC9449e.ad;
    public int[] metrica = AbstractC3864e.ad;

    public C14789e(int i) {
        if (i >= 0) {
            license(AbstractC12981e.license(i));
        } else {
            AbstractC14783e.billing("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int ad(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r1 = ad(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r39.purchase != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (((r39.ad[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r1 = r39.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (java.lang.Long.compare((r39.appmetrica * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        r1 = r39.ad;
        r2 = r39.license;
        r3 = r39.vip;
        r5 = r39.metrica;
        r6 = (r2 + 7) >> 3;
        r29 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r7 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        r33 = r11;
        r11 = r1[r7] & r33;
        r1[r7] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r7 = r7 + 1;
        r14 = r14;
        r13 = r13;
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r22 = r13;
        r8 = r14;
        r6 = r1.length;
        r7 = r6 - 1;
        r6 = r6 - 2;
        r13 = 72057594037927935L;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r7] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        if (r6 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        r7 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r11 = (r1[r7] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        if (r11 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r11 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        r11 = r3[r6];
        r11 = ((int) (r11 ^ (r11 >>> r22))) * r20;
        r12 = (r11 ^ (r11 << 16)) >>> 7;
        r31 = ad(r12);
        r12 = r12 & r2;
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if ((((r31 - r12) & r2) / 8) != (((r6 - r12) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0171, code lost:
    
        r34 = r13;
        r8 = r31 >> 3;
        r12 = r1[r8];
        r14 = (r31 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0181, code lost:
    
        if (((r12 >> r14) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0183, code lost:
    
        r32 = r2;
        r36 = r3;
        r1[r8] = ((~(255 << r14)) & r12) | ((r11 & 127) << r14);
        r1[r7] = (r1[r7] & (~(255 << r19))) | (128 << r19);
        r36[r31] = r36[r6];
        r36[r6] = 0;
        r5[r31] = r5[r6];
        r5[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d1, code lost:
    
        r1[r1.length - 1] = (r1[0] & r34) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r2 = r32;
        r8 = r33;
        r13 = r34;
        r3 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ad, code lost:
    
        r32 = r2;
        r36 = r3;
        r1[r8] = ((~(255 << r14)) & r12) | ((r11 & 127) << r14);
        r2 = r36[r31];
        r36[r31] = r36[r6];
        r36[r6] = r2;
        r2 = r5[r31];
        r5[r31] = r5[r6];
        r5[r6] = r2;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r34 = r13;
        r1[r7] = ((r11 & 127) << r19) | (r1[r7] & (~(255 << r19)));
        r1[r1.length - 1] = (r1[0] & r34) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r8 = r33;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e8, code lost:
    
        r33 = r8;
        r39.purchase = defpackage.AbstractC12981e.ad(r39.license) - r39.appmetrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027b, code lost:
    
        r1 = ad(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027f, code lost:
    
        r39.appmetrica++;
        r2 = r39.purchase;
        r3 = r39.ad;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        if (((r5 >> r7) & r29) != r25) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r15 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        r39.purchase = r2 - r15;
        r2 = r39.license;
        r5 = (r5 & (~(r29 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f7, code lost:
    
        r29 = 255;
        r33 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        r1 = defpackage.AbstractC12981e.vip(r39.license);
        r2 = r39.ad;
        r3 = r39.vip;
        r5 = r39.metrica;
        r6 = r39.license;
        license(r1);
        r1 = r39.ad;
        r7 = r39.vip;
        r8 = r39.metrica;
        r11 = r39.license;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021b, code lost:
    
        if (r12 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022b, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r25) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022d, code lost:
    
        r13 = r3[r12];
        r21 = r1;
        r19 = r2;
        r1 = ((int) (r13 ^ (r13 >>> r13))) * r20;
        r2 = ad((r1 ^ (r1 << 16)) >>> 7);
        r18 = r2 >> 3;
        r23 = (r2 & 7) << 3;
        r1 = (r21[r18] & (~(255 << r23))) | ((r1 & 127) << r23);
        r21[r18] = r1;
        r21[(((r2 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r2] = r13;
        r8[r2] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0274, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0270, code lost:
    
        r21 = r1;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fe, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a1, code lost:
    
        r29 = 255;
        r33 = 1;
        r25 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(int r40, long r41) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14789e.appmetrica(int, long):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14789e)) {
            return false;
        }
        C14789e c14789e = (C14789e) obj;
        if (c14789e.appmetrica != this.appmetrica) {
            return false;
        }
        long[] jArr3 = this.vip;
        int[] iArr = this.metrica;
        long[] jArr4 = this.ad;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr4[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        z2 = z3;
                        jArr2 = jArr3;
                        long j2 = jArr2[i4];
                        int i5 = iArr[i4];
                        int vip = c14789e.vip(j2);
                        if (vip < 0 || i5 != c14789e.metrica[vip]) {
                            break loop0;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                    jArr3 = jArr2;
                }
                z = z3;
                jArr = jArr3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.vip;
        int[] iArr = this.metrica;
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
                        i2 += iArr[i5] ^ ((int) (j2 ^ (j2 >>> 32)));
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

    public final void license(int i) {
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
        this.metrica = new int[max];
    }

    public final int metrica(long j) {
        int vip = vip(j);
        if (vip >= 0) {
            return this.metrica[vip];
        }
        AbstractC14783e.startapp("Cannot find value for key " + j);
        throw null;
    }

    public final String toString() {
        int i;
        int i2;
        if (this.appmetrica == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.vip;
        int[] iArr = this.metrica;
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
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
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
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
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

    public final int vip(long j) {
        int i = ((int) ((j >>> 32) ^ j)) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.license;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.ad;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.vip[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }
}
