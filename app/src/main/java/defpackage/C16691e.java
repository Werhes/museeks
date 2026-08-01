package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ad;
import android.support.v4.media.session.appmetrica;
import android.support.v4.media.session.vip;
import android.util.Log;
import android.view.KeyEvent;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؐۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16691e extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C16691e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [eؕۘٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eّٖۛ, java.lang.Object] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        MediaBrowser mediaBrowser;
        ad adVar;
        InterfaceC16274e interfaceC16274e;
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                C2532e c2532e = (C2532e) obj;
                C3740e c3740e = (C3740e) c2532e.f6386e;
                if (c3740e != null) {
                    HandlerC17805e handlerC17805e = c3740e.license;
                    MediaBrowser mediaBrowser2 = c3740e.vip;
                    try {
                        Bundle extras = mediaBrowser2.getExtras();
                        if (extras != null) {
                            boolean z = false;
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                Bundle bundle = c3740e.metrica;
                                mediaBrowser = mediaBrowser2;
                                C10312e c10312e = new C10312e(3, z);
                                c10312e.f20361e = new Messenger(binder);
                                c10312e.f20360e = bundle;
                                c3740e.purchase = c10312e;
                                Messenger messenger = new Messenger(handlerC17805e);
                                c3740e.billing = messenger;
                                handlerC17805e.getClass();
                                handlerC17805e.metrica = new WeakReference(messenger);
                                try {
                                    C10312e c10312e2 = c3740e.purchase;
                                    Context context = c3740e.ad;
                                    Messenger messenger2 = c3740e.billing;
                                    c10312e2.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("data_package_name", context.getPackageName());
                                    bundle2.putInt("data_calling_pid", Process.myPid());
                                    bundle2.putBundle("data_root_hints", (Bundle) c10312e2.f20360e);
                                    c10312e2.subs(6, bundle2, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            } else {
                                mediaBrowser = mediaBrowser2;
                            }
                            IBinder binder2 = extras.getBinder("extra_session_binder");
                            int i2 = appmetrica.license;
                            if (binder2 == null) {
                                adVar = null;
                            } else {
                                IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (queryLocalInterface == null || !(queryLocalInterface instanceof ad)) {
                                    ?? obj2 = new Object();
                                    obj2.metrica = binder2;
                                    adVar = obj2;
                                } else {
                                    adVar = (ad) queryLocalInterface;
                                }
                            }
                            if (adVar != null) {
                                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                                c3740e.yandex = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, adVar) : null;
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                Context context2 = (Context) c2532e.f6385e;
                C3740e c3740e2 = ((C1632e) c2532e.f6389e).ad;
                if (c3740e2.yandex == null) {
                    MediaSession.Token sessionToken2 = c3740e2.vip.getSessionToken();
                    c3740e2.yandex = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
                }
                MediaSessionCompat$Token mediaSessionCompat$Token = c3740e2.yandex;
                if (mediaSessionCompat$Token == null) {
                    throw new IllegalArgumentException("sessionToken must not be null");
                }
                DesugarCollections.synchronizedSet(new HashSet());
                vip vipVar = Build.VERSION.SDK_INT >= 29 ? new vip(context2, mediaSessionCompat$Token) : new vip(context2, mediaSessionCompat$Token);
                KeyEvent keyEvent = (KeyEvent) ((Intent) c2532e.f6387e).getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                vipVar.ad.dispatchMediaButtonEvent(keyEvent);
                c2532e.m929private();
                return;
            default:
                C12894e c12894e = (C12894e) obj;
                C13265e c13265e = (C13265e) c12894e.f25750e;
                if (c13265e != null) {
                    HandlerC17805e handlerC17805e2 = c13265e.license;
                    MediaBrowser mediaBrowser3 = c13265e.vip;
                    try {
                        Bundle Signature = AbstractC9413e.Signature(mediaBrowser3.getExtras());
                        if (Signature != null) {
                            Signature.getInt("extra_service_version", 0);
                            IBinder binder3 = Signature.getBinder("extra_messenger");
                            if (binder3 != null) {
                                C11883e c11883e = new C11883e(binder3, c13265e.metrica);
                                c13265e.purchase = c11883e;
                                Messenger messenger3 = new Messenger(handlerC17805e2);
                                c13265e.billing = messenger3;
                                handlerC17805e2.getClass();
                                handlerC17805e2.metrica = new WeakReference(messenger3);
                                try {
                                    Context context3 = c13265e.ad;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("data_package_name", context3.getPackageName());
                                    bundle3.putInt("data_calling_pid", Process.myPid());
                                    bundle3.putBundle("data_root_hints", (Bundle) c11883e.f23814e);
                                    Message obtain = Message.obtain();
                                    obtain.what = 6;
                                    obtain.arg1 = 1;
                                    obtain.setData(bundle3);
                                    obtain.replyTo = messenger3;
                                    ((Messenger) c11883e.f23815e).send(obtain);
                                } catch (RemoteException unused2) {
                                    AbstractC2803e.advert("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            IBinder binder4 = Signature.getBinder("extra_session_binder");
                            int i3 = BinderC0188e.license;
                            if (binder4 == null) {
                                interfaceC16274e = null;
                            } else {
                                IInterface queryLocalInterface2 = binder4.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC16274e)) {
                                    ?? obj3 = new Object();
                                    obj3.metrica = binder4;
                                    interfaceC16274e = obj3;
                                } else {
                                    interfaceC16274e = (InterfaceC16274e) queryLocalInterface2;
                                }
                            }
                            if (interfaceC16274e != null) {
                                c13265e.yandex = new C13765e(mediaBrowser3.getSessionToken(), interfaceC16274e);
                            }
                        }
                    } catch (IllegalStateException e2) {
                        AbstractC2803e.billing("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
                    }
                }
                C12621e c12621e = (C12621e) c12894e.f25752e;
                C17974e c17974e = c12621e.adcel;
                if (c17974e != null) {
                    C13265e c13265e2 = (C13265e) c17974e.f35233e;
                    if (c13265e2.yandex == null) {
                        c13265e2.yandex = new C13765e(c13265e2.vip.getSessionToken(), null);
                    }
                    C13765e c13765e = c13265e2.yandex;
                    C12318e c12318e = c12621e.vip;
                    c12318e.vip(new RunnableC7410e(c12621e, c13765e, 5));
                    c12318e.f24699e.postDelayed(new RunnableC3630e(c12621e, 0), 500L);
                    return;
                }
                return;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        switch (this.ad) {
            case 0:
                ((C2532e) this.vip).m929private();
                return;
            default:
                ((C12621e) ((C12894e) this.vip).f25752e).vip.release();
                return;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        switch (this.ad) {
            case 0:
                C2532e c2532e = (C2532e) this.vip;
                C3740e c3740e = (C3740e) c2532e.f6386e;
                if (c3740e != null) {
                    c3740e.purchase = null;
                    c3740e.billing = null;
                    c3740e.yandex = null;
                    HandlerC17805e handlerC17805e = c3740e.license;
                    handlerC17805e.getClass();
                    handlerC17805e.metrica = new WeakReference(null);
                }
                c2532e.m929private();
                return;
            default:
                C12894e c12894e = (C12894e) this.vip;
                C13265e c13265e = (C13265e) c12894e.f25750e;
                if (c13265e != null) {
                    c13265e.purchase = null;
                    c13265e.billing = null;
                    c13265e.yandex = null;
                    HandlerC17805e handlerC17805e2 = c13265e.license;
                    handlerC17805e2.getClass();
                    handlerC17805e2.metrica = new WeakReference(null);
                }
                ((C12621e) c12894e.f25752e).vip.release();
                return;
        }
    }
}
