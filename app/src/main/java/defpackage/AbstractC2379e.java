package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2379e {
    public static final void ad(C5944e c5944e, Integer num, LayerDrawable layerDrawable, C9377e c9377e) {
        AbstractC2182e.ad(c5944e, true);
        int i = 9;
        if (num != null) {
            c5944e.amazon = new C17028e(num.intValue(), 10);
            c5944e.loadAd = new C17028e(num.intValue(), i);
        }
        if (layerDrawable != null) {
            c5944e.amazon = new C2109e(i, AbstractC15143e.vip(layerDrawable));
            c5944e.loadAd = new C2109e(i, AbstractC15143e.vip(layerDrawable));
        }
        ArrayList arrayList = new ArrayList();
        AbstractC13386e abstractC13386e = c9377e.ad;
        if (abstractC13386e instanceof C15878e) {
            arrayList.add(new C4668e());
        } else if (abstractC13386e instanceof C17048e) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            arrayList.add(new C5271e(VKXApplication.Companion.ad(abstractC13386e.ad)));
        }
        int i2 = c9377e.metrica;
        if (i2 != 0) {
            c5944e.license(i2);
        }
        AbstractC2182e.vip(c5944e, arrayList);
    }

    public static final void metrica(ImageView imageView, String str, Integer num, C9377e c9377e) {
        vip(imageView, (str == null || str.length() == 0) ? null : Uri.parse(str), num, c9377e);
    }

    public static final void vip(ImageView imageView, Uri uri, Integer num, C9377e c9377e) {
        boolean z = c9377e.ad instanceof C15878e;
        LayerDrawable ad = (num != null && num.intValue() == R.drawable.placeholder_audio) ? AbstractC1970e.ad(imageView.getContext(), z, AbstractC15933e.ad(R.attr.bg_primary), AbstractC15933e.ad(R.attr.text_primary), R.drawable.ic_music_outline_28) : (num != null && num.intValue() == R.drawable.placeholder_link) ? AbstractC1970e.ad(imageView.getContext(), z, AbstractC15933e.ad(R.attr.bg_primary), AbstractC15933e.ad(R.attr.text_primary), R.drawable.ic_link_outline_28) : (num != null && num.intValue() == R.drawable.placeholder_playlist) ? AbstractC1970e.ad(imageView.getContext(), z, AbstractC15933e.ad(R.attr.bg_primary), AbstractC15933e.ad(R.attr.text_primary), R.drawable.ic_playlist_outline_56) : null;
        if (uri == null && ad != null) {
            InterfaceC12732e ad2 = AbstractC16550e.ad(imageView.getContext());
            C5944e c5944e = new C5944e(imageView.getContext());
            c5944e.metrica = ad;
            AbstractC15659e.license(c5944e, imageView);
            ((C0624e) ad2).ad(c5944e.ad());
            return;
        }
        if (uri != null || num == null) {
            InterfaceC12732e ad3 = AbstractC16550e.ad(imageView.getContext());
            C5944e c5944e2 = new C5944e(imageView.getContext());
            c5944e2.metrica = uri;
            AbstractC15659e.license(c5944e2, imageView);
            imageView.getContext();
            ad(c5944e2, num, ad, c9377e);
            ((C0624e) ad3).ad(c5944e2.ad());
            return;
        }
        InterfaceC12732e ad4 = AbstractC16550e.ad(imageView.getContext());
        C5944e c5944e3 = new C5944e(imageView.getContext());
        c5944e3.metrica = num;
        AbstractC15659e.license(c5944e3, imageView);
        imageView.getContext();
        ad(c5944e3, num, ad, c9377e);
        ((C0624e) ad4).ad(c5944e3.ad());
    }
}
