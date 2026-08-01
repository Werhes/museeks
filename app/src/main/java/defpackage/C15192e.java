package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15192e implements AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2673e f30062e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30063e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13322e f30064e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Surface f30065e;

    public C15192e(C13322e c13322e, Surface surface) {
        this.f30064e = c13322e;
        this.f30065e = surface;
        C11498e c11498e = C13322e.license;
        c11498e.getClass();
        this.f30063e = C11498e.vip.incrementAndGet(c11498e);
        this.f30062e = AbstractC14430e.metrica(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List list;
        if (this.f30062e.ad()) {
            C13322e c13322e = this.f30064e;
            synchronized (c13322e.ad) {
                try {
                    surface = this.f30065e;
                    Integer num = (Integer) c13322e.vip.get(surface);
                    if (num == null) {
                        throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                    }
                    int intValue = num.intValue() - 1;
                    c13322e.vip.put(surface, Integer.valueOf(intValue));
                    if (intValue == 0) {
                        list = AbstractC13480e.m3575continue(c13322e.metrica);
                        c13322e.vip.remove(surface);
                    } else {
                        list = null;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C11728e) it.next()).appmetrica(surface);
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.f30063e;
    }
}
