package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6147e implements InterfaceC16154e {
    public final C8580e ad;

    public C6147e(C8580e c8580e) {
        this.ad = c8580e;
    }

    @Override // defpackage.InterfaceC16154e
    public final AbstractC14073e ad(long j, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e) {
        C17985e ad = AbstractC11972e.ad();
        ad.vip();
        Unit unit = Unit.INSTANCE;
        ad.vip();
        return new C10435e(ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6147e c6147e = obj instanceof C6147e ? (C6147e) obj : null;
        return (c6147e != null ? c6147e.ad : null) == this.ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
