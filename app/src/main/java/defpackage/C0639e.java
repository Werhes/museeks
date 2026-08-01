package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0639e {
    public final String ad;
    public final ArrayList vip = new ArrayList();
    public C6571e metrica = new C6571e("V", null);

    public C0639e(C3168e c3168e, String str, String str2) {
        this.ad = str2;
    }

    public final void ad(String str, C10796e... c10796eArr) {
        C7639e c7639e;
        if (c10796eArr.length == 0) {
            c7639e = null;
        } else {
            C8950e c8950e = new C8950e(1, new C14515e(8, c10796eArr));
            int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(c8950e, 10));
            if (appmetrica < 16) {
                appmetrica = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
            Iterator it = c8950e.iterator();
            while (true) {
                C2320e c2320e = (C2320e) it;
                if (!c2320e.f5836e.hasNext()) {
                    break;
                }
                C9817e c9817e = (C9817e) c2320e.next();
                linkedHashMap.put(Integer.valueOf(c9817e.ad), (C10796e) c9817e.vip);
            }
            c7639e = new C7639e(linkedHashMap);
        }
        this.vip.add(new C6571e(str, c7639e));
    }

    public final void vip(String str, C10796e... c10796eArr) {
        C8950e c8950e = new C8950e(1, new C14515e(8, c10796eArr));
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(c8950e, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        Iterator it = c8950e.iterator();
        while (true) {
            C2320e c2320e = (C2320e) it;
            if (!c2320e.f5836e.hasNext()) {
                this.metrica = new C6571e(str, new C7639e(linkedHashMap));
                return;
            } else {
                C9817e c9817e = (C9817e) c2320e.next();
                linkedHashMap.put(Integer.valueOf(c9817e.ad), (C10796e) c9817e.vip);
            }
        }
    }
}
