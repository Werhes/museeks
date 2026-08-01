package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9789e {
    public static final Pattern license = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String ad;
    public final String metrica;
    public final String vip;

    public C9789e(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !license.matcher(str3).matches()) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.ad = str3;
        this.vip = str;
        this.metrica = AbstractC4653e.isPro(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9789e)) {
            return false;
        }
        C9789e c9789e = (C9789e) obj;
        return this.ad.equals(c9789e.ad) && this.vip.equals(c9789e.vip);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.vip, this.ad});
    }
}
