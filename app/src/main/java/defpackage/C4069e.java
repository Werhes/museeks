package defpackage;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4069e extends C17015e implements InterfaceC13659e {
    /* JADX WARN: Type inference failed for: r0v0, types: [eٗٔۥ, eّؖۛ] */
    public static C4069e license() {
        return new C17015e(new TreeMap(C17015e.f33329e));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [eٗٔۥ, eّؖۛ] */
    public static C4069e purchase(InterfaceC12330e interfaceC12330e) {
        TreeMap treeMap = new TreeMap(C17015e.f33329e);
        for (C14326e c14326e : interfaceC12330e.admob()) {
            Set<EnumC13734e> inmobi = interfaceC12330e.inmobi(c14326e);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC13734e enumC13734e : inmobi) {
                arrayMap.put(enumC13734e, interfaceC12330e.premium(c14326e, enumC13734e));
            }
            treeMap.put(c14326e, arrayMap);
        }
        return new C17015e(treeMap);
    }

    public final void adcel(C14326e c14326e) {
        this.f33330e.remove(c14326e);
    }

    public final void billing(C14326e c14326e, EnumC13734e enumC13734e, Object obj) {
        EnumC13734e enumC13734e2;
        TreeMap treeMap = this.f33330e;
        Map map = (Map) treeMap.get(c14326e);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c14326e, arrayMap);
            arrayMap.put(enumC13734e, obj);
            return;
        }
        EnumC13734e enumC13734e3 = (EnumC13734e) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC13734e3), obj) || enumC13734e3 != (enumC13734e2 = EnumC13734e.f27213e) || enumC13734e != enumC13734e2) {
            map.put(enumC13734e, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + c14326e.ad + ", existing value (" + enumC13734e3 + ")=" + map.get(enumC13734e3) + ", conflicting (" + enumC13734e + ")=" + obj);
    }

    public final void yandex(C14326e c14326e, Object obj) {
        billing(c14326e, EnumC13734e.f27215e, obj);
    }
}
