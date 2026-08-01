package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2936e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C2611e f6930e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C2936e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC10900e f6931e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f6932e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final List f6933e;

    public C2936e(String str, EnumC10900e enumC10900e, List list, C0193e c0193e) {
        super(f6930e, c0193e);
        this.f6932e = str;
        this.f6931e = enumC10900e;
        this.f6933e = AbstractC4224e.billing("stack_trace", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2936e)) {
            return false;
        }
        C2936e c2936e = (C2936e) obj;
        return AbstractC7890e.billing(ad(), c2936e.ad()) && AbstractC7890e.billing(this.f6932e, c2936e.f6932e) && this.f6931e == c2936e.f6931e && AbstractC7890e.billing(this.f6933e, c2936e.f6933e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f6933e.hashCode() + ((this.f6931e.hashCode() + AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f6932e)) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=".concat(AbstractC4224e.advert(this.f6932e)));
        arrayList.add("state=" + this.f6931e);
        List list = this.f6933e;
        if (!list.isEmpty()) {
            arrayList.add("stack_trace=" + list);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "ThreadReport{", "}", null, 56);
    }
}
