package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8845e {
    public static final WeakHashMap isVip = new WeakHashMap();
    public final C0675e Signature;
    public final C15752e ad;
    public final C0675e adcel;
    public final C0675e admob;
    public final C15657e advert;
    public final C0675e amazon;
    public final C15752e appmetrica;
    public final C15752e billing;
    public final C15752e license;
    public final C0675e loadAd;
    public final C15752e metrica;
    public final C0576e mopub;
    public final boolean pro;
    public final C15752e purchase;
    public final C0675e remoteconfig;
    public int signatures;
    public final C0675e smaato;
    public final C15752e startapp;
    public final C0675e subscription;
    public final RunnableC7872e tapsense;
    public final C15752e vip;
    public final C15752e yandex;

    public C8845e(View view) {
        C15752e adcel = C16728e.adcel(4, "captionBar");
        this.ad = adcel;
        C15752e adcel2 = C16728e.adcel(128, "displayCutout");
        this.vip = adcel2;
        C15752e adcel3 = C16728e.adcel(8, "ime");
        this.metrica = adcel3;
        C15752e adcel4 = C16728e.adcel(32, "mandatorySystemGestures");
        this.license = adcel4;
        C15752e adcel5 = C16728e.adcel(2, "navigationBars");
        this.appmetrica = adcel5;
        C15752e adcel6 = C16728e.adcel(1, "statusBars");
        this.purchase = adcel6;
        C15752e adcel7 = C16728e.adcel(519, "systemBars");
        this.billing = adcel7;
        C15752e adcel8 = C16728e.adcel(16, "systemGestures");
        this.yandex = adcel8;
        C15752e adcel9 = C16728e.adcel(64, "tappableElement");
        this.startapp = adcel9;
        C0675e c0675e = new C0675e(new C11303e(0, 0, 0, 0), "waterfall");
        this.adcel = c0675e;
        this.mopub = AbstractC14533e.startapp(null);
        C15657e c15657e = new C15657e(new C15657e(adcel7, adcel3), adcel2);
        this.advert = c15657e;
        new C15657e(c15657e, new C15657e(new C15657e(new C15657e(adcel9, adcel4), adcel8), c0675e));
        this.smaato = C16728e.mopub(4, "captionBarIgnoringVisibility");
        this.amazon = C16728e.mopub(2, "navigationBarsIgnoringVisibility");
        this.loadAd = C16728e.mopub(1, "statusBarsIgnoringVisibility");
        this.Signature = C16728e.mopub(519, "systemBarsIgnoringVisibility");
        this.admob = C16728e.mopub(64, "tappableElementIgnoringVisibility");
        this.subscription = new C0675e(new C11303e(0, 0, 0, 0), "imeAnimationTarget");
        this.remoteconfig = new C0675e(new C11303e(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.pro = bool != null ? bool.booleanValue() : false;
        this.tapsense = new RunnableC7872e(this);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        C12948e ad = AbstractC9726e.ad(view);
        if (ad != null) {
            C2893e c2893e = ad.ad;
            adcel.purchase(c2893e.signatures(4));
            adcel2.purchase(c2893e.signatures(128));
            adcel3.purchase(c2893e.signatures(8));
            adcel4.purchase(c2893e.signatures(32));
            adcel5.purchase(c2893e.signatures(2));
            adcel6.purchase(c2893e.signatures(1));
            adcel7.purchase(c2893e.signatures(519));
            adcel8.purchase(c2893e.signatures(16));
            adcel9.purchase(c2893e.signatures(64));
        }
    }

    public static void vip(C8845e c8845e, C12948e c12948e) {
        boolean z = false;
        c8845e.ad.billing(c12948e, 0);
        c8845e.metrica.billing(c12948e, 0);
        c8845e.vip.billing(c12948e, 0);
        c8845e.appmetrica.billing(c12948e, 0);
        c8845e.purchase.billing(c12948e, 0);
        c8845e.billing.billing(c12948e, 0);
        c8845e.yandex.billing(c12948e, 0);
        c8845e.startapp.billing(c12948e, 0);
        c8845e.license.billing(c12948e, 0);
        c8845e.smaato.purchase(AbstractC10510e.billing(c12948e.ad.adcel(4)));
        c8845e.amazon.purchase(AbstractC10510e.billing(c12948e.ad.adcel(2)));
        c8845e.loadAd.purchase(AbstractC10510e.billing(c12948e.ad.adcel(1)));
        c8845e.Signature.purchase(AbstractC10510e.billing(c12948e.ad.adcel(519)));
        c8845e.admob.purchase(AbstractC10510e.billing(c12948e.ad.adcel(64)));
        C10119e yandex = c12948e.ad.yandex();
        c8845e.adcel.purchase(AbstractC10510e.billing(yandex != null ? yandex.ad() : C7088e.appmetrica));
        C17985e c17985e = null;
        if (yandex != null) {
            Path smaato = Build.VERSION.SDK_INT >= 31 ? AbstractC16048e.smaato(yandex.ad) : null;
            if (smaato != null) {
                c17985e = new C17985e(smaato);
            }
        }
        c8845e.mopub.setValue(c17985e);
        synchronized (AbstractC12909e.metrica) {
            C12618e c12618e = AbstractC12909e.adcel.yandex;
            if (c12618e != null) {
                if (c12618e.startapp()) {
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC12909e.ad();
        }
    }

    public final void ad(View view) {
        if (this.signatures == 0) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            RunnableC7872e runnableC7872e = this.tapsense;
            AbstractC4387e.metrica(view, runnableC7872e);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC7872e);
            AbstractC2016e.subscription(view, runnableC7872e);
        }
        this.signatures++;
    }
}
