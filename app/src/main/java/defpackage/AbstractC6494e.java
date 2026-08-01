package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Scanner;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6494e {
    public static final char[] ad = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] vip = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C7726e metrica = new C7726e(1);
    public static final C16306e license = new Object();

    public static String Signature(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return advert(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return BuildConfig.FLAVOR;
        }
    }

    public static final C0763e ad(C7589e c7589e, C0404e c0404e) {
        long mo210native;
        if (c0404e == null) {
            return null;
        }
        List vip2 = c7589e.vip();
        int size = vip2.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC7890e.billing(((C16223e) vip2.get(i)).f31875e, c0404e)) {
                if (!c0404e.f27016e) {
                    return null;
                }
                if (!c0404e.f2446e) {
                    return c0404e.f2445e;
                }
                mo210native = c0404e.m339e().mo210native(AbstractC5851e.adcel(c0404e), 0L, (r4 & 4) != 0);
                return AbstractC18489e.billing(mo210native, AbstractC8116e.startapp(AbstractC5851e.adcel(c0404e).f6803e));
            }
        }
        return null;
    }

    public static int adcel(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String admob(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : BuildConfig.FLAVOR;
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String advert(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = ad;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean amazon() {
        boolean smaato = smaato();
        String str = Build.TAGS;
        if ((smaato || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !smaato && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static final void appmetrica(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
    }

    public static void billing(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static final void license(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
    }

    public static final InterfaceC8850e loadAd(InterfaceC18435e interfaceC18435e, InterfaceC8850e interfaceC8850e) {
        InterfaceC8850e yandex = yandex(interfaceC18435e.advert(), interfaceC8850e, true);
        C15420e c15420e = AbstractC6731e.ad;
        return (yandex == c15420e || yandex.mo397public(C12575e.f25235e) != null) ? yandex : yandex.mo394const(c15420e);
    }

    public static synchronized long metrica(Context context) {
        long j;
        synchronized (AbstractC6494e.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        }
        return j;
    }

    public static final C0763e mopub(C11106e c11106e) {
        return AbstractC18489e.billing(C2152e.startapp(((C2152e) ((C0576e) c11106e.f22007e).getValue()).ad, ((C2152e) ((C0576e) c11106e.f22009e).getValue()).ad), ((C2108e) ((C0576e) c11106e.f22008e).getValue()).ad);
    }

    public static final void purchase(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            pro.append(i3);
            throw new IndexOutOfBoundsException(pro.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int remoteconfig(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static boolean smaato() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int startapp() {
        boolean smaato = smaato();
        ?? r0 = smaato;
        if (amazon()) {
            r0 = (smaato ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static final C13514e subscription(InterfaceC5083e interfaceC5083e, InterfaceC8850e interfaceC8850e, Object obj) {
        C13514e c13514e = null;
        if ((interfaceC5083e instanceof InterfaceC18430e) && interfaceC8850e.mo397public(C6924e.f14185e) != null) {
            InterfaceC18430e interfaceC18430e = (InterfaceC18430e) interfaceC5083e;
            while (true) {
                if ((interfaceC18430e instanceof C7773e) || (interfaceC18430e = interfaceC18430e.vip()) == null) {
                    break;
                }
                if (interfaceC18430e instanceof C13514e) {
                    c13514e = (C13514e) interfaceC18430e;
                    break;
                }
            }
            if (c13514e != null) {
                c13514e.m3613e(interfaceC8850e, obj);
            }
        }
        return c13514e;
    }

    public static final void vip(C11106e c11106e, long j, long j2, long j3, boolean z) {
        C0576e c0576e = (C0576e) c11106e.f22007e;
        C0576e c0576e2 = (C0576e) c11106e.f22006e;
        C0576e c0576e3 = (C0576e) c11106e.f22008e;
        C0576e c0576e4 = (C0576e) c11106e.f22009e;
        if (!C2152e.vip(((C2152e) c0576e4.getValue()).ad, j3) || !C2108e.vip(((C2108e) c0576e3.getValue()).ad, j) || z) {
            c0576e3.setValue(new C2108e(j));
            c0576e4.setValue(new C2152e(j3));
            if (z) {
                AbstractC0054e.m220goto(C2152e.yandex(C2152e.yandex(j2, j3), C2152e.yandex(((C2152e) c0576e2.getValue()).ad, ((C2152e) c0576e.getValue()).ad)), c0576e);
            }
        }
        AbstractC0054e.m220goto(C2152e.yandex(j2, j3), c0576e2);
    }

    public static final InterfaceC8850e yandex(InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) interfaceC8850e.mo395e(bool, new C8436e((byte) 0, 5))).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC8850e2.mo395e(bool, new C8436e((byte) 0, 5))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC8850e.mo394const(interfaceC8850e2);
        }
        C8436e c8436e = new C8436e((byte) 0, 6);
        C2693e c2693e = C2693e.f6576e;
        InterfaceC8850e interfaceC8850e3 = (InterfaceC8850e) interfaceC8850e.mo395e(c2693e, c8436e);
        Object obj = interfaceC8850e2;
        if (booleanValue2) {
            obj = interfaceC8850e2.mo395e(c2693e, new C8436e((byte) 0, 7));
        }
        return interfaceC8850e3.mo394const((InterfaceC8850e) obj);
    }
}
