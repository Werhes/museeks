package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14111e implements InterfaceC10283e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f27911e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final FrameLayout f27912e;

    public C14111e(FrameLayout frameLayout, TextView textView) {
        this.f27912e = frameLayout;
        this.f27911e = textView;
    }

    public static C14111e ad(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.v7_cache_migrator_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.progress;
        if (((ProgressBar) AbstractC7779e.vip(inflate, R.id.progress)) != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            int i2 = R.id.toolbar_data;
            if (((TextView) AbstractC7779e.vip(inflate, R.id.toolbar_data)) != null) {
                i2 = R.id.toolbar_header;
                if (((TextView) AbstractC7779e.vip(inflate, R.id.toolbar_header)) != null) {
                    i2 = R.id.toolbar_subheader;
                    TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.toolbar_subheader);
                    if (textView != null) {
                        return new C14111e(frameLayout, textView);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f27912e;
    }
}
