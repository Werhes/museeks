package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16074e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C3384e f31665e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C16074e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f31666e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f31667e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f31668e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f31669e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f31670e;

    public /* synthetic */ C16074e(boolean z, float f, float f2, int i) {
        this(true, z, false, f, f2, C0193e.f1409e);
    }

    public C16074e(boolean z, boolean z2, boolean z3, float f, float f2, C0193e c0193e) {
        super(f31665e, c0193e);
        this.f31668e = z;
        this.f31666e = z2;
        this.f31670e = z3;
        this.f31669e = f;
        this.f31667e = f2;
    }

    public static C16074e vip(C16074e c16074e, boolean z, boolean z2, boolean z3, float f, float f2, int i) {
        if ((i & 1) != 0) {
            z = c16074e.f31668e;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = c16074e.f31666e;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c16074e.f31670e;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            f = c16074e.f31669e;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = c16074e.f31667e;
        }
        C0193e ad = c16074e.ad();
        c16074e.getClass();
        return new C16074e(z4, z5, z6, f3, f2, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16074e)) {
            return false;
        }
        C16074e c16074e = (C16074e) obj;
        return AbstractC7890e.billing(ad(), c16074e.ad()) && this.f31668e == c16074e.f31668e && this.f31666e == c16074e.f31666e && this.f31670e == c16074e.f31670e && this.f31669e == c16074e.f31669e && this.f31667e == c16074e.f31667e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int floatToIntBits = Float.floatToIntBits(this.f31667e) + AbstractC1414e.license(((((((ad().hashCode() * 37) + (this.f31668e ? 1231 : 1237)) * 37) + (this.f31666e ? 1231 : 1237)) * 37) + (this.f31670e ? 1231 : 1237)) * 37, this.f31669e, 37);
        this.f15551e = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("enabled="), this.f31668e, arrayList, "use_automatic_gain_instead="), this.f31666e, arrayList, "use_lower_automatic_gain_factor="), this.f31670e, arrayList, "gain_left=");
        premium.append(this.f31669e);
        arrayList.add(premium.toString());
        arrayList.add("gain_right=" + this.f31667e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Gain{", "}", null, 56);
    }
}
