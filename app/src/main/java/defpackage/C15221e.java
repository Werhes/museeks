package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15221e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30120e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30121e;

    public /* synthetic */ C15221e(int i, Object obj) {
        this.f30121e = i;
        this.f30120e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.f30121e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(((EnumC15845e) this.f30120e).f31269e, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(((MainArtist) this.f30120e).metrica, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, ((EnumC6916e) this.f30120e).f14177e), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((AbstractC15876e) this.f30120e).m4034e((String) obj);
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C14544e c14544e = C5438e.f11668e;
                    C13964e billing = AbstractC16497e.billing(8);
                    EnumC5778e enumC5778e = (EnumC5778e) this.f30120e;
                    C8587e ad = AbstractC6451e.ad(billing, c14544e, c13770e4, 54);
                    long j = c13770e4.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase, C2721e.license);
                    int ordinal = enumC5778e.ordinal();
                    if (ordinal == 0) {
                        i = R.string.settings_now_playing_background_theme_blur;
                    } else if (ordinal == 1) {
                        i = R.string.settings_now_playing_background_theme_no_bg;
                    } else if (ordinal == 2) {
                        i = R.string.settings_now_playing_background_theme_gradient;
                    } else if (ordinal == 3) {
                        i = R.string.settings_now_playing_background_theme_beyond;
                    } else {
                        if (ordinal != 4) {
                            throw new C14803e(10);
                        }
                        i = R.string.settings_now_playing_background_theme_layer;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                    if (enumC5778e == EnumC5778e.f12231e || enumC5778e == EnumC5778e.f12230e) {
                        c13770e4.m3676strictfp(1627020380);
                        C15492e c15492e = AbstractC11785e.ad;
                        AbstractC17480e.ad(null, ((C7019e) c13770e4.adcel(c15492e)).ad.ad, ((C7019e) c13770e4.adcel(c15492e)).ad.vip, AbstractC12110e.appmetrica, c13770e4, 3072);
                    } else {
                        c13770e4.m3676strictfp(1613739887);
                    }
                    c13770e4.Signature(false);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Number) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    int ordinal2 = ((EnumC4169e) this.f30120e).ordinal();
                    if (ordinal2 == 0) {
                        i2 = R.string.settings_now_playing_blur_thickness_0;
                    } else if (ordinal2 == 1) {
                        i2 = R.string.settings_now_playing_blur_thickness_1;
                    } else if (ordinal2 == 2) {
                        i2 = R.string.settings_now_playing_blur_thickness_2;
                    } else if (ordinal2 == 3) {
                        i2 = R.string.settings_now_playing_blur_thickness_3;
                    } else if (ordinal2 == 4) {
                        i2 = R.string.settings_now_playing_blur_thickness_4;
                    } else {
                        if (ordinal2 != 5) {
                            throw new C14803e(10);
                        }
                        i2 = R.string.settings_now_playing_blur_thickness_5;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e5, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e5, 0, 0, 262142);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Number) obj2).intValue();
                C17196e c17196e = (C17196e) this.f30120e;
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AbstractC14489e.vip(c17196e.f33719e + ':' + c17196e.f33718e, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e6, 0, 24576, 245758);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Number) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, ((EnumC2646e) this.f30120e).f6521e), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e7, 0, 0, 262142);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Number) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AbstractC14489e.vip(((C6828e) this.f30120e).license, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Number) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AbstractC14489e.vip(((UmaTag) this.f30120e).ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e9, 0, 0, 262142);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Number) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ((C2743e) this.f30120e).m1195strictfp(3072, ((C7019e) c13770e10.adcel(AbstractC11785e.ad)).ad.remoteconfig, c13770e10, null);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
