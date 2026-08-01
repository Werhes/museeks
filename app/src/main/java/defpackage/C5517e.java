package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5517e extends AbstractC2228e implements InterfaceC2534e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C2123e f11791e = new C2123e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Exception f11792e;

    public C5517e(UUID uuid, String str, Exception exc, C17823e c17823e) {
        super("<missing root>", uuid, str, c17823e);
        this.f11792e = exc;
    }

    public static C5517e license(C17823e c17823e) {
        UUID vip = C9569e.metrica.vip();
        String ad = AbstractC2228e.ad(vip);
        AbstractC12614e abstractC12614e = (AbstractC12614e) AbstractC5076e.ad.get();
        if (!abstractC12614e.isEmpty()) {
            Iterable$EL.forEach(abstractC12614e, new C6987e(0));
        }
        return new C5517e(vip, ad, f11791e, c17823e);
    }

    @Override // defpackage.InterfaceC2534e
    public final Exception appmetrica() {
        return this.f11792e;
    }

    @Override // defpackage.InterfaceC4766e
    public final AbstractC14291e billing() {
        return C10832e.appmetrica;
    }

    @Override // defpackage.InterfaceC2534e
    /* renamed from: default */
    public final C13190e mo940default(String str, AbstractC14291e abstractC14291e, boolean z, C17823e c17823e) {
        if (z) {
            AtomicReference atomicReference = AbstractC5076e.ad;
        }
        return new C13190e(str, this, abstractC14291e, z, c17823e);
    }

    @Override // defpackage.InterfaceC4766e
    /* renamed from: eٌؖۡ */
    public final InterfaceC4766e mo1672e(String str, AbstractC14291e abstractC14291e, C17823e c17823e) {
        AtomicReference atomicReference = AbstractC5076e.ad;
        return mo940default(str, abstractC14291e, true, c17823e);
    }
}
