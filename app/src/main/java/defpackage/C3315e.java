package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3315e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17842e f7483e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C3315e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f7484e;

    public C3315e(long j, C0193e c0193e) {
        super(f7483e, c0193e);
        this.f7484e = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3315e)) {
            return false;
        }
        C3315e c3315e = (C3315e) obj;
        return AbstractC7890e.billing(ad(), c3315e.ad()) && this.f7484e == c3315e.f7484e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f7484e;
        int i2 = hashCode + ((int) (j ^ (j >>> 32)));
        this.f15551e = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("date=" + this.f7484e);
        return AbstractC13480e.m3608try(arrayList, ", ", "InboxSetReadDateRequest{", "}", null, 56);
    }
}
