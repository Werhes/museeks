package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IInterface;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.mopub;
import androidx.car.app.utils.purchase;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9509e implements InterfaceC0771e, InterfaceC12504e, InterfaceC6395e, InterfaceC11929e, InterfaceC16794e, InterfaceC8759e, InterfaceC9479e, InterfaceC15046e, InterfaceC6995e, InterfaceC8427e, InterfaceC16996e, InterfaceC3812e, InterfaceC12523e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f18861e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f18862e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f18863e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18864e;

    public /* synthetic */ C9509e(int i, Object obj, Object obj2, Object obj3) {
        this.f18864e = i;
        this.f18862e = obj;
        this.f18861e = obj2;
        this.f18863e = obj3;
    }

    public /* synthetic */ C9509e(C18177e c18177e, C6913e c6913e, C0807e c0807e, IOException iOException, boolean z) {
        this.f18864e = 1;
        this.f18862e = c18177e;
        this.f18861e = c0807e;
        this.f18863e = iOException;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        Csuper csuper = (Csuper) this.f18862e;
        ((InterfaceC11421e) obj).yandex(csuper.f36470e, (C18208e) this.f18861e, (C0807e) this.f18863e);
    }

    @Override // defpackage.InterfaceC6995e
    public void ad(C18424e c18424e) {
        C5537e c5537e = (C5537e) this.f18862e;
        c5537e.yandex.pro(c18424e, (C11858e) this.f18861e, (Bundle) this.f18863e);
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        C8988e c8988e = (C8988e) this.f18862e;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18861e;
        C15816e c15816e = (C15816e) this.f18863e;
        if (c0560e.advert()) {
            c8988e.license(c0560e.adcel());
        } else if (c0560e.startapp() != null) {
            c8988e.metrica(c0560e.startapp());
        } else if (atomicBoolean.getAndSet(true)) {
            c15816e.pro();
        }
        return AbstractC1749e.appmetrica(null);
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        C2245e c2245e = (C2245e) this.f18862e;
        C6122e c6122e = (C6122e) this.f18861e;
        C12488e c12488e = (C12488e) this.f18863e;
        try {
            C11180e c11180e = (C11180e) c2245e.appmetrica;
            Executor executor = (Executor) c2245e.metrica;
            int i = c6122e.billing;
            c11180e.getClass();
            C18405e c18405e = new C18405e(executor, c12488e, i);
            InterfaceC17421e interfaceC17421e = c18405e.purchase;
            c2245e.purchase = c18405e;
            if (interfaceC17421e instanceof C1311e) {
                Surface ad = ((C1311e) interfaceC17421e).ad();
                c2245e.billing = ad;
                AbstractC9464e.yandex("VideoEncoderSession", "provide surface: " + ad);
                c6122e.ad(ad, (Executor) c2245e.license, new C18027e(4, c2245e));
                c2245e.vip = 4;
                c7169e.ad((C18405e) c2245e.purchase);
            } else {
                c7169e.metrica(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (C13807e e) {
            AbstractC9464e.mopub("VideoEncoderSession", "Unable to initialize video encoder.", e);
            c7169e.metrica(e);
        }
        return "ConfigureVideoEncoderFuture " + c2245e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC3812e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9509e.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        boolean ad;
        C6584e c6584e = (C6584e) this.f18862e;
        String str = (String) this.f18861e;
        C11753e c11753e = (C11753e) this.f18863e;
        synchronized (c6584e) {
            ad = c6584e.f13590goto.ad(interfaceC10645e, str);
        }
        if (ad) {
            interfaceC10645e.mopub(i, c11753e, str);
        }
    }

    public void billing() {
        C7850e c7850e = (C7850e) this.f18862e;
        C16255e c16255e = (C16255e) this.f18861e;
        InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.f18863e;
        AtomicReference atomicReference = ((C8356e) c7850e.f15896e).f17108e;
        while (true) {
            if (atomicReference.compareAndSet(c16255e, null)) {
                c16255e.vip(EnumC4033e.f8970e);
                break;
            } else if (atomicReference.get() != c16255e) {
                break;
            }
        }
        C6815e c6815e = c16255e.appmetrica;
        if (c6815e != null) {
            c6815e.cancel(false);
            c16255e.appmetrica = null;
        }
        interfaceC2881e.ad().loadAd(c16255e);
    }

    @Override // defpackage.InterfaceC8759e
    public Object call() {
        C10147e c10147e;
        switch (this.f18864e) {
            case 5:
                mopub mopubVar = (mopub) this.f18862e;
                String str = (String) this.f18861e;
                InterfaceC12623e interfaceC12623e = (InterfaceC12623e) this.f18863e;
                IInterface ad = mopubVar.ad("app");
                if (ad == null) {
                    Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(str));
                    return null;
                }
                interfaceC12623e.adcel(ad);
                return null;
            case 13:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f18862e;
                String str2 = (String) this.f18863e;
                Object obj = this.f18861e;
                if (obj == null) {
                    c10147e = null;
                } else {
                    try {
                        c10147e = new C10147e(obj);
                    } catch (C9496e e) {
                        purchase.purchase(iOnDoneCallback, str2, e);
                    }
                }
                iOnDoneCallback.onSuccess(c10147e);
                return null;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f18862e;
                Exception exc = (Exception) this.f18861e;
                String str3 = (String) this.f18863e;
                try {
                    iOnDoneCallback2.onFailure(new C10147e(new FailureResponse(exc)));
                    return null;
                } catch (C9496e e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str3), e2);
                    return null;
                }
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f18864e) {
            case 1:
                ((InterfaceC3190e) obj).yandex((C18177e) this.f18862e, (C0807e) this.f18861e, (IOException) this.f18863e);
                return;
            default:
                ((InterfaceC8524e) obj).purchase(((C2411e) ((C2532e) this.f18862e).f6388e).metrica.ad, ((C2411e) ((C2532e) this.f18861e).f6388e).metrica.ad, ((Integer) this.f18863e).intValue());
                return;
        }
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f18862e;
        String str = (String) this.f18861e;
        C13093e c13093e = (C13093e) this.f18863e;
        String str2 = (String) obj;
        C5389e metrica = FirebaseMessaging.metrica(firebaseMessaging.vip);
        C14679e c14679e = firebaseMessaging.ad;
        c14679e.ad();
        String license = "[DEFAULT]".equals(c14679e.vip) ? BuildConfig.FLAVOR : c14679e.license();
        String metrica2 = firebaseMessaging.yandex.metrica();
        synchronized (metrica) {
            String ad = C13093e.ad(System.currentTimeMillis(), str2, metrica2);
            if (ad != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) metrica.f11540e).edit();
                edit.putString(license + "|T|" + str + "|*", ad);
                edit.commit();
            }
        }
        if (c13093e == null || !str2.equals(c13093e.ad)) {
            C14679e c14679e2 = firebaseMessaging.ad;
            c14679e2.ad();
            if ("[DEFAULT]".equals(c14679e2.vip)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    c14679e2.ad();
                    sb.append(c14679e2.vip);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C18540e(firebaseMessaging.vip).m4578private(intent);
            }
        }
        return AbstractC1749e.appmetrica(str2);
    }

    @Override // defpackage.InterfaceC16996e
    public void license(C0167e c0167e) {
        AbstractC13757e abstractC13757e;
        C7850e c7850e = (C7850e) this.f18862e;
        InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.f18861e;
        C6122e c6122e = (C6122e) this.f18863e;
        C8356e c8356e = (C8356e) c7850e.f15896e;
        AbstractC9464e.yandex("PreviewView", "Preview transformation info updated. " + c0167e);
        boolean z = interfaceC2881e.subscription().admob() == 0;
        C4519e c4519e = c8356e.f17105e;
        Size size = c6122e.vip;
        c4519e.getClass();
        AbstractC9464e.yandex("PreviewTransform", "Transformation info set: " + c0167e + " " + size + " " + z);
        c4519e.purchase = c0167e.ad;
        c4519e.ad = c0167e.vip;
        int i = c0167e.metrica;
        c4519e.vip = i;
        c4519e.appmetrica = size;
        c4519e.metrica = z;
        c4519e.license = c0167e.license;
        c4519e.billing = c0167e.appmetrica;
        if (i == -1 || ((abstractC13757e = c8356e.f17101e) != null && (abstractC13757e instanceof C4096e))) {
            c8356e.f17095e = true;
        } else {
            c8356e.f17095e = false;
        }
        c8356e.vip();
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        C4275e c4275e = (C4275e) this.f18862e;
        interfaceC3001e.mo942class(c4275e.metrica, i, (String) this.f18861e, ((C11326e) this.f18863e).metrica());
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C12878e c12878e = (C12878e) this.f18862e;
        C7869e c7869e = (C7869e) this.f18861e;
        C16611e c16611e = (C16611e) this.f18863e;
        C2417e c2417e = (C2417e) c12878e.license;
        c2417e.getClass();
        EnumC6651e enumC6651e = c7869e.metrica;
        String str = c16611e.ad;
        String str2 = c7869e.ad;
        String mopub = AbstractC12640e.mopub("SQLiteEventStore");
        if (Log.isLoggable(mopub, 3)) {
            Log.d(mopub, "Storing event with priority=" + enumC6651e + ", name=" + str + " for destination " + str2);
        }
        ((Long) c2417e.purchase(new C9509e(15, c2417e, c16611e, c7869e))).getClass();
        c12878e.ad.premium(c7869e, 1, false);
        return null;
    }

    @Override // defpackage.InterfaceC11929e
    public C1410e vip(int i, C16437e c16437e, int[] iArr) {
        C16672e c16672e = (C16672e) this.f18862e;
        String str = (String) this.f18861e;
        String str2 = (String) this.f18863e;
        C13304e Signature = AbstractC17475e.Signature();
        for (int i2 = 0; i2 < c16437e.ad; i2++) {
            Signature.metrica(new C6350e(i, c16437e, i2, c16672e, iArr[i2], str, str2));
        }
        return Signature.billing();
    }
}
