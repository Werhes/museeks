package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3825e extends AbstractC18469e implements InterfaceC16902e {
    public final C12816e ad;

    public C3825e(C12816e c12816e) {
        this.ad = c12816e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3825e) {
            return AbstractC7890e.billing(this.ad, ((C3825e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC16902e
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        return null;
    }

    public final String toString() {
        return C3825e.class.getName() + ": " + this.ad;
    }
}
