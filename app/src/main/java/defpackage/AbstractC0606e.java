package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0606e {
    public static final WeakHashMap ad = new WeakHashMap();
    public static final WeakHashMap vip = new WeakHashMap();

    public static void ad(Throwable th) {
        Throwable th2;
        C11993e c11993e;
        Closeable closeable;
        WeakHashMap weakHashMap = vip;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(th2 != null));
        }
        if (th2 != null) {
            return;
        }
        WeakHashMap weakHashMap2 = ad;
        synchronized (weakHashMap2) {
            Throwable th3 = th;
            while (th3 != null) {
                try {
                    if (weakHashMap2.containsKey(th3)) {
                        break;
                    } else {
                        th3 = th3.getCause();
                    }
                } finally {
                }
            }
            if (th3 == null) {
                c11993e = null;
            } else {
                weakHashMap2.put(th, (C7656e) weakHashMap2.get(th3));
                c11993e = new C11993e(24);
            }
        }
        if (c11993e != null || (closeable = AbstractC5076e.vip().vip) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = AbstractC5076e.vip().vip; closeable != null; closeable = ((AbstractC2228e) closeable).f5683e) {
            arrayList.add(closeable);
        }
        UUID uuid = ((AbstractC2228e) ((InterfaceC4766e) arrayList.get(0))).f5681e;
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        ((InterfaceC4766e) arrayList.get(0)).getClass();
        C13304e admob = AbstractC17475e.admob(arrayList.size());
        C13304e admob2 = AbstractC17475e.admob(arrayList.size());
        for (InterfaceC4766e interfaceC4766e : AbstractC10589e.appmetrica(arrayList)) {
            admob2.metrica(((AbstractC2228e) interfaceC4766e).f5682e);
            admob.metrica(interfaceC4766e.billing());
        }
        WeakHashMap weakHashMap3 = ad;
        synchronized (weakHashMap3) {
            try {
                C1410e billing = admob2.billing();
                if (billing == null) {
                    throw new NullPointerException("Null spansNames");
                }
                C1410e billing2 = admob.billing();
                if (billing2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new C7656e(billing, billing2, uuid));
            } finally {
            }
        }
    }
}
