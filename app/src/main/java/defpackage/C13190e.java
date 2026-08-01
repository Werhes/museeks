package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13190e extends AbstractC10392e implements InterfaceC2534e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f26194e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Exception f26195e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13190e(String str, InterfaceC2534e interfaceC2534e, AbstractC14291e abstractC14291e, boolean z, C17823e c17823e) {
        super("<missing root>:".concat(str), (AbstractC2228e) interfaceC2534e, AbstractC14291e.ad(abstractC14291e, C10832e.purchase), c17823e);
        this.f26195e = interfaceC2534e.appmetrica();
        this.f26194e = z;
    }

    public C13190e(UUID uuid, String str, String str2, AbstractC14291e abstractC14291e, Exception exc, C17823e c17823e) {
        super("<missing root>:".concat(str2), uuid, str, AbstractC14291e.ad(abstractC14291e, C10832e.purchase), c17823e);
        this.f26195e = exc;
        this.f26194e = false;
    }

    @Override // defpackage.InterfaceC2534e
    public final Exception appmetrica() {
        return this.f26195e;
    }

    @Override // defpackage.InterfaceC2534e
    /* renamed from: default */
    public final C13190e mo940default(String str, AbstractC14291e abstractC14291e, boolean z, C17823e c17823e) {
        boolean z2 = this.f26194e;
        if (z && !z2) {
            AtomicReference atomicReference = AbstractC5076e.ad;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new C13190e(str, this, abstractC14291e, z3, c17823e);
    }

    @Override // defpackage.InterfaceC4766e
    /* renamed from: eٌؖۡ */
    public final InterfaceC4766e mo1672e(String str, AbstractC14291e abstractC14291e, C17823e c17823e) {
        AtomicReference atomicReference = AbstractC5076e.ad;
        return mo940default(str, abstractC14291e, true, c17823e);
    }

    @Override // defpackage.InterfaceC4766e
    public final AbstractC14291e mopub() {
        return C10832e.appmetrica;
    }
}
