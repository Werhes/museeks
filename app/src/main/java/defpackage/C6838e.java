package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6838e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C13558e f14087e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C6838e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f14088e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C18399e f14089e;

    public C6838e(C18399e c18399e, boolean z, C0193e c0193e) {
        super(f14087e, c0193e);
        this.f14089e = c18399e;
        this.f14088e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6838e)) {
            return false;
        }
        C6838e c6838e = (C6838e) obj;
        return AbstractC7890e.billing(ad(), c6838e.ad()) && AbstractC7890e.billing(this.f14089e, c6838e.f14089e) && this.f14088e == c6838e.f14088e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C18399e c18399e = this.f14089e;
        int hashCode2 = ((hashCode + (c18399e != null ? c18399e.hashCode() : 0)) * 37) + (this.f14088e ? 1231 : 1237);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C18399e c18399e = this.f14089e;
        if (c18399e != null) {
            arrayList.add("page=" + c18399e);
        }
        AbstractC8647e.m2460this(new StringBuilder("return_codes="), this.f14088e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "QueryBillingHistoryRequest{", "}", null, 56);
    }
}
