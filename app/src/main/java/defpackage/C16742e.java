package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16742e extends AbstractC7654e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C15056e f32819e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C16742e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f32820e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final long f32821e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f32822e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f32823e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long f32824e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f32825e;

    public C16742e(long j, String str, boolean z, long j2, long j3, String str2, C0193e c0193e) {
        super(f32819e, c0193e);
        this.f32822e = j;
        this.f32820e = str;
        this.f32825e = z;
        this.f32824e = j2;
        this.f32821e = j3;
        this.f32823e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16742e)) {
            return false;
        }
        C16742e c16742e = (C16742e) obj;
        return AbstractC7890e.billing(ad(), c16742e.ad()) && this.f32822e == c16742e.f32822e && AbstractC7890e.billing(this.f32820e, c16742e.f32820e) && this.f32825e == c16742e.f32825e && this.f32824e == c16742e.f32824e && this.f32821e == c16742e.f32821e && AbstractC7890e.billing(this.f32823e, c16742e.f32823e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f32822e;
        int advert = (AbstractC1786e.advert((hashCode + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f32820e) + (this.f32825e ? 1231 : 1237)) * 37;
        long j2 = this.f32824e;
        int i2 = (advert + ((int) (j2 ^ (j2 >>> 32)))) * 37;
        long j3 = this.f32821e;
        int hashCode2 = this.f32823e.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 37);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f32822e);
        arrayList.add("code=".concat(AbstractC4224e.advert(this.f32820e)));
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("is_used="), this.f32825e, arrayList, "acquisition_date=");
        premium.append(this.f32824e);
        arrayList.add(premium.toString());
        arrayList.add("activation_date=" + this.f32821e);
        AbstractC8647e.m2457goto(this.f32823e, "product_title=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "CodeActivation{", "}", null, 56);
    }
}
