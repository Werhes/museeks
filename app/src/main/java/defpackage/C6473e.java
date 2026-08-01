package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6473e {
    public static final C6473e vip = ad(new Locale[0]);
    public final InterfaceC14706e ad;

    public C6473e(InterfaceC14706e interfaceC14706e) {
        this.ad = interfaceC14706e;
    }

    public static C6473e ad(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C6473e(new C4730e(AbstractC12026e.startapp(localeArr))) : new C6473e(new C10187e(localeArr));
    }

    public static C6473e vip(String str) {
        if (str == null || str.isEmpty()) {
            return vip;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return ad(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6473e) {
            return this.ad.equals(((C6473e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }
}
