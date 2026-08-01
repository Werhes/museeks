package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13319e implements InterfaceC14003e {
    public final InterfaceC14003e ad;
    public boolean metrica;
    public final Object vip = new Object();

    public C13319e(InterfaceC14003e interfaceC14003e) {
        this.ad = interfaceC14003e;
    }

    public final void ad() {
        synchronized (this.vip) {
            try {
                if (this.metrica) {
                    InterfaceC14003e interfaceC14003e = this.ad;
                    if (interfaceC14003e != null) {
                        interfaceC14003e.clear();
                    } else {
                        AbstractC9464e.adcel("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC9464e.remoteconfig("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.metrica = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC14003e
    public final void clear() {
        ad();
    }

    public final void vip() {
        synchronized (this.vip) {
            Unit unit = Unit.INSTANCE;
        }
    }
}
