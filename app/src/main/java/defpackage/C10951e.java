package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10951e {
    public final HashMap ad = new HashMap();
    public final HashMap vip;

    public C10951e(HashMap hashMap) {
        this.vip = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC14621e enumC14621e = (EnumC14621e) entry.getValue();
            List list = (List) this.ad.get(enumC14621e);
            if (list == null) {
                list = new ArrayList();
                this.ad.put(enumC14621e, list);
            }
            list.add((C3591e) entry.getKey());
        }
    }

    public static void ad(List list, InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C3591e c3591e = (C3591e) list.get(size);
                Method method = c3591e.vip;
                try {
                    int i = c3591e.ad;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC16400e);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC16400e, enumC14621e);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
