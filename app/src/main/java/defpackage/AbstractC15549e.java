package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15549e {
    public static final C17991e ad = C17991e.vip;
    public static final Object vip = new Object();
    public static C0781e metrica = null;
    public static String license = "0";

    public static boolean ad() {
        C0781e c0781e;
        synchronized (vip) {
            c0781e = metrica;
        }
        return c0781e != null;
    }

    public static void vip(Context context) {
        synchronized (vip) {
            try {
                if (ad()) {
                    return;
                }
                AbstractC9528e.adcel(context, "Context must not be null");
                ClassLoader classLoader = AbstractC15549e.class.getClassLoader();
                AbstractC9528e.startapp(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    C17991e c17991e = ad;
                    c17991e.getClass();
                    C17991e.license(context);
                    try {
                        C0781e metrica2 = C0781e.metrica(context, C0781e.vip, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> loadClass = metrica2.ad.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (loadClass.getClassLoader() == AbstractC15549e.class.getClassLoader()) {
                                Log.e("eٕٙٚ", "ImplVersion class is missing from Cronet module.");
                                throw new Exception();
                            }
                            Method method = loadClass.getMethod("getApiLevel", null);
                            Method method2 = loadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) method.invoke(null, null);
                            AbstractC9528e.startapp(num);
                            int intValue = num.intValue();
                            String str = (String) method2.invoke(null, null);
                            AbstractC9528e.startapp(str);
                            license = str;
                            if (apiLevel <= intValue) {
                                metrica = metrica2;
                                return;
                            }
                            if (c17991e.vip(2, context, "cr") == null) {
                                Log.e("eٕٙٚ", "Unable to fetch error resolution intent");
                                throw new Exception();
                            }
                            String str2 = license;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(intValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str2);
                            throw new Exception(sb.toString());
                        } catch (Exception e) {
                            Log.e("eٕٙٚ", "Unable to read Cronet version from the Cronet module ", e);
                            throw ((C17481e) new Exception().initCause(e));
                        }
                    } catch (C15674e e2) {
                        Log.e("eٕٙٚ", "Unable to load Cronet module", e2);
                        throw ((C17481e) new Exception().initCause(e2));
                    }
                } catch (ClassNotFoundException e3) {
                    Log.e("eٕٙٚ", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C17481e) new Exception().initCause(e3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
