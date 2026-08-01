package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import java.util.logging.Level;
import java.util.logging.Logger;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12992e {
    public static final C2892e ad = new C2892e(-290731416, false, new C16015e(19));
    public static final C2892e vip = new C2892e(-866534443, false, new C16015e(20));
    public static final String[] metrica = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] license = {"ad_impression"};
    public static final String[] appmetrica = {"ad_impression", "in_app_purchase"};
    public static final String[] purchase = {"ad_impression"};
    public static final String[] billing = {"ad_impression", "in_app_purchase"};
    public static final String[] yandex = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] startapp = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static ContextThemeWrapper ad(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, yandex(context, !z ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return yandex(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, purchase(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static String adcel(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder applovin = AbstractC8703e.applovin("<", str2, " threw ");
                    applovin.append(e.getClass().getName());
                    applovin.append(">");
                    sb = applovin.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static Drawable appmetrica(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable purchase2 = AbstractC4628e.purchase(context, obtainStyledAttributes.getResourceId(0, 0));
        if (startapp(context)) {
            purchase2.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return purchase2;
    }

    public static int billing(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static float license(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Ctry metrica(String str) {
        if (str.equals("SHA-256")) {
            return InterfaceC0760e.ad;
        }
        if (str.equals("SHA-512")) {
            return InterfaceC0760e.metrica;
        }
        if (str.equals("SHAKE128")) {
            return InterfaceC0760e.mopub;
        }
        if (str.equals("SHAKE256")) {
            return InterfaceC0760e.advert;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static void mopub(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(startapp(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    public static int purchase(Context context) {
        return startapp(context) ? vip(context) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel : vip(context) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public static boolean startapp(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static int vip(Context context) {
        return AbstractC3898e.license(-1, billing(context, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static int yandex(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }
}
