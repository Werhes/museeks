package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۡۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2157e implements InterfaceC6937e {
    public final List ad;
    public final ArrayList vip;

    public C2157e(List list) {
        this.ad = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Configuration stack must not be empty");
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            arrayList.add(new C12432e(obj, i == AbstractC6874e.billing(this.ad) ? EnumC10854e.f21499e : EnumC10854e.f21500e));
            i = i2;
        }
        this.vip = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2157e) && AbstractC7890e.billing(this.ad, ((C2157e) obj).ad);
    }

    @Override // defpackage.InterfaceC6937e
    public final ArrayList getChildren() {
        return this.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.tapsense(new StringBuilder("StackNavState(configurations="), this.ad, ')');
    }
}
