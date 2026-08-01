package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2805e {
    public long[] ad;
    public int vip;

    public /* synthetic */ C2805e() {
        this(16);
    }

    public C2805e(int i) {
        this.ad = i == 0 ? AbstractC9449e.ad : new long[i];
    }

    public final void ad(long j) {
        int i = this.vip + 1;
        long[] jArr = this.ad;
        if (jArr.length < i) {
            this.ad = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.ad;
        int i2 = this.vip;
        jArr2[i2] = j;
        this.vip = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2805e) {
            C2805e c2805e = (C2805e) obj;
            int i = c2805e.vip;
            int i2 = this.vip;
            if (i == i2) {
                long[] jArr = this.ad;
                long[] jArr2 = c2805e.ad;
                C15926e admob = AbstractC3062e.admob(0, i2);
                int i3 = admob.f22523e;
                int i4 = admob.f22522e;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[i3];
            i2 += ((int) (j ^ (j >>> 32))) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
