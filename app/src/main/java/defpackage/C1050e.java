package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16962e f3535e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C1050e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f3536e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f3537e;

    public /* synthetic */ C1050e(float f, float f2) {
        this(f, f2, C0193e.f1409e);
    }

    public C1050e(float f, float f2, C0193e c0193e) {
        super(f3535e, c0193e);
        this.f3537e = f;
        this.f3536e = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1050e)) {
            return false;
        }
        C1050e c1050e = (C1050e) obj;
        return AbstractC7890e.billing(ad(), c1050e.ad()) && this.f3537e == c1050e.f3537e && this.f3536e == c1050e.f3536e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int floatToIntBits = Float.floatToIntBits(this.f3536e) + AbstractC1414e.license(ad().hashCode() * 37, this.f3537e, 37);
        this.f15551e = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cutoff_frequency=" + this.f3537e);
        arrayList.add("gain=" + this.f3536e);
        return AbstractC13480e.m3608try(arrayList, ", ", "Band{", "}", null, 56);
    }
}
