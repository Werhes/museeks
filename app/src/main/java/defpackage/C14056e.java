package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14056e extends AbstractC7654e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C13365e f27800e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C14056e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f27801e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float f27802e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f27803e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final float f27804e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f27805e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f27806e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f27807e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float f27808e;

    public /* synthetic */ C14056e(float f, float f2, float f3, float f4) {
        this(f, 3.0f, 80.0f, f2, f3, -90.0f, 1.0f, f4, C0193e.f1409e);
    }

    public C14056e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C0193e c0193e) {
        super(f27800e, c0193e);
        this.f27805e = f;
        this.f27801e = f2;
        this.f27808e = f3;
        this.f27807e = f4;
        this.f27803e = f5;
        this.f27806e = f6;
        this.f27802e = f7;
        this.f27804e = f8;
    }

    public static C14056e vip(C14056e c14056e, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if ((i & 1) != 0) {
            f = c14056e.f27805e;
        }
        float f9 = f;
        if ((i & 2) != 0) {
            f2 = c14056e.f27801e;
        }
        float f10 = f2;
        if ((i & 4) != 0) {
            f3 = c14056e.f27808e;
        }
        float f11 = f3;
        if ((i & 8) != 0) {
            f4 = c14056e.f27807e;
        }
        float f12 = f4;
        if ((i & 16) != 0) {
            f5 = c14056e.f27803e;
        }
        float f13 = f5;
        float f14 = (i & 32) != 0 ? c14056e.f27806e : f6;
        float f15 = (i & 64) != 0 ? c14056e.f27802e : f7;
        float f16 = (i & 128) != 0 ? c14056e.f27804e : f8;
        C0193e ad = c14056e.ad();
        c14056e.getClass();
        return new C14056e(f9, f10, f11, f12, f13, f14, f15, f16, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14056e)) {
            return false;
        }
        C14056e c14056e = (C14056e) obj;
        return AbstractC7890e.billing(ad(), c14056e.ad()) && this.f27805e == c14056e.f27805e && this.f27801e == c14056e.f27801e && this.f27808e == c14056e.f27808e && this.f27807e == c14056e.f27807e && this.f27803e == c14056e.f27803e && this.f27806e == c14056e.f27806e && this.f27802e == c14056e.f27802e && this.f27804e == c14056e.f27804e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int floatToIntBits = Float.floatToIntBits(this.f27804e) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(ad().hashCode() * 37, this.f27805e, 37), this.f27801e, 37), this.f27808e, 37), this.f27807e, 37), this.f27803e, 37), this.f27806e, 37), this.f27802e, 37);
        this.f15551e = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cutoff_frequency=" + this.f27805e);
        arrayList.add("attack_time=" + this.f27801e);
        arrayList.add("release_time=" + this.f27808e);
        arrayList.add("ratio=" + this.f27807e);
        arrayList.add("threshold=" + this.f27803e);
        arrayList.add("noise_gate_threshold=" + this.f27806e);
        arrayList.add("expander_ratio=" + this.f27802e);
        arrayList.add("post_gain=" + this.f27804e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Band{", "}", null, 56);
    }
}
