package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C1141e f6649e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C2746e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f6650e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f6651e;

    public C2746e(int i, int i2, C0193e c0193e) {
        super(f6649e, c0193e);
        this.f6651e = i;
        this.f6650e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2746e)) {
            return false;
        }
        C2746e c2746e = (C2746e) obj;
        return AbstractC7890e.billing(ad(), c2746e.ad()) && this.f6651e == c2746e.f6651e && this.f6650e == c2746e.f6650e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (((ad().hashCode() * 37) + this.f6651e) * 37) + this.f6650e;
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("host_ip=" + this.f6651e);
        arrayList.add("host_port=" + this.f6650e);
        return AbstractC13480e.m3608try(arrayList, ", ", "IacAuthorizationDeeplink{", "}", null, 56);
    }
}
