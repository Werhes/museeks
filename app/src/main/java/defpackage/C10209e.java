package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10209e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16620e f20188e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C10209e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C0193e f20189e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17333e f20190e;

    public C10209e(C17333e c17333e, C0193e c0193e, C0193e c0193e2) {
        super(f20188e, c0193e2);
        this.f20190e = c17333e;
        this.f20189e = c0193e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10209e)) {
            return false;
        }
        C10209e c10209e = (C10209e) obj;
        return AbstractC7890e.billing(ad(), c10209e.ad()) && AbstractC7890e.billing(this.f20190e, c10209e.f20190e) && AbstractC7890e.billing(this.f20189e, c10209e.f20189e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C17333e c17333e = this.f20190e;
        int hashCode2 = this.f20189e.hashCode() + ((hashCode + (c17333e != null ? c17333e.hashCode() : 0)) * 37);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C17333e c17333e = this.f20190e;
        if (c17333e != null) {
            arrayList.add("tag=" + c17333e);
        }
        arrayList.add("obj=" + this.f20189e);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthorizationFinishSession{", "}", null, 56);
    }
}
