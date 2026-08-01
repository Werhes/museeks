package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0253e extends AbstractC13345e {
    public static final C9981e license = new C9981e(1);
    public final AbstractC16947e ad;
    public final C16911e metrica;
    public final C3003e[] vip;

    public C0253e(AbstractC16947e abstractC16947e, TreeMap treeMap) {
        this.ad = abstractC16947e;
        this.vip = (C3003e[]) treeMap.values().toArray(new C3003e[treeMap.size()]);
        this.metrica = C16911e.firebase((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        try {
            abstractC3442e.license();
            for (C3003e c3003e : this.vip) {
                abstractC3442e.loadAd(c3003e.ad);
                c3003e.metrica.purchase(abstractC3442e, c3003e.vip.get(obj));
            }
            abstractC3442e.purchase();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.ad + ")";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        try {
            Object adcel = this.ad.adcel();
            try {
                abstractC17080e.license();
                while (abstractC17080e.Signature()) {
                    int mo2308extends = abstractC17080e.mo2308extends(this.metrica);
                    if (mo2308extends == -1) {
                        abstractC17080e.mo2305break();
                        abstractC17080e.mo2314implements();
                    } else {
                        C3003e c3003e = this.vip[mo2308extends];
                        c3003e.vip.set(adcel, c3003e.metrica.vip(abstractC17080e));
                    }
                }
                abstractC17080e.advert();
                return adcel;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            AbstractC7644e.billing(e2);
            throw null;
        }
    }
}
