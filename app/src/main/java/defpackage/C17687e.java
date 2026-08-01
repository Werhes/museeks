package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17687e implements InterfaceC12504e, InterfaceC12321e, InterfaceC8946e, InterfaceC12523e, InterfaceC10808e, InterfaceC0778e, InterfaceC4583e, InterfaceC14470e, InterfaceC7961e, InterfaceC9650e, InterfaceC11414e, InterfaceC1360e, InterfaceC15046e, InterfaceC7449e, InterfaceC7252e, InterfaceC14599e, InterfaceC9892e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34647e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34648e;

    public /* synthetic */ C17687e(int i, PendingIntent pendingIntent) {
        this.f34648e = 19;
        this.f34647e = pendingIntent;
    }

    public /* synthetic */ C17687e(int i, Object obj) {
        this.f34648e = i;
        this.f34647e = obj;
    }

    public /* synthetic */ C17687e(C11858e c11858e) {
        this.f34648e = 21;
        Bundle bundle = Bundle.EMPTY;
        this.f34647e = c11858e;
    }

    @Override // defpackage.InterfaceC0778e
    public /* synthetic */ Size ad() {
        return null;
    }

    @Override // defpackage.InterfaceC8946e
    public void adcel(long j, C1292e c1292e) {
        AbstractC10509e.startapp(j, c1292e, ((C15789e) this.f34647e).f31098native);
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        switch (this.f34648e) {
            case 7:
                ListenableFuture listenableFuture = (ListenableFuture) this.f34647e;
                AbstractC15792e.amazon(false, listenableFuture, c7169e, AbstractC3062e.billing());
                return "nonCancellationPropagating[" + listenableFuture + "]";
            case 16:
                C18478e c18478e = (C18478e) this.f34647e;
                AbstractC3062e.amazon().execute(new RunnableC7410e(c18478e, c7169e, 2));
                return c18478e + " [fetch@" + SystemClock.uptimeMillis() + "]";
            default:
                C6584e c6584e = (C6584e) this.f34647e;
                c6584e.loadAd.post(new RunnableC7410e(c6584e, c7169e, 18));
                return "onPlayRequested";
        }
    }

    @Override // defpackage.InterfaceC7961e, defpackage.InterfaceC9650e
    public ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((C6846e) this.f34647e).invoke(obj);
    }

    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        return (Void) ((Cthrows) this.f34647e).invoke(obj);
    }

    @Override // defpackage.InterfaceC10808e
    /* renamed from: apply, reason: collision with other method in class */
    public String mo4378apply(Object obj) {
        return (String) ((C14407e) this.f34647e).invoke(obj);
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        C11858e c11858e = (C11858e) this.f34647e;
        Bundle bundle = Bundle.EMPTY;
        interfaceC10645e.vip(i, c11858e);
    }

    @Override // defpackage.InterfaceC7252e
    public void billing(C6268e c6268e, C18424e c18424e) {
        ((InterfaceC8427e) this.f34647e).accept(c6268e);
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f34648e) {
            case 0:
                ((InterfaceC8524e) obj).mo1491interface(((SurfaceHolderCallbackC0960e) this.f34647e).ad.f33623e);
                return;
            case 1:
                ((InterfaceC8524e) obj).amazon((C17750e) this.f34647e);
                return;
            case 2:
                ((InterfaceC8524e) obj).vip((C2351e) this.f34647e);
                return;
            default:
                ((InterfaceC8524e) obj).mo1485default((C5251e) this.f34647e);
                return;
        }
    }

    @Override // defpackage.InterfaceC9892e
    public Object license(Object obj, Object obj2) {
        return AbstractC10589e.purchase(new C11650e(((C13490e) this.f34647e).f26759e, obj), (List) ((Collection) obj2));
    }

    @Override // defpackage.InterfaceC14599e
    public void metrica(InterfaceC8668e interfaceC8668e) {
        C8402e c8402e = (C8402e) this.f34647e;
        synchronized (c8402e.f17180e) {
            c8402e.f17173e++;
        }
        c8402e.yandex(interfaceC8668e);
    }

    @Override // defpackage.InterfaceC0778e
    public void mopub(C5403e c5403e) {
        ((InterfaceC0778e) this.f34647e).mopub(c5403e);
    }

    @Override // defpackage.InterfaceC14470e
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((C1841e) this.f34647e).getClass();
        menuItem.getItemId();
        throw null;
    }

    @Override // defpackage.InterfaceC12321e
    public long purchase(long j) {
        return AbstractC9413e.mopub((j * r0.appmetrica) / 1000000, 0L, ((C15008e) this.f34647e).adcel - 1);
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        int i2 = this.f34648e;
        Object obj = this.f34647e;
        switch (i2) {
            case 23:
                return c6584e.isVip(c18424e, (C11753e) obj);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC7252e interfaceC7252e = (InterfaceC7252e) obj;
                C13747e c13747e = C13747e.f27231e;
                if (!c6584e.loadAd()) {
                    interfaceC7252e.billing(c6584e.pro, c18424e);
                    BinderC17428e.m4320e(c6584e, c18424e, i, new C9759e(0));
                }
                return C13747e.f27231e;
            default:
                return c6584e.firebase(c18424e, (AbstractC5340e) obj);
        }
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        switch (this.f34648e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C3575e c3575e = (C3575e) this.f34647e;
                c4275e.getClass();
                InterfaceC3001e interfaceC3001e = c3575e.metrica;
                C7543e c7543e = c4275e.appmetrica;
                C12318e c12318e = c4275e.ad;
                if (c4275e.crashlytics != null) {
                    AbstractC2803e.purchase("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    c12318e.release();
                    return;
                }
                AbstractC17475e abstractC17475e = c3575e.amazon;
                Bundle bundle = c3575e.startapp;
                c4275e.crashlytics = interfaceC3001e;
                c4275e.admob = c3575e.adcel;
                c4275e.subscription = c3575e.license;
                c4275e.isVip = c3575e.appmetrica;
                C5298e c5298e = c3575e.purchase;
                c4275e.inmobi = c5298e;
                C5298e c5298e2 = c3575e.billing;
                c4275e.isPro = c5298e2;
                C5298e metrica = c4275e.metrica(c5298e, c5298e2);
                c4275e.applovin = metrica;
                AbstractC17475e abstractC17475e2 = c3575e.mopub;
                c4275e.remoteconfig = abstractC17475e2;
                AbstractC17475e abstractC17475e3 = c3575e.advert;
                c4275e.pro = abstractC17475e3;
                C1410e m1517e = C4275e.m1517e(abstractC17475e3, abstractC17475e2, c4275e.isVip, metrica, bundle);
                c4275e.signatures = m1517e;
                c4275e.tapsense = C4275e.m1518e(m1517e, c4275e.remoteconfig, c3575e.startapp, c4275e.isVip, c4275e.applovin, c3575e.vip);
                Csuper csuper = new Csuper(4);
                for (int i = 0; i < abstractC17475e.size(); i++) {
                    C11161e c11161e = (C11161e) abstractC17475e.get(i);
                    C11858e c11858e = c11161e.ad;
                    if (c11858e != null && c11858e.ad == 0) {
                        csuper.mo3904implements(c11858e.vip, c11161e);
                    }
                }
                csuper.mopub(true);
                MediaSession.Token token = c3575e.smaato;
                if (token == null) {
                    token = c7543e.ad.mo1737interface();
                }
                if (token != null) {
                    c4275e.firebase = new MediaController(c4275e.license, token);
                }
                try {
                    interfaceC3001e.asBinder().linkToDeath(c4275e.billing, 0);
                    c4275e.amazon = new C7543e(c7543e.ad.vip(), c3575e.ad, c3575e.vip, c7543e.ad.ads(), c3575e.metrica, c3575e.yandex, token);
                    c4275e.f9371this = bundle;
                    c12318e.ad();
                    return;
                } catch (RemoteException unused) {
                    c12318e.release();
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C12693e c12693e = (C12693e) this.f34647e;
                if (c4275e.mo1580e() && c4275e.mopub.isEmpty()) {
                    C12693e c12693e2 = c4275e.admob.metrica;
                    if (c12693e2.metrica >= c12693e.metrica || !AbstractC1008e.ad(c12693e, c12693e2)) {
                        return;
                    }
                    c4275e.admob = c4275e.admob.adcel(c12693e);
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                PendingIntent pendingIntent = (PendingIntent) this.f34647e;
                C12318e c12318e2 = c4275e.ad;
                if (!c4275e.mo1580e() || Objects.equals(c4275e.subscription, pendingIntent)) {
                    return;
                }
                c4275e.subscription = pendingIntent;
                c12318e2.getClass();
                AbstractC2301e.subscription(Looper.myLooper() == c12318e2.f24699e.getLooper());
                c12318e2.f24703e.getClass();
                return;
            default:
                Bundle bundle2 = (Bundle) this.f34647e;
                if (c4275e.mo1580e()) {
                    C1410e c1410e = c4275e.signatures;
                    C1410e c1410e2 = c4275e.tapsense;
                    c4275e.f9371this = bundle2;
                    C1410e m1517e2 = C4275e.m1517e(c4275e.pro, c4275e.remoteconfig, c4275e.isVip, c4275e.applovin, bundle2);
                    c4275e.signatures = m1517e2;
                    c4275e.tapsense = C4275e.m1518e(m1517e2, c4275e.remoteconfig, c4275e.f9371this, c4275e.isVip, c4275e.applovin, c4275e.tapsense());
                    boolean equals = c4275e.signatures.equals(c1410e);
                    c4275e.tapsense.equals(c1410e2);
                    C12318e c12318e3 = c4275e.ad;
                    c12318e3.getClass();
                    AbstractC2301e.subscription(Looper.myLooper() == c12318e3.f24699e.getLooper());
                    InterfaceC17145e interfaceC17145e = c12318e3.f24703e;
                    interfaceC17145e.getClass();
                    if (equals) {
                        return;
                    }
                    interfaceC17145e.applovin();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC4583e
    public boolean yandex(C6594e c6594e, int i, Bundle bundle) {
        InterfaceC1016e interfaceC1016e;
        C6129e c6129e = (C6129e) this.f34647e;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC4876e) c6594e.f13613e).smaato();
                Parcelable parcelable = (Parcelable) ((InterfaceC4876e) c6594e.f13613e).subscription();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InterfaceC4876e interfaceC4876e = (InterfaceC4876e) c6594e.f13613e;
        ClipData clipData = new ClipData(interfaceC4876e.vip(), new ClipData.Item(interfaceC4876e.advert()));
        if (i2 >= 31) {
            interfaceC1016e = new C7407e(clipData, 2);
        } else {
            C13911e c13911e = new C13911e();
            c13911e.vip = clipData;
            c13911e.metrica = 2;
            interfaceC1016e = c13911e;
        }
        interfaceC1016e.ad(interfaceC4876e.amazon());
        interfaceC1016e.setExtras(bundle);
        return AbstractC2016e.mopub(c6129e, interfaceC1016e.build()) == null;
    }
}
