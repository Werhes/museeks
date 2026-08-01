package defpackage;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC11829e extends DialogC6137e implements InterfaceC6812e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public LayoutInflaterFactory2C8158e f23728e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0528e f23729e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [eؙؑۙ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC11829e(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969054(0x7f0401de, float:1.754678E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            eؙؑۙ r2 = new eؙؑۙ
            r2.<init>()
            r4.f23729e = r2
            eًٌّ r2 = r4.billing()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            eًۣۗ r5 = (defpackage.LayoutInflaterFactory2C8158e) r5
            r5.f16609e = r6
            r2.purchase()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC11829e.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) billing();
        layoutInflaterFactory2C8158e.isPro();
        ((ViewGroup) layoutInflaterFactory2C8158e.f16585e.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C8158e.f16562e.ad(layoutInflaterFactory2C8158e.f16563e.getCallback());
    }

    public final AbstractC12346e billing() {
        if (this.f23728e == null) {
            ExecutorC11157e executorC11157e = AbstractC12346e.f24760e;
            this.f23728e = new LayoutInflaterFactory2C8158e(getContext(), getWindow(), this, this);
        }
        return this.f23728e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        billing().billing();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC5960e.adcel(this.f23729e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) billing();
        layoutInflaterFactory2C8158e.isPro();
        return layoutInflaterFactory2C8158e.f16563e.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) billing();
        if (layoutInflaterFactory2C8158e.f16578e != null) {
            layoutInflaterFactory2C8158e.crashlytics();
            layoutInflaterFactory2C8158e.f16578e.getClass();
            layoutInflaterFactory2C8158e.firebase(0);
        }
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        billing().license();
        super.onCreate(bundle);
        billing().purchase();
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) billing();
        layoutInflaterFactory2C8158e.crashlytics();
        C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
        if (c0573e != null) {
            c0573e.f2756extends = false;
            C17679e c17679e = c0573e.f2759native;
            if (c17679e != null) {
                c17679e.ad();
            }
        }
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public final void setContentView(int i) {
        purchase();
        billing().adcel(i);
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public final void setContentView(View view) {
        purchase();
        billing().mopub(view);
    }

    @Override // defpackage.DialogC6137e, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        billing().smaato(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        billing().amazon(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        billing().amazon(charSequence);
    }

    public final boolean startapp(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
