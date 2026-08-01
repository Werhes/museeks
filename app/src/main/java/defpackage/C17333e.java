package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17333e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C2049e f34013e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C17333e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f34014e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f34015e;

    public C17333e(long j, String str, C0193e c0193e) {
        super(f34013e, c0193e);
        this.f34015e = j;
        this.f34014e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17333e)) {
            return false;
        }
        C17333e c17333e = (C17333e) obj;
        return AbstractC7890e.billing(ad(), c17333e.ad()) && this.f34015e == c17333e.f34015e && AbstractC7890e.billing(this.f34014e, c17333e.f34014e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f34015e;
        int hashCode2 = this.f34014e.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 37);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.f34015e);
        AbstractC8647e.m2457goto(this.f34014e, "service=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthAccountTag{", "}", null, 56);
    }
}
