package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15078e extends AbstractC13345e {
    public final String ad;
    public final AbstractC13345e appmetrica;
    public final C16911e billing;
    public final ArrayList license;
    public final List metrica;
    public final C16911e purchase;
    public final List vip;

    public C15078e(String str, List list, List list2, ArrayList arrayList, AbstractC13345e abstractC13345e) {
        this.ad = str;
        this.vip = list;
        this.metrica = list2;
        this.license = arrayList;
        this.appmetrica = abstractC13345e;
        this.purchase = C16911e.firebase(str);
        this.billing = C16911e.firebase((String[]) list.toArray(new String[0]));
    }

    public final int billing(C7720e c7720e) {
        c7720e.license();
        while (true) {
            boolean Signature = c7720e.Signature();
            String str = this.ad;
            if (!Signature) {
                throw new C14803e("Missing label for ".concat(str), 8, (byte) 0);
            }
            if (c7720e.mo2308extends(this.purchase) != -1) {
                int mo2316protected = c7720e.mo2316protected(this.billing);
                if (mo2316protected != -1 || this.appmetrica != null) {
                    return mo2316protected;
                }
                throw new C14803e("Expected one of " + this.vip + " for key '" + str + "' but found '" + c7720e.subs() + "'. Register a subtype for this label.", 8, (byte) 0);
            }
            c7720e.mo2305break();
            c7720e.mo2314implements();
        }
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        AbstractC13345e abstractC13345e;
        Class<?> cls = obj.getClass();
        List list = this.metrica;
        int indexOf = list.indexOf(cls);
        AbstractC13345e abstractC13345e2 = this.appmetrica;
        if (indexOf != -1) {
            abstractC13345e = (AbstractC13345e) this.license.get(indexOf);
        } else {
            if (abstractC13345e2 == null) {
                throw new IllegalArgumentException("Expected one of " + list + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
            }
            abstractC13345e = abstractC13345e2;
        }
        abstractC3442e.license();
        if (abstractC13345e != abstractC13345e2) {
            abstractC3442e.loadAd(this.ad);
            abstractC3442e.ads((String) this.vip.get(indexOf));
        }
        int isVip = abstractC3442e.isVip();
        if (isVip != 5 && isVip != 3 && isVip != 2 && isVip != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = abstractC3442e.f7704e;
        abstractC3442e.f7704e = abstractC3442e.f7703e;
        abstractC13345e.purchase(abstractC3442e, obj);
        abstractC3442e.f7704e = i;
        abstractC3442e.purchase();
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("PolymorphicJsonAdapter("), this.ad, ")");
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        C7720e c7720e = (C7720e) abstractC17080e;
        c7720e.getClass();
        C7720e c7720e2 = new C7720e(c7720e);
        try {
            int billing = billing(c7720e2);
            c7720e2.close();
            return billing == -1 ? this.appmetrica.vip(abstractC17080e) : ((AbstractC13345e) this.license.get(billing)).vip(abstractC17080e);
        } catch (Throwable th) {
            c7720e2.close();
            throw th;
        }
    }
}
