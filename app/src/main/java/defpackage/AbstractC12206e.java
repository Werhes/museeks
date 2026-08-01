package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12206e {
    public static final AtomicReference ad = new AtomicReference();

    public static Calendar ad(Calendar calendar) {
        Calendar metrica = metrica(calendar);
        Calendar metrica2 = metrica(null);
        metrica2.set(metrica.get(1), metrica.get(2), metrica.get(5));
        return metrica2;
    }

    public static Calendar metrica(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static Calendar vip() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }
}
