package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3909e {
    public final ArrayList ad;

    public C3909e(ArrayList arrayList) {
        this.ad = new ArrayList(arrayList);
    }

    public static String license(C3909e c3909e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3909e.ad.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15667e) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final boolean ad(Class cls) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((InterfaceC15667e) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList metrica(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            InterfaceC15667e interfaceC15667e = (InterfaceC15667e) it.next();
            if (cls.isAssignableFrom(interfaceC15667e.getClass())) {
                arrayList.add(interfaceC15667e);
            }
        }
        return arrayList;
    }

    public final InterfaceC15667e vip(Class cls) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            InterfaceC15667e interfaceC15667e = (InterfaceC15667e) it.next();
            if (interfaceC15667e.getClass() == cls) {
                return interfaceC15667e;
            }
        }
        return null;
    }
}
