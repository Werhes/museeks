package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12761e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C5232e f25530e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12761e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f25531e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f25532e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25533e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f25534e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f25535e;

    public C12761e(boolean z, boolean z2, String str, String str2, String str3, C0193e c0193e) {
        super(f25530e, c0193e);
        this.f25533e = z;
        this.f25531e = z2;
        this.f25535e = str;
        this.f25534e = str2;
        this.f25532e = str3;
    }

    public static C12761e vip(C12761e c12761e, boolean z, String str, String str2, String str3, int i) {
        boolean z2 = (i & 1) != 0 ? c12761e.f25533e : true;
        if ((i & 2) != 0) {
            z = c12761e.f25531e;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = c12761e.f25535e;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = c12761e.f25534e;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c12761e.f25532e;
        }
        C0193e ad = c12761e.ad();
        c12761e.getClass();
        return new C12761e(z2, z3, str4, str5, str3, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12761e)) {
            return false;
        }
        C12761e c12761e = (C12761e) obj;
        return AbstractC7890e.billing(ad(), c12761e.ad()) && this.f25533e == c12761e.f25533e && this.f25531e == c12761e.f25531e && AbstractC7890e.billing(this.f25535e, c12761e.f25535e) && AbstractC7890e.billing(this.f25534e, c12761e.f25534e) && AbstractC7890e.billing(this.f25532e, c12761e.f25532e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f25532e.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(((((ad().hashCode() * 37) + (this.f25533e ? 1231 : 1237)) * 37) + (this.f25531e ? 1231 : 1237)) * 37, 37, this.f25535e), 37, this.f25534e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2460this(AbstractC8647e.premium(new StringBuilder("is_queue_available="), this.f25533e, arrayList, "is_paused="), this.f25531e, arrayList);
        AbstractC8647e.m2457goto(this.f25535e, "current_track_name=", arrayList);
        AbstractC8647e.m2457goto(this.f25534e, "current_track_artist=", arrayList);
        AbstractC8647e.m2457goto(this.f25532e, "current_track_artwork_url=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxSmallPlayerWidgetState{", "}", null, 56);
    }
}
