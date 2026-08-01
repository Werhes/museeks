package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311e implements InterfaceC18037e {
    public final Object ad;
    public final View vip;

    public C2311e(ContentCaptureSession contentCaptureSession, View view) {
        this.ad = contentCaptureSession;
        this.vip = view;
    }

    public final void ad() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession advert = C8391e.advert(this.ad);
            C12698e license = AbstractC0863e.license(this.vip);
            Objects.requireNonNull(license);
            advert.notifyViewsDisappeared(C4403e.license(license.ad), new long[]{Long.MIN_VALUE});
        }
    }

    public final void appmetrica(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8391e.advert(this.ad).notifyViewDisappeared(autofillId);
        }
    }

    public final void license(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8391e.advert(this.ad).notifyViewAppeared(viewStructure);
        }
    }

    public final C5389e metrica(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return new C5389e(29, C8391e.advert(this.ad).newVirtualViewStructure(autofillId, j));
    }

    public final void purchase(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.ad).notifyViewTextChanged(autofillId, str);
        }
    }

    public final AutofillId vip(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession advert = C8391e.advert(this.ad);
        C12698e license = AbstractC0863e.license(this.vip);
        Objects.requireNonNull(license);
        return advert.newAutofillId(C4403e.license(license.ad), j);
    }
}
