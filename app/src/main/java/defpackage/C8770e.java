package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8770e {
    public static final C8770e appmetrica;
    public static final C8770e license;
    public static final C8770e purchase;
    public final HashSet ad;
    public static final C8770e vip = new C8770e(Collections.EMPTY_LIST);
    public static final C8770e metrica = new C8770e(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));

    static {
        new C8770e(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        license = new C8770e(Arrays.asList(ForegroundCarColorSpan.class));
        appmetrica = new C8770e(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        purchase = new C8770e(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new C8770e(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new C8770e(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public C8770e(List list) {
        this.ad = new HashSet(list);
    }

    public final void ad(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.ad.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
            }
        }
    }

    public final void vip(CarText carText) {
        ad(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            ad(it.next());
        }
    }
}
