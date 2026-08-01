package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5267e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C0558e f11344e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C5267e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f11345e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final List f11346e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f11347e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f11348e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f11349e;

    public C5267e(boolean z, boolean z2, int i, int i2, List list, C0193e c0193e) {
        super(f11344e, c0193e);
        this.f11347e = z;
        this.f11345e = z2;
        this.f11349e = i;
        this.f11348e = i2;
        this.f11346e = AbstractC4224e.billing("bands", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    public static C5267e vip(C5267e c5267e, boolean z, boolean z2, int i, int i2, ArrayList arrayList, int i3) {
        if ((i3 & 1) != 0) {
            z = c5267e.f11347e;
        }
        boolean z3 = z;
        if ((i3 & 2) != 0) {
            z2 = c5267e.f11345e;
        }
        boolean z4 = z2;
        if ((i3 & 4) != 0) {
            i = c5267e.f11349e;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = c5267e.f11348e;
        }
        int i5 = i2;
        ArrayList arrayList2 = arrayList;
        if ((i3 & 16) != 0) {
            arrayList2 = c5267e.f11346e;
        }
        C0193e ad = c5267e.ad();
        c5267e.getClass();
        return new C5267e(z3, z4, i4, i5, arrayList2, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5267e)) {
            return false;
        }
        C5267e c5267e = (C5267e) obj;
        return AbstractC7890e.billing(ad(), c5267e.ad()) && this.f11347e == c5267e.f11347e && this.f11345e == c5267e.f11345e && this.f11349e == c5267e.f11349e && this.f11348e == c5267e.f11348e && AbstractC7890e.billing(this.f11346e, c5267e.f11346e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f11346e.hashCode() + (((((((((ad().hashCode() * 37) + (this.f11347e ? 1231 : 1237)) * 37) + (this.f11345e ? 1231 : 1237)) * 37) + this.f11349e) * 37) + this.f11348e) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("enabled="), this.f11347e, arrayList, "advanced_mode="), this.f11345e, arrayList, "easy_bass_boost_value=");
        premium.append(this.f11349e);
        arrayList.add(premium.toString());
        arrayList.add("easy_treble_boost_value=" + this.f11348e);
        List list = this.f11346e;
        if (!list.isEmpty()) {
            arrayList.add("bands=" + list);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "Compressor{", "}", null, 56);
    }
}
