package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۨٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14412e implements InterfaceC10471e {
    public final ArrayList ad;

    public C14412e(ArrayList arrayList) {
        this.ad = arrayList;
    }

    @Override // defpackage.InterfaceC10471e
    public final boolean test(Object obj) {
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC10471e) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
