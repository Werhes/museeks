package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1652e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C1169e f4580e = firebase();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f4581e;

    public C1652e(C15820e c15820e) {
        this.f4581e = c15820e;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        crashlytics((EnumC18011e) this.f4580e.get(i), (C8745e) interfaceC10283e);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f4580e.subs();
    }

    public final void crashlytics(EnumC18011e enumC18011e, C8745e c8745e) {
        c8745e.f17641e.setText(enumC18011e.f35325e);
        TextView textView = c8745e.f17641e;
        int i = enumC18011e.f35324e;
        textView.setTextColor(AbstractC15933e.ad(i));
        ImageView imageView = c8745e.f17640e;
        imageView.setImageResource(enumC18011e.f35326e);
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC15933e.ad(i)));
        c8745e.f17639e.setOnClickListener(new ViewOnClickListenerC16710e(6, this, c8745e, enumC18011e));
    }

    public final C1169e firebase() {
        C1169e license = AbstractC6874e.license();
        AudioPlaylist audioPlaylist = this.f4581e.f31221e;
        if (!AbstractC13406e.admob(audioPlaylist)) {
            AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36525transient;
            license.add((audioPlaylistPermissions == null || !audioPlaylistPermissions.license) ? AbstractC13406e.Signature(audioPlaylist) ? EnumC18011e.f35317e : EnumC18011e.f35320e : EnumC18011e.f35321e);
        }
        C11794e.f23667e.getClass();
        if (C11794e.appmetrica(audioPlaylist)) {
            license.add(EnumC18011e.f35322e);
        } else {
            license.add(EnumC18011e.f35323e);
        }
        license.add(EnumC18011e.f35319e);
        return AbstractC6874e.metrica(license);
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.v7_playlist_header_buttonbar, viewGroup, false);
        int i = R.id.bb_icon;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.bb_icon);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.bb_title);
            if (textView != null) {
                return new C8745e(linearLayout, imageView, linearLayout, textView);
            }
            i = R.id.bb_title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.v7_playlist_header_buttonbar;
    }
}
