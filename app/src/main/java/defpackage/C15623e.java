package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٞؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15623e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14873e f30811e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30812e;

    public /* synthetic */ C15623e(C14873e c14873e, int i) {
        this.f30812e = i;
        this.f30811e = c14873e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30812e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C14873e c14873e = this.f30811e;
                    boolean yandex = c13770e.yandex(c14873e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        C7736e c7736e = new C7736e(0, c14873e, C14873e.class, "recachePlaylist", "recachePlaylist()V", 0, 0, 24);
                        c13770e.m3682throws(c7736e);
                        m3681throw = c7736e;
                    }
                    AbstractC4709e.vip(AbstractC9931e.appmetrica, (Function0) ((InterfaceC5261e) m3681throw), null, AbstractC9931e.purchase, null, false, null, null, c13770e, 3078, 500);
                    boolean yandex2 = c13770e.yandex(c14873e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        C7736e c7736e2 = new C7736e(0, c14873e, C14873e.class, "openOnlinePlaylist", "openOnlinePlaylist()V", 0, 0, 25);
                        c13770e.m3682throws(c7736e2);
                        m3681throw2 = c7736e2;
                    }
                    AbstractC4709e.vip(AbstractC9931e.billing, (Function0) ((InterfaceC5261e) m3681throw2), null, AbstractC9931e.yandex, null, false, null, null, c13770e, 3078, 500);
                    boolean yandex3 = c13770e.yandex(c14873e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        C7736e c7736e3 = new C7736e(0, c14873e, C14873e.class, "deleteCachedPlaylist", "deleteCachedPlaylist()V", 0, 0, 26);
                        c13770e.m3682throws(c7736e3);
                        m3681throw3 = c7736e3;
                    }
                    AbstractC4709e.vip(AbstractC9931e.startapp, (Function0) ((InterfaceC5261e) m3681throw3), null, AbstractC9931e.adcel, null, false, null, null, c13770e, 3078, 500);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e2.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C14873e c14873e2 = this.f30811e;
                    boolean yandex4 = c13770e2.yandex(c14873e2);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (yandex4 || m3681throw4 == C2987e.ad) {
                        m3681throw4 = new C4948e(c14873e2, 6);
                        c13770e2.m3682throws(m3681throw4);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw4, null, false, null, null, null, AbstractC9931e.vip, c13770e2, 1572864, 62);
                    c14873e2.m3883throws(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
