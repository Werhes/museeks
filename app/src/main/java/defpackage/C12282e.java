package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12282e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C7361e f24616e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12282e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f24617e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f24618e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f24619e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Integer f24620e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Long f24621e;

    public C12282e(String str, String str2, Long l, Integer num, String str3, C0193e c0193e) {
        super(f24616e, c0193e);
        this.f24619e = str;
        this.f24617e = str2;
        this.f24621e = l;
        this.f24620e = num;
        this.f24618e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12282e)) {
            return false;
        }
        C12282e c12282e = (C12282e) obj;
        return AbstractC7890e.billing(ad(), c12282e.ad()) && AbstractC7890e.billing(this.f24619e, c12282e.f24619e) && AbstractC7890e.billing(this.f24617e, c12282e.f24617e) && AbstractC7890e.billing(this.f24621e, c12282e.f24621e) && AbstractC7890e.billing(this.f24620e, c12282e.f24620e) && AbstractC7890e.billing(this.f24618e, c12282e.f24618e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f24619e), 37, this.f24617e);
        Long l = this.f24621e;
        int hashCode = (advert + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.f24620e;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.f24618e;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f15551e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f24619e, "variant_id=", arrayList);
        AbstractC8647e.m2457goto(this.f24617e, "method_id=", arrayList);
        Long l = this.f24621e;
        if (l != null) {
            arrayList.add("gift_to_vk_id=" + l);
        }
        Integer num = this.f24620e;
        if (num != null) {
            arrayList.add("ref=" + num);
        }
        String str = this.f24618e;
        if (str != null) {
            AbstractC8647e.m2457goto(str, "promo_code=", arrayList);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "PaymentBuildUrlRequest{", "}", null, 56);
    }
}
