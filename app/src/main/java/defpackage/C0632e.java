package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0632e {
    public int ad;
    public C0632e appmetrica;
    public final ArrayList billing;
    public C0632e license;
    public final ArrayList metrica = new ArrayList(0);
    public C6104e purchase;
    public AbstractC6437e vip;

    public C0632e(int i) {
        this.ad = i;
        InterfaceC14256e.ad.getClass();
        List ad = C12381e.ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
        Iterator it = ad.iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            arrayList.add(new C9736e());
        }
        this.billing = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0632e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0632e c0632e = (C0632e) obj;
        if (this.ad != c0632e.ad) {
            return false;
        }
        AbstractC6437e abstractC6437e = this.vip;
        if (abstractC6437e == null) {
            abstractC6437e = null;
        }
        AbstractC6437e abstractC6437e2 = c0632e.vip;
        return AbstractC7890e.billing(abstractC6437e, abstractC6437e2 != null ? abstractC6437e2 : null) && AbstractC7890e.billing(this.metrica, c0632e.metrica) && AbstractC7890e.billing(this.appmetrica, c0632e.appmetrica) && AbstractC7890e.billing(this.license, c0632e.license) && AbstractC7890e.billing(this.purchase, c0632e.purchase) && AbstractC7890e.billing(this.billing, c0632e.billing);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        AbstractC6437e abstractC6437e = this.vip;
        if (abstractC6437e == null) {
            abstractC6437e = null;
        }
        return this.metrica.hashCode() + ((abstractC6437e.hashCode() + i) * 31);
    }
}
