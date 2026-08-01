package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12212e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C14315e f24523e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12212e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f24524e;

    public C12212e(boolean z, C0193e c0193e) {
        super(f24523e, c0193e);
        this.f24524e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12212e)) {
            return false;
        }
        C12212e c12212e = (C12212e) obj;
        return AbstractC7890e.billing(ad(), c12212e.ad()) && this.f24524e == c12212e.f24524e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (ad().hashCode() * 37) + (this.f24524e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2460this(new StringBuilder("ok="), this.f24524e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "SparkNoResponse{", "}", null, 56);
    }
}
