package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C3298e f4526e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C1609e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f4527e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f4528e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f4529e;

    public C1609e(long j, int i, boolean z, C0193e c0193e) {
        super(f4526e, c0193e);
        this.f4528e = j;
        this.f4527e = i;
        this.f4529e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1609e)) {
            return false;
        }
        C1609e c1609e = (C1609e) obj;
        return AbstractC7890e.billing(ad(), c1609e.ad()) && this.f4528e == c1609e.f4528e && this.f4527e == c1609e.f4527e && this.f4529e == c1609e.f4529e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f4528e;
        int i2 = ((((hashCode + ((int) (j ^ (j >>> 32)))) * 37) + this.f4527e) * 37) + (this.f4529e ? 1231 : 1237);
        this.f15551e = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("last_read=" + this.f4528e);
        arrayList.add("unread_messages=" + this.f4527e);
        AbstractC8647e.m2460this(new StringBuilder("is_important="), this.f4529e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "InboxIsReadResponse{", "}", null, 56);
    }
}
