package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7208e extends AbstractC11069e {
    public final C15128e signatures;

    public C7208e(AbstractC11069e abstractC11069e, AbstractC11069e abstractC11069e2) {
        super(3, AbstractC3820e.ad.vip(Map.class), abstractC11069e2.appmetrica, C9139e.f18290e, 32);
        this.signatures = new C15128e(abstractC11069e, abstractC11069e2);
    }

    @Override // defpackage.AbstractC11069e
    public final void adcel(C17790e c17790e, int i, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        AbstractC1660e.m677while(entryArr);
        for (Map.Entry entry : entryArr) {
            this.signatures.adcel(c17790e, i, entry);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int advert(int i, Object obj) {
        Map map = (Map) obj;
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            i2 += this.signatures.advert(i, (Map.Entry) it.next());
        }
        return i2;
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        C15128e c15128e = this.signatures;
        Object obj = c15128e.signatures.vip;
        AbstractC11069e abstractC11069e = c15128e.tapsense;
        Object obj2 = abstractC11069e.vip;
        long license = c17546e.license();
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                break;
            }
            if (billing == 1) {
                obj = c15128e.signatures.metrica(c17546e);
            } else if (billing == 2) {
                obj2 = abstractC11069e.metrica(c17546e);
            }
        }
        c17546e.appmetrica(license);
        if (obj == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (obj2 != null) {
            return Collections.singletonMap(obj, obj2);
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // defpackage.AbstractC11069e
    public final void startapp(C0444e c0444e, int i, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.signatures.startapp(c0444e, i, (Map.Entry) it.next());
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        C15128e c15128e = this.signatures;
        Object obj = c15128e.signatures.vip;
        AbstractC11069e abstractC11069e = c15128e.tapsense;
        Object obj2 = abstractC11069e.vip;
        int metrica = c17582e.metrica();
        while (true) {
            int purchase = c17582e.purchase();
            if (purchase == -1) {
                break;
            }
            if (purchase == 1) {
                obj = c15128e.signatures.vip(c17582e);
            } else if (purchase == 2) {
                obj2 = abstractC11069e.vip(c17582e);
            }
        }
        c17582e.license(metrica);
        if (obj == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (obj2 != null) {
            return Collections.singletonMap(obj, obj2);
        }
        throw new IllegalStateException("Map entry with null value");
    }
}
