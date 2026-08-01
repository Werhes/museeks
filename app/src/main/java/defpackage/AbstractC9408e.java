package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9408e {
    public static final C2892e ad = new C2892e(1041009517, false, new C16015e(21));
    public static final C2892e vip = new C2892e(255011627, false, new C16015e(22));
    public static final C2892e metrica = new C2892e(-123507161, false, new C2916e(16));
    public static final C2892e license = new C2892e(-516506106, false, new C2916e(17));
    public static final C2892e appmetrica = new C2892e(-909505051, false, new C2916e(18));
    public static final C2892e purchase = new C2892e(254579469, false, new C2916e(19));
    public static final C2892e billing = new C2892e(1906028038, false, new C2916e(20));
    public static final C2892e yandex = new C2892e(91441282, false, new C2916e(21));
    public static final C2892e startapp = new C2892e(-1199597537, false, new C2916e(22));
    public static final C2892e adcel = new C2892e(-1763946883, false, new C2916e(14));
    public static final C2892e mopub = new C2892e(1864175194, false, new C2916e(15));
    public static final String[] advert = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] smaato = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static C17613e ad(AbstractC2003e abstractC2003e) {
        if (abstractC2003e instanceof C11771e) {
            C11771e c11771e = (C11771e) abstractC2003e;
            return new C17613e(c11771e.vip.concat(c11771e.metrica));
        }
        if (!(abstractC2003e instanceof C13769e)) {
            throw new C14803e(10);
        }
        C13769e c13769e = (C13769e) abstractC2003e;
        return new C17613e(AbstractC0869e.tapsense('#', c13769e.vip, c13769e.metrica));
    }

    public static final Exception metrica(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                try {
                    Parcel obtain = Parcel.obtain();
                    Process.myUserHandle().writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    i = obtain.readInt();
                } catch (Throwable unused) {
                    Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                    i = 0;
                }
                z = AbstractC7890e.billing((String) method.invoke(null, "sys.user." + i + ".ce_available", "false"), "true");
            } catch (Throwable th) {
                AbstractC13362e.license(fileNotFoundException, th);
                z = false;
            }
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new Cclass(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final String vip(C13770e c13770e, int i) {
        c13770e.adcel(AbstractC2676e.ad);
        return ((Resources) c13770e.adcel(AbstractC2676e.metrica)).getString(i);
    }
}
