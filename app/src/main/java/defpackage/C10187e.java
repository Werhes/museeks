package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10187e implements InterfaceC14706e {
    public static final Locale[] metrica = new Locale[0];
    public final Locale[] ad;
    public final String vip;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C6473e c6473e = C6473e.vip;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public C10187e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.ad = metrica;
            this.vip = BuildConfig.FLAVOR;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(AbstractC1634e.smaato("list[", i, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.ad = (Locale[]) arrayList.toArray(new Locale[0]);
        this.vip = sb.toString();
    }

    @Override // defpackage.InterfaceC14706e
    public final String ad() {
        return this.vip;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10187e)) {
            return false;
        }
        Locale[] localeArr = ((C10187e) obj).ad;
        Locale[] localeArr2 = this.ad;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC14706e
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.ad;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.ad) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // defpackage.InterfaceC14706e
    public final boolean isEmpty() {
        return this.ad.length == 0;
    }

    @Override // defpackage.InterfaceC14706e
    public final int size() {
        return this.ad.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.ad;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC14706e
    public final Object vip() {
        return null;
    }
}
