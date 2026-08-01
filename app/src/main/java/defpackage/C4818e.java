package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4818e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final NewsfeedItem f10264e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final VKProfile f10265e;

    public C4818e(NewsfeedItem newsfeedItem, VKProfile vKProfile) {
        this.f10264e = newsfeedItem;
        this.f10265e = vKProfile;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        C4569e c4569e = (C4569e) interfaceC10283e;
        ImageView imageView = c4569e.f9856e;
        VKProfile vKProfile = this.f10265e;
        AbstractC2379e.metrica(imageView, vKProfile.license, Integer.valueOf(R.drawable.placeholder_link), new C9377e(new C15878e(), 14));
        c4569e.f9855e.setText(vKProfile.ad());
        TextView textView = c4569e.f9857e;
        Context context = c4569e.f9854e.getContext();
        Long l = this.f10264e.billing;
        textView.setText(AbstractC13510e.metrica(context, l != null ? l.longValue() : System.currentTimeMillis()));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C4569e.ad(layoutInflater, viewGroup);
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.v7_post_header;
    }
}
