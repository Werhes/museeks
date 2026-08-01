package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7390e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2921e f15145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15146e;

    public /* synthetic */ C7390e(C2921e c2921e, int i) {
        this.f15146e = i;
        this.f15145e = c2921e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15146e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C2921e c2921e = this.f15145e;
                    boolean yandex = c13770e.yandex(c2921e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C7736e(0, c2921e, C2921e.class, "openPopup", "openPopup()V", 0, 0, 6);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC13328e.yandex, c13770e, 1572864, 62);
                    boolean booleanValue = ((Boolean) c2921e.f6910e.getValue()).booleanValue();
                    boolean yandex2 = c13770e.yandex(c2921e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C7736e(0, c2921e, C2921e.class, "closePopup", "closePopup()V", 0, 0, 7);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC4709e.ad(booleanValue, (Function0) ((InterfaceC5261e) m3681throw2), null, 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(-1025474377, new C7390e(c2921e, 1), c13770e), c13770e, 0, 2044);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C2921e c2921e2 = this.f15145e;
                    boolean yandex3 = c13770e2.yandex(c2921e2);
                    Object m3681throw3 = c13770e2.m3681throw();
                    C5170e c5170e2 = C2987e.ad;
                    if (yandex3 || m3681throw3 == c5170e2) {
                        C7736e c7736e = new C7736e(0, c2921e2, C2921e.class, "callRedownloadAlert", "callRedownloadAlert()V", 0, 0, 8);
                        c13770e2.m3682throws(c7736e);
                        m3681throw3 = c7736e;
                    }
                    AbstractC4709e.vip(AbstractC13328e.startapp, (Function0) ((InterfaceC5261e) m3681throw3), null, AbstractC13328e.adcel, null, false, null, null, c13770e2, 3078, 500);
                    boolean yandex4 = c13770e2.yandex(c2921e2);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e2) {
                        C7736e c7736e2 = new C7736e(0, c2921e2, C2921e.class, "showLibraryRemovalAlert", "showLibraryRemovalAlert()V", 0, 0, 9);
                        c13770e2.m3682throws(c7736e2);
                        m3681throw4 = c7736e2;
                    }
                    AbstractC4709e.vip(AbstractC13328e.mopub, (Function0) ((InterfaceC5261e) m3681throw4), null, AbstractC13328e.advert, null, false, null, null, c13770e2, 3078, 500);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C2921e c2921e3 = this.f15145e;
                    boolean yandex5 = c13770e3.yandex(c2921e3);
                    Object m3681throw5 = c13770e3.m3681throw();
                    C5170e c5170e3 = C2987e.ad;
                    if (yandex5 || m3681throw5 == c5170e3) {
                        C16604e c16604e = new C16604e(0, c2921e3, C2921e.class, "playFullList", "playFullList(Z)V", 0, 3);
                        c13770e3.m3682throws(c16604e);
                        m3681throw5 = c16604e;
                    }
                    Function0 function0 = (Function0) m3681throw5;
                    boolean yandex6 = c13770e3.yandex(c2921e3);
                    Object m3681throw6 = c13770e3.m3681throw();
                    if (yandex6 || m3681throw6 == c5170e3) {
                        m3681throw6 = new C7736e(0, c2921e3, C2921e.class, "playFullListShuffled", "playFullListShuffled()V", 0, 0, 10);
                        c13770e3.m3682throws(m3681throw6);
                    }
                    AbstractC14059e.ad(0, c13770e3, null, function0, (Function0) ((InterfaceC5261e) m3681throw6));
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
