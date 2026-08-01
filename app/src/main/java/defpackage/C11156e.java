package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٞۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11156e extends AbstractC5604e {
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        RadioStation radioStation = (RadioStation) obj;
        C13812e c13812e = (C13812e) interfaceC10283e;
        ImageView imageView = c13812e.f27378e;
        imageView.setBackgroundColor(-1);
        imageView.setOutlineProvider(new C8255e());
        imageView.setClipToOutline(true);
        String str = radioStation.license;
        InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
        C5944e c5944e = new C5944e(imageView.getContext());
        c5944e.metrica = str;
        AbstractC15659e.license(c5944e, imageView);
        c5944e.subscription = 1;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        AbstractC2182e.metrica(c5944e, new C5271e(VKXApplication.Companion.ad(8.0f)));
        ((C0624e) ad).ad(c5944e.ad());
        c13812e.f27377e.setText(radioStation.vip);
        c13812e.f27379e.setOnClickListener(new ViewOnClickListenerC6562e(radioStation, 0));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.c3_link_horizontal_small;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13812e.ad(layoutInflater, viewGroup);
    }
}
