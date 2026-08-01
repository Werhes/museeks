package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13759e {
    public static final C13759e ad = new Object();

    public static C16740e ad(InterfaceC16120e interfaceC16120e) {
        DynamicMutableRealmObject.Companion companion = DynamicMutableRealmObject.INSTANCE;
        C6571e c6571e = new C6571e("photo135", null);
        C6571e c6571e2 = new C6571e("photo270", null);
        C12232e c12232e = AbstractC3820e.ad;
        Map purchase = AbstractC10064e.purchase(c6571e, c6571e2, new C6571e("photo300", interfaceC16120e.ads(c12232e.vip(String.class), "photo300")), new C6571e("photo600", interfaceC16120e.ads(c12232e.vip(String.class), "photo600")), new C6571e("photo1200", interfaceC16120e.ads(c12232e.vip(String.class), "photo1200")));
        companion.getClass();
        return new C16740e("CachedEmbeddedThumb", purchase);
    }
}
