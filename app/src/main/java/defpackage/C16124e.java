package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16124e implements InterfaceC14956e {
    public final ArrayList ad;

    public C16124e(ArrayList arrayList) {
        this.ad = arrayList;
    }

    @Override // defpackage.InterfaceC14956e
    public final List ad(C12816e c12816e) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.ad) {
            if (AbstractC7890e.billing(((AbstractC14941e) ((InterfaceC9646e) obj)).f29618e, c12816e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC14956e
    public final Collection crashlytics(C12816e c12816e, Function1 function1) {
        return AbstractC7762e.Signature(AbstractC7762e.startapp(new C2167e(new C1356e(1, this.ad), C8865e.f17802e), new C0025e(c12816e, 1)));
    }

    @Override // defpackage.InterfaceC14956e
    public final void metrica(C12816e c12816e, ArrayList arrayList) {
        for (Object obj : this.ad) {
            if (AbstractC7890e.billing(((AbstractC14941e) ((InterfaceC9646e) obj)).f29618e, c12816e)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.InterfaceC14956e
    public final boolean vip(C12816e c12816e) {
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC7890e.billing(((AbstractC14941e) ((InterfaceC9646e) it.next())).f29618e, c12816e)) {
                return false;
            }
        }
        return true;
    }
}
