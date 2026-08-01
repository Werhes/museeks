package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7751e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15719e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C10675e f15720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7751e(C10675e c10675e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f15719e = i;
        this.f15720e = c10675e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f15719e) {
            case 0:
                return new C7751e(this.f15720e, interfaceC5083e, 0);
            default:
                return new C7751e(this.f15720e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f15719e) {
            case 0:
                return ((C7751e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7751e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f15719e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C18511e c18511e = AbstractC11062e.f21949e;
                C10675e c10675e = this.f15720e;
                if (c18511e.isVip(c10675e)) {
                    c18511e.Signature(c10675e);
                }
                c18511e.purchase(c10675e);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                AbstractC11062e.f21949e.Signature(this.f15720e);
                return Unit.INSTANCE;
        }
    }
}
