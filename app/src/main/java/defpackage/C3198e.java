package defpackage;

import androidx.recyclerview.widget.startapp;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3198e implements InterfaceC12938e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C3198e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC12938e
    public final startapp ad(AbstractC15876e abstractC15876e, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C3675e c3675e) {
        switch (this.ad) {
            case 0:
                return new C18328e(new C2892e(575370436, true, new C14406e(abstractC15876e, (Catalog2Layout.SynthOpenCacheSearch) catalog2Layout)));
            case 1:
                return new C10708e(abstractC15876e, ((Catalog2Layout.Header) catalog2Layout).ad, catalog2Block);
            case 2:
                return new C7836e(new C2892e(-116264069, true, new C1820e(abstractC15876e)));
            case 3:
                return new C18328e(new C2892e(1560004398, true, new C2077e(catalog2Block, abstractC15876e, 8)));
            case 4:
                return new C18328e(new C2892e(32570960, true, new C6589e(c3675e, abstractC15876e, catalog2Block)));
            case 5:
                return new C18328e(new C2892e(1083983765, true, new C9636e(catalog2Block, c3675e, 0)));
            case 6:
                return new C18328e(new C2892e(185458284, true, new C9636e(catalog2Block, c3675e, 1)));
            case 7:
                return new C18328e(AbstractC9262e.ad);
            case 8:
                return new C18328e(new C2892e(1770570943, true, new C0411e(c3675e, abstractC15876e, catalog2Block)));
            case 9:
                return new C10708e(abstractC15876e, ((Catalog2Layout.LargeHeader) catalog2Layout).ad, catalog2Block);
            case 10:
                Catalog2Layout.CompactHeader compactHeader = (Catalog2Layout.CompactHeader) catalog2Layout;
                List metrica = catalog2Block.getMetrica();
                return new C5755e(abstractC15876e, compactHeader, metrica != null ? (Catalog2Button) AbstractC13480e.m3604this(metrica) : null);
            case 11:
                return new startapp();
            case 12:
                return new C11032e(abstractC15876e, true);
            case 13:
                return new C11032e(abstractC15876e, false);
            case 14:
                return new C11032e(abstractC15876e, true);
            case 15:
                return new startapp();
            default:
                return new C7350e(8);
        }
    }
}
