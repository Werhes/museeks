package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16680e implements Handler.Callback {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static C16680e f32729e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Context f32733e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final HandlerC9134e f32734e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C17548e f32735e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C11075e f32736e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ConcurrentHashMap f32737e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public volatile boolean f32738e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f32739e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AtomicInteger f32740e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C17548e f32741e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C4480e f32742e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final AtomicInteger f32743e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f32744e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5891e f32745e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0002e f32746e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final Status f32731e = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final Status f32732e = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final Object f32730e = new Object();

    /* JADX WARN: Type inference failed for: r2v5, types: [eٌۧؗ, android.os.Handler] */
    public C16680e(Context context, Looper looper) {
        C0002e c0002e = C0002e.appmetrica;
        this.f32744e = 10000L;
        this.f32739e = false;
        this.f32740e = new AtomicInteger(1);
        this.f32743e = new AtomicInteger(0);
        this.f32737e = new ConcurrentHashMap(5, 0.75f, 1);
        this.f32741e = new C17548e(0);
        this.f32735e = new C17548e(0);
        this.f32738e = true;
        this.f32733e = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.f32734e = handler;
        this.f32746e = c0002e;
        this.f32745e = new C5891e(29);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC12684e.pro == null) {
            AbstractC12684e.pro = Boolean.valueOf(AbstractC11765e.metrica() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC12684e.pro.booleanValue()) {
            this.f32738e = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static C16680e license(Context context) {
        C16680e c16680e;
        synchronized (f32730e) {
            try {
                if (f32729e == null) {
                    Looper looper = C14864e.vip().getLooper();
                    context.getPackageName();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C0002e.license;
                    C16680e c16680e2 = new C16680e(applicationContext, looper);
                    AbstractC8031e.premium = ExecutorC8172e.ad(c16680e2.f32733e);
                    f32729e = c16680e2;
                }
                c16680e = f32729e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c16680e;
    }

    public static Status metrica(C7735e c7735e, C14758e c14758e) {
        String str = (String) c7735e.vip.f26644e;
        String valueOf = String.valueOf(c14758e);
        return new Status(17, AbstractC4653e.ads(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), c14758e.f29189e, c14758e);
    }

    public final C1623e ad(AbstractC6950e abstractC6950e) {
        C7735e c7735e = abstractC6950e.purchase;
        ConcurrentHashMap concurrentHashMap = this.f32737e;
        C1623e c1623e = (C1623e) concurrentHashMap.get(c7735e);
        if (c1623e == null) {
            c1623e = new C1623e(this, abstractC6950e);
            concurrentHashMap.put(c7735e, c1623e);
        }
        if (c1623e.license.metrica()) {
            this.f32735e.add(c7735e);
        }
        c1623e.admob();
        return c1623e;
    }

    public final boolean appmetrica() {
        if (this.f32739e) {
            return false;
        }
        C2831e c2831e = (C2831e) C7850e.crashlytics().f15896e;
        if (c2831e != null && !c2831e.f6799e) {
            return false;
        }
        int m1992catch = this.f32745e.m1992catch(203400000);
        return m1992catch == -1 || m1992catch == 0;
    }

    public final void billing(C14758e c14758e, int i) {
        if (purchase(c14758e, i)) {
            return;
        }
        HandlerC9134e handlerC9134e = this.f32734e;
        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(5, i, 0, c14758e));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARN: Type inference failed for: r10v7, types: [eؚؗۘ, eؖۤۛ] */
    /* JADX WARN: Type inference failed for: r1v39, types: [eؚؗۘ, eؖۤۛ] */
    /* JADX WARN: Type inference failed for: r1v44, types: [eؚؗۘ, eؖۤۛ] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16680e.handleMessage(android.os.Message):boolean");
    }

    public final boolean purchase(C14758e c14758e, int i) {
        PendingIntent pendingIntent;
        int i2 = c14758e.f29190e;
        C0002e c0002e = this.f32746e;
        c0002e.getClass();
        if (i2 != 9) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    switch (i2) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 20:
                            break;
                        default:
                            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(c14758e)));
                            return false;
                    }
            }
        }
        Context context = this.f32733e;
        if (!AbstractC11815e.m3247class(context)) {
            int i3 = c14758e.f29190e;
            if (i3 == 0 || (pendingIntent = c14758e.f29189e) == null) {
                pendingIntent = null;
                Intent vip = c0002e.vip(i3, context, null);
                if (vip != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, vip, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i4 = c14758e.f29190e;
                int i5 = GoogleApiActivity.f723e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c0002e.yandex(context, new C14758e(1, i4, PendingIntent.getActivity(context, 0, intent, AbstractC10204e.ad | 134217728), c14758e.f29191e, c14758e.f29188e));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.C8988e r9, int r10, defpackage.AbstractC6950e r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            eًؗ r3 = r11.purchase
            boolean r11 = r8.appmetrica()
            if (r11 != 0) goto Lb
            goto L48
        Lb:
            eًَٛ r11 = defpackage.C7850e.crashlytics()
            java.lang.Object r11 = r11.f15896e
            eؔۚؑ r11 = (defpackage.C2831e) r11
            r0 = 1
            if (r11 == 0) goto L4b
            boolean r1 = r11.f6799e
            if (r1 == 0) goto L48
            boolean r11 = r11.f6798e
            j$.util.concurrent.ConcurrentHashMap r1 = r8.f32737e
            java.lang.Object r1 = r1.get(r3)
            eؓؗٞ r1 = (defpackage.C1623e) r1
            if (r1 == 0) goto L46
            eؔؕٓ r2 = r1.license
            boolean r4 = r2 instanceof defpackage.AbstractC6785e
            if (r4 == 0) goto L48
            eؙۦؒ r2 = (defpackage.AbstractC6785e) r2
            eؖۖٛ r4 = r2.inmobi
            if (r4 == 0) goto L46
            boolean r4 = r2.pro()
            if (r4 != 0) goto L46
            eٓٝؕ r11 = defpackage.C8096e.ad(r1, r2, r10)
            if (r11 == 0) goto L48
            int r2 = r1.amazon
            int r2 = r2 + r0
            r1.amazon = r2
            boolean r0 = r11.f27925e
            goto L4b
        L46:
            r0 = r11
            goto L4b
        L48:
            r10 = 0
            r1 = r8
            goto L65
        L4b:
            eًٞٔ r11 = new eًٞٔ
            r1 = 0
            if (r0 == 0) goto L56
            long r4 = java.lang.System.currentTimeMillis()
            goto L57
        L56:
            r4 = r1
        L57:
            if (r0 == 0) goto L5d
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5d:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L65:
            if (r10 == 0) goto L79
            eؑۛٞ r9 = r9.ad
            eٌۧؗ r11 = r1.f32734e
            j$.util.Objects.requireNonNull(r11)
            eْۥٝ r0 = new eْۥٝ
            r2 = 2
            r0.<init>(r11, r2)
            r9.vip(r0, r10)
            return
        L78:
            r1 = r8
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16680e.vip(eٌَۜ, int, eؚؗۘ):void");
    }
}
