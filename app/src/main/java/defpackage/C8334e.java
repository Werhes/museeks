package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8334e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C3494e f17060e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C8334e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final List f17061e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f17062e;

    public C8334e(ArrayList arrayList, long j, C0193e c0193e) {
        super(f17060e, c0193e);
        this.f17062e = j;
        this.f17061e = AbstractC4224e.billing("messages", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8334e)) {
            return false;
        }
        C8334e c8334e = (C8334e) obj;
        return AbstractC7890e.billing(ad(), c8334e.ad()) && AbstractC7890e.billing(this.f17061e, c8334e.f17061e) && this.f17062e == c8334e.f17062e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = AbstractC17861e.billing(ad().hashCode() * 37, 37, this.f17061e);
        long j = this.f17062e;
        int i2 = billing + ((int) (j ^ (j >>> 32)));
        this.f15551e = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f17061e;
        if (!list.isEmpty()) {
            arrayList.add("messages=" + list);
        }
        arrayList.add("last_read=" + this.f17062e);
        return AbstractC13480e.m3608try(arrayList, ", ", "InboxList{", "}", null, 56);
    }
}
