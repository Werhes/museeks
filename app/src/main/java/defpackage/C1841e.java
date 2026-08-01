package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.AbstractList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841e extends AbstractC18491e {
    public C15024e appmetrica;
    public AbstractList purchase;

    public static void loadAd(C1841e c1841e, String str, AbstractList abstractList) {
        Object obj;
        String str2;
        c1841e.getClass();
        c1841e.purchase = abstractList;
        if (abstractList == null || abstractList.size() <= 1) {
            C15024e c15024e = c1841e.appmetrica;
            if (c15024e == null) {
                c15024e = null;
            }
            ((TextView) c15024e.f29789e).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            C15024e c15024e2 = c1841e.appmetrica;
            if (c15024e2 == null) {
                c15024e2 = null;
            }
            ((TextView) c15024e2.f29789e).setOnClickListener(null);
        } else {
            C15024e c15024e3 = c1841e.appmetrica;
            if (c15024e3 == null) {
                c15024e3 = null;
            }
            ((TextView) c15024e3.f29789e).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arrow_down, 0);
            C15024e c15024e4 = c1841e.appmetrica;
            if (c15024e4 == null) {
                c15024e4 = null;
            }
            ((TextView) c15024e4.f29789e).setOnClickListener(new ViewOnClickListenerC7917e(c1841e, 1));
        }
        C15024e c15024e5 = c1841e.appmetrica;
        if (c15024e5 == null) {
            c15024e5 = null;
        }
        ((TextView) c15024e5.f29789e).setVisibility(0);
        C15024e c15024e6 = c1841e.appmetrica;
        if (c15024e6 == null) {
            c15024e6 = null;
        }
        TextView textView = (TextView) c15024e6.f29789e;
        if (abstractList != null) {
            Iterator it = abstractList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Boolean) ((C10985e) obj).f21741e).booleanValue()) {
                        break;
                    }
                }
            }
            C10985e c10985e = (C10985e) obj;
            if (c10985e != null && (str2 = (String) c10985e.f21742e) != null) {
                str = str2;
            }
        }
        textView.setText(str);
        C15024e c15024e7 = c1841e.appmetrica;
        ActionMenuView actionMenuView = (ActionMenuView) (c15024e7 != null ? c15024e7 : null).f29787e;
        actionMenuView.getMenu().clear();
        actionMenuView.setOnMenuItemClickListener(new C17687e(12, c1841e));
    }

    @Override // defpackage.AbstractC18491e
    public final void advert(String str) {
        C15024e c15024e = this.appmetrica;
        if (c15024e == null) {
            c15024e = null;
        }
        ((TextView) c15024e.f29789e).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        C15024e c15024e2 = this.appmetrica;
        if (c15024e2 == null) {
            c15024e2 = null;
        }
        ((TextView) c15024e2.f29789e).setOnClickListener(null);
        C15024e c15024e3 = this.appmetrica;
        if (c15024e3 == null) {
            c15024e3 = null;
        }
        ((TextView) c15024e3.f29789e).setText(str);
        C15024e c15024e4 = this.appmetrica;
        ((TextView) (c15024e4 != null ? c15024e4 : null).f29789e).setVisibility(0);
    }

    @Override // defpackage.AbstractC18491e
    public final void mopub() {
        C15024e c15024e = this.appmetrica;
        if (c15024e == null) {
            c15024e = null;
        }
        Menu menu = ((ActionMenuView) c15024e.f29787e).getMenu();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                VKXApplication.Companion companion = VKXApplication.f36531e;
                icon.setTint(AbstractC15933e.ad(R.attr.reborn_title_color));
            }
        }
    }

    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkxui_spinner_2, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) inflate;
        int i = R.id.actions;
        ActionMenuView actionMenuView = (ActionMenuView) AbstractC7779e.vip(inflate, R.id.actions);
        if (actionMenuView != null) {
            i = R.id.back;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.back);
            if (imageView != null) {
                i = R.id.spinner;
                TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.spinner);
                if (textView != null) {
                    this.appmetrica = new C15024e(appBarLayout, actionMenuView, imageView, textView);
                    imageView.setOnClickListener(new ViewOnClickListenerC2181e(context, 1));
                    C15024e c15024e = this.appmetrica;
                    if (c15024e == null) {
                        c15024e = null;
                    }
                    TextView textView2 = (TextView) c15024e.f29789e;
                    textView2.setVisibility(4);
                    textView2.setOnClickListener(new ViewOnClickListenerC7917e(this, 0));
                    C15024e c15024e2 = this.appmetrica;
                    return (AppBarLayout) (c15024e2 != null ? c15024e2 : null).f29788e;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        C15024e c15024e = this.appmetrica;
        if (c15024e == null) {
            return;
        }
        AppBarLayout appBarLayout = (AppBarLayout) (c15024e == null ? null : c15024e).f29788e;
        if (c15024e == null) {
            c15024e = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((AppBarLayout) c15024e.f29788e).getLayoutParams();
        marginLayoutParams.topMargin = i;
        appBarLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        C15024e c15024e = this.appmetrica;
        if (c15024e == null) {
            c15024e = null;
        }
        return (AppBarLayout) c15024e.f29788e;
    }
}
