package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316e {
    public long[] ad;
    public int appmetrica;
    public int license;
    public long[] metrica;
    public int purchase;
    public Object[] vip;

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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1316e)) {
            return false;
        }
        C1316e c1316e = (C1316e) obj;
        if (c1316e.appmetrica != this.appmetrica) {
            return false;
        }
        Object[] objArr = this.vip;
        long[] jArr = this.metrica;
        long[] jArr2 = this.ad;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            long j2 = jArr[i4];
                            int vip = c1316e.vip(obj2);
                            if (vip < 0 || j2 != c1316e.metrica[vip]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object[] objArr = this.vip;
        long[] jArr = this.metrica;
        long[] jArr2 = this.ad;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
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
                        Object obj = objArr[i7];
                        long j2 = jArr[i7];
                        i2 = i3;
                        i4 += ((int) (j2 ^ (j2 >>> 32))) ^ (obj != null ? obj.hashCode() : 0);
                    } else {
                        i2 = i3;
                    }
                    j >>= 8;
                    i6++;
                    i3 = i2;
                }
                int i8 = i3;
                if (i5 != 8) {
                    return i4;
                }
                i = i8;
            } else {
                i = i3;
            }
            if (i == length) {
                return i4;
            }
            i3 = i + 1;
        }
    }

    public final void metrica(int i) {
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
        this.metrica = new long[max];
    }

    public final String toString() {
        int i;
        int i2;
        if (this.appmetrica == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.vip;
        long[] jArr = this.metrica;
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
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
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

    public final int vip(Object obj) {
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
}
