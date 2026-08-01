package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3230e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C5206e f7358e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C3230e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f7359e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f7360e;

    public C3230e(boolean z, int i, C0193e c0193e) {
        super(f7358e, c0193e);
        this.f7360e = z;
        this.f7359e = i;
    }

    public static C3230e vip(C3230e c3230e, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = c3230e.f7360e;
        }
        if ((i2 & 2) != 0) {
            i = c3230e.f7359e;
        }
        C0193e ad = c3230e.ad();
        c3230e.getClass();
        return new C3230e(z, i, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3230e)) {
            return false;
        }
        C3230e c3230e = (C3230e) obj;
        return AbstractC7890e.billing(ad(), c3230e.ad()) && this.f7360e == c3230e.f7360e && this.f7359e == c3230e.f7359e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (((ad().hashCode() * 37) + (this.f7360e ? 1231 : 1237)) * 37) + this.f7359e;
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("enable_crossfade="), this.f7360e, arrayList, "enable_crossfade_seconds=");
        premium.append(this.f7359e);
        arrayList.add(premium.toString());
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxPlaybackPreferences{", "}", null, 56);
    }
}
