package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۢۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12059e {
    public final Object ad = new Object();
    public final ArrayList metrica = new ArrayList();
    public boolean vip;

    public C12059e(C2075e c2075e) {
    }

    public final void ad() {
        synchronized (this.ad) {
            try {
                this.vip = true;
                Iterator it = this.metrica.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.metrica.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
