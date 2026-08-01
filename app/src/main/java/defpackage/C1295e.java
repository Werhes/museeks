package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295e {
    public final List ad;
    public final int metrica;
    public final float[] vip;

    public C1295e(List list, float[] fArr) {
        this.ad = list;
        this.vip = fArr;
        if (list.size() != fArr.length) {
            AbstractC8889e.ad("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + AbstractC1660e.m662abstract(fArr));
        }
        this.metrica = fArr.length;
    }

    public final Object ad(float f) {
        float[] fArr = this.vip;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.ad.get(i2);
    }

    public final float appmetrica() {
        float[] fArr = this.vip;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.min(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295e)) {
            return false;
        }
        C1295e c1295e = (C1295e) obj;
        return AbstractC7890e.billing(this.ad, c1295e.ad) && Arrays.equals(this.vip, c1295e.vip) && this.metrica == c1295e.metrica;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.vip) + (this.ad.hashCode() * 31)) * 31) + this.metrica;
    }

    public final float license() {
        float[] fArr = this.vip;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public final boolean metrica(Object obj) {
        return this.ad.indexOf(obj) != -1;
    }

    public final float purchase(Object obj) {
        int indexOf = this.ad.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.vip;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.metrica
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List r4 = r6.ad
            java.lang.Object r4 = defpackage.AbstractC13480e.m3592native(r1, r4)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            if (r1 < 0) goto L29
            float[] r4 = r6.vip
            int r5 = r4.length
            if (r1 >= r5) goto L29
            r4 = r4[r1]
            goto L2b
        L29:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L2b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r1 = "})"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1295e.toString():java.lang.String");
    }

    public final Object vip(float f, boolean z) {
        float[] fArr = this.vip;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.ad.get(i2);
    }
}
