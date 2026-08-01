package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357e extends AbstractC7654e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C3193e f5894e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C2357e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f5895e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f5896e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f5897e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f5898e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f5899e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f5900e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f5901e;

    public C2357e(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C0193e c0193e) {
        super(f5894e, c0193e);
        this.f5898e = str;
        this.f5895e = str2;
        this.f5901e = str3;
        this.f5900e = z;
        this.f5897e = z2;
        this.f5899e = z3;
        this.f5896e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2357e)) {
            return false;
        }
        C2357e c2357e = (C2357e) obj;
        return AbstractC7890e.billing(ad(), c2357e.ad()) && AbstractC7890e.billing(this.f5898e, c2357e.f5898e) && AbstractC7890e.billing(this.f5895e, c2357e.f5895e) && AbstractC7890e.billing(this.f5901e, c2357e.f5901e) && this.f5900e == c2357e.f5900e && this.f5897e == c2357e.f5897e && this.f5899e == c2357e.f5899e && this.f5896e == c2357e.f5896e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = ((((((AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f5898e), 37, this.f5895e), 37, this.f5901e) + (this.f5900e ? 1231 : 1237)) * 37) + (this.f5897e ? 1231 : 1237)) * 37) + (this.f5899e ? 1231 : 1237)) * 37) + this.f5896e;
        this.f15551e = advert;
        return advert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f5898e, "id=", arrayList);
        AbstractC8647e.m2457goto(this.f5895e, "title=", arrayList);
        arrayList.add("description=".concat(AbstractC4224e.advert(this.f5901e)));
        StringBuilder premium = AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("is_recommended="), this.f5900e, arrayList, "is_automatic="), this.f5897e, arrayList, "is_extra_tax="), this.f5899e, arrayList, "minimum_price_rub=");
        premium.append(this.f5896e);
        arrayList.add(premium.toString());
        return AbstractC13480e.m3608try(arrayList, ", ", "PaymentMethod{", "}", null, 56);
    }
}
