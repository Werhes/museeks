package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9037e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16010e f18097e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C9037e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC16745e f18098e;

    public C9037e(EnumC16745e enumC16745e, C0193e c0193e) {
        super(f18097e, c0193e);
        this.f18098e = enumC16745e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9037e)) {
            return false;
        }
        C9037e c9037e = (C9037e) obj;
        return AbstractC7890e.billing(ad(), c9037e.ad()) && this.f18098e == c9037e.f18098e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f18098e.hashCode() + (ad().hashCode() * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product=" + this.f18098e);
        return AbstractC13480e.m3608try(arrayList, ", ", "ProductInformationRequest{", "}", null, 56);
    }
}
