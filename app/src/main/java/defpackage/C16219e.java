package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16219e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f31860e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f31861e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f31862e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f31863e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f31864e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f31865e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31866e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f31867e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f31868e;

    public /* synthetic */ C16219e(C6260e c6260e, C6260e c6260e2, C12380e c12380e, Function0 function0, C12380e c12380e2, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC3314e interfaceC3314e3) {
        this.f31862e = c6260e;
        this.f31861e = c6260e2;
        this.f31864e = c12380e;
        this.f31860e = function0;
        this.f31868e = c12380e2;
        this.f31867e = interfaceC3314e;
        this.f31863e = interfaceC3314e2;
        this.f31865e = interfaceC3314e3;
    }

    public /* synthetic */ C16219e(C13621e c13621e, C0939e c0939e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5, C2892e c2892e6, int i) {
        this.f31862e = c13621e;
        this.f31861e = c0939e;
        this.f31864e = c2892e;
        this.f31860e = c2892e2;
        this.f31868e = c2892e3;
        this.f31867e = c2892e4;
        this.f31863e = c2892e5;
        this.f31865e = c2892e6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31866e) {
            case 0:
                ((Integer) obj2).getClass();
                ((C13621e) this.f31862e).license((C0939e) this.f31861e, (C2892e) this.f31864e, (C2892e) this.f31860e, (C2892e) this.f31868e, (C2892e) this.f31867e, (C2892e) this.f31863e, (C2892e) this.f31865e, (C13770e) obj, AbstractC5190e.advert(1797553));
                return Unit.INSTANCE;
            default:
                C6260e c6260e = (C6260e) this.f31862e;
                C6260e c6260e2 = (C6260e) this.f31861e;
                C12380e c12380e = (C12380e) this.f31864e;
                Function0 function0 = (Function0) this.f31860e;
                C12380e c12380e2 = (C12380e) this.f31868e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f31867e;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f31863e;
                InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) this.f31865e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e, 6);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C4988e c4988e = new C4988e(0, 6, 119);
                    boolean purchase2 = c13770e.purchase(c6260e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (purchase2 || m3681throw == c5170e) {
                        m3681throw = new C14250e(c6260e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC13435e interfaceC13435e = (InterfaceC13435e) m3681throw;
                    boolean z = !((Boolean) interfaceC3314e.getValue()).booleanValue();
                    InterfaceC12864e license = AbstractC18366e.license(AbstractC18007e.metrica(c0115e, 1.0f), c6260e2);
                    boolean purchase3 = c13770e.purchase(c6260e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase3 || m3681throw2 == c5170e) {
                        m3681throw2 = new C9851e(c6260e, 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e purchase4 = AbstractC6022e.purchase(AbstractC12662e.license(license, (Function1) m3681throw2), null, 3);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (m3681throw3 == c5170e) {
                        m3681throw3 = new C17187e(7);
                        c13770e.m3682throws(m3681throw3);
                    }
                    AbstractC11257e.ad(c12380e, AbstractC1147e.ad(purchase4, false, (Function1) m3681throw3), z, null, null, AbstractC7255e.smaato, null, false, null, c4988e, interfaceC13435e, null, null, null, null, null, c13770e, 12582912, 1572864, 33357688);
                    C4988e c4988e2 = new C4988e(7, 7, 115);
                    boolean purchase5 = c13770e.purchase(function0);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (purchase5 || m3681throw4 == c5170e) {
                        m3681throw4 = new C4119e(0, function0);
                        c13770e.m3682throws(m3681throw4);
                    }
                    InterfaceC13435e interfaceC13435e2 = (InterfaceC13435e) m3681throw4;
                    boolean z2 = !((Boolean) interfaceC3314e.getValue()).booleanValue();
                    int i2 = !((Boolean) interfaceC3314e2.getValue()).booleanValue() ? 1 : 0;
                    InterfaceC12864e purchase6 = AbstractC6022e.purchase(AbstractC18366e.license(AbstractC18007e.metrica(c0115e, 1.0f), c6260e), null, 3);
                    Object m3681throw5 = c13770e.m3681throw();
                    if (m3681throw5 == c5170e) {
                        m3681throw5 = new C17187e(8);
                        c13770e.m3682throws(m3681throw5);
                    }
                    AbstractC8499e.ad(c12380e2, AbstractC1147e.ad(purchase6, false, (Function1) m3681throw5), z2, null, null, AbstractC7255e.loadAd, AbstractC16653e.license(1216090232, new C5776e(interfaceC3314e2, 6), c13770e), ((Boolean) interfaceC3314e3.getValue()).booleanValue() ? AbstractC7255e.amazon : null, ((Boolean) interfaceC3314e3.getValue()).booleanValue(), null, i2, (char) 0, c4988e2, interfaceC13435e2, null, null, null, c13770e, 102236160, 0, 8169144);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
