package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3418e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C5973e f7647e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C3418e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f7648e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC18502e f7649e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f7650e;

    public C3418e(EnumC18502e enumC18502e, String str, String str2, C0193e c0193e) {
        super(f7647e, c0193e);
        this.f7649e = enumC18502e;
        this.f7648e = str;
        this.f7650e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3418e)) {
            return false;
        }
        C3418e c3418e = (C3418e) obj;
        return AbstractC7890e.billing(ad(), c3418e.ad()) && this.f7649e == c3418e.f7649e && AbstractC7890e.billing(this.f7648e, c3418e.f7648e) && AbstractC7890e.billing(this.f7650e, c3418e.f7650e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f7650e.hashCode() + AbstractC1786e.advert((this.f7649e.hashCode() + (ad().hashCode() * 37)) * 37, 37, this.f7648e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.f7649e);
        AbstractC8647e.m2457goto(this.f7648e, "title=", arrayList);
        AbstractC8647e.m2457goto(this.f7650e, "data_=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "Action{", "}", null, 56);
    }
}
