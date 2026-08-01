package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1266e {
    public static final C2892e ad = new C2892e(-182056647, false, new C2916e(10));
    public static final String[] vip = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] metrica = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] license = {"items"};
    public static final String[] appmetrica = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static InterfaceC0293e ad(int i, Ctry ctry) {
        InterfaceC7559e c16253e;
        if (ctry.isVip(InterfaceC0760e.ad)) {
            c16253e = new C7952e();
        } else {
            if (!ctry.isVip(InterfaceC0760e.admob)) {
                throw new IllegalArgumentException(AbstractC4653e.inmobi("unrecognized digest OID: ", ctry));
            }
            c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return (InterfaceC0760e.admob.isVip(ctry) || c16253e.getDigestSize() != i) ? new C9227e(c16253e, i) : c16253e;
    }

    public static final byte[] appmetrica(String str, Charset charset) {
        return charset.equals(AbstractC5508e.ad) ? AbstractC6507e.smaato(str) : AbstractC6629e.billing(charset.newEncoder(), str, 0, str.length());
    }

    public static String license(InterfaceC17430e interfaceC17430e, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = AbstractC5508e.ad;
        }
        return charset.equals(AbstractC5508e.ad) ? AbstractC5756e.license(interfaceC17430e) : AbstractC16540e.vip(charset.newDecoder(), interfaceC17430e);
    }

    public static InterfaceC0293e metrica(C11892e c11892e) {
        return ad(c11892e.vip, c11892e.purchase);
    }

    public static void purchase(C12402e c12402e, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = AbstractC5508e.ad;
        AbstractC5756e.startapp(c12402e, charSequence.toString(), 0, i);
    }

    public static C14133e vip(String str) {
        C14031e vip2 = C14133e.license.vip(0, str);
        if (vip2 == null) {
            throw new IllegalArgumentException(AbstractC17861e.advert('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((C15942e) vip2.ad()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        ((String) ((C15942e) vip2.ad()).get(2)).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        int i = vip2.vip().f22522e;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new C14133e(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
            }
            C14031e vip3 = C14133e.appmetrica.vip(i2, str);
            if (vip3 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            C4468e c4468e = vip3.metrica;
            C18352e firebase = c4468e.firebase(1);
            String str3 = firebase != null ? firebase.ad : null;
            if (str3 == null) {
                i = vip3.vip().f22522e;
            } else {
                C18352e firebase2 = c4468e.firebase(2);
                String str4 = firebase2 != null ? firebase2.ad : null;
                if (str4 == null) {
                    str4 = c4468e.firebase(3).ad;
                } else if (AbstractC5304e.m1864instanceof(str4, '\'') && AbstractC5304e.premium(str4, '\'') && str4.length() > 2) {
                    str4 = AbstractC5087e.m1752this(1, 1, str4);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = vip3.vip().f22522e;
            }
        }
    }
}
