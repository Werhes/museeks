package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11063e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21950e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f21951e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f21952e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f21953e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21954e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f21955e;

    public /* synthetic */ RunnableC11063e(C5537e c5537e, C11858e c11858e, int i, C18287e c18287e, InterfaceC6995e interfaceC6995e) {
        this.f21954e = 1;
        this.f21951e = c5537e;
        this.f21953e = c11858e;
        this.f21952e = i;
        this.f21950e = c18287e;
        this.f21955e = interfaceC6995e;
    }

    public /* synthetic */ RunnableC11063e(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f21954e = i2;
        this.f21951e = obj;
        this.f21953e = obj2;
        this.f21950e = obj3;
        this.f21955e = obj4;
        this.f21952e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.f21954e) {
            case 0:
                C12621e c12621e = (C12621e) this.f21951e;
                AtomicInteger atomicInteger = (AtomicInteger) this.f21953e;
                List list = (List) this.f21950e;
                ArrayList arrayList = (ArrayList) this.f21955e;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ListenableFuture listenableFuture = (ListenableFuture) arrayList.get(i);
                        if (listenableFuture != null) {
                            try {
                                bitmap = (Bitmap) AbstractC2017e.vip(listenableFuture);
                            } catch (CancellationException | ExecutionException e) {
                                AbstractC2803e.appmetrica("MCImplLegacy", "Failed to get bitmap", e);
                            }
                            c12621e.startapp.isPro(AbstractC13256e.startapp((C1962e) list.get(i), bitmap), this.f21952e + i);
                        }
                        bitmap = null;
                        c12621e.startapp.isPro(AbstractC13256e.startapp((C1962e) list.get(i), bitmap), this.f21952e + i);
                    }
                    return;
                }
                return;
            case 1:
                C5537e c5537e = (C5537e) this.f21951e;
                C11858e c11858e = (C11858e) this.f21953e;
                C18287e c18287e = (C18287e) this.f21950e;
                InterfaceC6995e interfaceC6995e = (InterfaceC6995e) this.f21955e;
                C11106e c11106e = c5537e.billing;
                if (c5537e.yandex.loadAd()) {
                    return;
                }
                boolean isActive = ((C2584e) c5537e.amazon.f26645e).ad.isActive();
                int i2 = this.f21952e;
                if (!isActive) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(c11858e == null ? Integer.valueOf(i2) : c11858e.vip);
                    sb.append(", pid=");
                    sb.append(c18287e.ad.vip);
                    AbstractC2803e.smaato("MediaSessionLegacyStub", sb.toString());
                    return;
                }
                C18424e m1939transient = c5537e.m1939transient(c18287e);
                if (c11858e != null) {
                    if (!c11106e.m3021strictfp(m1939transient, c11858e)) {
                        return;
                    }
                } else if (!c11106e.m3015new(m1939transient, i2)) {
                    return;
                }
                try {
                    interfaceC6995e.ad(m1939transient);
                    return;
                } catch (RemoteException e2) {
                    AbstractC2803e.amazon("MediaSessionLegacyStub", "Exception in " + m1939transient, e2);
                    return;
                }
            default:
                C17669e c17669e = (C17669e) this.f21951e;
                Pair pair = (Pair) this.f21953e;
                ((C4174e) c17669e.f34628e.startapp).mo1483catch(((Integer) pair.first).intValue(), (C18208e) pair.second, (C6913e) this.f21950e, (C0807e) this.f21955e, this.f21952e);
                return;
        }
    }
}
