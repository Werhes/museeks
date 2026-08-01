package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8169e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C10564e f16630e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C8169e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f16631e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f16632e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final EnumC9150e f16633e;

    public C8169e(boolean z, int i, EnumC9150e enumC9150e, C0193e c0193e) {
        super(f16630e, c0193e);
        this.f16632e = z;
        this.f16631e = i;
        this.f16633e = enumC9150e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8169e)) {
            return false;
        }
        C8169e c8169e = (C8169e) obj;
        return AbstractC7890e.billing(ad(), c8169e.ad()) && this.f16632e == c8169e.f16632e && this.f16631e == c8169e.f16631e && this.f16633e == c8169e.f16633e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f16633e.hashCode() + (((((ad().hashCode() * 37) + (this.f16632e ? 1231 : 1237)) * 37) + this.f16631e) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("enabled="), this.f16632e, arrayList, "duration_msec=");
        premium.append(this.f16631e);
        arrayList.add(premium.toString());
        arrayList.add("curve=" + this.f16633e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Crossfade{", "}", null, 56);
    }
}
