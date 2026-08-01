package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12315e {
    public static final C2892e ad = new C2892e(1687917626, false, new C14498e(6));
    public static final C2892e vip = new C2892e(1711306513, false, new C14498e(7));

    public static void Signature(TextView textView, int i) {
        AbstractC4265e.purchase(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final C12468e ad(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC8998e ad2 = AbstractC9548e.ad(f);
        if (ad2 == null) {
            ad2 = new C8547e(f);
        }
        return new C12468e(f2, f, ad2);
    }

    public static boolean adcel() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) || AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static ActionMode.Callback admob(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC11287e) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC11287e) callback).ad;
    }

    public static boolean advert() {
        if (!AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) && !AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str) || "SCG16".equalsIgnoreCase(str) || "SC-55C".equalsIgnoreCase(str);
    }

    public static void amazon(TextView textView, int i) {
        AbstractC4265e.purchase(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC17305e.m4279catch(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static boolean appmetrica() {
        if (!AbstractC6507e.loadAd(Build.MANUFACTURER, "Nokia", true) && !AbstractC6507e.loadAd(Build.BRAND, "Nokia", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean billing() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "OnePlus", true) || AbstractC6507e.loadAd(Build.BRAND, "OnePlus", true)) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean license() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Huawei", true) || AbstractC6507e.loadAd(Build.BRAND, "Huawei", true)) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static void loadAd(TextView textView, int i) {
        AbstractC4265e.purchase(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static C15707e metrica(C13272e c13272e) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C15707e(AbstractC17305e.m4288interface(c13272e));
        }
        TextPaint textPaint = new TextPaint(c13272e.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c13272e.getBreakStrategy();
        int hyphenationFrequency = c13272e.getHyphenationFrequency();
        if (c13272e.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c13272e.getInputType() & 15) != 3) {
                boolean z = c13272e.getLayoutDirection() == 1;
                switch (c13272e.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC17305e.subscription(AbstractC12026e.advert(c13272e.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C15707e(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean mopub() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) || AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean purchase() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "OnePlus", true) || AbstractC6507e.loadAd(Build.BRAND, "OnePlus", true)) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void smaato(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC13405e) {
            ((InterfaceC13405e) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static boolean startapp() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) || AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) && "a05s".equalsIgnoreCase(Build.DEVICE) && AbstractC5304e.inmobi(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false);
    }

    public static ActionMode.Callback subscription(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC11287e) || callback == null) ? callback : new ActionModeCallbackC11287e(callback, textView);
    }

    public static final void vip(AbstractC16049e abstractC16049e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C14542e yandex;
        c13770e.m3671package(1674006481);
        int i2 = (c13770e.purchase(abstractC16049e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            if (abstractC16049e == null) {
                c13770e.m3676strictfp(1462000977);
                c13770e.Signature(false);
                yandex = null;
            } else {
                c13770e.m3676strictfp(1462000978);
                yandex = AbstractC5960e.yandex(abstractC16049e, (Context) c13770e.adcel(AbstractC2676e.vip), 5, false);
                c13770e.Signature(false);
            }
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C3685e(28);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e yandex2 = AbstractC12546e.yandex(interfaceC12864e, (Function1) m3681throw);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C3685e(29);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC8461e.ad(yandex, null, AbstractC5750e.license(yandex2, (Function1) m3681throw2), C16477e.ad, null, c13770e, 1572912, 1976);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0263e(abstractC16049e, interfaceC12864e, i, 1);
        }
    }

    public static boolean yandex() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Redmi", true) || AbstractC6507e.loadAd(Build.BRAND, "Redmi", true)) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }
}
