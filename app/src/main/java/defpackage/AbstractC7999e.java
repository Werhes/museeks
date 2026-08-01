package defpackage;

import java.util.ArrayList;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7999e {
    public static final Set ad = AbstractC1660e.m664case(new Character[]{'!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});
    public static final Set vip = AbstractC1660e.m664case(new Character[]{'-', '.', '_', '~', '+', '/'});
    public static final C10445e metrica = new C10445e("[a-zA-Z0-9\\-._~+/]+=*");
    public static final C10445e license = new C10445e("\\\\.");

    public static final boolean ad(char c) {
        if ('a' > c || c >= '{') {
            return ('A' <= c && c < '[') || AbstractC4511e.startapp(c) || ad.contains(Character.valueOf(c));
        }
        return true;
    }

    public static final int metrica(int i, String str) {
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    public static final Integer vip(ArrayList arrayList, AbstractC0198e abstractC0198e, int i, String str) {
        if (i != str.length() && str.charAt(i) != ',') {
            return null;
        }
        arrayList.add(abstractC0198e);
        if (i == str.length()) {
            return -1;
        }
        if (str.charAt(i) == ',') {
            return Integer.valueOf(i + 1);
        }
        throw new IllegalStateException(BuildConfig.FLAVOR);
    }
}
