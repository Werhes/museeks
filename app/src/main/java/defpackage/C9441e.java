package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9441e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C5001e f18779e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C9441e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC13735e f18780e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f18781e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f18782e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f18783e;

    public C9441e(String str, EnumC13735e enumC13735e, String str2, int i, C0193e c0193e) {
        super(f18779e, c0193e);
        this.f18781e = str;
        this.f18780e = enumC13735e;
        this.f18783e = str2;
        this.f18782e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9441e)) {
            return false;
        }
        C9441e c9441e = (C9441e) obj;
        return AbstractC7890e.billing(ad(), c9441e.ad()) && AbstractC7890e.billing(this.f18781e, c9441e.f18781e) && this.f18780e == c9441e.f18780e && AbstractC7890e.billing(this.f18783e, c9441e.f18783e) && this.f18782e == c9441e.f18782e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = AbstractC1786e.advert((this.f18780e.hashCode() + AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f18781e)) * 37, 37, this.f18783e) + this.f18782e;
        this.f15551e = advert;
        return advert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("device_name=".concat(AbstractC4224e.advert(this.f18781e)));
        arrayList.add("device_type=" + this.f18780e);
        arrayList.add("app_version_name=".concat(AbstractC4224e.advert(this.f18783e)));
        arrayList.add("app_version_code=" + this.f18782e);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacDeviceInfo{", "}", null, 56);
    }
}
