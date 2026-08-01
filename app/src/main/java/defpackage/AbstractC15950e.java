package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15950e {
    public static LocaleList ad(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void vip(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
