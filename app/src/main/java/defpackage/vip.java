package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class vip {
    public static final byte[] ad = "0123456789abcdef".getBytes(AbstractC5508e.ad);
    public static final long[] vip = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long ad(C16151e c16151e, C0193e c0193e, long j, long j2, int i) {
        C16592e c16592e;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        long j5 = i;
        AbstractC7844e.startapp(c0193e.license(), 0, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j3, "fromIndex < 0: ").toString());
        }
        if (j3 > j4) {
            StringBuilder inmobi = AbstractC1786e.inmobi(j3, "fromIndex > toIndex: ", " > ");
            inmobi.append(j4);
            throw new IllegalArgumentException(inmobi.toString().toString());
        }
        long j7 = c16151e.f31731e;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (c16592e = c16151e.f31732e) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = (c16592e.metrica - c16592e.vip) + j6;
                if (j8 > j3) {
                    break;
                }
                c16592e = c16592e.purchase;
                j6 = j8;
            }
            byte[] yandex = c0193e.yandex();
            byte b = yandex[0];
            long min = Math.min(j4, (c16151e.f31731e - j5) + 1);
            long j9 = j6;
            while (j9 < min) {
                byte[] bArr2 = c16592e.ad;
                int min2 = (int) Math.min(c16592e.metrica, (c16592e.vip + min) - j9);
                for (int i2 = (int) ((c16592e.vip + j3) - j9); i2 < min2; i2++) {
                    if (bArr2[i2] == b && vip(c16592e, i2 + 1, yandex, 1, i)) {
                        return (i2 - c16592e.vip) + j9;
                    }
                }
                j9 += c16592e.metrica - c16592e.vip;
                c16592e = c16592e.purchase;
                j3 = j9;
            }
            return -1L;
        }
        while (j7 > j3) {
            c16592e = c16592e.billing;
            j7 -= c16592e.metrica - c16592e.vip;
        }
        byte[] yandex2 = c0193e.yandex();
        byte b2 = yandex2[0];
        byte[] bArr3 = yandex2;
        long min3 = Math.min(j4, (c16151e.f31731e - j5) + 1);
        while (j7 < min3) {
            byte[] bArr4 = c16592e.ad;
            int min4 = (int) Math.min(c16592e.metrica, (c16592e.vip + min3) - j7);
            int i3 = (int) ((c16592e.vip + j3) - j7);
            while (i3 < min4) {
                if (bArr4[i3] == b2) {
                    bArr = bArr3;
                    if (vip(c16592e, i3 + 1, bArr, 1, i)) {
                        return (i3 - c16592e.vip) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += c16592e.metrica - c16592e.vip;
            c16592e = c16592e.purchase;
            j3 = j7;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        return -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[LOOP:0: B:8:0x0019->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int license(defpackage.C16151e r16, defpackage.C3128e r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vip.license(eِٖۢ, eٟؕؕ, boolean):int");
    }

    public static final String metrica(C16151e c16151e, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c16151e.Signature(j2) == 13) {
                String mo1683e = c16151e.mo1683e(j2, AbstractC5508e.ad);
                c16151e.skip(2L);
                return mo1683e;
            }
        }
        String mo1683e2 = c16151e.mo1683e(j, AbstractC5508e.ad);
        c16151e.skip(1L);
        return mo1683e2;
    }

    public static final boolean vip(C16592e c16592e, int i, byte[] bArr, int i2, int i3) {
        int i4 = c16592e.metrica;
        byte[] bArr2 = c16592e.ad;
        while (i2 < i3) {
            if (i == i4) {
                c16592e = c16592e.purchase;
                byte[] bArr3 = c16592e.ad;
                bArr2 = bArr3;
                i = c16592e.vip;
                i4 = c16592e.metrica;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
