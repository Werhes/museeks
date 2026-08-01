package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC15370e extends DialogC11829e implements DialogInterface {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C3024e f30302e;

    public DialogInterfaceC15370e(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, adcel(contextThemeWrapper, i));
        this.f30302e = new C3024e(getContext(), this, getWindow());
    }

    public static int adcel(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.DialogC11829e, defpackage.DialogC6137e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        C3024e c3024e = this.f30302e;
        c3024e.vip.setContentView(c3024e.applovin);
        Context context = c3024e.ad;
        Window window = c3024e.metrica;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        LinearLayout linearLayout = c3024e.billing;
        if (linearLayout == null) {
            linearLayout = null;
        }
        boolean z = linearLayout != null;
        if (!z || !C3024e.ad(linearLayout)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
            if (c3024e.yandex) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c3024e.purchase != null) {
                ((LinearLayout.LayoutParams) ((C14840e) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup vip = C3024e.vip(findViewById6, findViewById3);
        ViewGroup vip2 = C3024e.vip(findViewById7, findViewById4);
        ViewGroup vip3 = C3024e.vip(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c3024e.subscription = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c3024e.subscription.setNestedScrollingEnabled(false);
        TextView textView = (TextView) vip2.findViewById(android.R.id.message);
        c3024e.tapsense = textView;
        if (textView != null) {
            String str = c3024e.appmetrica;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c3024e.subscription.removeView(c3024e.tapsense);
                if (c3024e.purchase != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c3024e.subscription.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c3024e.subscription);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c3024e.purchase, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    vip2.setVisibility(8);
                }
            }
        }
        Button button = (Button) vip3.findViewById(android.R.id.button1);
        c3024e.startapp = button;
        ViewOnClickListenerC8021e viewOnClickListenerC8021e = c3024e.f7087class;
        button.setOnClickListener(viewOnClickListenerC8021e);
        if (TextUtils.isEmpty(c3024e.adcel)) {
            c3024e.startapp.setVisibility(8);
            i = 0;
        } else {
            c3024e.startapp.setText(c3024e.adcel);
            c3024e.startapp.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) vip3.findViewById(android.R.id.button2);
        c3024e.advert = button2;
        button2.setOnClickListener(viewOnClickListenerC8021e);
        if (TextUtils.isEmpty(c3024e.smaato)) {
            c3024e.advert.setVisibility(8);
        } else {
            c3024e.advert.setText(c3024e.smaato);
            c3024e.advert.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) vip3.findViewById(android.R.id.button3);
        c3024e.loadAd = button3;
        button3.setOnClickListener(viewOnClickListenerC8021e);
        if (TextUtils.isEmpty(c3024e.Signature)) {
            c3024e.loadAd.setVisibility(8);
        } else {
            c3024e.loadAd.setText(c3024e.Signature);
            c3024e.loadAd.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c3024e.startapp;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c3024e.advert;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c3024e.loadAd;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            vip3.setVisibility(8);
        }
        if (c3024e.isVip != null) {
            vip.addView(c3024e.isVip, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c3024e.pro = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c3024e.license) || !c3024e.crashlytics) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c3024e.pro.setVisibility(8);
                vip.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c3024e.signatures = textView2;
                textView2.setText(c3024e.license);
                Drawable drawable = c3024e.remoteconfig;
                if (drawable != null) {
                    c3024e.pro.setImageDrawable(drawable);
                } else {
                    c3024e.signatures.setPadding(c3024e.pro.getPaddingLeft(), c3024e.pro.getPaddingTop(), c3024e.pro.getPaddingRight(), c3024e.pro.getPaddingBottom());
                    c3024e.pro.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (vip == null || vip.getVisibility() == 8) ? 0 : 1;
        boolean z3 = vip3.getVisibility() != 8;
        if (!z3 && (findViewById = vip2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c3024e.subscription;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c3024e.appmetrica == null && c3024e.purchase == null) ? null : vip.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = vip2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c3024e.purchase;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f59e, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f58e);
            }
        }
        if (!z2) {
            View view = c3024e.purchase;
            if (view == null) {
                view = c3024e.subscription;
            }
            if (view != null) {
                int i3 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    vip2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    vip2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c3024e.purchase;
        if (alertController$RecycleListView2 == null || (listAdapter = c3024e.inmobi) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c3024e.isPro;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f30302e.subscription;
        if (nestedScrollView == null || !nestedScrollView.adcel(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f30302e.subscription;
        if (nestedScrollView == null || !nestedScrollView.adcel(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.DialogC11829e, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C3024e c3024e = this.f30302e;
        c3024e.license = charSequence;
        TextView textView = c3024e.signatures;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
