package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2698e {
    public ServiceConnectionC0847e ad;
    public C9174e appmetrica;
    public final long billing;
    public final Object license = new Object();
    public boolean metrica;
    public final Context purchase;
    public InterfaceC1149e vip;

    public C2698e(Context context) {
        AbstractC9528e.startapp(context);
        Context applicationContext = context.getApplicationContext();
        this.purchase = applicationContext != null ? applicationContext : context;
        this.metrica = false;
        this.billing = -1L;
    }

    public static C1190e ad(Context context) {
        C2698e c2698e = new C2698e(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c2698e.metrica();
            C1190e appmetrica = c2698e.appmetrica();
            license(appmetrica, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return appmetrica;
        } finally {
        }
    }

    public static void license(C1190e c1190e, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c1190e != null) {
                hashMap.put("limit_ad_tracking", true != c1190e.vip ? "0" : "1");
                String str = c1190e.metrica;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C16667e(hashMap).start();
        }
    }

    public final C1190e appmetrica() {
        C1190e c1190e;
        AbstractC9528e.yandex("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.metrica) {
                    synchronized (this.license) {
                        C9174e c9174e = this.appmetrica;
                        if (c9174e == null || !c9174e.f18349e) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        metrica();
                        if (!this.metrica) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                AbstractC9528e.startapp(this.ad);
                AbstractC9528e.startapp(this.vip);
                try {
                    C12683e c12683e = (C12683e) this.vip;
                    c12683e.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel adcel = c12683e.adcel(obtain, 1);
                    String readString = adcel.readString();
                    adcel.recycle();
                    C12683e c12683e2 = (C12683e) this.vip;
                    c12683e2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC13444e.ad;
                    obtain2.writeInt(1);
                    Parcel adcel2 = c12683e2.adcel(obtain2, 2);
                    if (adcel2.readInt() == 0) {
                        z = false;
                    }
                    adcel2.recycle();
                    c1190e = new C1190e(readString, z, 0);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        purchase();
        return c1190e;
    }

    public final void finalize() {
        vip();
        super.finalize();
    }

    public final void metrica() {
        AbstractC9528e.yandex("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.metrica) {
                    vip();
                }
                Context context = this.purchase;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int metrica = C17991e.vip.metrica(context, 12451000);
                    if (metrica != 0 && metrica != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0847e serviceConnectionC0847e = new ServiceConnectionC0847e();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C5459e.vip().ad(context, intent, serviceConnectionC0847e, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.ad = serviceConnectionC0847e;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder ad = serviceConnectionC0847e.ad();
                            int i = AbstractBinderC1070e.metrica;
                            IInterface queryLocalInterface = ad.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.vip = queryLocalInterface instanceof InterfaceC1149e ? (InterfaceC1149e) queryLocalInterface : new C12683e(ad);
                            this.metrica = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void purchase() {
        synchronized (this.license) {
            C9174e c9174e = this.appmetrica;
            if (c9174e != null) {
                c9174e.f18347e.countDown();
                try {
                    this.appmetrica.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.billing;
            if (j > 0) {
                this.appmetrica = new C9174e(this, j);
            }
        }
    }

    public final void vip() {
        AbstractC9528e.yandex("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.purchase == null || this.ad == null) {
                    return;
                }
                try {
                    if (this.metrica) {
                        C5459e.vip().metrica(this.purchase, this.ad);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.metrica = false;
                this.vip = null;
                this.ad = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
