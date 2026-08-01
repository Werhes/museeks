package defpackage;

import android.content.BroadcastReceiver;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Build;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6959e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static SharedPreferences f14257e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2443e f14258e = new C2443e("NO_VALUE", 2);

    public static final boolean adcel(float f, float f2, C17985e c17985e) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        C17985e ad = AbstractC11972e.ad();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            AbstractC11972e.metrica("Invalid rectangle, make sure no value is NaN");
        }
        if (ad.vip == null) {
            ad.vip = new RectF();
        }
        ad.vip.set(f3, f4, f5, f6);
        ad.ad.addRect(ad.vip, AbstractC11972e.vip(1));
        C17985e ad2 = AbstractC11972e.ad();
        ad2.billing(c17985e, ad, 1);
        boolean isEmpty = ad2.ad.isEmpty();
        ad2.yandex();
        ad.yandex();
        return !isEmpty;
    }

    public static final void appmetrica(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final InterfaceC1108e billing(InterfaceC2023e interfaceC2023e, InterfaceC8850e interfaceC8850e, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? interfaceC2023e : new AbstractC3053e(i, i2, interfaceC8850e, interfaceC2023e);
    }

    public static final Object license(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static /* synthetic */ C5981e metrica(int i, int i2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return vip(i4, i, i2);
    }

    public static final boolean mopub(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static void purchase() {
        String string;
        if (Build.VERSION.SDK_INT < 29 || !f14257e.getBoolean("enabled", true) || startapp() == AbstractC15933e.appmetrica.metrica) {
            return;
        }
        if (startapp()) {
            SharedPreferences sharedPreferences = f14257e;
            string = sharedPreferences.getString("dark_theme", sharedPreferences.getString("default_dark_theme", null));
        } else {
            string = f14257e.getString("light_theme", C17094e.appmetrica.vip);
        }
        Iterator it = AbstractC15933e.license.iterator();
        while (it.hasNext()) {
            C17094e c17094e = (C17094e) it.next();
            if (Objects.equals(string, c17094e.vip)) {
                AbstractC15933e.vip(c17094e, null, false);
            }
        }
        for (C17094e c17094e2 : AbstractC15933e.purchase) {
            if (Objects.equals(string, c17094e2.vip)) {
                AbstractC15933e.vip(c17094e2, null, false);
            }
        }
        C17094e c17094e3 = C17094e.appmetrica;
        if (Objects.equals(c17094e3.vip, string)) {
            AbstractC15933e.vip(c17094e3, null, false);
        }
    }

    public static boolean startapp() {
        return Build.VERSION.SDK_INT >= 29 && (AbstractC10532e.ad.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final C5981e vip(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(AbstractC10257e.applovin(i3)).toString());
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new C5981e(i, i4, i3);
    }

    public static final void yandex(BroadcastReceiver broadcastReceiver, InterfaceC8850e interfaceC8850e, Function2 function2) {
        if (AbstractC3273e.ad.get()) {
            throw new IllegalStateException("goAsync must never be called when the AsyncRequestWorker is meant to be used");
        }
        C14826e ad = AbstractC9743e.ad(interfaceC8850e);
        AbstractC5336e.purchase(ad, null, 0, new C14869e(ad, broadcastReceiver.goAsync(), function2, (InterfaceC5083e) null), 3);
    }
}
