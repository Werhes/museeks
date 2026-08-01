package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6007e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C0955e f12655e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C6007e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f12656e;

    public C6007e(C0193e c0193e, String str) {
        super(f12655e, c0193e);
        this.f12656e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6007e)) {
            return false;
        }
        C6007e c6007e = (C6007e) obj;
        return AbstractC7890e.billing(ad(), c6007e.ad()) && AbstractC7890e.billing(this.f12656e, c6007e.f12656e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f12656e.hashCode() + (ad().hashCode() * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f12656e, "url=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "PaymentBuildUrlResponse{", "}", null, 56);
    }
}
