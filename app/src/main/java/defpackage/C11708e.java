package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11708e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C15631e f23540e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C11708e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C18399e f23541e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC10358e f23542e;

    public C11708e(EnumC10358e enumC10358e, C18399e c18399e, C0193e c0193e) {
        super(f23540e, c0193e);
        this.f23542e = enumC10358e;
        this.f23541e = c18399e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11708e)) {
            return false;
        }
        C11708e c11708e = (C11708e) obj;
        return AbstractC7890e.billing(ad(), c11708e.ad()) && this.f23542e == c11708e.f23542e && AbstractC7890e.billing(this.f23541e, c11708e.f23541e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.f23542e.hashCode() + (ad().hashCode() * 37)) * 37;
        C18399e c18399e = this.f23541e;
        int hashCode2 = hashCode + (c18399e != null ? c18399e.hashCode() : 0);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.f23542e);
        C18399e c18399e = this.f23541e;
        if (c18399e != null) {
            arrayList.add("page=" + c18399e);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "QueryChangelogRequest{", "}", null, 56);
    }
}
