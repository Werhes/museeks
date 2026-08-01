package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14885e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29486e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f29487e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f29488e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f29489e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29490e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29491e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29492e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29493e;

    public /* synthetic */ C14885e(InterfaceC3314e interfaceC3314e, Function1 function1, Function1 function12, Function1 function13, InterfaceC3314e interfaceC3314e2, C4837e c4837e, InterfaceC3314e interfaceC3314e3) {
        this.f29488e = interfaceC3314e;
        this.f29486e = function1;
        this.f29493e = function12;
        this.f29492e = function13;
        this.f29487e = interfaceC3314e2;
        this.f29489e = c4837e;
        this.f29490e = interfaceC3314e3;
    }

    public /* synthetic */ C14885e(C5958e c5958e, C10685e c10685e, InterfaceC3314e interfaceC3314e, C12560e c12560e, C5181e c5181e, InterfaceC3314e interfaceC3314e2, InterfaceC18435e interfaceC18435e) {
        this.f29487e = c5958e;
        this.f29490e = c10685e;
        this.f29486e = interfaceC3314e;
        this.f29493e = c12560e;
        this.f29492e = c5181e;
        this.f29488e = interfaceC3314e2;
        this.f29489e = interfaceC18435e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.f29491e) {
            case 0:
                Function1 function1 = (Function1) this.f29486e;
                Function1 function12 = (Function1) this.f29493e;
                Function1 function13 = (Function1) this.f29492e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f29487e;
                C4837e c4837e = (C4837e) this.f29489e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f29490e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                int i = intValue;
                if (c13770e.m3673protected(i & 1, (i & 19) != 18)) {
                    boolean booleanValue = ((Boolean) interfaceC16132e2.getValue()).booleanValue();
                    InterfaceC16132e interfaceC16132e3 = this.f29488e;
                    if (booleanValue && ((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e3.getValue())).isEmpty()) {
                        c13770e.m3676strictfp(-1551269698);
                        InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                        long j = c13770e.f27286case;
                        int i2 = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = c13770e.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, adcel);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        c13770e.m3666import();
                        if (c13770e.f27292implements) {
                            c13770e.mopub(c7309e);
                        } else {
                            c13770e.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                        AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                        AbstractC6232e.vip(null, 0L, null, c13770e, 0, 7);
                        c13770e.Signature(true);
                        c13770e.Signature(false);
                    } else if (((Boolean) interfaceC16132e2.getValue()).booleanValue() || !((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e3.getValue())).isEmpty()) {
                        c13770e.m3676strictfp(-1550878199);
                        boolean purchase2 = c13770e.purchase(interfaceC16132e3) | c13770e.purchase(function1) | c13770e.purchase(function12) | c13770e.purchase(function13) | c13770e.purchase(interfaceC16132e) | c13770e.yandex(c4837e);
                        Object m3681throw = c13770e.m3681throw();
                        if (purchase2 || m3681throw == C2987e.ad) {
                            z = false;
                            C3025e c3025e = new C3025e(interfaceC16132e3, (Object) function1, (Object) function12, (Object) function13, interfaceC16132e, (Object) c4837e, 5);
                            c13770e.m3682throws(c3025e);
                            m3681throw = c3025e;
                        } else {
                            z = false;
                        }
                        AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e, (i << 6) & 896, 507);
                        c13770e.Signature(z);
                    } else {
                        c13770e.m3676strictfp(-1550993674);
                        c13770e.Signature(false);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f29487e;
                C10685e c10685e = (C10685e) this.f29490e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f29486e;
                C12560e c12560e = (C12560e) this.f29493e;
                C5181e c5181e = (C5181e) this.f29492e;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f29489e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InterfaceC12864e license2 = AbstractC14783e.license(AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e2), interfaceC2566e.ad(), null);
                    boolean yandex = c13770e2.yandex(c10685e) | c13770e2.purchase(interfaceC3314e) | c13770e2.yandex(c12560e) | c13770e2.purchase(c5181e);
                    InterfaceC16132e interfaceC16132e4 = this.f29488e;
                    boolean purchase3 = yandex | c13770e2.purchase(interfaceC16132e4) | c13770e2.yandex(interfaceC18435e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (purchase3 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C3025e(c10685e, c12560e, interfaceC3314e, c5181e, interfaceC16132e4, interfaceC18435e, 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license2, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e2, 0, 510);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
