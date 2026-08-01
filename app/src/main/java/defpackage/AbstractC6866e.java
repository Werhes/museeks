package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6866e {
    protected int memoizedHashCode;

    public static void ad(List list, List list2) {
        Charset charset = AbstractC0352e.ad;
        if (list instanceof InterfaceC6294e) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size = list2.size();
        for (Object obj : list) {
            if (obj == null) {
                String str = "Element at index " + (list2.size() - size) + " is null.";
                for (int size2 = list2.size() - 1; size2 >= size; size2--) {
                    list2.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list2.add(obj);
        }
    }

    public abstract int vip(InterfaceC3028e interfaceC3028e);
}
