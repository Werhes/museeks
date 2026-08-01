package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C16366e implements InterfaceC1848e {
    public final /* synthetic */ int ad;

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        switch (this.ad) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
                interfaceC14209e.ad(C12426e.billing, entry.getKey());
                interfaceC14209e.ad(C12426e.yandex, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
