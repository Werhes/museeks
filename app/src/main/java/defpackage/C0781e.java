package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0781e {
    public static Boolean adcel = null;
    public static C11525e amazon = null;
    public static final C14595e appmetrica;
    public static String billing = null;
    public static final C10215e license;
    public static C12818e loadAd = null;
    public static final C0136e metrica;
    public static Boolean purchase = null;
    public static int startapp = -1;
    public static final C6607e vip;
    public static boolean yandex;
    public final Context ad;
    public static final ThreadLocal mopub = new ThreadLocal();
    public static final C6121e advert = new C6121e(13);
    public static final C16728e smaato = new C16728e(21);

    static {
        int i = 22;
        vip = new C6607e(i);
        metrica = new C0136e(i);
        int i2 = 23;
        license = new C10215e(i2);
        appmetrica = new C14595e(i2);
    }

    public C0781e(Context context) {
        this.ad = context;
    }

    public static int ad(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC5729e.vip(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static boolean appmetrica(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(adcel)) {
            return true;
        }
        boolean z = false;
        if (adcel == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (C17991e.vip.metrica(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            adcel = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                yandex = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٖ٘ؔ] */
    public static void billing(ClassLoader classLoader) {
        try {
            C12818e c12818e = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c12818e = queryLocalInterface instanceof C12818e ? (C12818e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            loadAd = c12818e;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018e, code lost:
    
        if (r4 != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int license(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0781e.license(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0315 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0324 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031b A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r15v0, types: [eْۖۧ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؙؑۡ, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C0781e metrica(android.content.Context r29, defpackage.InterfaceC11232e r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0781e.metrica(android.content.Context, eُۙٗ, java.lang.String):eؒؒ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int purchase(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0781e.purchase(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C11525e yandex(Context context) {
        C11525e c11525e;
        synchronized (C0781e.class) {
            C11525e c11525e2 = amazon;
            if (c11525e2 != null) {
                return c11525e2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c11525e = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c11525e = queryLocalInterface instanceof C11525e ? (C11525e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (c11525e != 0) {
                    amazon = c11525e;
                    return c11525e;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder vip(String str) {
        try {
            return (IBinder) this.ad.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
