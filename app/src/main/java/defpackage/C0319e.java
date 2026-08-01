package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319e extends AbstractC15049e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2342e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f2343e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘۣٔ, eًؗۖ, eؚٕؑ] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        ?? abstractC15049e = new AbstractC15049e(2, interfaceC5083e);
        abstractC15049e.f2343e = obj;
        return abstractC15049e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0319e) advert((InterfaceC5083e) obj2, (C14718e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f2342e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C14718e c14718e = (C14718e) this.f2343e;
            this.f2342e = 1;
            Object vip = AbstractC13406e.vip(c14718e, EnumC13456e.f26726e, this);
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
