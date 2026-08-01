package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11541e {
    public static final String adcel;
    public static final C11768e billing;
    public static final String mopub;
    public static final C11541e purchase = new C11541e(new C11768e[0], 0, -9223372036854775807L, 0);
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final C11768e[] appmetrica;
    public final int license;
    public final long metrica;
    public final long vip;

    static {
        C11768e c11768e = new C11768e(0L, -1, -1, new int[0], new C1962e[0], new long[0], 0L, false, new String[0], new C6311e[0], false);
        int[] iArr = c11768e.purchase;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c11768e.billing;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        C1962e[] c1962eArr = (C1962e[]) Arrays.copyOf(c11768e.appmetrica, 0);
        String[] strArr = (String[]) Arrays.copyOf(c11768e.yandex, 0);
        C6311e[] c6311eArr = c11768e.startapp;
        billing = new C11768e(c11768e.ad, 0, c11768e.metrica, copyOf, c1962eArr, copyOf2, c11768e.adcel, c11768e.mopub, strArr, (C6311e[]) Arrays.copyOf(c6311eArr, Math.max(0, c6311eArr.length)), c11768e.advert);
        String str = AbstractC9413e.ad;
        yandex = Integer.toString(1, 36);
        startapp = Integer.toString(2, 36);
        adcel = Integer.toString(3, 36);
        mopub = Integer.toString(4, 36);
    }

    public C11541e(C11768e[] c11768eArr, long j, long j2, int i) {
        this.vip = j;
        this.metrica = j2;
        this.ad = c11768eArr.length + i;
        this.appmetrica = c11768eArr;
        this.license = i;
    }

    public final C11768e ad(int i) {
        int i2 = this.license;
        return i < i2 ? billing : this.appmetrica[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11541e.class != obj.getClass()) {
            return false;
        }
        C11541e c11541e = (C11541e) obj;
        return this.ad == c11541e.ad && this.vip == c11541e.vip && this.metrica == c11541e.metrica && this.license == c11541e.license && Arrays.equals(this.appmetrica, c11541e.appmetrica);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.appmetrica) + (((((((this.ad * 961) + ((int) this.vip)) * 31) + ((int) this.metrica)) * 31) + this.license) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.vip);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            C11768e[] c11768eArr = this.appmetrica;
            if (i >= c11768eArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c11768eArr[i].ad);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < c11768eArr[i].purchase.length; i2++) {
                sb.append("ad(state=");
                int i3 = c11768eArr[i].purchase[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c11768eArr[i].billing[i2]);
                sb.append(')');
                if (i2 < c11768eArr[i].purchase.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c11768eArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
