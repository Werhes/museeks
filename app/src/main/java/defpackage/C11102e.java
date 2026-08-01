package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11102e {
    public static C10675e metrica;
    public static C7546e ad = new C7546e(null, 31);
    public static C11333e vip = new C11333e(0, false, null, null, null, null, 8191);
    public static final ArrayList license = new ArrayList();

    public static C11333e ad(Context context, boolean z) {
        EnumC3531e enumC3531e;
        String str = Build.PRODUCT;
        String str2 = Build.DEVICE;
        String str3 = Build.BOARD;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.BRAND;
        String str6 = Build.MODEL;
        String valueOf = String.valueOf(AbstractC2224e.metrica() ? AbstractC2224e.license : 0);
        String valueOf2 = String.valueOf(AbstractC2224e.metrica() ? AbstractC2224e.appmetrica : 0.0f);
        String ad2 = AbstractC2224e.ad("ro.miui.ui.version.name");
        String ad3 = AbstractC2224e.ad("ro.build.version.incremental");
        String ad4 = AbstractC2224e.ad("ro.build.version.emui");
        String ad5 = AbstractC2224e.ad("ro.miui.ui.version.code");
        if (AbstractC2224e.metrica()) {
            enumC3531e = EnumC3531e.SamsungOneUI;
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.miui.system", 0);
            } catch (Exception unused) {
                if (!AbstractC2224e.vip(context, new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT")) && !AbstractC2224e.vip(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"))) && !AbstractC2224e.vip(context, new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").addCategory("android.intent.category.DEFAULT")) && !AbstractC2224e.vip(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings")))) {
                    enumC3531e = !TextUtils.isEmpty(AbstractC2224e.ad("ro.build.hw_emui_api_level")) ? EnumC3531e.EMUI : (TextUtils.isEmpty(AbstractC2224e.ad("ro.build.ro.meizu.rom.config")) && TextUtils.isEmpty(AbstractC2224e.ad("persist.sys.static_blur_mode")) && TextUtils.isEmpty(AbstractC2224e.ad("persist.sys.use.flyme.icon"))) ? (TextUtils.isEmpty(AbstractC2224e.ad("ro.vivo.os.version")) && TextUtils.isEmpty(AbstractC2224e.ad("ro.vivo.rom")) && TextUtils.isEmpty(AbstractC2224e.ad("ro.vivo.rom.version")) && TextUtils.isEmpty(AbstractC2224e.ad("ro.vivo.build.version.sdk"))) ? !TextUtils.isEmpty(AbstractC2224e.ad("ro.config.knox")) ? EnumC3531e.SamsungKnox : !TextUtils.isEmpty(AbstractC2224e.ad("ro.asus.ui")) ? EnumC3531e.ZenUI : EnumC3531e.StockOrUnknown : EnumC3531e.Vivo : EnumC3531e.Flyme;
                }
            }
            enumC3531e = EnumC3531e.MIUI;
        }
        EnumC3531e enumC3531e2 = enumC3531e;
        String str7 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        String str8 = Build.BOARD;
        String str9 = Build.MODEL;
        String str10 = Build.DEVICE;
        String str11 = Build.MANUFACTURER;
        String str12 = Build.BRAND;
        EnumC3531e enumC3531e3 = EnumC3531e.MIUI;
        C0193e c0193e = C0193e.f1409e;
        return new C11333e(i, z, enumC3531e2, enumC3531e2 == enumC3531e3 ? new C18099e(ad2, ad5, ad3, c0193e) : null, enumC3531e2 == EnumC3531e.EMUI ? new C17832e(c0193e, ad4) : null, enumC3531e2 == EnumC3531e.SamsungOneUI ? new C14632e(valueOf, valueOf2, c0193e) : null, 4096);
    }

    public static void appmetrica(C9481e c9481e) {
        String str;
        C10675e c10675e = metrica;
        if (c10675e == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(c9481e.f18826e);
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11))}, 1)) + '-' + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1)) + '-' + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(13))}, 1));
        int ordinal = c9481e.f18821e.ordinal();
        if (ordinal == 0) {
            str = "Crash";
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            str = "NonCritical";
        }
        C18511e c18511e = AbstractC11062e.f21949e;
        c18511e.purchase(c10675e);
        C9674e c9674e = new C9674e(new C16741e((C4122e) c18511e.mo1914break(c10675e.appmetrica("OcBugReport-" + str + '-' + str2 + ".obr"), false)));
        try {
            c9481e.f15553e.appmetrica(c9674e, c9481e);
            Unit unit = Unit.INSTANCE;
            c9674e.close();
        } finally {
        }
    }

    public static ArrayList billing(StackTraceElement[] stackTraceElementArr) {
        C15947e c15947e;
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement.isNativeMethod()) {
                c15947e = new C15947e(stackTraceElement.getClassName(), (String) null, 0, (String) null, stackTraceElement.isNativeMethod(), false, 110);
            } else {
                String className = stackTraceElement.getClassName();
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = BuildConfig.FLAVOR;
                }
                c15947e = new C15947e(className, fileName, stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), stackTraceElement.isNativeMethod(), stackTraceElement.getFileName() == null, 64);
            }
            arrayList.add(c15947e);
        }
        return arrayList;
    }

    public static void license(Throwable th, Map map) {
        appmetrica(metrica(Thread.currentThread(), th, EnumC14764e.NonCritical, map));
        Iterator it = license.iterator();
        while (it.hasNext()) {
            ((C6745e) it.next()).getClass();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C2289e c2289e = (C2289e) C14679e.metrica().vip(C2289e.class);
                if (c2289e == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                String admob = AbstractC17861e.admob("[Pre-Report] ", str, " = ", str2);
                C8598e c8598e = c2289e.ad;
                ((ExecutorC4614e) c8598e.loadAd.f25751e).ad(new RunnableC3883e(c8598e, System.currentTimeMillis() - c8598e.license, admob, 0));
            }
            C2289e c2289e2 = (C2289e) C14679e.metrica().vip(C2289e.class);
            if (c2289e2 == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            C8598e c8598e2 = c2289e2.ad;
            Map map2 = Collections.EMPTY_MAP;
            ((ExecutorC4614e) c8598e2.loadAd.f25751e).ad(new RunnableC16019e(c8598e2, th));
        }
    }

    public static C9481e metrica(Thread thread, Throwable th, EnumC14764e enumC14764e, Map map) {
        C2936e c2936e;
        long currentTimeMillis = System.currentTimeMillis();
        C7546e c7546e = ad;
        C11333e c11333e = vip;
        String name = thread.getName();
        C10046e vip2 = vip(th);
        Set<Thread> keySet = Thread.getAllStackTraces().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0193e c0193e = C0193e.f1409e;
            if (!hasNext) {
                return new C9481e(currentTimeMillis, enumC14764e, c7546e, c11333e, name, vip2, null, arrayList, map, c0193e);
            }
            Thread thread2 = (Thread) it.next();
            StackTraceElement[] stackTraceElementArr = Thread.getAllStackTraces().get(thread2);
            if (stackTraceElementArr != null) {
                c2936e = new C2936e(thread2.getName(), EnumC10900e.NEW, billing(stackTraceElementArr), c0193e);
            } else {
                c2936e = null;
            }
            if (c2936e != null) {
                arrayList.add(c2936e);
            }
        }
    }

    public static int purchase() {
        C10675e c10675e = metrica;
        if (c10675e != null) {
            AbstractC11062e.f21949e.getClass();
            ArrayList m4563catch = C18511e.m4563catch(c10675e, false);
            Integer valueOf = m4563catch != null ? Integer.valueOf(m4563catch.size()) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public static C10046e vip(Throwable th) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        String str = message;
        ArrayList billing = billing(th.getStackTrace());
        Throwable cause = th.getCause();
        C10046e vip2 = cause != null ? vip(cause) : null;
        Throwable[] suppressed = th.getSuppressed();
        ArrayList arrayList = new ArrayList(suppressed.length);
        for (Throwable th2 : suppressed) {
            arrayList.add(vip(th2));
        }
        return new C10046e(name, str, billing, arrayList, vip2, C0193e.f1409e);
    }
}
