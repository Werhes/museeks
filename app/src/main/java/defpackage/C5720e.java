package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5720e {
    public final Map ad;
    public final Map vip;

    public C5720e() {
        this.ad = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.vip = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public C5720e(Map map, Map map2) {
        this.ad = map;
        this.vip = map2;
    }

    public static C17424e ad() {
        C17424e c17424e = new C17424e(17, false);
        c17424e.f34142e = new HashMap();
        c17424e.f34141e = new HashMap();
        return c17424e;
    }

    public void license(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.ad;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.vip;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).billing(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C8988e) entry2.getKey()).metrica(new C10427e(status));
            }
        }
    }

    public Enum metrica(Object obj) {
        Enum r0 = (Enum) this.vip.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException(AbstractC1634e.advert(obj, "Unable to convert object enum: "));
    }

    public Object vip(Enum r4) {
        Object obj = this.ad.get(r4);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + r4);
    }
}
