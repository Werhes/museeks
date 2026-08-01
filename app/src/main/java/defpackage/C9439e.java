package defpackage;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9439e implements InterfaceC18171e {
    public static final SimpleDateFormat ad;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        ad = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        ((InterfaceC7445e) obj2).vip(ad.format((Date) obj));
    }
}
