package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7483e {
    public final TextInputLayout ad;
    public final CheckableImageButton license;
    public final Context metrica;
    public final C9730e vip;

    public AbstractC7483e(C9730e c9730e) {
        this.ad = c9730e.f19244e;
        this.vip = c9730e;
        this.metrica = c9730e.getContext();
        this.license = c9730e.f19245e;
    }

    public final void Signature() {
        this.vip.purchase(false);
    }

    public void ad() {
    }

    public boolean adcel() {
        return this instanceof C12801e;
    }

    public void admob() {
    }

    public void advert(EditText editText) {
    }

    public void amazon(AccessibilityEvent accessibilityEvent) {
    }

    public View.OnFocusChangeListener appmetrica() {
        return null;
    }

    public View.OnFocusChangeListener billing() {
        return null;
    }

    public int license() {
        return 0;
    }

    public void loadAd(boolean z) {
    }

    public int metrica() {
        return 0;
    }

    public boolean mopub() {
        return false;
    }

    public View.OnClickListener purchase() {
        return null;
    }

    public void smaato(C8092e c8092e) {
    }

    public boolean startapp(int i) {
        return true;
    }

    public void subscription() {
    }

    public void vip() {
    }

    public C0211e yandex() {
        return null;
    }
}
