package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11312e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1992e f22695e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C11312e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f22696e;

    public /* synthetic */ C11312e(int i) {
        this(i, C0193e.f1409e);
    }

    public C11312e(int i, C0193e c0193e) {
        super(f22695e, c0193e);
        this.f22696e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11312e)) {
            return false;
        }
        C11312e c11312e = (C11312e) obj;
        return AbstractC7890e.billing(ad(), c11312e.ad()) && this.f22696e == c11312e.f22696e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (ad().hashCode() * 37) + this.f22696e;
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("error_code=" + this.f22696e);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacGenericExceptionResponse{", "}", null, 56);
    }
}
