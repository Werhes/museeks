package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.icu.text.DateFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.PixelCopy;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.inputmethod.EditorInfo;
import j$.util.stream.IntStream;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12026e {
    public static volatile AbstractC9621e ad;

    public static boolean Signature(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static void ad(Service service, boolean z) {
        service.stopForeground(z ? 1 : 2);
    }

    public static final void adcel(Context context, String str) {
        context.deleteSharedPreferences(str);
    }

    public static boolean admob(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:92)|(1:91)(1:26)|27|28|29|30|31|32|(1:34)(1:83)|35|(9:37|38|39|40|41|(2:42|(3:44|(3:60|61|62)(7:46|47|(2:49|(1:52))|53|(1:55)(1:59)|56|57)|58)(1:63))|64|65|66)(1:82)|67|14) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x007e, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r6 = defpackage.C1444e.f4274e;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.AbstractC9621e ads(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12026e.ads(android.content.Context):eٍٞؐ");
    }

    public static DecimalFormatSymbols advert(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static PointerIcon amazon(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static final C10407e applovin(C4510e c4510e, AbstractC10075e abstractC10075e, C11272e c11272e) {
        ServerSocketChannel serverSocketChannel;
        SelectorProvider selectorProvider = c4510e.f9781e;
        if (abstractC10075e instanceof C16123e) {
            serverSocketChannel = selectorProvider.openServerSocketChannel();
        } else {
            if (!(abstractC10075e instanceof C0380e)) {
                throw new C14803e(10);
            }
            serverSocketChannel = (ServerSocketChannel) SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        }
        try {
            if (abstractC10075e instanceof C16123e) {
                AbstractC0070e.ad(serverSocketChannel, c11272e);
            }
            boolean z = AbstractC0070e.ad;
            serverSocketChannel.configureBlocking(false);
            C10407e c10407e = new C10407e(serverSocketChannel, c4510e);
            ServerSocketChannel serverSocketChannel2 = c10407e.f20567e;
            if (AbstractC0070e.ad) {
                serverSocketChannel2.bind(abstractC10075e.purchase(), 511);
                return c10407e;
            }
            serverSocketChannel2.socket().bind(abstractC10075e.purchase(), 511);
            return c10407e;
        } catch (Throwable th) {
            serverSocketChannel.close();
            throw th;
        }
    }

    public static IntStream appmetrica(CharSequence charSequence) {
        return C2864e.adcel(charSequence);
    }

    public static Context billing(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static void inmobi(C2687e c2687e, C4622e c4622e) {
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c4622e, 10));
        Iterator it = c4622e.f9951e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0768e) it.next()).ad);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c2687e.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void isPro(Service service, int i) {
        service.stopForeground(i);
    }

    public static void isVip(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    public static final C5138e license(C9485e c9485e, C2107e c2107e, Map map) {
        LinkedHashMap linkedHashMap;
        C2012e c2012e;
        AbstractC7905e abstractC7905e;
        C12550e ad2;
        String str = c9485e.ad;
        LinkedHashMap linkedHashMap2 = c2107e.f5447e;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((C13653e) c2107e.f5443e.entrySet()).iterator();
        do {
            int i = 1;
            if (!it.hasNext()) {
                for (C12550e c12550e : c2107e.f5449e) {
                    ArrayList arrayList2 = c12550e.vip;
                    int i2 = c12550e.ad;
                    if (arrayList2.size() == i) {
                        Surface surface = (Surface) map.get(new C13269e(i2));
                        if (surface != null) {
                            linkedHashMap4.put(new C18319e(((C7662e) AbstractC13480e.m3590instanceof(arrayList2)).ad), surface);
                        }
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C7662e c7662e = (C7662e) it2.next();
                            Object obj = linkedHashMap2.get(c7662e);
                            if (obj == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            OutputConfiguration license = C12885e.license(linkedHashMap5.get((C12730e) obj));
                            Surface surface2 = license != null ? license.getSurface() : (Surface) map.get(new C13269e(i2));
                            if (surface2 != null) {
                                linkedHashMap4.put(new C18319e(c7662e.ad), surface2);
                                i = 1;
                            }
                        }
                    }
                }
                Iterator it3 = c2107e.f5444e.iterator();
                C2012e c2012e2 = null;
                while (it3.hasNext()) {
                    C12730e c12730e = (C12730e) it3.next();
                    ArrayList arrayList3 = c12730e.mopub;
                    ArrayList arrayList4 = c12730e.mopub;
                    Integer num = c12730e.appmetrica;
                    String str2 = c12730e.license;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it3;
                        ArrayList arrayList6 = arrayList4;
                        Surface surface3 = (Surface) map.get(new C13269e(((C12550e) it4.next()).ad));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        arrayList4 = arrayList6;
                        it3 = it5;
                    }
                    Iterator it6 = it3;
                    ArrayList arrayList7 = arrayList4;
                    OutputConfiguration license2 = C12885e.license(linkedHashMap5.get(c12730e));
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    if (license2 == null) {
                        if (c12730e.purchase != null) {
                            linkedHashMap = linkedHashMap4;
                            c2012e = c2012e2;
                            if (arrayList5.size() != arrayList3.size()) {
                                C2012e m2035e = C6114e.m2035e(null, null, c12730e.purchase, c12730e.billing, c12730e.yandex, c12730e.startapp, c12730e.vip, arrayList7.size() > 1, num != null ? num.intValue() : -1, !AbstractC7890e.billing(str2, str) ? str2 : null, 2);
                                if (m2035e == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + c12730e);
                                } else {
                                    arrayList.add(m2035e);
                                    Iterator it7 = arrayList3.iterator();
                                    while (it7.hasNext()) {
                                        linkedHashMap3.put(new C13269e(((C12550e) it7.next()).ad), m2035e);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            c2012e = c2012e2;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                Object next = it8.next();
                                if (!map.containsKey(new C13269e(((C12550e) next).ad))) {
                                    arrayList8.add(next);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + c12730e + "! Missing surfaces for " + arrayList8 + '!').toString());
                        }
                        C2012e m2035e2 = C6114e.m2035e((Surface) AbstractC13480e.m3591interface(arrayList5), null, null, c12730e.billing, c12730e.yandex, c12730e.startapp, c12730e.vip, arrayList7.size() > 1, num != null ? num.intValue() : -1, !AbstractC7890e.billing(str2, str) ? str2 : null, 6);
                        if (m2035e2 == null) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + c12730e);
                        } else {
                            Iterator it9 = AbstractC13480e.subs(1, arrayList5).iterator();
                            while (it9.hasNext()) {
                                m2035e2.ad((Surface) it9.next());
                            }
                            C2740e c2740e = c9485e.appmetrica;
                            if (c2740e != null) {
                                C12550e c12550e2 = (C12550e) c2107e.f5445e.get(c2740e);
                                if (c12550e2 == null) {
                                    throw new IllegalStateException("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                }
                                if (c2012e == null && arrayList3.contains(c12550e2)) {
                                    c2012e2 = m2035e2;
                                    it3 = it6;
                                    linkedHashMap5 = linkedHashMap6;
                                    linkedHashMap4 = linkedHashMap;
                                } else {
                                    arrayList.add(m2035e2);
                                }
                            } else {
                                arrayList.add(m2035e2);
                            }
                            it3 = it6;
                            linkedHashMap5 = linkedHashMap6;
                            linkedHashMap4 = linkedHashMap;
                            c2012e2 = c2012e;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList9 = new ArrayList();
                            Iterator it10 = arrayList3.iterator();
                            while (it10.hasNext()) {
                                Object next2 = it10.next();
                                if (!map.containsKey(new C13269e(((C12550e) next2).ad))) {
                                    arrayList9.add(next2);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + c12730e + "! Missing surfaces for " + arrayList9 + '!').toString());
                        }
                        arrayList.add(new C2012e(license2));
                        linkedHashMap = linkedHashMap4;
                        c2012e = c2012e2;
                    }
                    it3 = it6;
                    linkedHashMap5 = linkedHashMap6;
                    linkedHashMap4 = linkedHashMap;
                    c2012e2 = c2012e;
                }
                return new C5138e(arrayList, linkedHashMap3, c2012e2, linkedHashMap4);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i3 = ((C13269e) entry.getKey()).ad;
            abstractC7905e = (AbstractC7905e) entry.getValue();
            ad2 = c2107e.ad(i3);
            if (ad2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } while (ad2.vip.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException("Cannot configure multiple outputs pre-S!");
        }
        AbstractC3820e.ad.vip(AbstractC7953e.class);
        abstractC7905e.getClass();
        throw null;
    }

    public static String loadAd(long j) {
        if (Build.VERSION.SDK_INT < 24) {
            return DateUtils.formatDateTime(null, j, 8228);
        }
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC12206e.ad;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton.format(new Date(j));
    }

    public static boolean metrica(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static LocaleList mopub() {
        return LocaleList.getDefault();
    }

    public static byte pro(C0768e c0768e) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(c0768e.ad).getZeroDigit());
    }

    public static IntStream purchase(CharSequence charSequence) {
        return C11180e.adcel(charSequence);
    }

    public static void remoteconfig(SurfaceView surfaceView, Bitmap bitmap, PixelCopyOnPixelCopyFinishedListenerC16657e pixelCopyOnPixelCopyFinishedListenerC16657e, Handler handler) {
        PixelCopy.request(surfaceView, bitmap, pixelCopyOnPixelCopyFinishedListenerC16657e, handler);
    }

    public static void signatures(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static LocaleList smaato(Configuration configuration) {
        return configuration.getLocales();
    }

    public static LocaleList startapp(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static final void subscription(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }

    public static void tapsense(EditorInfo editorInfo, C4622e c4622e) {
        if (AbstractC7890e.billing(c4622e, C4622e.f9949e)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c4622e, 10));
        Iterator it = c4622e.f9951e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0768e) it.next()).ad);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public static final C1239e vip(Map map, C2107e c2107e) {
        C1239e c1239e = new C1239e();
        for (C12550e c12550e : c2107e.f5449e) {
            Surface surface = (Surface) map.get(new C13269e(c12550e.ad));
            if (surface != null) {
                Iterator it = c12550e.vip.iterator();
                while (it.hasNext()) {
                    c1239e.put(new C18319e(((C7662e) it.next()).ad), surface);
                }
            }
        }
        return c1239e.vip();
    }

    public static Context yandex(Context context) {
        return context.createDeviceProtectedStorageContext();
    }
}
