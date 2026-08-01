package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943e extends AbstractC7654e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C8497e f3362e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C0943e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f3363e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f3364e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final long f3365e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Long f3366e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f3367e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final EnumC5699e f3368e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C3418e f3369e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C15347e f3370e;

    public C0943e(long j, String str, C15347e c15347e, C3418e c3418e, long j2, EnumC5699e enumC5699e, boolean z, Long l, C0193e c0193e) {
        super(f3362e, c0193e);
        this.f3367e = j;
        this.f3363e = str;
        this.f3370e = c15347e;
        this.f3369e = c3418e;
        this.f3365e = j2;
        this.f3368e = enumC5699e;
        this.f3364e = z;
        this.f3366e = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0943e)) {
            return false;
        }
        C0943e c0943e = (C0943e) obj;
        return AbstractC7890e.billing(ad(), c0943e.ad()) && this.f3367e == c0943e.f3367e && AbstractC7890e.billing(this.f3363e, c0943e.f3363e) && AbstractC7890e.billing(this.f3370e, c0943e.f3370e) && AbstractC7890e.billing(this.f3369e, c0943e.f3369e) && this.f3365e == c0943e.f3365e && this.f3368e == c0943e.f3368e && this.f3364e == c0943e.f3364e && AbstractC7890e.billing(this.f3366e, c0943e.f3366e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f3367e;
        int advert = AbstractC1786e.advert((hashCode + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f3363e);
        C15347e c15347e = this.f3370e;
        int hashCode2 = (advert + (c15347e != null ? c15347e.hashCode() : 0)) * 37;
        C3418e c3418e = this.f3369e;
        int hashCode3 = c3418e != null ? c3418e.hashCode() : 0;
        long j2 = this.f3365e;
        int hashCode4 = (((this.f3368e.hashCode() + ((((hashCode2 + hashCode3) * 37) + ((int) ((j2 >>> 32) ^ j2))) * 37)) * 37) + (this.f3364e ? 1231 : 1237)) * 37;
        Long l = this.f3366e;
        int hashCode5 = hashCode4 + (l != null ? l.hashCode() : 0);
        this.f15551e = hashCode5;
        return hashCode5;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f3367e);
        AbstractC8647e.m2457goto(this.f3363e, "title=", arrayList);
        C15347e c15347e = this.f3370e;
        if (c15347e != null) {
            arrayList.add("content=" + c15347e);
        }
        C3418e c3418e = this.f3369e;
        if (c3418e != null) {
            arrayList.add("action=" + c3418e);
        }
        arrayList.add("date=" + this.f3365e);
        arrayList.add("topic=" + this.f3368e);
        AbstractC8647e.m2460this(new StringBuilder("is_important="), this.f3364e, arrayList);
        Long l = this.f3366e;
        if (l != null) {
            arrayList.add("expiry_date=" + l);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "InboxMessage{", "}", null, 56);
    }
}
