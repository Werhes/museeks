package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC17056e {
    static {
        SparseArray sparseArray = InterfaceC14080e.ad;
    }

    public static void ad(int i, InterfaceC14080e interfaceC14080e) {
        SparseArray sparseArray = InterfaceC14080e.ad;
        List list = (List) sparseArray.get(i);
        if (list == null) {
            list = new ArrayList();
            sparseArray.put(i, list);
        }
        list.add(interfaceC14080e);
    }

    public static void vip(int i, final Class cls, final InterfaceC14080e interfaceC14080e) {
        SparseArray sparseArray = InterfaceC14080e.ad;
        List list = (List) sparseArray.get(i);
        if (list == null) {
            list = new ArrayList();
            sparseArray.put(i, list);
        }
        list.add(new InterfaceC14080e() { // from class: eِؐٞ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i2) {
                if (cls.isInstance(view)) {
                    interfaceC14080e.ad(view, i2);
                }
            }
        });
    }
}
