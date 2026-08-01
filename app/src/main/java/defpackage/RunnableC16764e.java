package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC16764e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f32849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f32850e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32851e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32852e;

    public /* synthetic */ RunnableC16764e(AbstractC1037e abstractC1037e, C8928e c8928e, InterfaceC9610e interfaceC9610e, int i) {
        this.f32852e = 0;
        this.f32849e = abstractC1037e;
        this.f32851e = interfaceC9610e;
        this.f32850e = i;
    }

    public /* synthetic */ RunnableC16764e(Object obj, int i, Object obj2, int i2) {
        this.f32852e = i2;
        this.f32849e = obj;
        this.f32850e = i;
        this.f32851e = obj2;
    }

    public /* synthetic */ RunnableC16764e(Object obj, Object obj2, int i, int i2) {
        this.f32852e = i2;
        this.f32849e = obj;
        this.f32851e = obj2;
        this.f32850e = i;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [eٕۤٙ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C9759e c9759e;
        switch (this.f32852e) {
            case 0:
                ((AbstractC1037e) this.f32849e).license(C8928e.metrica((InterfaceC9610e) this.f32851e), this.f32850e);
                return;
            case 1:
                C6127e c6127e = (C6127e) this.f32849e;
                Serializable serializable = (Serializable) ((C2362e) this.f32851e).f5914e;
                String str = (String) c6127e.ad.get(Integer.valueOf(this.f32850e));
                if (str == null) {
                    return;
                }
                C14633e c14633e = (C14633e) c6127e.appmetrica.get(str);
                if ((c14633e != null ? c14633e.ad : null) == null) {
                    c6127e.billing.remove(str);
                    c6127e.purchase.put(str, serializable);
                    return;
                } else {
                    InterfaceC17091e interfaceC17091e = c14633e.ad;
                    if (c6127e.license.remove(str)) {
                        interfaceC17091e.purchase(serializable);
                        return;
                    }
                    return;
                }
            case 2:
                ((C6127e) this.f32849e).ad(this.f32850e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f32851e));
                return;
            case 3:
                ((InterfaceC4732e) ((C2254e) this.f32849e).f5732e).mopub(this.f32850e, this.f32851e);
                return;
            case 4:
                C15683e c15683e = (C15683e) this.f32849e;
                this.f32851e.advert(c15683e.ad, c15683e.vip, this.f32850e);
                return;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f32849e;
                InterfaceC12504e interfaceC12504e = (InterfaceC12504e) this.f32851e;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    C12587e c12587e = (C12587e) it.next();
                    if (!c12587e.license) {
                        int i = this.f32850e;
                        if (i != -1) {
                            c12587e.vip.ad(i);
                        }
                        c12587e.metrica = true;
                        interfaceC12504e.invoke(c12587e.ad);
                    }
                }
                return;
            case 6:
                C4275e c4275e = (C4275e) this.f32849e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f32851e;
                int i2 = this.f32850e;
                try {
                    c9759e = (C9759e) listenableFuture.get();
                    AbstractC2301e.amazon(c9759e, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    AbstractC2803e.amazon("MCImplBase", "Session operation failed", e);
                    c9759e = new C9759e(-1);
                } catch (CancellationException e2) {
                    AbstractC2803e.amazon("MCImplBase", "Session operation cancelled", e2);
                    c9759e = new C9759e(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    AbstractC2803e.amazon("MCImplBase", "Session operation failed", e);
                    c9759e = new C9759e(-1);
                }
                InterfaceC3001e interfaceC3001e = c4275e.crashlytics;
                if (interfaceC3001e == null) {
                    return;
                }
                try {
                    interfaceC3001e.subs(c4275e.metrica, i2, c9759e.vip());
                    return;
                } catch (RemoteException unused) {
                    AbstractC2803e.smaato("MCImplBase", "Error in sending");
                    return;
                }
            default:
                C17669e c17669e = (C17669e) this.f32849e;
                Pair pair = (Pair) this.f32851e;
                ((C4174e) c17669e.f34628e.startapp).advert(((Integer) pair.first).intValue(), (C18208e) pair.second, this.f32850e);
                return;
        }
    }
}
