package defpackage;

import android.text.SpannableStringBuilder;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4605e {
    public static final C10445e ad = new C10445e("\\[(\\S+?)\\|(.+?)\\]");

    public static CharSequence ad(String str) {
        List<C14031e> Signature = AbstractC7762e.Signature(C10445e.ad(ad, str));
        if (Signature.isEmpty()) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (C14031e c14031e : Signature) {
            String str2 = (String) ((C15942e) c14031e.ad()).get(0);
            int m1861goto = AbstractC5304e.m1861goto(spannableStringBuilder, str2, 0, false, 6);
            String str3 = (String) ((C15942e) c14031e.ad()).get(2);
            spannableStringBuilder.replace(m1861goto, Math.min(str2.length() + m1861goto, spannableStringBuilder.length()), (CharSequence) str3);
            String str4 = (String) ((C15942e) c14031e.ad()).get(1);
            if (!AbstractC6507e.pro(str4, "https://vk.com/", false) && !AbstractC6507e.pro(str4, "https://vk.ru/", false)) {
                str4 = "https://vk.com/".concat(str4);
            }
            spannableStringBuilder.setSpan(new C7863e(str4), m1861goto, str3.length() + m1861goto, 33);
        }
        return spannableStringBuilder;
    }
}
