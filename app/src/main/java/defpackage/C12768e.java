package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12768e extends AbstractC5604e {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        Catalog2Placeholder catalog2Placeholder = (Catalog2Placeholder) obj;
        C14253e c14253e = (C14253e) interfaceC10283e;
        String str = catalog2Placeholder.vip;
        TextView textView = c14253e.f28185e;
        MaterialButton materialButton = c14253e.f28187e;
        ImageView imageView = c14253e.f28186e;
        List list = catalog2Placeholder.license;
        Catalog2Button catalog2Button = null;
        String license = list != null ? AbstractC8769e.license(list) : null;
        InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
        C5944e c5944e = new C5944e(imageView.getContext());
        c5944e.metrica = license;
        AbstractC15659e.license(c5944e, imageView);
        ((C0624e) ad).ad(c5944e.ad());
        imageView.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        textView.setText(str);
        c14253e.f28188e.setText(catalog2Placeholder.metrica);
        textView.setVisibility(str.length() > 0 ? 0 : 8);
        List list2 = catalog2Placeholder.appmetrica;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Catalog2Button) next).ad instanceof Catalog2ButtonAction.OpenUrl) {
                    catalog2Button = next;
                    break;
                }
            }
            catalog2Button = catalog2Button;
        }
        materialButton.setVisibility(catalog2Button != null ? 0 : 8);
        if (catalog2Button != null) {
            materialButton.setText(catalog2Button.yandex);
            materialButton.setOnClickListener(new ViewOnClickListenerC11834e(catalog2Button, 1));
        }
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.c3_banner_placeholder;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_banner_placeholder, viewGroup, false);
        int i = R.id.button;
        MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.button);
        if (materialButton != null) {
            MaterialCardView materialCardView = (MaterialCardView) inflate;
            i = R.id.image;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.image);
            if (imageView != null) {
                i = R.id.text;
                TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.text);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                    if (textView2 != null) {
                        return new C14253e(imageView, textView, textView2, materialButton, materialCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
