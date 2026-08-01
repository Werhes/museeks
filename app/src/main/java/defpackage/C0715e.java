package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۧؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0715e {
    public final void ad(InterfaceC16665e interfaceC16665e, int i, String str, Object... objArr) {
        int min;
        int m2467class = AbstractC8703e.m2467class(i);
        LinkedHashMap linkedHashMap = AbstractC12479e.ad;
        String admob = (str == null || AbstractC5304e.m1866native(str)) ? null : AbstractC17861e.admob("[", interfaceC16665e.getName(), "] ", str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        if (admob == null || admob.length() == 0) {
            admob = BuildConfig.FLAVOR;
        } else if (copyOf.length != 0) {
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            Locale locale = Locale.US;
            Object[] copyOf3 = Arrays.copyOf(copyOf2, copyOf2.length);
            admob = String.format(locale, admob, Arrays.copyOf(copyOf3, copyOf3.length));
        }
        if (admob.length() < 4000) {
            if (m2467class <= 1) {
                Log.v("REALM", admob);
                return;
            }
            if (m2467class == 2) {
                Log.d("REALM", admob);
                return;
            } else if (m2467class == 6) {
                Log.wtf("REALM", admob);
                return;
            } else {
                Log.println(m2467class, "REALM", admob);
                return;
            }
        }
        int length = admob.length();
        int i2 = 0;
        while (i2 < length) {
            int m1865interface = AbstractC5304e.m1865interface(admob, '\n', i2, 4);
            if (m1865interface == -1) {
                m1865interface = length;
            }
            while (true) {
                min = Math.min(m1865interface, i2 + 4000);
                String substring = admob.substring(i2, min);
                if (m2467class <= 1) {
                    Log.v("REALM", substring);
                } else if (m2467class == 2) {
                    Log.d("REALM", substring);
                } else if (m2467class == 6) {
                    Log.wtf("REALM", substring);
                } else {
                    Log.println(m2467class, "REALM", substring);
                }
                if (min >= m1865interface) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }
}
