package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11028e implements InterfaceC6937e {
    public final C8181e ad;
    public final ArrayList metrica;
    public final Function2 vip;

    public C11028e(C8181e c8181e, Function2 function2) {
        this.ad = c8181e;
        this.vip = function2;
        int size = c8181e.ad.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C12432e(this.ad.ad.get(i), (EnumC10854e) this.vip.invoke(Integer.valueOf(i), this.ad)));
        }
        this.metrica = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11028e)) {
            return false;
        }
        C11028e c11028e = (C11028e) obj;
        return AbstractC7890e.billing(this.ad, c11028e.ad) && AbstractC7890e.billing(this.vip, c11028e.vip);
    }

    @Override // defpackage.InterfaceC6937e
    public final ArrayList getChildren() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "PagesNavState(pages=" + this.ad + ", pageStatus=" + this.vip + ')';
    }
}
