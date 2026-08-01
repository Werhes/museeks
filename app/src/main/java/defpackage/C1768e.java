package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768e extends AbstractC7654e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C4104e f4809e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C1768e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f4810e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f4811e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f4812e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f4813e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f4814e;

    public C1768e(String str, String str2, String str3, String str4, String str5, C0193e c0193e) {
        super(f4809e, c0193e);
        this.f4812e = str;
        this.f4810e = str2;
        this.f4814e = str3;
        this.f4813e = str4;
        this.f4811e = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1768e)) {
            return false;
        }
        C1768e c1768e = (C1768e) obj;
        return AbstractC7890e.billing(ad(), c1768e.ad()) && AbstractC7890e.billing(this.f4812e, c1768e.f4812e) && AbstractC7890e.billing(this.f4810e, c1768e.f4810e) && AbstractC7890e.billing(this.f4814e, c1768e.f4814e) && AbstractC7890e.billing(this.f4813e, c1768e.f4813e) && AbstractC7890e.billing(this.f4811e, c1768e.f4811e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f4811e.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f4812e), 37, this.f4810e), 37, this.f4814e), 37, this.f4813e);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f4812e, "type=", arrayList);
        AbstractC8647e.m2457goto(this.f4810e, "title=", arrayList);
        AbstractC8647e.m2457goto(this.f4814e, "subtitle=", arrayList);
        AbstractC8647e.m2457goto(this.f4813e, "photo_url=", arrayList);
        AbstractC8647e.m2457goto(this.f4811e, "element_url=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "WidgetItem{", "}", null, 56);
    }
}
