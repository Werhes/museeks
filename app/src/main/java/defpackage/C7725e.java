package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7725e implements InterfaceC14232e {
    public final List ad;

    public C7725e(List list) {
        this.ad = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC14232e
    public C12469e ad() {
        List list = this.ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7351e) it.next()).ad());
        }
        return arrayList.size() == 1 ? (C12469e) AbstractC13480e.m3590instanceof(arrayList) : new Object();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7725e) {
            return AbstractC7890e.billing(this.ad, ((C7725e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("ConcatenatedFormatStructure("), AbstractC13480e.m3608try(this.ad, ", ", null, null, null, 62), ')');
    }

    @Override // defpackage.InterfaceC14232e
    public C6195e vip() {
        List list = this.ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7351e) it.next()).vip());
        }
        return AbstractC16155e.vip(arrayList);
    }
}
