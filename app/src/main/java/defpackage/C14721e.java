package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14721e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C0163e f29132e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C14721e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C7546e f29133e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f29134e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f29135e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C11333e f29136e;

    public C14721e(long j, C7546e c7546e, C11333e c11333e, ArrayList arrayList, C0193e c0193e) {
        super(f29132e, c0193e);
        this.f29134e = j;
        this.f29133e = c7546e;
        this.f29136e = c11333e;
        this.f29135e = AbstractC4224e.billing("lines", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14721e)) {
            return false;
        }
        C14721e c14721e = (C14721e) obj;
        return AbstractC7890e.billing(ad(), c14721e.ad()) && this.f29134e == c14721e.f29134e && AbstractC7890e.billing(this.f29133e, c14721e.f29133e) && AbstractC7890e.billing(this.f29136e, c14721e.f29136e) && AbstractC7890e.billing(this.f29135e, c14721e.f29135e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f29134e;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 37;
        C7546e c7546e = this.f29133e;
        int hashCode2 = (i2 + (c7546e != null ? c7546e.hashCode() : 0)) * 37;
        C11333e c11333e = this.f29136e;
        int hashCode3 = this.f29135e.hashCode() + ((hashCode2 + (c11333e != null ? c11333e.hashCode() : 0)) * 37);
        this.f15551e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start_time=" + this.f29134e);
        C7546e c7546e = this.f29133e;
        if (c7546e != null) {
            arrayList.add("application=" + c7546e);
        }
        C11333e c11333e = this.f29136e;
        if (c11333e != null) {
            arrayList.add("device=" + c11333e);
        }
        List list = this.f29135e;
        if (!list.isEmpty()) {
            arrayList.add("lines=" + list);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "OrbitCoreLogcat{", "}", null, 56);
    }
}
