package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16801e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C6445e f32936e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C16801e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f32937e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f32938e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f32939e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f32940e;

    public /* synthetic */ C16801e(String str, String str2, ArrayList arrayList) {
        this(str, str2, arrayList, false, C0193e.f1409e);
    }

    public C16801e(String str, String str2, List list, boolean z, C0193e c0193e) {
        super(f32936e, c0193e);
        this.f32938e = str;
        this.f32937e = str2;
        this.f32940e = z;
        this.f32939e = AbstractC4224e.billing("bands", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static C16801e vip(C16801e c16801e, String str, String str2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = c16801e.f32938e;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = c16801e.f32937e;
        }
        String str4 = str2;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = c16801e.f32939e;
        }
        boolean z = c16801e.f32940e;
        C0193e ad = c16801e.ad();
        c16801e.getClass();
        return new C16801e(str3, str4, arrayList2, z, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16801e)) {
            return false;
        }
        C16801e c16801e = (C16801e) obj;
        return AbstractC7890e.billing(ad(), c16801e.ad()) && AbstractC7890e.billing(this.f32938e, c16801e.f32938e) && AbstractC7890e.billing(this.f32937e, c16801e.f32937e) && AbstractC7890e.billing(this.f32939e, c16801e.f32939e) && this.f32940e == c16801e.f32940e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f32938e), 37, this.f32937e), 37, this.f32939e) + (this.f32940e ? 1231 : 1237);
        this.f15551e = billing;
        return billing;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f32938e, "id=", arrayList);
        AbstractC8647e.m2457goto(this.f32937e, "name=", arrayList);
        List list = this.f32939e;
        if (!list.isEmpty()) {
            arrayList.add("bands=" + list);
        }
        AbstractC8647e.m2460this(new StringBuilder("double_pass="), this.f32940e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "Equalizer{", "}", null, 56);
    }
}
