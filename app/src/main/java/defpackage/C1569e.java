package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16131e f4476e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C1569e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f4477e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0193e f4478e;

    public C1569e(C0193e c0193e, int i, C0193e c0193e2) {
        super(f4476e, c0193e2);
        this.f4478e = c0193e;
        this.f4477e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1569e)) {
            return false;
        }
        C1569e c1569e = (C1569e) obj;
        return AbstractC7890e.billing(ad(), c1569e.ad()) && AbstractC7890e.billing(this.f4478e, c1569e.f4478e) && this.f4477e == c1569e.f4477e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.f4478e.hashCode() + (ad().hashCode() * 37)) * 37) + this.f4477e;
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key=" + this.f4478e);
        arrayList.add("duration=" + this.f4477e);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthorizationStartSessionResponse{", "}", null, 56);
    }
}
