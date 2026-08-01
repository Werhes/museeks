package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11725e {
    public static final C11725e metrica;
    public static final C11725e vip;
    public final LinkedHashSet ad;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C14465e(0));
        vip = new C11725e(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C14465e(1));
        metrica = new C11725e(linkedHashSet2);
    }

    public C11725e(LinkedHashSet linkedHashSet) {
        this.ad = linkedHashSet;
    }

    public final ArrayList ad(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C14465e c14465e = (C14465e) it.next();
            List<InterfaceC12424e> unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            c14465e.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC12424e interfaceC12424e : unmodifiableList) {
                AbstractC4265e.license(interfaceC12424e instanceof InterfaceC12424e, "The camera info doesn't contain internal implementation.");
                if (interfaceC12424e.admob() == c14465e.ad) {
                    arrayList3.add(interfaceC12424e);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final InterfaceC2881e metrica(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2881e) it.next()).vip());
        }
        ArrayList ad = ad(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC2881e interfaceC2881e = (InterfaceC2881e) it2.next();
            if (ad.contains(interfaceC2881e.vip())) {
                linkedHashSet2.add(interfaceC2881e);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC2881e) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            InterfaceC12424e subscription = ((InterfaceC2881e) it4.next()).subscription();
            sb.append(" Id:" + subscription.billing() + "  Lens:" + subscription.admob());
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.ad;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            C14465e c14465e = (C14465e) it5.next();
            sb3.append(" Id:");
            c14465e.getClass();
            sb3.append(C14465e.vip);
            if (c14465e instanceof C14465e) {
                sb3.append(" LensFilter:");
                sb3.append(c14465e.ad);
            }
        }
        throw new IllegalArgumentException(AbstractC17861e.admob("No available camera can be found. ", sb2, " ", sb3.toString()));
    }

    public final Integer vip() {
        Iterator it = this.ad.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C14465e c14465e = (C14465e) it.next();
            if (c14465e instanceof C14465e) {
                Integer valueOf = Integer.valueOf(c14465e.ad);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }
}
