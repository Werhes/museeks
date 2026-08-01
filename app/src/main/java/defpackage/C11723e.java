package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11723e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23563e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6102e f23564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11723e(AbstractC6102e abstractC6102e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23563e = i;
        this.f23564e = abstractC6102e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23563e) {
            case 0:
                return new C11723e(this.f23564e, interfaceC5083e, 0);
            default:
                return new C11723e(this.f23564e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f23563e) {
            case 0:
                return ((C11723e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11723e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؘؓۙ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23563e) {
            case 0:
                AbstractC2003e.purchase(obj);
                AbstractC6102e abstractC6102e = this.f23564e;
                if (abstractC6102e.f12794e == null) {
                    ?? obj2 = new Object();
                    C15274e c15274e = abstractC6102e.f12792e;
                    if (c15274e != null) {
                        AbstractC5336e.purchase(abstractC6102e.m3623e(), null, 0, new C13301e(c15274e, obj2, null, 1), 3);
                    }
                    abstractC6102e.f12794e = obj2;
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                AbstractC6102e abstractC6102e2 = this.f23564e;
                C1639e c1639e = abstractC6102e2.f12794e;
                if (c1639e != null) {
                    C5754e c5754e = new C5754e(c1639e);
                    C15274e c15274e2 = abstractC6102e2.f12792e;
                    InterfaceC5083e interfaceC5083e = null;
                    if (c15274e2 != null) {
                        AbstractC5336e.purchase(abstractC6102e2.m3623e(), null, 0, new C13301e(c15274e2, c5754e, interfaceC5083e, 2), 3);
                    }
                    abstractC6102e2.f12794e = null;
                }
                return Unit.INSTANCE;
        }
    }
}
