package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9882e {
    public final /* synthetic */ int ad;
    public final Object appmetrica;
    public Object license;
    public boolean metrica;
    public Object purchase;
    public final Object vip;

    public AbstractC9882e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new Object();
                this.appmetrica = new C18263e(1, this);
                this.license = new WeakReference(null);
                return;
            default:
                this.vip = new Object();
                this.appmetrica = new C18263e(0, this);
                this.license = new WeakReference(null);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC9882e(C11950e c11950e, Function2 function2, InterfaceC14388e interfaceC14388e) {
        this.ad = 2;
        this.vip = c11950e;
        this.appmetrica = (C7140e) function2;
        this.license = interfaceC14388e;
        this.purchase = new C17424e(15);
    }

    private void Signature() {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static void ad(C2561e c2561e) {
        ?? r3 = c2561e.ad;
        int size = r3.size();
        for (int i = 0; i < size; i++) {
            ((C2401e) r3.get(i)).ad();
        }
    }

    private void admob() {
    }

    private void amazon() {
    }

    /* renamed from: extends, reason: not valid java name */
    private void m2743extends() {
    }

    private boolean mopub(Intent intent) {
        C2584e c2584e;
        HandlerC17797e handlerC17797e;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.vip) {
                c2584e = (C2584e) ((WeakReference) this.license).get();
                handlerC17797e = (HandlerC17797e) this.purchase;
            }
            if (c2584e != null && handlerC17797e != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C18287e metrica = c2584e.metrica();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    metrica(c2584e, handlerC17797e);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    metrica(c2584e, handlerC17797e);
                    return true;
                }
                if (!this.metrica) {
                    this.metrica = true;
                    handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(1, metrica), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                handlerC17797e.removeMessages(1);
                this.metrica = false;
                C4820e c4820e = c2584e.billing;
                if (((c4820e == null ? 0L : c4820e.f10266e) & 32) != 0) {
                    mo1937this();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: native, reason: not valid java name */
    private void m2744native() {
    }

    private void premium(long j) {
    }

    private void smaato() {
    }

    private void subs(long j) {
    }

    /* renamed from: try, reason: not valid java name */
    private void m2745try() {
    }

    /* renamed from: while, reason: not valid java name */
    private void m2746while() {
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m2747abstract(C15944e c15944e, Handler handler) {
        synchronized (this.vip) {
            try {
                this.license = new WeakReference(c15944e);
                HandlerC17797e handlerC17797e = (HandlerC17797e) this.purchase;
                HandlerC17797e handlerC17797e2 = null;
                if (handlerC17797e != null) {
                    handlerC17797e.removeCallbacksAndMessages(null);
                }
                if (c15944e != null && handler != null) {
                    handlerC17797e2 = new HandlerC17797e(this, handler.getLooper(), 10);
                }
                this.purchase = handlerC17797e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean adcel(Intent intent) {
        C15944e c15944e;
        HandlerC17797e handlerC17797e;
        KeyEvent keyEvent;
        switch (this.ad) {
            case 0:
                return mopub(intent);
            default:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.vip) {
                    c15944e = (C15944e) ((WeakReference) this.license).get();
                    handlerC17797e = (HandlerC17797e) this.purchase;
                }
                if (c15944e == null || handlerC17797e == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                C15938e metrica = c15944e.metrica();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    vip(c15944e, handlerC17797e);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    vip(c15944e, handlerC17797e);
                } else if (this.metrica) {
                    handlerC17797e.removeMessages(1);
                    this.metrica = false;
                    PlaybackStateCompat license = c15944e.license();
                    if (((license == null ? 0L : license.f41e) & 32) != 0) {
                        mo1937this();
                    }
                } else {
                    this.metrica = true;
                    handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(1, metrica), ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
        }
    }

    public void ads(long j) {
        int i = this.ad;
    }

    public void advert() {
        int i = this.ad;
    }

    public void applovin() {
    }

    public void appmetrica(C17571e c17571e, int i) {
    }

    public void billing(String str) {
    }

    /* renamed from: break */
    public void mo1925break() {
    }

    /* renamed from: class */
    public void mo1926class(C7434e c7434e) {
    }

    public void crashlytics(float f) {
    }

    /* renamed from: default, reason: not valid java name */
    public void m2748default(C2584e c2584e, Handler handler) {
        synchronized (this.vip) {
            try {
                this.license = new WeakReference(c2584e);
                HandlerC17797e handlerC17797e = (HandlerC17797e) this.purchase;
                if (handlerC17797e != null) {
                    handlerC17797e.removeCallbacksAndMessages(null);
                }
                this.purchase = new HandlerC17797e(this, handler.getLooper(), 9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void firebase(C7434e c7434e) {
    }

    /* renamed from: goto */
    public void mo1927goto(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: implements, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2749implements(kotlin.jvm.functions.Function2 r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C16674e
            if (r0 == 0) goto L13
            r0 = r6
            eؘٖۨ r0 = (defpackage.C16674e) r0
            int r1 = r0.f32721e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32721e = r1
            goto L18
        L13:
            eؘٖۨ r0 = new eؘٖۨ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32720e
            int r1 = r0.f32721e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L4f
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            r4.metrica = r2
            eُ٘ٗ r6 = new eُ٘ٗ
            r1 = 0
            r3 = 22
            r6.<init>(r4, r5, r1, r3)
            r0.f32721e = r2
            eٌؑٚ r5 = new eٌؑٚ
            eٌِٞ r1 = r0.admob()
            r3 = 1
            r5.<init>(r1, r0, r3)
            java.lang.Object r5 = defpackage.AbstractC18491e.amazon(r5, r2, r5, r6)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L4f
            return r6
        L4f:
            r5 = 0
            r4.metrica = r5
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9882e.m2749implements(kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    public void inmobi(Uri uri, Bundle bundle) {
    }

    /* renamed from: interface */
    public void mo1930interface(int i) {
    }

    public void isPro(C17571e c17571e) {
    }

    public void isVip(String str, Bundle bundle) {
    }

    public void license(C17571e c17571e) {
    }

    public void loadAd() {
        int i = this.ad;
    }

    public void metrica(C2584e c2584e, Handler handler) {
        if (this.metrica) {
            this.metrica = false;
            handler.removeMessages(1);
            C4820e c4820e = c2584e.billing;
            long j = c4820e == null ? 0L : c4820e.f10266e;
            boolean z = c4820e != null && c4820e.f10275e == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                advert();
            } else {
                if (z || !z2) {
                    return;
                }
                loadAd();
            }
        }
    }

    public void pro(Uri uri, Bundle bundle) {
    }

    /* renamed from: protected */
    public void mo1933protected(long j) {
    }

    public void purchase(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void remoteconfig(String str, Bundle bundle) {
    }

    public void signatures() {
    }

    public void startapp() {
    }

    public void subscription(String str, Bundle bundle) {
    }

    public void tapsense(String str, Bundle bundle) {
    }

    /* renamed from: this */
    public void mo1937this() {
        int i = this.ad;
    }

    /* renamed from: throw */
    public void mo1938throw() {
        int i = this.ad;
    }

    public void vip(C15944e c15944e, Handler handler) {
        if (this.metrica) {
            this.metrica = false;
            handler.removeMessages(1);
            PlaybackStateCompat license = c15944e.license();
            long j = license == null ? 0L : license.f41e;
            boolean z = license != null && license.f50e == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                advert();
            } else {
                if (z || !z2) {
                    return;
                }
                loadAd();
            }
        }
    }

    public void yandex(String str, Bundle bundle) {
    }
}
