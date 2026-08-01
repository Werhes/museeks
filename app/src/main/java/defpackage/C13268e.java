package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13268e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C16875e f26318e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f26319e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26320e;

    public /* synthetic */ C13268e(C13621e c13621e, C16875e c16875e, int i) {
        this.f26320e = i;
        this.f26319e = c13621e;
        this.f26318e = c16875e;
    }

    public /* synthetic */ C13268e(C16875e c16875e, C13621e c13621e, int i) {
        this.f26320e = i;
        this.f26318e = c16875e;
        this.f26319e = c13621e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26320e) {
            case 0:
                C13621e c13621e = this.f26319e;
                C2038e c2038e = c13621e.ad;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16875e c16875e = this.f26318e;
                    int i = c16875e.amazon;
                    int i2 = c16875e.loadAd;
                    C12742e c12742e = c2038e.smaato;
                    boolean yandex = c13770e.yandex(c2038e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        C0638e c0638e = new C0638e(1, c2038e, C2038e.class, "setVolume", "setVolume(I)V", 0, 0, 10);
                        c13770e.m3682throws(c0638e);
                        m3681throw = c0638e;
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw;
                    boolean yandex2 = c13770e.yandex(c2038e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        Cvolatile cvolatile = new Cvolatile(0, c2038e, C2038e.class, "volumeDown", "volumeDown()V", 0, 0, 12);
                        c13770e.m3682throws(cvolatile);
                        m3681throw2 = cvolatile;
                    }
                    InterfaceC5261e interfaceC5261e2 = (InterfaceC5261e) m3681throw2;
                    boolean yandex3 = c13770e.yandex(c2038e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        Cvolatile cvolatile2 = new Cvolatile(0, c2038e, C2038e.class, "volumeUp", "volumeUp()V", 0, 0, 13);
                        c13770e.m3682throws(cvolatile2);
                        m3681throw3 = cvolatile2;
                    }
                    InterfaceC5261e interfaceC5261e3 = (InterfaceC5261e) m3681throw3;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(C0115e.f1276e, 0.0f, 0.0f, 0.0f, 16, 7);
                    boolean yandex4 = c13770e.yandex(c13621e);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        m3681throw4 = new C3306e(c13621e, 1);
                        c13770e.m3682throws(m3681throw4);
                    }
                    Function1 function1 = (Function1) m3681throw4;
                    boolean yandex5 = c13770e.yandex(c13621e);
                    Object m3681throw5 = c13770e.m3681throw();
                    if (yandex5 || m3681throw5 == c5170e) {
                        m3681throw5 = new C17762e(c13621e, 3);
                        c13770e.m3682throws(m3681throw5);
                    }
                    AbstractC13062e.ad(i, i2, c12742e, function1, (Function0) m3681throw5, (Function0) interfaceC5261e2, (Function1) interfaceC5261e, (Function0) interfaceC5261e3, loadAd, c13770e, 100663296);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C13621e c13621e2 = this.f26319e;
                    EnumC10483e amazon = c13621e2.amazon();
                    C16875e c16875e2 = this.f26318e;
                    c13621e2.mopub(amazon, c16875e2.adcel, c16875e2.mopub != null, c16875e2.advert, c13621e2.ad.mopub, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C13621e c13621e3 = this.f26319e;
                    boolean yandex6 = c13770e3.yandex(c13621e3);
                    Object m3681throw6 = c13770e3.m3681throw();
                    if (yandex6 || m3681throw6 == C2987e.ad) {
                        m3681throw6 = new C17762e(c13621e3, 0);
                        c13770e3.m3682throws(m3681throw6);
                    }
                    AbstractC15390e.vip((Function0) m3681throw6, AbstractC16653e.license(1544765338, new C11213e(0, this.f26318e), c13770e3), AbstractC16653e.license(1601578779, new C12612e(c13621e3, 0), c13770e3), AbstractC12220e.smaato(C14486e.ad.ad(C0115e.f1276e, C5438e.f11669e), 16, 0.0f, 2), c13770e3, 432);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (this.f26318e.startapp) {
                        c13770e4.m3676strictfp(-1262186476);
                    } else {
                        c13770e4.m3676strictfp(-1245150922);
                        C13621e c13621e4 = this.f26319e;
                        c13621e4.purchase(c13621e4.ad.startapp(), c13770e4, 0);
                    }
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
