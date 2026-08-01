package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14369e implements Handler.Callback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f28421e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28422e;

    public /* synthetic */ C14369e(int i, Object obj) {
        this.f28422e = i;
        this.f28421e = obj;
    }

    private final boolean ad(Message message) {
        if (message.what != 0) {
            return false;
        }
        C17974e c17974e = (C17974e) this.f28421e;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c17974e.f35233e) {
            throw null;
        }
    }

    private final boolean vip(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i);
        }
        ServiceConnectionC15550e serviceConnectionC15550e = (ServiceConnectionC15550e) this.f28421e;
        synchronized (serviceConnectionC15550e) {
            try {
                C2680e c2680e = (C2680e) serviceConnectionC15550e.f30701e.get(i);
                if (c2680e == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                serviceConnectionC15550e.f30701e.remove(i);
                serviceConnectionC15550e.metrica();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    c2680e.vip(new C2123e(16, "Not supported by GmsCore", null));
                    return true;
                }
                switch (c2680e.appmetrica) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            c2680e.metrica(null);
                            return true;
                        }
                        c2680e.vip(new C2123e(16, "Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        c2680e.metrica(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f28422e) {
            case 0:
                return ad(message);
            case 1:
                return vip(message);
            default:
                int i = message.what;
                if (i == 0) {
                    C14864e c14864e = (C14864e) this.f28421e;
                    synchronized (c14864e.ad) {
                        try {
                            C5605e c5605e = (C5605e) message.obj;
                            ServiceConnectionC11808e serviceConnectionC11808e = (ServiceConnectionC11808e) c14864e.ad.get(c5605e);
                            if (serviceConnectionC11808e != null && serviceConnectionC11808e.f23686e.isEmpty()) {
                                if (serviceConnectionC11808e.f23683e) {
                                    C5605e c5605e2 = serviceConnectionC11808e.f23682e;
                                    C14864e c14864e2 = serviceConnectionC11808e.f23687e;
                                    c14864e2.metrica.removeMessages(1, c5605e2);
                                    c14864e2.license.metrica(c14864e2.vip, serviceConnectionC11808e);
                                    serviceConnectionC11808e.f23683e = false;
                                    serviceConnectionC11808e.f23684e = 2;
                                }
                                c14864e.ad.remove(c5605e);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    C14864e c14864e3 = (C14864e) this.f28421e;
                    synchronized (c14864e3.ad) {
                        try {
                            C5605e c5605e3 = (C5605e) message.obj;
                            ServiceConnectionC11808e serviceConnectionC11808e2 = (ServiceConnectionC11808e) c14864e3.ad.get(c5605e3);
                            if (serviceConnectionC11808e2 != null && serviceConnectionC11808e2.f23684e == 3) {
                                String valueOf = String.valueOf(c5605e3);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(valueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = serviceConnectionC11808e2.f23688e;
                                if (componentName == null) {
                                    c5605e3.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = c5605e3.vip;
                                    AbstractC9528e.startapp(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                serviceConnectionC11808e2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
