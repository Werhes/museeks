package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6889e {
    public static final Comparator[] ad;
    public static final C7123e vip;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new C3751e(7, new C3751e(i == 0 ? C11021e.f21840e : C11021e.f21835e));
            i++;
        }
        ad = comparatorArr;
        vip = C7123e.f14589e;
    }

    public static final void ad(C6071e c6071e, ArrayList arrayList, C17097e c17097e, C17097e c17097e2, C3123e c3123e) {
        C0500e c0500e = c6071e.license;
        Object billing = c0500e.f2578e.billing(AbstractC9058e.amazon);
        if (billing == null) {
            billing = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) billing).booleanValue();
        if ((booleanValue || ((Boolean) c17097e2.invoke(c6071e)).booleanValue()) && ((Boolean) c17097e.invoke(c6071e)).booleanValue()) {
            arrayList.add(c6071e);
        }
        if (booleanValue) {
            c3123e.startapp(c6071e.purchase, vip(c6071e, c17097e, c17097e2, C6071e.adcel(7, c6071e)));
            return;
        }
        List adcel = C6071e.adcel(7, c6071e);
        int size = adcel.size();
        for (int i = 0; i < size; i++) {
            ad((C6071e) adcel.get(i), arrayList, c17097e, c17097e2, c3123e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9 A[LOOP:1: B:11:0x0044->B:29:0x00e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[EDGE_INSN: B:30:0x00ef->B:31:0x00ef BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00e9], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList vip(defpackage.C6071e r18, defpackage.C17097e r19, defpackage.C17097e r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6889e.vip(eٌؘۧ, eْٗٚ, eْٗٚ, java.util.List):java.util.ArrayList");
    }
}
