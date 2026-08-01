package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۤؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7568e extends AbstractC8031e {

    /* renamed from: abstract, reason: not valid java name */
    public int f15395abstract;

    /* renamed from: break, reason: not valid java name */
    public int f15396break;

    /* renamed from: case, reason: not valid java name */
    public Bundle f15397case;

    /* renamed from: catch, reason: not valid java name */
    public final HashMap f15398catch;

    /* renamed from: class, reason: not valid java name */
    public final HashMap f15399class;
    public final CastDevice crashlytics;

    /* renamed from: default, reason: not valid java name */
    public String f15400default;

    /* renamed from: extends, reason: not valid java name */
    public boolean f15401extends;
    public final C18017e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final Bundle f15402goto;

    /* renamed from: implements, reason: not valid java name */
    public String f15403implements;

    /* renamed from: interface, reason: not valid java name */
    public final long f15404interface;

    /* renamed from: native, reason: not valid java name */
    public String f15405native;

    /* renamed from: protected, reason: not valid java name */
    public C8023e f15406protected;
    public C17005e subs;

    /* renamed from: this, reason: not valid java name */
    public BinderC5579e f15407this;

    /* renamed from: throw, reason: not valid java name */
    public boolean f15408throw;

    /* renamed from: try, reason: not valid java name */
    public double f15409try;

    /* renamed from: while, reason: not valid java name */
    public boolean f15410while;

    /* renamed from: final, reason: not valid java name */
    public static final C18482e f15392final = new C18482e("CastClientImpl", null);

    /* renamed from: super, reason: not valid java name */
    public static final Object f15394super = new Object();

    /* renamed from: new, reason: not valid java name */
    public static final Object f15393new = new Object();

    public C7568e(Context context, Looper looper, C2532e c2532e, CastDevice castDevice, long j, C18017e c18017e, Bundle bundle, C1623e c1623e, C1623e c1623e2) {
        super(context, looper, 10, c2532e, c1623e, c1623e2);
        this.crashlytics = castDevice;
        this.firebase = c18017e;
        this.f15404interface = j;
        this.f15402goto = bundle;
        this.f15399class = new HashMap();
        new AtomicLong(0L);
        this.f15398catch = new HashMap();
        this.f15396break = -1;
        this.f15395abstract = -1;
        this.subs = null;
        this.f15405native = null;
        this.f15409try = 0.0d;
        crashlytics();
        this.f15401extends = false;
        this.f15406protected = null;
        crashlytics();
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle advert() {
        Bundle bundle = new Bundle();
        f15392final.vip("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f15400default, this.f15403implements);
        CastDevice castDevice = this.crashlytics;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f15404interface);
        Bundle bundle2 = this.f15402goto;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        BinderC5579e binderC5579e = new BinderC5579e(this);
        this.f15407this = binderC5579e;
        bundle.putParcelable("listener", new BinderWrapper(binderC5579e));
        String str = this.f15400default;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f15403implements;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final /* synthetic */ IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof C1091e ? (C1091e) queryLocalInterface : new C1091e(iBinder);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m2295class() {
        f15392final.vip("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.f15399class;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void crashlytics() {
        CastDevice castDevice = this.crashlytics;
        AbstractC9528e.adcel(castDevice, "device should not be null");
        C5401e c5401e = castDevice.f673e;
        if (c5401e.m1901class(2048) || !c5401e.m1901class(4) || c5401e.m1901class(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f657e);
    }

    public final void firebase(int i, long j) {
        C4627e c4627e;
        HashMap hashMap = this.f15398catch;
        synchronized (hashMap) {
            c4627e = (C4627e) hashMap.remove(Long.valueOf(j));
        }
        if (c4627e != null) {
            c4627e.ad.vip(null);
        }
    }

    @Override // defpackage.AbstractC6785e
    public final void inmobi(int i, IBinder iBinder, Bundle bundle, int i2) {
        f15392final.vip("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f15408throw = true;
            this.f15410while = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f15397case = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.inmobi(i, iBinder, bundle, i2);
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle mopub() {
        Bundle bundle = this.f15397case;
        if (bundle == null) {
            return null;
        }
        this.f15397case = null;
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final void purchase() {
        Object[] objArr = {this.f15407this, Boolean.valueOf(remoteconfig())};
        C18482e c18482e = f15392final;
        c18482e.vip("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        BinderC5579e binderC5579e = this.f15407this;
        C7568e c7568e = null;
        this.f15407this = null;
        if (binderC5579e != null) {
            C7568e c7568e2 = (C7568e) binderC5579e.license.getAndSet(null);
            if (c7568e2 != null) {
                c7568e2.f15396break = -1;
                c7568e2.f15395abstract = -1;
                c7568e2.subs = null;
                c7568e2.f15405native = null;
                c7568e2.f15409try = 0.0d;
                c7568e2.crashlytics();
                c7568e2.f15401extends = false;
                c7568e2.f15406protected = null;
                c7568e = c7568e2;
            }
            if (c7568e != null) {
                m2295class();
                try {
                    try {
                        C1091e c1091e = (C1091e) loadAd();
                        C10988e appmetrica = AbstractC10432e.appmetrica();
                        Parcel m4156e = c1091e.m4156e();
                        AbstractC3336e.vip(m4156e, appmetrica);
                        c1091e.m4151e(m4156e, 1);
                    } finally {
                        super.purchase();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    c18482e.ad(e, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        c18482e.vip("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // defpackage.AbstractC6785e
    public final void tapsense(C14758e c14758e) {
        super.tapsense(c14758e);
        m2295class();
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 12800000;
    }
}
