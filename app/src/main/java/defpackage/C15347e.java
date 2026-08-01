package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15347e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C3369e f30269e = new C3369e(AbstractC3820e.ad.vip(C15347e.class));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Map f30270e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f30271e;

    public C15347e(String str, LinkedHashMap linkedHashMap, C0193e c0193e) {
        super(f30269e, c0193e);
        this.f30271e = str;
        this.f30270e = AbstractC4224e.yandex("replacements", linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15347e)) {
            return false;
        }
        C15347e c15347e = (C15347e) obj;
        return AbstractC7890e.billing(ad(), c15347e.ad()) && AbstractC7890e.billing(this.f30271e, c15347e.f30271e) && AbstractC7890e.billing(this.f30270e, c15347e.f30270e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f30270e.hashCode() + AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f30271e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f30271e, "text=", arrayList);
        Map map = this.f30270e;
        if (!map.isEmpty()) {
            arrayList.add("replacements=" + map);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "Content{", "}", null, 56);
    }
}
