package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10264e {
    public CharSequence Signature;
    public final int ad;
    public int adcel;
    public boolean admob;
    public ColorStateList ads;
    public AnimatorSet advert;
    public int amazon;
    public int applovin;
    public final TimeInterpolator appmetrica;
    public final Context billing;
    public boolean inmobi;
    public C13272e isPro;
    public CharSequence isVip;
    public final TimeInterpolator license;
    public int loadAd;
    public final int metrica;
    public FrameLayout mopub;
    public Typeface premium;
    public int pro;
    public final TimeInterpolator purchase;
    public CharSequence remoteconfig;
    public int signatures;
    public final float smaato;
    public LinearLayout startapp;
    public C13272e subscription;
    public ColorStateList tapsense;
    public final int vip;
    public final TextInputLayout yandex;

    public C10264e(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.billing = context;
        this.yandex = textInputLayout;
        this.smaato = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.ad = AbstractC18292e.yandex(context, R.attr.motionDurationShort4, 217);
        this.vip = AbstractC18292e.yandex(context, R.attr.motionDurationMedium4, 167);
        this.metrica = AbstractC18292e.yandex(context, R.attr.motionDurationShort4, 167);
        this.license = AbstractC18292e.startapp(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC16664e.license);
        LinearInterpolator linearInterpolator = AbstractC16664e.ad;
        this.appmetrica = AbstractC18292e.startapp(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.purchase = AbstractC18292e.startapp(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void ad(C13272e c13272e, int i) {
        if (this.startapp == null && this.mopub == null) {
            Context context = this.billing;
            LinearLayout linearLayout = new LinearLayout(context);
            this.startapp = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.startapp;
            TextInputLayout textInputLayout = this.yandex;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.mopub = new FrameLayout(context);
            this.startapp.addView(this.mopub, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                vip();
            }
        }
        if (i == 0 || i == 1) {
            this.mopub.setVisibility(0);
            this.mopub.addView(c13272e);
        } else {
            this.startapp.addView(c13272e, new LinearLayout.LayoutParams(-2, -2));
        }
        this.startapp.setVisibility(0);
        this.adcel++;
    }

    public final TextView appmetrica(int i) {
        if (i == 1) {
            return this.subscription;
        }
        if (i != 2) {
            return null;
        }
        return this.isPro;
    }

    public final void billing(C13272e c13272e, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.startapp;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.mopub) != null) {
            frameLayout.removeView(c13272e);
        } else {
            linearLayout.removeView(c13272e);
        }
        int i2 = this.adcel - 1;
        this.adcel = i2;
        LinearLayout linearLayout2 = this.startapp;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void license(ArrayList arrayList, boolean z, C13272e c13272e, int i, int i2, int i3) {
        if (c13272e == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c13272e, (Property<C13272e, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.metrica;
            ofFloat.setDuration(z2 ? this.vip : i4);
            ofFloat.setInterpolator(z2 ? this.appmetrica : this.purchase);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c13272e, (Property<C13272e, Float>) View.TRANSLATION_Y, -this.smaato, 0.0f);
            ofFloat2.setDuration(this.ad);
            ofFloat2.setInterpolator(this.license);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final void metrica() {
        AnimatorSet animatorSet = this.advert;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void purchase() {
        this.Signature = null;
        metrica();
        if (this.amazon == 1) {
            if (!this.inmobi || TextUtils.isEmpty(this.isVip)) {
                this.loadAd = 0;
            } else {
                this.loadAd = 2;
            }
        }
        startapp(this.amazon, this.loadAd, yandex(this.subscription, BuildConfig.FLAVOR));
    }

    public final void startapp(int i, int i2, boolean z) {
        TextView appmetrica;
        TextView appmetrica2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.advert = animatorSet;
            ArrayList arrayList = new ArrayList();
            license(arrayList, this.inmobi, this.isPro, 2, i, i2);
            license(arrayList, this.admob, this.subscription, 1, i, i2);
            AbstractC8636e.vip(animatorSet, arrayList);
            animatorSet.addListener(new C4283e(this, i2, appmetrica(i), i, appmetrica(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (appmetrica2 = appmetrica(i2)) != null) {
                appmetrica2.setVisibility(0);
                appmetrica2.setAlpha(1.0f);
            }
            if (i != 0 && (appmetrica = appmetrica(i)) != null) {
                appmetrica.setVisibility(4);
                if (i == 1) {
                    appmetrica.setText((CharSequence) null);
                }
            }
            this.amazon = i2;
        }
        TextInputLayout textInputLayout = this.yandex;
        textInputLayout.subscription();
        textInputLayout.signatures(z, false);
        textInputLayout.inmobi();
    }

    public final void vip() {
        if (this.startapp != null) {
            TextInputLayout textInputLayout = this.yandex;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.billing;
                boolean billing = AbstractC2774e.billing(context);
                LinearLayout linearLayout = this.startapp;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                int paddingStart = editText.getPaddingStart();
                if (billing) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (billing) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (billing) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final boolean yandex(C13272e c13272e, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        TextInputLayout textInputLayout = this.yandex;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.loadAd == this.amazon && c13272e != null && TextUtils.equals(c13272e.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
