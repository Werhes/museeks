package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0439e {
    public static void ad(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static void license(Configuration configuration, C6473e c6473e) {
        configuration.setLocales(LocaleList.forLanguageTags(c6473e.ad.ad()));
    }

    public static void metrica(C6473e c6473e) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c6473e.ad.ad()));
    }

    public static C6473e vip(Configuration configuration) {
        return C6473e.vip(configuration.getLocales().toLanguageTags());
    }
}
