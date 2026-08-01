package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC17738e implements Handler.Callback, ServiceConnection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Handler f34808e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f34810e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final HashMap f34807e = new HashMap();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Set f34809e = new HashSet();

    public ServiceConnectionC17738e(Context context) {
        this.f34810e = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f34808e = new Handler(handlerThread.getLooper(), this);
    }

    public final void ad(C6231e c6231e) {
        boolean z;
        ArrayDeque arrayDeque = c6231e.license;
        ComponentName componentName = c6231e.ad;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c6231e.vip) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f34810e;
            boolean bindService = context.bindService(component, this, 33);
            c6231e.vip = bindService;
            if (bindService) {
                c6231e.appmetrica = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c6231e.vip;
        }
        if (!z || c6231e.metrica == null) {
            vip(c6231e);
            return;
        }
        while (true) {
            C3964e c3964e = (C3964e) arrayDeque.peek();
            if (c3964e == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c3964e);
                }
                c3964e.ad(c6231e.metrica);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        vip(c6231e);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [eؕٔۥ, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        InterfaceC12360e interfaceC12360e = null;
        Context context = this.f34810e;
        HashMap hashMap = this.f34807e;
        if (i == 0) {
            C3964e c3964e = (C3964e) message.obj;
            Set ad = C1582e.ad(context);
            if (!ad.equals(this.f34809e)) {
                this.f34809e = ad;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (((HashSet) ad).contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!hashMap.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        hashMap.put(componentName2, new C6231e(componentName2));
                    }
                }
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C6231e c6231e = (C6231e) entry.getValue();
                        if (c6231e.vip) {
                            context.unbindService(this);
                            c6231e.vip = false;
                        }
                        c6231e.metrica = null;
                        it2.remove();
                    }
                }
            }
            for (C6231e c6231e2 : hashMap.values()) {
                c6231e2.license.add(c3964e);
                ad(c6231e2);
            }
        } else if (i == 1) {
            C12758e c12758e = (C12758e) message.obj;
            ComponentName componentName3 = c12758e.ad;
            IBinder iBinder = c12758e.vip;
            C6231e c6231e3 = (C6231e) hashMap.get(componentName3);
            if (c6231e3 != null) {
                int i2 = AbstractBinderC0412e.metrica;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC12360e.ad);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC12360e)) {
                        ?? obj = new Object();
                        obj.metrica = iBinder;
                        interfaceC12360e = obj;
                    } else {
                        interfaceC12360e = (InterfaceC12360e) queryLocalInterface;
                    }
                }
                c6231e3.metrica = interfaceC12360e;
                c6231e3.appmetrica = 0;
                ad(c6231e3);
                return true;
            }
        } else if (i == 2) {
            C6231e c6231e4 = (C6231e) hashMap.get((ComponentName) message.obj);
            if (c6231e4 != null) {
                if (c6231e4.vip) {
                    context.unbindService(this);
                    c6231e4.vip = false;
                }
                c6231e4.metrica = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C6231e c6231e5 = (C6231e) hashMap.get((ComponentName) message.obj);
            if (c6231e5 != null) {
                ad(c6231e5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f34808e.obtainMessage(1, new C12758e(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f34808e.obtainMessage(2, componentName).sendToTarget();
    }

    public final void vip(C6231e c6231e) {
        ComponentName componentName = c6231e.ad;
        ArrayDeque arrayDeque = c6231e.license;
        Handler handler = this.f34808e;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c6231e.appmetrica;
        int i2 = i + 1;
        c6231e.appmetrica = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c6231e.appmetrica + " retries");
        arrayDeque.clear();
    }
}
