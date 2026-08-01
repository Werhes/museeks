package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5656e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C0939e f12038e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f12039e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12040e = 0;

    public /* synthetic */ C5656e(C0939e c0939e, C13621e c13621e) {
        this.f12038e = c0939e;
        this.f12039e = c13621e;
    }

    public /* synthetic */ C5656e(C13621e c13621e, C0939e c0939e) {
        this.f12039e = c13621e;
        this.f12038e = c0939e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12040e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C0939e c0939e = this.f12038e;
                    String str = c0939e.vip;
                    String str2 = c0939e.metrica;
                    boolean z = c0939e.appmetrica;
                    C2038e c2038e = this.f12039e.ad;
                    boolean yandex = c13770e.yandex(c2038e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Cvolatile cvolatile = new Cvolatile(0, c2038e, C2038e.class, "onTrackTitleTapped", "onTrackTitleTapped()V", 0, 0, 8);
                        c13770e.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC9835e.billing(str, str2, z, (Function0) ((InterfaceC5261e) m3681throw), c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C2038e c2038e2 = this.f12039e.ad;
                    boolean yandex2 = c13770e2.yandex(c2038e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex2 || m3681throw2 == c5170e) {
                        Cvolatile cvolatile2 = new Cvolatile(0, c2038e2, C2038e.class, "onTrackArtistTapped", "onTrackArtistTapped()V", 0, 0, 9);
                        c13770e2.m3682throws(cvolatile2);
                        m3681throw2 = cvolatile2;
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw2;
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (m3681throw3 == c5170e) {
                        m3681throw3 = AbstractC17861e.adcel(c13770e2);
                    }
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e metrica = AbstractC9546e.metrica(c0115e, (C15274e) m3681throw3, null, false, null, (Function0) interfaceC5261e, 28);
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e2.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica);
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
                    AbstractC14489e.vip(this.f12038e.license, AbstractC11261e.appmetrica(c0115e), ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).vip, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.adcel, c13770e2, 48, 24960, 110584);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
