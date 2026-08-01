package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8475e implements InterfaceC12067e {
    public static final C8475e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؔ۠, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.apps.AppsAppDto", obj, 76);
        c4707e.advert("type", false);
        c4707e.advert("id", false);
        c4707e.advert("title", false);
        c4707e.advert("author_url", true);
        c4707e.advert("banner_1120", true);
        c4707e.advert("banner_560", true);
        c4707e.advert("icon_16", true);
        c4707e.advert("is_new", true);
        c4707e.advert("push_enabled", true);
        c4707e.advert("friends", true);
        c4707e.advert("catalog_position", true);
        c4707e.advert("description", true);
        c4707e.advert("genre", true);
        c4707e.advert("genre_id", true);
        c4707e.advert("international", true);
        c4707e.advert("is_in_catalog", true);
        c4707e.advert("install_url", true);
        c4707e.advert("members_count", true);
        c4707e.advert("platform_id", true);
        c4707e.advert("published_date", true);
        c4707e.advert("screen_name", true);
        c4707e.advert("section", true);
        c4707e.advert("external_browser_url", true);
        c4707e.advert("badge", true);
        c4707e.advert("preload_ad_types", true);
        c4707e.advert("is_widescreen", true);
        c4707e.advert("transliteration_name", true);
        c4707e.advert("is_vk_pay_disabled", true);
        c4707e.advert("notification_badge_type", true);
        c4707e.advert("community_catalog_tags", true);
        c4707e.advert("supported_style", true);
        c4707e.advert("author_owner_id", true);
        c4707e.advert("can_cache", true);
        c4707e.advert("are_notifications_enabled", true);
        c4707e.advert("is_install_screen", true);
        c4707e.advert("is_favorite", true);
        c4707e.advert("is_in_faves", true);
        c4707e.advert("is_recommended", true);
        c4707e.advert("is_installed", true);
        c4707e.advert("track_code", true);
        c4707e.advert("share_url", true);
        c4707e.advert("webview_url", true);
        c4707e.advert("install_screen_url", true);
        c4707e.advert("hide_tabbar", true);
        c4707e.advert("preload_url", true);
        c4707e.advert("icon_139", true);
        c4707e.advert("icon_150", true);
        c4707e.advert("icon_278", true);
        c4707e.advert("icon_576", true);
        c4707e.advert("background_loader_color", true);
        c4707e.advert("loader_icon", true);
        c4707e.advert("icon_75", true);
        c4707e.advert("open_in_external_browser", true);
        c4707e.advert("need_policy_confirmation", true);
        c4707e.advert("is_vkui_internal", true);
        c4707e.advert("has_vk_connect", true);
        c4707e.advert("need_show_bottom_menu_tooltip_on_close", true);
        c4707e.advert("short_description", true);
        c4707e.advert("slogan", true);
        c4707e.advert("last_update", true);
        c4707e.advert("is_debug", true);
        c4707e.advert("archive_test_url", true);
        c4707e.advert("odr_archive_version", true);
        c4707e.advert("odr_archive_date", true);
        c4707e.advert("odr_runtime", true);
        c4707e.advert("is_payments_allowed", true);
        c4707e.advert("profile_button_available", true);
        c4707e.advert("is_button_added_to_profile", true);
        c4707e.advert("is_badge_allowed", true);
        c4707e.advert("app_status", true);
        c4707e.advert("screen_orientation", true);
        c4707e.advert("mobile_controls_type", true);
        c4707e.advert("mobile_view_support_type", true);
        c4707e.advert("is_im_actions_supported", true);
        c4707e.advert("need_show_unverified_screen", true);
        c4707e.advert("is_calls_available", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0133e c0133e = (C0133e) obj;
        String str = c0133e.tapsense;
        Boolean bool = c0133e.f1338static;
        Boolean bool2 = c0133e.f1329instanceof;
        Boolean bool3 = c0133e.f1328import;
        Boolean bool4 = c0133e.f1346transient;
        Boolean bool5 = c0133e.f1333package;
        String str2 = c0133e.f1334private;
        String str3 = c0133e.f1339strictfp;
        String str4 = c0133e.f1332new;
        String str5 = c0133e.f1340super;
        String str6 = c0133e.f1323final;
        String str7 = c0133e.f1308catch;
        String str8 = c0133e.f1307case;
        String str9 = c0133e.f1327implements;
        EnumC6664e enumC6664e = c0133e.f1312default;
        String str10 = c0133e.f1305abstract;
        String str11 = c0133e.f1306break;
        String str12 = c0133e.f1335protected;
        String str13 = c0133e.f1347try;
        Boolean bool6 = c0133e.f1349while;
        Boolean bool7 = c0133e.f1344throw;
        Boolean bool8 = c0133e.f1314extends;
        Boolean bool9 = c0133e.f1331native;
        Boolean bool10 = c0133e.f1343this;
        Boolean bool11 = c0133e.f1326goto;
        Boolean bool12 = c0133e.f1330interface;
        Integer num = c0133e.f1309class;
        Integer num2 = c0133e.firebase;
        List list = c0133e.crashlytics;
        EnumC6905e enumC6905e = c0133e.subs;
        Boolean bool13 = c0133e.premium;
        String str14 = c0133e.ads;
        Boolean bool14 = c0133e.applovin;
        List list2 = c0133e.isPro;
        String str15 = c0133e.inmobi;
        String str16 = c0133e.isVip;
        String str17 = c0133e.signatures;
        Integer num3 = c0133e.pro;
        String str18 = c0133e.remoteconfig;
        Integer num4 = c0133e.subscription;
        String str19 = c0133e.admob;
        Integer num5 = c0133e.Signature;
        Boolean bool15 = c0133e.loadAd;
        Integer num6 = c0133e.amazon;
        String str20 = c0133e.smaato;
        String str21 = c0133e.advert;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0133e.f1304e;
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) interfaceC3477eArr[0].getValue();
        EnumC17132e enumC17132e = c0133e.ad;
        Integer num7 = c0133e.mopub;
        List list3 = c0133e.adcel;
        EnumC6664e enumC6664e2 = c0133e.startapp;
        EnumC6664e enumC6664e3 = c0133e.yandex;
        String str22 = c0133e.billing;
        String str23 = c0133e.purchase;
        String str24 = c0133e.appmetrica;
        String str25 = c0133e.license;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, enumC17132e);
        abstractC15920e.inmobi(1, c0133e.vip, interfaceC9998e);
        abstractC15920e.ads(interfaceC9998e, 2, c0133e.metrica);
        if (abstractC15920e.subscription() || str25 != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C9582e.ad, str25);
        }
        if (abstractC15920e.subscription() || str24 != null) {
            abstractC15920e.Signature(interfaceC9998e, 4, C9582e.ad, str24);
        }
        if (abstractC15920e.subscription() || str23 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str23);
        }
        if (abstractC15920e.subscription() || str22 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C9582e.ad, str22);
        }
        if (abstractC15920e.subscription() || enumC6664e3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, (InterfaceC5372e) interfaceC3477eArr[7].getValue(), enumC6664e3);
        }
        if (abstractC15920e.subscription() || enumC6664e2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, (InterfaceC5372e) interfaceC3477eArr[8].getValue(), enumC6664e2);
        }
        if (abstractC15920e.subscription() || list3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list3);
        }
        if (abstractC15920e.subscription() || num7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 10, C13257e.ad, num7);
        }
        if (abstractC15920e.subscription() || str21 != null) {
            abstractC15920e.Signature(interfaceC9998e, 11, C9582e.ad, str21);
        }
        if (abstractC15920e.subscription() || str20 != null) {
            abstractC15920e.Signature(interfaceC9998e, 12, C9582e.ad, str20);
        }
        if (abstractC15920e.subscription() || num6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 13, C13257e.ad, num6);
        }
        if (abstractC15920e.subscription() || bool15 != null) {
            abstractC15920e.Signature(interfaceC9998e, 14, C6266e.ad, bool15);
        }
        if (abstractC15920e.subscription() || num5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 15, C13257e.ad, num5);
        }
        if (abstractC15920e.subscription() || str19 != null) {
            abstractC15920e.Signature(interfaceC9998e, 16, C9582e.ad, str19);
        }
        if (abstractC15920e.subscription() || num4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 17, C13257e.ad, num4);
        }
        if (abstractC15920e.subscription() || str18 != null) {
            abstractC15920e.Signature(interfaceC9998e, 18, C9582e.ad, str18);
        }
        if (abstractC15920e.subscription() || num3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 19, C13257e.ad, num3);
        }
        if (abstractC15920e.subscription() || str17 != null) {
            abstractC15920e.Signature(interfaceC9998e, 20, C9582e.ad, str17);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 21, C9582e.ad, str);
        }
        if (abstractC15920e.subscription() || str16 != null) {
            abstractC15920e.Signature(interfaceC9998e, 22, C9582e.ad, str16);
        }
        if (abstractC15920e.subscription() || str15 != null) {
            abstractC15920e.Signature(interfaceC9998e, 23, C9582e.ad, str15);
        }
        if (abstractC15920e.subscription() || list2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 24, (InterfaceC5372e) interfaceC3477eArr[24].getValue(), list2);
        }
        if (abstractC15920e.subscription() || bool14 != null) {
            abstractC15920e.Signature(interfaceC9998e, 25, C6266e.ad, bool14);
        }
        if (abstractC15920e.subscription() || str14 != null) {
            abstractC15920e.Signature(interfaceC9998e, 26, C9582e.ad, str14);
        }
        if (abstractC15920e.subscription() || bool13 != null) {
            abstractC15920e.Signature(interfaceC9998e, 27, C6266e.ad, bool13);
        }
        if (abstractC15920e.subscription() || enumC6905e != null) {
            abstractC15920e.Signature(interfaceC9998e, 28, (InterfaceC5372e) interfaceC3477eArr[28].getValue(), enumC6905e);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 29, (InterfaceC5372e) interfaceC3477eArr[29].getValue(), list);
        }
        if (abstractC15920e.subscription() || num2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 30, C13257e.ad, num2);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 31, C13257e.ad, num);
        }
        if (abstractC15920e.subscription() || bool12 != null) {
            abstractC15920e.Signature(interfaceC9998e, 32, C6266e.ad, bool12);
        }
        if (abstractC15920e.subscription() || bool11 != null) {
            abstractC15920e.Signature(interfaceC9998e, 33, C6266e.ad, bool11);
        }
        if (abstractC15920e.subscription() || bool10 != null) {
            abstractC15920e.Signature(interfaceC9998e, 34, C6266e.ad, bool10);
        }
        if (abstractC15920e.subscription() || bool9 != null) {
            abstractC15920e.Signature(interfaceC9998e, 35, C6266e.ad, bool9);
        }
        if (abstractC15920e.subscription() || bool8 != null) {
            abstractC15920e.Signature(interfaceC9998e, 36, C6266e.ad, bool8);
        }
        if (abstractC15920e.subscription() || bool7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 37, C6266e.ad, bool7);
        }
        if (abstractC15920e.subscription() || bool6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 38, C6266e.ad, bool6);
        }
        if (abstractC15920e.subscription() || str13 != null) {
            abstractC15920e.Signature(interfaceC9998e, 39, C9582e.ad, str13);
        }
        if (abstractC15920e.subscription() || str12 != null) {
            abstractC15920e.Signature(interfaceC9998e, 40, C9582e.ad, str12);
        }
        if (abstractC15920e.subscription() || str11 != null) {
            abstractC15920e.Signature(interfaceC9998e, 41, C9582e.ad, str11);
        }
        if (abstractC15920e.subscription() || str10 != null) {
            abstractC15920e.Signature(interfaceC9998e, 42, C9582e.ad, str10);
        }
        if (abstractC15920e.subscription() || enumC6664e != null) {
            abstractC15920e.Signature(interfaceC9998e, 43, (InterfaceC5372e) interfaceC3477eArr[43].getValue(), enumC6664e);
        }
        if (abstractC15920e.subscription() || str9 != null) {
            abstractC15920e.Signature(interfaceC9998e, 44, C9582e.ad, str9);
        }
        if (abstractC15920e.subscription() || str8 != null) {
            abstractC15920e.Signature(interfaceC9998e, 45, C9582e.ad, str8);
        }
        if (abstractC15920e.subscription() || str7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 46, C9582e.ad, str7);
        }
        if (abstractC15920e.subscription() || str6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 47, C9582e.ad, str6);
        }
        if (abstractC15920e.subscription() || str5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 48, C9582e.ad, str5);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 49, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 50, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 51, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || bool5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 52, C6266e.ad, bool5);
        }
        if (abstractC15920e.subscription() || bool4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 53, C6266e.ad, bool4);
        }
        if (abstractC15920e.subscription() || bool3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 54, C6266e.ad, bool3);
        }
        if (abstractC15920e.subscription() || bool2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 55, C6266e.ad, bool2);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 56, C6266e.ad, bool);
        }
        if (abstractC15920e.subscription() || c0133e.f1342synchronized != null) {
            abstractC15920e.Signature(interfaceC9998e, 57, C9582e.ad, c0133e.f1342synchronized);
        }
        if (abstractC15920e.subscription() || c0133e.f1337return != null) {
            abstractC15920e.Signature(interfaceC9998e, 58, C9582e.ad, c0133e.f1337return);
        }
        if (abstractC15920e.subscription() || c0133e.f1313else != null) {
            abstractC15920e.Signature(interfaceC9998e, 59, C13257e.ad, c0133e.f1313else);
        }
        if (abstractC15920e.subscription() || c0133e.f1341switch != null) {
            abstractC15920e.Signature(interfaceC9998e, 60, C6266e.ad, c0133e.f1341switch);
        }
        if (abstractC15920e.subscription() || c0133e.f1345throws != null) {
            abstractC15920e.Signature(interfaceC9998e, 61, C9582e.ad, c0133e.f1345throws);
        }
        if (abstractC15920e.subscription() || c0133e.f1324finally != null) {
            abstractC15920e.Signature(interfaceC9998e, 62, C9582e.ad, c0133e.f1324finally);
        }
        if (abstractC15920e.subscription() || c0133e.f1310const != null) {
            abstractC15920e.Signature(interfaceC9998e, 63, C13257e.ad, c0133e.f1310const);
        }
        if (abstractC15920e.subscription() || c0133e.f1348volatile != null) {
            abstractC15920e.Signature(interfaceC9998e, 64, C13257e.ad, c0133e.f1348volatile);
        }
        if (abstractC15920e.subscription() || c0133e.f1325for != null) {
            abstractC15920e.Signature(interfaceC9998e, 65, C6266e.ad, c0133e.f1325for);
        }
        if (abstractC15920e.subscription() || c0133e.f1311continue != null) {
            abstractC15920e.Signature(interfaceC9998e, 66, C6266e.ad, c0133e.f1311continue);
        }
        if (abstractC15920e.subscription() || c0133e.f1336public != null) {
            abstractC15920e.Signature(interfaceC9998e, 67, C6266e.ad, c0133e.f1336public);
        }
        if (abstractC15920e.subscription() || c0133e.f1322e != null) {
            abstractC15920e.Signature(interfaceC9998e, 68, C6266e.ad, c0133e.f1322e);
        }
        if (abstractC15920e.subscription() || c0133e.f1319e != null) {
            abstractC15920e.Signature(interfaceC9998e, 69, C13257e.ad, c0133e.f1319e);
        }
        if (abstractC15920e.subscription() || c0133e.f1321e != null) {
            abstractC15920e.Signature(interfaceC9998e, 70, C13257e.ad, c0133e.f1321e);
        }
        if (abstractC15920e.subscription() || c0133e.f1316e != null) {
            abstractC15920e.Signature(interfaceC9998e, 71, C13257e.ad, c0133e.f1316e);
        }
        if (abstractC15920e.subscription() || c0133e.f1315e != null) {
            abstractC15920e.Signature(interfaceC9998e, 72, C13257e.ad, c0133e.f1315e);
        }
        if (abstractC15920e.subscription() || c0133e.f1317e != null) {
            abstractC15920e.Signature(interfaceC9998e, 73, C6266e.ad, c0133e.f1317e);
        }
        if (abstractC15920e.subscription() || c0133e.f1320e != null) {
            abstractC15920e.Signature(interfaceC9998e, 74, C6266e.ad, c0133e.f1320e);
        }
        if (abstractC15920e.subscription() || c0133e.f1318e != null) {
            abstractC15920e.Signature(interfaceC9998e, 75, C6266e.ad, c0133e.f1318e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C0133e.f1304e;
        C13257e c13257e = C13257e.ad;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{interfaceC3477eArr[0].getValue(), c13257e, c9582e, AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[7].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[8].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[9].getValue()), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[24].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[28].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[29].getValue()), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[43].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00cc. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        Boolean bool;
        int i;
        int i2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        int i3;
        Integer num7;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C0133e.f1304e;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool2 = null;
        Integer num10 = null;
        Integer num11 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num12 = null;
        Boolean bool5 = null;
        Integer num13 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        String str = null;
        EnumC17132e enumC17132e = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        EnumC6664e enumC6664e = null;
        EnumC6664e enumC6664e2 = null;
        List list = null;
        Integer num14 = null;
        String str6 = null;
        String str7 = null;
        Integer num15 = null;
        Boolean bool9 = null;
        Integer num16 = null;
        String str8 = null;
        Integer num17 = null;
        String str9 = null;
        Integer num18 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        List list2 = null;
        Boolean bool10 = null;
        String str14 = null;
        Boolean bool11 = null;
        EnumC6905e enumC6905e = null;
        List list3 = null;
        Integer num19 = null;
        Integer num20 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        EnumC6664e enumC6664e3 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        Boolean bool19 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        Boolean bool23 = null;
        String str27 = null;
        String str28 = null;
        Integer num21 = null;
        Boolean bool24 = null;
        String str29 = null;
        String str30 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 != 0) {
            Integer num22 = num10;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    Integer num23 = num11;
                    int i10 = i7;
                    int i11 = i9;
                    Integer num24 = num9;
                    bool = bool2;
                    i = i4;
                    Unit unit = Unit.INSTANCE;
                    i6 = i;
                    num9 = num24;
                    enumC17132e = enumC17132e;
                    i7 = i10;
                    num10 = num22;
                    num8 = num8;
                    i2 = i11;
                    num11 = num23;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 0:
                    num = num8;
                    Integer num25 = num11;
                    int i12 = i7;
                    int i13 = i9;
                    Integer num26 = num9;
                    bool = bool2;
                    i = i4;
                    EnumC17132e enumC17132e2 = (EnumC17132e) metrica.subscription(interfaceC9998e, i, (InterfaceC5372e) interfaceC3477eArr[i4].getValue(), enumC17132e);
                    int i14 = i13 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    i2 = i14;
                    num9 = num26;
                    i7 = i12;
                    num10 = num22;
                    str2 = str2;
                    num11 = num25;
                    enumC17132e = enumC17132e2;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 1:
                    num2 = num8;
                    num3 = num11;
                    int i15 = i7;
                    int i16 = i9;
                    Integer num27 = num9;
                    bool = bool2;
                    i8 = metrica.remoteconfig(interfaceC9998e, 1);
                    int i17 = i16 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    i2 = i17;
                    num9 = num27;
                    i7 = i15;
                    num10 = num22;
                    num11 = num3;
                    num8 = num2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 2:
                    num2 = num8;
                    num3 = num11;
                    int i18 = i7;
                    int i19 = i9;
                    Integer num28 = num9;
                    bool = bool2;
                    String smaato = metrica.smaato(interfaceC9998e, 2);
                    int i20 = i19 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    i2 = i20;
                    num9 = num28;
                    i7 = i18;
                    num10 = num22;
                    str = smaato;
                    num11 = num3;
                    num8 = num2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 3:
                    num = num8;
                    num4 = num11;
                    int i21 = i9;
                    bool = bool2;
                    String str31 = (String) metrica.inmobi(interfaceC9998e, 3, C9582e.ad, str2);
                    Unit unit5 = Unit.INSTANCE;
                    i2 = i21 | 8;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str2 = str31;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 4:
                    num = num8;
                    num4 = num11;
                    int i22 = i9;
                    bool = bool2;
                    String str32 = (String) metrica.inmobi(interfaceC9998e, 4, C9582e.ad, str3);
                    Unit unit6 = Unit.INSTANCE;
                    i2 = i22 | 16;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str3 = str32;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 5:
                    num = num8;
                    num4 = num11;
                    int i23 = i9;
                    bool = bool2;
                    String str33 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str4);
                    Unit unit7 = Unit.INSTANCE;
                    i2 = i23 | 32;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str4 = str33;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 6:
                    num = num8;
                    num4 = num11;
                    int i24 = i9;
                    bool = bool2;
                    String str34 = (String) metrica.inmobi(interfaceC9998e, 6, C9582e.ad, str5);
                    Unit unit8 = Unit.INSTANCE;
                    i2 = i24 | 64;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str5 = str34;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 7:
                    num = num8;
                    num4 = num11;
                    int i25 = i9;
                    bool = bool2;
                    EnumC6664e enumC6664e4 = (EnumC6664e) metrica.inmobi(interfaceC9998e, 7, (InterfaceC5372e) interfaceC3477eArr[7].getValue(), enumC6664e);
                    Unit unit9 = Unit.INSTANCE;
                    i2 = i25 | 128;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    enumC6664e = enumC6664e4;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 8:
                    num = num8;
                    num4 = num11;
                    int i26 = i7;
                    int i27 = i9;
                    Integer num29 = num9;
                    bool = bool2;
                    EnumC6664e enumC6664e5 = (EnumC6664e) metrica.inmobi(interfaceC9998e, 8, (InterfaceC5372e) interfaceC3477eArr[8].getValue(), enumC6664e2);
                    int i28 = i27 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    i2 = i28;
                    num9 = num29;
                    i7 = i26;
                    num10 = num22;
                    i = i4;
                    enumC6664e2 = enumC6664e5;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 9:
                    num = num8;
                    num4 = num11;
                    int i29 = i7;
                    int i30 = i9;
                    Integer num30 = num9;
                    bool = bool2;
                    List list4 = (List) metrica.inmobi(interfaceC9998e, 9, (InterfaceC5372e) interfaceC3477eArr[9].getValue(), list);
                    int i31 = i30 | AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    i2 = i31;
                    num9 = num30;
                    i7 = i29;
                    num10 = num22;
                    i = i4;
                    list = list4;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 10:
                    num = num8;
                    num4 = num11;
                    int i32 = i9;
                    bool = bool2;
                    Integer num31 = (Integer) metrica.inmobi(interfaceC9998e, 10, C13257e.ad, num14);
                    Unit unit12 = Unit.INSTANCE;
                    i2 = i32 | 1024;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num14 = num31;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 11:
                    num = num8;
                    num4 = num11;
                    int i33 = i9;
                    bool = bool2;
                    String str35 = (String) metrica.inmobi(interfaceC9998e, 11, C9582e.ad, str6);
                    Unit unit13 = Unit.INSTANCE;
                    i2 = i33 | 2048;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str6 = str35;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 12:
                    num = num8;
                    num4 = num11;
                    int i34 = i9;
                    bool = bool2;
                    String str36 = (String) metrica.inmobi(interfaceC9998e, 12, C9582e.ad, str7);
                    Unit unit14 = Unit.INSTANCE;
                    i2 = i34 | 4096;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str7 = str36;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 13:
                    num = num8;
                    num4 = num11;
                    int i35 = i9;
                    bool = bool2;
                    Integer num32 = (Integer) metrica.inmobi(interfaceC9998e, 13, C13257e.ad, num15);
                    Unit unit15 = Unit.INSTANCE;
                    i2 = i35 | 8192;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num15 = num32;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 14:
                    num = num8;
                    num4 = num11;
                    int i36 = i9;
                    bool = bool2;
                    Boolean bool25 = (Boolean) metrica.inmobi(interfaceC9998e, 14, C6266e.ad, bool9);
                    Unit unit16 = Unit.INSTANCE;
                    i2 = i36 | 16384;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    bool9 = bool25;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 15:
                    num = num8;
                    num4 = num11;
                    int i37 = i9;
                    bool = bool2;
                    Integer num33 = (Integer) metrica.inmobi(interfaceC9998e, 15, C13257e.ad, num16);
                    Unit unit17 = Unit.INSTANCE;
                    i2 = i37 | 32768;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num16 = num33;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 16:
                    num = num8;
                    num4 = num11;
                    int i38 = i9;
                    bool = bool2;
                    String str37 = (String) metrica.inmobi(interfaceC9998e, 16, C9582e.ad, str8);
                    Unit unit18 = Unit.INSTANCE;
                    i2 = i38 | 65536;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str8 = str37;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    num = num8;
                    num4 = num11;
                    int i39 = i9;
                    bool = bool2;
                    Integer num34 = (Integer) metrica.inmobi(interfaceC9998e, 17, C13257e.ad, num17);
                    Unit unit19 = Unit.INSTANCE;
                    i2 = i39 | 131072;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num17 = num34;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    num = num8;
                    num4 = num11;
                    int i40 = i9;
                    bool = bool2;
                    String str38 = (String) metrica.inmobi(interfaceC9998e, 18, C9582e.ad, str9);
                    Unit unit20 = Unit.INSTANCE;
                    i2 = i40 | 262144;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str9 = str38;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    num = num8;
                    num4 = num11;
                    int i41 = i9;
                    bool = bool2;
                    Integer num35 = (Integer) metrica.inmobi(interfaceC9998e, 19, C13257e.ad, num18);
                    Unit unit21 = Unit.INSTANCE;
                    i2 = i41 | 524288;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num18 = num35;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 20:
                    num = num8;
                    num4 = num11;
                    int i42 = i9;
                    bool = bool2;
                    String str39 = (String) metrica.inmobi(interfaceC9998e, 20, C9582e.ad, str10);
                    Unit unit22 = Unit.INSTANCE;
                    i2 = i42 | 1048576;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str10 = str39;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 21:
                    num = num8;
                    num4 = num11;
                    int i43 = i9;
                    bool = bool2;
                    String str40 = (String) metrica.inmobi(interfaceC9998e, 21, C9582e.ad, str11);
                    Unit unit23 = Unit.INSTANCE;
                    i2 = i43 | 2097152;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str11 = str40;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 22:
                    num = num8;
                    num4 = num11;
                    int i44 = i9;
                    bool = bool2;
                    String str41 = (String) metrica.inmobi(interfaceC9998e, 22, C9582e.ad, str12);
                    Unit unit24 = Unit.INSTANCE;
                    i2 = i44 | 4194304;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str12 = str41;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 23:
                    num = num8;
                    num4 = num11;
                    int i45 = i9;
                    bool = bool2;
                    String str42 = (String) metrica.inmobi(interfaceC9998e, 23, C9582e.ad, str13);
                    Unit unit25 = Unit.INSTANCE;
                    i2 = i45 | 8388608;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str13 = str42;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    num = num8;
                    num4 = num11;
                    int i46 = i9;
                    bool = bool2;
                    List list5 = (List) metrica.inmobi(interfaceC9998e, 24, (InterfaceC5372e) interfaceC3477eArr[24].getValue(), list2);
                    Unit unit26 = Unit.INSTANCE;
                    i2 = i46 | 16777216;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    list2 = list5;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    num = num8;
                    num4 = num11;
                    int i47 = i9;
                    bool = bool2;
                    Boolean bool26 = (Boolean) metrica.inmobi(interfaceC9998e, 25, C6266e.ad, bool10);
                    Unit unit27 = Unit.INSTANCE;
                    i2 = i47 | 33554432;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    bool10 = bool26;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    num = num8;
                    num4 = num11;
                    int i48 = i9;
                    bool = bool2;
                    String str43 = (String) metrica.inmobi(interfaceC9998e, 26, C9582e.ad, str14);
                    Unit unit28 = Unit.INSTANCE;
                    i2 = i48 | 67108864;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    str14 = str43;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    num = num8;
                    num4 = num11;
                    int i49 = i9;
                    bool = bool2;
                    Boolean bool27 = (Boolean) metrica.inmobi(interfaceC9998e, 27, C6266e.ad, bool11);
                    Unit unit29 = Unit.INSTANCE;
                    i2 = i49 | 134217728;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    bool11 = bool27;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    num = num8;
                    num4 = num11;
                    int i50 = i9;
                    bool = bool2;
                    EnumC6905e enumC6905e2 = (EnumC6905e) metrica.inmobi(interfaceC9998e, 28, (InterfaceC5372e) interfaceC3477eArr[28].getValue(), enumC6905e);
                    Unit unit30 = Unit.INSTANCE;
                    i2 = i50 | 268435456;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    enumC6905e = enumC6905e2;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    num = num8;
                    num4 = num11;
                    int i51 = i9;
                    bool = bool2;
                    List list6 = (List) metrica.inmobi(interfaceC9998e, 29, (InterfaceC5372e) interfaceC3477eArr[29].getValue(), list3);
                    Unit unit31 = Unit.INSTANCE;
                    i2 = i51 | 536870912;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    list3 = list6;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 30:
                    num = num8;
                    num4 = num11;
                    int i52 = i9;
                    bool = bool2;
                    Integer num36 = (Integer) metrica.inmobi(interfaceC9998e, 30, C13257e.ad, num19);
                    Unit unit32 = Unit.INSTANCE;
                    i2 = i52 | 1073741824;
                    num9 = num9;
                    i7 = i7;
                    num10 = num22;
                    i = i4;
                    num19 = num36;
                    num11 = num4;
                    num8 = num;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 31:
                    Integer num37 = num8;
                    int i53 = i7;
                    Integer num38 = num9;
                    Integer num39 = (Integer) metrica.inmobi(interfaceC9998e, 31, C13257e.ad, num20);
                    int i54 = i9 | RecyclerView.UNDEFINED_DURATION;
                    Unit unit33 = Unit.INSTANCE;
                    num20 = num39;
                    num9 = num38;
                    num11 = num11;
                    num8 = num37;
                    i7 = i53;
                    num10 = num22;
                    i2 = i54;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 32:
                    num5 = num8;
                    num6 = num11;
                    int i55 = i7;
                    Integer num40 = num9;
                    Boolean bool28 = (Boolean) metrica.inmobi(interfaceC9998e, 32, C6266e.ad, bool12);
                    int i56 = i55 | 1;
                    Unit unit34 = Unit.INSTANCE;
                    i7 = i56;
                    num9 = num40;
                    bool12 = bool28;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    num5 = num8;
                    num6 = num11;
                    int i57 = i7;
                    Integer num41 = num9;
                    Boolean bool29 = (Boolean) metrica.inmobi(interfaceC9998e, 33, C6266e.ad, bool13);
                    int i58 = i57 | 2;
                    Unit unit35 = Unit.INSTANCE;
                    i7 = i58;
                    num9 = num41;
                    bool13 = bool29;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    num5 = num8;
                    num6 = num11;
                    int i59 = i7;
                    Integer num42 = num9;
                    Boolean bool30 = (Boolean) metrica.inmobi(interfaceC9998e, 34, C6266e.ad, bool14);
                    int i60 = i59 | 4;
                    Unit unit36 = Unit.INSTANCE;
                    i7 = i60;
                    num9 = num42;
                    bool14 = bool30;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    num5 = num8;
                    num6 = num11;
                    int i61 = i7;
                    Integer num43 = num9;
                    Boolean bool31 = (Boolean) metrica.inmobi(interfaceC9998e, 35, C6266e.ad, bool15);
                    int i62 = i61 | 8;
                    Unit unit37 = Unit.INSTANCE;
                    i7 = i62;
                    num9 = num43;
                    bool15 = bool31;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    num5 = num8;
                    num6 = num11;
                    int i63 = i7;
                    Integer num44 = num9;
                    Boolean bool32 = (Boolean) metrica.inmobi(interfaceC9998e, 36, C6266e.ad, bool16);
                    int i64 = i63 | 16;
                    Unit unit38 = Unit.INSTANCE;
                    i7 = i64;
                    num9 = num44;
                    bool16 = bool32;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    num5 = num8;
                    num6 = num11;
                    int i65 = i7;
                    Integer num45 = num9;
                    Boolean bool33 = (Boolean) metrica.inmobi(interfaceC9998e, 37, C6266e.ad, bool17);
                    int i66 = i65 | 32;
                    Unit unit39 = Unit.INSTANCE;
                    i7 = i66;
                    num9 = num45;
                    bool17 = bool33;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    num5 = num8;
                    num6 = num11;
                    int i67 = i7;
                    Integer num46 = num9;
                    Boolean bool34 = (Boolean) metrica.inmobi(interfaceC9998e, 38, C6266e.ad, bool18);
                    int i68 = i67 | 64;
                    Unit unit40 = Unit.INSTANCE;
                    i7 = i68;
                    num9 = num46;
                    bool18 = bool34;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    num5 = num8;
                    num6 = num11;
                    int i69 = i7;
                    Integer num47 = num9;
                    String str44 = (String) metrica.inmobi(interfaceC9998e, 39, C9582e.ad, str15);
                    int i70 = i69 | 128;
                    Unit unit41 = Unit.INSTANCE;
                    i7 = i70;
                    num9 = num47;
                    str15 = str44;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    num5 = num8;
                    num6 = num11;
                    int i71 = i7;
                    Integer num48 = num9;
                    String str45 = (String) metrica.inmobi(interfaceC9998e, 40, C9582e.ad, str16);
                    int i72 = i71 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit42 = Unit.INSTANCE;
                    i7 = i72;
                    num9 = num48;
                    str16 = str45;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    num5 = num8;
                    num6 = num11;
                    int i73 = i7;
                    Integer num49 = num9;
                    String str46 = (String) metrica.inmobi(interfaceC9998e, 41, C9582e.ad, str17);
                    int i74 = i73 | AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit43 = Unit.INSTANCE;
                    i7 = i74;
                    num9 = num49;
                    str17 = str46;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    num5 = num8;
                    num6 = num11;
                    int i75 = i7;
                    Integer num50 = num9;
                    String str47 = (String) metrica.inmobi(interfaceC9998e, 42, C9582e.ad, str18);
                    int i76 = i75 | 1024;
                    Unit unit44 = Unit.INSTANCE;
                    i7 = i76;
                    num9 = num50;
                    str18 = str47;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    num5 = num8;
                    num6 = num11;
                    int i77 = i7;
                    Integer num51 = num9;
                    EnumC6664e enumC6664e6 = (EnumC6664e) metrica.inmobi(interfaceC9998e, 43, (InterfaceC5372e) interfaceC3477eArr[43].getValue(), enumC6664e3);
                    int i78 = i77 | 2048;
                    Unit unit45 = Unit.INSTANCE;
                    i7 = i78;
                    num9 = num51;
                    enumC6664e3 = enumC6664e6;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    num5 = num8;
                    num6 = num11;
                    int i79 = i7;
                    Integer num52 = num9;
                    String str48 = (String) metrica.inmobi(interfaceC9998e, 44, C9582e.ad, str19);
                    int i80 = i79 | 4096;
                    Unit unit46 = Unit.INSTANCE;
                    i7 = i80;
                    num9 = num52;
                    str19 = str48;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    num5 = num8;
                    num6 = num11;
                    int i81 = i7;
                    Integer num53 = num9;
                    String str49 = (String) metrica.inmobi(interfaceC9998e, 45, C9582e.ad, str20);
                    int i82 = i81 | 8192;
                    Unit unit47 = Unit.INSTANCE;
                    i7 = i82;
                    num9 = num53;
                    str20 = str49;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    num5 = num8;
                    num6 = num11;
                    String str50 = (String) metrica.inmobi(interfaceC9998e, 46, C9582e.ad, str21);
                    i3 = i7 | 16384;
                    Unit unit48 = Unit.INSTANCE;
                    str21 = str50;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    num5 = num8;
                    num6 = num11;
                    String str51 = (String) metrica.inmobi(interfaceC9998e, 47, C9582e.ad, str22);
                    i3 = i7 | 32768;
                    Unit unit49 = Unit.INSTANCE;
                    str22 = str51;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 48:
                    num5 = num8;
                    num6 = num11;
                    String str52 = (String) metrica.inmobi(interfaceC9998e, 48, C9582e.ad, str23);
                    i3 = i7 | 65536;
                    Unit unit50 = Unit.INSTANCE;
                    str23 = str52;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    num5 = num8;
                    num6 = num11;
                    String str53 = (String) metrica.inmobi(interfaceC9998e, 49, C9582e.ad, str24);
                    i3 = i7 | 131072;
                    Unit unit51 = Unit.INSTANCE;
                    str24 = str53;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    num5 = num8;
                    num6 = num11;
                    String str54 = (String) metrica.inmobi(interfaceC9998e, 50, C9582e.ad, str25);
                    i3 = i7 | 262144;
                    Unit unit52 = Unit.INSTANCE;
                    str25 = str54;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 51:
                    num5 = num8;
                    num6 = num11;
                    String str55 = (String) metrica.inmobi(interfaceC9998e, 51, C9582e.ad, str26);
                    i3 = i7 | 524288;
                    Unit unit53 = Unit.INSTANCE;
                    str26 = str55;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 52:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool35 = (Boolean) metrica.inmobi(interfaceC9998e, 52, C6266e.ad, bool19);
                    i3 = i7 | 1048576;
                    Unit unit54 = Unit.INSTANCE;
                    bool19 = bool35;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 53:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool36 = (Boolean) metrica.inmobi(interfaceC9998e, 53, C6266e.ad, bool20);
                    i3 = i7 | 2097152;
                    Unit unit55 = Unit.INSTANCE;
                    bool20 = bool36;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 54:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool37 = (Boolean) metrica.inmobi(interfaceC9998e, 54, C6266e.ad, bool21);
                    i3 = i7 | 4194304;
                    Unit unit56 = Unit.INSTANCE;
                    bool21 = bool37;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 55:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool38 = (Boolean) metrica.inmobi(interfaceC9998e, 55, C6266e.ad, bool22);
                    i3 = i7 | 8388608;
                    Unit unit57 = Unit.INSTANCE;
                    bool22 = bool38;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 56:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool39 = (Boolean) metrica.inmobi(interfaceC9998e, 56, C6266e.ad, bool23);
                    i3 = i7 | 16777216;
                    Unit unit58 = Unit.INSTANCE;
                    bool23 = bool39;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 57:
                    num5 = num8;
                    num6 = num11;
                    String str56 = (String) metrica.inmobi(interfaceC9998e, 57, C9582e.ad, str27);
                    i3 = i7 | 33554432;
                    Unit unit59 = Unit.INSTANCE;
                    str27 = str56;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 58:
                    num5 = num8;
                    num6 = num11;
                    String str57 = (String) metrica.inmobi(interfaceC9998e, 58, C9582e.ad, str28);
                    i3 = i7 | 67108864;
                    Unit unit60 = Unit.INSTANCE;
                    str28 = str57;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 59:
                    num5 = num8;
                    num6 = num11;
                    Integer num54 = (Integer) metrica.inmobi(interfaceC9998e, 59, C13257e.ad, num21);
                    i3 = i7 | 134217728;
                    Unit unit61 = Unit.INSTANCE;
                    num21 = num54;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 60:
                    num5 = num8;
                    num6 = num11;
                    Boolean bool40 = (Boolean) metrica.inmobi(interfaceC9998e, 60, C6266e.ad, bool24);
                    i3 = i7 | 268435456;
                    Unit unit62 = Unit.INSTANCE;
                    bool24 = bool40;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 61:
                    num5 = num8;
                    num6 = num11;
                    String str58 = (String) metrica.inmobi(interfaceC9998e, 61, C9582e.ad, str29);
                    i3 = i7 | 536870912;
                    Unit unit63 = Unit.INSTANCE;
                    str29 = str58;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 62:
                    num5 = num8;
                    num6 = num11;
                    String str59 = (String) metrica.inmobi(interfaceC9998e, 62, C9582e.ad, str30);
                    i3 = i7 | 1073741824;
                    Unit unit64 = Unit.INSTANCE;
                    str30 = str59;
                    i7 = i3;
                    num10 = num22;
                    i2 = i9;
                    num11 = num6;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 63:
                    num2 = num8;
                    Integer num55 = num11;
                    Integer num56 = (Integer) metrica.inmobi(interfaceC9998e, 63, C13257e.ad, num22);
                    int i83 = i7 | RecyclerView.UNDEFINED_DURATION;
                    Unit unit65 = Unit.INSTANCE;
                    i7 = i83;
                    i2 = i9;
                    num11 = num55;
                    num10 = num56;
                    bool = bool2;
                    num8 = num2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    num5 = num8;
                    Integer num57 = (Integer) metrica.inmobi(interfaceC9998e, 64, C13257e.ad, num11);
                    i5 |= 1;
                    Unit unit66 = Unit.INSTANCE;
                    num11 = num57;
                    num10 = num22;
                    i2 = i9;
                    num8 = num5;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 65:
                    num7 = num11;
                    Boolean bool41 = (Boolean) metrica.inmobi(interfaceC9998e, 65, C6266e.ad, bool3);
                    i5 |= 2;
                    Unit unit67 = Unit.INSTANCE;
                    bool3 = bool41;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 66:
                    num7 = num11;
                    Boolean bool42 = (Boolean) metrica.inmobi(interfaceC9998e, 66, C6266e.ad, bool4);
                    i5 |= 4;
                    Unit unit68 = Unit.INSTANCE;
                    bool4 = bool42;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 67:
                    num7 = num11;
                    Boolean bool43 = (Boolean) metrica.inmobi(interfaceC9998e, 67, C6266e.ad, bool5);
                    i5 |= 8;
                    Unit unit69 = Unit.INSTANCE;
                    bool5 = bool43;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 68:
                    num7 = num11;
                    bool2 = (Boolean) metrica.inmobi(interfaceC9998e, 68, C6266e.ad, bool2);
                    i5 |= 16;
                    Unit unit70 = Unit.INSTANCE;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 69:
                    num7 = num11;
                    num9 = (Integer) metrica.inmobi(interfaceC9998e, 69, C13257e.ad, num9);
                    i5 |= 32;
                    Unit unit702 = Unit.INSTANCE;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 70:
                    num7 = num11;
                    num8 = (Integer) metrica.inmobi(interfaceC9998e, 70, C13257e.ad, num8);
                    i5 |= 64;
                    Unit unit7022 = Unit.INSTANCE;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 71:
                    num7 = num11;
                    Integer num58 = (Integer) metrica.inmobi(interfaceC9998e, 71, C13257e.ad, num13);
                    i5 |= 128;
                    Unit unit71 = Unit.INSTANCE;
                    num13 = num58;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 72:
                    num7 = num11;
                    Integer num59 = (Integer) metrica.inmobi(interfaceC9998e, 72, C13257e.ad, num12);
                    i5 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit72 = Unit.INSTANCE;
                    num12 = num59;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 73:
                    num7 = num11;
                    Boolean bool44 = (Boolean) metrica.inmobi(interfaceC9998e, 73, C6266e.ad, bool6);
                    i5 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit73 = Unit.INSTANCE;
                    bool6 = bool44;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 74:
                    num7 = num11;
                    Boolean bool45 = (Boolean) metrica.inmobi(interfaceC9998e, 74, C6266e.ad, bool7);
                    i5 |= 1024;
                    Unit unit74 = Unit.INSTANCE;
                    bool7 = bool45;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                case 75:
                    num7 = num11;
                    Boolean bool46 = (Boolean) metrica.inmobi(interfaceC9998e, 75, C6266e.ad, bool8);
                    i5 |= 2048;
                    Unit unit75 = Unit.INSTANCE;
                    bool8 = bool46;
                    num10 = num22;
                    i2 = i9;
                    num11 = num7;
                    bool = bool2;
                    i = i4;
                    i4 = i;
                    bool2 = bool;
                    i9 = i2;
                default:
                    throw new C0413e(yandex);
            }
        }
        Integer num60 = num8;
        Integer num61 = num10;
        Integer num62 = num11;
        int i84 = i7;
        int i85 = i9;
        Integer num63 = num9;
        metrica.vip(interfaceC9998e);
        Boolean bool47 = bool7;
        return new C0133e(i85, i84, i5, enumC17132e, i8, str, str2, str3, str4, str5, enumC6664e, enumC6664e2, list, num14, str6, str7, num15, bool9, num16, str8, num17, str9, num18, str10, str11, str12, str13, list2, bool10, str14, bool11, enumC6905e, list3, num19, num20, bool12, bool13, bool14, bool15, bool16, bool17, bool18, str15, str16, str17, str18, enumC6664e3, str19, str20, str21, str22, str23, str24, str25, str26, bool19, bool20, bool21, bool22, bool23, str27, str28, num21, bool24, str29, str30, num61, num62, bool3, bool4, bool5, bool2, num63, num60, num13, num12, bool6, bool47, bool8);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
