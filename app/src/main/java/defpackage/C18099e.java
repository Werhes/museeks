package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18099e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C17478e f35485e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C18099e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f35486e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f35487e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f35488e;

    public C18099e(String str, String str2, String str3, C0193e c0193e) {
        super(f35485e, c0193e);
        this.f35487e = str;
        this.f35486e = str2;
        this.f35488e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18099e)) {
            return false;
        }
        C18099e c18099e = (C18099e) obj;
        return AbstractC7890e.billing(ad(), c18099e.ad()) && AbstractC7890e.billing(this.f35487e, c18099e.f35487e) && AbstractC7890e.billing(this.f35486e, c18099e.f35486e) && AbstractC7890e.billing(this.f35488e, c18099e.f35488e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f35488e.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f35487e), 37, this.f35486e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f35487e, "version_name=", arrayList);
        AbstractC8647e.m2457goto(this.f35486e, "version_code=", arrayList);
        AbstractC8647e.m2457goto(this.f35488e, "version_incremental_code=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "MiuiExtendedMetadata{", "}", null, 56);
    }
}
