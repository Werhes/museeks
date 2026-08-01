package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14969e implements InterfaceC16359e {
    public final C17070e ad;
    public final LinkedHashMap appmetrica;
    public final LinkedHashMap license;
    public final C17877e metrica;
    public final LinkedHashMap purchase;
    public final Function1 vip;

    public C14969e(C17070e c17070e, Function1 function1) {
        this.ad = c17070e;
        this.vip = function1;
        C17877e c17877e = new C17877e(10, this);
        this.metrica = c17877e;
        C12150e startapp = AbstractC7762e.startapp(new C1356e(1, c17070e.metrica()), c17877e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C10649e c10649e = new C10649e(startapp);
        while (c10649e.hasNext()) {
            Object next = c10649e.next();
            C0520e vip = ((C6185e) next).vip();
            Object obj = linkedHashMap.get(vip);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(vip, obj);
            }
            ((List) obj).add(next);
        }
        this.license = linkedHashMap;
        C12150e startapp2 = AbstractC7762e.startapp(new C1356e(1, this.ad.ad()), this.vip);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C10649e c10649e2 = new C10649e(startapp2);
        while (c10649e2.hasNext()) {
            Object next2 = c10649e2.next();
            linkedHashMap2.put(((C1214e) next2).vip(), next2);
        }
        this.appmetrica = linkedHashMap2;
        ArrayList purchase = this.ad.purchase();
        Function1 function12 = this.vip;
        ArrayList arrayList = new ArrayList();
        Iterator it = purchase.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) function12.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((C13313e) next4).vip(), next4);
        }
        this.purchase = linkedHashMap3;
    }

    @Override // defpackage.InterfaceC16359e
    public final Set ad() {
        C12150e startapp = AbstractC7762e.startapp(new C1356e(1, this.ad.metrica()), this.metrica);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10649e c10649e = new C10649e(startapp);
        while (c10649e.hasNext()) {
            linkedHashSet.add(((C6185e) c10649e.next()).vip());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC16359e
    public final Set appmetrica() {
        return this.purchase.keySet();
    }

    @Override // defpackage.InterfaceC16359e
    public final C1214e license(C0520e c0520e) {
        return (C1214e) this.appmetrica.get(c0520e);
    }

    @Override // defpackage.InterfaceC16359e
    public final Collection metrica(C0520e c0520e) {
        List list = (List) this.license.get(c0520e);
        return list != null ? list : C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC16359e
    public final Set purchase() {
        C12150e startapp = AbstractC7762e.startapp(new C1356e(1, this.ad.ad()), this.vip);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10649e c10649e = new C10649e(startapp);
        while (c10649e.hasNext()) {
            linkedHashSet.add(((C1214e) c10649e.next()).vip());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC16359e
    public final C13313e vip(C0520e c0520e) {
        return (C13313e) this.purchase.get(c0520e);
    }
}
