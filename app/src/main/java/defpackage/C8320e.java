package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8320e extends AbstractC3947e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C17659e f16999e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C2200e f17000e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C2200e f17001e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f17002e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public SharedPreferencesOnSharedPreferenceChangeListenerC14816e f17003e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public PriorityQueue f17004e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C13951e f17005e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public long f17006e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C5291e f17007e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final AtomicLong f17008e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AtomicReference f17009e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f17010e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C2200e f17011e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f17012e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C8374e f17013e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C13951e f17014e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Object f17015e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f17016e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f17017e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C2200e f17018e;

    public C8320e(C6936e c6936e) {
        super(c6936e);
        this.f17017e = new CopyOnWriteArraySet();
        this.f17015e = new Object();
        this.f17002e = false;
        this.f17010e = 1;
        this.f17012e = true;
        this.f17014e = new C13951e(this);
        this.f17009e = new AtomicReference();
        this.f17007e = C5291e.metrica;
        this.f17006e = -1L;
        this.f17008e = new AtomicLong(0L);
        this.f17005e = new C13951e(c6936e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r6 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r7 > 500) goto L36;
     */
    /* renamed from: eّؑۛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2397e(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8320e.m2397e(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public final void m2398e() {
        C4261e.ad();
        C6936e c6936e = (C6936e) this.f36443e;
        C10476e c10476e = c6936e.f14221e;
        C6915e c6915e = c6936e.f14226e;
        C13879e c13879e = c6936e.f14227e;
        if (c10476e.m2822e(null, AbstractC17254e.f33825e)) {
            C6936e.yandex(c6915e);
            if (c6915e.m2247e()) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C7936e.yandex()) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Cannot get trigger URIs from main thread");
                return;
            }
            m1411e();
            C6936e.yandex(c13879e);
            c13879e.f27497e.ad("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C6936e.yandex(c6915e);
            c6915e.m2252e(atomicReference, 10000L, "get trigger URIs", new RunnableC7100e(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                C6936e.yandex(c13879e);
                c13879e.f27501e.ad("Timed out waiting for get trigger URIs");
            } else {
                C6936e.yandex(c6915e);
                c6915e.m2254e(new Runnable() { // from class: eٌَۡ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8320e c8320e = C8320e.this;
                        c8320e.mo2250e();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        C1195e c1195e = ((C6936e) c8320e.f36443e).f14198e;
                        C6936e.purchase(c1195e);
                        SparseArray m485e = c1195e.m485e();
                        for (C6471e c6471e : list) {
                            int i = c6471e.f13385e;
                            if (!m485e.contains(i) || ((Long) m485e.get(i)).longValue() < c6471e.f13386e) {
                                c8320e.m2399e().add(c6471e);
                            }
                        }
                        c8320e.m2400e();
                    }
                });
            }
        }
    }

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public final PriorityQueue m2399e() {
        if (this.f17004e == null) {
            this.f17004e = new PriorityQueue(Comparator.CC.comparing(C5037e.ad, C13834e.f27395e));
        }
        return this.f17004e;
    }

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public final void m2400e() {
        C6471e c6471e;
        mo2250e();
        if (m2399e().isEmpty() || this.f17002e || (c6471e = (C6471e) m2399e().poll()) == null) {
            return;
        }
        C6936e c6936e = (C6936e) this.f36443e;
        C5240e c5240e = c6936e.f14223e;
        C6936e.purchase(c5240e);
        C16066e m1801e = c5240e.m1801e();
        if (m1801e != null) {
            this.f17002e = true;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            C14937e c14937e = c13879e.f27497e;
            String str = c6471e.f13387e;
            c14937e.vip(str, "Registering trigger URI");
            ListenableFuture appmetrica = m1801e.appmetrica(Uri.parse(str));
            if (appmetrica != null) {
                appmetrica.ad(new RunnableC17144e(appmetrica, new C17659e(this, c6471e, false, 5), 11), new ExecutorC3044e(3, this));
            } else {
                this.f17002e = false;
                m2399e().add(c6471e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0428  */
    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2401e() {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8320e.m2401e():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0115
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public final void m2402e(defpackage.C5291e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8320e.m2402e(eؗۦۢ, boolean):void");
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final String m2403e() {
        C6936e c6936e = (C6936e) this.f36443e;
        try {
            return AbstractC15367e.advert(c6936e.f14225e, c6936e.f14210e);
        } catch (IllegalStateException e) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final void m2404e(long j, long j2, Bundle bundle, String str, String str2) {
        mo2250e();
        boolean z = true;
        if (this.f16999e != null && !C5240e.m1785e(str2)) {
            z = false;
        }
        m2416e(str, str2, j, j2, bundle, true, z, true);
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final void m2405e(String str, String str2, Bundle bundle) {
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC9528e.purchase(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2254e(new RunnableC8310e(this, bundle2, 1));
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final void m2406e(String str, String str2, Bundle bundle) {
        long j;
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33810e)) {
            c6936e.f14215e.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        m2404e(currentTimeMillis, j, bundle, str, str2);
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public final void m2407e(C7229e c7229e, boolean z) {
        RunnableC12554e runnableC12554e = new RunnableC12554e((Object) this, (Object) c7229e, false, 13);
        if (z) {
            mo2250e();
            runnableC12554e.run();
        } else {
            C6915e c6915e = ((C6936e) this.f36443e).f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(runnableC12554e);
        }
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m2408e(Bundle bundle, long j) {
        C6936e c6936e = (C6936e) this.f36443e;
        AbstractC9528e.startapp(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.ad("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC6190e.smaato(bundle2, "app_id", String.class, null);
        AbstractC6190e.smaato(bundle2, "origin", String.class, null);
        AbstractC6190e.smaato(bundle2, "name", String.class, null);
        AbstractC6190e.smaato(bundle2, "value", Object.class, null);
        AbstractC6190e.smaato(bundle2, "trigger_event_name", String.class, null);
        AbstractC6190e.smaato(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC6190e.smaato(bundle2, "timed_out_event_name", String.class, null);
        AbstractC6190e.smaato(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC6190e.smaato(bundle2, "triggered_event_name", String.class, null);
        AbstractC6190e.smaato(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC6190e.smaato(bundle2, "time_to_live", Long.class, 0L);
        AbstractC6190e.smaato(bundle2, "expired_event_name", String.class, null);
        AbstractC6190e.smaato(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC9528e.purchase(bundle2.getString("name"));
        AbstractC9528e.purchase(bundle2.getString("origin"));
        AbstractC9528e.startapp(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C5240e c5240e = c6936e.f14223e;
        C7269e c7269e = c6936e.f14202e;
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.purchase(c5240e);
        if (c5240e.m1805e(string) != 0) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(c7269e.metrica(string), "Invalid conditional user property name");
            return;
        }
        C6936e.purchase(c5240e);
        if (c5240e.m1809e(obj, string) != 0) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(c7269e.metrica(string), obj, "Invalid conditional user property value");
            return;
        }
        Object m1830e = c5240e.m1830e(obj, string);
        if (m1830e == null) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(c7269e.metrica(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        AbstractC6190e.advert(bundle2, m1830e);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(c7269e.metrica(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.metrica(c7269e.metrica(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC8310e(this, bundle2, 0));
        }
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final void m2409e(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        C6936e c6936e = (C6936e) this.f36443e;
        if (z) {
            C5240e c5240e = c6936e.f14223e;
            C6936e.purchase(c5240e);
            i = c5240e.m1805e(str2);
        } else {
            C5240e c5240e2 = c6936e.f14223e;
            C6936e.purchase(c5240e2);
            if (c5240e2.m1837e("user property", str2)) {
                if (c5240e2.m1808e("user property", AbstractC9408e.advert, null, str2)) {
                    ((C6936e) c5240e2.f36443e).getClass();
                    if (c5240e2.m1816e("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        C13951e c13951e = this.f17014e;
        if (i != 0) {
            C6936e.purchase(c6936e.f14223e);
            String m1784e = C5240e.m1784e(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            C6936e.purchase(c6936e.f14223e);
            C5240e.m1792e(c13951e, null, i, "_ev", m1784e, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            C6915e c6915e = c6936e.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC2360e(this, str3, str2, null, j, 3));
            return;
        }
        C5240e c5240e3 = c6936e.f14223e;
        C6936e.purchase(c5240e3);
        int m1809e = c5240e3.m1809e(obj, str2);
        if (m1809e != 0) {
            C6936e.purchase(c5240e3);
            String m1784e2 = C5240e.m1784e(str2, true, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C6936e.purchase(c6936e.f14223e);
            C5240e.m1792e(c13951e, null, m1809e, "_ev", m1784e2, length);
            return;
        }
        C6936e.purchase(c5240e3);
        Object m1830e = c5240e3.m1830e(obj, str2);
        if (m1830e != null) {
            C6915e c6915e2 = c6936e.f14226e;
            C6936e.yandex(c6915e2);
            c6915e2.m2254e(new RunnableC2360e(this, str3, str2, m1830e, j, 3));
        }
    }

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public final void m2410e(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        EnumC18450e enumC18450e;
        C6936e c6936e = (C6936e) this.f36443e;
        m1411e();
        C5291e c5291e = C5291e.metrica;
        EnumC9102e[] enumC9102eArr = EnumC7033e.STORAGE.f14395e;
        int length = enumC9102eArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str2 = enumC9102eArr[i2].f18238e;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27494e.vip(str, "Ignoring invalid consent setting");
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27494e.ad("Valid consent values are 'granted', 'denied'");
        }
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        boolean m2247e = c6915e.m2247e();
        C5291e vip = C5291e.vip(i, bundle);
        Iterator it = vip.ad.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC18450e = EnumC18450e.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((EnumC18450e) it.next()) != enumC18450e) {
                m2402e(vip, m2247e);
                break;
            }
        }
        C7229e metrica = C7229e.metrica(i, bundle);
        Iterator it2 = metrica.appmetrica.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC18450e) it2.next()) != enumC18450e) {
                m2407e(metrica, m2247e);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = C5291e.license(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i == -30 ? "tcf" : "app";
            if (m2247e) {
                m2413e(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                m2409e(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final void m2411e() {
        C6936e c6936e = (C6936e) this.f36443e;
        if (!(c6936e.f14225e.getApplicationContext() instanceof Application) || this.f17013e == null) {
            return;
        }
        ((Application) c6936e.f14225e.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f17013e);
    }

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public final void m2412e(C5291e c5291e) {
        mo2250e();
        boolean z = (c5291e.startapp(EnumC9102e.ANALYTICS_STORAGE) && c5291e.startapp(EnumC9102e.AD_STORAGE)) || ((C6936e) this.f36443e).mopub().m2859e();
        C6936e c6936e = (C6936e) this.f36443e;
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.mo2250e();
        if (z != c6936e.f14213e) {
            C6915e c6915e2 = c6936e.f14226e;
            C6936e.yandex(c6915e2);
            c6915e2.mo2250e();
            c6936e.f14213e = z;
            C1195e c1195e = ((C6936e) this.f36443e).f14198e;
            C6936e.purchase(c1195e);
            c1195e.mo2250e();
            Boolean valueOf = c1195e.m490e().contains("measurement_enabled_from_api") ? Boolean.valueOf(c1195e.m490e().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m2419e(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void m2413e(long j, Object obj, String str, String str2) {
        String str3;
        boolean m3534e;
        Object obj2 = obj;
        C6936e c6936e = (C6936e) this.f36443e;
        AbstractC9528e.purchase(str);
        AbstractC9528e.purchase(str2);
        mo2250e();
        m1411e();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    C1195e c1195e = c6936e.f14198e;
                    C6936e.purchase(c1195e);
                    c1195e.f3804e.isVip(j2 == 1 ? "true" : "false");
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27497e.metrica("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                C1195e c1195e2 = c6936e.f14198e;
                C6936e.purchase(c1195e2);
                c1195e2.f3804e.isVip("unset");
            } else {
                str4 = str2;
            }
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27497e.metrica("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!c6936e.ad()) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27497e.ad("User property not set since app measurement is disabled");
            return;
        }
        if (c6936e.metrica()) {
            C9097e c9097e = new C9097e(j, obj3, str3, str);
            C10640e mopub = c6936e.mopub();
            mopub.mo2250e();
            mopub.m1411e();
            mopub.m2861e();
            C13185e adcel = ((C6936e) mopub.f36443e).adcel();
            adcel.getClass();
            Parcel obtain = Parcel.obtain();
            C0928e.ad(c9097e, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                C13879e c13879e4 = ((C6936e) adcel.f36443e).f14227e;
                C6936e.yandex(c13879e4);
                c13879e4.f27498e.ad("User property too long for local database. Sending directly to service");
                m3534e = false;
            } else {
                m3534e = adcel.m3534e(1, marshall);
            }
            mopub.m2851e(new RunnableC12430e(mopub, mopub.m2858e(true), m3534e, c9097e, 1));
        }
    }

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public final void m2414e() {
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C13879e c13879e = c6936e.f14227e;
        C17647e c17647e = c6936e.f14215e;
        C6936e.purchase(c1195e);
        String tapsense = c1195e.f3804e.tapsense();
        if (tapsense != null) {
            if ("unset".equals(tapsense)) {
                c17647e.getClass();
                m2413e(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(tapsense) ? 0L : 1L);
                c17647e.getClass();
                m2413e(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!c6936e.ad() || !this.f17012e) {
            C6936e.yandex(c13879e);
            c13879e.f27496e.ad("Updating Scion state (FE)");
            C10640e mopub = c6936e.mopub();
            mopub.mo2250e();
            mopub.m1411e();
            mopub.m2851e(new RunnableC11767e(mopub, mopub.m2858e(true), 3));
            return;
        }
        C6936e.yandex(c13879e);
        c13879e.f27496e.ad("Recording app launch after enabling measurement for the first time (FE)");
        m2418e();
        C2285e c2285e = c6936e.f14212e;
        C6936e.billing(c2285e);
        c2285e.f5790e.vip();
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2254e(new RunnableC15852e(this, 1));
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final void m2415e(C5291e c5291e, long j, boolean z) {
        int i = c5291e.vip;
        mo2250e();
        m1411e();
        C6936e c6936e = (C6936e) this.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.purchase(c1195e);
        C5291e m488e = c1195e.m488e();
        if (j <= this.f17006e && C5291e.advert(m488e.vip, i)) {
            C6936e.yandex(c13879e);
            c13879e.f27493e.vip(c5291e, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C1195e c1195e2 = c6936e.f14198e;
        C6936e.purchase(c1195e2);
        c1195e2.mo2250e();
        if (!C5291e.advert(i, c1195e2.m490e().getInt("consent_source", 100))) {
            C6936e.yandex(c13879e);
            c13879e.f27493e.vip(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = c1195e2.m490e().edit();
        edit.putString("consent_settings", c5291e.billing());
        edit.putInt("consent_source", i);
        edit.apply();
        C6936e.yandex(c13879e);
        c13879e.f27497e.vip(c5291e, "Setting storage consent(FE)");
        this.f17006e = j;
        if (c6936e.mopub().m2854e()) {
            C10640e mopub = c6936e.mopub();
            mopub.mo2250e();
            mopub.m1411e();
            mopub.m2851e(new RunnableC9769e(mopub, 2));
        } else {
            C10640e mopub2 = c6936e.mopub();
            mopub2.mo2250e();
            mopub2.m1411e();
            if (mopub2.m2859e()) {
                mopub2.m2851e(new RunnableC11767e(mopub2, mopub2.m2858e(false)));
            }
        }
        if (z) {
            c6936e.mopub().m2860e(new AtomicReference());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: eَٖؑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2416e(java.lang.String r26, java.lang.String r27, long r28, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8320e.m2416e(java.lang.String, java.lang.String, long, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m2417e(String str, String str2, Bundle bundle) {
        long j;
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33810e)) {
            c6936e.f14215e.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        m2397e(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return false;
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void m2418e() {
        mo2250e();
        m1411e();
        C6936e c6936e = (C6936e) this.f36443e;
        if (c6936e.metrica()) {
            C10476e c10476e = c6936e.f14221e;
            ((C6936e) c10476e.f36443e).getClass();
            Boolean m2820e = c10476e.m2820e("google_analytics_deferred_deep_link_enabled");
            if (m2820e != null && m2820e.booleanValue()) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27496e.ad("Deferred Deep Link feature enabled.");
                C6915e c6915e = c6936e.f14226e;
                C6936e.yandex(c6915e);
                c6915e.m2254e(new RunnableC15852e(this, 2));
            }
            C10640e mopub = c6936e.mopub();
            mopub.mo2250e();
            mopub.m1411e();
            C8019e m2858e = mopub.m2858e(true);
            mopub.m2861e();
            C6936e c6936e2 = (C6936e) mopub.f36443e;
            c6936e2.f14221e.m2822e(null, AbstractC17254e.f33832e);
            c6936e2.adcel().m3534e(3, new byte[0]);
            mopub.m2851e(new RunnableC11767e(mopub, m2858e, 1));
            this.f17012e = false;
            C1195e c1195e = c6936e.f14198e;
            C6936e.purchase(c1195e);
            c1195e.mo2250e();
            String string = c1195e.m490e().getString("previous_os_version", null);
            ((C6936e) c1195e.f36443e).advert().m2347e();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c1195e.m490e().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c6936e.advert().m2347e();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m2406e("auto", "_ou", bundle);
        }
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final void m2419e(Boolean bool, boolean z) {
        mo2250e();
        m1411e();
        C6936e c6936e = (C6936e) this.f36443e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27496e.vip(bool, "Setting app measurement enabled (FE)");
        C1195e c1195e = c6936e.f14198e;
        C6936e.purchase(c1195e);
        c1195e.mo2250e();
        SharedPreferences.Editor edit = c1195e.m490e().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            c1195e.mo2250e();
            SharedPreferences.Editor edit2 = c1195e.m490e().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.mo2250e();
        if (c6936e.f14213e || !(bool == null || bool.booleanValue())) {
            m2414e();
        }
    }
}
