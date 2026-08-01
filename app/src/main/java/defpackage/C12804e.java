package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12804e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17297e f25625e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12804e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25626e;

    public C12804e(boolean z, C0193e c0193e) {
        super(f25625e, c0193e);
        this.f25626e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12804e)) {
            return false;
        }
        C12804e c12804e = (C12804e) obj;
        return AbstractC7890e.billing(ad(), c12804e.ad()) && this.f25626e == c12804e.f25626e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (ad().hashCode() * 37) + (this.f25626e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2460this(new StringBuilder("success="), this.f25626e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthorizationFinishSessionResponse{", "}", null, 56);
    }
}
