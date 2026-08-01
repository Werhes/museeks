package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14271e implements InterfaceC13836e {

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final Method f28211e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final Method f28212e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final Method f28213e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C15703e f28217e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f28218e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C0288e f28220e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ListAdapter f28222e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f28223e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public View f28224e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f28225e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C16235e f28227e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f28228e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public boolean f28229e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final Handler f28230e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f28234e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public Rect f28235e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f28236e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f28237e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28238e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f28232e = -2;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f28214e = -2;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f28226e = 1002;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f28216e = 0;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f28215e = Alert.DURATION_SHOW_INDEFINITELY;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final RunnableC4252e f28221e = new RunnableC4252e(this, 1);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final ViewOnTouchListenerC9607e f28231e = new ViewOnTouchListenerC9607e(1, this);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C13390e f28239e = new C13390e(this);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final RunnableC4252e f28219e = new RunnableC4252e(this, 0);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final Rect f28233e = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f28212e = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f28211e = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f28213e = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.PopupWindow, eٖٕ۟] */
    public C14271e(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f28236e = context;
        this.f28230e = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6062e.loadAd, i, 0);
        this.f28238e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f28237e = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f28234e = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC6062e.remoteconfig, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC4628e.purchase(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f28227e = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public void Signature(ListAdapter listAdapter) {
        C0288e c0288e = this.f28220e;
        if (c0288e == null) {
            this.f28220e = new C0288e(1, this);
        } else {
            ListAdapter listAdapter2 = this.f28222e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0288e);
            }
        }
        this.f28222e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f28220e);
        }
        C15703e c15703e = this.f28217e;
        if (c15703e != null) {
            c15703e.setAdapter(this.f28222e);
        }
    }

    @Override // defpackage.InterfaceC13836e
    public final boolean ad() {
        return this.f28227e.isShowing();
    }

    @Override // defpackage.InterfaceC13836e
    public final C15703e adcel() {
        return this.f28217e;
    }

    public C15703e admob(Context context, boolean z) {
        return new C15703e(context, z);
    }

    public final void advert(int i) {
        this.f28237e = i;
        this.f28234e = true;
    }

    public final Drawable billing() {
        return this.f28227e.getBackground();
    }

    @Override // defpackage.InterfaceC13836e
    public final void dismiss() {
        C16235e c16235e = this.f28227e;
        c16235e.dismiss();
        c16235e.setContentView(null);
        this.f28217e = null;
        this.f28230e.removeCallbacks(this.f28221e);
    }

    public final int loadAd() {
        if (this.f28234e) {
            return this.f28237e;
        }
        return 0;
    }

    public final void metrica(int i) {
        this.f28238e = i;
    }

    @Override // defpackage.InterfaceC13836e
    public final void purchase() {
        int i;
        int ad;
        int paddingBottom;
        C15703e c15703e;
        C15703e c15703e2 = this.f28217e;
        Context context = this.f28236e;
        C16235e c16235e = this.f28227e;
        if (c15703e2 == null) {
            C15703e admob = admob(context, !this.f28229e);
            this.f28217e = admob;
            admob.setAdapter(this.f28222e);
            this.f28217e.setOnItemClickListener(this.f28225e);
            this.f28217e.setFocusable(true);
            this.f28217e.setFocusableInTouchMode(true);
            this.f28217e.setOnItemSelectedListener(new C14105e(this));
            this.f28217e.setOnScrollListener(this.f28239e);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f28223e;
            if (onItemSelectedListener != null) {
                this.f28217e.setOnItemSelectedListener(onItemSelectedListener);
            }
            c16235e.setContentView(this.f28217e);
        }
        Drawable background = c16235e.getBackground();
        Rect rect = this.f28233e;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f28234e) {
                this.f28237e = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c16235e.getInputMethodMode() == 2;
        View view = this.f28224e;
        int i3 = this.f28237e;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f28213e;
            if (method != null) {
                try {
                    ad = ((Integer) method.invoke(c16235e, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            ad = c16235e.getMaxAvailableHeight(view, i3);
        } else {
            ad = AbstractC17376e.ad(c16235e, view, i3, z);
        }
        int i4 = this.f28232e;
        if (i4 == -1) {
            paddingBottom = ad + i;
        } else {
            int i5 = this.f28214e;
            int ad2 = this.f28217e.ad(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), RecyclerView.UNDEFINED_DURATION), ad);
            paddingBottom = ad2 + (ad2 > 0 ? this.f28217e.getPaddingBottom() + this.f28217e.getPaddingTop() + i : 0);
        }
        boolean z2 = c16235e.getInputMethodMode() == 2;
        c16235e.setWindowLayoutType(this.f28226e);
        if (c16235e.isShowing()) {
            if (this.f28224e.isAttachedToWindow()) {
                int i6 = this.f28214e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f28224e.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c16235e.setWidth(this.f28214e == -1 ? -1 : 0);
                        c16235e.setHeight(0);
                    } else {
                        c16235e.setWidth(this.f28214e == -1 ? -1 : 0);
                        c16235e.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c16235e.setOutsideTouchable(true);
                int i7 = i6;
                View view2 = this.f28224e;
                int i8 = this.f28238e;
                int i9 = this.f28237e;
                int i10 = i7 < 0 ? -1 : i7;
                if (i4 < 0) {
                    i4 = -1;
                }
                c16235e.update(view2, i8, i9, i10, i4);
                return;
            }
            return;
        }
        int i11 = this.f28214e;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f28224e.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c16235e.setWidth(i11);
        c16235e.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f28212e;
            if (method2 != null) {
                try {
                    method2.invoke(c16235e, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC3312e.vip(c16235e, true);
        }
        c16235e.setOutsideTouchable(true);
        c16235e.setTouchInterceptor(this.f28231e);
        if (this.f28228e) {
            c16235e.setOverlapAnchor(this.f28218e);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f28211e;
            if (method3 != null) {
                try {
                    method3.invoke(c16235e, this.f28235e);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC3312e.ad(c16235e, this.f28235e);
        }
        c16235e.showAsDropDown(this.f28224e, this.f28238e, this.f28237e, this.f28216e);
        this.f28217e.setSelection(-1);
        if ((!this.f28229e || this.f28217e.isInTouchMode()) && (c15703e = this.f28217e) != null) {
            c15703e.setListSelectionHidden(true);
            c15703e.requestLayout();
        }
        if (this.f28229e) {
            return;
        }
        this.f28230e.post(this.f28219e);
    }

    public final void startapp(Drawable drawable) {
        this.f28227e.setBackgroundDrawable(drawable);
    }

    public final void subscription(int i) {
        Drawable background = this.f28227e.getBackground();
        if (background == null) {
            this.f28214e = i;
            return;
        }
        Rect rect = this.f28233e;
        background.getPadding(rect);
        this.f28214e = rect.left + rect.right + i;
    }

    public final int vip() {
        return this.f28238e;
    }
}
