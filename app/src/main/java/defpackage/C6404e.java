package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6404e {
    public final ArrayList ad = new ArrayList();

    public static void vip(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    vip(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void ad(C4637e c4637e) {
        this.ad.add(c4637e);
    }

    public final List metrica(ArrayList arrayList) {
        EnumC2392e enumC2392e;
        EnumC2392e enumC2392e2;
        EnumC2392e enumC2392e3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.ad;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        vip(arrayList3, size2, new int[size2], 0);
        C4637e[] c4637eArr = new C4637e[arrayList.size()];
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z2 = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    C4637e c4637e = (C4637e) arrayList2.get(i);
                    C4637e c4637e2 = (C4637e) arrayList.get(iArr[i]);
                    c4637e.getClass();
                    z2 &= c4637e2.vip.f30339e <= c4637e.vip.f30339e && c4637e2.ad == c4637e.ad && ((enumC2392e = c4637e.metrica) == (enumC2392e2 = EnumC2392e.DEFAULT) || (enumC2392e3 = c4637e2.metrica) == enumC2392e2 || enumC2392e3 == enumC2392e);
                    if (!z2) {
                        break;
                    }
                    c4637eArr[iArr[i]] = (C4637e) arrayList2.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(c4637eArr);
        }
        return null;
    }
}
