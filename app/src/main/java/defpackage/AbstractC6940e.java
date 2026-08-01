package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6940e {
    public static final LinkedHashMap ad;
    public static final LinkedHashMap vip;

    static {
        C14677e c14677e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ad = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        vip = linkedHashMap2;
        C14677e c14677e2 = C14677e.license;
        linkedHashMap.put(1L, c14677e2);
        linkedHashMap2.put(c14677e2, Collections.singletonList(1L));
        linkedHashMap.put(2L, C14677e.appmetrica);
        linkedHashMap2.put(linkedHashMap.get(2L), Collections.singletonList(2L));
        C14677e c14677e3 = C14677e.purchase;
        linkedHashMap.put(4L, c14677e3);
        linkedHashMap2.put(c14677e3, Collections.singletonList(4L));
        C14677e c14677e4 = C14677e.billing;
        linkedHashMap.put(8L, c14677e4);
        linkedHashMap2.put(c14677e4, Collections.singletonList(8L));
        List startapp = AbstractC6874e.startapp(64L, 128L, 16L, 32L);
        Iterator it = startapp.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c14677e = C14677e.yandex;
            if (!hasNext) {
                break;
            } else {
                ad.put(Long.valueOf(((Number) it.next()).longValue()), c14677e);
            }
        }
        vip.put(c14677e, startapp);
        List startapp2 = AbstractC6874e.startapp(1024L, 2048L, 256L, 512L);
        Iterator it2 = startapp2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            C14677e c14677e5 = C14677e.startapp;
            if (!hasNext2) {
                vip.put(c14677e5, startapp2);
                return;
            }
            ad.put(Long.valueOf(((Number) it2.next()).longValue()), c14677e5);
        }
    }

    public static Long ad(C14677e c14677e, DynamicRangeProfiles dynamicRangeProfiles) {
        List list = (List) vip.get(c14677e);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(longValue))) {
                return Long.valueOf(longValue);
            }
        }
        return null;
    }
}
