package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10707e {
    public final ArrayList ad(int i, int i2) {
        int i3 = i - (2 * i2);
        int i4 = i3 / 3;
        int i5 = i3 % 3;
        ArrayList arrayList = new ArrayList(3);
        int i6 = 0;
        while (i6 < 3) {
            arrayList.add(Integer.valueOf((i6 < i5 ? 1 : 0) + i4));
            i6++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C10707e;
    }

    public final int hashCode() {
        return -3;
    }
}
