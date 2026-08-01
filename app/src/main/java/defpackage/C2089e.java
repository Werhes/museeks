package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2089e extends AbstractC8835e {
    public final boolean vip;

    public C2089e(List list, boolean z) {
        super(list);
        this.vip = z;
    }

    @Override // defpackage.AbstractC8835e
    public final AbstractC8835e ad(InterfaceC13543e interfaceC13543e) {
        C1169e license = AbstractC6874e.license();
        List list = this.ad;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            license.add(((C4211e) list.get(i)).appmetrica(interfaceC13543e));
        }
        return new C2089e(AbstractC6874e.metrica(license), this.vip);
    }

    public final String toString() {
        return "Corner: cubics=" + AbstractC13480e.m3608try(this.ad, ", ", null, null, new C2163e(21), 30) + " convex=" + this.vip;
    }
}
