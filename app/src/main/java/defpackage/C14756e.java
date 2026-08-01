package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14756e extends C6541e {
    public final C2271e inmobi;
    public final ArrayList isVip;

    /* JADX WARN: Type inference failed for: r2v2, types: [eٕ٘ؔ, eؓۨۖ] */
    public C14756e(C9701e c9701e, String str, String str2) {
        super(c9701e, str, str2, false);
        this.isVip = new ArrayList();
        this.inmobi = new C17519e(0);
    }

    public final void Signature(Collection collection) {
        C6541e c6541e;
        this.tapsense.clear();
        ArrayList arrayList = this.isVip;
        arrayList.clear();
        C2271e c2271e = this.inmobi;
        c2271e.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C7712e c7712e = (C7712e) it.next();
            String license = c7712e.ad.license();
            Iterator it2 = this.ad.vip.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c6541e = null;
                    break;
                } else {
                    c6541e = (C6541e) it2.next();
                    if (c6541e.vip.equals(license)) {
                        break;
                    }
                }
            }
            if (c6541e != null) {
                arrayList.add(c6541e);
                c2271e.put(c6541e.metrica, c7712e);
                int i = c7712e.vip;
                if (i == 2 || i == 3) {
                    this.tapsense.add(c6541e);
                }
            }
        }
        C10085e.metrica().ad.vip(259, this);
    }

    public final boolean amazon() {
        C10085e.vip();
        return C10085e.metrica().appmetrica().contains(this);
    }

    public final boolean loadAd(C6541e c6541e) {
        C7712e c7712e = (C7712e) this.inmobi.get(c6541e.metrica);
        return c7712e != null && c7712e.license;
    }
}
