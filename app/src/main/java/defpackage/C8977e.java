package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8977e<S> extends DialogInterfaceOnCancelListenerC18535e {

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public TextView f18002e;

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public CharSequence f18003e;

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public int f18004e;

    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    public boolean f18005e;

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public int f18006e;

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public CheckableImageButton f18007e;

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public int f18008e;

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public AbstractC11238e f18009e;

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public C1421e f18010e;

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public CharSequence f18011e;

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public int f18012e;

    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    public C11252e f18013e;

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public CharSequence f18014e;

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public C8649e f18015e;

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public CharSequence f18016e;

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public int f18017e;

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public int f18018e;

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public CharSequence f18019e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final LinkedHashSet f18020e;

    /* renamed from: eِۜۙ, reason: contains not printable characters */
    public CharSequence f18021e;

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public boolean f18022e;

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public CharSequence f18023e;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public final LinkedHashSet f18024e;

    /* renamed from: eِ٘, reason: contains not printable characters */
    public int f18025e;

    public C8977e() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f18020e = new LinkedHashSet();
        this.f18024e = new LinkedHashSet();
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m2511extends(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC9476e.loadAd(R.attr.materialCalendarStyle, context, C1421e.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: native, reason: not valid java name */
    public static int m2512native(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar vip = AbstractC12206e.vip();
        vip.set(5, 1);
        Calendar ad = AbstractC12206e.ad(vip);
        ad.get(2);
        ad.get(1);
        int maximum = ad.getMaximum(7);
        ad.getActualMaximum(5);
        ad.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, defpackage.AbstractComponentCallbacksC17875e
    public final void applovin() {
        this.f18009e.f22517e.clear();
        super.applovin();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e
    /* renamed from: goto */
    public final Dialog mo2472goto() {
        Context subs = subs();
        subs();
        int i = this.f18012e;
        if (i == 0) {
            m2513this();
            throw null;
        }
        Dialog dialog = new Dialog(subs, i);
        Context context = dialog.getContext();
        this.f18022e = m2511extends(context, android.R.attr.windowFullscreen);
        this.f18013e = new C11252e(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC11408e.pro, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f18013e.adcel(context);
        this.f18013e.advert(ColorStateList.valueOf(color));
        C11252e c11252e = this.f18013e;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        c11252e.mopub(decorView.getElevation());
        return dialog;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eْۖۙ, java.lang.Object] */
    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, defpackage.AbstractComponentCallbacksC17875e
    public final void inmobi(Bundle bundle) {
        super.inmobi(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f18012e);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C8649e c8649e = this.f18015e;
        ?? obj = new Object();
        int i = C13432e.vip;
        int i2 = C13432e.vip;
        long j = c8649e.f17468e.f32968e;
        long j2 = c8649e.f17466e.f32968e;
        obj.ad = Long.valueOf(c8649e.f17467e.f32968e);
        int i3 = c8649e.f17464e;
        C7365e c7365e = c8649e.f17465e;
        C1421e c1421e = this.f18010e;
        C16831e c16831e = c1421e == null ? null : c1421e.f4255e;
        if (c16831e != null) {
            obj.ad = Long.valueOf(c16831e.f32968e);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c7365e);
        C16831e vip = C16831e.vip(j);
        C16831e vip2 = C16831e.vip(j2);
        C7365e c7365e2 = (C7365e) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.ad;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C8649e(vip, vip2, c7365e2, l == null ? null : C16831e.vip(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f18018e);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f18011e);
        bundle.putInt("INPUT_MODE_KEY", this.f18004e);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f18006e);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f18003e);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f18008e);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f18019e);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f18025e);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f18016e);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f18017e);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f18023e);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, defpackage.AbstractComponentCallbacksC17875e
    public final void isPro() {
        super.isPro();
        Dialog dialog = this.f36330e;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f18022e) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f18013e);
            if (!this.f18005e) {
                View findViewById = crashlytics().findViewById(R.id.fullscreen_header);
                ColorStateList subscription = AbstractC14204e.subscription(findViewById.getBackground());
                Integer valueOf = subscription != null ? Integer.valueOf(subscription.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int mopub = AbstractC9546e.mopub(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(mopub);
                }
                AbstractC13467e.metrica(window, false);
                window.getContext();
                int startapp = i < 27 ? AbstractC3898e.startapp(AbstractC9546e.mopub(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(startapp);
                int intValue = valueOf.intValue();
                boolean z3 = intValue != 0 && AbstractC3898e.appmetrica(intValue) > 0.5d;
                C2691e c2691e = new C2691e(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new C12643e(window, c2691e) : i2 >= 30 ? new C12643e(window, c2691e) : i2 >= 26 ? new C2309e(window, c2691e) : new C2309e(window, c2691e)).mopub(z3);
                boolean z4 = mopub != 0 && AbstractC3898e.appmetrica(mopub) > 0.5d;
                if ((startapp != 0 && AbstractC3898e.appmetrica(startapp) > 0.5d) || (startapp == 0 && z4)) {
                    z = true;
                }
                C2691e c2691e2 = new C2691e(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new C12643e(window, c2691e2) : i3 >= 30 ? new C12643e(window, c2691e2) : i3 >= 26 ? new C2309e(window, c2691e2) : new C2309e(window, c2691e2)).adcel(z);
                C10629e c10629e = new C10629e(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                AbstractC4387e.metrica(findViewById, c10629e);
                this.f18005e = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = subs().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f18013e, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f36330e;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC7257e(dialog2, rect));
        }
        subs();
        int i4 = this.f18012e;
        if (i4 == 0) {
            m2513this();
            throw null;
        }
        m2513this();
        C8649e c8649e = this.f18015e;
        C1421e c1421e = new C1421e();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c8649e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c8649e.f17467e);
        c1421e.m4466interface(bundle);
        this.f18010e = c1421e;
        AbstractC11238e abstractC11238e = c1421e;
        if (this.f18004e == 1) {
            m2513this();
            C8649e c8649e2 = this.f18015e;
            AbstractC11238e c13736e = new C13736e();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i4);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c8649e2);
            c13736e.m4466interface(bundle2);
            abstractC11238e = c13736e;
        }
        this.f18009e = abstractC11238e;
        this.f18002e.setText((this.f18004e == 1 && subs().getResources().getConfiguration().orientation == 2) ? this.f18014e : this.f18021e);
        m2513this();
        throw null;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f18020e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f18024e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f35098e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.AbstractComponentCallbacksC17875e
    public final View pro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f18022e ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f18022e) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2512native(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m2512native(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        textView.setAccessibilityLiveRegion(1);
        this.f18007e = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f18002e = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f18007e.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f18007e;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC4628e.purchase(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC4628e.purchase(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f18007e.setChecked(this.f18004e != 0);
        AbstractC2016e.loadAd(this.f18007e, null);
        CheckableImageButton checkableImageButton2 = this.f18007e;
        this.f18007e.setContentDescription(this.f18004e == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f18007e.setOnClickListener(new ViewOnClickListenerC0123e(5, this));
        m2513this();
        throw null;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC18535e, defpackage.AbstractComponentCallbacksC17875e
    public final void remoteconfig(Bundle bundle) {
        super.remoteconfig(bundle);
        if (bundle == null) {
            bundle = this.f35111e;
        }
        this.f18012e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18015e = (C8649e) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18018e = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f18011e = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f18004e = bundle.getInt("INPUT_MODE_KEY");
        this.f18006e = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f18003e = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f18008e = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f18019e = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f18025e = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f18016e = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f18017e = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f18023e = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f18011e;
        if (charSequence == null) {
            charSequence = subs().getResources().getText(this.f18018e);
        }
        this.f18021e = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f18014e = charSequence;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m2513this() {
        if (this.f35111e.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }
}
