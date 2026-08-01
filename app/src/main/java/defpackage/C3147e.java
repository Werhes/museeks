package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3147e extends AbstractC7654e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C9146e f7227e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C3147e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f7228e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final List f7229e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f7230e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f7231e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f7232e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f7233e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f7234e;

    public C3147e(boolean z, boolean z2, boolean z3, boolean z4, List list, String str, long j, C0193e c0193e) {
        super(f7227e, c0193e);
        this.f7231e = z;
        this.f7228e = z2;
        this.f7234e = z3;
        this.f7233e = z4;
        this.f7230e = str;
        this.f7232e = j;
        this.f7229e = AbstractC4224e.billing("lyrics_chain_configuration", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    public static C3147e vip(C3147e c3147e, ArrayList arrayList, String str, long j, int i) {
        boolean z = c3147e.f7231e;
        boolean z2 = c3147e.f7228e;
        boolean z3 = c3147e.f7234e;
        boolean z4 = c3147e.f7233e;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = c3147e.f7229e;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 32) != 0) {
            str = c3147e.f7230e;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            j = c3147e.f7232e;
        }
        C0193e ad = c3147e.ad();
        c3147e.getClass();
        return new C3147e(z, z2, z3, z4, arrayList3, str2, j, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3147e)) {
            return false;
        }
        C3147e c3147e = (C3147e) obj;
        return AbstractC7890e.billing(ad(), c3147e.ad()) && this.f7231e == c3147e.f7231e && this.f7228e == c3147e.f7228e && this.f7234e == c3147e.f7234e && this.f7233e == c3147e.f7233e && AbstractC7890e.billing(this.f7229e, c3147e.f7229e) && AbstractC7890e.billing(this.f7230e, c3147e.f7230e) && this.f7232e == c3147e.f7232e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = AbstractC1786e.advert(AbstractC17861e.billing(((((((((ad().hashCode() * 37) + (this.f7231e ? 1231 : 1237)) * 37) + (this.f7228e ? 1231 : 1237)) * 37) + (this.f7234e ? 1231 : 1237)) * 37) + (this.f7233e ? 1231 : 1237)) * 37, 37, this.f7229e), 37, this.f7230e);
        long j = this.f7232e;
        int i2 = advert + ((int) (j ^ (j >>> 32)));
        this.f15551e = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2460this(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("enable_musixmatch_for_lyrics="), this.f7231e, arrayList, "enable_genius_for_lyrics="), this.f7228e, arrayList, "enable_vk_for_lyrics="), this.f7234e, arrayList, "enable_lrclib_for_lyrics="), this.f7233e, arrayList);
        List list = this.f7229e;
        if (!list.isEmpty()) {
            arrayList.add("lyrics_chain_configuration=" + list);
        }
        arrayList.add("musixmatch_access_token=".concat(AbstractC4224e.advert(this.f7230e)));
        arrayList.add("musixmatch_access_token_creation_date=" + this.f7232e);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxIntegrationPreferences{", "}", null, 56);
    }
}
