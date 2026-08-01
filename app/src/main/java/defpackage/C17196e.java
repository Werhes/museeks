package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17196e extends AbstractC7654e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C3520e f33713e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C17196e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC6972e f33714e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f33715e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f33716e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f33717e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f33718e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f33719e;

    public C17196e(String str, EnumC6972e enumC6972e, String str2, int i, String str3, String str4, C0193e c0193e) {
        super(f33713e, c0193e);
        this.f33716e = str;
        this.f33714e = enumC6972e;
        this.f33719e = str2;
        this.f33718e = i;
        this.f33715e = str3;
        this.f33717e = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17196e)) {
            return false;
        }
        C17196e c17196e = (C17196e) obj;
        return AbstractC7890e.billing(ad(), c17196e.ad()) && AbstractC7890e.billing(this.f33716e, c17196e.f33716e) && this.f33714e == c17196e.f33714e && AbstractC7890e.billing(this.f33719e, c17196e.f33719e) && this.f33718e == c17196e.f33718e && AbstractC7890e.billing(this.f33715e, c17196e.f33715e) && AbstractC7890e.billing(this.f33717e, c17196e.f33717e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f33717e.hashCode() + AbstractC1786e.advert((AbstractC1786e.advert((this.f33714e.hashCode() + AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f33716e)) * 37, 37, this.f33719e) + this.f33718e) * 37, 37, this.f33715e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=".concat(AbstractC4224e.advert(this.f33716e)));
        arrayList.add("type=" + this.f33714e);
        arrayList.add("host=".concat(AbstractC4224e.advert(this.f33719e)));
        arrayList.add("port=" + this.f33718e);
        AbstractC8647e.m2457goto(this.f33715e, "username=", arrayList);
        AbstractC8647e.m2457goto(this.f33717e, "password=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "Proxy{", "}", null, 56);
    }
}
