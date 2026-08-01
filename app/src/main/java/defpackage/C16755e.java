package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16755e {
    public final AbstractC13922e ad;
    public final C6541e appmetrica;
    public final ArrayList billing;
    public final C6541e license;
    public final boolean metrica;
    public final C6541e purchase;
    public final int vip;
    public final WeakReference yandex;
    public boolean startapp = false;
    public boolean adcel = false;

    public C16755e(C14090e c14090e, C6541e c6541e, AbstractC13922e abstractC13922e, int i, boolean z, C6541e c6541e2, Collection collection) {
        this.yandex = new WeakReference(c14090e);
        this.appmetrica = c6541e;
        this.ad = abstractC13922e;
        this.vip = i;
        this.metrica = z;
        this.license = c14090e.license;
        this.purchase = c6541e2;
        this.billing = collection == null ? null : new ArrayList(collection);
        c14090e.ad.postDelayed(new RunnableC2783e(19, this), 15000L);
    }

    public final void ad() {
        C14756e ad;
        C10085e.vip();
        if (this.startapp || this.adcel) {
            return;
        }
        WeakReference weakReference = this.yandex;
        C14090e c14090e = (C14090e) weakReference.get();
        AbstractC13922e abstractC13922e = this.ad;
        if (c14090e == null || c14090e.purchase != this) {
            if (this.startapp || this.adcel) {
                return;
            }
            this.adcel = true;
            if (abstractC13922e != null) {
                abstractC13922e.yandex(0);
                abstractC13922e.license();
                return;
            }
            return;
        }
        this.startapp = true;
        c14090e.purchase = null;
        C14090e c14090e2 = (C14090e) weakReference.get();
        C6541e c6541e = this.license;
        int i = this.vip;
        if (c14090e2 != null) {
            HashMap hashMap = c14090e2.vip;
            if (c14090e2.license == c6541e) {
                Message obtainMessage = c14090e2.ad.obtainMessage(263, c6541e);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                AbstractC13922e abstractC13922e2 = c14090e2.appmetrica;
                if (abstractC13922e2 != null) {
                    abstractC13922e2.yandex(i);
                    c14090e2.appmetrica.license();
                }
                if (!hashMap.isEmpty()) {
                    for (AbstractC13922e abstractC13922e3 : hashMap.values()) {
                        abstractC13922e3.yandex(i);
                        abstractC13922e3.license();
                    }
                    hashMap.clear();
                }
                c14090e2.appmetrica = null;
            }
        }
        C14090e c14090e3 = (C14090e) weakReference.get();
        if (c14090e3 == null) {
            return;
        }
        HandlerC15673e handlerC15673e = c14090e3.ad;
        C6541e c6541e2 = this.appmetrica;
        c14090e3.license = c6541e2;
        c14090e3.appmetrica = abstractC13922e;
        boolean z = this.metrica;
        C6541e c6541e3 = this.purchase;
        if (c6541e3 == null) {
            handlerC15673e.getClass();
            Message obtainMessage2 = handlerC15673e.obtainMessage(262, new C12957e(c6541e, c6541e2, z));
            obtainMessage2.arg1 = i;
            obtainMessage2.sendToTarget();
        } else {
            handlerC15673e.getClass();
            Message obtainMessage3 = handlerC15673e.obtainMessage(264, new C12957e(c6541e3, c6541e2, z));
            obtainMessage3.arg1 = i;
            obtainMessage3.sendToTarget();
        }
        c14090e3.vip.clear();
        c14090e3.adcel();
        c14090e3.amazon();
        ArrayList arrayList = this.billing;
        if (arrayList == null || (ad = c14090e3.license.ad()) == null) {
            return;
        }
        ad.Signature(arrayList);
    }
}
