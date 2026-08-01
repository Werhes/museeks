package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8220e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16706e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13033e f16707e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f16708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8220e(InterfaceC13033e interfaceC13033e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16706e = i;
        this.f16707e = interfaceC13033e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16706e) {
            case 0:
                C8220e c8220e = new C8220e(this.f16707e, interfaceC5083e, 0);
                c8220e.f16708e = obj;
                return c8220e;
            default:
                C8220e c8220e2 = new C8220e(this.f16707e, interfaceC5083e, 1);
                c8220e2.f16708e = obj;
                return c8220e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16706e) {
            case 0:
                return ((C8220e) advert(interfaceC5083e, obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8220e) advert(interfaceC5083e, obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f16706e) {
            case 0:
                Object obj2 = this.f16708e;
                AbstractC2003e.purchase(obj);
                return Boolean.valueOf(obj2 != null || this.f16707e.yandex());
            default:
                Object obj3 = this.f16708e;
                AbstractC2003e.purchase(obj);
                return Boolean.valueOf(obj3 != null || this.f16707e.yandex());
        }
    }
}
