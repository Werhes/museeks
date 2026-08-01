package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15718e {
    public final String ad;
    public final int appmetrica;
    public final List billing;
    public final String license;
    public final String metrica;
    public final ArrayList purchase;
    public final String startapp;
    public final String vip;
    public final String yandex;

    public C15718e(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = i;
        this.purchase = arrayList;
        this.billing = arrayList2;
        this.yandex = str5;
        this.startapp = str6;
    }

    public final String ad() {
        if (this.metrica.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.ad.length() + 3;
        String str = this.startapp;
        return str.substring(AbstractC5304e.m1865interface(str, ':', length, 4) + 1, AbstractC5304e.m1865interface(str, '@', 0, 6));
    }

    public final String appmetrica() {
        if (this.vip.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.ad.length() + 3;
        String str = this.startapp;
        return str.substring(length, AbstractC10220e.metrica(length, str.length(), str, ":@"));
    }

    public final String billing() {
        C14052e c14052e;
        try {
            c14052e = new C14052e();
            c14052e.adcel(this, "/...");
        } catch (IllegalArgumentException unused) {
            c14052e = null;
        }
        c14052e.getClass();
        c14052e.purchase = AbstractC11309e.vip(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
        c14052e.billing = AbstractC11309e.vip(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
        return c14052e.metrica().startapp;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15718e) && AbstractC7890e.billing(((C15718e) obj).startapp, this.startapp);
    }

    public final int hashCode() {
        return this.startapp.hashCode();
    }

    public final String license() {
        if (this.billing == null) {
            return null;
        }
        String str = this.startapp;
        int m1865interface = AbstractC5304e.m1865interface(str, '?', 0, 6) + 1;
        return str.substring(m1865interface, AbstractC10220e.license(str, '#', m1865interface, str.length()));
    }

    public final ArrayList metrica() {
        int length = this.ad.length() + 3;
        String str = this.startapp;
        int m1865interface = AbstractC5304e.m1865interface(str, '/', length, 4);
        int metrica = AbstractC10220e.metrica(m1865interface, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (m1865interface < metrica) {
            int i = m1865interface + 1;
            int license = AbstractC10220e.license(str, '/', i, metrica);
            arrayList.add(str.substring(i, license));
            m1865interface = license;
        }
        return arrayList;
    }

    public final C14052e purchase() {
        C14052e c14052e = new C14052e();
        String str = this.ad;
        c14052e.appmetrica = str;
        c14052e.purchase = appmetrica();
        c14052e.billing = ad();
        c14052e.yandex = this.license;
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.appmetrica;
        c14052e.vip = i2 != i ? i2 : -1;
        ArrayList arrayList = c14052e.metrica;
        arrayList.clear();
        arrayList.addAll(metrica());
        String license = license();
        String str2 = null;
        c14052e.license = license != null ? C14052e.mopub(AbstractC11309e.vip(0, 0, 83, license, " \"'<>#")) : null;
        if (this.yandex != null) {
            String str3 = this.startapp;
            str2 = str3.substring(AbstractC5304e.m1865interface(str3, '#', 0, 6) + 1);
        }
        c14052e.startapp = str2;
        return c14052e;
    }

    public final String toString() {
        return this.startapp;
    }

    public final String vip() {
        int length = this.ad.length() + 3;
        String str = this.startapp;
        int m1865interface = AbstractC5304e.m1865interface(str, '/', length, 4);
        return str.substring(m1865interface, AbstractC10220e.metrica(m1865interface, str.length(), str, "?#"));
    }

    public final URI yandex() {
        C14052e purchase = purchase();
        ArrayList arrayList = purchase.metrica;
        String str = (String) purchase.yandex;
        purchase.yandex = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll(BuildConfig.FLAVOR) : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, AbstractC11309e.vip(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = purchase.license;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? AbstractC11309e.vip(0, 0, 67, str2, "\\^`{|}") : null);
            }
        }
        String str3 = (String) purchase.startapp;
        purchase.startapp = str3 != null ? AbstractC11309e.vip(0, 0, 35, str3, " \"#<>\\^`{|}") : null;
        String c14052e = purchase.toString();
        try {
            return new URI(c14052e);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(c14052e).replaceAll(BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }
}
