package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0024e implements InterfaceC5021e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5363e f1160e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Set f1161e;

    public C0024e(Set set) {
        C6557e.f13492e.getClass();
        AbstractC1596e.appmetrica(C18139e.ad(2, true, "unknown integer literal type"), C6557e.f13491e, this, C13664e.f27089e, false);
        this.f1160e = new C5363e(new C2997e(this));
        this.f1161e = set;
    }

    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        return (List) this.f1160e.getValue();
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        return null;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        throw null;
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return C13664e.f27089e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + AbstractC13480e.m3608try(this.f1161e, ",", null, null, C7247e.f14832e, 30) + ']');
        return sb.toString();
    }
}
