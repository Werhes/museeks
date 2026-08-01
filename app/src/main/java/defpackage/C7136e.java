package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7136e {
    public static final C7136e ad = new Object();

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, eًِٖ] */
    public static ArrayList ad(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = C13664e.f27089e;
        }
        ArrayList firebase = AbstractC13480e.firebase(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = firebase.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            ?? obj = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            obj.ad = str2;
            obj.vip = runningAppProcessInfo.pid;
            byte b = (byte) (obj.appmetrica | 1);
            obj.metrica = runningAppProcessInfo.importance;
            obj.appmetrica = (byte) (b | 2);
            obj.license = AbstractC7890e.billing(str2, str);
            obj.appmetrica = (byte) (obj.appmetrica | 4);
            arrayList2.add(obj.ad());
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, eًِٖ] */
    public final AbstractC0235e vip(Context context) {
        Object obj;
        String str;
        int myPid = Process.myPid();
        Iterator it = ad(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C3116e) ((AbstractC0235e) obj)).vip == myPid) {
                break;
            }
        }
        AbstractC0235e abstractC0235e = (AbstractC0235e) obj;
        if (abstractC0235e != null) {
            return abstractC0235e;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            str = Process.myProcessName();
        } else if (i < 28 || (str = Application.getProcessName()) == null) {
            str = BuildConfig.FLAVOR;
        }
        int i2 = (12 & 4) != 0 ? 0 : 0;
        ?? obj2 = new Object();
        obj2.ad = str;
        obj2.vip = myPid;
        byte b = (byte) (obj2.appmetrica | 1);
        obj2.metrica = i2;
        obj2.license = false;
        obj2.appmetrica = (byte) (((byte) (b | 2)) | 4);
        return obj2.ad();
    }
}
