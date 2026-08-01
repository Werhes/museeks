package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15440e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final AbstractC5427e f30517e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؘؖؑ] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        Integer num = AbstractC5303e.ad;
        f30517e = (num == null || num.intValue() >= 34) ? new Object() : new C15089e();
    }

    public abstract int ad(int i);

    public int appmetrica(int i) {
        int license;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return ad(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                license = license() >>> 1;
                i2 = license % i;
            } while ((i - 1) + (license - i2) < 0);
            return i2;
        }
        while (true) {
            int license2 = license();
            if (license2 >= 0 && license2 < i) {
                return license2;
            }
        }
    }

    public long billing(long j, long j2) {
        long purchase;
        long j3;
        long j4;
        int license;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    license = ad(31 - Integer.numberOfLeadingZeros(i));
                } else {
                    if (i2 != 1) {
                        j4 = (ad(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (4294967295L & license());
                        return j + j4;
                    }
                    license = license();
                }
                j4 = license & 4294967295L;
                return j + j4;
            }
            do {
                purchase = purchase() >>> 1;
                j3 = purchase % j5;
            } while ((j5 - 1) + (purchase - j3) < 0);
            j4 = j3;
            return j + j4;
        }
        while (true) {
            long purchase2 = purchase();
            if (j <= purchase2 && purchase2 < j2) {
                return purchase2;
            }
        }
    }

    public abstract int license();

    public byte[] metrica(byte[] bArr) {
        return vip(bArr.length, bArr);
    }

    public long purchase() {
        return (license() << 32) + license();
    }

    public byte[] vip(int i, byte[] bArr) {
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            throw new IllegalArgumentException(AbstractC1786e.pro(AbstractC4653e.premium("fromIndex (0) or toIndex (", i, ") are out of range: 0.."), bArr.length, '.').toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("fromIndex (0) must be not greater than toIndex (", i, ").").toString());
        }
        int i2 = i / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int license = license();
            bArr[i3] = (byte) license;
            bArr[i3 + 1] = (byte) (license >>> 8);
            bArr[i3 + 2] = (byte) (license >>> 16);
            bArr[i3 + 3] = (byte) (license >>> 24);
            i3 += 4;
        }
        int i5 = i - i3;
        int ad = ad(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i3 + i6] = (byte) (ad >>> (i6 * 8));
        }
        return bArr;
    }

    public long yandex() {
        return billing(0L, 1000L);
    }
}
