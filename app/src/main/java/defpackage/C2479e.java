package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2479e extends AbstractC18491e {
    public final long appmetrica;
    public final String billing;
    public final String purchase;
    public AppBarLayout yandex;

    public C2479e(long j, String str, String str2) {
        this.appmetrica = j;
        this.purchase = str;
        this.billing = str2;
    }

    @Override // defpackage.AbstractC18491e
    public final void advert(String str) {
    }

    @Override // defpackage.AbstractC18491e
    public final View purchase(Context context, ViewGroup viewGroup) {
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkxui_toolbar_user, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) inflate;
        int i2 = R.id.avatar;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.avatar);
        if (imageView != null) {
            i2 = R.id.massaction;
            ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, R.id.massaction);
            if (imageView2 != null) {
                i2 = R.id.profile;
                TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.profile);
                if (textView != null) {
                    i2 = R.id.profile_subtitle;
                    TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.profile_subtitle);
                    if (textView2 != null) {
                        i2 = R.id.search;
                        ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate, R.id.search);
                        if (imageView3 != null) {
                            i2 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) AbstractC7779e.vip(inflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
                                C5944e c5944e = new C5944e(imageView.getContext());
                                c5944e.metrica = this.purchase;
                                AbstractC15659e.license(c5944e, imageView);
                                final int i3 = 1;
                                AbstractC2182e.metrica(c5944e, new C4668e());
                                ((C0624e) ad).ad(c5944e.ad());
                                textView.setText(this.billing);
                                materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2181e(context, 0));
                                AbstractC17680e.mopub(textView2);
                                imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: eؙْٕ

                                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                    public final /* synthetic */ C2479e f26047e;

                                    {
                                        this.f26047e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i) {
                                            case 0:
                                                AbstractC7237e.ad(view, new C16031e(this.f26047e.appmetrica));
                                                return;
                                            default:
                                                new C11467e(view, new C12439e(this.f26047e, view, 9)).m3218this();
                                                return;
                                        }
                                    }
                                });
                                imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: eؙْٕ

                                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                                    public final /* synthetic */ C2479e f26047e;

                                    {
                                        this.f26047e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i3) {
                                            case 0:
                                                AbstractC7237e.ad(view, new C16031e(this.f26047e.appmetrica));
                                                return;
                                            default:
                                                new C11467e(view, new C12439e(this.f26047e, view, 9)).m3218this();
                                                return;
                                        }
                                    }
                                });
                                this.yandex = appBarLayout;
                                C3663e c3663e = new C3663e();
                                c3663e.ad = 0;
                                appBarLayout.setLayoutParams(c3663e);
                                AppBarLayout appBarLayout2 = this.yandex;
                                if (appBarLayout2 == null) {
                                    return null;
                                }
                                return appBarLayout2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.AbstractC18491e
    public final void smaato(int i) {
        AppBarLayout appBarLayout = this.yandex;
        if (appBarLayout == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appBarLayout.getLayoutParams();
        marginLayoutParams.topMargin = i;
        AppBarLayout appBarLayout2 = this.yandex;
        if (appBarLayout2 == null) {
            appBarLayout2 = null;
        }
        appBarLayout2.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.AbstractC18491e
    public final View startapp() {
        AppBarLayout appBarLayout = this.yandex;
        if (appBarLayout == null) {
            return null;
        }
        return appBarLayout;
    }
}
