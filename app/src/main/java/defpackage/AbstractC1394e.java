package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۡۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1394e {
    public static final SimpleDateFormat ad = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    public static Date ad(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        int i = (int) (j / 3600);
        calendar.add(11, i);
        calendar.add(13, (int) (j - (i * 3600)));
        return calendar.getTime();
    }
}
