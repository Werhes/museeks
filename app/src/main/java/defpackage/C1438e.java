package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1438e {
    public final C7639e ad;
    public final C1438e license;
    public final String metrica;
    public final List vip;

    public C1438e(C7639e c7639e, List list, String str) {
        this.ad = c7639e;
        this.vip = list;
        this.metrica = str;
        C1438e c1438e = null;
        if (str != null) {
            C7639e ad = c7639e != null ? c7639e.ad() : null;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7639e c7639e2 = (C7639e) it.next();
                arrayList.add(c7639e2 != null ? c7639e2.ad() : null);
            }
            c1438e = new C1438e(ad, arrayList, null);
        }
        this.license = c1438e;
    }
}
