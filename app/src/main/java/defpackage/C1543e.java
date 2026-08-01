package defpackage;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543e {
    public float[] ad;
    public int vip;

    public C1543e(int i) {
        this.ad = i == 0 ? AbstractC17173e.ad : new float[i];
    }

    public static String metrica(C1543e c1543e, int i) {
        int i2 = i & 2;
        String str = BuildConfig.FLAVOR;
        String str2 = i2 != 0 ? BuildConfig.FLAVOR : "[";
        if ((i & 4) == 0) {
            str = "]";
        }
        c1543e.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        float[] fArr = c1543e.ad;
        int i3 = c1543e.vip;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append((CharSequence) str);
                break;
            }
            float f = fArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i4++;
        }
        return sb.toString();
    }

    public final void ad(float f) {
        int i = this.vip + 1;
        float[] fArr = this.ad;
        if (fArr.length < i) {
            this.ad = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.ad;
        int i2 = this.vip;
        fArr2[i2] = f;
        this.vip = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1543e) {
            C1543e c1543e = (C1543e) obj;
            int i = c1543e.vip;
            int i2 = this.vip;
            if (i == i2) {
                float[] fArr = this.ad;
                float[] fArr2 = c1543e.ad;
                C15926e admob = AbstractC3062e.admob(0, i2);
                int i3 = admob.f22523e;
                int i4 = admob.f22522e;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
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
        float[] fArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.floatToIntBits(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return metrica(this, 25);
    }

    public final float vip(int i) {
        if (i >= 0 && i < this.vip) {
            return this.ad[i];
        }
        AbstractC14783e.yandex("Index must be between 0 and size");
        throw null;
    }
}
