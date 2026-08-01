package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.adcel;
import com.google.android.material.datepicker.metrica;
import java.util.Calendar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC13778e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1421e f27325e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ metrica f27326e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27327e;

    public /* synthetic */ ViewOnClickListenerC13778e(C1421e c1421e, metrica metricaVar, int i) {
        this.f27327e = i;
        this.f27325e = c1421e;
        this.f27326e = metricaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27327e) {
            case 0:
                C1421e c1421e = this.f27325e;
                int m97e = ((LinearLayoutManager) c1421e.f4250e.getLayoutManager()).m97e() - 1;
                if (m97e >= 0) {
                    Calendar ad = AbstractC12206e.ad(this.f27326e.f863e.f17468e.f32966e);
                    ad.add(2, m97e);
                    c1421e.m603goto(new C16831e(ad));
                    return;
                }
                return;
            default:
                C1421e c1421e2 = this.f27325e;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1421e2.f4250e.getLayoutManager();
                View m96e = linearLayoutManager.m96e(0, linearLayoutManager.tapsense(), false);
                int m145extends = (m96e == null ? -1 : adcel.m145extends(m96e)) + 1;
                if (m145extends < c1421e2.f4250e.getAdapter().billing()) {
                    Calendar ad2 = AbstractC12206e.ad(this.f27326e.f863e.f17468e.f32966e);
                    ad2.add(2, m145extends);
                    c1421e2.m603goto(new C16831e(ad2));
                    return;
                }
                return;
        }
    }
}
