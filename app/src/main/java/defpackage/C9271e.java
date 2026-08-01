package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9271e implements InterfaceC17847e, InterfaceC7898e, InterfaceC1106e, InterfaceC0771e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f18485e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f18486e;

    public C9271e() {
        this.f18486e = new TreeMap();
        this.f18485e = new TreeMap();
    }

    public C9271e(Context context) {
        this.f18486e = context;
    }

    public C9271e(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f18486e = new Messenger(iBinder);
            this.f18485e = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f18485e = new C3773e(iBinder);
            this.f18486e = null;
        }
    }

    public C9271e(C0912e c0912e) {
        this.f18485e = new Object();
        this.f18486e = c0912e;
        C14914e.subscription();
    }

    public /* synthetic */ C9271e(AbstractC6950e abstractC6950e, Object obj) {
        this.f18486e = abstractC6950e;
        this.f18485e = obj;
    }

    public C9271e(C13300e c13300e, C17659e c17659e) {
        this.f18486e = c17659e;
        Objects.requireNonNull(c13300e);
        this.f18485e = c13300e;
    }

    public /* synthetic */ C9271e(String str, List list) {
        this.f18485e = str;
        this.f18486e = list;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        C4612e c4612e = (C4612e) this.f18486e;
        String str = (String) this.f18485e;
        C4379e c4379e = (C4379e) obj;
        AbstractC9528e.mopub("Not connected to device", c4612e.f9941class == 3);
        C1091e c1091e = (C1091e) c4379e.loadAd();
        C10988e appmetrica = AbstractC10432e.appmetrica();
        Parcel m4156e = c1091e.m4156e();
        m4156e.writeString(str);
        AbstractC3336e.vip(m4156e, appmetrica);
        c1091e.m4151e(m4156e, 5);
        synchronized (c4612e.remoteconfig) {
            try {
                if (c4612e.Signature != null) {
                    c8988e.ad(AbstractC9600e.vip(new Status(2001, null, null, null)));
                } else {
                    c4612e.Signature = c8988e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1106e
    public void ad(Bitmap bitmap) {
        C17659e c17659e = (C17659e) this.f18486e;
        c17659e.f34612e = bitmap;
        C13300e c13300e = (C13300e) this.f18485e;
        c13300e.advert = c17659e;
        c13300e.ad();
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        boolean z = c0560e.startapp() instanceof C3491e;
        C10315e c10315e = (C10315e) this.f18485e;
        C3355e c3355e = (C3355e) this.f18486e;
        if (z) {
            return c3355e.purchase(c10315e.signatures());
        }
        if (!(c0560e.startapp() instanceof C10427e)) {
            return c0560e;
        }
        C10427e c10427e = (C10427e) c0560e.startapp();
        c10427e.getClass();
        return c10427e.f20605e.f733e == 29514 ? c3355e.purchase(c10315e.signatures()) : c0560e;
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        C8130e c8130e = (C8130e) this.f18486e;
        C18473e c18473e = (C18473e) this.f18485e;
        c8130e.getClass();
        if (c18473e.f36208e) {
            Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
        }
    }

    public void metrica(C11467e c11467e, C6029e c6029e) {
        C16816e c16816e = new C16816e(c6029e);
        TreeMap treeMap = (TreeMap) this.f18486e;
        for (Integer num : treeMap.keySet()) {
            C6354e clone = ((C6354e) c6029e.f12698e).clone();
            InterfaceC2268e ad = ((C1105e) treeMap.get(num)).ad(c11467e, Collections.singletonList(c16816e));
            int admob = ad instanceof C6020e ? AbstractC8677e.admob(((C6020e) ad).f12678e.doubleValue()) : -1;
            if (admob == 2 || admob == -1) {
                c6029e.f12698e = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f18485e;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC2268e ad2 = ((C1105e) treeMap2.get((Integer) it.next())).ad(c11467e, Collections.singletonList(c16816e));
            if (ad2 instanceof C6020e) {
                AbstractC8677e.admob(((C6020e) ad2).f12678e.doubleValue());
            }
        }
    }

    public String vip() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.f18485e;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection<String> collection = (Collection) this.f18486e;
        boolean z = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String str2 : collection) {
                AbstractC5942e.vip(str2);
                if (!z3) {
                    sb.append(",");
                }
                if (!AbstractC5942e.ad.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
