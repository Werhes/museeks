package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۨٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10697e implements InterfaceC0778e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Size f21079e = new Size(480, 360);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Matrix f21080e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2780e f21081e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f21082e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Executor f21083e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f21084e;

    public C10697e(List list, Executor executor, C2780e c2780e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3220e) it.next()).getClass();
        }
        this.f21084e = new ArrayList(list);
        this.f21082e = 1;
        this.f21081e = c2780e;
        this.f21083e = executor;
    }

    @Override // defpackage.InterfaceC0778e
    public final Size ad() {
        Iterator it = this.f21084e.iterator();
        Size size = f21079e;
        while (it.hasNext()) {
            ((InterfaceC3220e) it.next()).getClass();
            Size size2 = new Size(1280, 720);
            if (size2.getWidth() * size2.getHeight() > size.getHeight() * size.getWidth()) {
                size = size2;
            }
        }
        return size;
    }

    @Override // defpackage.InterfaceC0778e
    public final void mopub(C5403e c5403e) {
        InterfaceC10073e interfaceC10073e = c5403e.f11585e;
        Matrix matrix = new Matrix();
        int i = this.f21082e;
        if (i != 0) {
            Matrix matrix2 = this.f21080e;
            if (i != 2 && matrix2 == null) {
                AbstractC9464e.yandex("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                c5403e.close();
                return;
            }
            Matrix matrix3 = new Matrix(interfaceC10073e.appmetrica());
            RectF rectF = new RectF(0.0f, 0.0f, c5403e.f11588e, c5403e.f11587e);
            int license = interfaceC10073e.license();
            RectF rectF2 = AbstractC8261e.ad;
            AbstractC4265e.license(license % 90 == 0, "Invalid rotation degrees: " + license);
            matrix3.postConcat(AbstractC8261e.ad(rectF, AbstractC8261e.metrica(AbstractC8261e.adcel(license)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, interfaceC10073e.license(), false));
            matrix3.invert(matrix);
            if (i != 2) {
                matrix.postConcat(matrix2);
            }
        }
        vip(c5403e, 0, matrix, new HashMap(), new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vip(final C5403e c5403e, final int i, final Matrix matrix, final HashMap hashMap, final HashMap hashMap2) {
        Image amazon = c5403e.f4899e.amazon();
        if (amazon == null) {
            AbstractC9464e.adcel("MlKitAnalyzer", "Image is null.");
            c5403e.close();
            return;
        }
        ArrayList arrayList = this.f21084e;
        int size = arrayList.size() - 1;
        Executor executor = this.f21083e;
        if (i > size) {
            c5403e.close();
            executor.execute(new RunnableC6795e(this, hashMap, c5403e, hashMap2, 16));
            return;
        }
        final InterfaceC3220e interfaceC3220e = (InterfaceC3220e) arrayList.get(i);
        try {
            ((AbstractC16828e) interfaceC3220e).license(amazon, c5403e.f11585e.license(), matrix).vip(executor, new InterfaceC12765e() { // from class: eَْٛ
                @Override // defpackage.InterfaceC12765e
                /* renamed from: final */
                public final void mo213final(C0560e c0560e) {
                    C10697e c10697e = C10697e.this;
                    HashMap hashMap3 = hashMap2;
                    InterfaceC3220e interfaceC3220e2 = interfaceC3220e;
                    HashMap hashMap4 = hashMap;
                    C5403e c5403e2 = c5403e;
                    int i2 = i;
                    Matrix matrix2 = matrix;
                    if (c0560e.license) {
                        hashMap3.put(interfaceC3220e2, new CancellationException("The task is canceled."));
                    } else if (c0560e.advert()) {
                        hashMap4.put(interfaceC3220e2, c0560e.adcel());
                    } else {
                        hashMap3.put(interfaceC3220e2, c0560e.startapp());
                    }
                    c10697e.vip(c5403e2, i2 + 1, matrix2, hashMap4, hashMap3);
                }
            });
        } catch (Exception e) {
            hashMap2.put(interfaceC3220e, new RuntimeException("Failed to process the image.", e));
            vip(c5403e, i + 1, matrix, hashMap, hashMap2);
        }
    }
}
