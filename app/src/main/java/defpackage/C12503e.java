package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12503e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15248e f25043e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12503e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17333e f25044e;

    public C12503e(C17333e c17333e, C0193e c0193e) {
        super(f25043e, c0193e);
        this.f25044e = c17333e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12503e)) {
            return false;
        }
        C12503e c12503e = (C12503e) obj;
        return AbstractC7890e.billing(ad(), c12503e.ad()) && AbstractC7890e.billing(this.f25044e, c12503e.f25044e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C17333e c17333e = this.f25044e;
        int hashCode2 = hashCode + (c17333e != null ? c17333e.hashCode() : 0);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C17333e c17333e = this.f25044e;
        if (c17333e != null) {
            arrayList.add("tag=" + c17333e);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthorizationStartSession{", "}", null, 56);
    }
}
