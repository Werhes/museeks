package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: eٍْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13883e {
    public static final Locale ad;

    static {
        Locale locale;
        new HashMap();
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                }
            }
        }
        locale = Locale.getDefault();
        ad = locale;
    }
}
