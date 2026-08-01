package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6019e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C2524e f12675e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C6019e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f12676e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f12677e;

    public /* synthetic */ C6019e(float f, int i, boolean z) {
        this(z, (i & 2) != 0 ? 0.0f : f, C0193e.f1409e);
    }

    public C6019e(boolean z, float f, C0193e c0193e) {
        super(f12675e, c0193e);
        this.f12677e = z;
        this.f12676e = f;
    }

    public static C6019e vip(C6019e c6019e, boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = c6019e.f12677e;
        }
        if ((i & 2) != 0) {
            f = c6019e.f12676e;
        }
        C0193e ad = c6019e.ad();
        c6019e.getClass();
        return new C6019e(z, f, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6019e)) {
            return false;
        }
        C6019e c6019e = (C6019e) obj;
        return AbstractC7890e.billing(ad(), c6019e.ad()) && this.f12677e == c6019e.f12677e && this.f12676e == c6019e.f12676e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int floatToIntBits = Float.floatToIntBits(this.f12676e) + (((ad().hashCode() * 37) + (this.f12677e ? 1231 : 1237)) * 37);
        this.f15551e = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("enabled="), this.f12677e, arrayList, "value_=");
        premium.append(this.f12676e);
        arrayList.add(premium.toString());
        return AbstractC13480e.m3608try(arrayList, ", ", "LegacyEffect{", "}", null, 56);
    }
}
