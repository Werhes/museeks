package defpackage;

import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11629e implements InterfaceC7351e {
    public final String ad;

    public C11629e(String str) {
        this.ad = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC14232e
    public final C12469e ad() {
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11629e) {
            return AbstractC7890e.billing(this.ad, ((C11629e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("ConstantFormatStructure("), this.ad, ')');
    }

    @Override // defpackage.InterfaceC14232e
    public final C6195e vip() {
        List metrica;
        String str;
        String str2 = this.ad;
        int length = str2.length();
        C13664e c13664e = C13664e.f27089e;
        if (length == 0) {
            metrica = c13664e;
        } else {
            C1169e license = AbstractC6874e.license();
            boolean subscription = AbstractC11613e.subscription(str2.charAt(0));
            String str3 = BuildConfig.FLAVOR;
            if (subscription) {
                int length2 = str2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        str = str2;
                        break;
                    }
                    if (!AbstractC11613e.subscription(str2.charAt(i))) {
                        str = str2.substring(0, i);
                        break;
                    }
                    i++;
                }
                license.add(new C13259e(Collections.singletonList(new C2618e(str))));
                int length3 = str2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        str2 = BuildConfig.FLAVOR;
                        break;
                    }
                    if (!AbstractC11613e.subscription(str2.charAt(i2))) {
                        str2 = str2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (str2.length() > 0) {
                if (AbstractC11613e.subscription(str2.charAt(str2.length() - 1))) {
                    int crashlytics = AbstractC5304e.crashlytics(str2);
                    while (true) {
                        if (-1 >= crashlytics) {
                            break;
                        }
                        if (!AbstractC11613e.subscription(str2.charAt(crashlytics))) {
                            str3 = str2.substring(0, crashlytics + 1);
                            break;
                        }
                        crashlytics--;
                    }
                    license.add(new C6162e(str3));
                    int crashlytics2 = AbstractC5304e.crashlytics(str2);
                    while (true) {
                        if (-1 >= crashlytics2) {
                            break;
                        }
                        if (!AbstractC11613e.subscription(str2.charAt(crashlytics2))) {
                            str2 = str2.substring(crashlytics2 + 1);
                            break;
                        }
                        crashlytics2--;
                    }
                    license.add(new C13259e(Collections.singletonList(new C2618e(str2))));
                } else {
                    license.add(new C6162e(str2));
                }
            }
            metrica = AbstractC6874e.metrica(license);
        }
        return new C6195e(metrica, c13664e);
    }
}
