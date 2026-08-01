package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12433e implements InterfaceC7351e {
    public final C15965e ad;
    public final Set vip;

    public C12433e(C15965e c15965e) {
        this.ad = c15965e;
        C1169e license = AbstractC6874e.license();
        AbstractC15203e.vip(license, c15965e);
        C1169e metrica = AbstractC6874e.metrica(license);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = metrica.listIterator(0);
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                break;
            }
            C14171e license2 = ((InterfaceC4024e) c11045e.next()).metrica().license();
            if (license2 != null) {
                arrayList.add(license2);
            }
        }
        Set m3582e = AbstractC13480e.m3582e(arrayList);
        this.vip = m3582e;
        if (m3582e.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC14232e
    public final C12469e ad() {
        this.ad.ad();
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12433e) {
            return this.ad.equals(((C12433e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return (this.ad.ad.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.ad + ')';
    }

    @Override // defpackage.InterfaceC14232e
    public final C6195e vip() {
        return AbstractC16155e.vip(AbstractC6874e.startapp(new C6195e(Collections.singletonList(new C2759e(new C3450e(6, this), "sign for " + this.vip)), C13664e.f27089e), this.ad.ad.vip()));
    }
}
