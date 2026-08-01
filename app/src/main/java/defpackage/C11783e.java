package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11783e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f23655e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23656e;

    public /* synthetic */ C11783e(int i, Object obj) {
        this.f23656e = i;
        this.f23655e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23656e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica, 0.0f, 0.0f, 16, 0.0f, 11);
                    C10156e c10156e = C5438e.f11699e;
                    C13440e c13440e = (C13440e) this.f23655e;
                    InterfaceC2747e license = AbstractC17074e.license(c10156e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
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
                    AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_delete_outline_android_28, 0, c13770e);
                    long j2 = ((C0896e) c13770e.adcel(AbstractC3577e.ad)).vip;
                    boolean yandex = c13770e.yandex(c13440e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C17877e(28, c13440e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC5647e.vip(metrica, null, AbstractC12546e.yandex(C0115e.f1276e, (Function1) m3681throw), j2, c13770e, 56, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                long j3 = ((C3618e) obj).ad;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.appmetrica(j3) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AbstractC5132e.vip(((C16118e) this.f23655e).metrica, j3, c13770e2, (intValue2 << 3) & 112);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C13964e billing = AbstractC16497e.billing(2);
                    C1050e c1050e = (C1050e) this.f23655e;
                    C8587e ad = AbstractC6451e.ad(billing, C5438e.f11685e, c13770e3, 6);
                    long j4 = c13770e3.f27286case;
                    int i2 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    Function0 function0 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(function0);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                    boolean purchase3 = c13770e3.purchase(c1050e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (purchase3 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = String.valueOf((int) c1050e.f3537e);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC14489e.vip((String) m3681throw2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_hz), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Number) obj3).intValue();
                AbstractC15876e abstractC15876e = (AbstractC15876e) this.f23655e;
                if ((intValue4 & 6) == 0) {
                    intValue4 |= (intValue4 & 8) == 0 ? c13770e4.purchase(catalog2Banner) : c13770e4.yandex(catalog2Banner) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean yandex2 = c13770e4.yandex(abstractC15876e);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C16847e(abstractC15876e, 0);
                        c13770e4.m3682throws(m3681throw3);
                    }
                    AbstractC8116e.ad(catalog2Banner, (Function0) m3681throw3, c13770e4, (intValue4 & 14) | 8);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AudioTrack audioTrack = (AudioTrack) this.f23655e;
                if ((intValue5 & 6) == 0) {
                    intValue5 |= c13770e5.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 19) != 18)) {
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-1097432980, new C0656e(audioTrack, 0), c13770e5), AbstractC16653e.license(1274664203, new C0656e(audioTrack, 1), c13770e5), c13770e5, (intValue5 & 14) | 432);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            default:
                long j5 = ((C3618e) obj).ad;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Number) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    C17975e.f35235e.yandex((Drawable) this.f23655e, c13770e6, 48);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
