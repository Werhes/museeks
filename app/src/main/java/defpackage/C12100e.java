package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12100e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C8706e f24256e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12100e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC8488e f24257e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f24258e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f24259e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f24260e;

    public C12100e(long j, EnumC8488e enumC8488e, String str, String str2, C0193e c0193e) {
        super(f24256e, c0193e);
        this.f24258e = j;
        this.f24257e = enumC8488e;
        this.f24260e = str;
        this.f24259e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12100e)) {
            return false;
        }
        C12100e c12100e = (C12100e) obj;
        return AbstractC7890e.billing(ad(), c12100e.ad()) && this.f24258e == c12100e.f24258e && this.f24257e == c12100e.f24257e && AbstractC7890e.billing(this.f24260e, c12100e.f24260e) && AbstractC7890e.billing(this.f24259e, c12100e.f24259e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f24258e;
        int hashCode2 = this.f24259e.hashCode() + AbstractC1786e.advert((this.f24257e.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37, 37, this.f24260e);
        this.f15551e = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("time=" + this.f24258e);
        arrayList.add("severity=" + this.f24257e);
        AbstractC8647e.m2457goto(this.f24260e, "tag=", arrayList);
        AbstractC8647e.m2457goto(this.f24259e, "message=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "Line{", "}", null, 56);
    }
}
