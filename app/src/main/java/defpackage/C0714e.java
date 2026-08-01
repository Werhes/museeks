package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۧؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final MaterialButton f3001e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ImageView f3002e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f3003e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final MaterialButton f3004e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final RelativeLayout f3005e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Space f3006e;

    public C0714e(RelativeLayout relativeLayout, TextView textView, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, Space space) {
        this.f3005e = relativeLayout;
        this.f3003e = textView;
        this.f3002e = imageView;
        this.f3004e = materialButton;
        this.f3001e = materialButton2;
        this.f3006e = space;
    }

    public static C0714e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.artist_header_v2c, viewGroup, false);
        int i = R.id.artist_name;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.artist_name);
        if (textView != null) {
            i = R.id.artist_photo;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.artist_photo);
            if (imageView != null) {
                i = R.id.artist_play;
                MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.artist_play);
                if (materialButton != null) {
                    i = R.id.artist_subscribe;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC7779e.vip(inflate, R.id.artist_subscribe);
                    if (materialButton2 != null) {
                        i = R.id.sb_padder;
                        Space space = (Space) AbstractC7779e.vip(inflate, R.id.sb_padder);
                        if (space != null) {
                            i = R.id.scrim_bottom;
                            if (AbstractC7779e.vip(inflate, R.id.scrim_bottom) != null) {
                                return new C0714e((RelativeLayout) inflate, textView, imageView, materialButton, materialButton2, space);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f3005e;
    }
}
