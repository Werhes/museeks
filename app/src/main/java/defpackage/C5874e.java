package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5874e {
    public final /* synthetic */ int ad;
    public final AbstractMap vip;

    public C5874e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new HashMap();
                return;
            default:
                this.vip = new ConcurrentHashMap();
                return;
        }
    }

    public final Object ad(C8208e c8208e, Function0 function0) {
        switch (this.ad) {
            case 0:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.vip;
                Object obj = concurrentHashMap.get(c8208e);
                if (obj != null) {
                    return obj;
                }
                Object invoke = function0.invoke();
                Object putIfAbsent = concurrentHashMap.putIfAbsent(c8208e, invoke);
                return putIfAbsent == null ? invoke : putIfAbsent;
            default:
                HashMap hashMap = (HashMap) this.vip;
                Object obj2 = hashMap.get(c8208e);
                if (obj2 != null) {
                    return obj2;
                }
                Object invoke2 = function0.invoke();
                Object put = hashMap.put(c8208e, invoke2);
                return put == null ? invoke2 : put;
        }
    }

    public final Map appmetrica() {
        switch (this.ad) {
            case 0:
                return (ConcurrentHashMap) this.vip;
            default:
                return (HashMap) this.vip;
        }
    }

    public final void billing(C8208e c8208e, Object obj) {
        appmetrica().put(c8208e, obj);
    }

    public final List license() {
        return AbstractC13480e.m3575continue(appmetrica().keySet());
    }

    public final Object metrica(C8208e c8208e) {
        Object purchase = purchase(c8208e);
        if (purchase != null) {
            return purchase;
        }
        throw new IllegalStateException("No instance for key " + c8208e);
    }

    public final Object purchase(C8208e c8208e) {
        return appmetrica().get(c8208e);
    }

    public final boolean vip(C8208e c8208e) {
        return appmetrica().containsKey(c8208e);
    }
}
