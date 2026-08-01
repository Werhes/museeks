package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10033e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C3525e f19834e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C10033e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f19835e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f19836e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f19837e;

    public C10033e(String str, long j, String str2, C0193e c0193e) {
        super(f19834e, c0193e);
        this.f19836e = str;
        this.f19835e = j;
        this.f19837e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10033e)) {
            return false;
        }
        C10033e c10033e = (C10033e) obj;
        return AbstractC7890e.billing(ad(), c10033e.ad()) && AbstractC7890e.billing(this.f19836e, c10033e.f19836e) && this.f19835e == c10033e.f19835e && AbstractC7890e.billing(this.f19837e, c10033e.f19837e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f19836e);
        long j = this.f19835e;
        int hashCode = this.f19837e.hashCode() + ((advert + ((int) (j ^ (j >>> 32)))) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bundle_name=".concat(AbstractC4224e.advert(this.f19836e)));
        arrayList.add("vk_account_id=" + this.f19835e);
        AbstractC8647e.m2457goto(this.f19837e, "vk_author_name=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "ShareInformation{", "}", null, 56);
    }
}
