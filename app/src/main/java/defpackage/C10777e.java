package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10777e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21219e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14067e f21220e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10777e(C14067e c14067e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f21219e = i;
        this.f21220e = c14067e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f21219e) {
            case 0:
                return new C10777e(this.f21220e, interfaceC5083e, 0);
            default:
                return new C10777e(this.f21220e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f21219e) {
            case 0:
                return ((C10777e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C10777e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object metrica;
        switch (this.f21219e) {
            case 0:
                int i = this.f21221e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad = this.f21220e.metrica.ad();
                    this.f21221e = 1;
                    obj = AbstractC7535e.mopub(ad, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C0044e c0044e = (C0044e) obj;
                return c0044e != null ? c0044e.ad() : C9139e.f18290e;
            default:
                int i2 = this.f21221e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad2 = this.f21220e.metrica.ad();
                    this.f21221e = 1;
                    obj = AbstractC7535e.mopub(ad2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C0044e c0044e2 = (C0044e) obj;
                if (c0044e2 == null || (metrica = c0044e2.metrica(C7551e.vip)) == null) {
                    return -1L;
                }
                return metrica;
        }
    }
}
