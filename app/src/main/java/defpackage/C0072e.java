package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C7212e f1235e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C0072e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C9441e f1236e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f1237e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final List f1238e;

    public C0072e(int i, C9441e c9441e, List list, C0193e c0193e) {
        super(f1235e, c0193e);
        this.f1237e = i;
        this.f1236e = c9441e;
        this.f1238e = AbstractC4224e.billing("modules", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0072e)) {
            return false;
        }
        C0072e c0072e = (C0072e) obj;
        return AbstractC7890e.billing(ad(), c0072e.ad()) && this.f1237e == c0072e.f1237e && AbstractC7890e.billing(this.f1236e, c0072e.f1236e) && AbstractC7890e.billing(this.f1238e, c0072e.f1238e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((ad().hashCode() * 37) + this.f1237e) * 37;
        C9441e c9441e = this.f1236e;
        int hashCode2 = this.f1238e.hashCode() + ((hashCode + (c9441e != null ? c9441e.hashCode() : 0)) * 37);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("protocol_version=" + this.f1237e);
        C9441e c9441e = this.f1236e;
        if (c9441e != null) {
            arrayList.add("device_info=" + c9441e);
        }
        if (!this.f1238e.isEmpty()) {
            arrayList.add("modules=" + AbstractC13480e.m3608try(this.f1238e, null, "[", "]", C17472e.f34220e, 25));
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "IacRootResponse{", "}", null, 56);
    }
}
