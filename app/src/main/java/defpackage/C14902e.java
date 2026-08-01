package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14902e extends AbstractC7654e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C11852e f29528e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C14902e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f29529e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f29530e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f29531e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f29532e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f29533e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f29534e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f29535e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f29536e;

    public C14902e(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, C0193e c0193e) {
        super(f29528e, c0193e);
        this.f29533e = str;
        this.f29529e = str2;
        this.f29536e = i;
        this.f29535e = i2;
        this.f29531e = i3;
        this.f29534e = i4;
        this.f29530e = i5;
        this.f29532e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14902e)) {
            return false;
        }
        C14902e c14902e = (C14902e) obj;
        return AbstractC7890e.billing(ad(), c14902e.ad()) && AbstractC7890e.billing(this.f29533e, c14902e.f29533e) && AbstractC7890e.billing(this.f29529e, c14902e.f29529e) && this.f29536e == c14902e.f29536e && this.f29535e == c14902e.f29535e && this.f29531e == c14902e.f29531e && this.f29534e == c14902e.f29534e && this.f29530e == c14902e.f29530e && this.f29532e == c14902e.f29532e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = ((((((((((AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f29533e), 37, this.f29529e) + this.f29536e) * 37) + this.f29535e) * 37) + this.f29531e) * 37) + this.f29534e) * 37) + this.f29530e) * 37) + this.f29532e;
        this.f15551e = advert;
        return advert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f29533e, "id=", arrayList);
        arrayList.add("title=".concat(AbstractC4224e.advert(this.f29529e)));
        arrayList.add("price_rub=" + this.f29536e);
        arrayList.add("price_rub_original=" + this.f29535e);
        arrayList.add("price_rub_subscription_before_sale=" + this.f29531e);
        arrayList.add("calculated_discount=" + this.f29534e);
        arrayList.add("price_usd_final_cents=" + this.f29530e);
        arrayList.add("price_uah=" + this.f29532e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Variant{", "}", null, 56);
    }
}
