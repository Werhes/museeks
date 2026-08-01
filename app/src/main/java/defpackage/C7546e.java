package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7546e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C4910e f15370e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C7546e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f15371e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f15372e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final EnumC17057e f15373e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f15374e;

    public /* synthetic */ C7546e(String str, int i) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) == 0 ? "8.12.1_pub" : BuildConfig.FLAVOR, (i & 4) != 0 ? 0 : 99167, EnumC17057e.f33396e, C0193e.f1409e);
    }

    public C7546e(String str, String str2, int i, EnumC17057e enumC17057e, C0193e c0193e) {
        super(f15370e, c0193e);
        this.f15372e = str;
        this.f15371e = str2;
        this.f15374e = i;
        this.f15373e = enumC17057e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7546e)) {
            return false;
        }
        C7546e c7546e = (C7546e) obj;
        return AbstractC7890e.billing(ad(), c7546e.ad()) && AbstractC7890e.billing(this.f15372e, c7546e.f15372e) && AbstractC7890e.billing(this.f15371e, c7546e.f15371e) && this.f15374e == c7546e.f15374e && this.f15373e == c7546e.f15373e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f15373e.hashCode() + ((AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f15372e), 37, this.f15371e) + this.f15374e) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f15372e, "package_name=", arrayList);
        arrayList.add("version_name=".concat(AbstractC4224e.advert(this.f15371e)));
        arrayList.add("version_code=" + this.f15374e);
        arrayList.add("platform=" + this.f15373e);
        return AbstractC13480e.m3608try(arrayList, ", ", "OrbitCoreApplicationInfo{", "}", null, 56);
    }
}
