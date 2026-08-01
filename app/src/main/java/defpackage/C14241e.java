package defpackage;

import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14241e {
    public static final AtomicInteger license = new AtomicInteger(5);
    public final ArrayDeque ad = new ArrayDeque();
    public int metrica;
    public HandlerThread vip;

    public final void ad() {
        ArrayDeque arrayDeque = this.ad;
        if (!arrayDeque.isEmpty() && this.metrica - arrayDeque.size() < license.get()) {
            C9203e c9203e = (C9203e) arrayDeque.removeFirst();
            c9203e.metrica.vip(1, c9203e.vip).vip();
        }
    }
}
