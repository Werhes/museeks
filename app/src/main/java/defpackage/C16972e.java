package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16972e extends Spinner {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f33226e = {R.attr.spinnerMode};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f33227e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11920e f33228e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Context f33229e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Rect f33230e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public SpinnerAdapter f33231e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17790e f33232e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f33233e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC15202e f33234e;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16972e(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969774(0x7f0404ae, float:1.754824E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f33230e = r1
            android.content.Context r1 = r12.getContext()
            defpackage.AbstractC17382e.ad(r12, r1)
            int[] r1 = defpackage.AbstractC6062e.signatures
            eؚؒٗ r2 = defpackage.C0912e.advert(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f3331e
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            eٖ٘ؑ r4 = new eٖ٘ؑ
            r4.<init>(r12)
            r12.f33232e = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            eٟؖ۟ r6 = new eٟؖ۟
            r6.<init>(r13, r4)
            r12.f33229e = r6
            goto L37
        L35:
            r12.f33229e = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.C16972e.f33226e     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            eَُٔ r4 = new eَُٔ
            android.content.Context r9 = r12.f33229e
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f33229e
            eؚؒٗ r1 = defpackage.C0912e.advert(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f3331e
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f33233e = r9
            android.graphics.drawable.Drawable r9 = r1.yandex(r8)
            r4.startapp(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f21628e = r7
            r1.amazon()
            r12.f33234e = r4
            eِۖۨ r1 = new eِۖۨ
            r1.<init>(r12, r12, r4)
            r12.f33228e = r1
            goto Laa
        L9d:
            eٟٗؕ r1 = new eٟٗؕ
            r1.<init>(r12)
            r12.f33234e = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f33672e = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131559816(0x7f0d0588, float:1.8744987E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.amazon()
            r12.f33227e = r8
            android.widget.SpinnerAdapter r13 = r12.f33231e
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f33231e = r6
        Lcf:
            eٖ٘ؑ r13 = r12.f33232e
            r13.applovin(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16972e.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int ad(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.f33230e;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            c17790e.license();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        return interfaceC15202e != null ? interfaceC15202e.vip() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        return interfaceC15202e != null ? interfaceC15202e.loadAd() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f33234e != null ? this.f33233e : super.getDropDownWidth();
    }

    public final InterfaceC15202e getInternalPopup() {
        return this.f33234e;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        return interfaceC15202e != null ? interfaceC15202e.billing() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f33229e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        return interfaceC15202e != null ? interfaceC15202e.appmetrica() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e == null || !interfaceC15202e.ad()) {
            return;
        }
        interfaceC15202e.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f33234e == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), ad(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1197e c1197e = (C1197e) parcelable;
        super.onRestoreInstanceState(c1197e.getSuperState());
        if (!c1197e.f3822e || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2609e(0, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, eٜؒ۟] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        InterfaceC15202e interfaceC15202e = this.f33234e;
        baseSavedState.f3822e = interfaceC15202e != null && interfaceC15202e.ad();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C11920e c11920e = this.f33228e;
        if (c11920e == null || !c11920e.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e == null) {
            return super.performClick();
        }
        if (interfaceC15202e.ad()) {
            return true;
        }
        interfaceC15202e.amazon(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, eٖۧۧ, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f33227e) {
            this.f33231e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e != 0) {
            Context context = this.f33229e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f32689e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f32688e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC14976e.ad((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC15202e.Signature(obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC15202e.smaato(i);
            interfaceC15202e.metrica(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e != null) {
            interfaceC15202e.advert(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f33234e != null) {
            this.f33233e = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e != null) {
            interfaceC15202e.startapp(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC4628e.purchase(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC15202e interfaceC15202e = this.f33234e;
        if (interfaceC15202e != null) {
            interfaceC15202e.yandex(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f33232e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }
}
