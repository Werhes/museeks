package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC10242e extends Handler {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public boolean vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC10242e(IBinder.DeathRecipient deathRecipient, Looper looper, int i) {
        super(looper);
        this.ad = i;
        this.metrica = deathRecipient;
        this.vip = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10242e(C13905e c13905e, Looper looper) {
        super(looper);
        this.ad = 0;
        this.metrica = c13905e;
    }

    public boolean ad(Message message, C4456e c4456e) {
        long min;
        C2696e c2696e = (C2696e) message.obj;
        if (c2696e.vip) {
            int i = c2696e.appmetrica + 1;
            c2696e.appmetrica = i;
            if (i <= ((C13905e) this.metrica).startapp.isPro(3)) {
                C6913e c6913e = new C6913e(c4456e.f9665e, c4456e.f9663e, c4456e.f9662e, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c2696e.metrica, c4456e.f9664e);
                C5401e c5401e = ((C13905e) this.metrica).startapp;
                int i2 = c2696e.appmetrica;
                c5401e.getClass();
                for (Throwable iOException = c4456e.getCause() instanceof IOException ? (IOException) c4456e.getCause() : new IOException(c4456e.getCause()); iOException != null; iOException = iOException.getCause()) {
                    if ((iOException instanceof C15125e) || (iOException instanceof FileNotFoundException) || (iOException instanceof C15585e) || (iOException instanceof C11705e) || ((iOException instanceof C18297e) && ((C18297e) iOException).f35943e == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((C13905e) this.metrica).loadAd) {
                    C17974e c17974e = ((C13905e) this.metrica).isPro;
                    if (c17974e != null) {
                        ((C13304e) c17974e.f35233e).metrica(c6913e);
                    }
                }
                synchronized (this) {
                    try {
                        if (this.vip) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), min);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r22) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HandlerC10242e.handleMessage(android.os.Message):void");
    }

    public synchronized void vip() {
        removeCallbacksAndMessages(null);
        this.vip = true;
    }
}
