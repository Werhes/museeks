package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12383e {
    public final C8430e ad;
    public final C5363e appmetrica;
    public final C8430e license;
    public final C5373e metrica;
    public final C5363e purchase;
    public final C5241e vip;

    public C12383e(C8430e c8430e, C5241e c5241e, C5373e c5373e, C8430e c8430e2) {
        this.ad = c8430e;
        this.vip = c5241e;
        this.metrica = c5373e;
        this.license = c8430e2;
        final int i = 0;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eٖؑٞ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12383e f2510e;

            {
                this.f2510e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (C12701e) this.f2510e.ad.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C12383e c12383e = this.f2510e;
                        for (Map.Entry entry : ((Map) c12383e.license.get()).entrySet()) {
                            C2740e c2740e = (C2740e) entry.getKey();
                            AbstractC5113e abstractC5113e = (AbstractC5113e) entry.getValue();
                            C12550e c12550e = (C12550e) c12383e.ad().f25439e.f5445e.get(c2740e);
                            if (c12550e != null) {
                                linkedHashMap.put(abstractC5113e, new C13269e(c12550e.ad));
                            }
                        }
                        return AbstractC10064e.advert(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.purchase = new C5363e(new Function0(this) { // from class: eٖؑٞ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12383e f2510e;

            {
                this.f2510e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (C12701e) this.f2510e.ad.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C12383e c12383e = this.f2510e;
                        for (Map.Entry entry : ((Map) c12383e.license.get()).entrySet()) {
                            C2740e c2740e = (C2740e) entry.getKey();
                            AbstractC5113e abstractC5113e = (AbstractC5113e) entry.getValue();
                            C12550e c12550e = (C12550e) c12383e.ad().f25439e.f5445e.get(c2740e);
                            if (c12550e != null) {
                                linkedHashMap.put(abstractC5113e, new C13269e(c12550e.ad));
                            }
                        }
                        return AbstractC10064e.advert(linkedHashMap);
                }
            }
        });
    }

    public final C12701e ad() {
        return (C12701e) this.appmetrica.getValue();
    }

    public final LinkedHashSet vip(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13269e c13269e = (C13269e) ((Map) this.purchase.getValue()).get((AbstractC5113e) it.next());
            if (c13269e != null) {
                linkedHashSet.add(new C13269e(c13269e.ad));
            }
        }
        return linkedHashSet;
    }
}
