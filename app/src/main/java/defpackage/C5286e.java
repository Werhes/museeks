package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5286e implements InterfaceC1322e {
    public Toolbar ad;
    public CharSequence adcel;
    public boolean advert;
    public int amazon;
    public Drawable appmetrica;
    public boolean billing;
    public Drawable license;
    public Drawable loadAd;
    public View metrica;
    public Window.Callback mopub;
    public Drawable purchase;
    public C13631e smaato;
    public CharSequence startapp;
    public int vip;
    public CharSequence yandex;

    public final void ad(int i) {
        View view;
        Toolbar toolbar = this.ad;
        int i2 = this.vip ^ i;
        this.vip = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    vip();
                }
                if ((this.vip & 4) != 0) {
                    Drawable drawable = this.purchase;
                    if (drawable == null) {
                        drawable = this.loadAd;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                metrica();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.yandex);
                    toolbar.setSubtitle(this.startapp);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.metrica) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void metrica() {
        Drawable drawable;
        int i = this.vip;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.appmetrica;
            if (drawable == null) {
                drawable = this.license;
            }
        } else {
            drawable = this.license;
        }
        this.ad.setLogo(drawable);
    }

    public final void vip() {
        Toolbar toolbar = this.ad;
        if ((this.vip & 4) != 0) {
            if (TextUtils.isEmpty(this.adcel)) {
                toolbar.setNavigationContentDescription(this.amazon);
            } else {
                toolbar.setNavigationContentDescription(this.adcel);
            }
        }
    }
}
