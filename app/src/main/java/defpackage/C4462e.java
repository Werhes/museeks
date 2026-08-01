package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4462e extends AbstractC7483e {
    public final int appmetrica;
    public final ViewOnClickListenerC0123e billing;
    public EditText purchase;

    public C4462e(C9730e c9730e, int i) {
        super(c9730e);
        this.appmetrica = R.drawable.design_password_eye;
        this.billing = new ViewOnClickListenerC0123e(8, this);
        if (i != 0) {
            this.appmetrica = i;
        }
    }

    @Override // defpackage.AbstractC7483e
    public final boolean adcel() {
        return true;
    }

    @Override // defpackage.AbstractC7483e
    public final void admob() {
        EditText editText = this.purchase;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.purchase.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.AbstractC7483e
    public final void advert(EditText editText) {
        this.purchase = editText;
        Signature();
    }

    @Override // defpackage.AbstractC7483e
    public final int license() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC7483e
    public final int metrica() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.AbstractC7483e
    public final boolean mopub() {
        EditText editText = this.purchase;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnClickListener purchase() {
        return this.billing;
    }

    @Override // defpackage.AbstractC7483e
    public final void subscription() {
        EditText editText = this.purchase;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.AbstractC7483e
    public final void vip() {
        Signature();
    }
}
