package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17832e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2201e f34939e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C17832e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f34940e;

    public C17832e(C0193e c0193e, String str) {
        super(f34939e, c0193e);
        this.f34940e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17832e)) {
            return false;
        }
        C17832e c17832e = (C17832e) obj;
        return AbstractC7890e.billing(ad(), c17832e.ad()) && AbstractC7890e.billing(this.f34940e, c17832e.f34940e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f34940e.hashCode() + (ad().hashCode() * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f34940e, "version_code=", arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "EmuiExtendedMetadata{", "}", null, 56);
    }
}
