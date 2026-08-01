package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324e implements InterfaceC2984e {
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e ad;
    public final AutofillId license;
    public final AutofillManager metrica;
    public final C12201e vip;

    public C0324e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C12201e c12201e) {
        this.ad = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.vip = c12201e;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC5014e.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.metrica = autofillManager;
        viewTreeObserverOnGlobalLayoutListenerC5014e.setImportantForAutofill(1);
        C12698e license = AbstractC0863e.license(viewTreeObserverOnGlobalLayoutListenerC5014e);
        AutofillId autofillId = license != null ? (AutofillId) license.ad : null;
        if (autofillId == null) {
            throw AbstractC8703e.Signature("Required value was null.");
        }
        this.license = autofillId;
    }
}
