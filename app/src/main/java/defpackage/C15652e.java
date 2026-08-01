package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15652e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f30862e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ long f30863e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؗۖ, eؚٖؓ, eٕۖٔ] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        ?? abstractC7185e = new AbstractC7185e(2, interfaceC5083e);
        abstractC7185e.f30863e = ((Number) obj).longValue();
        return abstractC7185e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C15652e) advert((InterfaceC5083e) obj2, Long.valueOf(((Number) obj).longValue()))).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        long j = this.f30863e;
        int i = this.f30862e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f30863e = j;
            this.f30862e = 1;
            Object vip = AbstractC16481e.vip(j, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (vip == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
