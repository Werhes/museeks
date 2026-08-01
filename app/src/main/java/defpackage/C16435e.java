package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16435e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f32266e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f32267e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32268e;

    public /* synthetic */ C16435e(boolean z, Object obj, int i) {
        this.f32268e = i;
        this.f32267e = z;
        this.f32266e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3542e startapp;
        int i = this.f32268e;
        Object obj = this.f32266e;
        boolean z = this.f32267e;
        switch (i) {
            case 0:
                C0038e c0038e = (C0038e) obj;
                CatalogArtist catalogArtist = c0038e.f1174e;
                if (z) {
                    File file = AbstractC14119e.ad;
                    AbstractC14119e.vip.remove(catalogArtist.vip);
                    AbstractC14119e.metrica();
                } else {
                    File file2 = AbstractC14119e.ad;
                    AbstractC14119e.vip.put(catalogArtist.vip, catalogArtist.ad);
                    AbstractC14119e.metrica();
                }
                c0038e.f1175e.invoke();
                c0038e.purchase();
                return Unit.INSTANCE;
            case 1:
                InterfaceC3542e interfaceC3542e = (InterfaceC3542e) obj;
                if (z) {
                    interfaceC3542e.purchase(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                C4367e c4367e = (C4367e) obj;
                if (z && (startapp = c4367e.startapp()) != null) {
                    ((C5981e) startapp).purchase(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(z || ((C8933e) obj).appmetrica.purchase() > 0.5f);
        }
    }
}
