package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC5641e extends Handler {
    public boolean ad;
    public final /* synthetic */ C6584e metrica;
    public boolean vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5641e(C6584e c6584e, Looper looper) {
        super(looper);
        this.metrica = c6584e;
        this.ad = true;
        this.vip = true;
    }

    public final void ad(boolean z, boolean z2) {
        boolean z3 = false;
        this.ad = this.ad && z;
        if (this.vip && z2) {
            z3 = true;
        }
        this.vip = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C18424e c18424e;
        int i;
        C2411e c2411e;
        C6584e c6584e = this.metrica;
        BinderC17428e binderC17428e = c6584e.billing;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        C2411e amazon = c6584e.remoteconfig.amazon(c6584e.pro.m2073e(), c6584e.pro.m2087e(), c6584e.remoteconfig.mopub);
        c6584e.remoteconfig = amazon;
        boolean z = this.ad;
        boolean z2 = this.vip;
        C2411e m4325e = binderC17428e.m4325e(amazon);
        C11106e c11106e = binderC17428e.license;
        AbstractC17475e m3014native = c11106e.m3014native();
        for (int i2 = 0; i2 < m3014native.size(); i2++) {
            C18424e c18424e2 = (C18424e) m3014native.get(i2);
            try {
                C18100e m3000break = c11106e.m3000break(c18424e2);
                if (m3000break != null) {
                    i = m3000break.purchase();
                } else if (!c6584e.smaato(c18424e2)) {
                    break;
                } else {
                    i = 0;
                }
                C2411e m3018protected = c11106e.m3018protected(c18424e2);
                if (m3018protected == null) {
                    c11106e.m3027try(c18424e2);
                    C5298e license = AbstractC1008e.license(c11106e.m3013interface(c18424e2), c6584e.pro.firebase());
                    try {
                        InterfaceC10645e interfaceC10645e = c18424e2.license;
                        interfaceC10645e.getClass();
                        if (m3018protected == null) {
                            c18424e = c18424e2;
                            c2411e = m4325e;
                        } else {
                            c18424e = c18424e2;
                            c2411e = m3018protected;
                        }
                        try {
                            interfaceC10645e.smaato(i, c2411e, license, z, z2);
                        } catch (DeadObjectException unused) {
                            binderC17428e.license.m3020static(c18424e);
                        } catch (RemoteException e) {
                            e = e;
                            AbstractC2803e.amazon("MediaSessionImpl", "Exception in " + c18424e, e);
                        }
                    } catch (DeadObjectException unused2) {
                        c18424e = c18424e2;
                    } catch (RemoteException e2) {
                        e = e2;
                        c18424e = c18424e2;
                    }
                }
            } catch (DeadObjectException unused3) {
                c18424e = c18424e2;
            } catch (RemoteException e3) {
                e = e3;
                c18424e = c18424e2;
            }
        }
        this.ad = true;
        this.vip = true;
    }
}
