package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.metrica;
import java.util.Calendar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1658e extends AbstractC15131e {
    public final /* synthetic */ metrica ad;
    public final /* synthetic */ C1421e metrica;
    public final /* synthetic */ MaterialButton vip;

    public C1658e(C1421e c1421e, metrica metricaVar, MaterialButton materialButton) {
        this.metrica = c1421e;
        this.ad = metricaVar;
        this.vip = materialButton;
    }

    @Override // defpackage.AbstractC15131e
    public final void ad(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.vip.getText());
        }
    }

    @Override // defpackage.AbstractC15131e
    public final void vip(RecyclerView recyclerView, int i, int i2) {
        int m97e;
        C8649e c8649e = this.ad.f863e;
        C1421e c1421e = this.metrica;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1421e.f4250e.getLayoutManager();
            View m96e = linearLayoutManager.m96e(0, linearLayoutManager.tapsense(), false);
            m97e = m96e == null ? -1 : adcel.m145extends(m96e);
        } else {
            m97e = ((LinearLayoutManager) c1421e.f4250e.getLayoutManager()).m97e();
        }
        Calendar ad = AbstractC12206e.ad(c8649e.f17468e.f32966e);
        ad.add(2, m97e);
        c1421e.f4255e = new C16831e(ad);
        Calendar ad2 = AbstractC12206e.ad(c8649e.f17468e.f32966e);
        ad2.add(2, m97e);
        ad2.set(5, 1);
        Calendar ad3 = AbstractC12206e.ad(ad2);
        ad3.get(2);
        ad3.get(1);
        ad3.getMaximum(7);
        ad3.getActualMaximum(5);
        ad3.getTimeInMillis();
        this.vip.setText(AbstractC12026e.loadAd(ad3.getTimeInMillis()));
    }
}
