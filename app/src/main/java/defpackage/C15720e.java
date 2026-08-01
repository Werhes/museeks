package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15720e extends AbstractC6238e {
    public final Paint ad;
    public final List vip;

    public C15720e() {
        Paint paint = new Paint();
        this.ad = paint;
        this.vip = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.AbstractC6238e
    public final void purchase(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.ad;
        paint.setStrokeWidth(dimension);
        Iterator it = this.vip.iterator();
        while (it.hasNext()) {
            ((AbstractC3283e) it.next()).getClass();
            paint.setColor(AbstractC3898e.metrica(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m183e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).admob.startapp(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).admob.license(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).admob.appmetrica(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).admob.billing(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
