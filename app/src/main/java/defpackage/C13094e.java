package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13094e implements InterfaceC10309e {
    public final View ad;
    public final Object adcel;
    public final C5806e advert;
    public RunnableC1352e amazon;
    public Function1 appmetrica;
    public C0398e billing;
    public boolean license;
    public final ExecutorC17160e metrica;
    public Rect mopub;
    public Function1 purchase;
    public final C12431e smaato;
    public final ArrayList startapp;
    public final C12894e vip;
    public C16174e yandex;

    public C13094e(View view, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        C12894e c12894e = new C12894e(view);
        ExecutorC17160e executorC17160e = new ExecutorC17160e(5, Choreographer.getInstance());
        this.ad = view;
        this.vip = c12894e;
        this.metrica = executorC17160e;
        this.appmetrica = C8082e.f16407e;
        this.purchase = C8082e.f16418e;
        this.billing = new C0398e(C12347e.vip, 4, BuildConfig.FLAVOR);
        this.yandex = C16174e.billing;
        this.startapp = new ArrayList();
        this.adcel = AbstractC18039e.appmetrica(3, new C17073e(18, this));
        this.advert = new C5806e(viewTreeObserverOnGlobalLayoutListenerC5014e, c12894e);
        this.smaato = new C12431e(0, new EnumC7379e[16]);
    }

    @Override // defpackage.InterfaceC10309e
    public final void ad(C0398e c0398e, InterfaceC6256e interfaceC6256e, C12476e c12476e, C14772e c14772e, C0763e c0763e, C0763e c0763e2) {
        C5806e c5806e = this.advert;
        synchronized (c5806e.metrica) {
            try {
                c5806e.adcel = c0398e;
                c5806e.advert = interfaceC6256e;
                c5806e.mopub = c12476e;
                c5806e.smaato = c14772e;
                c5806e.amazon = c0763e;
                c5806e.loadAd = c0763e2;
                if (!c5806e.appmetrica) {
                    if (c5806e.license) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                c5806e.ad();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC10309e
    public final void appmetrica(C0398e c0398e, C16174e c16174e, C9675e c9675e, C11840e c11840e) {
        this.license = true;
        this.billing = c0398e;
        this.yandex = c16174e;
        this.appmetrica = c9675e;
        this.purchase = c11840e;
        startapp(EnumC7379e.f15130e);
    }

    @Override // defpackage.InterfaceC10309e
    public final void billing() {
        startapp(EnumC7379e.f15129e);
    }

    @Override // defpackage.InterfaceC10309e
    public final void license() {
        this.license = false;
        this.appmetrica = C8082e.f16406e;
        this.purchase = C18314e.f35974e;
        this.mopub = null;
        startapp(EnumC7379e.f15128e);
    }

    @Override // defpackage.InterfaceC10309e
    public final void metrica() {
        startapp(EnumC7379e.f15127e);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC10309e
    public final void purchase(C0398e c0398e, C0398e c0398e2) {
        boolean z = (C12347e.metrica(this.billing.vip, c0398e2.vip) && AbstractC7890e.billing(this.billing.metrica, c0398e2.metrica)) ? false : true;
        this.billing = c0398e2;
        int size = this.startapp.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC16581e inputConnectionC16581e = (InputConnectionC16581e) ((WeakReference) this.startapp.get(i)).get();
            if (inputConnectionC16581e != null) {
                inputConnectionC16581e.license = c0398e2;
            }
        }
        C5806e c5806e = this.advert;
        synchronized (c5806e.metrica) {
            c5806e.adcel = null;
            c5806e.advert = null;
            c5806e.mopub = null;
            c5806e.smaato = C5430e.f11645e;
            c5806e.amazon = null;
            c5806e.loadAd = null;
            Unit unit = Unit.INSTANCE;
        }
        if (AbstractC7890e.billing(c0398e, c0398e2)) {
            if (z) {
                C12894e c12894e = this.vip;
                int billing = C12347e.billing(c0398e2.vip);
                int purchase = C12347e.purchase(c0398e2.vip);
                C12347e c12347e = this.billing.metrica;
                int billing2 = c12347e != null ? C12347e.billing(c12347e.ad) : -1;
                C12347e c12347e2 = this.billing.metrica;
                ((InputMethodManager) c12894e.f25750e.getValue()).updateSelection((View) c12894e.f25751e, billing, purchase, billing2, c12347e2 != null ? C12347e.purchase(c12347e2.ad) : -1);
                return;
            }
            return;
        }
        if (c0398e != null && (!AbstractC7890e.billing(c0398e.ad.f20850e, c0398e2.ad.f20850e) || (C12347e.metrica(c0398e.vip, c0398e2.vip) && !AbstractC7890e.billing(c0398e.metrica, c0398e2.metrica)))) {
            C12894e c12894e2 = this.vip;
            ((InputMethodManager) c12894e2.f25750e.getValue()).restartInput((View) c12894e2.f25751e);
            return;
        }
        int size2 = this.startapp.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC16581e inputConnectionC16581e2 = (InputConnectionC16581e) ((WeakReference) this.startapp.get(i2)).get();
            if (inputConnectionC16581e2 != null) {
                C0398e c0398e3 = this.billing;
                C12894e c12894e3 = this.vip;
                if (inputConnectionC16581e2.yandex) {
                    inputConnectionC16581e2.license = c0398e3;
                    if (inputConnectionC16581e2.purchase) {
                        ((InputMethodManager) c12894e3.f25750e.getValue()).updateExtractedText((View) c12894e3.f25751e, inputConnectionC16581e2.appmetrica, AbstractC3062e.Signature(c0398e3));
                    }
                    C12347e c12347e3 = c0398e3.metrica;
                    long j = c0398e3.vip;
                    int billing3 = c12347e3 != null ? C12347e.billing(c12347e3.ad) : -1;
                    C12347e c12347e4 = c0398e3.metrica;
                    ((InputMethodManager) c12894e3.f25750e.getValue()).updateSelection((View) c12894e3.f25751e, C12347e.billing(j), C12347e.purchase(j), billing3, c12347e4 != null ? C12347e.purchase(c12347e4.ad) : -1);
                }
            }
        }
    }

    public final void startapp(EnumC7379e enumC7379e) {
        this.smaato.license(enumC7379e);
        if (this.amazon == null) {
            RunnableC1352e runnableC1352e = new RunnableC1352e(9, this);
            this.metrica.execute(runnableC1352e);
            this.amazon = runnableC1352e;
        }
    }

    @Override // defpackage.InterfaceC10309e
    public final void vip() {
        startapp(EnumC7379e.f15130e);
    }

    @Override // defpackage.InterfaceC10309e
    public final void yandex(C0763e c0763e) {
        Rect rect;
        this.mopub = new Rect(AbstractC1561e.appmetrica(c0763e.ad), AbstractC1561e.appmetrica(c0763e.vip), AbstractC1561e.appmetrica(c0763e.metrica), AbstractC1561e.appmetrica(c0763e.license));
        if (!this.startapp.isEmpty() || (rect = this.mopub) == null) {
            return;
        }
        this.ad.requestRectangleOnScreen(new Rect(rect));
    }
}
