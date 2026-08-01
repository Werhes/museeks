package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12058e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C8944e f24165e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C12058e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f24166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f24167e;

    public C12058e(int i, String str, C0193e c0193e) {
        super(f24165e, c0193e);
        this.f24167e = i;
        this.f24166e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12058e)) {
            return false;
        }
        C12058e c12058e = (C12058e) obj;
        return AbstractC7890e.billing(ad(), c12058e.ad()) && this.f24167e == c12058e.f24167e && AbstractC7890e.billing(this.f24166e, c12058e.f24166e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f24166e.hashCode() + (((ad().hashCode() * 37) + this.f24167e) * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("code=" + this.f24167e);
        AbstractC8647e.m2457goto(this.f24166e, "message=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "SparkErrorResponse{", "}", null, 56);
    }
}
