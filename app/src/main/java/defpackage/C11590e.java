package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11590e extends AbstractC7654e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C12982e f23277e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C11590e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC4433e f23278e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f23279e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f23280e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final String f23281e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f23282e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Long f23283e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f23284e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f23285e;

    public C11590e(long j, EnumC4433e enumC4433e, long j2, String str, String str2, Long l, int i, String str3, C0193e c0193e) {
        super(f23277e, c0193e);
        this.f23282e = j;
        this.f23278e = enumC4433e;
        this.f23285e = j2;
        this.f23284e = str;
        this.f23280e = str2;
        this.f23283e = l;
        this.f23279e = i;
        this.f23281e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11590e)) {
            return false;
        }
        C11590e c11590e = (C11590e) obj;
        return AbstractC7890e.billing(ad(), c11590e.ad()) && this.f23282e == c11590e.f23282e && this.f23278e == c11590e.f23278e && this.f23285e == c11590e.f23285e && AbstractC7890e.billing(this.f23284e, c11590e.f23284e) && AbstractC7890e.billing(this.f23280e, c11590e.f23280e) && AbstractC7890e.billing(this.f23283e, c11590e.f23283e) && this.f23279e == c11590e.f23279e && AbstractC7890e.billing(this.f23281e, c11590e.f23281e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f23282e;
        int hashCode2 = (this.f23278e.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37;
        long j2 = this.f23285e;
        int advert = AbstractC1786e.advert(AbstractC1786e.advert((hashCode2 + ((int) ((j2 >>> 32) ^ j2))) * 37, 37, this.f23284e), 37, this.f23280e);
        Long l = this.f23283e;
        int hashCode3 = this.f23281e.hashCode() + ((((advert + (l != null ? l.hashCode() : 0)) * 37) + this.f23279e) * 37);
        this.f15551e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f23282e);
        arrayList.add("status=" + this.f23278e);
        arrayList.add("date=" + this.f23285e);
        AbstractC8647e.m2457goto(this.f23284e, "product_title=", arrayList);
        AbstractC8647e.m2457goto(this.f23280e, "payment_method_title=", arrayList);
        Long l = this.f23283e;
        if (l != null) {
            arrayList.add("gift_to_vk_id=" + l);
        }
        arrayList.add("amount=" + this.f23279e);
        AbstractC8647e.m2457goto(this.f23281e, "currency=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "Purchase{", "}", null, 56);
    }
}
