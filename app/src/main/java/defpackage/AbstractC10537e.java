package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10537e {
    public static final LinkedHashMap ad;
    public static final Map vip;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ad = linkedHashMap;
        vip(C12269e.signatures, ad("java.util.ArrayList", "java.util.LinkedList"));
        vip(C12269e.tapsense, ad("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        vip(C12269e.isVip, ad("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C12816e c12816e = new C12816e("java.util.function.Function");
        vip(new C11709e(c12816e.vip(), c12816e.ad.billing()), ad("java.util.function.UnaryOperator"));
        C12816e c12816e2 = new C12816e("java.util.function.BiFunction");
        vip(new C11709e(c12816e2.vip(), c12816e2.ad.billing()), ad("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C6571e(((C11709e) entry.getKey()).ad(), ((C11709e) entry.getValue()).ad()));
        }
        vip = AbstractC10064e.mopub(arrayList);
    }

    public static ArrayList ad(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C12816e c12816e = new C12816e(str);
            arrayList.add(new C11709e(c12816e.vip(), c12816e.ad.billing()));
        }
        return arrayList;
    }

    public static void vip(C11709e c11709e, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ad.put(next, c11709e);
        }
    }
}
