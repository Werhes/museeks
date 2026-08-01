package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1729e {
    public static boolean adcel = true;
    public final InterfaceC2839e appmetrica;
    public final C17659e billing;
    public final C3098e license;
    public final C17856e purchase;
    public boolean startapp;
    public final AtomicInteger vip = new AtomicInteger(0);
    public final AtomicBoolean metrica = new AtomicBoolean(false);
    public final C5609e ad = new C5609e(12);
    public final C3011e yandex = new C3011e();

    public C1729e(C2316e c2316e, C3098e c3098e, InterfaceC2839e interfaceC2839e, C17856e c17856e) {
        AbstractC9528e.adcel(c2316e, "MlKitContext can not be null");
        this.license = c3098e;
        this.appmetrica = interfaceC2839e;
        this.purchase = c17856e;
        this.billing = new C17659e(c2316e.vip());
    }

    public final C0560e ad(Executor executor, Callable callable, C0731e c0731e) {
        AbstractC9528e.advert(this.vip.get() > 0);
        if (((C0560e) c0731e.f3025e).mopub()) {
            C0560e c0560e = new C0560e();
            c0560e.admob();
            return c0560e;
        }
        C15816e c15816e = new C15816e(5);
        C8988e c8988e = new C8988e((C0731e) c15816e.f31190e);
        this.ad.remoteconfig(new RunnableC3512e(this, c0731e, c15816e, callable, c8988e), new ExecutorC11157e(executor, c0731e, c15816e, c8988e));
        return c8988e.ad;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eُۡٔ] */
    public final void metrica(final EnumC3305e enumC3305e, long j, final C15444e c15444e, List list) {
        final crashlytics crashlyticsVar = new crashlytics((byte) 0, 12);
        final crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 12);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4896e c4896e = (C4896e) it.next();
                int format = c4896e.ad.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                EnumC9390e enumC9390e = (EnumC9390e) AbstractC4214e.ad.get(format);
                if (enumC9390e == null) {
                    enumC9390e = EnumC9390e.FORMAT_UNKNOWN;
                }
                crashlyticsVar.m197implements(enumC9390e);
                EnumC17723e enumC17723e = (EnumC17723e) AbstractC4214e.vip.get(c4896e.ad.metrica());
                if (enumC17723e == null) {
                    enumC17723e = EnumC17723e.TYPE_UNKNOWN;
                }
                crashlyticsVar2.m197implements(enumC17723e);
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.purchase.vip(new InterfaceC18508e() { // from class: eُ٘ؔ
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, eِّؔ] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, eُۡٔ] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, eُۡٔ] */
            @Override // defpackage.InterfaceC18508e
            public final C7306e ad() {
                int limit;
                C1729e c1729e = C1729e.this;
                long j2 = elapsedRealtime;
                EnumC3305e enumC3305e2 = enumC3305e;
                crashlytics crashlyticsVar3 = crashlyticsVar;
                crashlytics crashlyticsVar4 = crashlyticsVar2;
                C15444e c15444e2 = c15444e;
                ?? obj = new Object();
                ?? obj2 = new Object();
                obj2.f22774e = Long.valueOf(j2 & Long.MAX_VALUE);
                obj2.f22772e = enumC3305e2;
                obj2.f22771e = Boolean.valueOf(C1729e.adcel);
                Boolean bool = Boolean.TRUE;
                obj2.f22773e = bool;
                obj2.f22770e = bool;
                obj.f22774e = new C12665e(obj2);
                obj.f22772e = AbstractC4214e.ad(c1729e.license);
                obj.f22771e = crashlyticsVar3.m196catch();
                obj.f22773e = crashlyticsVar4.m196catch();
                int i = c15444e2.purchase;
                if (i == -1) {
                    Bitmap bitmap = c15444e2.ad;
                    AbstractC9528e.startapp(bitmap);
                    limit = bitmap.getAllocationByteCount();
                } else {
                    if (i == 17 || i == 842094169) {
                        AbstractC9528e.startapp(null);
                        throw null;
                    }
                    if (i != 35) {
                        limit = 0;
                    } else {
                        Image.Plane[] ad = c15444e2.ad();
                        AbstractC9528e.startapp(ad);
                        limit = (ad[0].getBuffer().limit() * 3) / 2;
                    }
                }
                C0642e c0642e = new C0642e();
                c0642e.f2880e = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? EnumC0646e.UNKNOWN_FORMAT : EnumC0646e.NV21 : EnumC0646e.NV16 : EnumC0646e.YV12 : EnumC0646e.YUV_420_888 : EnumC0646e.BITMAP;
                c0642e.f2879e = Integer.valueOf(Integer.MAX_VALUE & limit);
                obj.f22770e = new C10456e(c0642e);
                ?? obj3 = new Object();
                obj3.f6385e = c1729e.startapp ? EnumC5396e.TYPE_THICK : EnumC5396e.TYPE_THIN;
                obj3.f6387e = new C5244e(obj);
                return new C7306e(obj3, 0);
            }
        }, EnumC11135e.ON_DEVICE_BARCODE_DETECT);
        ?? obj = new Object();
        obj.f22774e = enumC3305e;
        obj.f22772e = Boolean.valueOf(adcel);
        obj.f22771e = AbstractC4214e.ad(this.license);
        obj.f22773e = crashlyticsVar.m196catch();
        obj.f22770e = crashlyticsVar2.m196catch();
        final C13120e c13120e = new C13120e(obj);
        final C8383e c8383e = new C8383e(this);
        final C17856e c17856e = this.purchase;
        EnumC2663e.f6529e.execute(new Runnable() { // from class: eًٌۚ
            {
                EnumC11135e enumC11135e = EnumC11135e.UNKNOWN_EVENT;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EnumC11135e enumC11135e = EnumC11135e.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                C17856e c17856e2 = c17856e;
                HashMap hashMap = c17856e2.adcel;
                if (!hashMap.containsKey(enumC11135e)) {
                    hashMap.put(enumC11135e, new C6834e());
                }
                C6834e c6834e = (C6834e) hashMap.get(enumC11135e);
                Long valueOf = Long.valueOf(elapsedRealtime);
                C3638e c3638e = c6834e.f14065e;
                C13120e c13120e2 = c13120e;
                Collection collection = (Collection) c3638e.get(c13120e2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c3638e.put(c13120e2, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (c17856e2.license(enumC11135e, elapsedRealtime2)) {
                    c17856e2.startapp.put(enumC11135e, Long.valueOf(elapsedRealtime2));
                    EnumC2663e.f6529e.execute(new RunnableC14126e(c17856e2, c8383e));
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.startapp;
        long j2 = currentTimeMillis - elapsedRealtime;
        C17659e c17659e = this.billing;
        int i = true != z ? 24301 : 24302;
        int i2 = enumC3305e.f7465e;
        synchronized (c17659e) {
            AtomicLong atomicLong = (AtomicLong) c17659e.f34612e;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - ((AtomicLong) c17659e.f34612e).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((C4480e) c17659e.f34613e).billing(new C11075e(0, Arrays.asList(new C11632e(i, i2, 0, j2, currentTimeMillis, null, null, 0, -1)))).metrica(new C3318e(c17659e, elapsedRealtime2, 10));
        }
    }

    public final List vip(C15444e c15444e) {
        C1729e c1729e;
        C15444e c15444e2;
        synchronized (this) {
            try {
                try {
                    C3011e c3011e = this.yandex;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c3011e.ad(c15444e);
                    try {
                        ArrayList ad = this.appmetrica.ad(c15444e);
                        c1729e = this;
                        c15444e2 = c15444e;
                        try {
                            c1729e.metrica(EnumC3305e.NO_ERROR, elapsedRealtime, c15444e2, ad);
                            adcel = false;
                            return ad;
                        } catch (C15745e e) {
                            e = e;
                            C15745e c15745e = e;
                            c1729e.metrica(c15745e.f31013e == 14 ? EnumC3305e.MODEL_NOT_DOWNLOADED : EnumC3305e.UNKNOWN_ERROR, elapsedRealtime, c15444e2, null);
                            throw c15745e;
                        }
                    } catch (C15745e e2) {
                        e = e2;
                        c1729e = this;
                        c15444e2 = c15444e;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
