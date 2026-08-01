package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15483e extends AbstractC13238e {
    public final HashMap purchase;

    public C15483e() {
        HashMap hashMap = new HashMap();
        this.purchase = hashMap;
        hashMap.put("TYPE", new C3270e(0));
        hashMap.put("URI", new C8834e(this, 2));
        hashMap.put("GROUP-ID", new C8834e(this, 3));
        hashMap.put("LANGUAGE", new C8834e(this, 4));
        hashMap.put("ASSOC-LANGUAGE", new C8834e(this, 5));
        hashMap.put("NAME", new C8834e(this, 6));
        hashMap.put("DEFAULT", new C3270e(1));
        hashMap.put("AUTOSELECT", new C3270e(2));
        hashMap.put("FORCED", new C3270e(3));
        hashMap.put("INSTREAM-ID", new C8834e(this, 0));
        hashMap.put("CHARACTERISTICS", new C8834e(this, 1));
    }

    @Override // defpackage.AbstractC13238e
    public final void appmetrica(C15816e c15816e, C4541e c4541e) {
        if (c4541e.metrica.size() > 0) {
            Iterator it = c4541e.metrica.iterator();
            while (it.hasNext()) {
                license(c15816e, (C5129e) it.next(), this.purchase);
            }
        }
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        return "EXT-X-MEDIA";
    }
}
