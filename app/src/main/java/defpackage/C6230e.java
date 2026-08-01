package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6230e extends AbstractC5781e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f13034e;

    public C6230e(C15820e c15820e) {
        this.f13034e = c15820e;
    }

    @Override // defpackage.AbstractC5781e
    public final void crashlytics(InterfaceC10283e interfaceC10283e) {
        String str;
        C10344e c10344e = (C10344e) interfaceC10283e;
        TextView textView = c10344e.f20415e;
        TextView textView2 = c10344e.f20410e;
        C15820e c15820e = this.f13034e;
        AudioPlaylist audioPlaylist = c15820e.f31221e;
        String mopub = AbstractC13406e.mopub(audioPlaylist);
        int i = audioPlaylist.f36526try;
        boolean z = audioPlaylist.f36521super;
        String str2 = audioPlaylist.subs;
        String str3 = audioPlaylist.f36503catch;
        ImageView imageView = c10344e.f20412e;
        AbstractC13487e.ad(imageView, audioPlaylist, 1, 2);
        ImageView imageView2 = c10344e.f20413e;
        AbstractC13487e.ad(imageView2, audioPlaylist, 4, 6);
        imageView.setVisibility(mopub != null ? 0 : 4);
        c10344e.f20411e.setVisibility(mopub != null ? 0 : 4);
        if (str3 == null || !z || AbstractC13406e.admob(audioPlaylist)) {
            textView.setText(str2);
        } else {
            String tapsense = AbstractC0869e.tapsense(' ', str2, str3);
            SpannableString spannableString = new SpannableString(tapsense);
            VKXApplication.Companion companion = VKXApplication.f36531e;
            spannableString.setSpan(new ForegroundColorSpan(AbstractC15933e.ad(R.attr.textColorSecondary)), str2.length(), tapsense.length(), 33);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        if (AbstractC7890e.billing(audioPlaylist.f36502case, Boolean.TRUE)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, ua.itaysonlab.vkx.R.drawable.ic_explicit_outline_28, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        textView2.setText(c15820e.f31204e);
        textView2.setVisibility((AbstractC13406e.admob(audioPlaylist) || (str = c15820e.f31204e) == null || str.length() == 0) ? 8 : 0);
        TextView textView3 = c10344e.f20416e;
        int i2 = 5;
        if (!AbstractC13406e.admob(audioPlaylist) && (z || str3 == null)) {
            if (!audioPlaylist.f36513native.isEmpty()) {
                str3 = c10344e.f20414e.getContext().getString(ua.itaysonlab.vkx.R.string.playlist_year_and_genre, AbstractC13480e.m3608try(audioPlaylist.f36513native, null, null, null, new C2091e(i2), 31), Integer.valueOf(i));
            } else if (i != 0) {
                str3 = String.valueOf(i);
            } else {
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                DecimalFormat decimalFormat = C5575e.ad;
                str3 = vKXApplication.getString(ua.itaysonlab.vkx.R.string.play_count, C5575e.vip(audioPlaylist.f36512interface));
            }
        }
        textView3.setText(str3);
        long j = audioPlaylist.applovin;
        C14027e.ad.getClass();
        if (j == C14027e.metrica() && audioPlaylist.f36501break == null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView2.setOnClickListener(null);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, ua.itaysonlab.vkx.R.drawable.ic_chevron_right, 0);
            textView2.setOnClickListener(new ViewOnClickListenerC15976e(audioPlaylist, i2));
        }
        C3579e c3579e = (C3579e) imageView2.getLayoutParams();
        Activity pro = c15820e.pro();
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        Resources resources = (vKXApplication2 != null ? vKXApplication2 : null).getResources();
        TypedValue typedValue = new TypedValue();
        pro.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue, true);
        ((ViewGroup.MarginLayoutParams) c3579e).topMargin = resources.getDimensionPixelSize(typedValue.resourceId) + AbstractC3489e.ad;
        imageView2.setLayoutParams(c3579e);
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(ua.itaysonlab.vkx.R.layout.v7_playlist_header_type2, viewGroup, false);
        int i = ua.itaysonlab.vkx.R.id.artwork_blur;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.artwork_blur);
        if (imageView != null) {
            i = ua.itaysonlab.vkx.R.id.artwork_blur_overlay;
            View vip = AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.artwork_blur_overlay);
            if (vip != null) {
                i = ua.itaysonlab.vkx.R.id.artwork_main;
                ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.artwork_main);
                if (imageView2 != null) {
                    i = ua.itaysonlab.vkx.R.id.playlist_author_artist;
                    TextView textView = (TextView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.playlist_author_artist);
                    if (textView != null) {
                        i = ua.itaysonlab.vkx.R.id.playlist_subtitle;
                        TextView textView2 = (TextView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.playlist_subtitle);
                        if (textView2 != null) {
                            i = ua.itaysonlab.vkx.R.id.playlist_title;
                            TextView textView3 = (TextView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.playlist_title);
                            if (textView3 != null) {
                                return new C10344e((ConstraintLayout) inflate, imageView, vip, imageView2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return ua.itaysonlab.vkx.R.layout.v7_playlist_header_type2;
    }
}
