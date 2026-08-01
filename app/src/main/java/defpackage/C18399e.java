package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18399e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C4698e f36074e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C18399e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f36075e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f36076e;

    public /* synthetic */ C18399e(int i, int i2) {
        this(i, i2, C0193e.f1409e);
    }

    public C18399e(int i, int i2, C0193e c0193e) {
        super(f36074e, c0193e);
        this.f36076e = i;
        this.f36075e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18399e)) {
            return false;
        }
        C18399e c18399e = (C18399e) obj;
        return AbstractC7890e.billing(ad(), c18399e.ad()) && this.f36076e == c18399e.f36076e && this.f36075e == c18399e.f36075e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (((ad().hashCode() * 37) + this.f36076e) * 37) + this.f36075e;
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count=" + this.f36076e);
        arrayList.add("offset=" + this.f36075e);
        return AbstractC13480e.m3608try(arrayList, ", ", "SparkPaging{", "}", null, 56);
    }
}
