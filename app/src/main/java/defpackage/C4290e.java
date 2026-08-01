package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4290e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f9379e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f9380e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9381e;

    public C4290e(C9669e c9669e, C10876e c10876e) {
        this.f9381e = 16;
        C8363e c8363e = EnumC4169e.f9188e;
        this.f9380e = c9669e;
        this.f9379e = c10876e;
    }

    public /* synthetic */ C4290e(Object obj, Object obj2, int i) {
        this.f9381e = i;
        this.f9380e = obj;
        this.f9379e = obj2;
    }

    private final Object Signature(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C4944e c4944e = (C4944e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C12560e c12560e = (C12560e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(720707266);
            boolean yandex = c13770e.yandex(c12560e) | c13770e.yandex(c4944e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c12560e, c4944e, 20);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC14942e.appmetrica(c12560e, AbstractC9546e.license(C0115e.f1276e, false, null, (Function0) m3681throw, 15), c13770e, 0, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object ad(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C2892e c2892e;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C11683e c11683e = (C11683e) this.f9379e;
        int i2 = 4;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        int i3 = 0;
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C3662e c3662e = (C3662e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(1431873700);
            if (c3662e.ad != -1) {
                c13770e.m3676strictfp(1432004426);
                C2892e license = AbstractC16653e.license(-2006363104, new C12164e(c3662e, i3), c13770e);
                c13770e.Signature(false);
                c2892e = license;
            } else {
                c13770e.m3676strictfp(1432375681);
                c13770e.Signature(false);
                c2892e = null;
            }
            float f = AbstractC11992e.ad;
            C8872e ad = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean purchase = c13770e.purchase(c3662e) | c13770e.yandex(c11683e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c3662e, c11683e, i2);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(127911358, new C12164e(c3662e, 1), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, c2892e, null, ad, 0.0f, 0.0f, c13770e, 6, 428);
            if (intValue != AbstractC6874e.billing(c11683e.f23495e)) {
                c13770e.m3676strictfp(1432757819);
                AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
            } else {
                c13770e.m3676strictfp(1428891654);
            }
            c13770e.Signature(false);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C5421e c5421e = (C5421e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            AudioTrack audioTrack = (AudioTrack) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-946162302);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
            boolean yandex = c13770e.yandex(c5421e) | c13770e.purchase(audioTrack);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c5421e, audioTrack, 16);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17324e.metrica(audioTrack, AbstractC12220e.mopub(AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), 16), c13770e, 0);
            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
            c13770e.Signature(true);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object admob(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Object obj5 = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj6 = (C4944e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(obj5) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C13669e c13669e = (C13669e) ((C8794e) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-597597822);
            float f = 16;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 0.0f, f, 1);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e, AbstractC1596e.billing(c13669e.ad));
            AbstractC4455e abstractC4455e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(c0115e, f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.mopub, c13770e, 48, 0, 131064);
            C13964e billing = AbstractC16497e.billing(8);
            C16005e metrica = AbstractC12220e.metrica(f, 0.0f, 2);
            boolean yandex = c13770e.yandex(c13669e) | c13770e.yandex(obj6);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17874e(c13669e, obj6, 23);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.vip(null, null, metrica, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24960, 491);
            c13770e.Signature(true);
            if (intValue != AbstractC2890e.ad.vip - 1) {
                c13770e.m3676strictfp(-596395612);
                AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                z = false;
            } else {
                z = false;
                c13770e.m3676strictfp(-602836761);
            }
            c13770e.Signature(z);
            c13770e.Signature(z);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C5769e c5769e = (C5769e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C13126e c13126e = (C13126e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(962503841);
            boolean yandex = c13770e.yandex(c5769e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C14772e(1, c5769e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC18271e.ad(c13126e, (Function1) m3681throw, c13770e, 8);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object amazon(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C14141e c14141e = (C14141e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C5181e c5181e = (C5181e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-1376733664);
            boolean purchase = c13770e.purchase(c5181e) | c13770e.yandex(c14141e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c5181e, c14141e, 19);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC14942e.ad(c5181e, AbstractC9546e.license(C0115e.f1276e, false, null, (Function0) m3681throw, 15), c13770e, 0, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C8510e c8510e = (C8510e) this.f9380e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            EnumC2646e enumC2646e = (EnumC2646e) EnumC2646e.f6520e.get(intValue);
            c13770e.m3676strictfp(1383918916);
            boolean z = ((EnumC2646e) ((InterfaceC16132e) this.f9379e).getValue()) == enumC2646e;
            boolean yandex = c13770e.yandex(c8510e) | c13770e.license(enumC2646e.ordinal());
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c8510e, enumC2646e, 14);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC2937e.license(z, (Function0) m3681throw, AbstractC16653e.license(-1710213124, new C15221e(7, enumC2646e), c13770e), null, false, null, null, null, null, null, null, null, c13770e, 384, 16376);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C9669e c9669e = (C9669e) this.f9380e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            EnumC4169e enumC4169e = (EnumC4169e) EnumC4169e.f9187e.get(intValue);
            c13770e.m3676strictfp(845193454);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c9669e) | c13770e.license(enumC4169e.ordinal());
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c9669e, enumC4169e, 10);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15);
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC16653e.license(198571767, new C15221e(5, enumC4169e), c13770e), license, null, null, null, AbstractC16653e.license(549404946, new C2077e((C10876e) this.f9379e, enumC4169e, 12), c13770e), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, 196614, 412);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object loadAd(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Object obj5 = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj6 = (C14141e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(obj5) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C14513e c14513e = (C14513e) ((C8794e) this.f9380e).get(intValue);
            c13770e.m3676strictfp(1801537077);
            float f = 16;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 0.0f, f, 1);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e, AbstractC1596e.billing(c14513e.ad));
            AbstractC4455e abstractC4455e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(c0115e, f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.mopub, c13770e, 48, 0, 131064);
            C13964e billing = AbstractC16497e.billing(8);
            C16005e metrica = AbstractC12220e.metrica(f, 0.0f, 2);
            boolean yandex = c13770e.yandex(c14513e) | c13770e.yandex(obj6);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17874e(c14513e, obj6, 22);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.vip(null, null, metrica, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24960, 491);
            c13770e.Signature(true);
            if (intValue != AbstractC2890e.vip.vip - 1) {
                c13770e.m3676strictfp(1802746975);
                AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                z = false;
            } else {
                z = false;
                c13770e.m3676strictfp(1796289954);
            }
            c13770e.Signature(z);
            c13770e.Signature(z);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C9261e c9261e = (C9261e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            VKProfile vKProfile = (VKProfile) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-1152990005);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c9261e) | c13770e.yandex(vKProfile);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c9261e, vKProfile, 17);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(1142998174, new C3837e(vKProfile, 0), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC16653e.license(1113476890, new C3837e(vKProfile, 1), c13770e), null, null, 0.0f, 0.0f, c13770e, 24582, 492);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        int i2 = 0;
        int i3 = 1;
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            EnumC18308e enumC18308e = (EnumC18308e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(1433260333);
            float f = AbstractC11992e.ad;
            long j = C3618e.startapp;
            C15492e c15492e = AbstractC3577e.ad;
            C8872e ad = AbstractC11992e.ad(j, ((C0896e) c13770e.adcel(c15492e)).ad, ((C0896e) c13770e.adcel(c15492e)).vip, 0L, c13770e, 504);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean purchase = c13770e.purchase(function1) | c13770e.license(enumC18308e.ordinal());
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(function1, enumC18308e, 11);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(-829118655, new C7994e(enumC18308e, i2), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC16653e.license(400555197, new C7994e(enumC18308e, i3), c13770e), null, ad, 0.0f, 0.0f, c13770e, 24582, 428);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C3366e c3366e = (C3366e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C14197e c14197e = (C14197e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c3366e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C0004e c0004e = (C0004e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(851738443);
            C13540e purchase = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
            long j = 1;
            C13540e purchase2 = AbstractC12696e.purchase(0.0f, 400.0f, new C11490e((j & 4294967295L) | (j << 32)), 1);
            C13540e purchase3 = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
            c3366e.getClass();
            InterfaceC12864e vip = AbstractC12447e.vip(new C4801e(purchase, purchase2, purchase3), AbstractC6549e.ad(8));
            boolean yandex = c13770e.yandex(c14197e) | c13770e.yandex(c0004e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c14197e, c0004e, 18);
                c13770e.m3682throws(m3681throw);
            }
            c14197e.m3765strictfp(c0004e, AbstractC9546e.license(vip, false, null, (Function0) m3681throw, 15), c13770e, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C8510e c8510e = (C8510e) this.f9379e;
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C11235e c11235e = (C11235e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(1558950523);
            String str = c11235e.metrica;
            String str2 = c11235e.license;
            C2892e license = AbstractC16653e.license(1344961686, new C2077e(c8510e, c11235e, 14), c13770e);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c8510e) | c13770e.purchase(c11235e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1021e(c8510e, c11235e, 15);
                c13770e.m3682throws(m3681throw);
            }
            c8510e.m2435private(str, str2, license, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), c13770e, 384);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object subscription(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C6563e c6563e = (C6563e) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-1941366950);
            float f = 8;
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i2 = (int) ((j >>> 32) ^ j);
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            String str = c6563e.vip;
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(str, null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.amazon, c13770e, 0, 0, 131066);
            AbstractC18268e.vip(AbstractC18007e.metrica(c0115e, 1.0f), AbstractC16497e.billing(f), null, null, 0, 0, AbstractC16653e.license(-1094898057, new C1616e(c6563e, (C12340e) this.f9379e, 3), c13770e), c13770e, 1572918, 60);
            c13770e.Signature(true);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            CachedTrack cachedTrack = (CachedTrack) ((List) this.f9380e).get(intValue);
            c13770e.m3676strictfp(-199781119);
            ((C2921e) this.f9379e).m1219synchronized(cachedTrack, c13770e, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C6571e c6571e;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f9381e;
        int i17 = 8;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        Object obj5 = this.f9380e;
        Object obj6 = this.f9379e;
        boolean z = true;
        z = true;
        int i18 = 0;
        switch (i16) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                C4834e c4834e = (C4834e) obj6;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (c13770e.purchase(c18055e) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    EnumC4248e enumC4248e = (EnumC4248e) ((List) obj5).get(intValue);
                    c13770e.m3676strictfp(1415674738);
                    int ordinal = enumC4248e.ordinal();
                    if (ordinal == 0) {
                        c6571e = new C6571e(Integer.valueOf(R.drawable.ic_message_outline_28), Integer.valueOf(R.string.share_to_vk_chat));
                    } else if (ordinal == 1) {
                        c6571e = new C6571e(Integer.valueOf(R.drawable.ic_copy_outline_28), Integer.valueOf(R.string.share_copy_link));
                    } else if (ordinal == 2) {
                        c6571e = new C6571e(Integer.valueOf(R.drawable.ic_share_outline_28), Integer.valueOf(R.string.share_share_link));
                    } else {
                        if (ordinal != 3) {
                            throw new C14803e(10);
                        }
                        c6571e = new C6571e(Integer.valueOf(R.drawable.ic_qr_code_outline_28), Integer.valueOf(R.string.scan_qr_share));
                    }
                    int intValue3 = ((Number) c6571e.f13544e).intValue();
                    int intValue4 = ((Number) c6571e.f13543e).intValue();
                    float f = AbstractC11992e.ad;
                    C8872e ad = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510);
                    C7913e c7913e = AbstractC18007e.metrica;
                    boolean yandex = c13770e.yandex(c4834e) | c13770e.license(enumC4248e.ordinal());
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C1021e(c4834e, enumC4248e, 21);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-51402428, new C17739e(intValue4), c13770e), AbstractC9546e.license(c7913e, false, null, (Function0) m3681throw, 15), null, null, AbstractC16653e.license(-2121473600, new C17597e(intValue3, intValue4), c13770e), null, ad, 0.0f, 0.0f, c13770e, 24582, 428);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18055e c18055e2 = (C18055e) obj;
                int intValue5 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i2 = intValue6 | (c13770e2.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i2 |= c13770e2.license(intValue5) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) ((List) obj5).get(intValue5);
                    c13770e2.m3676strictfp(-1028775403);
                    ((C15435e) obj6).m3994instanceof(cachedPlaylist, c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C18055e c18055e3 = (C18055e) obj;
                int intValue7 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i3 = intValue8 | (c13770e3.purchase(c18055e3) ? 4 : 2);
                } else {
                    i3 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i3 |= c13770e3.license(intValue7) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    CachedTrack cachedTrack = (CachedTrack) ((List) obj5).get(intValue7);
                    c13770e3.m3676strictfp(-1471875157);
                    ((C5250e) obj6).m1840import(cachedTrack, c13770e3, 0);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e4 = (C18055e) obj;
                int intValue9 = ((Number) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue10 = ((Number) obj4).intValue();
                C5016e c5016e = (C5016e) obj6;
                if ((intValue10 & 6) == 0) {
                    i4 = intValue10 | (c13770e4.purchase(c18055e4) ? 4 : 2);
                } else {
                    i4 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i4 |= c13770e4.license(intValue9) ? 32 : 16;
                }
                if (c13770e4.m3673protected(i4 & 1, (i4 & 147) != 146)) {
                    CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) ((List) obj5).get(intValue9);
                    c13770e4.m3676strictfp(1282418285);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex2 = c13770e4.yandex(customCatalogBlockItem) | c13770e4.yandex(c5016e);
                    Object m3681throw2 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C12056e(customCatalogBlockItem, c5016e, 5);
                        c13770e4.m3682throws(m3681throw2);
                    }
                    c5016e.m1717strictfp(customCatalogBlockItem, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), c13770e4, 8);
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C18055e c18055e5 = (C18055e) obj;
                int intValue11 = ((Number) obj2).intValue();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue12 = ((Number) obj4).intValue();
                C1963e c1963e = (C1963e) obj6;
                if ((intValue12 & 6) == 0) {
                    i5 = intValue12 | (c13770e5.purchase(c18055e5) ? 4 : 2);
                } else {
                    i5 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i5 |= c13770e5.license(intValue11) ? 32 : 16;
                }
                if (c13770e5.m3673protected(i5 & 1, (i5 & 147) != 146)) {
                    C6571e c6571e2 = (C6571e) ((List) obj5).get(intValue11);
                    c13770e5.m3676strictfp(1581946854);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e5, 0);
                    long j = c13770e5.f27286case;
                    int i19 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e5.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i19), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase, C2721e.license);
                    float f2 = AbstractC11992e.ad;
                    C8872e ad3 = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e5, 510);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex3 = c13770e5.yandex(c1963e) | c13770e5.yandex(c6571e2);
                    Object m3681throw3 = c13770e5.m3681throw();
                    Object obj7 = m3681throw3;
                    if (yandex3 || m3681throw3 == c5170e) {
                        C12056e c12056e = new C12056e(c1963e, c6571e2, 6);
                        c13770e5.m3682throws(c12056e);
                        obj7 = c12056e;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-959139023, new C6612e(i18, c6571e2), c13770e5), AbstractC9546e.license(metrica2, false, null, (Function0) obj7, 15), null, null, AbstractC7844e.mopub, null, ad3, 0.0f, 0.0f, c13770e5, 24582, 428);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e5, 0, 7);
                    c13770e5.Signature(true);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C18055e c18055e6 = (C18055e) obj;
                int intValue13 = ((Number) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                int intValue14 = ((Number) obj4).intValue();
                C13877e c13877e = (C13877e) obj6;
                if ((intValue14 & 6) == 0) {
                    i6 = intValue14 | (c13770e6.purchase(c18055e6) ? 4 : 2);
                } else {
                    i6 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i6 |= c13770e6.license(intValue13) ? 32 : 16;
                }
                if (c13770e6.m3673protected(i6 & 1, (i6 & 147) != 146)) {
                    EnumC6916e enumC6916e = (EnumC6916e) ((List) obj5).get(intValue13);
                    c13770e6.m3676strictfp(1099096479);
                    if (!enumC6916e.f14178e && !((Boolean) c13877e.f27490e.getValue()).booleanValue()) {
                        z = false;
                    }
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex4 = c13770e6.yandex(c13877e) | c13770e6.license(enumC6916e.ordinal());
                    Object m3681throw4 = c13770e6.m3681throw();
                    Object obj8 = m3681throw4;
                    if (yandex4 || m3681throw4 == c5170e) {
                        C17685e c17685e = new C17685e(c13877e, enumC6916e, 0);
                        c13770e6.m3682throws(c17685e);
                        obj8 = c17685e;
                    }
                    InterfaceC12864e license = AbstractC9546e.license(metrica3, false, null, (Function0) obj8, 15);
                    float f3 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(-712426266, new C15221e(r14, enumC6916e), c13770e6), license, null, null, AbstractC16653e.license(-628087830, new C17361e(z, c13877e, enumC6916e), c13770e6), AbstractC16653e.license(466738603, new C2077e(c13877e, enumC6916e, i18), c13770e6), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e6, 510), 0.0f, 0.0f, c13770e6, 221190, 396);
                    if (intValue13 != AbstractC6874e.billing(c13877e.f27488e)) {
                        c13770e6.m3676strictfp(1101141486);
                        AbstractC8141e.vip(null, 0.0f, ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).ad.ads, c13770e6, 0, 3);
                    } else {
                        c13770e6.m3676strictfp(1092486906);
                    }
                    c13770e6.Signature(false);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C18055e c18055e7 = (C18055e) obj;
                int intValue15 = ((Number) obj2).intValue();
                C13770e c13770e7 = (C13770e) obj3;
                int intValue16 = ((Number) obj4).intValue();
                C3248e c3248e = (C3248e) obj6;
                if ((intValue16 & 6) == 0) {
                    i7 = intValue16 | (c13770e7.purchase(c18055e7) ? 4 : 2);
                } else {
                    i7 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i7 |= c13770e7.license(intValue15) ? 32 : 16;
                }
                if (c13770e7.m3673protected(i7 & 1, (i7 & 147) != 146)) {
                    C6571e c6571e3 = (C6571e) ((List) obj5).get(intValue15);
                    c13770e7.m3676strictfp(-704749699);
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex5 = c13770e7.yandex(c3248e) | c13770e7.purchase(c6571e3);
                    Object m3681throw5 = c13770e7.m3681throw();
                    Object obj9 = m3681throw5;
                    if (yandex5 || m3681throw5 == c5170e) {
                        C7482e c7482e = new C7482e(c3248e, c6571e3, 0);
                        c13770e7.m3682throws(c7482e);
                        obj9 = c7482e;
                    }
                    InterfaceC12864e license2 = AbstractC9546e.license(metrica4, false, null, (Function0) obj9, 15);
                    float f4 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(-176128635, new C6612e(true ? 1 : 0, c6571e3), c13770e7), license2, null, null, AbstractC16653e.license(-1514004343, new C2077e(c3248e, c6571e3, true ? 1 : 0), c13770e7), null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e7, 510), 0.0f, 0.0f, c13770e7, 24582, 428);
                    if (intValue15 != AbstractC6874e.billing(C3248e.f7379e)) {
                        c13770e7.m3676strictfp(-703922279);
                        AbstractC8141e.ad(null, 0.0f, ((C7019e) c13770e7.adcel(AbstractC11785e.ad)).ad.ads, c13770e7, 0, 3);
                    } else {
                        c13770e7.m3676strictfp(-711852389);
                    }
                    c13770e7.Signature(false);
                    c13770e7.Signature(false);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C18055e c18055e8 = (C18055e) obj;
                int intValue17 = ((Number) obj2).intValue();
                C13770e c13770e8 = (C13770e) obj3;
                int intValue18 = ((Number) obj4).intValue();
                if ((intValue18 & 6) == 0) {
                    i8 = intValue18 | (c13770e8.purchase(c18055e8) ? 4 : 2);
                } else {
                    i8 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i8 |= c13770e8.license(intValue17) ? 32 : 16;
                }
                if (c13770e8.m3673protected(i8 & 1, (i8 & 147) != 146)) {
                    InterfaceC15377e interfaceC15377e = (InterfaceC15377e) ((List) obj5).get(intValue17);
                    c13770e8.m3676strictfp(-1995895961);
                    ((C2892e) obj6).invoke(interfaceC15377e, c13770e8, 0);
                    c13770e8.Signature(false);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C18055e c18055e9 = (C18055e) obj;
                int intValue19 = ((Number) obj2).intValue();
                C13770e c13770e9 = (C13770e) obj3;
                int intValue20 = ((Number) obj4).intValue();
                C10032e c10032e = (C10032e) obj6;
                if ((intValue20 & 6) == 0) {
                    i9 = intValue20 | (c13770e9.purchase(c18055e9) ? 4 : 2);
                } else {
                    i9 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i9 |= c13770e9.license(intValue19) ? 32 : 16;
                }
                if (c13770e9.m3673protected(i9 & 1, (i9 & 147) != 146)) {
                    C6064e c6064e = (C6064e) ((List) obj5).get(intValue19);
                    c13770e9.m3676strictfp(-847023082);
                    InterfaceC12864e metrica5 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex6 = c13770e9.yandex(c10032e) | c13770e9.yandex(c6064e);
                    Object m3681throw6 = c13770e9.m3681throw();
                    Object obj10 = m3681throw6;
                    if (yandex6 || m3681throw6 == c5170e) {
                        C12056e c12056e2 = new C12056e(c10032e, c6064e, 14);
                        c13770e9.m3682throws(c12056e2);
                        obj10 = c12056e2;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-1713849124, new C10634e(c6064e, i18), c13770e9), AbstractC9546e.license(metrica5, false, null, (Function0) obj10, 15), null, AbstractC16653e.license(-777530503, new C10634e(c6064e, true ? 1 : 0), c13770e9), AbstractC16653e.license(-465424296, new C10634e(c6064e, r14), c13770e9), null, null, 0.0f, 0.0f, c13770e9, 27654, 484);
                    if (intValue19 != AbstractC6874e.billing(c10032e.f19832e)) {
                        c13770e9.m3676strictfp(-846308099);
                        AbstractC8141e.vip(null, 0.0f, 0L, c13770e9, 0, 7);
                    } else {
                        c13770e9.m3676strictfp(-849735800);
                    }
                    c13770e9.Signature(false);
                    c13770e9.Signature(false);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C18055e c18055e10 = (C18055e) obj;
                int intValue21 = ((Number) obj2).intValue();
                C13770e c13770e10 = (C13770e) obj3;
                int intValue22 = ((Number) obj4).intValue();
                C16161e c16161e = (C16161e) obj6;
                if ((intValue22 & 6) == 0) {
                    i10 = intValue22 | (c13770e10.purchase(c18055e10) ? 4 : 2);
                } else {
                    i10 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i10 |= c13770e10.license(intValue21) ? 32 : 16;
                }
                if (c13770e10.m3673protected(i10 & 1, (i10 & 147) != 146)) {
                    EnumC3562e enumC3562e = (EnumC3562e) ((List) obj5).get(intValue21);
                    c13770e10.m3676strictfp(198238764);
                    InterfaceC12864e metrica6 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex7 = c13770e10.yandex(c16161e) | c13770e10.license(enumC3562e.ordinal());
                    Object m3681throw7 = c13770e10.m3681throw();
                    if (yandex7 || m3681throw7 == c5170e) {
                        m3681throw7 = new C12056e(c16161e, enumC3562e, r13);
                        c13770e10.m3682throws(m3681throw7);
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(1578527546, new C16421e(enumC3562e, i18), c13770e10), AbstractC9546e.license(metrica6, false, null, (Function0) m3681throw7, 15), null, AbstractC16653e.license(-1477721129, new C16421e(enumC3562e, true ? 1 : 0), c13770e10), null, null, null, 0.0f, 0.0f, c13770e10, 3078, 500);
                    c13770e10.Signature(false);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C18055e c18055e11 = (C18055e) obj;
                int intValue23 = ((Number) obj2).intValue();
                C13770e c13770e11 = (C13770e) obj3;
                int intValue24 = ((Number) obj4).intValue();
                if ((intValue24 & 6) == 0) {
                    i11 = intValue24 | (c13770e11.purchase(c18055e11) ? 4 : 2);
                } else {
                    i11 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i11 |= c13770e11.license(intValue23) ? 32 : 16;
                }
                if (c13770e11.m3673protected(i11 & 1, (i11 & 147) != 146)) {
                    C5926e c5926e = (C5926e) ((List) obj5).get(intValue23);
                    c13770e11.m3676strictfp(-569787286);
                    AbstractC0865e.ad(AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), null, null, null, null, AbstractC16653e.license(1702781066, new C4239e(c5926e, (C17399e) obj6), c13770e11), c13770e11, 196614, 30);
                    c13770e11.Signature(false);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C18055e c18055e12 = (C18055e) obj;
                int intValue25 = ((Number) obj2).intValue();
                C13770e c13770e12 = (C13770e) obj3;
                int intValue26 = ((Number) obj4).intValue();
                if ((intValue26 & 6) == 0) {
                    i12 = intValue26 | (c13770e12.purchase(c18055e12) ? 4 : 2);
                } else {
                    i12 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i12 |= c13770e12.license(intValue25) ? 32 : 16;
                }
                if (c13770e12.m3673protected(i12 & 1, (i12 & 147) != 146)) {
                    InterfaceC15377e interfaceC15377e2 = (InterfaceC15377e) ((List) obj5).get(intValue25);
                    c13770e12.m3676strictfp(-897930227);
                    ((AbstractC9512e) obj6).mo2586instanceof(interfaceC15377e2, c13770e12);
                    c13770e12.Signature(false);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C18055e c18055e13 = (C18055e) obj;
                int intValue27 = ((Number) obj2).intValue();
                C13770e c13770e13 = (C13770e) obj3;
                int intValue28 = ((Number) obj4).intValue();
                C5344e c5344e = (C5344e) obj6;
                if ((intValue28 & 6) == 0) {
                    i13 = intValue28 | (c13770e13.purchase(c18055e13) ? 4 : 2);
                } else {
                    i13 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    i13 |= c13770e13.license(intValue27) ? 32 : 16;
                }
                if (c13770e13.m3673protected(i13 & 1, (i13 & 147) != 146)) {
                    C6571e c6571e4 = (C6571e) ((List) obj5).get(intValue27);
                    c13770e13.m3676strictfp(1248467182);
                    InterfaceC12864e metrica7 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex8 = c13770e13.yandex(c5344e) | c13770e13.purchase(c6571e4);
                    Object m3681throw8 = c13770e13.m3681throw();
                    Object obj11 = m3681throw8;
                    if (yandex8 || m3681throw8 == c5170e) {
                        C10522e c10522e = new C10522e(c5344e, c6571e4, 0);
                        c13770e13.m3682throws(c10522e);
                        obj11 = c10522e;
                    }
                    InterfaceC12864e license3 = AbstractC9546e.license(metrica7, false, null, (Function0) obj11, 15);
                    float f5 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(1760454927, new C6612e(r14, c6571e4), c13770e13), license3, null, null, AbstractC16653e.license(610890259, new C2077e(c5344e, c6571e4, 9), c13770e13), null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e13, 510), 0.0f, 0.0f, c13770e13, 24582, 428);
                    if (intValue27 != AbstractC6874e.billing(c5344e.f11452e)) {
                        c13770e13.m3676strictfp(1249383975);
                        AbstractC8141e.ad(null, 0.0f, ((C7019e) c13770e13.adcel(AbstractC11785e.ad)).ad.ads, c13770e13, 0, 3);
                    } else {
                        c13770e13.m3676strictfp(1240109457);
                    }
                    c13770e13.Signature(false);
                    c13770e13.Signature(false);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                return ad(obj, obj2, obj3, obj4);
            case 14:
                C18055e c18055e14 = (C18055e) obj;
                int intValue29 = ((Number) obj2).intValue();
                C13770e c13770e14 = (C13770e) obj3;
                int intValue30 = ((Number) obj4).intValue();
                C3625e c3625e = (C3625e) obj6;
                if ((intValue30 & 6) == 0) {
                    i14 = intValue30 | (c13770e14.purchase(c18055e14) ? 4 : 2);
                } else {
                    i14 = intValue30;
                }
                if ((intValue30 & 48) == 0) {
                    i14 |= c13770e14.license(intValue29) ? 32 : 16;
                }
                if (c13770e14.m3673protected(i14 & 1, (i14 & 147) != 146)) {
                    C12817e c12817e = (C12817e) ((List) obj5).get(intValue29);
                    c13770e14.m3676strictfp(-200443091);
                    EnumC11342e m4167private = c3625e.m4167private();
                    AbstractC16049e m4166package = c3625e.m4166package();
                    String Signature = m4166package != null ? m4166package.Signature() : null;
                    boolean yandex9 = c13770e14.yandex(c3625e) | c13770e14.purchase(c12817e);
                    Object m3681throw9 = c13770e14.m3681throw();
                    Object obj12 = m3681throw9;
                    if (yandex9 || m3681throw9 == c5170e) {
                        C1021e c1021e = new C1021e(c3625e, c12817e, i17);
                        c13770e14.m3682throws(c1021e);
                        obj12 = c1021e;
                    }
                    AbstractC0607e.ad(c12817e, m4167private, Signature, (Function0) obj12, c13770e14, 0);
                    c13770e14.Signature(false);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                return vip(obj, obj2, obj3, obj4);
            case 16:
                return license(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return purchase(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return billing(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return startapp(obj, obj2, obj3, obj4);
            case 20:
                return adcel(obj, obj2, obj3, obj4);
            case 21:
                return mopub(obj, obj2, obj3, obj4);
            case 22:
                return advert(obj, obj2, obj3, obj4);
            case 23:
                return smaato(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return amazon(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return loadAd(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Signature(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return admob(obj, obj2, obj3, obj4);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return subscription(obj, obj2, obj3, obj4);
            default:
                C18055e c18055e15 = (C18055e) obj;
                int intValue31 = ((Number) obj2).intValue();
                C13770e c13770e15 = (C13770e) obj3;
                int intValue32 = ((Number) obj4).intValue();
                C0073e c0073e = (C0073e) obj6;
                if ((intValue32 & 6) == 0) {
                    i15 = intValue32 | (c13770e15.purchase(c18055e15) ? 4 : 2);
                } else {
                    i15 = intValue32;
                }
                if ((intValue32 & 48) == 0) {
                    i15 |= c13770e15.license(intValue31) ? 32 : 16;
                }
                if (c13770e15.m3673protected(i15 & 1, (i15 & 147) != 146)) {
                    C16655e c16655e = (C16655e) ((List) obj5).get(intValue31);
                    c13770e15.m3676strictfp(2058172156);
                    InterfaceC12864e metrica8 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex10 = c13770e15.yandex(c0073e) | c13770e15.purchase(c16655e);
                    Object m3681throw10 = c13770e15.m3681throw();
                    Object obj13 = m3681throw10;
                    if (yandex10 || m3681throw10 == c5170e) {
                        C1021e c1021e2 = new C1021e(c0073e, c16655e, 22);
                        c13770e15.m3682throws(c1021e2);
                        obj13 = c1021e2;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-857016639, new C5108e(c16655e, i18), c13770e15), AbstractC9546e.license(metrica8, false, null, (Function0) obj13, 15), null, null, AbstractC16653e.license(1242207805, new C5108e(c16655e, true ? 1 : 0), c13770e15), null, null, 0.0f, 0.0f, c13770e15, 24582, 492);
                    c13770e15.Signature(false);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
