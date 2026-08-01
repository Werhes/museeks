package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11373e implements InterfaceC1848e {
    public final /* synthetic */ int ad;
    public static final /* synthetic */ C11373e vip = new C11373e(0);
    public static final /* synthetic */ C11373e metrica = new C11373e(1);

    public /* synthetic */ C11373e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        switch (this.ad) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
                interfaceC14209e.ad(C2917e.billing, entry.getKey());
                interfaceC14209e.ad(C2917e.yandex, entry.getValue());
                return;
            case 1:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                InterfaceC14209e interfaceC14209e2 = (InterfaceC14209e) obj2;
                interfaceC14209e2.ad(C14047e.billing, entry2.getKey());
                interfaceC14209e2.ad(C14047e.yandex, entry2.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
