package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505e extends AbstractC7654e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C11607e f2593e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C0505e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f2594e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final List f2595e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final String f2596e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f2597e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final String f2598e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C18344e f2599e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f2600e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f2601e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f2602e;

    public C0505e(C18344e c18344e, ArrayList arrayList, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, C0193e c0193e) {
        super(f2593e, c0193e);
        this.f2599e = c18344e;
        this.f2594e = z;
        this.f2602e = z2;
        this.f2601e = z3;
        this.f2597e = str;
        this.f2600e = str2;
        this.f2596e = str3;
        this.f2598e = str4;
        this.f2595e = AbstractC4224e.billing("methods", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0505e)) {
            return false;
        }
        C0505e c0505e = (C0505e) obj;
        return AbstractC7890e.billing(ad(), c0505e.ad()) && AbstractC7890e.billing(this.f2599e, c0505e.f2599e) && AbstractC7890e.billing(this.f2595e, c0505e.f2595e) && this.f2594e == c0505e.f2594e && this.f2602e == c0505e.f2602e && this.f2601e == c0505e.f2601e && AbstractC7890e.billing(this.f2597e, c0505e.f2597e) && AbstractC7890e.billing(this.f2600e, c0505e.f2600e) && AbstractC7890e.billing(this.f2596e, c0505e.f2596e) && AbstractC7890e.billing(this.f2598e, c0505e.f2598e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C18344e c18344e = this.f2599e;
        int hashCode2 = this.f2598e.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert((((((AbstractC17861e.billing((hashCode + (c18344e != null ? c18344e.hashCode() : 0)) * 37, 37, this.f2595e) + (this.f2594e ? 1231 : 1237)) * 37) + (this.f2602e ? 1231 : 1237)) * 37) + (this.f2601e ? 1231 : 1237)) * 37, 37, this.f2597e), 37, this.f2600e), 37, this.f2596e);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C18344e c18344e = this.f2599e;
        if (c18344e != null) {
            arrayList.add("product=" + c18344e);
        }
        List list = this.f2595e;
        if (!list.isEmpty()) {
            arrayList.add("methods=" + list);
        }
        AbstractC8647e.m2460this(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("supports_checkout_promo_codes="), this.f2594e, arrayList, "eligible_for_referral="), this.f2602e, arrayList, "has_purchased_once="), this.f2601e, arrayList);
        AbstractC8647e.m2457goto(this.f2597e, "terms_url=", arrayList);
        AbstractC8647e.m2457goto(this.f2600e, "refund_terms_url=", arrayList);
        AbstractC8647e.m2457goto(this.f2596e, "payment_terms_url=", arrayList);
        AbstractC8647e.m2457goto(this.f2598e, "payment_support_url=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "CombinedPaymentPage{", "}", null, 56);
    }
}
