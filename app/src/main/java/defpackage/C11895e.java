package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11895e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23831e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f23832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11895e(C2038e c2038e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23831e = i;
        this.f23832e = c2038e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23831e) {
            case 0:
                return new C11895e(this.f23832e, interfaceC5083e, 0);
            default:
                return new C11895e(this.f23832e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23831e) {
            case 0:
                return ((C11895e) advert((InterfaceC5083e) obj2, (C7110e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C11895e) advert((InterfaceC5083e) obj2, (C14427e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23831e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C2038e c2038e = this.f23832e;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c2038e.ad.vip()), null, 0, new C14296e(c2038e, null, 0), 3);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C2038e c2038e2 = this.f23832e;
                C2038e.purchase(c2038e2, c2038e2.adcel().vip);
                return Unit.INSTANCE;
        }
    }
}
