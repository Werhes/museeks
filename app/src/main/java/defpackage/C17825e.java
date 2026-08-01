package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.mopub;
import androidx.car.app.utils.purchase;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17825e implements InterfaceC8759e, InterfaceC12504e, InterfaceC9479e, InterfaceC1360e, InterfaceC6995e, InterfaceC8427e, InterfaceC6395e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34931e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34932e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34933e;

    public /* synthetic */ C17825e(int i, Object obj, Object obj2) {
        this.f34933e = i;
        this.f34932e = obj;
        this.f34931e = obj2;
    }

    public /* synthetic */ C17825e(Object obj, int i, Object obj2) {
        this.f34932e = obj;
        this.f34933e = i;
        this.f34931e = obj2;
    }

    public /* synthetic */ C17825e(Object obj, Object obj2, int i) {
        this.f34932e = obj;
        this.f34931e = obj2;
        this.f34933e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // defpackage.InterfaceC8427e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f34932e
            eؙۗ r0 = (defpackage.C6584e) r0
            java.lang.Object r1 = r4.f34931e
            eُۡ r1 = (defpackage.C18424e) r1
            com.google.common.util.concurrent.ListenableFuture r5 = (com.google.common.util.concurrent.ListenableFuture) r5
            java.lang.String r2 = "MediaSessionStub"
            java.lang.Object r5 = r5.get()     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            eٍۛۦ r5 = (defpackage.C9759e) r5     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.String r3 = "SessionResult must not be null"
            defpackage.AbstractC2301e.amazon(r5, r3)     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            goto L40
        L18:
            r5 = move-exception
            goto L1e
        L1a:
            r5 = move-exception
            goto L1e
        L1c:
            r5 = move-exception
            goto L35
        L1e:
            java.lang.String r3 = "Session operation failed"
            defpackage.AbstractC2803e.amazon(r2, r3, r5)
            eٍۛۦ r2 = new eٍۛۦ
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.UnsupportedOperationException
            if (r5 == 0) goto L2f
            r5 = -6
            goto L30
        L2f:
            r5 = -1
        L30:
            r2.<init>(r5)
            r5 = r2
            goto L40
        L35:
            java.lang.String r3 = "Session operation cancelled"
            defpackage.AbstractC2803e.amazon(r2, r3, r5)
            eٍۛۦ r5 = new eٍۛۦ
            r2 = 1
            r5.<init>(r2)
        L40:
            int r2 = r4.f34933e
            defpackage.BinderC17428e.m4320e(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17825e.accept(java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC6995e
    public void ad(C18424e c18424e) {
        C5537e c5537e = (C5537e) this.f34932e;
        C17571e c17571e = (C17571e) this.f34931e;
        if (TextUtils.isEmpty(c17571e.f34423e)) {
            AbstractC2803e.smaato("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        ListenableFuture subscription = c5537e.yandex.subscription(c18424e, AbstractC17475e.ads(AbstractC13256e.adcel(c17571e)));
        ((C8724e) subscription).ad(new RunnableC17144e(subscription, new Csuper(c5537e, c18424e, this.f34933e), 11), EnumC3320e.f7489e);
    }

    @Override // defpackage.InterfaceC8759e
    public Object call() {
        C15743e c15743e = (C15743e) this.f34932e;
        C10147e c10147e = (C10147e) this.f34931e;
        ICarHardwareHost iCarHardwareHost = c15743e.vip;
        if (iCarHardwareHost == null) {
            mopub mopubVar = c15743e.ad;
            C8391e c8391e = new C8391e(5);
            mopubVar.getClass();
            iCarHardwareHost = (ICarHardwareHost) purchase.appmetrica("getHost(CarHardware)", new C12879e(mopubVar, "car", "getHost(CarHardware)", c8391e));
            Objects.requireNonNull(iCarHardwareHost);
            c15743e.vip = iCarHardwareHost;
        }
        iCarHardwareHost.unsubscribeCarHardwareResult(this.f34933e, c10147e);
        return null;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        C0101e c0101e = (C0101e) this.f34932e;
        C0101e c0101e2 = (C0101e) this.f34931e;
        InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
        int i = this.f34933e;
        interfaceC8524e.appmetrica(i);
        interfaceC8524e.purchase(c0101e, c0101e2, i);
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        C4275e c4275e = (C4275e) this.f34932e;
        List list = (List) this.f34931e;
        BinderC4329e binderC4329e = c4275e.metrica;
        C13304e Signature = AbstractC17475e.Signature();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Signature.metrica(((C1962e) list.get(i2)).metrica(c4275e.tapsense(), true));
        }
        interfaceC3001e.mo961e(binderC4329e, i, this.f34933e, new BinderC7421e(Signature.billing()));
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C4956e c4956e = (C4956e) this.f34932e;
        ((C12894e) c4956e.f10515e).premium((C7869e) this.f34931e, this.f34933e + 1, false);
        return null;
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        C11858e c11858e = (C11858e) this.f34932e;
        Bundle bundle = (Bundle) this.f34931e;
        C12318e c12318e = c4275e.ad;
        if (c4275e.mo1580e()) {
            c12318e.getClass();
            AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
            C13747e advert = c12318e.f24703e.advert(c12318e, c11858e, bundle);
            advert.ad(new RunnableC16764e(c4275e, advert, this.f34933e, 6), EnumC3320e.f7489e);
        }
    }
}
