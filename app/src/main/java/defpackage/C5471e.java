package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5471e implements Comparable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C5471e f11744e = new C5471e(-31557014167219200L, 0);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C5471e f11745e = new C5471e(31556889864403199L, 999999999);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f11746e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f11747e;

    public C5471e(long j, int i) {
        this.f11747e = j;
        this.f11746e = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5471e c5471e) {
        int startapp = AbstractC7890e.startapp(this.f11747e, c5471e.f11747e);
        return startapp != 0 ? startapp : AbstractC7890e.yandex(this.f11746e, c5471e.f11746e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5471e)) {
            return false;
        }
        C5471e c5471e = (C5471e) obj;
        return this.f11747e == c5471e.f11747e && this.f11746e == c5471e.f11746e;
    }

    public final int hashCode() {
        long j = this.f11747e;
        return (this.f11746e * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final long metrica() {
        long j = this.f11747e;
        int i = this.f11746e;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f11747e;
        long j3 = j2 / 86400;
        long j4 = 0;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j5 = j2 % 86400;
        int i = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = (j3 + 719528) - 60;
        if (j6 < 0) {
            long j7 = 146097;
            long j8 = ((j6 + 1) / j7) - 1;
            j = 0;
            j4 = 400 * j8;
            j6 += (-j8) * j7;
        } else {
            j = 0;
        }
        long j9 = 400;
        long j10 = ((j9 * j6) + 591) / 146097;
        long j11 = 365;
        long j12 = 4;
        long j13 = 100;
        long j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        if (j14 < j) {
            j10--;
            j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        }
        int i2 = (int) j14;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j10 + j4 + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + ModuleDescriptor.MODULE_VERSION);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - ModuleDescriptor.MODULE_VERSION);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        AbstractC12501e.license(sb, sb, i4);
        sb.append('-');
        AbstractC12501e.license(sb, sb, i5);
        sb.append('T');
        AbstractC12501e.license(sb, sb, i7);
        sb.append(':');
        AbstractC12501e.license(sb, sb, i9);
        sb.append(':');
        AbstractC12501e.license(sb, sb, i10);
        int i12 = this.f11746e;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i13 = i11 + 1;
                iArr = AbstractC12501e.ad;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    public final C5471e vip(long j) {
        C17647e c17647e = C14157e.f27993e;
        long yandex = C14157e.yandex(j, EnumC15934e.SECONDS);
        int appmetrica = C14157e.appmetrica(j);
        if (yandex == 0 && appmetrica == 0) {
            return this;
        }
        long j2 = this.f11747e;
        long j3 = j2 + yandex;
        return ((j2 ^ j3) >= 0 || (yandex ^ j2) < 0) ? C13023e.metrica(j3, this.f11746e + appmetrica) : j > 0 ? f11745e : f11744e;
    }
}
