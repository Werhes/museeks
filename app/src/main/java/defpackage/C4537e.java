package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4537e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C9983e f9821e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C4537e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C16742e f9822e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11590e f9823e;

    public C4537e(C11590e c11590e, C16742e c16742e, C0193e c0193e) {
        super(f9821e, c0193e);
        this.f9823e = c11590e;
        this.f9822e = c16742e;
        if ((c11590e != null ? 1 : 0) + (c16742e != null ? 1 : 0) > 1) {
            throw new IllegalArgumentException("At most one of purchase, code_activation may be non-null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4537e)) {
            return false;
        }
        C4537e c4537e = (C4537e) obj;
        return AbstractC7890e.billing(ad(), c4537e.ad()) && AbstractC7890e.billing(this.f9823e, c4537e.f9823e) && AbstractC7890e.billing(this.f9822e, c4537e.f9822e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C11590e c11590e = this.f9823e;
        int hashCode2 = (hashCode + (c11590e != null ? c11590e.hashCode() : 0)) * 37;
        C16742e c16742e = this.f9822e;
        int hashCode3 = hashCode2 + (c16742e != null ? c16742e.hashCode() : 0);
        this.f15551e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C11590e c11590e = this.f9823e;
        if (c11590e != null) {
            arrayList.add("purchase=" + c11590e);
        }
        C16742e c16742e = this.f9822e;
        if (c16742e != null) {
            arrayList.add("code_activation=" + c16742e);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "Entry{", "}", null, 56);
    }
}
