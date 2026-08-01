package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17131e {
    public static final LinkedHashSet ad;

    static {
        Set set = EnumC3702e.f8275e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4972e.mopub.ad(((EnumC3702e) it.next()).f8288e));
        }
        ArrayList m3572catch = AbstractC13480e.m3572catch(AbstractC0206e.adcel.startapp(), AbstractC13480e.m3572catch(AbstractC0206e.yandex.startapp(), AbstractC13480e.m3572catch(AbstractC0206e.purchase.startapp(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = m3572catch.iterator();
        while (it2.hasNext()) {
            C12816e c12816e = (C12816e) it2.next();
            linkedHashSet.add(new C11709e(c12816e.vip(), c12816e.ad.billing()));
        }
        ad = linkedHashSet;
    }
}
