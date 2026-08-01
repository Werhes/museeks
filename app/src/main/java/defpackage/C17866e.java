package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17866e {
    public long[] ad;
    public int appmetrica;
    public int license;
    public int[] metrica;
    public int purchase;
    public Object[] vip;

    public /* synthetic */ C17866e() {
        this(6);
    }

    public C17866e(int i) {
        this.ad = AbstractC12981e.ad;
        this.vip = AbstractC10115e.metrica;
        this.metrica = AbstractC3864e.ad;
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
        Arrays.fill(this.vip, 0, this.license, (Object) null);
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
        this.vip = new Object[max];
        this.metrica = new int[max];
    }

    public final void billing(int i, Object obj) {
        int metrica = metrica(obj);
        if (metrica < 0) {
            metrica = ~metrica;
        }
        this.vip[metrica] = obj;
        this.metrica[metrica] = i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17866e)) {
            return false;
        }
        C17866e c17866e = (C17866e) obj;
        if (c17866e.appmetrica != this.appmetrica) {
            return false;
        }
        Object[] objArr = this.vip;
        int[] iArr = this.metrica;
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
                        Object obj2 = objArr[i4];
                        int i5 = iArr[i4];
                        int license = c17866e.license(obj2);
                        if (license < 0) {
                            break loop0;
                        }
                        z2 = z3;
                        if (i5 != c17866e.metrica[license]) {
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
        Object[] objArr = this.vip;
        int[] iArr = this.metrica;
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
                        Object obj = objArr[i5];
                        i2 += iArr[i5] ^ (obj != null ? obj.hashCode() : 0);
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

    public final int license(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.license;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.ad;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC7890e.billing(this.vip[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int metrica(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.license;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.ad;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (AbstractC7890e.billing(this.vip[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int vip = vip(i4);
                long j8 = 255;
                if (this.purchase != 0 || ((this.ad[vip >> 3] >> ((vip & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.license;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.appmetrica * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.ad;
                            int i16 = this.license;
                            Object[] objArr2 = this.vip;
                            int[] iArr = this.metrica;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int length = jArr4.length;
                            int i20 = length - 1;
                            int i21 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i20] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i16) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int vip2 = vip(i25);
                                    int i26 = i25 & i16;
                                    long j13 = j11;
                                    if (((vip2 - i26) & i16) / 8 == ((i22 - i26) & i16) / i19) {
                                        jArr4[i23] = ((r8 & 127) << i24) | (jArr4[i23] & (~(j << i24)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i27 = i19;
                                        int i28 = vip2 >> 3;
                                        long j14 = jArr4[i28];
                                        int i29 = (vip2 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j14) | ((r8 & 127) << i29);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[vip2] = objArr[i22];
                                            objArr[i22] = null;
                                            iArr[vip2] = iArr[i22];
                                            iArr[i22] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((r8 & 127) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[vip2];
                                            objArr[vip2] = objArr[i22];
                                            objArr[i22] = obj3;
                                            int i30 = iArr[vip2];
                                            iArr[vip2] = iArr[i22];
                                            iArr[i22] = i30;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i27;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.purchase = AbstractC12981e.ad(this.license) - this.appmetrica;
                            vip = vip(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int vip3 = AbstractC12981e.vip(this.license);
                    long[] jArr5 = this.ad;
                    Object[] objArr3 = this.vip;
                    int[] iArr2 = this.metrica;
                    int i31 = this.license;
                    appmetrica(vip3);
                    long[] jArr6 = this.ad;
                    Object[] objArr4 = this.vip;
                    int[] iArr3 = this.metrica;
                    int i32 = this.license;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i34 = hashCode3 ^ (hashCode3 << 16);
                            int vip4 = vip(i34 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i34 & 127;
                            int i35 = vip4 >> 3;
                            int i36 = (vip4 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((vip4 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[vip4] = obj4;
                            iArr3[vip4] = iArr2[i33];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    vip = vip(i4);
                }
                this.appmetrica++;
                int i37 = this.purchase;
                long[] jArr7 = this.ad;
                int i38 = vip >> 3;
                long j17 = jArr7[i38];
                int i39 = (vip & 7) << 3;
                this.purchase = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.license;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr7[i38] = j18;
                jArr7[(((vip - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~vip;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void purchase(int i) {
        this.appmetrica--;
        long[] jArr = this.ad;
        int i2 = this.license;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.vip[i] = null;
    }

    public final String toString() {
        if (this.appmetrica == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.vip;
        int[] iArr = this.metrica;
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
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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
