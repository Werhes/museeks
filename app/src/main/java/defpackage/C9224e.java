package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9224e extends loadAd {
    public final /* synthetic */ C3654e ads;
    public C6541e applovin;
    public final TextView inmobi;
    public final float isPro;
    public final ProgressBar isVip;
    public final View signatures;
    public final ImageView tapsense;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9224e(C3654e c3654e, View view) {
        super(view);
        this.ads = c3654e;
        this.signatures = view;
        this.tapsense = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.isVip = progressBar;
        this.inmobi = (TextView) view.findViewById(R.id.mr_cast_group_name);
        DialogC1747e dialogC1747e = c3654e.f8213e;
        this.isPro = AbstractC12992e.license(dialogC1747e.f4761e);
        AbstractC12992e.mopub(dialogC1747e.f4761e, progressBar);
    }
}
