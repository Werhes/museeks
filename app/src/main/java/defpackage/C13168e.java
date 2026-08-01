package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13168e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C16356e f26142e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C13168e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f26143e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f26144e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f26145e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f26146e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f26147e;

    public C13168e(int i, String str, long j, String str2, boolean z, C0193e c0193e) {
        super(f26142e, c0193e);
        this.f26145e = i;
        this.f26143e = str;
        this.f26147e = j;
        this.f26146e = str2;
        this.f26144e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13168e)) {
            return false;
        }
        C13168e c13168e = (C13168e) obj;
        return AbstractC7890e.billing(ad(), c13168e.ad()) && this.f26145e == c13168e.f26145e && AbstractC7890e.billing(this.f26143e, c13168e.f26143e) && this.f26147e == c13168e.f26147e && AbstractC7890e.billing(this.f26146e, c13168e.f26146e) && this.f26144e == c13168e.f26144e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = AbstractC1786e.advert(((ad().hashCode() * 37) + this.f26145e) * 37, 37, this.f26143e);
        long j = this.f26147e;
        int advert2 = AbstractC1786e.advert((advert + ((int) (j ^ (j >>> 32)))) * 37, 37, this.f26146e) + (this.f26144e ? 1231 : 1237);
        this.f15551e = advert2;
        return advert2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("version_code=" + this.f26145e);
        arrayList.add("version_name=".concat(AbstractC4224e.advert(this.f26143e)));
        arrayList.add("release_date=" + this.f26147e);
        arrayList.add("changelog=".concat(AbstractC4224e.advert(this.f26146e)));
        AbstractC8647e.m2460this(new StringBuilder("is_beta="), this.f26144e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "ApplicationUpdateChangelog{", "}", null, 56);
    }
}
