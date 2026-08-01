package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12801e extends AbstractC7483e {
    public AccessibilityManager Signature;
    public final ViewOnFocusChangeListenerC2391e adcel;
    public ValueAnimator admob;
    public boolean advert;
    public boolean amazon;
    public final int appmetrica;
    public final TimeInterpolator billing;
    public long loadAd;
    public final C0211e mopub;
    public final int purchase;
    public boolean smaato;
    public final ViewOnClickListenerC0123e startapp;
    public ValueAnimator subscription;
    public AutoCompleteTextView yandex;

    public C12801e(C9730e c9730e) {
        super(c9730e);
        this.startapp = new ViewOnClickListenerC0123e(3, this);
        this.adcel = new ViewOnFocusChangeListenerC2391e(this, 1);
        this.mopub = new C0211e(25, this);
        this.loadAd = Long.MAX_VALUE;
        this.purchase = AbstractC18292e.yandex(c9730e.getContext(), R.attr.motionDurationShort3, 67);
        this.appmetrica = AbstractC18292e.yandex(c9730e.getContext(), R.attr.motionDurationShort3, 50);
        this.billing = AbstractC18292e.startapp(c9730e.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC16664e.ad);
    }

    @Override // defpackage.AbstractC7483e
    public final void ad() {
        if (this.Signature.isTouchExplorationEnabled() && this.yandex.getInputType() != 0 && !this.license.hasFocus()) {
            this.yandex.dismissDropDown();
        }
        this.yandex.post(new RunnableC2783e(1, this));
    }

    @Override // defpackage.AbstractC7483e
    public final void admob() {
        int i = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.billing;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.purchase);
        ofFloat.addUpdateListener(new C1498e(i, this));
        this.subscription = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.appmetrica);
        ofFloat2.addUpdateListener(new C1498e(i, this));
        this.admob = ofFloat2;
        ofFloat2.addListener(new C9380e(3, this));
        this.Signature = (AccessibilityManager) this.metrica.getSystemService("accessibility");
    }

    @Override // defpackage.AbstractC7483e
    public final void advert(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.yandex = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: eٖٗۙ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C12801e c12801e = C12801e.this;
                    long j = currentTimeMillis - c12801e.loadAd;
                    if (j < 0 || j > 300) {
                        c12801e.smaato = false;
                    }
                    c12801e.pro();
                    c12801e.smaato = true;
                    c12801e.loadAd = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.yandex.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: eٌؖۢ
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C12801e c12801e = C12801e.this;
                c12801e.smaato = true;
                c12801e.loadAd = System.currentTimeMillis();
                c12801e.remoteconfig(false);
            }
        });
        this.yandex.setThreshold(0);
        TextInputLayout textInputLayout = this.ad;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.Signature.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            this.license.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.AbstractC7483e
    public final void amazon(AccessibilityEvent accessibilityEvent) {
        if (this.Signature.isEnabled() && this.yandex.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.amazon && !this.yandex.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                pro();
                this.smaato = true;
                this.loadAd = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnFocusChangeListener appmetrica() {
        return this.adcel;
    }

    @Override // defpackage.AbstractC7483e
    public final int license() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.AbstractC7483e
    public final int metrica() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.AbstractC7483e
    public final boolean mopub() {
        return this.amazon;
    }

    public final void pro() {
        if (this.yandex == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.loadAd;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.smaato = false;
        }
        if (this.smaato) {
            this.smaato = false;
            return;
        }
        remoteconfig(!this.amazon);
        if (!this.amazon) {
            this.yandex.dismissDropDown();
        } else {
            this.yandex.requestFocus();
            this.yandex.showDropDown();
        }
    }

    @Override // defpackage.AbstractC7483e
    public final View.OnClickListener purchase() {
        return this.startapp;
    }

    public final void remoteconfig(boolean z) {
        if (this.amazon != z) {
            this.amazon = z;
            this.subscription.cancel();
            this.admob.start();
        }
    }

    @Override // defpackage.AbstractC7483e
    public final void smaato(C8092e c8092e) {
        if (this.yandex.getInputType() == 0) {
            c8092e.mopub(Spinner.class.getName());
        }
        if (c8092e.yandex()) {
            c8092e.Signature(null);
        }
    }

    @Override // defpackage.AbstractC7483e
    public final boolean startapp(int i) {
        return i != 0;
    }

    @Override // defpackage.AbstractC7483e
    public final void subscription() {
        AutoCompleteTextView autoCompleteTextView = this.yandex;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.yandex.setOnDismissListener(null);
        }
    }

    @Override // defpackage.AbstractC7483e
    public final C0211e yandex() {
        return this.mopub;
    }
}
