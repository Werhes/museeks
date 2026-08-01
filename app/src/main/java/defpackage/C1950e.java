package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950e implements InterfaceC13403e {
    public final /* synthetic */ int ad = 0;

    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                if (c4052e.f9003e) {
                    throw C15608e.ad("EXTM3U", 30, str);
                }
                c4052e.f9003e = true;
                return;
            default:
                ((ArrayList) c4052e.f9002e).add(str);
                return;
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final String amazon() {
        switch (this.ad) {
            case 0:
                return "EXTM3U";
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final boolean loadAd() {
        switch (this.ad) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
