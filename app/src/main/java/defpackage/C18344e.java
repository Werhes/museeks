package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18344e extends AbstractC7654e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C12806e f36011e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C18344e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f36012e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f36013e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f36014e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f36015e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Integer f36016e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f36017e;

    public C18344e(String str, boolean z, boolean z2, ArrayList arrayList, Integer num, boolean z3, C0193e c0193e) {
        super(f36011e, c0193e);
        this.f36014e = str;
        this.f36012e = z;
        this.f36017e = z2;
        this.f36016e = num;
        this.f36013e = z3;
        this.f36015e = AbstractC4224e.billing("available_variants", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18344e)) {
            return false;
        }
        C18344e c18344e = (C18344e) obj;
        return AbstractC7890e.billing(ad(), c18344e.ad()) && AbstractC7890e.billing(this.f36014e, c18344e.f36014e) && this.f36012e == c18344e.f36012e && this.f36017e == c18344e.f36017e && AbstractC7890e.billing(this.f36015e, c18344e.f36015e) && AbstractC7890e.billing(this.f36016e, c18344e.f36016e) && this.f36013e == c18344e.f36013e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = AbstractC17861e.billing((((AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f36014e) + (this.f36012e ? 1231 : 1237)) * 37) + (this.f36017e ? 1231 : 1237)) * 37, 37, this.f36015e);
        Integer num = this.f36016e;
        int hashCode = ((billing + (num != null ? num.hashCode() : 0)) * 37) + (this.f36013e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=".concat(AbstractC4224e.advert(this.f36014e)));
        AbstractC8647e.m2460this(AbstractC8647e.premium(new StringBuilder("is_subscription="), this.f36012e, arrayList, "is_giftable="), this.f36017e, arrayList);
        List list = this.f36015e;
        if (!list.isEmpty()) {
            arrayList.add("available_variants=" + list);
        }
        Integer num = this.f36016e;
        if (num != null) {
            arrayList.add("loyalty_discount_applied=" + num);
        }
        AbstractC8647e.m2460this(new StringBuilder("is_available="), this.f36013e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "ProductInformation{", "}", null, 56);
    }
}
