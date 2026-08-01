package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7203e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C3414e f14712e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C7203e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final List f14713e;

    public C7203e(ArrayList arrayList, C0193e c0193e) {
        super(f14712e, c0193e);
        this.f14713e = AbstractC4224e.billing("entries", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7203e)) {
            return false;
        }
        C7203e c7203e = (C7203e) obj;
        return AbstractC7890e.billing(ad(), c7203e.ad()) && AbstractC7890e.billing(this.f14713e, c7203e.f14713e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f14713e.hashCode() + (ad().hashCode() * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f14713e;
        if (!list.isEmpty()) {
            arrayList.add("entries=" + list);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "QueryBillingHistoryResponse{", "}", null, 56);
    }
}
