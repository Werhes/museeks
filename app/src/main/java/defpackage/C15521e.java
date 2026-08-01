package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15521e extends AbstractC7654e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C12144e f30659e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C15521e.class), 2, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final List f30660e;

    public C15521e(ArrayList arrayList, C0193e c0193e) {
        super(f30659e, c0193e);
        this.f30660e = AbstractC4224e.billing("changelogs", arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15521e)) {
            return false;
        }
        C15521e c15521e = (C15521e) obj;
        return AbstractC7890e.billing(ad(), c15521e.ad()) && AbstractC7890e.billing(this.f30660e, c15521e.f30660e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f30660e.hashCode() + (ad().hashCode() * 37);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.f30660e;
        if (!list.isEmpty()) {
            arrayList.add("changelogs=" + list);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "QueryChangelogResponse{", "}", null, 56);
    }
}
