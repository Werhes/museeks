package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5468e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11737e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16625e f11738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f11739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5468e(AbstractC16625e abstractC16625e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f11737e = i;
        this.f11738e = abstractC16625e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f11737e) {
            case 0:
                C5468e c5468e = new C5468e(this.f11738e, interfaceC5083e, 0);
                c5468e.f11739e = obj;
                return c5468e;
            case 1:
                C5468e c5468e2 = new C5468e(this.f11738e, interfaceC5083e, 1);
                c5468e2.f11739e = obj;
                return c5468e2;
            case 2:
                C5468e c5468e3 = new C5468e(this.f11738e, interfaceC5083e, 2);
                c5468e3.f11739e = obj;
                return c5468e3;
            default:
                C5468e c5468e4 = new C5468e(this.f11738e, interfaceC5083e, 3);
                c5468e4.f11739e = obj;
                return c5468e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11737e) {
            case 0:
                return ((C5468e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C5468e) advert((InterfaceC5083e) obj2, (C3656e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C5468e) advert((InterfaceC5083e) obj2, (C12920e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C5468e) advert((InterfaceC5083e) obj2, (C16150e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f11737e) {
            case 0:
                C17510e c17510e = (C17510e) this.f11739e;
                AbstractC2003e.purchase(obj);
                this.f11738e.f32590e.setValue(c17510e.ad.vip);
                return Unit.INSTANCE;
            case 1:
                C3656e c3656e = (C3656e) this.f11739e;
                AbstractC2003e.purchase(obj);
                this.f11738e.f32589e.setValue(c3656e.ad);
                return Unit.INSTANCE;
            case 2:
                C12920e c12920e = (C12920e) this.f11739e;
                AbstractC2003e.purchase(obj);
                EnumC11342e enumC11342e = c12920e.ad;
                AbstractC16625e abstractC16625e = this.f11738e;
                abstractC16625e.f32588e.setValue(enumC11342e);
                abstractC16625e.f32587e.setValue(Boolean.valueOf(c12920e.vip));
                return Unit.INSTANCE;
            default:
                C16150e c16150e = (C16150e) this.f11739e;
                AbstractC2003e.purchase(obj);
                this.f11738e.f32591e.setValue(c16150e.ad);
                return Unit.INSTANCE;
        }
    }
}
