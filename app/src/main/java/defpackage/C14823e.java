package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.startapp;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14823e implements InterfaceC12938e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C14823e(int i) {
        this.ad = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    @Override // defpackage.InterfaceC12938e
    public final startapp ad(AbstractC15876e abstractC15876e, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C3675e c3675e) {
        C1875e c1875e;
        switch (this.ad) {
            case 0:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 1:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 2:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 3:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 4:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 5:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 6:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 7:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 8:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 9:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 10:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 11:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 12:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 13:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 14:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 15:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 16:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 20:
                return C9877e.ad(abstractC15876e, catalog2Block, catalog2Layout, c3675e);
            case 21:
                return new C7350e(5);
            case 22:
                return new C5692e();
            case 23:
                if (catalog2Block instanceof Catalog2Block.PlaceholdersBlock) {
                    return new AbstractC5604e();
                }
                boolean z = catalog2Block instanceof Catalog2Block.CuratorBannerBlock;
                C13664e c13664e = C13664e.f27089e;
                if (z) {
                    ?? r3 = ((Catalog2Block.CuratorBannerBlock) catalog2Block).metrica;
                    if (r3 != 0) {
                        c13664e = r3;
                    }
                    c1875e = new C1875e(abstractC15876e, c13664e, 1);
                } else {
                    if (catalog2Block instanceof Catalog2Block.CuratorGroupBlock) {
                        return new C7350e(2);
                    }
                    if (!(catalog2Block instanceof Catalog2Block.ArtistBannerBlock)) {
                        if (catalog2Block instanceof Catalog2Block.AudioBooksPersonsBlock) {
                            return new C16954e(0);
                        }
                        throw new IllegalStateException("Non-implemented Banner implementation");
                    }
                    ?? r32 = ((Catalog2Block.ArtistBannerBlock) catalog2Block).metrica;
                    if (r32 != 0) {
                        c13664e = r32;
                    }
                    c1875e = new C1875e(abstractC15876e, c13664e, 0);
                }
                return c1875e;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (!(catalog2Block instanceof Catalog2Block.ArtistBannerBlock)) {
                    throw new IllegalStateException("Non-implemented ArtistHeader implementation");
                }
                List list = ((Catalog2Block.ArtistBannerBlock) catalog2Block).metrica;
                if (list == null) {
                    list = C13664e.f27089e;
                }
                return new C1875e(abstractC15876e, list, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C12521e(abstractC15876e, catalog2Block.getMetrica());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new startapp();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C10708e(abstractC15876e, ((Catalog2Layout.ExtendedHeader) catalog2Layout).ad, catalog2Block);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new AbstractC5604e();
            default:
                return new C7836e(new C2892e(-27332830, true, new C11783e(3, abstractC15876e)));
        }
    }
}
