package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13034e extends AbstractC7654e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C2865e f25955e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C13034e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f25956e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final List f25957e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f25958e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25959e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f25960e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f25961e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f25962e;

    public C13034e(boolean z, String str, List list, boolean z2, boolean z3, boolean z4, boolean z5, C0193e c0193e) {
        super(f25955e, c0193e);
        this.f25959e = z;
        this.f25956e = str;
        this.f25962e = z2;
        this.f25961e = z3;
        this.f25958e = z4;
        this.f25960e = z5;
        this.f25957e = AbstractC4224e.billing("proxy_user_list", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    public static C13034e vip(C13034e c13034e, boolean z, String str, ArrayList arrayList, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c13034e.f25959e;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            str = c13034e.f25956e;
        }
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = c13034e.f25957e;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 8) != 0) {
            z2 = c13034e.f25962e;
        }
        boolean z5 = z2;
        boolean z6 = c13034e.f25961e;
        boolean z7 = c13034e.f25958e;
        if ((i & 64) != 0) {
            z3 = c13034e.f25960e;
        }
        C0193e ad = c13034e.ad();
        c13034e.getClass();
        return new C13034e(z4, str2, arrayList3, z5, z6, z7, z3, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13034e)) {
            return false;
        }
        C13034e c13034e = (C13034e) obj;
        return AbstractC7890e.billing(ad(), c13034e.ad()) && this.f25959e == c13034e.f25959e && AbstractC7890e.billing(this.f25956e, c13034e.f25956e) && AbstractC7890e.billing(this.f25957e, c13034e.f25957e) && this.f25962e == c13034e.f25962e && this.f25961e == c13034e.f25961e && this.f25958e == c13034e.f25958e && this.f25960e == c13034e.f25960e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = ((((((AbstractC17861e.billing(AbstractC1786e.advert(((ad().hashCode() * 37) + (this.f25959e ? 1231 : 1237)) * 37, 37, this.f25956e), 37, this.f25957e) + (this.f25962e ? 1231 : 1237)) * 37) + (this.f25961e ? 1231 : 1237)) * 37) + (this.f25958e ? 1231 : 1237)) * 37) + (this.f25960e ? 1231 : 1237);
        this.f15551e = billing;
        return billing;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2460this(new StringBuilder("proxy_enabled="), this.f25959e, arrayList);
        AbstractC8647e.m2457goto(this.f25956e, "proxy_selected=", arrayList);
        List list = this.f25957e;
        if (!list.isEmpty()) {
            arrayList.add("proxy_user_list=" + list);
        }
        AbstractC8647e.m2460this(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("proxy_vk_enabled="), this.f25962e, arrayList, "cronet_manual_disabled="), this.f25961e, arrayList, "cronet_disable_quic="), this.f25958e, arrayList, "use_vk_ru_domain="), this.f25960e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxNetworkPreferences{", "}", null, 56);
    }
}
