package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7190e extends AbstractC7654e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C10980e f14693e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C7190e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f14694e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f14695e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f14696e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f14697e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f14698e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float f14699e;

    public C7190e(boolean z, float f, float f2, float f3, float f4, float f5, C0193e c0193e) {
        super(f14693e, c0193e);
        this.f14696e = z;
        this.f14694e = f;
        this.f14699e = f2;
        this.f14698e = f3;
        this.f14695e = f4;
        this.f14697e = f5;
    }

    public static C7190e vip(C7190e c7190e, boolean z, float f, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            z = c7190e.f14696e;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            f = c7190e.f14694e;
        }
        float f6 = f;
        if ((i & 4) != 0) {
            f2 = c7190e.f14699e;
        }
        float f7 = f2;
        if ((i & 8) != 0) {
            f3 = c7190e.f14698e;
        }
        float f8 = f3;
        if ((i & 16) != 0) {
            f4 = c7190e.f14695e;
        }
        float f9 = f4;
        if ((i & 32) != 0) {
            f5 = c7190e.f14697e;
        }
        C0193e ad = c7190e.ad();
        c7190e.getClass();
        return new C7190e(z2, f6, f7, f8, f9, f5, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7190e)) {
            return false;
        }
        C7190e c7190e = (C7190e) obj;
        return AbstractC7890e.billing(ad(), c7190e.ad()) && this.f14696e == c7190e.f14696e && this.f14694e == c7190e.f14694e && this.f14699e == c7190e.f14699e && this.f14698e == c7190e.f14698e && this.f14695e == c7190e.f14695e && this.f14697e == c7190e.f14697e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int floatToIntBits = Float.floatToIntBits(this.f14697e) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(((ad().hashCode() * 37) + (this.f14696e ? 1231 : 1237)) * 37, this.f14694e, 37), this.f14699e, 37), this.f14698e, 37), this.f14695e, 37);
        this.f15551e = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("enabled="), this.f14696e, arrayList, "attack_time=");
        premium.append(this.f14694e);
        arrayList.add(premium.toString());
        arrayList.add("release_time=" + this.f14699e);
        arrayList.add("ratio=" + this.f14698e);
        arrayList.add("threshold=" + this.f14695e);
        arrayList.add("post_gain=" + this.f14697e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Limiter{", "}", null, 56);
    }
}
