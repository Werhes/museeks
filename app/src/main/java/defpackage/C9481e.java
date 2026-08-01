package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9481e extends AbstractC7654e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C17261e f18820e = new C17261e(AbstractC3820e.ad.vip(C9481e.class));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC14764e f18821e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final Map f18822e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C14721e f18823e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f18824e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final List f18825e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f18826e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C10046e f18827e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C11333e f18828e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C7546e f18829e;

    public C9481e(long j, EnumC14764e enumC14764e, C7546e c7546e, C11333e c11333e, String str, C10046e c10046e, C14721e c14721e, List list, Map map, C0193e c0193e) {
        super(f18820e, c0193e);
        this.f18826e = j;
        this.f18821e = enumC14764e;
        this.f18829e = c7546e;
        this.f18828e = c11333e;
        this.f18824e = str;
        this.f18827e = c10046e;
        this.f18823e = c14721e;
        this.f18825e = AbstractC4224e.billing("threads", list);
        this.f18822e = AbstractC4224e.yandex("custom_attributes", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9481e)) {
            return false;
        }
        C9481e c9481e = (C9481e) obj;
        return AbstractC7890e.billing(ad(), c9481e.ad()) && this.f18826e == c9481e.f18826e && this.f18821e == c9481e.f18821e && AbstractC7890e.billing(this.f18829e, c9481e.f18829e) && AbstractC7890e.billing(this.f18828e, c9481e.f18828e) && AbstractC7890e.billing(this.f18824e, c9481e.f18824e) && AbstractC7890e.billing(this.f18827e, c9481e.f18827e) && AbstractC7890e.billing(this.f18823e, c9481e.f18823e) && AbstractC7890e.billing(this.f18825e, c9481e.f18825e) && AbstractC7890e.billing(this.f18822e, c9481e.f18822e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        long j = this.f18826e;
        int hashCode2 = (this.f18821e.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 37)) * 37;
        C7546e c7546e = this.f18829e;
        int hashCode3 = (hashCode2 + (c7546e != null ? c7546e.hashCode() : 0)) * 37;
        C11333e c11333e = this.f18828e;
        int advert = AbstractC1786e.advert((hashCode3 + (c11333e != null ? c11333e.hashCode() : 0)) * 37, 37, this.f18824e);
        C10046e c10046e = this.f18827e;
        int hashCode4 = (advert + (c10046e != null ? c10046e.hashCode() : 0)) * 37;
        C14721e c14721e = this.f18823e;
        int hashCode5 = this.f18822e.hashCode() + AbstractC17861e.billing((hashCode4 + (c14721e != null ? c14721e.hashCode() : 0)) * 37, 37, this.f18825e);
        this.f15551e = hashCode5;
        return hashCode5;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("taken_at=" + this.f18826e);
        arrayList.add("bugreportType=" + this.f18821e);
        C7546e c7546e = this.f18829e;
        if (c7546e != null) {
            arrayList.add("application=" + c7546e);
        }
        C11333e c11333e = this.f18828e;
        if (c11333e != null) {
            arrayList.add("device=" + c11333e);
        }
        AbstractC8647e.m2457goto(this.f18824e, "exception_thread_name=", arrayList);
        C10046e c10046e = this.f18827e;
        if (c10046e != null) {
            arrayList.add("exception=" + c10046e);
        }
        C14721e c14721e = this.f18823e;
        if (c14721e != null) {
            arrayList.add("logcat=" + c14721e);
        }
        List list = this.f18825e;
        if (!list.isEmpty()) {
            arrayList.add("threads=" + list);
        }
        Map map = this.f18822e;
        if (!map.isEmpty()) {
            arrayList.add("custom_attributes=" + map);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "OrbitCoreBugReport{", "}", null, 56);
    }
}
