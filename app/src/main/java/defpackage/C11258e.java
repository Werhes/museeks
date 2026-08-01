package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11258e implements InterfaceC3447e {
    public final File ad;
    public final AtomicBoolean metrica = new AtomicBoolean(false);
    public final InterfaceC13021e vip;

    public C11258e(File file, InterfaceC13021e interfaceC13021e) {
        this.ad = file;
        this.vip = interfaceC13021e;
    }

    @Override // defpackage.InterfaceC3447e
    public final Object appmetrica(C6397e c6397e) {
        if (this.metrica.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        return AbstractC5729e.ad(this.ad, new C12602e(this, null), c6397e);
    }

    @Override // defpackage.InterfaceC13901e
    public final void close() {
        this.metrica.set(true);
    }
}
