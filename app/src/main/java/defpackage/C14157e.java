package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14157e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f27995e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C17647e f27993e = new C17647e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final long f27992e = AbstractC0326e.purchase(4611686018427387903L);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final long f27994e = AbstractC0326e.purchase(-4611686018427387903L);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final long f27991e = 9223372036854759646L;

    public static final long ad(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long vip = AbstractC0326e.vip(j, j4);
        if (-4611686018426L > vip || vip >= 4611686018427L) {
            return AbstractC0326e.purchase(vip);
        }
        return AbstractC0326e.yandex((vip * j3) + (j2 - (j4 * j3)));
    }

    public static final long adcel(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = AbstractC4193e.ad;
        return j2;
    }

    public static final int appmetrica(long j) {
        if (purchase(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final long billing(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? ad(j >> 1, j2 >> 1) : ad(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? AbstractC0326e.purchase(j3 / 1000000) : AbstractC0326e.yandex(j3);
        }
        long vip = AbstractC0326e.vip(j >> 1, j2 >> 1);
        if (vip != 9223372036854759646L) {
            return (vip == 4611686018427387903L || vip == -4611686018427387903L) ? AbstractC0326e.purchase(vip) : AbstractC0326e.billing(vip);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    public static final long license(long j) {
        return ((((int) j) & 1) != 1 || purchase(j)) ? yandex(j, EnumC15934e.MILLISECONDS) : j >> 1;
    }

    public static int metrica(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC7890e.startapp(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean purchase(long j) {
        return j == f27992e || j == f27994e;
    }

    public static String startapp(long j) {
        long j2;
        int yandex;
        if (j == 0) {
            return "0s";
        }
        if (j == f27992e) {
            return "Infinity";
        }
        if (j == f27994e) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long adcel = j < 0 ? adcel(j) : j;
        long yandex2 = yandex(adcel, EnumC15934e.DAYS);
        int yandex3 = purchase(adcel) ? 0 : (int) (yandex(adcel, EnumC15934e.HOURS) % 24);
        if (purchase(adcel)) {
            j2 = 0;
            yandex = 0;
        } else {
            j2 = 0;
            yandex = (int) (yandex(adcel, EnumC15934e.MINUTES) % 60);
        }
        int yandex4 = purchase(adcel) ? 0 : (int) (yandex(adcel, EnumC15934e.SECONDS) % 60);
        int appmetrica = appmetrica(adcel);
        boolean z2 = yandex2 != j2;
        boolean z3 = yandex3 != 0;
        boolean z4 = yandex != 0;
        boolean z5 = (yandex4 == 0 && appmetrica == 0) ? false : true;
        if (z2) {
            sb.append(yandex2);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(yandex3);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(yandex);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (yandex4 != 0 || z2 || z3 || z4) {
                vip(sb, yandex4, appmetrica, 9, "s", false);
            } else if (appmetrica >= 1000000) {
                vip(sb, appmetrica / 1000000, appmetrica % 1000000, 6, "ms", false);
            } else if (appmetrica >= 1000) {
                vip(sb, appmetrica / 1000, appmetrica % 1000, 3, "us", false);
            } else {
                sb.append(appmetrica);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final void vip(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String m1850abstract = AbstractC5304e.m1850abstract(i3, String.valueOf(i2));
            int i4 = -1;
            int length = m1850abstract.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (m1850abstract.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) m1850abstract, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) m1850abstract, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final long yandex(long j, EnumC15934e enumC15934e) {
        if (j == f27992e) {
            return Long.MAX_VALUE;
        }
        if (j == f27994e) {
            return Long.MIN_VALUE;
        }
        return enumC15934e.f31392e.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC15934e.NANOSECONDS : EnumC15934e.MILLISECONDS).f31392e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return metrica(this.f27995e, ((C14157e) obj).f27995e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14157e) {
            return this.f27995e == ((C14157e) obj).f27995e;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27995e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return startapp(this.f27995e);
    }
}
