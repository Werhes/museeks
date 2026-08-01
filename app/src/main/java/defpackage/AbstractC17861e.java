package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17861e {
    public static String Signature(String str, String str2) {
        return str + str2;
    }

    public static boolean ad(InterfaceC12424e interfaceC12424e, C17469e c17469e, C2362e c2362e) {
        Iterator it = ((LinkedHashSet) c2362e.f5914e).iterator();
        while (it.hasNext()) {
            ((AbstractC3677e) it.next()).getClass();
        }
        try {
            AbstractC8433e.metrica(interfaceC12424e, c17469e, c2362e);
            return true;
        } catch (C15735e | IllegalArgumentException e) {
            AbstractC9464e.startapp("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
            return false;
        }
    }

    public static C15274e adcel(C13770e c13770e) {
        C15274e c15274e = new C15274e();
        c13770e.m3682throws(c15274e);
        return c15274e;
    }

    public static String admob(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static /* synthetic */ String ads(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN";
    }

    public static String advert(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String amazon(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static void applovin(String str, String str2, String str3) {
        AbstractC2803e.smaato(str3, str + str2);
    }

    public static Set appmetrica(C16417e c16417e) {
        C11546e c11546e = ((C5327e) c16417e.ad()).vip;
        if (Build.VERSION.SDK_INT < 30) {
            c11546e.getClass();
            return C3295e.f7451e;
        }
        synchronized (c11546e.purchase) {
        }
        try {
            Set license = AbstractC5096e.license((CameraManager) c11546e.ad.get());
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + license);
            Set<Set> set = license;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(set2, 10));
                for (String str : set2) {
                    C5060e.ad(str);
                    arrayList2.add(new C5060e(str));
                }
                arrayList.add(AbstractC13480e.m3582e(arrayList2));
            }
            return AbstractC13480e.m3582e(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public static int billing(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static C8823e crashlytics(C15154e c15154e, long j, int i) {
        Map map;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (c15154e.f29995e.ad()) {
            throw new IllegalStateException(("Cannot call unlock3A on " + c15154e + " after close.").toString());
        }
        C11087e c11087e = c15154e.f29992e;
        Long l = new Long(j2);
        C8823e c8823e = C11087e.loadAd;
        C9823e c9823e = c11087e.ad;
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e interfaceC2531e = c11087e.vip;
        c6434e.getClass();
        Boolean bool4 = !C6434e.ad(interfaceC2531e) ? null : bool;
        if (!AbstractC7890e.billing(bool2, bool) && !AbstractC7890e.billing(bool4, bool) && !AbstractC7890e.billing(bool3, bool)) {
            return AbstractC16565e.ad(new C4405e(0, null));
        }
        if (c9823e.vip.purchase() == null) {
            return c8823e;
        }
        if (AbstractC7890e.billing(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!c9823e.appmetrica(C11087e.smaato)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return c8823e;
            }
            C13585e.vip(c11087e.metrica, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean billing = AbstractC7890e.billing(bool2, bool);
        boolean billing2 = AbstractC7890e.billing(bool4, bool);
        boolean billing3 = AbstractC7890e.billing(bool3, bool);
        if (billing || billing2 || billing3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (billing) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, C11087e.Signature);
            }
            if (billing2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, C11087e.admob);
            }
            if (billing3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, C11087e.subscription);
            }
            map = linkedHashMap;
        } else {
            map = C9139e.f18290e;
        }
        C3664e c3664e = new C3664e(new C12065e(1, map), 60, l);
        c11087e.license.appmetrica(c3664e);
        Boolean bool5 = AbstractC7890e.billing(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = AbstractC7890e.billing(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            C13585e.vip(c11087e.metrica, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        c9823e.purchase(c11087e.metrica.ad());
        return c3664e.f8244e;
    }

    public static InterfaceC1908e firebase(C15154e c15154e, C6510e c6510e, C2548e c2548e, C12332e c12332e, List list, List list2, List list3, int i) {
        C6510e c6510e2 = (i & 1) != 0 ? null : c6510e;
        C2548e c2548e2 = (i & 2) != 0 ? null : c2548e;
        C12332e c12332e2 = (i & 4) != 0 ? null : c12332e;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!c15154e.f29995e.ad()) {
            return C11087e.vip(c15154e.f29992e, c6510e2, c2548e2, c12332e2, null, list4, list5, list6, 8);
        }
        throw new IllegalStateException(("Cannot call update3A on " + c15154e + " after close.").toString());
    }

    public static /* synthetic */ void inmobi(Object obj) {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            AbstractC6418e.smaato((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    public static void isPro(String str, C8823e c8823e) {
        c8823e.m2503e(new Exception(str));
    }

    public static /* synthetic */ void isVip(C2935e c2935e) {
        if (c2935e instanceof AutoCloseable) {
            c2935e.close();
        } else {
            if (!(c2935e instanceof ExecutorService)) {
                throw new IllegalArgumentException();
            }
            AbstractC6418e.admob();
        }
    }

    public static InterfaceC2531e license(C16417e c16417e, String str) {
        return ((C5327e) c16417e.ad()).metrica.appmetrica(str);
    }

    public static String loadAd(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static ArrayList metrica(C16417e c16417e) {
        ArrayList arrayList;
        C11546e c11546e = ((C5327e) c16417e.ad()).vip;
        synchronized (c11546e.purchase) {
            arrayList = c11546e.billing;
        }
        if (arrayList == null) {
            arrayList = c11546e.license();
        }
        if (arrayList == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) C10644e.ad("CXCP-Camera2")));
        }
        return arrayList;
    }

    public static Object mopub(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static /* synthetic */ String premium(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "CREATED" : "CREATING" : "PENDING";
    }

    public static StringBuilder pro(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static Object purchase(C15154e c15154e, List list, List list2, List list3, C12236e c12236e, C12236e c12236e2, C12236e c12236e3, C6510e c6510e, AbstractC8599e abstractC8599e, long j, long j2, AbstractC10731e abstractC10731e, int i) {
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        C6510e c6510e2 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : c6510e;
        AbstractC8599e abstractC8599e2 = (i & 1024) != 0 ? null : abstractC8599e;
        if (!c15154e.f29995e.ad()) {
            return c15154e.f29992e.ad(list4, list5, list6, c12236e, c12236e2, c12236e3, c6510e2, abstractC8599e2, 60, new Long(j), new Long(j2), abstractC10731e);
        }
        throw new IllegalStateException(("Cannot call lock3A on " + c15154e + " after close.").toString());
    }

    public static String remoteconfig(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder signatures(String str, InterfaceC10269e interfaceC10269e, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(interfaceC10269e);
        sb.append(str2);
        return sb;
    }

    public static String smaato(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static int startapp(Catalog2Layout catalog2Layout, int i, int i2) {
        return (catalog2Layout.hashCode() + i) * i2;
    }

    public static /* synthetic */ String subs(int i) {
        switch (i) {
            case 1:
                return "APP_CLOSED";
            case 2:
                return "APP_DISCONNECTED";
            case 3:
                return "CAMERA2_CLOSED";
            case 4:
                return "CAMERA2_DISCONNECTED";
            case 5:
                return "CAMERA2_ERROR";
            case 6:
                return "CAMERA2_EXCEPTION";
            default:
                return "null";
        }
    }

    public static String subscription(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder tapsense(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static final boolean vip(int i) {
        return i == 6 || i == 4;
    }

    public static int yandex(LinkedHashMap linkedHashMap, int i, int i2) {
        return (linkedHashMap.hashCode() + i) * i2;
    }
}
