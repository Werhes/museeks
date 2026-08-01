package defpackage;

import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11473e {
    public static final C15492e ad = new AbstractC4455e(C17121e.f33499e);
    public static final C15492e vip = new AbstractC4455e(C17121e.f33504e);
    public static final C15492e metrica = new AbstractC4455e(C17121e.f33498e);
    public static final C15492e license = new AbstractC4455e(C17121e.f33506e);
    public static final C15492e appmetrica = new AbstractC4455e(C17121e.f33496e);
    public static final C15492e purchase = new AbstractC4455e(C17121e.f33495e);
    public static final C15492e billing = new AbstractC4455e(C7309e.f14938e);
    public static final C15492e yandex = new AbstractC4455e(C17121e.f33493e);
    public static final C15492e startapp = new AbstractC4455e(C17121e.f33489e);
    public static final C15492e adcel = new AbstractC4455e(C17121e.f33488e);
    public static final C15492e mopub = new AbstractC4455e(C17121e.f33500e);
    public static final C15492e advert = new AbstractC4455e(C7309e.f14952e);
    public static final C15492e smaato = new AbstractC4455e(C7309e.f14935e);
    public static final C15492e amazon = new AbstractC4455e(C7309e.f14957e);
    public static final C15492e loadAd = new AbstractC4455e(C7309e.f14946e);
    public static final C15492e Signature = new AbstractC4455e(C7309e.f14948e);
    public static final C15492e admob = new AbstractC4455e(C7309e.f14939e);
    public static final C15492e subscription = new AbstractC4455e(C7309e.f14937e);
    public static final C15492e remoteconfig = new AbstractC4455e(C7309e.f14936e);
    public static final C15492e pro = new AbstractC4455e(C7309e.f14941e);
    public static final C15492e signatures = new AbstractC4455e(C7309e.f14944e);
    public static final C15492e tapsense = new AbstractC4455e(C7309e.f14956e);
    public static final C5015e isVip = new C5015e(C7309e.f14954e);
    public static final C15492e inmobi = new AbstractC4455e(C17121e.f33501e);

    public static final void ad(InterfaceC16590e interfaceC16590e, C1774e c1774e, Function2 function2, C13770e c13770e, int i) {
        c13770e.m3671package(1925803616);
        int i2 = i | (c13770e.purchase(interfaceC16590e) ? 4 : 2) | (c13770e.purchase(c1774e) ? 32 : 16) | (c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e;
            C14815e ad2 = ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.m1710getAccessibilityManager());
            C14815e ad3 = vip.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getAutofill());
            C14815e ad4 = license.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getAutofillManager());
            C14815e ad5 = metrica.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getAutofillTree());
            C14815e ad6 = appmetrica.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.m1712getClipboardManager());
            C14815e ad7 = purchase.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.m1711getClipboard());
            C14815e ad8 = yandex.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getDensity());
            C14815e ad9 = startapp.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getFocusOwner());
            C14815e ad10 = adcel.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getFontLoader());
            ad10.f29336e = false;
            C14815e ad11 = mopub.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getFontFamilyResolver());
            ad11.f29336e = false;
            AbstractC1101e.vip(new C14815e[]{ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9, ad10, ad11, advert.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getHapticFeedBack()), smaato.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getInputModeManager()), amazon.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getLayoutDirection()), Signature.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getTextInputService()), admob.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getSoftwareKeyboardController()), subscription.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getTextToolbar()), remoteconfig.ad(c1774e), pro.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getViewConfiguration()), signatures.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getWindowInfo()), tapsense.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getPointerIconService()), billing.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getGraphicsContext()), AbstractC2256e.ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getRetainedValuesStore()), loadAd.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getLocaleList())}, function2, c13770e, ((i2 >> 3) & 112) | 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription2 = c13770e.subscription();
        if (subscription2 != null) {
            subscription2.license = new C6477e(interfaceC16590e, c1774e, function2, i, 2);
        }
    }

    public static final void vip(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
