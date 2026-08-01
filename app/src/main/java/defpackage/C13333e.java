package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13333e implements InterfaceC18157e {
    public final AutofillValue ad;

    public C13333e(AutofillValue autofillValue) {
        this.ad = autofillValue;
    }

    public final Boolean ad() {
        if (this.ad.isToggle()) {
            return Boolean.valueOf(this.ad.getToggleValue());
        }
        return null;
    }

    public final CharSequence vip() {
        if (this.ad.isText()) {
            return this.ad.getTextValue();
        }
        return null;
    }
}
