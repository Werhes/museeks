package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Trace;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5306e implements InterfaceC2560e, InterfaceC10625e, InterfaceC10283e, InterfaceC10647e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f11398e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f11399e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f11400e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f11401e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f11402e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11403e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f11404e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f11405e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C11176e f11397e = new C11176e(0);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final byte[] f11395e = {0, 7, 8, 15};

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final byte[] f11396e = {0, 119, -120, -1};

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final byte[] f11394e = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public C5306e() {
        this.f11403e = 3;
        this.f11399e = new Object();
        this.f11405e = C4065e.f9036e;
        this.f11400e = new HashMap();
        this.f11398e = new HashSet();
    }

    public C5306e(C4956e c4956e, C5306e c5306e, List list, String str, String str2) {
        Map linkedHashMap;
        this.f11403e = 4;
        this.f11400e = c4956e;
        this.f11399e = c5306e;
        this.f11402e = str;
        this.f11398e = str2;
        C6272e c6272e = (C6272e) ((C18277e) c4956e.f10517e).ad;
        this.f11405e = c6272e.metrica(new C9721e(this, 0));
        this.f11404e = c6272e.metrica(new C9721e(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = C9139e.f18290e;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                C8372e c8372e = (C8372e) it.next();
                linkedHashMap.put(Integer.valueOf(c8372e.f17133e), new C8184e((C4956e) this.f11400e, c8372e, i));
                i++;
            }
        }
        this.f11401e = linkedHashMap;
    }

    public /* synthetic */ C5306e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f11403e = i;
        this.f11400e = obj;
        this.f11399e = obj2;
        this.f11402e = obj3;
        this.f11398e = obj4;
        this.f11405e = obj5;
        this.f11404e = obj6;
        this.f11401e = obj7;
    }

    public C5306e(List list) {
        this.f11403e = 1;
        C1292e c1292e = new C1292e((byte[]) list.get(0));
        int m565goto = c1292e.m565goto();
        int m565goto2 = c1292e.m565goto();
        Paint paint = new Paint();
        this.f11400e = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f11399e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f11402e = new Canvas();
        this.f11398e = new C2756e(719, 575, 0, 719, 0, 575);
        this.f11405e = new C12863e(0, new int[]{0, -1, -16777216, -8421505}, smaato(), amazon());
        this.f11404e = new C5828e(m565goto, m565goto2);
    }

    public C5306e(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC7113e interfaceC7113e) {
        int i = 0;
        this.f11403e = 0;
        this.f11400e = new HashMap();
        this.f11399e = new HashMap();
        this.f11402e = new HashMap();
        this.f11398e = new HashSet();
        this.f11404e = new AtomicReference();
        C18395e c18395e = new C18395e(executor);
        this.f11405e = c18395e;
        this.f11401e = interfaceC7113e;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C7259e.metrica(c18395e, C18395e.class, InterfaceC13242e.class, InterfaceC7138e.class));
        arrayList3.add(C7259e.metrica(this, C5306e.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C7259e c7259e = (C7259e) it.next();
            if (c7259e != null) {
                arrayList3.add(c7259e);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC7970e) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((InterfaceC7113e) this.f11401e).ad(componentRegistrar));
                        it3.remove();
                    }
                } catch (C15658e e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C7259e) it4.next()).vip.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.f11398e).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.f11398e).add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (((HashMap) this.f11400e).isEmpty()) {
                AbstractC11912e.vip(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.f11400e).keySet());
                arrayList6.addAll(arrayList3);
                AbstractC11912e.vip(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C7259e c7259e2 = (C7259e) it5.next();
                ((HashMap) this.f11400e).put(c7259e2, new C6491e(new C12412e(this, c7259e2, i)));
            }
            arrayList5.addAll(applovin(arrayList3));
            arrayList5.addAll(ads());
            isPro();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f11404e).get();
        if (bool != null) {
            mopub((HashMap) this.f11400e, bool.booleanValue());
        }
    }

    public static int Signature(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int[] amazon() {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = Signature(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = Signature(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = Signature(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = Signature(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = Signature(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:11:0x0077, B:13:0x008a, B:15:0x0096, B:17:0x009a, B:22:0x00a8, B:23:0x00ab, B:61:0x00b1), top: B:10:0x0077, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1874e billing(defpackage.C5306e r17, defpackage.InterfaceC16400e r18, defpackage.C11725e r19, defpackage.C17469e r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5306e.billing(eؗۨ, eْٖٟ, eِْۨ, eؘ٘ؑ):eؓٗۦ");
    }

    /* renamed from: class, reason: not valid java name */
    public static final InterfaceC5052e m1884class(C5306e c5306e, C13212e c13212e, int i) {
        C4956e c4956e = (C4956e) c5306e.f11400e;
        C11709e vip = AbstractC17487e.vip((InterfaceC11824e) c4956e.f10513e, i);
        ArrayList admob = AbstractC7762e.admob(new C2167e(AbstractC7762e.advert(c13212e, new C9721e(c5306e, 2)), C15146e.f29951e));
        Iterator it = AbstractC7762e.advert(vip, C17509e.f34338e).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                AbstractC6874e.loadAd();
                throw null;
            }
        }
        while (admob.size() < i2) {
            admob.add(0);
        }
        return ((C11980e) ((C18277e) c4956e.f10517e).mopub).m3294default(vip, admob);
    }

    public static C6557e crashlytics(List list, InterfaceC2460e interfaceC2460e, InterfaceC5021e interfaceC5021e, InterfaceC15498e interfaceC15498e) {
        C6557e amazon;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C15462e) it.next()).getClass();
            if (interfaceC2460e.isEmpty()) {
                C6557e.f13492e.getClass();
                amazon = C6557e.f13491e;
            } else {
                C10312e c10312e = C6557e.f13492e;
                List singletonList = Collections.singletonList(new C11720e(interfaceC2460e));
                c10312e.getClass();
                amazon = C10312e.amazon(singletonList);
            }
            arrayList.add(amazon);
        }
        ArrayList remoteconfig = AbstractC0746e.remoteconfig(arrayList);
        C6557e.f13492e.getClass();
        return C10312e.amazon(remoteconfig);
    }

    public static C5325e isVip(C2125e c2125e) {
        byte[] bArr;
        int billing = c2125e.billing(16);
        c2125e.loadAd(4);
        int billing2 = c2125e.billing(2);
        boolean purchase = c2125e.purchase();
        c2125e.loadAd(1);
        byte[] bArr2 = AbstractC9413e.vip;
        if (billing2 == 1) {
            c2125e.loadAd(c2125e.billing(8) * 16);
        } else if (billing2 == 0) {
            int billing3 = c2125e.billing(16);
            int billing4 = c2125e.billing(16);
            if (billing3 > 0) {
                bArr2 = new byte[billing3];
                c2125e.adcel(billing3, bArr2);
            }
            if (billing4 > 0) {
                bArr = new byte[billing4];
                c2125e.adcel(billing4, bArr);
                return new C5325e(billing, purchase, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C5325e(billing, purchase, bArr2, bArr);
    }

    public static final int license(C5306e c5306e) {
        C13945e c13945e = (C13945e) c5306e.f11404e;
        if (c13945e == null) {
            return 0;
        }
        C6797e c6797e = c13945e.billing;
        if (c6797e != null) {
            return c6797e.appmetrica.vip();
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public static final void purchase(C5306e c5306e, int i) {
        C3862e c3862e;
        C13945e c13945e = (C13945e) c5306e.f11404e;
        if (c13945e != null) {
            C6797e c6797e = c13945e.billing;
            if (c6797e == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            C9576e c9576e = c6797e.appmetrica;
            synchronized (c9576e.vip) {
                c9576e.appmetrica = i;
                c3862e = c9576e.metrica;
            }
            if (c3862e == null) {
                return;
            }
            c9576e.purchase = i == 2;
            Iterator it = c3862e.license().iterator();
            while (it.hasNext()) {
                InterfaceC2881e interfaceC2881e = (InterfaceC2881e) it.next();
                C5799e c5799e = interfaceC2881e instanceof C5799e ? (C5799e) interfaceC2881e : null;
                if (c5799e != null) {
                    if (i == 1) {
                        c5799e.remoteconfig(true);
                    } else if (i == 2) {
                        c5799e.remoteconfig(false);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void signatures(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5306e.signatures(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static int[] smaato() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = Signature(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = Signature(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static AbstractC10226e startapp(AbstractC10226e abstractC10226e, AbstractC1186e abstractC1186e) {
        AbstractC13270e amazon = abstractC10226e.loadAd().amazon();
        InterfaceC2460e annotations = abstractC10226e.getAnnotations();
        AbstractC1186e adcel = AbstractC16155e.adcel(abstractC10226e);
        List yandex = AbstractC16155e.yandex(abstractC10226e);
        List crashlytics = AbstractC13480e.crashlytics(AbstractC16155e.mopub(abstractC10226e));
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(crashlytics, 10));
        Iterator it = crashlytics.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC16232e) it.next()).vip());
        }
        return AbstractC16155e.purchase(amazon, annotations, adcel, yandex, arrayList, abstractC1186e, true).pro(abstractC10226e.Signature());
    }

    public static final ArrayList subs(C13212e c13212e, C5306e c5306e) {
        List list = c13212e.f26234e;
        C13212e amazon = AbstractC17110e.amazon(c13212e, (C17221e) ((C4956e) c5306e.f11400e).f10515e);
        Iterable subs = amazon != null ? subs(amazon, c5306e) : null;
        if (subs == null) {
            subs = C13664e.f27089e;
        }
        return AbstractC13480e.m3584final(list, subs);
    }

    public static C12863e tapsense(C2125e c2125e, int i) {
        int billing;
        int i2;
        int billing2;
        int i3;
        int i4;
        int i5 = 8;
        int billing3 = c2125e.billing(8);
        c2125e.loadAd(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] smaato = smaato();
        int[] amazon = amazon();
        while (i7 > 0) {
            int billing4 = c2125e.billing(i5);
            int billing5 = c2125e.billing(i5);
            int[] iArr2 = (billing5 & 128) != 0 ? iArr : (billing5 & 64) != 0 ? smaato : amazon;
            if ((billing5 & 1) != 0) {
                i3 = c2125e.billing(i5);
                i4 = c2125e.billing(i5);
                billing = c2125e.billing(i5);
                billing2 = c2125e.billing(i5);
                i2 = i7 - 6;
            } else {
                int billing6 = c2125e.billing(6) << i6;
                int billing7 = c2125e.billing(4) << 4;
                billing = c2125e.billing(4) << 4;
                i2 = i7 - 4;
                billing2 = c2125e.billing(i6) << 6;
                i3 = billing6;
                i4 = billing7;
            }
            if (i3 == 0) {
                i4 = i8;
                billing = i4;
                billing2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = billing - 128;
            iArr2[billing4] = Signature((byte) (255 - (billing2 & 255)), AbstractC9413e.adcel((int) ((1.402d * d2) + d), 0, 255), AbstractC9413e.adcel((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), AbstractC9413e.adcel((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = i2;
            i8 = 0;
            billing3 = billing3;
            amazon = amazon;
            i5 = 8;
            i6 = 2;
        }
        return new C12863e(billing3, iArr, smaato, amazon);
    }

    public static final C6594e vip(C5306e c5306e, C11725e c11725e) {
        Iterator it = c11725e.ad.iterator();
        while (it.hasNext()) {
            C15681e c15681e = C14465e.vip;
            if (!AbstractC7890e.billing(c15681e, c15681e)) {
                synchronized (AbstractC18195e.ad) {
                }
            }
        }
        return AbstractC17943e.ad;
    }

    public static byte[] yandex(int i, int i2, C2125e c2125e) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2125e.billing(i2);
        }
        return bArr;
    }

    @Override // defpackage.InterfaceC2560e
    public Object ad(Class cls) {
        return inmobi(C16786e.ad(cls));
    }

    @Override // defpackage.InterfaceC2560e
    public C10377e adcel(C16786e c16786e) {
        InterfaceC7970e advert = advert(c16786e);
        return advert == null ? new C10377e(C10377e.metrica, C10377e.license) : advert instanceof C10377e ? (C10377e) advert : new C10377e(null, advert);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public List admob() {
        return AbstractC13480e.m3575continue(this.f11401e.values());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [eؚؕۧ, java.lang.Object] */
    public ArrayList ads() {
        HashMap hashMap = (HashMap) this.f11402e;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f11400e).entrySet()) {
            C7259e c7259e = (C7259e) entry.getKey();
            if (c7259e.appmetrica != 0) {
                InterfaceC7970e interfaceC7970e = (InterfaceC7970e) entry.getValue();
                for (C16786e c16786e : c7259e.vip) {
                    if (!hashMap2.containsKey(c16786e)) {
                        hashMap2.put(c16786e, new HashSet());
                    }
                    ((Set) hashMap2.get(c16786e)).add(interfaceC7970e);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                C3770e c3770e = (C3770e) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC16019e(c3770e, (InterfaceC7970e) it.next(), 24));
                }
            } else {
                C16786e c16786e2 = (C16786e) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.vip = null;
                obj.ad = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.ad.addAll(set);
                hashMap.put(c16786e2, obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2560e
    public synchronized InterfaceC7970e advert(C16786e c16786e) {
        AbstractC11138e.metrica(c16786e, "Null interface requested.");
        return (InterfaceC7970e) ((HashMap) this.f11399e).get(c16786e);
    }

    public ArrayList applovin(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.f11399e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7259e c7259e = (C7259e) it.next();
            if (c7259e.appmetrica == 0) {
                InterfaceC7970e interfaceC7970e = (InterfaceC7970e) ((HashMap) this.f11400e).get(c7259e);
                for (C16786e c16786e : c7259e.vip) {
                    if (hashMap.containsKey(c16786e)) {
                        arrayList2.add(new RunnableC16019e((C10377e) ((InterfaceC7970e) hashMap.get(c16786e)), interfaceC7970e, 23));
                    } else {
                        hashMap.put(c16786e, interfaceC7970e);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC2560e
    public InterfaceC7970e appmetrica(Class cls) {
        return advert(C16786e.ad(cls));
    }

    public AbstractC1186e firebase(C13212e c13212e) {
        C4956e c4956e = (C4956e) this.f11400e;
        if ((c13212e.f26223e & 2) != 2) {
            return premium(c13212e, true);
        }
        String string = ((InterfaceC11824e) c4956e.f10513e).getString(c13212e.f26237e);
        AbstractC10226e premium = premium(c13212e, true);
        C17221e c17221e = (C17221e) c4956e.f10515e;
        int i = c13212e.f26223e;
        return ((InterfaceC15275e) ((C18277e) c4956e.f10517e).startapp).mo1638extends(c13212e, string, premium, premium((i & 4) == 4 ? c13212e.f26236e : (i & 8) == 8 ? c17221e.ad(c13212e.f26231e) : null, true));
    }

    @Override // defpackage.InterfaceC10647e
    public Object get() {
        String str = (String) this.f11400e;
        Size size = (Size) this.f11398e;
        C1900e c1900e = (C1900e) this.f11405e;
        LinkedHashMap linkedHashMap = AbstractC14417e.ad;
        C12899e vip = AbstractC14417e.vip((C10354e) this.f11402e, (Range) this.f11401e);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = vip.ad;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = vip.vip;
        sb.append(i2);
        sb.append("fps.");
        AbstractC9464e.yandex("VidEncVdPrflRslvr", sb.toString());
        AbstractC9464e.yandex("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int license = AbstractC14417e.license(c1900e.metrica, ((C14677e) this.f11404e).vip, c1900e.yandex, vip.vip, c1900e.license, size.getWidth(), c1900e.appmetrica, size.getHeight(), c1900e.purchase);
        int i3 = c1900e.billing;
        C7248e ad = AbstractC14417e.ad(i3, str);
        C14742e license2 = C12488e.license();
        license2.vip = str;
        EnumC14627e enumC14627e = (EnumC14627e) this.f11399e;
        if (enumC14627e == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        license2.license = enumC14627e;
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        license2.appmetrica = size;
        license2.mopub = Integer.valueOf(license);
        license2.yandex = Integer.valueOf(i);
        license2.startapp = Integer.valueOf(i2);
        license2.metrica = Integer.valueOf(i3);
        license2.billing = ad;
        return license2.license();
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (FrameLayout) this.f11400e;
    }

    @Override // defpackage.InterfaceC2560e
    public Object inmobi(C16786e c16786e) {
        InterfaceC7970e advert = advert(c16786e);
        if (advert == null) {
            return null;
        }
        return advert.get();
    }

    /* renamed from: interface, reason: not valid java name */
    public void m1885interface() {
        Trace.beginSection("CX:unbindAll");
        try {
            AbstractC13062e.metrica();
            purchase(this, 0);
            ((C11275e) this.f11401e).advert((HashSet) this.f11398e);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [eؚؕۧ, java.lang.Object] */
    public void isPro() {
        HashMap hashMap = (HashMap) this.f11399e;
        HashMap hashMap2 = (HashMap) this.f11402e;
        for (C7259e c7259e : ((HashMap) this.f11400e).keySet()) {
            for (C8625e c8625e : c7259e.metrica) {
                boolean z = c8625e.vip == 2;
                C16786e c16786e = c8625e.ad;
                if (z && !hashMap2.containsKey(c16786e)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.vip = null;
                    obj.ad = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.ad.addAll(set);
                    hashMap2.put(c16786e, obj);
                } else if (hashMap.containsKey(c16786e)) {
                    continue;
                } else {
                    int i = c8625e.vip;
                    if (i == 1) {
                        throw new C14803e("Unsatisfied dependency for component " + c7259e + ": " + c16786e, 2, (byte) 0);
                    }
                    if (i != 2) {
                        hashMap.put(c16786e, new C10377e(C10377e.metrica, C10377e.license));
                    }
                }
            }
        }
    }

    public C16575e loadAd(C11725e c11725e) {
        Object obj;
        Trace.beginSection("CX:getCameraInfo");
        try {
            InterfaceC12424e subscription = c11725e.metrica(((C13945e) this.f11404e).ad.license()).subscription();
            C6594e vip = vip(this, c11725e);
            C14131e yandex = AbstractC11906e.yandex(subscription.billing(), null, (C15681e) vip.f13613e);
            synchronized (this.f11399e) {
                try {
                    obj = ((HashMap) this.f11400e).get(yandex);
                    if (obj == null) {
                        obj = new C16575e(subscription, vip);
                        ((HashMap) this.f11400e).put(yandex, obj);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (C16575e) obj;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.InterfaceC2560e
    public Set metrica(C16786e c16786e) {
        InterfaceC7970e interfaceC7970e;
        synchronized (this) {
            interfaceC7970e = (C3770e) ((HashMap) this.f11402e).get(c16786e);
            if (interfaceC7970e == null) {
                interfaceC7970e = f11397e;
            }
        }
        return (Set) interfaceC7970e.get();
    }

    public void mopub(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C7259e c7259e = (C7259e) entry.getKey();
            InterfaceC7970e interfaceC7970e = (InterfaceC7970e) entry.getValue();
            int i = c7259e.license;
            if (i == 1 || (i == 2 && z)) {
                interfaceC7970e.get();
            }
        }
        C18395e c18395e = (C18395e) this.f11405e;
        synchronized (c18395e) {
            try {
                arrayDeque = c18395e.vip;
                if (arrayDeque != null) {
                    c18395e.vip = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC10226e premium(defpackage.C13212e r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5306e.premium(eِْۜ, boolean):eَْ");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public InterfaceC16046e pro(int i) {
        InterfaceC16046e interfaceC16046e = (InterfaceC16046e) this.f11401e.get(Integer.valueOf(i));
        if (interfaceC16046e != null) {
            return interfaceC16046e;
        }
        C5306e c5306e = (C5306e) this.f11399e;
        if (c5306e != null) {
            return c5306e.pro(i);
        }
        return null;
    }

    public void remoteconfig(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f11404e;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.f11400e);
        }
        mopub(hashMap, z);
    }

    @Override // defpackage.InterfaceC10625e
    public void reset() {
        C5828e c5828e = (C5828e) this.f11404e;
        ((SparseArray) c5828e.f12281e).clear();
        ((SparseArray) c5828e.f12284e).clear();
        ((SparseArray) c5828e.f12280e).clear();
        ((SparseArray) c5828e.f12288e).clear();
        ((SparseArray) c5828e.f12287e).clear();
        c5828e.f12283e = null;
        c5828e.f12285e = null;
    }

    public void subscription(C13945e c13945e, Context context) {
        C9029e c9029e;
        synchronized (this.f11399e) {
            this.f11404e = c13945e;
            if (c13945e != null && (c9029e = c13945e.amazon) != null) {
                ScheduledExecutorServiceC5380e amazon = AbstractC3062e.amazon();
                c9029e.amazon.add(new C1342e(this, amazon));
                amazon.execute(new RunnableC1399e(c9029e, this));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    public String toString() {
        String str;
        switch (this.f11403e) {
            case 4:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f11402e);
                C5306e c5306e = (C5306e) this.f11399e;
                if (c5306e == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = ". Child of " + ((String) c5306e.f11402e);
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0217, code lost:
    
        r2.Signature(r13 - r2.license());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0264, code lost:
    
        if ((r3.vip + 1) == ((android.graphics.Bitmap) r43.f11401e).getHeight()) goto L83;
     */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo825transient(byte[] r44, int r45, int r46, defpackage.C14033e r47, defpackage.InterfaceC8427e r48) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5306e.mo825transient(byte[], int, int, eٓٗۢ, eٌؑۘ):void");
    }
}
