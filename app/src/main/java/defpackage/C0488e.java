package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7438e f2553e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C0488e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f2554e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f2555e;

    public /* synthetic */ C0488e(long j, String str) {
        this(j, str, C0193e.f1409e);
    }

    public C0488e(long j, String str, C0193e c0193e) {
        super(f2553e, c0193e);
        this.f2555e = j;
        this.f2554e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0488e)) {
            return false;
        }
        C0488e c0488e = (C0488e) obj;
        return AbstractC7890e.billing(ad(), c0488e.ad()) && this.f2555e == c0488e.f2555e && AbstractC7890e.billing(this.f2554e, c0488e.f2554e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f2555e;
        int hashCode2 = this.f2554e.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 37);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("size=" + this.f2555e);
        AbstractC8647e.m2457goto(this.f2554e, "destination=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "CdcmFileMarker{", "}", null, 56);
    }
}
