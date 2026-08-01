package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13027e extends AbstractC16257e {
    public final /* synthetic */ Object license;
    public final /* synthetic */ int metrica;

    public /* synthetic */ C13027e(int i, Object obj) {
        this.metrica = i;
        this.license = obj;
    }

    @Override // defpackage.AbstractC3370e
    public boolean ad() {
        switch (this.metrica) {
            case 1:
                return false;
            default:
                return super.ad();
        }
    }

    @Override // defpackage.AbstractC3370e
    public boolean appmetrica() {
        switch (this.metrica) {
            case 1:
                return ((Map) this.license).isEmpty();
            default:
                return super.appmetrica();
        }
    }

    @Override // defpackage.AbstractC16257e
    public final AbstractC16232e billing(InterfaceC5021e interfaceC5021e) {
        switch (this.metrica) {
            case 0:
                if (((ArrayList) this.license).contains(interfaceC5021e)) {
                    return AbstractC11957e.adcel((InterfaceC16046e) interfaceC5021e.advert());
                }
                return null;
            default:
                return (AbstractC16232e) ((Map) this.license).get(interfaceC5021e);
        }
    }
}
