package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10064e extends AbstractC14966e {
    public static List adcel(Map map) {
        int size = map.size();
        C13664e c13664e = C13664e.f27089e;
        if (size == 0) {
            return c13664e;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c13664e;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(new C6571e(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C6571e(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C6571e(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map advert(Map map) {
        int size = map.size();
        if (size == 0) {
            return C9139e.f18290e;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static int appmetrica(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static LinkedHashMap billing(C6571e... c6571eArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica(c6571eArr.length));
        startapp(linkedHashMap, c6571eArr);
        return linkedHashMap;
    }

    public static Object license(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map mopub(List list) {
        boolean premium = AbstractC0869e.premium(list);
        C9139e c9139e = C9139e.f18290e;
        if (premium) {
            int size = list.size();
            if (size == 0) {
                return c9139e;
            }
            if (size == 1) {
                C6571e c6571e = (C6571e) (AbstractC0869e.premium(list) ? list.get(0) : list.iterator().next());
                return Collections.singletonMap(c6571e.f13544e, c6571e.f13543e);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica(list.size()));
            smaato(list, linkedHashMap);
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        smaato(list, linkedHashMap2);
        int size2 = linkedHashMap2.size();
        if (size2 == 0) {
            return c9139e;
        }
        if (size2 != 1) {
            return linkedHashMap2;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Map purchase(C6571e... c6571eArr) {
        if (c6571eArr.length <= 0) {
            return C9139e.f18290e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica(c6571eArr.length));
        startapp(linkedHashMap, c6571eArr);
        return linkedHashMap;
    }

    public static void smaato(Iterable iterable, HashMap hashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            hashMap.put(c6571e.f13544e, c6571e.f13543e);
        }
    }

    public static final void startapp(HashMap hashMap, C6571e[] c6571eArr) {
        for (C6571e c6571e : c6571eArr) {
            hashMap.put(c6571e.f13544e, c6571e.f13543e);
        }
    }

    public static LinkedHashMap yandex(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }
}
