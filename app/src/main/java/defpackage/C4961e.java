package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4961e extends loadAd {
    public final TextView inmobi;
    public final /* synthetic */ C2056e isPro;
    public final ProgressBar isVip;
    public final View signatures;
    public final ImageView tapsense;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4961e(C2056e c2056e, View view) {
        super(view);
        this.isPro = c2056e;
        this.signatures = view;
        this.tapsense = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.isVip = progressBar;
        this.inmobi = (TextView) view.findViewById(R.id.mr_picker_route_name);
        AbstractC12992e.mopub(c2056e.f5346e.f13934e, progressBar);
    }
}
