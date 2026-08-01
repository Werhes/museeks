package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7157e extends C11258e implements InterfaceC15437e {
    @Override // defpackage.InterfaceC15437e
    public final Object vip(InterfaceC5083e interfaceC5083e, Object obj) {
        if (this.metrica.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        Object ad = AbstractC5729e.ad(this.ad, new C2119e(this, obj, null, 3), (AbstractC10731e) interfaceC5083e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }
}
