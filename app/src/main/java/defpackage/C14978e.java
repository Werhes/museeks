package defpackage;

import j$.time.LocalDateTime;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14978e extends AbstractC14780e {
    public final C9710e ad;

    public C14978e(C9710e c9710e) {
        this.ad = c9710e;
    }

    @Override // defpackage.AbstractC14780e
    public final C9710e ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14780e
    public final Object license(InterfaceC5374e interfaceC5374e) {
        C1650e c1650e = (C1650e) interfaceC5374e;
        return new C11500e(LocalDateTime.of(c1650e.ad.vip().f26019e, c1650e.vip.metrica().f2537e));
    }

    @Override // defpackage.AbstractC14780e
    public final InterfaceC5374e vip() {
        return AbstractC6420e.vip;
    }
}
