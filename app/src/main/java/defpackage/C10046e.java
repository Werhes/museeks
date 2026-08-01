package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10046e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C3505e f19844e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C10046e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f19845e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final List f19846e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f19847e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f19848e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C10046e f19849e;

    public C10046e(String str, String str2, List list, List list2, C10046e c10046e, C0193e c0193e) {
        super(f19844e, c0193e);
        this.f19847e = str;
        this.f19845e = str2;
        this.f19849e = c10046e;
        this.f19848e = AbstractC4224e.billing("stack_trace", list);
        this.f19846e = AbstractC4224e.billing("suppressed_exceptions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10046e)) {
            return false;
        }
        C10046e c10046e = (C10046e) obj;
        return AbstractC7890e.billing(ad(), c10046e.ad()) && AbstractC7890e.billing(this.f19847e, c10046e.f19847e) && AbstractC7890e.billing(this.f19845e, c10046e.f19845e) && AbstractC7890e.billing(this.f19848e, c10046e.f19848e) && AbstractC7890e.billing(this.f19846e, c10046e.f19846e) && AbstractC7890e.billing(this.f19849e, c10046e.f19849e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = AbstractC17861e.billing(AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f19847e), 37, this.f19845e), 37, this.f19848e), 37, this.f19846e);
        C10046e c10046e = this.f19849e;
        int hashCode = billing + (c10046e != null ? c10046e.hashCode() : 0);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f19847e, "exception_class=", arrayList);
        AbstractC8647e.m2457goto(this.f19845e, "message=", arrayList);
        List list = this.f19848e;
        if (!list.isEmpty()) {
            arrayList.add("stack_trace=" + list);
        }
        List list2 = this.f19846e;
        if (!list2.isEmpty()) {
            arrayList.add("suppressed_exceptions=" + list2);
        }
        C10046e c10046e = this.f19849e;
        if (c10046e != null) {
            arrayList.add("cause=" + c10046e);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "ExceptionReport{", "}", null, 56);
    }
}
