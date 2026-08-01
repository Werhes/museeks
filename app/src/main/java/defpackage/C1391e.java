package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391e extends AbstractC15946e {
    public final C14858e adcel;

    public C1391e(TextView textView) {
        this.adcel = new C14858e(textView);
    }

    @Override // defpackage.AbstractC15946e
    public final TransformationMethod adcel(TransformationMethod transformationMethod) {
        return !C5188e.license() ? transformationMethod : this.adcel.adcel(transformationMethod);
    }

    @Override // defpackage.AbstractC15946e
    public final boolean billing() {
        return this.adcel.advert;
    }

    @Override // defpackage.AbstractC15946e
    public final InputFilter[] purchase(InputFilter[] inputFilterArr) {
        return !C5188e.license() ? inputFilterArr : this.adcel.purchase(inputFilterArr);
    }

    @Override // defpackage.AbstractC15946e
    public final void startapp(boolean z) {
        boolean license = C5188e.license();
        C14858e c14858e = this.adcel;
        if (license) {
            c14858e.startapp(z);
        } else {
            c14858e.advert = z;
        }
    }

    @Override // defpackage.AbstractC15946e
    public final void yandex(boolean z) {
        if (C5188e.license()) {
            this.adcel.yandex(z);
        }
    }
}
