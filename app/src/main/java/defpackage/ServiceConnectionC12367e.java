package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC12367e extends AbstractC9410e implements ServiceConnection {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final /* synthetic */ int f24793e = 0;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f24794e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f24795e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final HandlerC9134e f24796e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C17527e f24797e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f24798e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C2007e f24799e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final ArrayList f24800e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final ComponentName f24801e;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eٌۧؗ, android.os.Handler] */
    public ServiceConnectionC12367e(Context context, ComponentName componentName) {
        super(context, new C2362e(19, componentName));
        this.f24800e = new ArrayList();
        this.f24801e = componentName;
        this.f24796e = new Handler();
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC16709e ad(String str, C17039e c17039e) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        C13486e c13486e = this.f18733e;
        if (c13486e == null) {
            return null;
        }
        List list = c13486e.vip;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C16289e) list.get(i)).license().equals(str)) {
                C18267e c18267e = new C18267e(this, str, c17039e);
                this.f24800e.add(c18267e);
                if (this.f24798e) {
                    c18267e.vip(this.f24797e);
                }
                advert();
                return c18267e;
            }
        }
        return null;
    }

    public final void adcel() {
        if (this.f24797e != null) {
            purchase(null);
            this.f24798e = false;
            ArrayList arrayList = this.f24800e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6380e) arrayList.get(i)).metrica();
            }
            C17527e c17527e = this.f24797e;
            c17527e.vip(2, 0, 0, null, null);
            c17527e.vip.vip.clear();
            c17527e.ad.getBinder().unlinkToDeath(c17527e, 0);
            c17527e.startapp.f24796e.post(new RunnableC3682e(c17527e, 0));
            this.f24797e = null;
        }
    }

    public final void advert() {
        if (!this.f24795e || (this.f18727e == null && this.f24800e.isEmpty())) {
            mopub();
        } else {
            yandex();
        }
    }

    @Override // defpackage.AbstractC9410e
    public final void appmetrica(C13882e c13882e) {
        if (this.f24798e) {
            C17527e c17527e = this.f24797e;
            int i = c17527e.license;
            c17527e.license = i + 1;
            c17527e.vip(10, i, 0, c13882e != null ? c13882e.ad : null, null);
        }
        advert();
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC13922e license(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return startapp(str, str2, C17039e.vip);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC13922e metrica(String str, C17039e c17039e) {
        if (str != null) {
            return startapp(str, null, c17039e);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void mopub() {
        if (this.f24794e) {
            this.f24794e = false;
            adcel();
            try {
                this.f18732e.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f24794e) {
            adcel();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        C17527e c17527e = new C17527e(this, messenger);
                        int i = c17527e.license;
                        c17527e.license = i + 1;
                        c17527e.billing = i;
                        if (c17527e.vip(1, i, 4, null, null)) {
                            try {
                                c17527e.ad.getBinder().linkToDeath(c17527e, 0);
                                this.f24797e = c17527e;
                                return;
                            } catch (RemoteException unused) {
                                c17527e.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        adcel();
    }

    public final C0924e startapp(String str, String str2, C17039e c17039e) {
        C13486e c13486e = this.f18733e;
        if (c13486e == null) {
            return null;
        }
        List list = c13486e.vip;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C16289e) list.get(i)).license().equals(str)) {
                C0924e c0924e = new C0924e(this, str, str2, c17039e);
                this.f24800e.add(c0924e);
                if (this.f24798e) {
                    c0924e.vip(this.f24797e);
                }
                advert();
                return c0924e;
            }
        }
        return null;
    }

    public final String toString() {
        return "Service connection " + this.f24801e.flattenToShortString();
    }

    public final void yandex() {
        if (this.f24794e) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f24801e);
        try {
            this.f24794e = this.f18732e.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }
}
