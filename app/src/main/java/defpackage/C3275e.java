package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3275e implements Handler.Callback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7426e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7427e;

    public /* synthetic */ C3275e(int i, Object obj) {
        this.f7427e = i;
        this.f7426e = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f7427e) {
            case 0:
                C0222e c0222e = (C0222e) this.f7426e;
                InterfaceC14173e interfaceC14173e = (InterfaceC14173e) c0222e.appmetrica;
                interfaceC14173e.getClass();
                Iterator it = ((CopyOnWriteArraySet) c0222e.purchase).iterator();
                while (it.hasNext()) {
                    C12587e c12587e = (C12587e) it.next();
                    if (!c12587e.license && c12587e.metrica) {
                        C11715e appmetrica = c12587e.vip.appmetrica();
                        c12587e.vip = new C16722e(5);
                        c12587e.metrica = false;
                        interfaceC14173e.adcel(c12587e.ad, appmetrica);
                    }
                    C2399e c2399e = (C2399e) c0222e.license;
                    c2399e.getClass();
                    if (c2399e.ad.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                C10312e c10312e = (C10312e) this.f7426e;
                if (message.what == 1) {
                    try {
                        C4275e c4275e = (C4275e) c10312e.f20360e;
                        c4275e.crashlytics.mo989e(c4275e.metrica);
                    } catch (RemoteException unused) {
                        AbstractC2803e.smaato("MCImplBase", "Error in sending flushCommandQueue");
                    }
                }
                return true;
            case 2:
                C1861e c1861e = (C1861e) this.f7426e;
                c1861e.getClass();
                if (message.what == 1) {
                    C12621e c12621e = c1861e.appmetrica;
                    c12621e.yandex(false, c12621e.amazon);
                }
                return true;
            default:
                C14742e c14742e = (C14742e) this.f7426e;
                c14742e.getClass();
                int i = message.what;
                if (i == 1) {
                    ((C8789e) c14742e.yandex).ad();
                    return true;
                }
                if (i == 2) {
                    ((C2810e) c14742e.startapp).ad();
                    return true;
                }
                if (i == 3) {
                    ((C9241e) c14742e.adcel).ad();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                ((C17493e) c14742e.mopub).ad();
                return true;
        }
    }
}
