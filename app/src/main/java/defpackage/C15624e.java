package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15624e extends AbstractC7483e {
    public final ViewOnClickListenerC0123e adcel;
    public AnimatorSet advert;
    public final int appmetrica;
    public final TimeInterpolator billing;
    public final ViewOnFocusChangeListenerC2391e mopub;
    public final int purchase;
    public ValueAnimator smaato;
    public EditText startapp;
    public final TimeInterpolator yandex;

    public C15624e(C9730e c9730e) {
        super(c9730e);
        this.adcel = new ViewOnClickListenerC0123e(1, this);
        this.mopub = new ViewOnFocusChangeListenerC2391e(this, 0);
        this.appmetrica = AbstractC18292e.yandex(c9730e.getContext(), R.attr.motionDurationShort3, 100);
        this.purchase = AbstractC18292e.yandex(c9730e.getContext(), R.attr.motionDurationShort3, 150);
        this.billing = AbstractC18292e.startapp(c9730e.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC16664e.ad);
        this.yandex = AbstractC18292e.startapp(c9730e.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC16664e.license);
    }

    @Override // defpackage.AbstractC7483e
    public final void ad() {
        if (this.vip.f19237e != null) {
            return;
        }
        remoteconfig(pro());
    }

    @Override // defpackage.AbstractC7483e
    public final void admob() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.yandex);
        ofFloat.setDuration(this.purchase);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eٖٔ
            public final /* synthetic */ C15624e vip;

            {
                this.vip = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C15624e c15624e = this.vip;
                        c15624e.getClass();
                        c15624e.license.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C15624e c15624e2 = this.vip;
                        c15624e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c15624e2.license;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.billing;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.appmetrica;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eٖٔ
            public final /* synthetic */ C15624e vip;

            {
                this.vip = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C15624e c15624e = this.vip;
                        c15624e.getClass();
                        c15624e.license.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C15624e c15624e2 = this.vip;
                        c15624e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c15624e2.license;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.advert = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.advert.addListener(new C2260e(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: eٖٔ
            public final /* synthetic */ C15624e vip;

            {
                this.vip = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C15624e c15624e = this.vip;
                        c15624e.getClass();
                        c15624e.license.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        C15624e c15624e2 = this.vip;
                        c15624e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c15624e2.license;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.smaato = ofFloat3;
        ofFloat3.addListener(new C2260e(this, i));
    }

    @Override // defpackage.AbstractC7483e
    public final void advert(EditText editText) {
        this.startapp = editText;
        this.ad.setEndIconVisible(pro());
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnFocusChangeListener appmetrica() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnFocusChangeListener billing() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC7483e
    public final int license() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.AbstractC7483e
    public final void loadAd(boolean z) {
        if (this.vip.f19237e == null) {
            return;
        }
        remoteconfig(z);
    }

    @Override // defpackage.AbstractC7483e
    public final int metrica() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final boolean pro() {
        EditText editText = this.startapp;
        if (editText != null) {
            return (editText.hasFocus() || this.license.hasFocus()) && this.startapp.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnClickListener purchase() {
        return this.adcel;
    }

    public final void remoteconfig(boolean z) {
        boolean z2 = this.vip.license() == z;
        if (z && !this.advert.isRunning()) {
            this.smaato.cancel();
            this.advert.start();
            if (z2) {
                this.advert.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.advert.cancel();
        this.smaato.start();
        if (z2) {
            this.smaato.end();
        }
    }

    @Override // defpackage.AbstractC7483e
    public final void subscription() {
        EditText editText = this.startapp;
        if (editText != null) {
            editText.post(new RunnableC17584e(17, this));
        }
    }
}
