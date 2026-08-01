package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2360e implements Runnable {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static Boolean f5903e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static Boolean f5904e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f5905e = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f5906e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f5907e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f5908e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f5909e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5910e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f5911e;

    public RunnableC2360e(C5976e c5976e, InputStream inputStream, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, long j, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2) {
        this.f5910e = 1;
        this.f5907e = inputStream;
        this.f5909e = autoCloseOutputStream;
        this.f5908e = j;
        this.f5906e = autoCloseOutputStream2;
        this.f5911e = c5976e;
    }

    public RunnableC2360e(C10693e c10693e, Bundle bundle, C13288e c13288e, C13288e c13288e2, long j) {
        this.f5910e = 4;
        this.f5907e = bundle;
        this.f5909e = c13288e;
        this.f5906e = c13288e2;
        this.f5908e = j;
        Objects.requireNonNull(c10693e);
        this.f5911e = c10693e;
    }

    public RunnableC2360e(C10953e c10953e, Context context, C6148e c6148e, long j) {
        this.f5910e = 0;
        this.f5911e = c10953e;
        this.f5907e = context;
        this.f5908e = j;
        this.f5909e = c6148e;
        this.f5906e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public /* synthetic */ RunnableC2360e(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f5910e = i;
        this.f5907e = str;
        this.f5909e = str2;
        this.f5906e = obj2;
        this.f5908e = j;
        this.f5911e = obj;
    }

    public static boolean ad(Context context) {
        boolean booleanValue;
        synchronized (f5905e) {
            try {
                Boolean bool = f5904e;
                Boolean valueOf = Boolean.valueOf(bool == null ? vip(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f5904e = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean metrica(Context context) {
        boolean booleanValue;
        synchronized (f5905e) {
            try {
                Boolean bool = f5903e;
                Boolean valueOf = Boolean.valueOf(bool == null ? vip(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f5903e = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean vip(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public synchronized boolean license() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f5907e).getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputStream inputStream;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        byte[] bArr;
        boolean z = true;
        switch (this.f5910e) {
            case 0:
                C10953e c10953e = (C10953e) this.f5911e;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f5906e;
                Context context = (Context) this.f5907e;
                if (metrica(context)) {
                    wakeLock.acquire(AbstractC12913e.ad);
                }
                try {
                    try {
                        c10953e.purchase(true);
                        if (!((C6148e) this.f5909e).mopub()) {
                            c10953e.purchase(false);
                            if (!metrica(context)) {
                                return;
                            }
                        } else if (!ad(context) || license()) {
                            if (c10953e.billing()) {
                                c10953e.purchase(false);
                            } else {
                                c10953e.yandex(this.f5908e);
                            }
                            if (!metrica(context)) {
                                return;
                            }
                        } else {
                            new C6215e(this, this).ad();
                            if (!metrica(context)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (metrica(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    c10953e.purchase(false);
                    if (!metrica(context)) {
                        return;
                    }
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    return;
                }
            case 1:
                try {
                    inputStream = (InputStream) this.f5907e;
                    autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f5909e;
                    bArr = new byte[65536];
                } catch (IOException e2) {
                    try {
                        if (((C5976e) this.f5911e).metrica) {
                            Log.d("NearbyConnections", String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.f5908e)));
                        } else {
                            Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.f5908e)), e2);
                        }
                        AbstractC2206e.ad((InputStream) this.f5907e);
                        C5976e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5906e, true, this.f5908e);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC2206e.ad((InputStream) this.f5907e);
                        C5976e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5906e, z, this.f5908e);
                        AbstractC2206e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5909e);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                    AbstractC2206e.ad((InputStream) this.f5907e);
                    C5976e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5906e, z, this.f5908e);
                    AbstractC2206e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5909e);
                    throw th;
                }
                while (true) {
                    int read = inputStream.read(bArr, 0, 65536);
                    if (read == -1) {
                        AbstractC2206e.ad((InputStream) this.f5907e);
                        C5976e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5906e, false, this.f5908e);
                        AbstractC2206e.ad((ParcelFileDescriptor.AutoCloseOutputStream) this.f5909e);
                        return;
                    }
                    autoCloseOutputStream.write(bArr, 0, read);
                }
            case 2:
                String str = (String) this.f5909e;
                BinderC14884e binderC14884e = (BinderC14884e) this.f5911e;
                String str2 = (String) this.f5907e;
                if (str2 == null) {
                    C15398e c15398e = binderC14884e.metrica;
                    c15398e.mo2262e().mo2250e();
                    String str3 = c15398e.f30376e;
                    if (str3 == null || str3.equals(str)) {
                        c15398e.f30376e = str;
                        c15398e.f30358e = null;
                        return;
                    }
                    return;
                }
                C13288e c13288e = new C13288e(this.f5908e, (String) this.f5906e, str2);
                C15398e c15398e2 = binderC14884e.metrica;
                c15398e2.mo2262e().mo2250e();
                String str4 = c15398e2.f30376e;
                if (str4 != null) {
                    str4.equals(str);
                }
                c15398e2.f30376e = str;
                c15398e2.f30358e = c13288e;
                return;
            case 3:
                ((C8320e) this.f5911e).m2413e(this.f5908e, this.f5906e, (String) this.f5907e, (String) this.f5909e);
                return;
            default:
                Bundle bundle = (Bundle) this.f5907e;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C10693e c10693e = (C10693e) this.f5911e;
                C5240e c5240e = ((C6936e) c10693e.f36443e).f14223e;
                C6936e.purchase(c5240e);
                c10693e.m2909e((C13288e) this.f5909e, (C13288e) this.f5906e, this.f5908e, true, c5240e.m1824e("screen_view", bundle, null, false));
                return;
        }
    }
}
