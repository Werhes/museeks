package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8867e implements InterfaceC7351e {
    public final C7725e ad;
    public final ArrayList vip;

    public C8867e(C7725e c7725e, ArrayList arrayList) {
        this.ad = c7725e;
        this.vip = arrayList;
    }

    @Override // defpackage.InterfaceC14232e
    public final C12469e ad() {
        return this.ad.ad();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8867e)) {
            return false;
        }
        C8867e c8867e = (C8867e) obj;
        return this.ad.equals(c8867e.ad) && this.vip.equals(c8867e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.ad.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.vip + ')';
    }

    @Override // defpackage.InterfaceC14232e
    public final C6195e vip() {
        C1169e license = AbstractC6874e.license();
        license.add(this.ad.vip());
        Iterator it = this.vip.iterator();
        while (it.hasNext()) {
            license.add(((InterfaceC14232e) it.next()).vip());
        }
        return new C6195e(C13664e.f27089e, AbstractC6874e.metrica(license));
    }
}
