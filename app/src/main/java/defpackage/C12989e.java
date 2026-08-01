package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12989e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13877e f25893e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25894e;

    public /* synthetic */ C12989e(C13877e c13877e, int i) {
        this.f25894e = 1;
        this.f25893e = c13877e;
    }

    public /* synthetic */ C12989e(C13877e c13877e, int i, byte b) {
        this.f25894e = i;
        this.f25893e = c13877e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        switch (this.f25894e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C13877e c13877e = this.f25893e;
                    if (((EnumC6916e) c13877e.f27487e.getValue()) == c13877e.m3688private()) {
                        c13770e.m3676strictfp(2055064598);
                        f = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + 96;
                        c13770e.Signature(false);
                    } else {
                        c13770e.m3676strictfp(2055066964);
                        c13770e.Signature(false);
                        f = 0;
                    }
                    InterfaceC16132e ad = AbstractC16102e.ad(f, AbstractC12696e.purchase(0.0f, 1000.0f, null, 5), null, c13770e, 48, 12);
                    boolean yandex = c13770e.yandex(c13877e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        C12829e c12829e = new C12829e(0, c13877e, C13877e.class, "commitChanges", "commitChanges()V", 0, 0, 29);
                        c13770e.m3682throws(c12829e);
                        m3681throw = c12829e;
                    }
                    Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
                    boolean purchase = c13770e.purchase(ad);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase || m3681throw2 == c5170e) {
                        m3681throw2 = new C17652e(ad, 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e isPro = AbstractC6532e.isPro(C0115e.f1276e, (Function1) m3681throw2);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC0207e.ad(function0, isPro, null, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, null, AbstractC9947e.metrica, c13770e, 12582912, 100);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f25893e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C13877e c13877e2 = this.f25893e;
                    boolean yandex2 = c13770e2.yandex(c13877e2);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw3 == C2987e.ad) {
                        C12829e c12829e2 = new C12829e(0, c13877e2, C13877e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c13770e2.m3682throws(c12829e2);
                        m3681throw3 = c12829e2;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw3), null, false, null, null, null, AbstractC9947e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
