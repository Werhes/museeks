package defpackage;

import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC17797e extends Handler {
    public final /* synthetic */ int ad;
    public Object vip;

    public /* synthetic */ HandlerC17797e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC17797e(Looper looper) {
        super(looper);
        this.ad = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17797e(Looper looper, C11106e c11106e) {
        super(looper);
        this.ad = 11;
        this.vip = c11106e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17797e(C16899e c16899e) {
        super(Looper.getMainLooper());
        this.ad = 4;
        this.vip = c16899e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC17797e(Object obj, Looper looper, int i) {
        super(looper);
        this.ad = i;
        this.vip = obj;
    }

    private final void ad(Message message) {
        C8455e c8455e;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            C13905e c13905e = (C13905e) this.vip;
            C18540e c18540e = c13905e.metrica;
            if (obj == c13905e.applovin) {
                if (c13905e.Signature == 2 || c13905e.adcel()) {
                    c13905e.applovin = null;
                    if (obj2 instanceof Exception) {
                        c18540e.m4576new((Exception) obj2, false);
                        return;
                    }
                    try {
                        c13905e.vip.signatures(((C2414e) obj2).ad);
                        c18540e.f36382e = null;
                        HashSet hashSet = (HashSet) c18540e.f36383e;
                        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(hashSet);
                        hashSet.clear();
                        C2171e listIterator = remoteconfig.listIterator(0);
                        while (listIterator.hasNext()) {
                            C13905e c13905e2 = (C13905e) listIterator.next();
                            if (c13905e2.smaato()) {
                                c13905e2.startapp(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        c18540e.m4576new(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C13905e c13905e3 = (C13905e) this.vip;
        if (obj == c13905e3.inmobi && c13905e3.adcel()) {
            c13905e3.inmobi = null;
            synchronized (c13905e3.loadAd) {
                C17974e c17974e = c13905e3.isPro;
                c17974e.getClass();
                c8455e = new C8455e(3);
                ((C13304e) c17974e.f35233e).billing();
                c13905e3.isPro = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c13905e3.advert((Throwable) obj2, false);
                return;
            }
            try {
                byte[] remoteconfig2 = c13905e3.vip.remoteconfig(c13905e3.tapsense, ((C2414e) obj2).ad);
                if (c13905e3.isVip != null && remoteconfig2 != null && remoteconfig2.length != 0) {
                    c13905e3.isVip = remoteconfig2;
                }
                c13905e3.Signature = 4;
                c13905e3.yandex(new C0211e(23, c8455e));
            } catch (Exception e2) {
                e = e2;
                c13905e3.advert(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                c13905e3.advert(e, true);
            }
        }
    }

    private final void metrica(Message message) {
        C2584e c2584e;
        AbstractC9882e abstractC9882e;
        HandlerC17797e handlerC17797e;
        if (message.what == 1) {
            synchronized (((AbstractC9882e) this.vip).vip) {
                c2584e = (C2584e) ((WeakReference) ((AbstractC9882e) this.vip).license).get();
                abstractC9882e = (AbstractC9882e) this.vip;
                handlerC17797e = (HandlerC17797e) abstractC9882e.purchase;
            }
            if (c2584e == null || abstractC9882e != c2584e.vip() || handlerC17797e == null) {
                return;
            }
            c2584e.license((C18287e) message.obj);
            ((AbstractC9882e) this.vip).metrica(c2584e, handlerC17797e);
            c2584e.license(null);
        }
    }

    private final void vip(Message message) {
        C15944e c15944e;
        AbstractC9882e abstractC9882e;
        HandlerC17797e handlerC17797e;
        if (message.what == 1) {
            synchronized (((AbstractC9882e) this.vip).vip) {
                c15944e = (C15944e) ((WeakReference) ((AbstractC9882e) this.vip).license).get();
                abstractC9882e = (AbstractC9882e) this.vip;
                handlerC17797e = (HandlerC17797e) abstractC9882e.purchase;
            }
            if (c15944e == null || abstractC9882e != c15944e.vip() || handlerC17797e == null) {
                return;
            }
            c15944e.purchase((C15938e) message.obj);
            ((AbstractC9882e) this.vip).vip(c15944e, handlerC17797e);
            c15944e.purchase(null);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z = false;
        C8666e c8666e = null;
        c8666e = null;
        c8666e = null;
        c8666e = null;
        c8666e = null;
        c8666e = null;
        switch (this.ad) {
            case 0:
                C0986e c0986e = (C0986e) this.vip;
                int i = message.what;
                if (i == 1) {
                    C8666e c8666e2 = (C8666e) message.obj;
                    try {
                        c0986e.f3427e.queueInputBuffer(c8666e2.ad, 0, c8666e2.vip, c8666e2.license, c8666e2.appmetrica);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = c0986e.f3426e;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    c8666e = c8666e2;
                } else if (i == 2) {
                    C8666e c8666e3 = (C8666e) message.obj;
                    int i2 = c8666e3.ad;
                    MediaCodec.CryptoInfo cryptoInfo = c8666e3.metrica;
                    long j = c8666e3.license;
                    int i3 = c8666e3.appmetrica;
                    try {
                        synchronized (C0986e.f3421e) {
                            c0986e.f3427e.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = c0986e.f3426e;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    c8666e = c8666e3;
                } else if (i == 3) {
                    c0986e.f3423e.license();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = c0986e.f3426e;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        c0986e.f3427e.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = c0986e.f3426e;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (c8666e != null) {
                    C0986e.license(c8666e);
                    return;
                }
                return;
            case 1:
                ad(message);
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                Iterator it = ((C16558e) this.vip).f32486e.iterator();
                while (it.hasNext()) {
                    C13905e c13905e = (C13905e) it.next();
                    c13905e.loadAd();
                    if (Arrays.equals(c13905e.tapsense, bArr)) {
                        if (message.what == 2 && c13905e.Signature == 4) {
                            String str = AbstractC9413e.ad;
                            c13905e.startapp(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                ServiceC13230e serviceC13230e = (ServiceC13230e) this.vip;
                if (serviceC13230e == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                C12916e c12916e = serviceC13230e.f26252e;
                Bundle data = message.getData();
                int i4 = 14;
                switch (message.what) {
                    case 3:
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC3512e(c12916e, new C9770e(i4, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), AbstractC9413e.Signature(data.getBundle("data_options")), 0));
                        return;
                    case 4:
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC11327e(c12916e, new C9770e(i4, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 2));
                        return;
                    case 5:
                        String string = data.getString("data_media_item_id");
                        C12636e c12636e = (C12636e) data.getParcelable("data_result_receiver");
                        C9770e c9770e = new C9770e(i4, message.replyTo);
                        c12916e.getClass();
                        if (TextUtils.isEmpty(string) || c12636e == null) {
                            return;
                        }
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC11327e(c12916e, c9770e, string, c12636e, 3));
                        return;
                    case 6:
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC13254e(c12916e, new C9770e(i4, message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), AbstractC9413e.Signature(data.getBundle("data_root_hints"))));
                        return;
                    case 7:
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC17144e(c12916e, new C9770e(i4, message.replyTo), z, 15));
                        return;
                    case 8:
                        Bundle Signature = AbstractC9413e.Signature(data.getBundle("data_search_extras"));
                        String string2 = data.getString("data_search_query");
                        C12636e c12636e2 = (C12636e) data.getParcelable("data_result_receiver");
                        C9770e c9770e2 = new C9770e(i4, message.replyTo);
                        c12916e.getClass();
                        if (TextUtils.isEmpty(string2) || c12636e2 == null) {
                            return;
                        }
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC0717e(c12916e, c9770e2, string2, Signature, c12636e2, 0));
                        return;
                    case 9:
                        Bundle Signature2 = AbstractC9413e.Signature(data.getBundle("data_custom_action_extras"));
                        String string3 = data.getString("data_custom_action");
                        C12636e c12636e3 = (C12636e) data.getParcelable("data_result_receiver");
                        C9770e c9770e3 = new C9770e(i4, message.replyTo);
                        c12916e.getClass();
                        if (TextUtils.isEmpty(string3) || c12636e3 == null) {
                            return;
                        }
                        ((ServiceC13230e) c12916e.f25784e).f26258e.license(new RunnableC0717e(c12916e, c9770e3, string3, Signature2, c12636e3, 1));
                        return;
                    default:
                        AbstractC2803e.smaato("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 4:
                int i5 = message.what;
                int i6 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((C16899e) this.vip).adcel;
                C11995e c11995e = (C11995e) sparseArray.get(i6);
                if (c11995e == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i6);
                if (i5 == 3) {
                    c11995e.vip((Bundle) obj);
                    return;
                } else {
                    if (i5 != 4) {
                        return;
                    }
                    C11995e.ad(peekData != null ? peekData.getString("error") : null, (Bundle) obj);
                    return;
                }
            case 5:
                DialogC6627e dialogC6627e = (DialogC6627e) this.vip;
                HandlerC17797e handlerC17797e = dialogC6627e.f13688e;
                int i7 = message.what;
                if (i7 == 1) {
                    dialogC6627e.adcel((List) message.obj);
                    return;
                }
                if (i7 == 2) {
                    if (dialogC6627e.f13675e.isEmpty()) {
                        dialogC6627e.smaato(2);
                        handlerC17797e.removeMessages(2);
                        handlerC17797e.removeMessages(3);
                        handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i7 == 3 && dialogC6627e.f13675e.isEmpty()) {
                    dialogC6627e.smaato(3);
                    handlerC17797e.removeMessages(2);
                    handlerC17797e.removeMessages(3);
                    handlerC17797e.removeMessages(1);
                    dialogC6627e.f13689e.yandex(dialogC6627e.f13682e);
                    return;
                }
                return;
            case 6:
                if (message.what != 1) {
                    return;
                }
                DialogC6738e dialogC6738e = (DialogC6738e) this.vip;
                List list = (List) message.obj;
                dialogC6738e.f13929e = SystemClock.uptimeMillis();
                dialogC6738e.f13933e.clear();
                dialogC6738e.f13933e.addAll(list);
                dialogC6738e.f13925e.ads();
                return;
            case 7:
                DialogC1747e dialogC1747e = (DialogC1747e) this.vip;
                int i8 = message.what;
                if (i8 == 1) {
                    dialogC1747e.admob();
                    return;
                } else {
                    if (i8 == 2 && dialogC1747e.f4781e != null) {
                        dialogC1747e.f4781e = null;
                        dialogC1747e.subscription();
                        return;
                    }
                    return;
                }
            case 8:
                AbstractC9410e abstractC9410e = (AbstractC9410e) this.vip;
                int i9 = message.what;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return;
                    }
                    abstractC9410e.f18734e = false;
                    abstractC9410e.appmetrica(abstractC9410e.f18727e);
                    return;
                }
                abstractC9410e.f18730e = false;
                C13935e c13935e = abstractC9410e.f18731e;
                if (c13935e != null) {
                    C13486e c13486e = abstractC9410e.f18733e;
                    C14090e c14090e = (C14090e) c13935e.f27641e;
                    C9701e license = c14090e.license(abstractC9410e);
                    if (license != null) {
                        c14090e.loadAd(license, c13486e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                metrica(message);
                return;
            case 10:
                vip(message);
                return;
            default:
                C18424e c18424e = (C18424e) message.obj;
                C11106e c11106e = (C11106e) this.vip;
                if (c11106e.m3002catch(c18424e)) {
                    InterfaceC10645e interfaceC10645e = c18424e.license;
                    interfaceC10645e.getClass();
                    interfaceC10645e.ad();
                    c11106e.m3020static(c18424e);
                    return;
                }
                return;
        }
    }

    public void license(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.ad) {
            case 3:
                Bundle data = message.getData();
                ClassLoader classLoader = C17974e.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j);
            default:
                return super.sendMessageAtTime(message, j);
        }
    }
}
