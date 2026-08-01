package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12917e {
    public static final Set metrica;
    public final C18277e ad;
    public final C8286e vip;

    static {
        C12816e startapp = AbstractC0206e.metrica.startapp();
        metrica = Collections.singleton(new C11709e(startapp.vip(), startapp.ad.billing()));
    }

    public C12917e(C18277e c18277e) {
        this.ad = c18277e;
        this.vip = ((C6272e) c18277e.ad).metrica(new C17877e(11, this));
    }
}
