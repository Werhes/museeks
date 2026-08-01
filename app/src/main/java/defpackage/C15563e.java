package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15563e {
    public final long ad;
    public final long vip;
    public static final C3087e metrica = AbstractC12475e.license("9999999999999999999999999999999999");
    public static final C15563e license = new C15563e(8646911284551352320L, 0);
    public static final C15563e appmetrica = new C15563e(-576460752303423488L, 0);
    public static final C15563e purchase = new C15563e(-288230376151711744L, 0);
    public static final C15563e billing = new C15563e(8935141660703064064L, 0);

    static {
        C6114e.m2034e(3476778912330022912L, 0L);
        C6114e.m2034e(-5746593124524752896L, 0L);
    }

    public C15563e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C15563e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C15563e c15563e = (C15563e) obj;
        return this.ad == c15563e.ad && this.vip == c15563e.vip;
    }

    public final int hashCode() {
        long j = this.vip;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.ad;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        long j5;
        long j6 = this.ad;
        if (Long.compare((j6 & 6917529027641081856L) ^ Long.MIN_VALUE, -4611686018427387904L) <= 0) {
            j = Long.MIN_VALUE;
            if (Long.compare((9222809086901354496L & j6) ^ Long.MIN_VALUE, -5747156074478174208L) <= 0) {
                j3 = 3440750115311058944L;
                j6 += j3;
            } else {
                j2 = 3476778912330022912L;
                j6 -= j2;
            }
        } else {
            j = Long.MIN_VALUE;
            long j7 = (j6 & 8646911284551352320L) ^ Long.MIN_VALUE;
            if ((Long.compare(j7, -1152921504606846976L) <= 0) & (Long.compare(j7, -2305843009213693952L) >= 0)) {
                if (Long.compare((2305702271725338624L & j6) ^ Long.MIN_VALUE, -8354318046260625408L) <= 0) {
                    j3 = 860187528827764736L;
                    j6 += j3;
                } else {
                    j2 = 869194728082505728L;
                    j6 -= j2;
                }
            }
        }
        long j8 = (j6 & 6917529027641081856L) ^ j;
        if (Long.compare(j8, -4611686018427387904L) > 0) {
            long j9 = (j6 & 8646911284551352320L) ^ j;
            if ((Long.compare(j9, -2305843009213693952L) >= 0) && (Long.compare(j9, -1152921504606846976L) <= 0)) {
                int m2036e = C6114e.m2036e(j6);
                if (m2036e == 0) {
                    return (j6 & j) != 0 ? "-0" : "0";
                }
                String valueOf = String.valueOf(m2036e);
                if (m2036e > 0) {
                    valueOf = AbstractC17861e.Signature("+", valueOf);
                }
                return AbstractC1786e.signatures(new StringBuilder(), (j6 & j) != 0 ? "-0E" : "0E", valueOf);
            }
            long j10 = (-288230376151711744L) & j6;
            if (j10 == -576460752303423488L) {
                return "-Infinity";
            }
            if (j10 == 8646911284551352320L) {
                return "Infinity";
            }
            if ((j6 & 8935141660703064064L) == 8935141660703064064L) {
                return "NaN";
            }
            throw new IllegalStateException("Unsupported Decimal128 string conversion. This is a bug.");
        }
        int m2036e2 = C6114e.m2036e(j6);
        if (Long.compare(j8, -4611686018427387904L) <= 0) {
            i = m2036e2;
            j4 = j6 & 562949953421311L;
        } else {
            i = m2036e2;
            long j11 = (j6 & 8646911284551352320L) ^ j;
            if (!(Long.compare(j11, -2305843009213693952L) >= 0) || !(Long.compare(j11, -1152921504606846976L) <= 0)) {
                throw new IllegalStateException("getSignificandHighBits cannot be called for Infinity or NaN.");
            }
            j4 = 0;
        }
        if (Long.compare(j8, -4611686018427387904L) <= 0) {
            j5 = this.vip;
        } else {
            long j12 = (j6 & 8646911284551352320L) ^ j;
            if (!(Long.compare(j12, -1152921504606846976L) <= 0) || !(Long.compare(j12, -2305843009213693952L) >= 0)) {
                throw new IllegalStateException("getSignificandLowBits cannot be called for Infinity or NaN.");
            }
            j5 = 0;
        }
        String c3087e = new C3087e(j4, j5).toString();
        int length = (c3087e.length() + i) - 1;
        if (i > 0 || length < -6) {
            if (c3087e.length() > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(c3087e.charAt(0) + ".");
                sb.append(c3087e.substring(1));
                c3087e = sb.toString();
            }
            String valueOf2 = String.valueOf(length);
            if (length >= 0) {
                valueOf2 = AbstractC17861e.Signature("+", valueOf2);
            }
            c3087e = AbstractC0869e.tapsense('E', c3087e, valueOf2);
        } else if (i != 0) {
            int abs = Math.abs(i);
            int i2 = abs + 1;
            if (c3087e.length() < i2) {
                c3087e = AbstractC6507e.admob(i2 - c3087e.length(), "0") + c3087e;
            }
            int length2 = c3087e.length() - abs;
            c3087e = c3087e.substring(0, length2) + '.' + c3087e.substring(length2);
        }
        return (j6 & j) != 0 ? AbstractC17861e.Signature("-", c3087e) : c3087e;
    }
}
