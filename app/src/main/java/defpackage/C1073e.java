package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1073e extends AbstractC0198e {
    public final int metrica;
    public final Object vip;

    public C1073e(int i, String str, List list) {
        super(str);
        this.vip = list;
        this.metrica = i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC7999e.metrica.license(((C4839e) it.next()).ad)) {
                throw new C8750e("Parameter name should be a token");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.AbstractC0198e
    public final String ad() {
        ?? r0 = this.vip;
        boolean isEmpty = r0.isEmpty();
        String str = this.ad;
        return isEmpty ? str : AbstractC13480e.m3608try(r0, ", ", str.concat(" "), null, new C17028e(this, this.metrica, 8), 28);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1073e)) {
            return false;
        }
        C1073e c1073e = (C1073e) obj;
        return c1073e.ad.equalsIgnoreCase(this.ad) && AbstractC7890e.billing(c1073e.vip, this.vip);
    }

    public final int hashCode() {
        return AbstractC1660e.m670implements(new Object[]{this.ad.toLowerCase(Locale.ROOT), this.vip}).hashCode();
    }
}
