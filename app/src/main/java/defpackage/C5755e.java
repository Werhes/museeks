package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5755e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8370e f12180e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Catalog2Button f12181e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Catalog2Layout.CompactHeader f12182e;

    public C5755e(InterfaceC8370e interfaceC8370e, Catalog2Layout.CompactHeader compactHeader, Catalog2Button catalog2Button) {
        this.f12180e = interfaceC8370e;
        this.f12182e = compactHeader;
        this.f12181e = catalog2Button;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        C16695e c16695e = (C16695e) interfaceC10283e;
        ImageView imageView = c16695e.f32757e;
        TextView textView = c16695e.f32756e;
        c16695e.f32758e.setText(this.f12182e.ad);
        Catalog2Button catalog2Button = this.f12181e;
        if (catalog2Button == null) {
            AbstractC17680e.mopub(imageView);
            AbstractC17680e.mopub(textView);
            return;
        }
        if (catalog2Button.ad instanceof C1850e) {
            AbstractC17680e.mopub(textView);
            AbstractC17680e.amazon(imageView);
            final int i2 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eۚۜ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C5755e f36038e;

                {
                    this.f36038e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            C7831e.f15835e.getClass();
                            new File(C7831e.f15834e, "OrbitSearchHistory.dat").delete();
                            this.f36038e.f12180e.subscription();
                            return;
                        default:
                            C3288e.ad(view.getContext(), this.f36038e.f12181e);
                            return;
                    }
                }
            });
            return;
        }
        AbstractC17680e.mopub(imageView);
        AbstractC17680e.amazon(textView);
        textView.setText(catalog2Button.yandex);
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: eۚۜ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C5755e f36038e;

            {
                this.f36038e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        C7831e.f15835e.getClass();
                        new File(C7831e.f15834e, "OrbitSearchHistory.dat").delete();
                        this.f36038e.f12180e.subscription();
                        return;
                    default:
                        C3288e.ad(view.getContext(), this.f36038e.f12181e);
                        return;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_header_compact, viewGroup, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.close);
        if (imageView != null) {
            i = R.id.show_all_btn;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.show_all_btn);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                if (textView2 != null) {
                    return new C16695e((FrameLayout) inflate, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.c3_header_compact;
    }
}
