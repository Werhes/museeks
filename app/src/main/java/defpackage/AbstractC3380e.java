package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3380e {
    public static final Object ad;
    public static final Set license;
    public static final Set metrica;
    public static final LinkedHashMap vip;

    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, java.lang.Object] */
    static {
        C13579e c13579e = AbstractC0206e.adcel;
        C6571e c6571e = new C6571e(c13579e.ad(C0520e.appmetrica("name")).startapp(), AbstractC4972e.license);
        C6571e c6571e2 = new C6571e(c13579e.ad(C0520e.appmetrica("ordinal")).startapp(), C0520e.appmetrica("ordinal"));
        C6571e c6571e3 = new C6571e(AbstractC2194e.ad(AbstractC0206e.subs, "size"), C0520e.appmetrica("size"));
        C12816e c12816e = AbstractC0206e.f1441interface;
        Map purchase = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, new C6571e(AbstractC2194e.ad(c12816e, "size"), C0520e.appmetrica("size")), new C6571e(AbstractC0206e.appmetrica.ad(C0520e.appmetrica("length")).startapp(), C0520e.appmetrica("length")), new C6571e(AbstractC2194e.ad(c12816e, "keys"), C0520e.appmetrica("keySet")), new C6571e(AbstractC2194e.ad(c12816e, "values"), C0520e.appmetrica("values")), new C6571e(AbstractC2194e.ad(c12816e, "entries"), C0520e.appmetrica("entrySet")), new C6571e(AbstractC2194e.ad(AbstractC0206e.f1444package, "size"), C0520e.appmetrica("length")), new C6571e(AbstractC2194e.ad(AbstractC0206e.f1454transient, "size"), C0520e.appmetrica("length")), new C6571e(AbstractC2194e.ad(AbstractC0206e.f1439import, "size"), C0520e.appmetrica("length")));
        ad = purchase;
        Set<Map.Entry> entrySet = purchase.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C6571e(((C12816e) entry.getKey()).ad.billing(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6571e c6571e4 = (C6571e) it.next();
            C0520e c0520e = (C0520e) c6571e4.f13543e;
            Object obj = linkedHashMap.get(c0520e);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c0520e, obj);
            }
            ((List) obj).add((C0520e) c6571e4.f13544e);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC13480e.premium((Iterable) entry2.getValue()));
        }
        vip = linkedHashMap2;
        ?? r0 = ad;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = C0696e.ad;
            linkedHashSet.add(C0696e.billing(((C12816e) entry3.getKey()).vip().ad).ad().ad((C0520e) entry3.getValue()));
        }
        Set keySet = ad.keySet();
        metrica = keySet;
        Set set = keySet;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C12816e) it2.next()).ad.billing());
        }
        license = AbstractC13480e.m3582e(arrayList2);
    }
}
