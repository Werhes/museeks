package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4840e extends AbstractC16858e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f10309e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f10310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4840e(int i, Object obj) {
        super(3);
        this.f10310e = i;
        this.f10309e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10310e) {
            case 0:
                InterfaceC11905e interfaceC11905e = (InterfaceC11905e) obj;
                C13770e c13770e = (C13770e) obj2;
                ((Number) obj3).intValue();
                Object m3681throw = c13770e.m3681throw();
                C5170e c5170e = C2987e.ad;
                if (m3681throw == c5170e) {
                    m3681throw = AbstractC17680e.startapp(c13770e);
                    c13770e.m3682throws(m3681throw);
                }
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
                Object m3681throw2 = c13770e.m3681throw();
                if (m3681throw2 == c5170e) {
                    m3681throw2 = new C13610e(interfaceC11905e, interfaceC18435e);
                    c13770e.m3682throws(m3681throw2);
                }
                C13610e c13610e = (C13610e) m3681throw2;
                ((C2892e) this.f10309e).invoke(c13610e, new C0927e(c13610e), c13770e, 6);
                return Unit.INSTANCE;
            case 1:
                AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(((C5602e) obj3).ad);
                return ((InterfaceC13158e) obj).ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C5337e(admob, (C2714e) this.f10309e, 6));
            default:
                C13770e c13770e2 = ((C0512e) obj).ad;
                C13770e c13770e3 = (C13770e) obj2;
                ((Number) obj3).intValue();
                int appmetrica = AbstractC5546e.appmetrica(c13770e3);
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f10309e;
                if (interfaceC12864e != C0115e.f1276e) {
                    interfaceC12864e = AbstractC5679e.purchase(c13770e3, AbstractC5087e.isVip(new C1741e(c13770e3.advert()), interfaceC12864e));
                }
                c13770e2.m3672private(509942095);
                InterfaceC5685e.mopub.getClass();
                AbstractC2270e.yandex(c13770e2, interfaceC12864e, C2721e.license);
                AbstractC2270e.yandex(c13770e2, Integer.valueOf(appmetrica), C2721e.adcel);
                c13770e2.Signature(false);
                return Unit.INSTANCE;
        }
    }
}
