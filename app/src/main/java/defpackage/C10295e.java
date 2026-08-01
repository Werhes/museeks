package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10295e extends AbstractC8530e {
    public final C12816e metrica;
    public final InterfaceC5334e vip;

    public C10295e(InterfaceC5334e interfaceC5334e, C12816e c12816e) {
        this.vip = interfaceC5334e;
        this.metrica = c12816e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set license() {
        return C3295e.f7451e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        if (c4942e.ad(C4942e.yandex)) {
            C12816e c12816e = this.metrica;
            if (!c12816e.ad.metrica() || !c4942e.ad.contains(C5680e.ad)) {
                InterfaceC5334e interfaceC5334e = this.vip;
                Collection crashlytics = interfaceC5334e.crashlytics(c12816e, function1);
                ArrayList arrayList = new ArrayList(crashlytics.size());
                Iterator it = crashlytics.iterator();
                while (it.hasNext()) {
                    C0520e billing = ((C12816e) it.next()).ad.billing();
                    if (((Boolean) function1.invoke(billing)).booleanValue()) {
                        C14887e c14887e = null;
                        if (!billing.f2666e) {
                            C14887e c14887e2 = (C14887e) interfaceC5334e.mo1886e(c12816e.ad(billing));
                            C0394e c0394e = c14887e2.f29501e;
                            InterfaceC8614e interfaceC8614e = C14887e.f29497e[1];
                            if (!((Boolean) c0394e.invoke()).booleanValue()) {
                                c14887e = c14887e2;
                            }
                        }
                        AbstractC9386e.vip(arrayList, c14887e);
                    }
                }
                return arrayList;
            }
        }
        return C13664e.f27089e;
    }

    public final String toString() {
        return "subpackages of " + this.metrica + " from " + this.vip;
    }
}
