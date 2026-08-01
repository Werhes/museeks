package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15211e {
    public static final C2443e ad;
    public static final C2443e appmetrica;
    public static final C2443e license;
    public static final C2443e metrica;
    public static final C2443e vip;
    public static final C5080e purchase = new C5080e(false);
    public static final C5080e billing = new C5080e(true);

    static {
        int i = 2;
        ad = new C2443e("COMPLETING_ALREADY", i);
        vip = new C2443e("COMPLETING_WAITING_CHILDREN", i);
        metrica = new C2443e("COMPLETING_RETRY", i);
        license = new C2443e("TOO_LATE_TO_CANCEL", i);
        appmetrica = new C2443e("SEALED", i);
    }

    public static void ad(int i) {
        if (2 > i || i >= 37) {
            StringBuilder premium = AbstractC4653e.premium("radix ", i, " was not in valid range ");
            premium.append(new C11241e(2, 36, 1));
            throw new IllegalArgumentException(premium.toString());
        }
    }

    public static final void appmetrica(RemoteViews remoteViews, C6555e c6555e, C2158e c2158e, List list) {
        int i = 0;
        for (Object obj : AbstractC13480e.m3602switch(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            billing(remoteViews, c6555e.vip(c2158e, i), (InterfaceC2209e) obj);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x032e, code lost:
    
        if (defpackage.AbstractC7890e.billing(r0 != null ? r0.ad : null, r2) != false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void billing(android.widget.RemoteViews r19, defpackage.C6555e r20, defpackage.InterfaceC2209e r21) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15211e.billing(android.widget.RemoteViews, eؙؙٟ, eؓۤ۠):void");
    }

    public static boolean license(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final boolean metrica(C13770e c13770e) {
        return ((Configuration) c13770e.adcel(AbstractC2676e.ad)).orientation == 2;
    }

    public static final int purchase(C7139e c7139e) {
        int i = c7139e.ad;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C2782e.vip(i)));
            }
        }
        int i3 = c7139e.vip;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C13692e.vip(i3)));
            }
        }
        return i2 | i4;
    }

    public static final Object startapp(Object obj) {
        InterfaceC1648e interfaceC1648e;
        C5705e c5705e = obj instanceof C5705e ? (C5705e) obj : null;
        return (c5705e == null || (interfaceC1648e = c5705e.ad) == null) ? obj : interfaceC1648e;
    }

    public static final boolean vip(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final RemoteViews yandex(Context context, int i, C14390e c14390e, C6660e c6660e, int i2, ComponentName componentName, C16911e c16911e) {
        int i3 = 0;
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        C6555e c6555e = new C6555e(context, i, z, c6660e, -1, false, new AtomicInteger(-1), new C2158e(i3, i3, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, c16911e);
        ArrayList arrayList = c14390e.vip;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((InterfaceC2209e) it.next()) instanceof C5831e)) {
                    InterfaceC2209e interfaceC2209e = (InterfaceC2209e) AbstractC13480e.m3590instanceof(arrayList);
                    C3237e ad2 = AbstractC5111e.ad(c6555e, interfaceC2209e.vip(), i2);
                    RemoteViews remoteViews = ad2.ad;
                    billing(remoteViews, C6555e.ad(c6555e.vip(ad2.vip, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), interfaceC2209e);
                    return remoteViews;
                }
            }
        }
        InterfaceC3997e interfaceC3997e = ((C5831e) AbstractC13480e.m3591interface(arrayList)).license;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC2209e interfaceC2209e2 = (InterfaceC2209e) it2.next();
            C5831e c5831e = (C5831e) interfaceC2209e2;
            long j = c5831e.metrica;
            C3237e ad3 = AbstractC5111e.ad(c6555e, c5831e.vip(), i2);
            RemoteViews remoteViews2 = ad3.ad;
            billing(remoteViews2, C6555e.ad(c6555e.vip(ad3.vip, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, null, 64703), interfaceC2209e2);
            arrayList2.add(new C6571e(new SizeF(C16109e.vip(j), C16109e.ad(j)), remoteViews2));
        }
        if (interfaceC3997e instanceof C6883e) {
            return (RemoteViews) ((C6571e) AbstractC13480e.m3590instanceof(arrayList2)).f13543e;
        }
        if (!(interfaceC3997e instanceof C16576e) && !AbstractC7890e.billing(interfaceC3997e, C14724e.ad)) {
            throw new C14803e(10);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC16048e.metrica(AbstractC10064e.mopub(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add((RemoteViews) ((C6571e) it3.next()).f13543e);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }
}
