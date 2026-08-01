package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ boolean f4260e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؗۖ, eؚٖؓ, eؒۤؕ] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        ?? abstractC7185e = new AbstractC7185e(2, interfaceC5083e);
        abstractC7185e.f4260e = ((Boolean) obj).booleanValue();
        return abstractC7185e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1429e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        return Boolean.valueOf(this.f4260e);
    }
}
