package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6913e {
    public static final AtomicLong billing = new AtomicLong();
    public final C2435e ad;
    public final long appmetrica;
    public final long license;
    public final Map metrica;
    public final long purchase;
    public final Uri vip;

    public C6913e(C2435e c2435e, long j) {
        this(c2435e, c2435e.ad, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public C6913e(C2435e c2435e, Uri uri, Map map, long j, long j2, long j3) {
        this.ad = c2435e;
        this.vip = uri;
        this.metrica = map;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
    }
}
