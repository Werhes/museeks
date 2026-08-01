package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2855e {
    public static final int ad(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final C18516e appmetrica(C18516e c18516e) {
        if (!(c18516e instanceof C18516e)) {
            c18516e = null;
        }
        if (c18516e != null) {
            return c18516e;
        }
        AbstractC1889e.vip("Inconsistent composition");
        throw new C14803e(9);
    }

    public static final void billing() {
        throw new ConcurrentModificationException();
    }

    public static final void license(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int metrica(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int purchase(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C3155e) arrayList.get(i4)).ad;
            if (i5 < 0) {
                i5 += i2;
            }
            int yandex = AbstractC7890e.yandex(i5, i);
            if (yandex < 0) {
                i3 = i4 + 1;
            } else {
                if (yandex <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int vip(ArrayList arrayList, int i, int i2) {
        int purchase = purchase(arrayList, i, i2);
        return purchase >= 0 ? purchase : -(purchase + 1);
    }
}
