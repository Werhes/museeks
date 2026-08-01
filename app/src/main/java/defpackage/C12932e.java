package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12932e {
    public static final C12932e metrica = new C12932e(AbstractC13480e.m3582e(new ArrayList()), null);
    public final Set ad;
    public final AbstractC0014e vip;

    public C12932e(Set set, AbstractC0014e abstractC0014e) {
        this.ad = set;
        this.vip = abstractC0014e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12932e)) {
            return false;
        }
        C12932e c12932e = (C12932e) obj;
        return AbstractC7890e.billing(c12932e.ad, this.ad) && AbstractC7890e.billing(c12932e.vip, this.vip);
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() + 1517) * 41;
        AbstractC0014e abstractC0014e = this.vip;
        return hashCode + (abstractC0014e != null ? abstractC0014e.hashCode() : 0);
    }
}
