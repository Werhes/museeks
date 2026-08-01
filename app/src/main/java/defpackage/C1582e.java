package defpackage;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582e {
    public static String metrica;
    public static ServiceConnectionC17738e purchase;
    public final NotificationManager ad;
    public static final Object vip = new Object();
    public static HashSet license = new HashSet();
    public static final Object appmetrica = new Object();

    public C1582e(Context context) {
        this.ad = (NotificationManager) context.getSystemService("notification");
    }

    public static Set ad(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (vip) {
            if (string != null) {
                try {
                    if (!string.equals(metrica)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        license = hashSet2;
                        metrica = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = license;
        }
        return hashSet;
    }
}
