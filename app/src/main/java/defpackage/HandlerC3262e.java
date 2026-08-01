package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC3262e extends HandlerC9134e {
    public final /* synthetic */ AbstractC6785e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3262e(AbstractC6785e abstractC6785e, Looper looper) {
        super(looper, 7);
        this.ad = abstractC6785e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        AbstractC1600e abstractC1600e;
        AbstractC6785e abstractC6785e = this.ad;
        if (abstractC6785e.isPro.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (abstractC1600e = (AbstractC1600e) message.obj) != null) {
                abstractC1600e.metrica();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !abstractC6785e.pro()) {
            AbstractC1600e abstractC1600e2 = (AbstractC1600e) message.obj;
            if (abstractC1600e2 != null) {
                abstractC1600e2.metrica();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            abstractC6785e.tapsense = new C14758e(message.arg2, null, null);
            if (!abstractC6785e.isVip && !TextUtils.isEmpty(abstractC6785e.Signature()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC6785e.Signature());
                    if (!abstractC6785e.isVip) {
                        abstractC6785e.subs(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            C14758e c14758e = abstractC6785e.tapsense;
            if (c14758e == null) {
                c14758e = new C14758e(8, null, null);
            }
            abstractC6785e.mopub.Signature(c14758e);
            abstractC6785e.tapsense(c14758e);
            return;
        }
        if (i3 == 5) {
            C14758e c14758e2 = abstractC6785e.tapsense;
            if (c14758e2 == null) {
                c14758e2 = new C14758e(8, null, null);
            }
            abstractC6785e.mopub.Signature(c14758e2);
            abstractC6785e.tapsense(c14758e2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            C14758e c14758e3 = new C14758e(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            abstractC6785e.mopub.Signature(c14758e3);
            abstractC6785e.tapsense(c14758e3);
            return;
        }
        if (i3 == 6) {
            abstractC6785e.subs(5, null);
            InterfaceC3440e interfaceC3440e = abstractC6785e.Signature;
            if (interfaceC3440e != null) {
                interfaceC3440e.remoteconfig(message.arg2);
            }
            abstractC6785e.isVip(message.arg2);
            abstractC6785e.ads(5, 1, null);
            return;
        }
        if (i3 == 2 && !abstractC6785e.remoteconfig()) {
            AbstractC1600e abstractC1600e3 = (AbstractC1600e) message.obj;
            if (abstractC1600e3 != null) {
                abstractC1600e3.metrica();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", AbstractC8647e.isPro(i4, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i4).length() + 34)), new Exception());
            return;
        }
        AbstractC1600e abstractC1600e4 = (AbstractC1600e) message.obj;
        synchronized (abstractC1600e4) {
            try {
                bool = abstractC1600e4.ad;
                if (abstractC1600e4.vip) {
                    String obj2 = abstractC1600e4.toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC6785e abstractC6785e2 = abstractC1600e4.purchase;
            int i5 = abstractC1600e4.license;
            if (i5 != 0) {
                abstractC6785e2.subs(1, null);
                Bundle bundle = abstractC1600e4.appmetrica;
                abstractC1600e4.vip(new C14758e(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!abstractC1600e4.ad()) {
                abstractC6785e2.subs(1, null);
                abstractC1600e4.vip(new C14758e(8, null, null));
            }
        }
        synchronized (abstractC1600e4) {
            abstractC1600e4.vip = true;
        }
        abstractC1600e4.metrica();
    }
}
