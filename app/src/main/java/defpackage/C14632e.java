package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14632e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C4759e f28868e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C14632e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f28869e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f28870e;

    public C14632e(String str, String str2, C0193e c0193e) {
        super(f28868e, c0193e);
        this.f28870e = str;
        this.f28869e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14632e)) {
            return false;
        }
        C14632e c14632e = (C14632e) obj;
        return AbstractC7890e.billing(ad(), c14632e.ad()) && AbstractC7890e.billing(this.f28870e, c14632e.f28870e) && AbstractC7890e.billing(this.f28869e, c14632e.f28869e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f28869e.hashCode() + AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f28870e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f28870e, "major_version=", arrayList);
        AbstractC8647e.m2457goto(this.f28869e, "minor_version=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "OneUIExtendedMetadata{", "}", null, 56);
    }
}
