package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1083e extends AbstractC7185e implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mopub((InterfaceC5083e) obj);
        Unit unit = Unit.INSTANCE;
        AbstractC2003e.purchase(unit);
        return unit;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new AbstractC7185e(1, interfaceC5083e);
    }
}
