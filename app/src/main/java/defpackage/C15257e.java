package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15257e {
    public static final ArrayList appmetrica = new ArrayList();
    public final C3079e ad;
    public boolean license;
    public List metrica;
    public final AbstractC5857e vip;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15257e(defpackage.C3079e r3, defpackage.AbstractC5857e r4) {
        /*
            r2 = this;
            java.util.ArrayList r0 = defpackage.C15257e.appmetrica
            boolean r1 = r0 instanceof defpackage.InterfaceC16555e
            if (r1 == 0) goto L12
            boolean r1 = r0 instanceof defpackage.InterfaceC10519e
            if (r1 == 0) goto Lb
            goto L12
        Lb:
            java.lang.String r3 = "kotlin.collections.MutableList"
            defpackage.AbstractC9476e.admob(r0, r3)
            r3 = 0
            throw r3
        L12:
            r2.<init>(r3, r4, r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1c
            return
        L1c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The shared empty array list has been modified"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15257e.<init>(eؕؒٓ, eؘٕۘ):void");
    }

    public C15257e(C3079e c3079e, AbstractC5857e abstractC5857e, List list) {
        this.ad = c3079e;
        this.vip = abstractC5857e;
        this.metrica = list;
        this.license = true;
    }

    public final void ad(List list) {
        List list2 = this.metrica;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(list2.size() + arrayList.size());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list.add(list2.get(i));
        }
    }

    public final String toString() {
        return "Phase `" + this.ad.ad + "`, " + this.metrica.size() + " handlers";
    }
}
