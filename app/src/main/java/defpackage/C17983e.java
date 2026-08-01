package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17983e extends AbstractC7654e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C4618e f35272e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C17983e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f35273e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC3217e f35274e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Long f35275e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f35276e;

    public C17983e(EnumC3217e enumC3217e, String str, String str2, Long l, C0193e c0193e) {
        super(f35272e, c0193e);
        this.f35274e = enumC3217e;
        this.f35273e = str;
        this.f35276e = str2;
        this.f35275e = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17983e)) {
            return false;
        }
        C17983e c17983e = (C17983e) obj;
        return AbstractC7890e.billing(ad(), c17983e.ad()) && this.f35274e == c17983e.f35274e && AbstractC7890e.billing(this.f35273e, c17983e.f35273e) && AbstractC7890e.billing(this.f35276e, c17983e.f35276e) && AbstractC7890e.billing(this.f35275e, c17983e.f35275e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.f35274e.hashCode() + (ad().hashCode() * 37)) * 37;
        String str = this.f35273e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f35276e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.f35275e;
        int hashCode4 = hashCode3 + (l != null ? l.hashCode() : 0);
        this.f15551e = hashCode4;
        return hashCode4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("result=" + this.f35274e);
        String str = this.f35273e;
        if (str != null) {
            AbstractC8647e.m2457goto(str, "product_id=", arrayList);
        }
        String str2 = this.f35276e;
        if (str2 != null) {
            AbstractC8647e.m2457goto(str2, "product_name=", arrayList);
        }
        Long l = this.f35275e;
        if (l != null) {
            arrayList.add("product_expires_at=" + l);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "CodeActivateResponse{", "}", null, 56);
    }
}
