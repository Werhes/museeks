package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9573e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19009e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C18464e f19010e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f19011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9573e(C18464e c18464e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19009e = i;
        this.f19010e = c18464e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19009e) {
            case 0:
                C9573e c9573e = new C9573e(this.f19010e, interfaceC5083e, 0);
                c9573e.f19011e = obj;
                return c9573e;
            case 1:
                C9573e c9573e2 = new C9573e(this.f19010e, interfaceC5083e, 1);
                c9573e2.f19011e = obj;
                return c9573e2;
            case 2:
                C9573e c9573e3 = new C9573e(this.f19010e, interfaceC5083e, 2);
                c9573e3.f19011e = obj;
                return c9573e3;
            case 3:
                C9573e c9573e4 = new C9573e(this.f19010e, interfaceC5083e, 3);
                c9573e4.f19011e = obj;
                return c9573e4;
            default:
                C9573e c9573e5 = new C9573e(this.f19010e, interfaceC5083e, 4);
                c9573e5.f19011e = obj;
                return c9573e5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19009e) {
            case 0:
                return ((C9573e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9573e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C9573e) advert((InterfaceC5083e) obj2, (C3656e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C9573e) advert((InterfaceC5083e) obj2, (C12920e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C9573e) advert((InterfaceC5083e) obj2, (C16150e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19009e) {
            case 0:
                C17510e c17510e = (C17510e) this.f19011e;
                AbstractC2003e.purchase(obj);
                ((C0576e) this.f19010e.f36192e).setValue(c17510e.ad.vip);
                return Unit.INSTANCE;
            case 1:
                C17510e c17510e2 = (C17510e) this.f19011e;
                AbstractC2003e.purchase(obj);
                ((C0576e) this.f19010e.f36192e).setValue(c17510e2.ad.vip);
                return Unit.INSTANCE;
            case 2:
                C3656e c3656e = (C3656e) this.f19011e;
                AbstractC2003e.purchase(obj);
                ((C0576e) this.f19010e.f36191e).setValue(c3656e.ad);
                return Unit.INSTANCE;
            case 3:
                C12920e c12920e = (C12920e) this.f19011e;
                AbstractC2003e.purchase(obj);
                EnumC11342e enumC11342e = c12920e.ad;
                C18464e c18464e = this.f19010e;
                ((C0576e) c18464e.f36190e).setValue(enumC11342e);
                ((C0576e) c18464e.f36194e).setValue(Boolean.valueOf(c12920e.vip));
                return Unit.INSTANCE;
            default:
                C16150e c16150e = (C16150e) this.f19011e;
                AbstractC2003e.purchase(obj);
                ((C0576e) this.f19010e.f36189e).setValue(c16150e.ad);
                return Unit.INSTANCE;
        }
    }
}
