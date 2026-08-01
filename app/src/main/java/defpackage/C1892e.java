package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.util.Log;
import java.io.File;
import java.lang.Thread;
import java.security.Security;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.Conscrypt;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892e implements InterfaceC16294e {
    public static final C1892e ad = new Object();

    @Override // defpackage.InterfaceC16294e
    public final void ad(Context context) {
        Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
        Security.insertProviderAt(Conscrypt.newProvider(), 2);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = (VKXApplication) context;
        VKXApplication.f36528e = vKXApplication;
        VKXApplication.f36537e = (ConnectivityManager) vKXApplication.getApplicationContext().getSystemService("connectivity");
        System.loadLibrary("vkx");
        C7546e c7546e = C11102e.ad;
        Context applicationContext = vKXApplication.getApplicationContext();
        File externalFilesDir = vKXApplication.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = new File(vKXApplication.getApplicationContext().getFilesDir(), "OCBugReporting");
        }
        String packageName = vKXApplication.getApplicationContext().getPackageName();
        C11217e c11217e = EnumC17057e.f33397e;
        C7546e c7546e2 = new C7546e(packageName, 16);
        boolean z = C0002e.appmetrica.metrica(vKXApplication.getApplicationContext(), C17991e.ad) == 0;
        try {
            C11102e.ad = c7546e2;
            C11102e.vip = C11102e.ad(applicationContext, z);
            String str = C10675e.f21023e;
            C11102e.metrica = C10215e.license(externalFilesDir.toString(), false);
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: eُۣۚ
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C7546e c7546e3 = C11102e.ad;
                    C11102e.appmetrica(C11102e.metrica(thread, th, EnumC14764e.Crash, C9139e.f18290e));
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        } catch (Exception e) {
            Log.e("OcCrashReporting", "[VK X] Crash reporting install failure: " + e.getMessage());
            e.printStackTrace();
        }
        C11102e.license.add(new Object());
        Context applicationContext2 = vKXApplication.getApplicationContext();
        AbstractC16082e.license = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
        AbstractC16082e.appmetrica = vKXApplication.getApplicationContext().getSharedPreferences("user", 0);
        vKXApplication.getApplicationContext().getSharedPreferences("op_widgets", 0);
        vKXApplication.getApplicationContext().getSharedPreferences("op_proxy", 0);
        AbstractC16082e.purchase = vKXApplication.getApplicationContext().getSharedPreferences("op_fallback", 0);
        AbstractC9357e.billing = vKXApplication.getApplicationContext().getSharedPreferences("op_prefs", 0);
        C8063e c8063e = AbstractC9797e.ad;
        if (!((Boolean) c8063e.ad()).booleanValue()) {
            SharedPreferences sharedPreferences = AbstractC16082e.license;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            Object it = ((C13653e) AbstractC9797e.vip.entrySet()).iterator();
            while (((AbstractC3757e) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C11697e) it).next();
                if (sharedPreferences.contains((String) entry.getKey())) {
                    ((AbstractC13518e) entry.getValue()).vip(Boolean.valueOf(sharedPreferences.getBoolean((String) entry.getKey(), false)));
                }
            }
            c8063e.vip(Boolean.TRUE);
        }
        VKXApplication.Companion companion2 = VKXApplication.f36531e;
        VKXApplication.f36535e = new C11328e(context, 2);
        SharedPreferences sharedPreferences2 = AbstractC16082e.license;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        if (sharedPreferences2.getLong("oc_resets_in", 0L) <= System.currentTimeMillis()) {
            C7546e c7546e3 = C11102e.ad;
            try {
                C10675e c10675e = C11102e.metrica;
                if (c10675e != null) {
                    C18511e c18511e = AbstractC11062e.f21949e;
                    c18511e.Signature(c10675e);
                    c18511e.purchase(c10675e);
                }
            } catch (Throwable unused) {
            }
            SharedPreferences sharedPreferences3 = AbstractC16082e.license;
            SharedPreferences.Editor edit = (sharedPreferences3 != null ? sharedPreferences3 : null).edit();
            long currentTimeMillis = System.currentTimeMillis();
            C17647e c17647e = C14157e.f27993e;
            edit.putLong("oc_resets_in", C14157e.license(AbstractC0326e.Signature(7, EnumC15934e.DAYS)) + currentTimeMillis).apply();
        }
    }
}
